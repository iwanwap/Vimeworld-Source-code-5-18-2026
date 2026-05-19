/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsScreen
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.gui.ErrorCallback;
import com.mojang.realmsclient.gui.LongRunningTask;
import com.mojang.realmsclient.gui.RealmsConstants;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class RealmsLongRunningMcoTaskScreen
extends RealmsScreen
implements ErrorCallback {
    private final int BUTTON_CANCEL_ID = 666;
    private final int BUTTON_BACK_ID = 667;
    private final RealmsScreen lastScreen;
    private final LongRunningTask taskThread;
    private volatile String title = "";
    private volatile boolean error;
    private volatile String errorMessage;
    private volatile boolean aborted;
    private int animTicks;
    private LongRunningTask task;
    private int buttonLength = 212;
    public static final String[] symbols = new String[]{"\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _"};

    public RealmsLongRunningMcoTaskScreen(RealmsScreen lastScreen, LongRunningTask task) {
        this.lastScreen = lastScreen;
        this.task = task;
        task.setScreen(this);
        this.taskThread = task;
    }

    public void start() {
        new Thread(this.taskThread, "Realms-long-running-task").start();
    }

    public void tick() {
        super.tick();
        ++this.animTicks;
        this.task.tick();
    }

    public void keyPressed(char eventCharacter, int eventKey) {
        if (eventKey == 1) {
            this.cancelOrBackButtonClicked();
        }
    }

    public void init() {
        this.task.init();
        this.buttonsAdd(RealmsLongRunningMcoTaskScreen.newButton((int)666, (int)(this.width() / 2 - this.buttonLength / 2), (int)RealmsConstants.row(12), (int)this.buttonLength, (int)20, (String)RealmsLongRunningMcoTaskScreen.getLocalizedString((String)"gui.cancel")));
    }

    public void buttonClicked(RealmsButton button) {
        if (button.id() == 666 || button.id() == 667) {
            this.cancelOrBackButtonClicked();
        }
        this.task.buttonClicked(button);
    }

    private void cancelOrBackButtonClicked() {
        this.aborted = true;
        this.task.abortTask();
        Realms.setScreen((RealmsScreen)this.lastScreen);
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        this.drawCenteredString(this.title, this.width() / 2, RealmsConstants.row(3), 0xFFFFFF);
        if (!this.error) {
            this.drawCenteredString(symbols[this.animTicks % symbols.length], this.width() / 2, RealmsConstants.row(8), 0x808080);
        }
        if (this.error) {
            this.drawCenteredString(this.errorMessage, this.width() / 2, RealmsConstants.row(8), 0xFF0000);
        }
        super.render(xm2, ym2, a2);
    }

    @Override
    public void error(String errorMessage) {
        this.error = true;
        this.errorMessage = errorMessage;
        this.buttonsClear();
        this.buttonsAdd(RealmsLongRunningMcoTaskScreen.newButton((int)667, (int)(this.width() / 2 - this.buttonLength / 2), (int)(this.height() / 4 + 120 + 12), (String)RealmsLongRunningMcoTaskScreen.getLocalizedString((String)"gui.back")));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean aborted() {
        return this.aborted;
    }
}

