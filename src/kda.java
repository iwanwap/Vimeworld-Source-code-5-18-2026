/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  MQa
 *  Mda
 *  NTa
 *  OCa
 *  QFa
 *  Waa
 *  eAa
 *  kta
 *  pqa
 *  uOa
 *  uY
 *  vL
 *  vRa
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kda
extends eAa {
    public final Block I;

    public kda(Block block) {
        Object b2 = block;
        kda a2 = this;
        a2.I = b2;
    }

    public yGa J() {
        kda a2;
        return a2.I.J();
    }

    public Block J() {
        kda a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Gg gg2, Sx sx2, XF xF, Mda mda2) {
        void b2;
        uY uY2;
        Waa a2;
        Object d2 = sx2;
        Gg c2 = gg2;
        OCa oCa2 = OCa.J();
        if (oCa2 == null) {
            return uSa.E != 0;
        }
        if (a2.M() && a2.J().J(uua.M, NTa.C) && (uY2 = c2.J((XF)b2)) != null) {
            if (!c2.e && uY2.C() && !oCa2.J().f(((Sx)((Object)d2)).J())) {
                return uSa.E != 0;
            }
            d2 = new Waa();
            oCa2 = (Waa)d2.J();
            uY2.J((Waa)d2);
            a2 = (Waa)a2.J().J(uua.M);
            Object object = d2;
            Object object2 = d2;
            object2.J(a2);
            object2.J(rRa.X, b2.getX());
            object.J(uOa.Ja, b2.getY());
            object.J(oua.v, b2.getZ());
            if (!object.equals((Object)oCa2)) {
                uY uY3 = uY2;
                uY3.f((Waa)d2);
                uY3.f();
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public kda J(String string) {
        kda a2;
        Object b2 = string;
        kda kda2 = a2 = this;
        super.f((String)b2);
        return kda2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF, DZ dZ2, Sx sx2, Mda mda2) {
        void a2;
        void v0;
        DZ c2;
        void e2;
        Object f2 = xF;
        kda d2 = this;
        Block b2 = e2.J((XF)((Object)f2)).J();
        if (b2 == QFa.gC) {
            c2 = DZ.UP;
            v0 = e2;
        } else {
            if (!b2.f((Gg)e2, (XF)((Object)f2))) {
                f2 = ((XF)((Object)f2)).offset(c2);
            }
            v0 = e2;
        }
        return v0.J(d2.I, (XF)((Object)f2), uSa.E != 0, c2, (vL)null, (Mda)a2);
    }

    public String J() {
        kda a2;
        return a2.I.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void b2;
        void c2;
        Object d2 = list;
        kda a2 = this;
        a2.I.J((eAa)c2, (yGa)b2, (List<Mda>)d2);
    }

    public String C(Mda mda2) {
        kda b2 = mda2;
        kda a2 = this;
        return a2.I.J();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void h2;
        IBlockState d2;
        Object i2;
        void f5;
        kda kda2 = object;
        Object object = xF;
        kda e2 = kda2;
        if (!f5.J((XF)((Object)i2)).J().f((Gg)f5, (XF)((Object)i2))) {
            i2 = ((XF)((Object)i2)).offset((DZ)((Object)d2));
        }
        if (h2.E == 0) {
            return uSa.E != 0;
        }
        if (!g2.J((XF)((Object)i2), (DZ)((Object)d2), (Mda)h2)) {
            return uSa.E != 0;
        }
        if (f5.J(e2.I, (XF)((Object)i2), uSa.E != 0, (DZ)((Object)d2), (vL)null, (Mda)h2)) {
            void a2;
            void b2;
            void c2;
            kda kda3 = e2;
            int n2 = kda3.J(h2.J());
            if (f5.J((XF)((Object)i2), d2 = kda3.I.J((Gg)f5, (XF)((Object)i2), (DZ)((Object)d2), (float)c2, (float)b2, (float)a2, n2, (Gl)g2), yRa.d)) {
                d2 = f5.J((XF)((Object)i2));
                if (d2.J() == e2.I) {
                    kda.J((Gg)f5, (Sx)g2, (XF)((Object)i2), (Mda)h2);
                    e2.I.J((Gg)f5, (XF)((Object)i2), d2, (Gl)g2, (Mda)h2);
                }
                f5.J((double)((float)i2.getX() + MQa.L), (double)((float)i2.getY() + MQa.L), (double)((float)i2.getZ() + MQa.L), e2.I.stepSound.f(), (e2.I.stepSound.f() + pqa.r) / kta.v, e2.I.stepSound.J() * xSa.la);
                h2.E -= vRa.d;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

