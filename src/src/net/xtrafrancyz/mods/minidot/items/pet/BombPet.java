/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  LQa
 *  Lqa
 *  MQa
 *  Oz
 *  Ppa
 *  TQa
 *  Usa
 *  YSa
 *  bRa
 *  bpa
 *  iPa
 *  kta
 *  lqa
 *  pqa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class BombPet
extends BasePet {
    private final Js Shape2;
    private final Js Shape10;
    private final Js Piece1;
    private final Js Shape11;
    private final Js Shape3;
    private final Js Shape1;
    private final Js Shape4;

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        BombPet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float b2 = Oz.C((float)(d2 * TOa.r));
        float f3 = Oz.d((float)(d2 * ZSa.q)) * Ora.D;
        uKa.J((float)ZSa.q, (float)(vPa.b + c2), (float)bpa.K);
        uKa.J((float)(b2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        uKa.l((float)Jsa.Z, (float)Jsa.Z, (float)Jsa.Z);
        BombPet bombPet = a2;
        bombPet.Piece1.rotationZ = d2 * PQa.T;
        bombPet.Shape4.rotationZ = a2.Piece1.rotationZ;
        a2.Shape10.rotationX = f3 + Ora.D;
        bombPet.Shape11.rotationX = -f3 + Ora.D;
    }

    public BombPet() {
        BombPet a2;
        BombPet bombPet = a2;
        bombPet.textureWidth = ysa.s;
        bombPet.textureHeight = fPa.i;
        bombPet.disableAnimationInPreview = vRa.d;
        bombPet.J(wta.r, uSa.E, osa.c);
        bombPet.J(TQa.T, uSa.E, osa.c);
        bombPet.J(ppa.Y, uSa.E, osa.c);
        bombPet.J(ATa.a, uSa.E, osa.c);
        bombPet.J(vQa.f, tTa.h, osa.c);
        BombPet bombPet2 = a2;
        bombPet.Shape1 = new Js((ModelBase)a2, uSa.E, uSa.E);
        bombPet.Shape1.J(JPa.N, JPa.N, JPa.N, uua.p, uua.p, uua.p);
        BombPet bombPet3 = a2;
        bombPet3.Shape1.J(TOa.p, JPa.N, TOa.p);
        a2.Shape2 = new Js((ModelBase)a2, uSa.E, lqa.s);
        bombPet3.Shape2.J(JPa.N, JPa.N, JPa.N, uqa.g, vRa.d, uqa.g);
        BombPet bombPet4 = a2;
        bombPet4.Shape2.J(vqa.T, vqa.T, vqa.T);
        a2.Shape3 = new Js((ModelBase)a2, Yqa.i, lqa.s);
        bombPet4.Shape3.J(vPa.b, TOa.p, Lqa.a, vRa.d, yRa.d, vRa.d);
        BombPet bombPet5 = a2;
        bombPet5.J(bombPet5.Shape3, bRa.fa, JPa.N, JPa.N);
        a2.Shape4 = new Js((ModelBase)a2, uSa.E, wOa.h);
        bombPet5.Shape4.J(vPa.b, vPa.b, MQa.L, vRa.d, vRa.d, vRa.d);
        BombPet bombPet6 = a2;
        bombPet6.Shape4.J(JPa.N, vQa.q, MTa.y);
        bombPet6.Shape4.J(vRa.d != 0);
        a2.Shape10 = new Js((ModelBase)a2, uSa.E, ERa.C);
        bombPet6.Shape10.J(JPa.N, JPa.N, TOa.p, uqa.g, uqa.g, yRa.d);
        BombPet bombPet7 = a2;
        bombPet7.Shape10.J(pqa.r, lqa.ga, JPa.N);
        bombPet7.J(bombPet7.Shape10, JPa.N, Qpa.v, JPa.N);
        bombPet7.Shape10.J(vRa.d != 0);
        bombPet7.Shape11 = new Js((ModelBase)a2, uSa.E, ERa.C);
        bombPet7.Shape11.J(dua.ca, JPa.N, TOa.p, uqa.g, uqa.g, yRa.d);
        BombPet bombPet8 = a2;
        bombPet8.Shape11.J(vqa.T, lqa.ga, JPa.N);
        bombPet8.J(bombPet8.Shape11, JPa.N, Bpa.A, JPa.N);
        bombPet8.Shape11.J(vRa.d != 0);
        bombPet8.Piece1 = new Js((ModelBase)a2, Usa.f);
        bombPet8.Piece1.J(JPa.N, vQa.q, YSa.G);
        bombPet8.Piece1.J(LQa.A, vPa.b, Ppa.Ha, JPa.N, vRa.d, tTa.h, vRa.d);
        a2.Piece1.J(iPa.g, vPa.b, Ppa.Ha, pqa.r, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Ata.q, vPa.b, vPa.b, pqa.r, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(QTa.w, vPa.b, Ira.d, pqa.r, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(vua.L, vPa.b, Ppa.Ha, kta.v, vRa.d, tTa.h, vRa.d);
        BombPet bombPet9 = a2;
        bombPet9.Piece1.J(vRa.d != 0);
        bombPet9.J(new ResourceLocation(Cra.V, vsa.q));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        BombPet a2 = this;
        uKa.J((float)JPa.N, (float)lTa.Z, (float)JPa.N);
        uKa.l((float)Ira.d, (float)Ira.d, (float)Ira.d);
        super.J(b2);
    }
}

