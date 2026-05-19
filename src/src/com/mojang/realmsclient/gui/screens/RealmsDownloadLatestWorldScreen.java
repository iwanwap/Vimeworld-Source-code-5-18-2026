/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.Realms
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsDefaultVertexFormat
 *  net.minecraft.realms.RealmsScreen
 *  net.minecraft.realms.RealmsSharedConstants
 *  net.minecraft.realms.Tezzelator
 */
package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.client.FileDownload;
import com.mojang.realmsclient.gui.screens.RealmsLongConfirmationScreen;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsDefaultVertexFormat;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.realms.RealmsSharedConstants;
import net.minecraft.realms.Tezzelator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class RealmsDownloadLatestWorldScreen
extends RealmsScreen {
    private static final Logger LOGGER = LogManager.getLogger();
    private final RealmsScreen lastScreen;
    private final String downloadLink;
    private RealmsButton cancelButton;
    private final String worldName;
    private final DownloadStatus downloadStatus;
    private volatile String errorMessage = null;
    private volatile String status = null;
    private volatile String progress = null;
    private volatile boolean cancelled = false;
    private volatile boolean showDots = true;
    private volatile boolean finished = false;
    private volatile boolean extracting = false;
    private Long previousWrittenBytes = null;
    private Long previousTimeSnapshot = null;
    private long bytesPersSecond = 0L;
    private int animTick = 0;
    private static final String[] DOTS = new String[]{"", ".", ". .", ". . ."};
    private int dotIndex = 0;
    private final int WARNING_ID = 100;
    private boolean checked = false;
    private static final ReentrantLock downloadLock = new ReentrantLock();

    public RealmsDownloadLatestWorldScreen(RealmsScreen lastScreen, String downloadLink, String worldName) {
        this.lastScreen = lastScreen;
        this.worldName = worldName;
        this.downloadLink = downloadLink;
        this.downloadStatus = new DownloadStatus();
    }

    public void init() {
        Keyboard.enableRepeatEvents(true);
        this.buttonsClear();
        this.cancelButton = RealmsDownloadLatestWorldScreen.newButton((int)0, (int)(this.width() / 2 - 100), (int)(this.height() - 42), (int)200, (int)20, (String)RealmsDownloadLatestWorldScreen.getLocalizedString((String)"gui.cancel"));
        this.buttonsAdd(this.cancelButton);
        this.checkDownloadSize();
    }

    private void checkDownloadSize() {
        if (this.finished) {
            return;
        }
        if (!this.checked && this.getContentLength(this.downloadLink) >= 1048576000L) {
            String line1 = RealmsDownloadLatestWorldScreen.getLocalizedString((String)"mco.download.confirmation.line1", (Object[])new Object[]{RealmsDownloadLatestWorldScreen.humanReadableSize(1048576000L)});
            String line2 = RealmsDownloadLatestWorldScreen.getLocalizedString((String)"mco.download.confirmation.line2");
            Realms.setScreen((RealmsScreen)new RealmsLongConfirmationScreen(this, RealmsLongConfirmationScreen.Type.Warning, line1, line2, false, 100));
        } else {
            this.downloadSave();
        }
    }

    public void confirmResult(boolean result, int id2) {
        this.checked = true;
        Realms.setScreen((RealmsScreen)this);
        this.downloadSave();
    }

    private long getContentLength(String downloadLink) {
        FileDownload fileDownload = new FileDownload();
        return fileDownload.contentLength(downloadLink);
    }

    public void tick() {
        super.tick();
        ++this.animTick;
    }

    public void buttonClicked(RealmsButton button) {
        if (!button.active()) {
            return;
        }
        if (button.id() == 0) {
            this.cancelled = true;
            this.backButtonClicked();
        }
    }

    public void keyPressed(char ch2, int eventKey) {
        if (eventKey == 1) {
            this.cancelled = true;
            this.backButtonClicked();
        }
    }

    private void backButtonClicked() {
        Realms.setScreen((RealmsScreen)this.lastScreen);
    }

    public void render(int xm2, int ym2, float a2) {
        this.renderBackground();
        if (this.extracting && !this.finished) {
            this.status = RealmsDownloadLatestWorldScreen.getLocalizedString((String)"mco.download.extracting");
        }
        this.drawCenteredString(RealmsDownloadLatestWorldScreen.getLocalizedString((String)"mco.download.title"), this.width() / 2, 20, 0xFFFFFF);
        this.drawCenteredString(this.status, this.width() / 2, 50, 0xFFFFFF);
        if (this.showDots) {
            this.drawDots();
        }
        if (this.downloadStatus.bytesWritten != 0L && !this.cancelled) {
            this.drawProgressBar();
            this.drawDownloadSpeed();
        }
        if (this.errorMessage != null) {
            this.drawCenteredString(this.errorMessage, this.width() / 2, 110, 0xFF0000);
        }
        super.render(xm2, ym2, a2);
    }

    private void drawDots() {
        int statusWidth = this.fontWidth(this.status);
        if (this.animTick % 10 == 0) {
            ++this.dotIndex;
        }
        this.drawString(DOTS[this.dotIndex % DOTS.length], this.width() / 2 + statusWidth / 2 + 5, 50, 0xFFFFFF);
    }

    private void drawProgressBar() {
        double percentage = this.downloadStatus.bytesWritten.doubleValue() / this.downloadStatus.totalBytes.doubleValue() * 100.0;
        this.progress = String.format("%.1f", percentage);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3553);
        Tezzelator t2 = Tezzelator.instance;
        t2.begin(7, RealmsDefaultVertexFormat.POSITION_COLOR);
        double base = this.width() / 2 - 100;
        double diff = 0.5;
        t2.vertex(base - 0.5, 95.5, 0.0).color(217, 210, 210, 255).endVertex();
        t2.vertex(base + 200.0 * percentage / 100.0 + 0.5, 95.5, 0.0).color(217, 210, 210, 255).endVertex();
        t2.vertex(base + 200.0 * percentage / 100.0 + 0.5, 79.5, 0.0).color(217, 210, 210, 255).endVertex();
        t2.vertex(base - 0.5, 79.5, 0.0).color(217, 210, 210, 255).endVertex();
        t2.vertex(base, 95.0, 0.0).color(128, 128, 128, 255).endVertex();
        t2.vertex(base + 200.0 * percentage / 100.0, 95.0, 0.0).color(128, 128, 128, 255).endVertex();
        t2.vertex(base + 200.0 * percentage / 100.0, 80.0, 0.0).color(128, 128, 128, 255).endVertex();
        t2.vertex(base, 80.0, 0.0).color(128, 128, 128, 255).endVertex();
        t2.end();
        GL11.glEnable(3553);
        this.drawCenteredString(this.progress + " %", this.width() / 2, 84, 0xFFFFFF);
    }

    private void drawDownloadSpeed() {
        if (this.animTick % RealmsSharedConstants.TICKS_PER_SECOND == 0) {
            if (this.previousWrittenBytes != null) {
                long timeElapsed = System.currentTimeMillis() - this.previousTimeSnapshot;
                if (timeElapsed == 0L) {
                    timeElapsed = 1L;
                }
                this.bytesPersSecond = 1000L * (this.downloadStatus.bytesWritten - this.previousWrittenBytes) / timeElapsed;
                this.drawDownloadSpeed0(this.bytesPersSecond);
            }
            this.previousWrittenBytes = this.downloadStatus.bytesWritten;
            this.previousTimeSnapshot = System.currentTimeMillis();
        } else {
            this.drawDownloadSpeed0(this.bytesPersSecond);
        }
    }

    private void drawDownloadSpeed0(long bytesPersSecond) {
        if (bytesPersSecond > 0L) {
            int progressLength = this.fontWidth(this.progress);
            String stringPresentation = "(" + RealmsDownloadLatestWorldScreen.humanReadableSpeed(bytesPersSecond) + ")";
            this.drawString(stringPresentation, this.width() / 2 + progressLength / 2 + 15, 84, 0xFFFFFF);
        }
    }

    public static String humanReadableSpeed(long bytes) {
        int unit = 1024;
        if (bytes < (long)unit) {
            return bytes + " B";
        }
        int exp = (int)(Math.log(bytes) / Math.log(unit));
        String pre = "KMGTPE".charAt(exp - 1) + "";
        return String.format("%.1f %sB/s", (double)bytes / Math.pow(unit, exp), pre);
    }

    public static String humanReadableSize(long bytes) {
        int unit = 1024;
        if (bytes < (long)unit) {
            return bytes + " B";
        }
        int exp = (int)(Math.log(bytes) / Math.log(unit));
        String pre = "KMGTPE".charAt(exp - 1) + "";
        return String.format("%.0f %sB", (double)bytes / Math.pow(unit, exp), pre);
    }

    public void mouseEvent() {
        super.mouseEvent();
    }

    private void downloadSave() {
        new Thread(){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            @Override
            public void run() {
                try {
                    if (!downloadLock.tryLock(1L, TimeUnit.SECONDS)) {
                        return;
                    }
                    RealmsDownloadLatestWorldScreen.this.status = RealmsScreen.getLocalizedString((String)"mco.download.preparing");
                    if (RealmsDownloadLatestWorldScreen.this.cancelled) {
                        RealmsDownloadLatestWorldScreen.this.downloadCancelled();
                        return;
                    }
                    RealmsDownloadLatestWorldScreen.this.status = RealmsScreen.getLocalizedString((String)"mco.download.downloading", (Object[])new Object[]{RealmsDownloadLatestWorldScreen.this.worldName});
                    FileDownload fileDownload = new FileDownload();
                    fileDownload.contentLength(RealmsDownloadLatestWorldScreen.this.downloadLink);
                    fileDownload.download(RealmsDownloadLatestWorldScreen.this.downloadLink, RealmsDownloadLatestWorldScreen.this.worldName, RealmsDownloadLatestWorldScreen.this.downloadStatus, RealmsDownloadLatestWorldScreen.this.getLevelStorageSource());
                    while (!fileDownload.isFinished()) {
                        if (fileDownload.isError()) {
                            fileDownload.cancel();
                            RealmsDownloadLatestWorldScreen.this.errorMessage = RealmsScreen.getLocalizedString((String)"mco.download.failed");
                            RealmsDownloadLatestWorldScreen.this.cancelButton.msg(RealmsScreen.getLocalizedString((String)"gui.done"));
                            return;
                        }
                        if (fileDownload.isExtracting()) {
                            RealmsDownloadLatestWorldScreen.this.extracting = true;
                        }
                        if (RealmsDownloadLatestWorldScreen.this.cancelled) {
                            fileDownload.cancel();
                            RealmsDownloadLatestWorldScreen.this.downloadCancelled();
                            return;
                        }
                        try {
                            Thread.sleep(500L);
                        }
                        catch (InterruptedException e2) {
                            LOGGER.error("Failed to check Realms backup download status");
                        }
                    }
                    RealmsDownloadLatestWorldScreen.this.finished = true;
                    RealmsDownloadLatestWorldScreen.this.status = RealmsScreen.getLocalizedString((String)"mco.download.done");
                    RealmsDownloadLatestWorldScreen.this.cancelButton.msg(RealmsScreen.getLocalizedString((String)"gui.done"));
                }
                catch (InterruptedException e3) {
                    LOGGER.error("Could not acquire upload lock");
                }
                catch (Exception e4) {
                    RealmsDownloadLatestWorldScreen.this.errorMessage = RealmsScreen.getLocalizedString((String)"mco.download.failed");
                    e4.printStackTrace();
                }
                finally {
                    if (!downloadLock.isHeldByCurrentThread()) {
                        return;
                    }
                    downloadLock.unlock();
                    RealmsDownloadLatestWorldScreen.this.showDots = false;
                    RealmsDownloadLatestWorldScreen.this.buttonsRemove(RealmsDownloadLatestWorldScreen.this.cancelButton);
                    RealmsDownloadLatestWorldScreen.this.finished = true;
                }
            }
        }.start();
    }

    private void downloadCancelled() {
        this.status = RealmsDownloadLatestWorldScreen.getLocalizedString((String)"mco.download.cancelled");
    }

    public class DownloadStatus {
        public volatile Long bytesWritten = 0L;
        public volatile Long totalBytes = 0L;
    }
}

