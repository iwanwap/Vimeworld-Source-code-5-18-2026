/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  TQa
 *  YSa
 *  Yfa
 *  pqa
 *  vRa
 */
import net.minecraft.block.Block;

public abstract class KDa_3
extends Yfa {
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2, float f3) {
        float f4;
        void a2;
        KDa_3 kDa_3;
        float c2 = f2;
        KDa_3 b2 = this;
        if (b2.L()) {
            KDa_3 kDa_32 = b2;
            kDa_3 = kDa_32;
            kDa_32.J(c2, (float)a2, WRa.e);
            KDa_3 kDa_33 = b2;
            kDa_33.J(kDa_32.i, kDa_33.Ea, b2.f);
            kDa_32.f(kDa_32.i * GPa.fa);
            kDa_32.J(kDa_32.Ea * GPa.fa);
            kDa_32.l(kDa_32.f * GPa.fa);
        } else if (b2.H()) {
            KDa_3 kDa_34 = b2;
            kDa_3 = kDa_34;
            kDa_34.J(c2, (float)a2, WRa.e);
            KDa_3 kDa_35 = b2;
            kDa_35.J(kDa_34.i, kDa_35.Ea, b2.f);
            kDa_34.f(kDa_34.i * kTa.B);
            kDa_34.J(kDa_34.Ea * kTa.B);
            kDa_34.l(kDa_34.f * kTa.B);
        } else {
            float f5 = XOa.v;
            if (b2.ha) {
                f5 = b2.j.J((XF)new XF((int)Oz.f((double)b2.la), (int)(Oz.f((double)b2.J().j) - vRa.d), (int)Oz.f((double)b2.A))).J().slipperiness.J() * XOa.v;
            }
            float f6 = f5;
            float f7 = TQa.i / (f6 * f6 * f5);
            KDa_3 kDa_36 = b2;
            kDa_36.J(c2, (float)a2, kDa_36.ha ? Nra.e * f7 : WRa.e);
            f5 = XOa.v;
            if (b2.ha) {
                f5 = b2.j.J((XF)new XF((int)Oz.f((double)b2.la), (int)(Oz.f((double)b2.J().j) - vRa.d), (int)Oz.f((double)b2.A))).J().slipperiness.J() * XOa.v;
            }
            KDa_3 kDa_37 = b2;
            kDa_3 = kDa_37;
            KDa_3 kDa_38 = b2;
            kDa_38.J(kDa_37.i, kDa_38.Ea, b2.f);
            kDa_37.f(kDa_37.i * (double)f5);
            kDa_37.J(kDa_37.Ea * (double)f5);
            kDa_37.l(kDa_37.f * (double)f5);
        }
        kDa_3.z = b2.U;
        KDa_3 kDa_39 = b2;
        double d2 = b2.la - kDa_39.c;
        double d3 = kDa_39.A - b2.r;
        double d4 = d2;
        double d5 = d3;
        c2 = Oz.J((double)(d4 * d4 + d5 * d5)) * YSa.G;
        if (f4 > pqa.r) {
            c2 = pqa.r;
        }
        KDa_3 kDa_310 = b2;
        kDa_310.U += (c2 - b2.U) * Xpa.R;
        kDa_310.E += b2.U;
    }

    public void J(double d2, boolean bl2, Block block, XF xF2) {
        KDa_3 kDa_3 = object;
        Object object = xF2;
        KDa_3 a2 = kDa_3;
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        KDa_3 kDa_3 = this;
    }

    public KDa_3(Gg gg2) {
        KDa_3 b2 = gg2;
        KDa_3 a2 = this;
        super((Gg)b2);
    }
}

