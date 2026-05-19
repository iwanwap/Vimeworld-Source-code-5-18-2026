/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsEditBox
 *  net.minecraft.realms.RealmsScreen
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.gui.RealmsConstants;
import com.mojang.realmsclient.gui.screens.RealmsConfigureWorldScreen;
import com.mojang.realmsclient.gui.screens.RealmsPlayerScreen;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsEditBox;
import net.minecraft.realms.RealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class RealmsInviteScreen
extends RealmsScreen {
    private static final Logger LOGGER = LogManager.getLogger();
    private RealmsEditBox profileName;
    private RealmsServer serverData;
    private final RealmsConfigureWorldScreen configureScreen;
    private final RealmsScreen lastScreen;
    private final int BUTTON_INVITE_ID = 0;
    private final int BUTTON_CANCEL_ID = 1;
    private RealmsButton inviteButton;
    private final int PROFILENAME_EDIT_BOX = 2;
    private String errorMsg;
    private boolean showError;

    public RealmsInviteScreen(RealmsConfigureWorldScreen configureScreen, RealmsScreen lastScreen, RealmsServer serverData) {
        this.configureScreen = configureScreen;
        this.lastScreen = lastScreen;
        this.serverData = serverData;
    }

    public void tick() {
        this.profileName.tick();
    }

    public void init() {
        Keyboard.enableRepeatEvents(true);
        this.buttonsClear();
        this.inviteButton = RealmsInviteScreen.newButton((int)0, (int)(this.width() / 2 - 100), (int)RealmsConstants.row(10), (String)RealmsInviteScreen.getLocalizedString((String)"mco.configure.world.buttons.invite"));
        this.buttonsAdd(this.inviteButton);
        this.buttonsAdd(RealmsInviteScreen.newButton((int)1, (int)(this.width() / 2 - 100), (int)RealmsConstants.row(12), (String)RealmsInviteScreen.getLocalizedString((String)"gui.cancel")));
        this.profileName = this.newEditBox(2, this.width() / 2 - 100, RealmsConstants.row(2), 200, 20);
        this.profileName.setFocus(true);
    }

    public void removed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void buttonClicked(RealmsButton button) {
        if (!button.active()) {
            return;
        }
        switch (button.id()) {
            case 1: {
                Realms.setScreen((RealmsScreen)this.lastScreen);
                break;
            }
            case 0: {
                RealmsClient client = RealmsClient.createRealmsClient();
                if (this.profileName.getValue() == null || this.profileName.getValue().isEmpty()) {
                    return;
                }
                try {
                    RealmsServer realmsServer = client.invite(this.serverData.id, this.profileName.getValue());
                    if (realmsServer != null) {
                        this.serverData.players = realmsServer.players;
                        Realms.setScreen((RealmsScreen)new RealmsPlayerScreen(this.configureScreen, this.serverData));
                        break;
                    }
                    this.showError(RealmsInviteScreen.getLocalizedString((String)"mco.configure.world.players.error"));
                }
                catch (Exception e2) {
                    LOGGER.error("Couldn't invite user");
                    this.showError(RealmsInviteScreen.getLocalizedString((String)"mco.configure.world.players.error"));
                }
                break;
            }
            default: {
                return;
            }
        }
    }

    private void showError(String errorMsg) {
        this.showError = true;
        this.errorMsg = errorMsg;
    }

    public void keyPressed(char ch2, int eventKey) {
        this.profileName.keyPressed(ch2, eventKey);
        if (eventKey == 15) {
            if (this.profileName.isFocused()) {
                this.profileName.setFocus(false);
            } else {
                this.profileName.setFocus(true);
            }
        }
        if (eventKey == 28 || eventKey == 156) {
            this.buttonClicked(this.inviteButton);
        }
        if (eventKey == 1) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        }
    }

    public void mouseClicked(int x2, int y2, int buttonNum) {
        super.mouseClicked(x2, y2, buttonNum);
        this.profileName.mouseClicked(x2, y2, buttonNum);
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawString(RealmsInviteScreen.getLocalizedString((String)"mco.configure.world.invite.profile.name"), this.width() / 2 - 100, RealmsConstants.row(1), 0xA0A0A0);
        if (this.showError) {
            this.drawCenteredString(this.errorMsg, this.width() / 2, RealmsConstants.row(5), 0xFF0000);
        }
        this.profileName.render();
        super.render(xm2, ym2, a2);
    }
}

