/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsScreen
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.gui.RealmsConstants;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class RealmsClientOutdatedScreen
extends RealmsScreen {
    private static final int BUTTON_BACK_ID = 0;
    private final RealmsScreen lastScreen;
    private final boolean outdated;

    public RealmsClientOutdatedScreen(RealmsScreen lastScreen, boolean outdated) {
        this.lastScreen = lastScreen;
        this.outdated = outdated;
    }

    public void init() {
        this.buttonsClear();
        this.buttonsAdd(RealmsClientOutdatedScreen.newButton((int)0, (int)(this.width() / 2 - 100), (int)RealmsConstants.row(12), (String)"Back"));
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        String title = this.outdated ? RealmsClientOutdatedScreen.getLocalizedString((String)"mco.client.outdated.title") : RealmsClientOutdatedScreen.getLocalizedString((String)"mco.client.incompatible.title");
        String msg = this.outdated ? RealmsClientOutdatedScreen.getLocalizedString((String)"mco.client.outdated.msg") : RealmsClientOutdatedScreen.getLocalizedString((String)"mco.client.incompatible.msg");
        this.drawCenteredString(title, this.width() / 2, RealmsConstants.row(3), 0xFF0000);
        this.drawCenteredString(msg, this.width() / 2, RealmsConstants.row(5), 0xFFFFFF);
        super.render(xm2, ym2, a2);
    }

    public void buttonClicked(RealmsButton button) {
        if (button.id() == 0) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        }
    }

    public void keyPressed(char eventCharacter, int eventKey) {
        if (eventKey == 28 || eventKey == 156 || eventKey == 1) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        }
    }
}

