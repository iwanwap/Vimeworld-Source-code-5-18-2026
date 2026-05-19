/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsScreen
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.exception.RealmsServiceException;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class RealmsGenericErrorScreen
extends RealmsScreen {
    private final RealmsScreen nextScreen;
    private static final int OK_BUTTON_ID = 10;
    private String line1;
    private String line2;

    public RealmsGenericErrorScreen(RealmsServiceException realmsServiceException, RealmsScreen nextScreen) {
        this.nextScreen = nextScreen;
        this.errorMessage(realmsServiceException);
    }

    public RealmsGenericErrorScreen(String message, RealmsScreen nextScreen) {
        this.nextScreen = nextScreen;
        this.errorMessage(message);
    }

    public RealmsGenericErrorScreen(String title, String message, RealmsScreen nextScreen) {
        this.nextScreen = nextScreen;
        this.errorMessage(title, message);
    }

    private void errorMessage(RealmsServiceException realmsServiceException) {
        if (realmsServiceException.errorCode != -1) {
            this.line1 = "Realms (" + realmsServiceException.errorCode + "):";
            String translationKey = "mco.errorMessage." + realmsServiceException.errorCode;
            String translated = RealmsGenericErrorScreen.getLocalizedString((String)translationKey);
            this.line2 = translated.equals(translationKey) ? realmsServiceException.errorMsg : translated;
        } else {
            this.line1 = "An error occurred (" + realmsServiceException.httpResultCode + "):";
            this.line2 = realmsServiceException.httpResponseContent;
        }
    }

    private void errorMessage(String message) {
        this.line1 = "An error occurred: ";
        this.line2 = message;
    }

    private void errorMessage(String title, String message) {
        this.line1 = title;
        this.line2 = message;
    }

    public void init() {
        this.buttonsClear();
        this.buttonsAdd(RealmsGenericErrorScreen.newButton((int)10, (int)(this.width() / 2 - 100), (int)(this.height() - 52), (int)200, (int)20, (String)"Ok"));
    }

    public void tick() {
        super.tick();
    }

    public void buttonClicked(RealmsButton button) {
        if (button.id() == 10) {
            Realms.setScreen((RealmsScreen)this.nextScreen);
        }
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString(this.line1, this.width() / 2, 80, 0xFFFFFF);
        this.drawCenteredString(this.line2, this.width() / 2, 100, 0xFF0000);
        super.render(xm2, ym2, a2);
    }
}

