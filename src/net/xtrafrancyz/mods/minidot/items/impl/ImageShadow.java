/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ISa
 *  JPa
 *  Js
 *  KT
 *  Kh
 *  QSa
 *  TI
 *  UG
 *  dT
 *  hu
 *  ku
 *  pqa
 *  qh
 *  uKa
 *  ui
 *  vPa
 *  vRa
 *  vs
 *  zU
 */
package net.xtrafrancyz.mods.minidot.items.impl;

import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import org.apache.commons.lang3.NotImplementedException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ImageShadow
implements MDModel {
    private final String textureName;
    private final ResourceLocation textureLocation;
    private PG animationContext;
    private float alpha;
    private UG texture;
    private vs loadState;
    private float scale;

    public ImageShadow(String string) {
        ImageShadow a2;
        String b2 = string;
        ImageShadow imageShadow = a2 = this;
        a2.scale = pqa.r;
        a2.alpha = pqa.r;
        imageShadow.loadState = vs.NOT_LOADED;
        imageShadow.textureName = b2;
        ImageShadow imageShadow2 = a2;
        imageShadow.textureLocation = new ResourceLocation(Cra.V, b2);
    }

    private void J() throws Exception {
        ImageShadow a2;
        ImageShadow imageShadow = this;
        ImageShadow imageShadow2 = a2 = new qh(new StringBuilder().insert(3 & 4, FRa.W).append(imageShadow.textureLocation).toString());
        ((qh)imageShadow2).C = KT.J((ResourceLocation)imageShadow.textureLocation);
        ((qh)imageShadow2).A = uSa.E;
        ((qh)imageShadow2).i = TI.ENABLED;
        ((qh)imageShadow2).J = vRa.d;
        ((qh)imageShadow2).j = uSa.E;
        imageShadow.texture = zU.M.J().J((qh)a2, ku.J((ImageShadow)imageShadow));
        ImageShadow imageShadow3 = imageShadow;
        imageShadow3.animationContext = new PG(OT.e);
    }

    public float f() {
        ImageShadow a2;
        return a2.scale;
    }

    public static /* synthetic */ String J(ImageShadow a2) {
        return new StringBuilder().insert(2 & 5, QSa.q).append(a2.textureName).toString();
    }

    @Override
    public Js J(String string) {
        String b2 = string;
        ImageShadow a2 = this;
        throw new NotImplementedException(ppa.Z);
    }

    public void f(float f2) {
        float b2 = f2;
        ImageShadow a2 = this;
        a2.scale = b2;
    }

    @Override
    public void J(dT dT2) {
        ImageShadow b2 = dT2;
        ImageShadow a2 = this;
        if (!((dT)b2).pi.k) {
            return;
        }
        ImageShadow imageShadow = a2;
        b2 = imageShadow.J();
        if (!imageShadow.J()) {
            return;
        }
        uKa.L();
        uKa.C((int)((ui)b2).I);
        uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.m();
        uKa.J((float)JPa.N, (float)JPa.N, (float)XOa.b);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)xSa.la);
        ImageShadow imageShadow2 = b2;
        ImageShadow imageShadow3 = b2;
        Kh.J((float)(vPa.b * a2.scale), (float)(vPa.b * a2.scale), (float)(pqa.r * a2.scale), (float)(pqa.r * a2.scale), (float)((ui)imageShadow2).A, (float)((ui)imageShadow2).j, (float)((ui)imageShadow3).k, (float)((ui)imageShadow3).J);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.h();
    }

    public ui J() {
        ImageShadow imageShadow;
        ImageShadow imageShadow2 = this;
        switch (hu.$SwitchMap$net$xtrafrancyz$mods$minidot$items$impl$ImageShadow$LoadState[imageShadow2.loadState.ordinal()]) {
            case 1: {
                try {
                    while (false) {
                    }
                    imageShadow2.J();
                    imageShadow2.loadState = vs.LOADED;
                    imageShadow = imageShadow2;
                    break;
                }
                catch (Exception a2) {
                    imageShadow2.loadState = vs.FAILED;
                    zU.L.error(new StringBuilder().insert(3 ^ 3, Jta.Ka).append(imageShadow2.textureLocation).toString(), (Throwable)a2);
                    return ui.M;
                }
            }
            case 2: {
                return ui.M;
            }
            default: {
                imageShadow = imageShadow2;
            }
        }
        return imageShadow.texture.J(imageShadow2.animationContext);
    }

    public float J() {
        ImageShadow a2;
        return a2.alpha;
    }

    public void J(float f2) {
        float b2 = f2;
        ImageShadow a2 = this;
        a2.alpha = b2;
    }

    public boolean J() {
        ImageShadow a2;
        if (a2.texture == null || a2.texture.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

