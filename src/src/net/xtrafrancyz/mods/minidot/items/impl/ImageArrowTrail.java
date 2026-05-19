/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Js
 *  KT
 *  NTa
 *  UG
 *  dT
 *  jea
 *  qh
 *  sI
 *  ui
 *  vRa
 *  zU
 */
package net.xtrafrancyz.mods.minidot.items.impl;

import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.logging.log4j.Level;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ImageArrowTrail
implements MDModel {
    private final sI particleConfig;
    private final PG animationContext;
    private final UG texture;
    private final ResourceLocation textureLocation;

    public void J(float f2) {
        float b2 = f2;
        ImageArrowTrail a2 = this;
        a2.particleConfig.t = b2;
    }

    /*
     * WARNING - void declaration
     */
    public ImageArrowTrail(String string) {
        ImageArrowTrail imageArrowTrail;
        void a2;
        ImageArrowTrail imageArrowTrail2 = this;
        ImageArrowTrail imageArrowTrail3 = imageArrowTrail2;
        imageArrowTrail2.textureLocation = new ResourceLocation(Cra.V, (String)a2);
        imageArrowTrail3.particleConfig = new sI();
        ImageArrowTrail b2 = new qh(new StringBuilder().insert(3 >> 2, FRa.W).append(imageArrowTrail2.textureLocation).toString());
        try {
            ((qh)b2).C = KT.J((ResourceLocation)imageArrowTrail2.textureLocation);
            imageArrowTrail = imageArrowTrail2;
        }
        catch (Exception exception) {
            zU.L.log(Level.ERROR, new StringBuilder().insert(5 >> 3, dua.v).append(imageArrowTrail2.textureLocation).toString(), (Throwable)exception);
            imageArrowTrail = imageArrowTrail2;
            ((qh)b2).C = new byte[uSa.E];
        }
        imageArrowTrail.texture = zU.M.J().J((qh)b2, iu.J((String)a2));
        ImageArrowTrail imageArrowTrail4 = imageArrowTrail2;
        imageArrowTrail4.particleConfig.N = imageArrowTrail2.texture;
        imageArrowTrail4.particleConfig.u = Yqa.C;
        imageArrowTrail2.particleConfig.m = Yqa.C;
        imageArrowTrail4.particleConfig.i = Yqa.C;
        imageArrowTrail4.particleConfig.D = PRa.U;
        imageArrowTrail4.particleConfig.w = NTa.ia;
        imageArrowTrail4.particleConfig.e = vRa.d;
        imageArrowTrail4.animationContext = new PG(OT.e);
    }

    public static /* synthetic */ String J(String a2) {
        return new StringBuilder().insert(3 & 4, Bua.n).append(a2).toString();
    }

    public UG J() {
        ImageArrowTrail a2;
        return a2.texture;
    }

    public ui J() {
        ImageArrowTrail a2;
        ImageArrowTrail imageArrowTrail = a2;
        return imageArrowTrail.texture.J(imageArrowTrail.animationContext);
    }

    public void J(jea jea2) {
        ImageArrowTrail a2;
        ImageArrowTrail b2 = jea2;
        ImageArrowTrail imageArrowTrail = a2 = this;
        imageArrowTrail.particleConfig.x = (float)((jea)b2).la;
        imageArrowTrail.particleConfig.A = (float)((jea)b2).Z;
        imageArrowTrail.particleConfig.a = (float)((jea)b2).A;
        OT.i.H.J.f(new qI(a2.particleConfig, uSa.E));
    }

    @Override
    public void J(dT object) {
        ImageArrowTrail b2 = object;
        object = this;
    }

    @Override
    public Js J(String string) {
        String b2 = string;
        ImageArrowTrail a2 = this;
        throw new NotImplementedException(ppa.Z);
    }
}

