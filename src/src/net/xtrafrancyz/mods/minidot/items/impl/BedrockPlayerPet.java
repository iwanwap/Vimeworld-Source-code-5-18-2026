/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Js
 *  dT
 */
package net.xtrafrancyz.mods.minidot.items.impl;

import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;

public final class BedrockPlayerPet
implements MDModel {
    private final BedrockModel propModel;
    private final BedrockModel playerModel;

    @Override
    public void J(dT dT2) {
        BedrockPlayerPet b2 = dT2;
        BedrockPlayerPet a2 = this;
        if (a2.playerModel != null) {
            ResourceLocation resourceLocation;
            if (((dT)b2).player instanceof XW && (resourceLocation = ((XW)((dT)b2).player).J()) != null) {
                a2.playerModel.J(resourceLocation);
            }
            a2.playerModel.J((dT)b2);
        }
        if (a2.propModel != null) {
            a2.propModel.J((dT)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public BedrockPlayerPet(String string, String string2, String string3, String string4, String string5) {
        String f2;
        void c2;
        void d2;
        void b2;
        void e2;
        BedrockPlayerPet bedrockPlayerPet = string6;
        String string6 = string5;
        BedrockPlayerPet a2 = bedrockPlayerPet;
        BedrockPlayerPet bedrockPlayerPet2 = a2;
        bedrockPlayerPet2.playerModel = new BedrockModel((String)e2, Zra.j);
        if (b2 != null) {
            a2.playerModel.J((String)b2);
        }
        a2.propModel = new BedrockModel((String)d2, (String)c2);
        if (f2 != null) {
            a2.propModel.J(f2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Js J(String string) {
        void a2;
        BedrockPlayerPet bedrockPlayerPet = this;
        BedrockPlayerPet b2 = null;
        if (bedrockPlayerPet.playerModel != null) {
            b2 = bedrockPlayerPet.playerModel.J((String)a2);
        }
        if (b2 == null && bedrockPlayerPet.propModel != null) {
            b2 = bedrockPlayerPet.propModel.J((String)a2);
        }
        return b2;
    }
}

