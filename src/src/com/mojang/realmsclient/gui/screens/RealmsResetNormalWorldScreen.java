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

import com.mojang.realmsclient.gui.RealmsConstants;
import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsEditBox;
import net.minecraft.realms.RealmsScreen;
import org.lwjgl.input.Keyboard;

public class RealmsResetNormalWorldScreen
extends RealmsScreen {
    private RealmsResetWorldScreen lastScreen;
    private RealmsEditBox seedEdit;
    private Boolean generateStructures = true;
    private Integer levelTypeIndex = 0;
    String[] levelTypes;
    private final int BUTTON_CANCEL_ID = 0;
    private final int BUTTON_RESET_ID = 1;
    private static final int BUTTON_LEVEL_TYPE_ID = 2;
    private static final int BUTTON_GENERATE_STRUCTURES_ID = 3;
    private final int SEED_EDIT_BOX = 4;
    private RealmsButton resetButton;
    private RealmsButton levelTypeButton;
    private RealmsButton generateStructuresButton;

    public RealmsResetNormalWorldScreen(RealmsResetWorldScreen lastScreen) {
        this.lastScreen = lastScreen;
    }

    public void tick() {
        this.seedEdit.tick();
        super.tick();
    }

    public void init() {
        this.levelTypes = new String[]{RealmsResetNormalWorldScreen.getLocalizedString((String)"generator.default"), RealmsResetNormalWorldScreen.getLocalizedString((String)"generator.flat"), RealmsResetNormalWorldScreen.getLocalizedString((String)"generator.largeBiomes"), RealmsResetNormalWorldScreen.getLocalizedString((String)"generator.amplified")};
        Keyboard.enableRepeatEvents(true);
        this.buttonsClear();
        this.buttonsAdd(RealmsResetNormalWorldScreen.newButton((int)0, (int)(this.width() / 2 + 8), (int)RealmsConstants.row(12), (int)97, (int)20, (String)RealmsResetNormalWorldScreen.getLocalizedString((String)"gui.back")));
        this.resetButton = RealmsResetNormalWorldScreen.newButton((int)1, (int)(this.width() / 2 - 102), (int)RealmsConstants.row(12), (int)97, (int)20, (String)RealmsResetNormalWorldScreen.getLocalizedString((String)"mco.backup.button.reset"));
        this.buttonsAdd(this.resetButton);
        this.seedEdit = this.newEditBox(4, this.width() / 2 - 100, RealmsConstants.row(2), 200, 20);
        this.seedEdit.setFocus(true);
        this.seedEdit.setMaxLength(32);
        this.seedEdit.setValue("");
        this.levelTypeButton = RealmsResetNormalWorldScreen.newButton((int)2, (int)(this.width() / 2 - 102), (int)RealmsConstants.row(4), (int)205, (int)20, (String)this.levelTypeTitle());
        this.buttonsAdd(this.levelTypeButton);
        this.generateStructuresButton = RealmsResetNormalWorldScreen.newButton((int)3, (int)(this.width() / 2 - 102), (int)(RealmsConstants.row(6) - 2), (int)205, (int)20, (String)this.generateStructuresTitle());
        this.buttonsAdd(this.generateStructuresButton);
    }

    public void removed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void keyPressed(char ch2, int eventKey) {
        this.seedEdit.keyPressed(ch2, eventKey);
        if (eventKey == 28 || eventKey == 156) {
            this.buttonClicked(this.resetButton);
        }
        if (eventKey == 1) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        }
    }

    public void buttonClicked(RealmsButton button) {
        if (!button.active()) {
            return;
        }
        switch (button.id()) {
            case 0: {
                Realms.setScreen((RealmsScreen)this.lastScreen);
                break;
            }
            case 1: {
                this.lastScreen.resetWorld(new RealmsResetWorldScreen.ResetWorldInfo(this.seedEdit.getValue(), this.levelTypeIndex, this.generateStructures));
                break;
            }
            case 2: {
                this.levelTypeIndex = (this.levelTypeIndex + 1) % this.levelTypes.length;
                button.msg(this.levelTypeTitle());
                break;
            }
            case 3: {
                this.generateStructures = this.generateStructures == false;
                button.msg(this.generateStructuresTitle());
                break;
            }
            default: {
                return;
            }
        }
    }

    public void mouseClicked(int x2, int y2, int buttonNum) {
        super.mouseClicked(x2, y2, buttonNum);
        this.seedEdit.mouseClicked(x2, y2, buttonNum);
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString(RealmsResetNormalWorldScreen.getLocalizedString((String)"mco.reset.world.generate"), this.width() / 2, 17, 0xFFFFFF);
        this.drawString(RealmsResetNormalWorldScreen.getLocalizedString((String)"mco.reset.world.seed"), this.width() / 2 - 100, RealmsConstants.row(1), 0xA0A0A0);
        this.seedEdit.render();
        super.render(xm2, ym2, a2);
    }

    private String levelTypeTitle() {
        String levelType = RealmsResetNormalWorldScreen.getLocalizedString((String)"selectWorld.mapType");
        return levelType + " " + this.levelTypes[this.levelTypeIndex];
    }

    private String generateStructuresTitle() {
        return RealmsResetNormalWorldScreen.getLocalizedString((String)"selectWorld.mapFeatures") + " " + (this.generateStructures != false ? RealmsResetNormalWorldScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsResetNormalWorldScreen.getLocalizedString((String)"mco.configure.world.off"));
    }
}

