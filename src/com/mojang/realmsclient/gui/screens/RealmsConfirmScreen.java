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

public class RealmsConfirmScreen
extends RealmsScreen {
    protected RealmsScreen parent;
    protected String title1;
    private String title2;
    protected String yesButton;
    protected String noButton;
    protected int id;
    private int delayTicker;

    public RealmsConfirmScreen(RealmsScreen parent, String title1, String title2, int id2) {
        this.parent = parent;
        this.title1 = title1;
        this.title2 = title2;
        this.id = id2;
        this.yesButton = RealmsConfirmScreen.getLocalizedString((String)"gui.yes");
        this.noButton = RealmsConfirmScreen.getLocalizedString((String)"gui.no");
    }

    public RealmsConfirmScreen(RealmsScreen parent, String title1, String title2, String yesButton, String noButton, int id2) {
        this.parent = parent;
        this.title1 = title1;
        this.title2 = title2;
        this.yesButton = yesButton;
        this.noButton = noButton;
        this.id = id2;
    }

    public void init() {
        this.buttonsAdd(RealmsConfirmScreen.newButton((int)0, (int)(this.width() / 2 - 105), (int)RealmsConstants.row(9), (int)100, (int)20, (String)this.yesButton));
        this.buttonsAdd(RealmsConfirmScreen.newButton((int)1, (int)(this.width() / 2 + 5), (int)RealmsConstants.row(9), (int)100, (int)20, (String)this.noButton));
    }

    public void buttonClicked(RealmsButton button) {
        this.parent.confirmResult(button.id() == 0, this.id);
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString(this.title1, this.width() / 2, RealmsConstants.row(3), 0xFFFFFF);
        this.drawCenteredString(this.title2, this.width() / 2, RealmsConstants.row(5), 0xFFFFFF);
        super.render(xm2, ym2, a2);
    }

    public void setDelay(int delay) {
        this.delayTicker = delay;
        for (RealmsButton button : this.buttons()) {
            button.active(false);
        }
    }

    public void tick() {
        super.tick();
        if (--this.delayTicker == 0) {
            for (RealmsButton button : this.buttons()) {
                button.active(true);
            }
        }
    }
}

