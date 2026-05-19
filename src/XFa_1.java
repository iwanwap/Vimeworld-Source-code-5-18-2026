/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Gg
 *  MQa
 *  Mda
 *  QFa
 *  Tz
 *  UZ
 *  Zpa
 *  aSa
 *  bRa
 *  eAa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class XFa_1
extends eAa {
    private Block I;

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        void b2;
        XFa_1 a2 = this;
        Object d2 = sx2;
        int n2 = a2.I == QFa.HF ? vRa.d : uSa.E;
        RY rY2 = a2.J((Gg)b2, (Sx)((Object)d2), n2 != 0);
        if (rY2 == null) {
            return c2;
        }
        if (rY2.A == AY.BLOCK) {
            XF xF2 = rY2.J();
            if (!b2.J((Sx)((Object)d2), xF2)) {
                return c2;
            }
            if (n2 != 0) {
                if (!((Sx)((Object)d2)).J(xF2.offset(rY2.j), rY2.j, (Mda)c2)) {
                    return c2;
                }
                IBlockState iBlockState = b2.J(xF2);
                Material material = iBlockState.J().J();
                if (material == Material.water && iBlockState.J(BlockLiquid.LEVEL) == 0) {
                    b2.G(xF2);
                    ((Sx)((Object)d2)).J(Tz.H[eAa.J((eAa)a2)]);
                    return a2.J((Mda)c2, (Sx)((Object)d2), Gea.Ba);
                }
                if (material == Material.lava && iBlockState.J(BlockLiquid.LEVEL) == 0) {
                    b2.G(xF2);
                    ((Sx)((Object)d2)).J(Tz.H[eAa.J((eAa)a2)]);
                    return a2.J((Mda)c2, (Sx)((Object)d2), Gea.eb);
                }
            } else {
                if (a2.I == QFa.HF) {
                    return new Mda(Gea.Ca);
                }
                XF xF3 = xF2.offset(rY2.j);
                if (!((Sx)((Object)d2)).J(xF3, rY2.j, (Mda)c2)) {
                    return c2;
                }
                if (a2.J((Gg)b2, xF3) && !((Sx)((Object)d2)).h.f()) {
                    ((Sx)((Object)d2)).J(Tz.H[eAa.J((eAa)a2)]);
                    return new Mda(Gea.Ca);
                }
            }
        }
        return c2;
    }

    public XFa_1(Block block) {
        Object b2 = block;
        XFa_1 a2 = this;
        a2.i = vRa.d;
        a2.I = b2;
        a2.J(yGa.g);
    }

    /*
     * WARNING - void declaration
     */
    private Mda J(Mda mda2, Sx sx2, eAa eAa2) {
        void c2;
        void b2;
        XFa_1 d2 = eAa2;
        XFa_1 a2 = this;
        if (b2.h.f()) {
            return c2;
        }
        if ((c2.E -= vRa.d) <= 0) {
            return new Mda((eAa)d2);
        }
        if (!b2.K.f(new Mda((eAa)d2))) {
            b2.J(new Mda((eAa)d2, vRa.d, uSa.E), uSa.E != 0);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2) {
        int n2;
        void a2;
        XFa_1 c2 = gg2;
        XFa_1 b2 = this;
        if (b2.I == QFa.HF) {
            return uSa.E != 0;
        }
        Material material = c2.J((XF)a2).J().J();
        int n3 = n2 = !material.i() ? vRa.d : uSa.E;
        if (!c2.J((XF)a2) && n2 == 0) {
            return uSa.E != 0;
        }
        if (((Gg)c2).F.C() && b2.I == QFa.jd) {
            int n4;
            void v1 = a2;
            int n5 = v1.getX();
            int n6 = v1.getY();
            int n7 = v1.getZ();
            c2.J((float)n5 + MQa.L, (float)n6 + MQa.L, (float)n7 + MQa.L, bRa.T, MQa.L, Zpa.o + (((Gg)c2).v.nextFloat() - ((Gg)c2).v.nextFloat()) * xSa.la);
            int n8 = n4 = uSa.E;
            while (n8 < Yqa.i) {
                int n9 = 4 ^ 5;
                c2.J(UZ.SMOKE_LARGE, (double)n5 + Math.random(), (double)n6 + Math.random(), (double)n7 + Math.random(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n8 = ++n4;
            }
        } else {
            if (!((Gg)c2).e && n2 != 0 && !material.l()) {
                c2.f((XF)a2, vRa.d != 0);
            }
            c2.J((XF)a2, b2.I.J(), yRa.d);
        }
        return vRa.d != 0;
    }
}

