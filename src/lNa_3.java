/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  I
 *  Kpa
 *  NQa
 *  QFa
 *  YSa
 *  Yra
 *  aKa
 *  kta
 *  lNa
 *  pqa
 *  ska
 *  vL
 *  vRa
 *  yQa
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lNa_3
extends ska {
    private IBlockState A;
    private XF I;

    public lNa J(XF xF2) {
        Object b22 = xF2;
        lNa_3 a2 = this;
        a2.I = b22;
        if (a2.A.J() == QFa.lf) {
            return a2;
        }
        lNa_3 lNa_32 = a2;
        lNa_3 lNa_33 = a2;
        int b22 = lNa_32.A.J().J((I)lNa_33.j, (XF)((Object)b22));
        lNa_32.l *= (float)(b22 >> ERa.C & osa.Ja) / NQa.Y;
        lNa_33.a *= (float)(b22 >> Yqa.i & osa.Ja) / NQa.Y;
        lNa_32.J *= (float)(b22 & osa.Ja) / NQa.Y;
        return lNa_32;
    }

    public int J() {
        return vRa.d;
    }

    public int J(float f2) {
        lNa_3 a2;
        float b22 = f2;
        lNa_3 lNa_32 = a2 = this;
        int b22 = super.J(b22);
        int n2 = uSa.E;
        if (lNa_32.j.F(a2.I)) {
            lNa_3 lNa_33 = a2;
            n2 = lNa_33.j.J(lNa_33.I, uSa.E);
        }
        if (b22 == 0) {
            return n2;
        }
        return b22;
    }

    public lNa J() {
        lNa_3 lNa_32;
        (lNa_32 = this).I = new XF(lNa_32.la, lNa_32.Z, (double)lNa_32.A);
        Block a22 = (lNa_32 = this).A.J();
        if (a22 == QFa.lf) {
            return lNa_32;
        }
        int a22 = a22.J(lNa_32.A);
        lNa_3 lNa_33 = lNa_32;
        lNa_33.l *= (float)(a22 >> ERa.C & osa.Ja) / NQa.Y;
        lNa_33.a *= (float)(a22 >> Yqa.i & osa.Ja) / NQa.Y;
        lNa_33.J *= (float)(a22 & osa.Ja) / NQa.Y;
        return lNa_33;
    }

    /*
     * WARNING - void declaration
     */
    public lNa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, IBlockState iBlockState) {
        IBlockState i2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        void h2;
        lNa_3 a2;
        lNa_3 lNa_32 = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        lNa_3 lNa_33 = a2 = lNa_32;
        super((Gg)h2, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2);
        a2.A = i2;
        a2.J(Kpa.J().J().J().J(i2));
        lNa_33.m = i2.J().blockParticleGravity;
        lNa_33.a = a2.J = Ora.D;
        lNa_33.l = a2.J;
        a2.f /= kta.v;
    }

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void a2;
        void c2;
        void d2;
        void b2;
        void e2;
        void h2;
        void f222;
        lNa_3 lNa_32;
        lNa_3 lNa_33 = lNa_32 = this;
        lNa_3 lNa_34 = lNa_32;
        float g2 = ((float)lNa_33.F + lNa_34.i / YSa.G) / Yra.i;
        float f8 = g2 + pta.R;
        float f9 = ((float)lNa_33.G + lNa_32.b / YSa.G) / Yra.i;
        float f10 = f9 + pta.R;
        float i2 = Nra.e * lNa_32.f;
        if (lNa_34.e != null) {
            lNa_3 lNa_35 = lNa_32;
            lNa_3 lNa_36 = lNa_32;
            g2 = lNa_35.e.J((double)(lNa_36.i / YSa.G * Yra.i));
            f8 = lNa_35.e.J((double)((lNa_32.i + pqa.r) / YSa.G * Yra.i));
            f9 = lNa_36.e.f((double)(lNa_32.b / YSa.G * Yra.i));
            f10 = lNa_35.e.f((double)((lNa_32.b + pqa.r) / YSa.G * Yra.i));
        }
        lNa_3 lNa_37 = lNa_32;
        float f11 = (float)(lNa_37.c + (lNa_32.la - lNa_32.c) * (double)f222 - C);
        lNa_3 lNa_38 = lNa_32;
        float f12 = (float)(lNa_37.ba + (lNa_38.Z - lNa_32.ba) * (double)f222 - k);
        float f13 = (float)(lNa_38.r + (lNa_32.A - lNa_32.r) * (double)f222 - j);
        int f222 = lNa_37.J((float)f222);
        int n2 = f222 >> ERa.C & yQa.j;
        void v6 = h2;
        float f14 = f11;
        lNa_3 lNa_39 = lNa_32;
        h2.J((double)(f11 - e2 * i2 - b2 * i2), (double)(f12 - d2 * i2), (double)(f13 - c2 * i2 - a2 * i2)).J((double)g2, (double)f10).J(lNa_39.l, lNa_39.a, lNa_32.J, pqa.r).J(n2, f222 &= yQa.j).M();
        lNa_3 lNa_310 = lNa_32;
        h2.J((double)(f14 - e2 * i2 + b2 * i2), (double)(f12 + d2 * i2), (double)(f13 - c2 * i2 + a2 * i2)).J((double)g2, (double)f9).J(lNa_310.l, lNa_310.a, lNa_32.J, pqa.r).J(n2, f222).M();
        lNa_3 lNa_311 = lNa_32;
        v6.J((double)(f14 + e2 * i2 + b2 * i2), (double)(f12 + d2 * i2), (double)(f13 + c2 * i2 + a2 * i2)).J((double)f8, (double)f9).J(lNa_311.l, lNa_311.a, lNa_32.J, pqa.r).J(n2, f222).M();
        lNa_3 lNa_312 = lNa_32;
        v6.J((double)(f11 + e2 * i2 - b2 * i2), (double)(f12 - d2 * i2), (double)(f13 + c2 * i2 - a2 * i2)).J((double)f8, (double)f10).J(lNa_312.l, lNa_312.a, lNa_32.J, pqa.r).J(n2, f222).M();
    }
}

