/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  EQa
 *  ERa
 *  Gg
 *  MQa
 *  Mda
 *  QFa
 *  TQa
 *  Tz
 *  UZ
 *  Yra
 *  aSa
 *  eAa
 *  lqa
 *  tDa
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.state.IBlockState;

public final class Bfa
extends eAa {
    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        void b2;
        Bfa a2 = this;
        Object d2 = sx2;
        Object object = a2.J((Gg)b2, (Sx)((Object)d2), uSa.E != 0);
        if (object != null && object.A == AY.BLOCK && b2.J(object.J()).J() == QFa.jE) {
            return c2;
        }
        if (!b2.e && (object = b2.J(zpa.d, new XF((vL)d2))) != null) {
            tDa tDa2 = new tDa((Gg)b2, ((Sx)((Object)d2)).la, (double)((Sx)((Object)d2)).Z, (double)((Sx)((Object)d2)).A);
            tDa2.f((XF)((Object)object));
            void v0 = b2;
            b2.f((vL)tDa2);
            v0.J((vL)d2, EQa.R, MQa.L, Xpa.R / (M.nextFloat() * Xpa.R + xSa.la));
            v0.J((Sx)null, TQa.a, new XF((vL)d2), uSa.E);
            if (!((Sx)((Object)d2)).h.f()) {
                c2.E -= vRa.d;
            }
            ((Sx)((Object)d2)).J(Tz.H[eAa.J((eAa)a2)]);
        }
        return c2;
    }

    public Bfa() {
        Bfa a2;
        Bfa bfa = a2;
        bfa.J(yGa.g);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void d2;
        void g;
        void e2;
        void f5;
        Bfa i222 = mda2;
        Bfa h = this;
        IBlockState c2 = f5.J((XF)e2);
        if (g.J(e2.offset((DZ)d2), (DZ)d2, (Mda)i222) && c2.J() == QFa.jE && !c2.J(BlockEndPortalFrame.EYE).booleanValue()) {
            int n2;
            Object object;
            DZ dZ3;
            int n3;
            int n4;
            int n5;
            DZ i222;
            block16: {
                int n6;
                if (f5.e) {
                    return vRa.d != 0;
                }
                f5.J((XF)e2, c2.J(BlockEndPortalFrame.EYE, vRa.d != 0), uqa.g);
                f5.J((XF)e2, QFa.jE);
                ((Mda)i222).E -= vRa.d;
                int i222 = uSa.E;
                int n7 = i222;
                while (n7 < ERa.C) {
                    void v1 = e2;
                    double d3 = (float)v1.getX() + (eua.C + M.nextFloat() * lqa.ga) / Yra.i;
                    double d4 = (float)v1.getY() + rta.R;
                    double d5 = (float)v1.getZ() + (eua.C + M.nextFloat() * lqa.ga) / Yra.i;
                    double d6 = aSa.V;
                    double d7 = aSa.V;
                    double d8 = aSa.V;
                    int n8 = 2 ^ 3;
                    f5.J(UZ.SMOKE_NORMAL, d3, d4, d5, d6, d7, d8, new int[uSa.E]);
                    n7 = ++i222;
                }
                i222 = c2.J(BlockEndPortalFrame.FACING);
                n5 = uSa.E;
                n4 = uSa.E;
                int n9 = uSa.E;
                n3 = vRa.d;
                dZ3 = i222.rotateY();
                int n10 = n6 = rQa.p;
                while (n10 <= uqa.g) {
                    XF xF2 = e2.offset(dZ3, n6);
                    object = f5.J(xF2);
                    if (object.J() == QFa.jE) {
                        if (!object.J(BlockEndPortalFrame.EYE).booleanValue()) {
                            n2 = n3 = uSa.E;
                            break block16;
                        }
                        n4 = n6;
                        if (n9 == 0) {
                            n5 = n6;
                            n9 = vRa.d;
                        }
                    }
                    n10 = ++n6;
                }
                n2 = n3;
            }
            if (n2 != 0 && n4 == n5 + uqa.g) {
                int n11;
                int n12;
                XF xF3;
                block17: {
                    xF3 = e2.offset(i222, AQa.P);
                    int n13 = n12 = n5;
                    while (n13 <= n4) {
                        object = xF3.offset(dZ3, n12);
                        IBlockState iBlockState = f5.J((XF)((Object)object));
                        if (iBlockState.J() != QFa.jE || !iBlockState.J(BlockEndPortalFrame.EYE).booleanValue()) {
                            n3 = uSa.E;
                            n11 = n5;
                            break block17;
                        }
                        n13 = ++n12;
                    }
                    n11 = n5;
                }
                int n14 = n12 = n11 - vRa.d;
                while (n14 <= n4 + vRa.d) {
                    xF3 = e2.offset(dZ3, n12);
                    int n15 = vRa.d;
                    while (n15 <= yRa.d) {
                        int n16;
                        XF xF4 = xF3.offset(i222, n16);
                        IBlockState iBlockState = f5.J(xF4);
                        if (iBlockState.J() != QFa.jE || !iBlockState.J(BlockEndPortalFrame.EYE).booleanValue()) {
                            n3 = uSa.E;
                            break;
                        }
                        n15 = ++n16;
                    }
                    n14 = n12 += 4;
                }
                if (n3 != 0) {
                    int n17 = n12 = n5;
                    while (n17 <= n4) {
                        xF3 = e2.offset(dZ3, n12);
                        int n18 = vRa.d;
                        while (n18 <= yRa.d) {
                            int n19;
                            XF xF5 = xF3.offset(i222, n19);
                            f5.J(xF5, QFa.mc.J(), uqa.g);
                            n18 = ++n19;
                        }
                        n17 = ++n12;
                    }
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

