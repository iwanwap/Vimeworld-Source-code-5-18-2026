/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  C
 *  Cra
 *  Js
 *  Kpa
 *  Ks
 *  aJa
 *  dT
 *  pua
 *  vRa
 */
package net.xtrafrancyz.mods.minidot.items.impl;

import java.io.IOException;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import org.apache.commons.lang3.NotImplementedException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ImageArmorLayer
implements MDModel {
    private final String textureLayer2Format;
    private final String textureLayer1Format;

    public int f(String string, String string2) {
        ResourceLocation b2;
        String c2 = string2;
        ImageArmorLayer a2 = this;
        String string3 = c2 != null && !c2.isEmpty() ? new StringBuilder().insert(3 >> 2, IPa.W).append(c2).toString() : Mqa.y;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2;
        objectArray[vRa.d] = string3;
        b2 = new ResourceLocation(Cra.V, String.format(a2.textureLayer1Format, objectArray));
        if (!ImageArmorLayer.J(b2)) {
            return pua.o;
        }
        return ImageArmorLayer.J(b2);
    }

    private static int J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        aJa aJa2 = Kpa.J().J();
        Object a2 = aJa2.J(resourceLocation2);
        if (a2 == null) {
            Ks ks2 = new Ks(resourceLocation2);
            a2 = ks2;
            aJa2.J(resourceLocation2, (H)a2);
            if (ks2.J()) {
                aJa2.J((C)ks2);
            }
        }
        if (a2 != null) {
            return a2.J();
        }
        return pua.o;
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

    public int J(String string, String string2) {
        ResourceLocation b2;
        String c2 = string2;
        ImageArmorLayer a2 = this;
        String string3 = c2 != null && !c2.isEmpty() ? new StringBuilder().insert(5 >> 3, IPa.W).append(c2).toString() : Mqa.y;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2;
        objectArray[vRa.d] = string3;
        b2 = new ResourceLocation(Cra.V, String.format(a2.textureLayer2Format, objectArray));
        if (!ImageArmorLayer.J(b2)) {
            return pua.o;
        }
        return ImageArmorLayer.J(b2);
    }

    @Override
    public Js J(String string) {
        String b2 = string;
        ImageArmorLayer a2 = this;
        throw new NotImplementedException(ppa.Z);
    }

    /*
     * WARNING - void declaration
     */
    public ImageArmorLayer(String string, String string2) {
        void b2;
        ImageArmorLayer a2;
        String c2 = string2;
        ImageArmorLayer imageArmorLayer = a2 = this;
        imageArmorLayer.textureLayer1Format = b2;
        imageArmorLayer.textureLayer2Format = c2;
    }

    @Override
    public void J(dT object) {
        ImageArmorLayer b2 = object;
        object = this;
    }
}

