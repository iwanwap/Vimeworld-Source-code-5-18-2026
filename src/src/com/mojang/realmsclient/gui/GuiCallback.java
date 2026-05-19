/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsButton
 */
package com.mojang.realmsclient.gui;

import net.minecraft.realms.RealmsButton;

public interface GuiCallback {
    public void tick();

    public void buttonClicked(RealmsButton var1);
}

