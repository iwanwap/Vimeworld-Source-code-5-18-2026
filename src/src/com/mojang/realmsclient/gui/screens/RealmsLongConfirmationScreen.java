/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsScreen
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.gui.RealmsConstants;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class RealmsLongConfirmationScreen
extends RealmsScreen {
    private final Type type;
    private final String line2;
    private final String line3;
    protected final RealmsScreen parent;
    protected final String yesButton;
    protected final String noButton;
    private final String okButton;
    protected final int id;
    private final boolean yesNoQuestion;

    public RealmsLongConfirmationScreen(RealmsScreen parent, Type type, String line2, String line3, boolean yesNoQuestion, int id2) {
        this.parent = parent;
        this.id = id2;
        this.type = type;
        this.line2 = line2;
        this.line3 = line3;
        this.yesNoQuestion = yesNoQuestion;
        this.yesButton = RealmsLongConfirmationScreen.getLocalizedString((String)"gui.yes");
        this.noButton = RealmsLongConfirmationScreen.getLocalizedString((String)"gui.no");
        this.okButton = RealmsLongConfirmationScreen.getLocalizedString((String)"mco.gui.ok");
    }

    public void init() {
        if (this.yesNoQuestion) {
            this.buttonsAdd(RealmsLongConfirmationScreen.newButton((int)0, (int)(this.width() / 2 - 105), (int)RealmsConstants.row(8), (int)100, (int)20, (String)this.yesButton));
            this.buttonsAdd(RealmsLongConfirmationScreen.newButton((int)1, (int)(this.width() / 2 + 5), (int)RealmsConstants.row(8), (int)100, (int)20, (String)this.noButton));
        } else {
            this.buttonsAdd(RealmsLongConfirmationScreen.newButton((int)0, (int)(this.width() / 2 - 50), (int)RealmsConstants.row(8), (int)100, (int)20, (String)this.okButton));
        }
    }

    public void buttonClicked(RealmsButton button) {
        this.parent.confirmResult(button.id() == 0, this.id);
    }

    public void keyPressed(char eventCharacter, int eventKey) {
        if (eventKey == 1) {
            this.parent.confirmResult(false, this.id);
        }
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString(this.type.text, this.width() / 2, RealmsConstants.row(2), this.type.colorCode);
        this.drawCenteredString(this.line2, this.width() / 2, RealmsConstants.row(4), 0xFFFFFF);
        this.drawCenteredString(this.line3, this.width() / 2, RealmsConstants.row(6), 0xFFFFFF);
        super.render(xm2, ym2, a2);
    }

    public static enum Type {
        Warning("Warning!", 0xFF0000),
        Info("Info!", 8226750);

        public final int colorCode;
        public final String text;

        private Type(String text, int colorCode) {
            this.text = text;
            this.colorCode = colorCode;
        }
    }
}

