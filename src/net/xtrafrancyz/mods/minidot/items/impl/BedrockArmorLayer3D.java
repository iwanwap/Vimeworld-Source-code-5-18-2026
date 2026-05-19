/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JQa
 *  Js
 *  Kpa
 *  LQa
 *  Vt
 *  dQa
 *  dT
 *  kqa
 *  ut
 *  vRa
 */
package net.xtrafrancyz.mods.minidot.items.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;

public final class BedrockArmorLayer3D
implements MDModel {
    private final String modelChest;
    private final String textureBoots;
    private final String textureHelmet;
    private final Map<String, BedrockModel> cache;
    private final String textureLegs;
    private final String textureChest;
    private final String modelLegs;
    private final String modelHelmet;
    private final String modelBoots;
    private final boolean alphaRender;

    /*
     * WARNING - void declaration
     */
    @Override
    public Js J(String string) {
        BedrockArmorLayer3D bedrockArmorLayer3D = this;
        Iterator<BedrockModel> b2 = bedrockArmorLayer3D.cache.values().iterator();
        while (b2.hasNext()) {
            void a2;
            Js js2 = ((BedrockModel)b2.next()).J((String)a2);
            if (js2 == null) continue;
            return js2;
        }
        return null;
    }

    @Override
    public void J(dT object) {
        BedrockArmorLayer3D b2 = object;
        object = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String f(Vt vt) {
        BedrockArmorLayer3D b2 = vt;
        BedrockArmorLayer3D a2 = this;
        switch (ut.$SwitchMap$net$xtrafrancyz$mods$minidot$items$impl$BedrockArmorLayer3D$Slot[b2.ordinal()]) {
            case 1: {
                return a2.textureHelmet;
            }
            case 2: {
                return a2.textureChest;
            }
            case 3: {
                return a2.textureLegs;
            }
            case 4: {
                return a2.textureBoots;
            }
        }
        return null;
    }

    private static boolean J(ResourceLocation a2) {
        try {
            Kpa.J().J().J(a2);
            return vRa.d != 0;
        }
        catch (IOException iOException) {
            return uSa.E != 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private String J(Vt vt) {
        BedrockArmorLayer3D b2 = vt;
        BedrockArmorLayer3D a2 = this;
        switch (ut.$SwitchMap$net$xtrafrancyz$mods$minidot$items$impl$BedrockArmorLayer3D$Slot[b2.ordinal()]) {
            case 1: {
                return a2.modelHelmet;
            }
            case 2: {
                return a2.modelChest;
            }
            case 3: {
                return a2.modelLegs;
            }
            case 4: {
                return a2.modelBoots;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public BedrockArmorLayer3D(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, boolean bl) {
        void j2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i2;
        BedrockArmorLayer3D a2;
        boolean bl2 = bl;
        BedrockArmorLayer3D bedrockArmorLayer3D = a2 = this;
        BedrockArmorLayer3D bedrockArmorLayer3D2 = a2;
        BedrockArmorLayer3D bedrockArmorLayer3D3 = a2;
        BedrockArmorLayer3D bedrockArmorLayer3D4 = a2;
        BedrockArmorLayer3D bedrockArmorLayer3D5 = a2;
        a2.cache = new HashMap<String, BedrockModel>();
        a2.modelHelmet = i2;
        bedrockArmorLayer3D4.textureHelmet = h2;
        bedrockArmorLayer3D4.modelChest = g2;
        bedrockArmorLayer3D3.textureChest = f2;
        bedrockArmorLayer3D3.modelLegs = e2;
        bedrockArmorLayer3D2.textureLegs = d2;
        bedrockArmorLayer3D2.modelBoots = c2;
        bedrockArmorLayer3D.textureBoots = b2;
        bedrockArmorLayer3D.alphaRender = j2;
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, String string2, String string3) {
        String c2 = string2;
        String b2 = string;
        if (b2 == null) {
            return null;
        }
        if (b2.indexOf(LQa.c) < 0) {
            return b2;
        }
        try {
            void a2;
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = c2;
            objectArray[vRa.d] = a2;
            return String.format(b2, objectArray);
        }
        catch (Exception exception) {
            try {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2;
                return String.format(b2, objectArray);
            }
            catch (Exception exception2) {
                return null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public BedrockModel J(Vt vt, String string, String string2) {
        String c2;
        void a322;
        Object d2 = string;
        BedrockArmorLayer3D b2 = this;
        String string3 = a322 != null && !a322.isEmpty() ? new StringBuilder().insert(3 >> 2, IPa.W).append((String)a322).toString() : Mqa.y;
        int a322 = c2 == Vt.LEGGINGS ? uqa.g : vRa.d;
        String string4 = b2.J((Vt)c2);
        if (string4 == null) {
            return null;
        }
        String string5 = BedrockArmorLayer3D.J(b2.f((Vt)c2), (String)d2, string3);
        if (string5 == null) {
            string5 = new StringBuilder().insert(3 >> 2, kqa.f).append((String)d2).append(JQa.B).append(a322).append(string3).append(KPa.C).toString();
        }
        if (!BedrockArmorLayer3D.J(new ResourceLocation(Cra.V, string5))) {
            return null;
        }
        c2 = new StringBuilder().insert(5 >> 3, Era.N).append((Object)c2).append(dQa.e).append(string4).append(dsa.g).append(string5).toString();
        d2 = b2.cache.get(c2);
        if (d2 != null) {
            return d2;
        }
        d2 = new ResourceLocation(Cra.V, string4);
        ResourceLocation a322 = new ResourceLocation(Cra.V, string5);
        d2 = new BedrockModel(((ResourceLocation)d2).J(), a322.J());
        BedrockArmorLayer3D bedrockArmorLayer3D = b2;
        Object object = d2;
        Object object2 = d2;
        ((BedrockModel)object).J(new WS());
        ((BedrockModel)object).J(bedrockArmorLayer3D.alphaRender);
        Object object3 = d2;
        bedrockArmorLayer3D.cache.put(c2, (BedrockModel)object3);
        return object3;
    }
}

