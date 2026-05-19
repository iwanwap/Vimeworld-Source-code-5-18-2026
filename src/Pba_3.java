/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Ey
 *  Gg
 *  Gl
 *  JPa
 *  Lqa
 *  Mda
 *  Oz
 *  PIa
 *  QFa
 *  Tpa
 *  Tz
 *  Wsa
 *  Yfa
 *  aSa
 *  eAa
 *  oA
 *  uY
 *  vL
 *  vRa
 */
import java.util.List;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;

public final class Pba_3
extends eAa {
    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void a2;
        vL b2;
        Pba_3 d2 = mda2;
        Pba_3 c2 = this;
        if (b2.e) {
            return d2;
        }
        RY rY2 = c2.J((Gg)b2, (Sx)a2, vRa.d != 0);
        if (rY2 == null) {
            return d2;
        }
        if (rY2.A == AY.BLOCK) {
            XF xF2 = rY2.J();
            if (!b2.J((Sx)a2, xF2)) {
                return d2;
            }
            if (!a2.J(xF2, rY2.j, (Mda)d2)) {
                return d2;
            }
            if (b2.J(xF2).J() instanceof BlockLiquid && (b2 = Pba_3.J((Gg)b2, d2.J(), (double)xF2.getX() + kTa.B, (double)xF2.getY() + kTa.B, (double)xF2.getZ() + kTa.B)) != null) {
                if (b2 instanceof Gl && d2.l()) {
                    ((Yfa)b2).J(d2.J());
                }
                if (!a2.h.f()) {
                    ((Mda)d2).E -= vRa.d;
                }
                a2.J(Tz.H[eAa.J((eAa)c2)]);
            }
        }
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mda mda2, int n2) {
        Object c2 = mda2;
        Pba_3 b2 = this;
        if ((c2 = (oia)PIa.k.get(c2.J())) != null) {
            void a2;
            if (a2 == false) {
                return ((oia)c2).J;
            }
            return ((oia)c2).A;
        }
        return Wsa.K;
    }

    public String l(Mda mda2) {
        String a2;
        Pba_3 pba_3 = this;
        Object b2 = new StringBuilder().insert(3 >> 2, Mqa.y).append(Ey.f((String)new StringBuilder().insert(3 ^ 3, pba_3.J()).append(tpa.N).toString())).toString().trim();
        if ((a2 = PIa.J((int)a2.J())) != null) {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(Tpa.E).append(Ey.f((String)new StringBuilder().insert(2 & 5, Lqa.H).append(a2).append(tpa.N).toString())).toString();
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static vL J(Gg gg2, int n2, double d2, double d3, double d4) {
        int n3;
        void d5;
        Gg gg3 = gg2;
        if (!PIa.k.containsKey((int)d5)) {
            return null;
        }
        Gg e2 = null;
        int n4 = n3 = uSa.E;
        while (n4 < vRa.d) {
            e2 = PIa.J((int)d5, (Gg)gg3);
            if (e2 instanceof Gl) {
                void a2;
                void b2;
                void c2;
                Yfa yfa2 = (Yfa)e2;
                e2.f((double)c2, (double)b2, (double)a2, Oz.f((float)(gg3.v.nextFloat() * CRa.ja)), JPa.N);
                Yfa yfa3 = yfa2;
                yfa2.t = yfa2.X;
                yfa3.ba = yfa3.X;
                Gg gg4 = gg3;
                yfa3.J(gg3.J(new XF((vL)yfa2)), (oA)null);
                gg3.f((vL)e2);
                yfa2.S();
            }
            n4 = ++n3;
        }
        return e2;
    }

    public Pba_3() {
        Pba_3 a2;
        Pba_3 pba_3 = a2;
        pba_3.J(vRa.d != 0);
        a2.J(yGa.g);
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        Object d2 = yGa2;
        Pba_3 b2 = this;
        d2 = PIa.k.values().iterator();
        Object object = d2;
        while (object.hasNext()) {
            void c2;
            void a2;
            oia oia2 = (oia)d2.next();
            object = d2;
            a2.add(new Mda((eAa)c2, vRa.d, oia2.j));
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        uY uY2;
        void h2;
        void d2;
        Object i2;
        void g2;
        vL f5;
        Pba_3 pba_3 = object;
        Object object = xF2;
        Pba_3 e2 = pba_3;
        if (f5.e) {
            return vRa.d != 0;
        }
        if (!g2.J(((XF)((Object)i2)).offset((DZ)d2), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        IBlockState c2 = f5.J((XF)((Object)i2));
        if (c2.J() == QFa.P && (uY2 = f5.J((XF)((Object)i2))) instanceof Caa) {
            ((Caa)uY2).J().J(PIa.J((int)h2.J()));
            uY2.f();
            f5.C((XF)((Object)i2));
            if (!g2.h.f()) {
                h2.E -= vRa.d;
            }
            return vRa.d != 0;
        }
        i2 = ((XF)((Object)i2)).offset((DZ)d2);
        double d3 = aSa.V;
        if (d2 == DZ.UP && c2 instanceof BlockFence) {
            d3 = kTa.B;
        }
        if ((f5 = Pba_3.J((Gg)f5, h2.J(), (double)i2.getX() + kTa.B, (double)i2.getY() + d3, (double)i2.getZ() + kTa.B)) != null) {
            if (f5 instanceof Gl && h2.l()) {
                f5.J(h2.J());
            }
            if (!g2.h.f()) {
                h2.E -= vRa.d;
            }
        }
        return vRa.d != 0;
    }
}

