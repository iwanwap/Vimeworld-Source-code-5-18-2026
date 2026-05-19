/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsScreen
 *  net.minecraft.realms.RealmsSimpleScrolledSelectionList
 *  net.minecraft.realms.Tezzelator
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.dto.Backup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.realms.RealmsSimpleScrolledSelectionList;
import net.minecraft.realms.Tezzelator;
import org.lwjgl.input.Keyboard;

public class RealmsBackupInfoScreen
extends RealmsScreen {
    private final RealmsScreen lastScreen;
    private final int BUTTON_BACK_ID = 0;
    private final Backup backup;
    private List<String> keys = new ArrayList<String>();
    private BackupInfoList backupInfoList;
    String[] difficulties = new String[]{RealmsBackupInfoScreen.getLocalizedString((String)"options.difficulty.peaceful"), RealmsBackupInfoScreen.getLocalizedString((String)"options.difficulty.easy"), RealmsBackupInfoScreen.getLocalizedString((String)"options.difficulty.normal"), RealmsBackupInfoScreen.getLocalizedString((String)"options.difficulty.hard")};
    String[] gameModes = new String[]{RealmsBackupInfoScreen.getLocalizedString((String)"selectWorld.gameMode.survival"), RealmsBackupInfoScreen.getLocalizedString((String)"selectWorld.gameMode.creative"), RealmsBackupInfoScreen.getLocalizedString((String)"selectWorld.gameMode.adventure")};

    public RealmsBackupInfoScreen(RealmsScreen lastScreen, Backup backup) {
        this.lastScreen = lastScreen;
        this.backup = backup;
        if (backup.changeList != null) {
            for (Map.Entry<String, String> entry : backup.changeList.entrySet()) {
                this.keys.add(entry.getKey());
            }
        }
    }

    public void mouseEvent() {
        super.mouseEvent();
        this.backupInfoList.mouseEvent();
    }

    public void tick() {
    }

    public void init() {
        Keyboard.enableRepeatEvents(true);
        this.buttonsAdd(RealmsBackupInfoScreen.newButton((int)0, (int)(this.width() / 2 - 100), (int)(this.height() / 4 + 120 + 24), (String)RealmsBackupInfoScreen.getLocalizedString((String)"gui.back")));
        this.backupInfoList = new BackupInfoList();
    }

    public void removed() {
        Keyboard.enableRepeatEvents(false);
    }

    public void buttonClicked(RealmsButton button) {
        if (!button.active()) {
            return;
        }
        if (button.id() == 0) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        }
    }

    public void keyPressed(char ch2, int eventKey) {
        if (eventKey == 1) {
            Realms.setScreen((RealmsScreen)this.lastScreen);
        }
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString("Changes from last backup", this.width() / 2, 10, 0xFFFFFF);
        this.backupInfoList.render(xm2, ym2, a2);
        super.render(xm2, ym2, a2);
    }

    private String checkForSpecificMetadata(String key, String value) {
        String k2 = key.toLowerCase();
        if (k2.contains("game") && k2.contains("mode")) {
            return this.gameModeMetadata(value);
        }
        if (k2.contains("game") && k2.contains("difficulty")) {
            return this.gameDifficultyMetadata(value);
        }
        return value;
    }

    private String gameDifficultyMetadata(String value) {
        try {
            return this.difficulties[Integer.parseInt(value)];
        }
        catch (Exception e2) {
            return "UNKNOWN";
        }
    }

    private String gameModeMetadata(String value) {
        try {
            return this.gameModes[Integer.parseInt(value)];
        }
        catch (Exception e2) {
            return "UNKNOWN";
        }
    }

    private class BackupInfoList
    extends RealmsSimpleScrolledSelectionList {
        public BackupInfoList() {
            super(RealmsBackupInfoScreen.this.width(), RealmsBackupInfoScreen.this.height(), 32, RealmsBackupInfoScreen.this.height() - 64, 36);
        }

        public int getItemCount() {
            return ((RealmsBackupInfoScreen)RealmsBackupInfoScreen.this).backup.changeList.size();
        }

        public void selectItem(int item, boolean doubleClick, int xMouse, int yMouse) {
        }

        public boolean isSelectedItem(int item) {
            return false;
        }

        public int getMaxPosition() {
            return this.getItemCount() * 36;
        }

        public void renderBackground() {
        }

        protected void renderItem(int i2, int x2, int y2, int h2, Tezzelator t2, int mouseX, int mouseY) {
            String key = (String)RealmsBackupInfoScreen.this.keys.get(i2);
            RealmsBackupInfoScreen.this.drawString(key, this.width() / 2 - 40, y2, 0xA0A0A0);
            String metadataValue = ((RealmsBackupInfoScreen)RealmsBackupInfoScreen.this).backup.changeList.get(key);
            RealmsBackupInfoScreen.this.drawString(RealmsBackupInfoScreen.this.checkForSpecificMetadata(key, metadataValue), this.width() / 2 - 40, y2 + 12, 0xFFFFFF);
        }
    }
}

