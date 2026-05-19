/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsEditBox
 *  net.minecraft.realms.RealmsScreen
 *  net.minecraft.realms.RealmsSliderButton
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.dto.RealmsOptions;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.gui.RealmsConstants;
import com.mojang.realmsclient.gui.screens.RealmsConfigureWorldScreen;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsEditBox;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.realms.RealmsSliderButton;
import org.lwjgl.input.Keyboard;

public class RealmsSlotOptionsScreen
extends RealmsScreen {
    private static final int BUTTON_CANCEL_ID = 0;
    private static final int BUTTON_DONE_ID = 1;
    private static final int BUTTON_DIFFICULTY_ID = 2;
    private static final int BUTTON_GAMEMODE_ID = 3;
    private static final int BUTTON_PVP_ID = 4;
    private static final int BUTTON_SPAWN_ANIMALS_ID = 5;
    private static final int BUTTON_SPAWN_MONSTERS_ID = 6;
    private static final int BUTTON_SPAWN_NPCS_ID = 7;
    private static final int BUTTON_SPAWN_PROTECTION_ID = 8;
    private static final int BUTTON_COMMANDBLOCKS_ID = 9;
    private static final int BUTTON_FORCE_GAMEMODE_ID = 10;
    private static final int NAME_EDIT_BOX = 11;
    private RealmsEditBox nameEdit;
    protected final RealmsConfigureWorldScreen parent;
    private int column1_x;
    private int column_width;
    private int column2_x;
    private RealmsOptions options;
    private RealmsServer.WorldType worldType;
    private int activeSlot;
    private int difficultyIndex;
    private int gameModeIndex;
    private Boolean pvp;
    private Boolean spawnNPCs;
    private Boolean spawnAnimals;
    private Boolean spawnMonsters;
    private Integer spawnProtection;
    private Boolean commandBlocks;
    private Boolean forceGameMode;
    private RealmsButton pvpButton;
    private RealmsButton spawnAnimalsButton;
    private RealmsButton spawnMonstersButton;
    private RealmsButton spawnNPCsButton;
    private RealmsSliderButton spawnProtectionButton;
    private RealmsButton commandBlocksButton;
    private RealmsButton forceGameModeButton;
    private boolean notNormal = false;
    String[] difficulties;
    String[] gameModes;
    String[][] gameModeHints;

    public RealmsSlotOptionsScreen(RealmsConfigureWorldScreen configureWorldScreen, RealmsOptions options, RealmsServer.WorldType worldType, int activeSlot) {
        this.parent = configureWorldScreen;
        this.options = options;
        this.worldType = worldType;
        this.activeSlot = activeSlot;
    }

    public void removed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void tick() {
        this.nameEdit.tick();
    }

    public void buttonClicked(RealmsButton button) {
        if (!button.active()) {
            return;
        }
        switch (button.id()) {
            case 1: {
                this.saveSettings();
                break;
            }
            case 0: {
                Realms.setScreen((RealmsScreen)this.parent);
                break;
            }
            case 2: {
                this.difficultyIndex = (this.difficultyIndex + 1) % this.difficulties.length;
                button.msg(this.difficultyTitle());
                if (!this.worldType.equals((Object)RealmsServer.WorldType.NORMAL)) break;
                this.spawnMonstersButton.active(this.difficultyIndex != 0);
                this.spawnMonstersButton.msg(this.spawnMonstersTitle());
                break;
            }
            case 3: {
                this.gameModeIndex = (this.gameModeIndex + 1) % this.gameModes.length;
                button.msg(this.gameModeTitle());
                break;
            }
            case 4: {
                this.pvp = this.pvp == false;
                button.msg(this.pvpTitle());
                break;
            }
            case 5: {
                this.spawnAnimals = this.spawnAnimals == false;
                button.msg(this.spawnAnimalsTitle());
                break;
            }
            case 7: {
                this.spawnNPCs = this.spawnNPCs == false;
                button.msg(this.spawnNPCsTitle());
                break;
            }
            case 6: {
                this.spawnMonsters = this.spawnMonsters == false;
                button.msg(this.spawnMonstersTitle());
                break;
            }
            case 9: {
                this.commandBlocks = this.commandBlocks == false;
                button.msg(this.commandBlocksTitle());
                break;
            }
            case 10: {
                this.forceGameMode = this.forceGameMode == false;
                button.msg(this.forceGameModeTitle());
                break;
            }
            default: {
                return;
            }
        }
    }

    public void keyPressed(char eventCharacter, int eventKey) {
        this.nameEdit.keyPressed(eventCharacter, eventKey);
        switch (eventKey) {
            case 15: {
                this.nameEdit.setFocus(!this.nameEdit.isFocused());
                break;
            }
            case 1: {
                Realms.setScreen((RealmsScreen)this.parent);
                break;
            }
            case 28: 
            case 156: {
                this.saveSettings();
                break;
            }
            default: {
                return;
            }
        }
    }

    public void mouseClicked(int x2, int y2, int buttonNum) {
        super.mouseClicked(x2, y2, buttonNum);
        this.nameEdit.mouseClicked(x2, y2, buttonNum);
    }

    public void init() {
        this.column1_x = this.width() / 2 - 122;
        this.column_width = 122;
        this.column2_x = this.width() / 2 + 10;
        this.createDifficultyAndGameMode();
        this.difficultyIndex = this.options.difficulty;
        this.gameModeIndex = this.options.gameMode;
        if (!this.worldType.equals((Object)RealmsServer.WorldType.NORMAL)) {
            this.notNormal = true;
            this.pvp = true;
            this.spawnProtection = 0;
            this.forceGameMode = false;
            this.spawnAnimals = true;
            this.spawnMonsters = true;
            this.spawnNPCs = true;
            this.commandBlocks = true;
        } else {
            this.pvp = this.options.pvp;
            this.spawnProtection = this.options.spawnProtection;
            this.forceGameMode = this.options.forceGameMode;
            this.spawnAnimals = this.options.spawnAnimals;
            this.spawnMonsters = this.options.spawnMonsters;
            this.spawnNPCs = this.options.spawnNPCs;
            this.commandBlocks = this.options.commandBlocks;
        }
        this.nameEdit = this.newEditBox(11, this.column1_x + 2, RealmsConstants.row(2), this.column_width - 4, 20);
        this.nameEdit.setFocus(true);
        this.nameEdit.setMaxLength(10);
        this.nameEdit.setValue(this.options.getSlotName(this.activeSlot));
        this.buttonsAdd(RealmsSlotOptionsScreen.newButton((int)3, (int)this.column2_x, (int)RealmsConstants.row(2), (int)this.column_width, (int)20, (String)this.gameModeTitle()));
        this.pvpButton = RealmsSlotOptionsScreen.newButton((int)4, (int)this.column1_x, (int)RealmsConstants.row(4), (int)this.column_width, (int)20, (String)this.pvpTitle());
        this.buttonsAdd(this.pvpButton);
        this.spawnAnimalsButton = RealmsSlotOptionsScreen.newButton((int)5, (int)this.column2_x, (int)RealmsConstants.row(4), (int)this.column_width, (int)20, (String)this.spawnAnimalsTitle());
        this.buttonsAdd(this.spawnAnimalsButton);
        this.buttonsAdd(RealmsSlotOptionsScreen.newButton((int)2, (int)this.column1_x, (int)RealmsConstants.row(6), (int)this.column_width, (int)20, (String)this.difficultyTitle()));
        this.spawnMonstersButton = RealmsSlotOptionsScreen.newButton((int)6, (int)this.column2_x, (int)RealmsConstants.row(6), (int)this.column_width, (int)20, (String)this.spawnMonstersTitle());
        this.buttonsAdd(this.spawnMonstersButton);
        this.spawnProtectionButton = new SettingsSlider(8, this.column1_x, RealmsConstants.row(8), this.column_width, 17, this.spawnProtection, 0.0f, 16.0f);
        this.buttonsAdd((RealmsButton)this.spawnProtectionButton);
        this.spawnNPCsButton = RealmsSlotOptionsScreen.newButton((int)7, (int)this.column2_x, (int)RealmsConstants.row(8), (int)this.column_width, (int)20, (String)this.spawnNPCsTitle());
        this.buttonsAdd(this.spawnNPCsButton);
        this.forceGameModeButton = RealmsSlotOptionsScreen.newButton((int)10, (int)this.column1_x, (int)RealmsConstants.row(10), (int)this.column_width, (int)20, (String)this.forceGameModeTitle());
        this.buttonsAdd(this.forceGameModeButton);
        this.commandBlocksButton = RealmsSlotOptionsScreen.newButton((int)9, (int)this.column2_x, (int)RealmsConstants.row(10), (int)this.column_width, (int)20, (String)this.commandBlocksTitle());
        this.buttonsAdd(this.commandBlocksButton);
        if (!this.worldType.equals((Object)RealmsServer.WorldType.NORMAL)) {
            this.pvpButton.active(false);
            this.spawnAnimalsButton.active(false);
            this.spawnNPCsButton.active(false);
            this.spawnMonstersButton.active(false);
            this.spawnProtectionButton.active(false);
            this.commandBlocksButton.active(false);
            this.spawnProtectionButton.active(false);
            this.forceGameModeButton.active(false);
        }
        if (this.difficultyIndex == 0) {
            this.spawnMonstersButton.active(false);
        }
        this.buttonsAdd(RealmsSlotOptionsScreen.newButton((int)1, (int)this.column1_x, (int)RealmsConstants.row(13), (int)this.column_width, (int)20, (String)RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.buttons.done")));
        this.buttonsAdd(RealmsSlotOptionsScreen.newButton((int)0, (int)this.column2_x, (int)RealmsConstants.row(13), (int)this.column_width, (int)20, (String)RealmsSlotOptionsScreen.getLocalizedString((String)"gui.cancel")));
    }

    private void createDifficultyAndGameMode() {
        this.difficulties = new String[]{RealmsSlotOptionsScreen.getLocalizedString((String)"options.difficulty.peaceful"), RealmsSlotOptionsScreen.getLocalizedString((String)"options.difficulty.easy"), RealmsSlotOptionsScreen.getLocalizedString((String)"options.difficulty.normal"), RealmsSlotOptionsScreen.getLocalizedString((String)"options.difficulty.hard")};
        this.gameModes = new String[]{RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.survival"), RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.creative"), RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.adventure")};
        this.gameModeHints = new String[][]{{RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.survival.line1"), RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.survival.line2")}, {RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.creative.line1"), RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.creative.line2")}, {RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.adventure.line1"), RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode.adventure.line2")}};
    }

    private String difficultyTitle() {
        String difficulty = RealmsSlotOptionsScreen.getLocalizedString((String)"options.difficulty");
        return difficulty + ": " + this.difficulties[this.difficultyIndex];
    }

    private String gameModeTitle() {
        String gameMode = RealmsSlotOptionsScreen.getLocalizedString((String)"selectWorld.gameMode");
        return gameMode + ": " + this.gameModes[this.gameModeIndex];
    }

    private String pvpTitle() {
        return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.pvp") + ": " + (this.pvp != false ? RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off"));
    }

    private String spawnAnimalsTitle() {
        return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.spawnAnimals") + ": " + (this.spawnAnimals != false ? RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off"));
    }

    private String spawnMonstersTitle() {
        if (this.difficultyIndex == 0) {
            return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.spawnMonsters") + ": " + RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off");
        }
        return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.spawnMonsters") + ": " + (this.spawnMonsters != false ? RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off"));
    }

    private String spawnNPCsTitle() {
        return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.spawnNPCs") + ": " + (this.spawnNPCs != false ? RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off"));
    }

    private String commandBlocksTitle() {
        return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.commandBlocks") + ": " + (this.commandBlocks != false ? RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off"));
    }

    private String forceGameModeTitle() {
        return RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.forceGameMode") + ": " + (this.forceGameMode != false ? RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.on") : RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.off"));
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        String slotName = RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.edit.slot.name");
        this.drawString(slotName, this.column1_x + this.fontWidth(slotName) / 2, RealmsConstants.row(0) + 5, 0xFFFFFF);
        this.drawCenteredString(RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.buttons.options"), this.width() / 2, 17, 0xFFFFFF);
        if (this.notNormal) {
            this.drawCenteredString(RealmsSlotOptionsScreen.getLocalizedString((String)"mco.configure.world.edit.subscreen.adventuremap"), this.width() / 2, 30, 0xFF0000);
        }
        this.nameEdit.render();
        super.render(xm2, ym2, a2);
    }

    public void renderHints() {
        this.drawString(this.gameModeHints[this.gameModeIndex][0], this.column2_x + 2, RealmsConstants.row(0), 0xA0A0A0);
        this.drawString(this.gameModeHints[this.gameModeIndex][1], this.column2_x + 2, RealmsConstants.row(0) + this.fontLineHeight() + 2, 0xA0A0A0);
    }

    public void mouseReleased(int x2, int y2, int buttonNum) {
        if (!this.spawnProtectionButton.active()) {
            return;
        }
        this.spawnProtectionButton.released(x2, y2);
    }

    public void mouseDragged(int x2, int y2, int buttonNum, long delta) {
        if (!this.spawnProtectionButton.active()) {
            return;
        }
        if (x2 < this.column1_x + this.spawnProtectionButton.getWidth() && x2 > this.column1_x && y2 < this.spawnProtectionButton.y() + 20 && y2 > this.spawnProtectionButton.y()) {
            this.spawnProtectionButton.clicked(x2, y2);
        }
    }

    private String getSlotName() {
        if (this.nameEdit.getValue().equals(this.options.getDefaultSlotName(this.activeSlot))) {
            return "";
        }
        return this.nameEdit.getValue();
    }

    private void saveSettings() {
        if (this.worldType.equals((Object)RealmsServer.WorldType.ADVENTUREMAP)) {
            this.parent.saveSlotSettings(new RealmsOptions(this.options.pvp, this.options.spawnAnimals, this.options.spawnMonsters, this.options.spawnNPCs, this.options.spawnProtection, this.options.commandBlocks, this.difficultyIndex, this.gameModeIndex, this.options.forceGameMode, this.getSlotName()));
        } else {
            this.parent.saveSlotSettings(new RealmsOptions(this.pvp, this.spawnAnimals, this.spawnMonsters, this.spawnNPCs, this.spawnProtection, this.commandBlocks, this.difficultyIndex, this.gameModeIndex, this.forceGameMode, this.getSlotName()));
        }
    }

    private class SettingsSlider
    extends RealmsSliderButton {
        public SettingsSlider(int id2, int x2, int y2, int width, int steps, int currentValue, float minValue, float maxValue) {
            super(id2, x2, y2, width, steps, currentValue, minValue, maxValue);
        }

        public String getMessage() {
            return RealmsScreen.getLocalizedString((String)"mco.configure.world.spawnProtection") + ": " + (RealmsSlotOptionsScreen.this.spawnProtection == 0 ? RealmsScreen.getLocalizedString((String)"mco.configure.world.off") : RealmsSlotOptionsScreen.this.spawnProtection);
        }

        public void clicked(float value) {
            if (!RealmsSlotOptionsScreen.this.spawnProtectionButton.active()) {
                return;
            }
            RealmsSlotOptionsScreen.this.spawnProtection = (int)value;
        }
    }
}

