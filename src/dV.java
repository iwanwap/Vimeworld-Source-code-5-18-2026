/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  TV
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  Ypa
 *  Zta
 *  lW
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockEndPortalFrame;

public final class dV
extends Wv {
    private boolean hasSpawner;

    public void J(uU uU2, List<uU> list, Random random) {
        Object d2 = uU2;
        dV c2 = this;
        if (d2 != null) {
            ((lW)d2).strongholdPortalRoom = c2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(Gg var1_1, Random var2_2, Xv var3_3) {
        d = var3_3;
        v0 = a = this;
        v1 = c;
        v2 = a;
        v3 = c;
        v4 = a;
        v5 = c;
        v6 = a;
        v7 = c;
        a.J((Gg)v7, (Xv)d, uSa.E, uSa.E, uSa.E, NTa.C, XTa.W, Ypa.A, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v6.J((Gg)v7, (Random)b, (Xv)d, nw.GRATES, AQa.P, vRa.d, uSa.E);
        v8 = var4_4 = uua.p;
        v6.J((Gg)c, (Xv)d, vRa.d, v8, vRa.d, vRa.d, v8, hpa.Z, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v9 = var4_4;
        a.J((Gg)v5, (Xv)d, WOa.fa, v9, vRa.d, WOa.fa, v9, hpa.Z, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v10 = var4_4;
        v4.J((Gg)v5, (Xv)d, uqa.g, v10, vRa.d, Yqa.i, v10, uqa.g, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v11 = var4_4;
        v4.J((Gg)c, (Xv)d, uqa.g, v11, hpa.Z, Yqa.i, v11, hpa.Z, (boolean)uSa.E, (Random)b, (ww)LV.J());
        a.J((Gg)v3, (Xv)d, vRa.d, vRa.d, vRa.d, uqa.g, vRa.d, AQa.P, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v2.J((Gg)v3, (Xv)d, Yqa.i, vRa.d, vRa.d, WOa.fa, vRa.d, AQa.P, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v2.J((Gg)c, (Xv)d, vRa.d, vRa.d, vRa.d, vRa.d, vRa.d, yRa.d, QFa.fA.J(), QFa.fA.J(), (boolean)uSa.E);
        a.J((Gg)v1, (Xv)d, WOa.fa, vRa.d, vRa.d, WOa.fa, vRa.d, yRa.d, QFa.fA.J(), QFa.fA.J(), (boolean)uSa.E);
        v0.J((Gg)v1, (Xv)d, yRa.d, vRa.d, Yqa.i, XTa.W, vRa.d, lqa.s, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v0.J((Gg)c, (Xv)d, AQa.P, vRa.d, WOa.fa, uua.p, vRa.d, pPa.f, QFa.fA.J(), QFa.fA.J(), (boolean)uSa.E);
        v12 = var5_5 = yRa.d;
        while (v12 < hpa.Z) {
            v13 = a;
            v14 = var5_5;
            v13.J((Gg)c, (Xv)d, uSa.E, yRa.d, v14, uSa.E, AQa.P, v14, QFa.u.J(), QFa.u.J(), (boolean)uSa.E);
            v15 = var5_5;
            v13.J((Gg)c, (Xv)d, NTa.C, yRa.d, v15, NTa.C, AQa.P, v15, QFa.u.J(), QFa.u.J(), (boolean)uSa.E);
            v12 = var5_5 += 2;
        }
        v16 = var5_5 = uqa.g;
        while (v16 < WOa.fa) {
            v17 = var5_5;
            a.J((Gg)c, (Xv)d, v17, yRa.d, Ypa.A, v17, AQa.P, Ypa.A, QFa.u.J(), QFa.u.J(), (boolean)uSa.E);
            v16 = var5_5 += 2;
        }
        v18 = a;
        v19 = c;
        v20 = a;
        var5_5 = v20.J(QFa.E, yRa.d);
        v20.J((Gg)c, (Xv)d, AQa.P, vRa.d, tTa.h, uua.p, vRa.d, XTa.W, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v18.J((Gg)v19, (Xv)d, AQa.P, uqa.g, uua.p, uua.p, uqa.g, XTa.W, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v18.J((Gg)v19, (Xv)d, AQa.P, yRa.d, XTa.W, uua.p, yRa.d, XTa.W, (boolean)uSa.E, (Random)b, (ww)LV.J());
        v21 = var6_6 = AQa.P;
        while (v21 <= uua.p) {
            v22 = a;
            v23 = c;
            a.f((Gg)v23, QFa.E.J(var5_5), var6_6, vRa.d, AQa.P, (Xv)d);
            v22.f((Gg)v23, QFa.E.J(var5_5), var6_6, uqa.g, tTa.h, (Xv)d);
            v22.f((Gg)c, QFa.E.J(var5_5), var6_6++, yRa.d, uua.p, (Xv)d);
            v21 = var6_6;
        }
        var6_6 = DZ.NORTH.getHorizontalIndex();
        var5_5 = DZ.SOUTH.getHorizontalIndex();
        var7_7 = DZ.EAST.getHorizontalIndex();
        var8_8 = DZ.WEST.getHorizontalIndex();
        if (a.coordBaseMode == null) ** GOTO lbl-1000
        switch (TV.$SwitchMap$net$minecraft$util$EnumFacing[a.coordBaseMode.ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                var6_6 = DZ.SOUTH.getHorizontalIndex();
                var5_5 = DZ.NORTH.getHorizontalIndex();
                v24 = a;
                break;
            }
            case 2: {
                var6_6 = DZ.WEST.getHorizontalIndex();
                var5_5 = DZ.EAST.getHorizontalIndex();
                var7_7 = DZ.SOUTH.getHorizontalIndex();
                var8_8 = DZ.NORTH.getHorizontalIndex();
                v24 = a;
                break;
            }
            case 3: {
                var6_6 = DZ.EAST.getHorizontalIndex();
                var5_5 = DZ.WEST.getHorizontalIndex();
                var7_7 = DZ.SOUTH.getHorizontalIndex();
                var8_8 = DZ.NORTH.getHorizontalIndex();
            }
            default: lbl-1000:
            // 2 sources

            {
                v24 = a;
            }
        }
        v24.f((Gg)c, QFa.jE.J(var6_6).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), AQa.P, yRa.d, Yqa.i, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var6_6).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), tTa.h, yRa.d, Yqa.i, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var6_6).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), uua.p, yRa.d, Yqa.i, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var5_5).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), AQa.P, yRa.d, lqa.s, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var5_5).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), tTa.h, yRa.d, lqa.s, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var5_5).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), uua.p, yRa.d, lqa.s, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var7_7).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), yRa.d, yRa.d, WOa.fa, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var7_7).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), yRa.d, yRa.d, NTa.C, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var7_7).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), yRa.d, yRa.d, pPa.f, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var8_8).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), XTa.W, yRa.d, WOa.fa, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var8_8).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), XTa.W, yRa.d, NTa.C, (Xv)d);
        a.f((Gg)c, QFa.jE.J(var8_8).J(BlockEndPortalFrame.EYE, (boolean)(b.nextFloat() > ATa.r ? vRa.d : uSa.E)), XTa.W, yRa.d, pPa.f, (Xv)d);
        if (!a.hasSpawner) {
            var4_4 = a.J(yRa.d);
            b = new XF(a.J(tTa.h, uua.p), var4_4, a.f(tTa.h, uua.p));
            if (d.J(b)) {
                a.hasSpawner = vRa.d;
                c.J(b, QFa.P.J(), uqa.g);
                c = c.J(b);
                if (c instanceof Caa) {
                    ((Caa)c).J().J(kra.n);
                }
            }
        }
        return (boolean)vRa.d;
    }

    public dV() {
        dV a2;
    }

    public void J(Waa waa2) {
        dV b2 = waa2;
        dV a2 = this;
        super.J((Waa)b2);
        a2.hasSpawner = b2.f(Zta.ia);
    }

    /*
     * WARNING - void declaration
     */
    public dV(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        dV a2;
        dV dV2 = object;
        Object object = dZ2;
        dV dV3 = a2 = dV2;
        super((int)d2);
        dV3.coordBaseMode = e2;
        dV3.boundingBox = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static dV J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pta.a, (int)pua.o, (int)uSa.E, (int)pPa.f, (int)Yqa.i, (int)ERa.C, (DZ)b2);
        if (dV.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new dV((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    public void f(Waa waa2) {
        dV b2 = waa2;
        dV a2 = this;
        dV dV2 = b2;
        super.f((Waa)dV2);
        dV2.J(Zta.ia, a2.hasSpawner);
    }
}

