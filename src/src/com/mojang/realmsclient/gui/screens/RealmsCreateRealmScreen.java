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

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.gui.screens.RealmsLongRunningMcoTaskScreen;
import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import com.mojang.realmsclient.util.RealmsTasks;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsEditBox;
import net.minecraft.realms.RealmsScreen;
import org.lwjgl.input.Keyboard;

public class RealmsCreateRealmScreen
extends RealmsScreen {
    private final RealmsServer server;
    private RealmsMainScreen lastScreen;
    private RealmsEditBox nameBox;
    private RealmsEditBox descriptionBox;
    private static int CREATE_BUTTON = 0;
    private static int CANCEL_BUTTON = 1;
    private static int NAME_BOX_ID = 3;
    private static int DESCRIPTION_BOX_ID = 4;
    private RealmsButton createButton;

    public RealmsCreateRealmScreen(RealmsServer server, RealmsMainScreen lastScreen) {
        this.server = server;
        this.lastScreen = lastScreen;
    }

    public void tick() {
        this.nameBox.tick();
        this.descriptionBox.tick();
    }

    public void init() {
        Keyboard.enableRepeatEvents(true);
        this.buttonsClear();
        this.createButton = RealmsCreateRealmScreen.newButton((int)CREATE_BUTTON, (int)(this.width() / 2 - 100), (int)(this.height() / 4 + 120 + 17), (int)97, (int)20, (String)RealmsCreateRealmScreen.getLocalizedString((String)"mco.create.world"));
        this.buttonsAdd(this.createButton);
        this.buttonsAdd(RealmsCreateRealmScreen.newButton((int)CANCEL_BUTTON, (int)(this.width() / 2 + 5), (int)(this.height() / 4 + 120 + 17), (int)95, (int)20, (String)RealmsCreateRealmScreen.getLocalizedString((String)"gui.cancel")));
        this.createButton.active(false);
        this.nameBox = this.newEditBox(NAME_BOX_ID, this.width() / 2 - 100, 65, 200, 20);
        this.nameBox.setFocus(true);
        this.descriptionBox = this.newEditBox(DESCRIPTION_BOX_ID, this.width() / 2 - 100, 115, 200, 20);
    }

    public void removed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void buttonClicked(RealmsButton button) {
        if (!button.active()) {
            return;
        }
        if (button.id() == CANCEL_BUTTON) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        } else if (button.id() == CREATE_BUTTON) {
            this.createWorld();
        }
    }

    public void keyPressed(char ch2, int eventKey) {
        this.nameBox.keyPressed(ch2, eventKey);
        this.descriptionBox.keyPressed(ch2, eventKey);
        this.createButton.active(this.valid());
        switch (eventKey) {
            case 15: {
                this.nameBox.setFocus(!this.nameBox.isFocused());
                this.descriptionBox.setFocus(!this.descriptionBox.isFocused());
                break;
            }
            case 28: 
            case 156: {
                this.buttonClicked(this.createButton);
                break;
            }
            case 1: {
                Realms.setScreen((RealmsScreen)this.lastScreen);
            }
        }
    }

    private void createWorld() {
        if (this.valid()) {
            RealmsResetWorldScreen resetWorldScreen = new RealmsResetWorldScreen(this.lastScreen, this.server, this.lastScreen.newScreen(), RealmsCreateRealmScreen.getLocalizedString((String)"mco.selectServer.create"), RealmsCreateRealmScreen.getLocalizedString((String)"mco.create.world.subtitle"), 0xA0A0A0, RealmsCreateRealmScreen.getLocalizedString((String)"mco.create.world.skip"));
            resetWorldScreen.setResetTitle(RealmsCreateRealmScreen.getLocalizedString((String)"mco.create.world.reset.title"));
            RealmsTasks.WorldCreationTask worldCreationTask = new RealmsTasks.WorldCreationTask(this.server.id, this.nameBox.getValue(), this.descriptionBox.getValue(), resetWorldScreen);
            RealmsLongRunningMcoTaskScreen longRunningMcoTaskScreen = new RealmsLongRunningMcoTaskScreen(this.lastScreen, worldCreationTask);
            longRunningMcoTaskScreen.start();
            Realms.setScreen((RealmsScreen)longRunningMcoTaskScreen);
        }
    }

    private boolean valid() {
        return this.nameBox.getValue() != null && !this.nameBox.getValue().trim().equals("");
    }

    public void mouseClicked(int x2, int y2, int buttonNum) {
        this.nameBox.mouseClicked(x2, y2, buttonNum);
        this.descriptionBox.mouseClicked(x2, y2, buttonNum);
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString(RealmsCreateRealmScreen.getLocalizedString((String)"mco.selectServer.create"), this.width() / 2, 11, 0xFFFFFF);
        this.drawString(RealmsCreateRealmScreen.getLocalizedString((String)"mco.configure.world.name"), this.width() / 2 - 100, 52, 0xA0A0A0);
        this.drawString(RealmsCreateRealmScreen.getLocalizedString((String)"mco.configure.world.description"), this.width() / 2 - 100, 102, 0xA0A0A0);
        this.nameBox.render();
        this.descriptionBox.render();
        super.render(xm2, ym2, a2);
    }
}

