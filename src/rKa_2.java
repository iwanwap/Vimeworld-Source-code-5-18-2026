/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EH
 *  ERa
 *  Fpa
 *  GC
 *  JPa
 *  Kpa
 *  Lz
 *  MQa
 *  Oz
 *  Qsa
 *  Xsa
 *  Yea
 *  Yra
 *  aSa
 *  bua
 *  hy
 *  kta
 *  pqa
 *  uKa
 *  vL
 *  vPa
 *  wOa
 *  yQa
 */
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelMinecart;
import net.minecraft.util.ResourceLocation;

public class rKa_2<T extends Yea>
extends GC<T> {
    public ModelBase A;
    private static final ResourceLocation I = new ResourceLocation(Jta.Ga);

    public ResourceLocation J(T t2) {
        rKa_2<T> b2 = t2;
        rKa_2 a2 = this;
        return I;
    }

    public rKa_2(oLa oLa2) {
        Object b2 = oLa2;
        rKa_2 a2 = this;
        super((oLa)b2);
        rKa_2 rKa_22 = a2;
        a2.A = new ModelMinecart();
        rKa_22.I = (ResourceLocation)MQa.L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, float f2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object d2 = iBlockState;
        rKa_2 a2 = this;
        uKa.e();
        Kpa.J().J().J((IBlockState)d2, c2.J((float)b2));
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        void a2;
        float b2;
        void c2;
        void d5;
        void e2;
        EH eH;
        rKa_2 f5;
        rKa_2<T> g2;
        block11: {
            g2 = t2;
            f5 = this;
            uKa.e();
            eH = Ni.J((vL)g2);
            if (eH == null || !eH.F) break block11;
            uKa.D();
            return;
        }
        try {
            if (eH != null && eH.C != null && eH.C.J((vL)g2, (double)(e2 + (double)eH.j), (double)(d5 + (double)eH.i), (double)(c2 + (double)eH.L), b2, (float)a2)) {
                uKa.D();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        f5.f((vL)g2);
        rKa_2<T> rKa_22 = g2;
        long l2 = (long)rKa_22.M() * yQa.b;
        l2 = l2 * l2 * Xsa.S + l2 * Cqa.M;
        float f6 = (((float)(l2 >> ERa.C & bua.L) + MQa.L) / Qsa.k - MQa.L) * aSa.b;
        float f7 = (((float)(l2 >> kTa.j & bua.L) + MQa.L) / Qsa.k - MQa.L) * aSa.b;
        float f8 = (((float)(l2 >> osa.c & bua.L) + MQa.L) / Qsa.k - MQa.L) * aSa.b;
        uKa.J((float)f6, (float)f7, (float)f8);
        rKa_2<T> rKa_23 = g2;
        double d6 = ((Yea)rKa_22).V + (((Yea)rKa_23).la - ((Yea)g2).V) * (double)a2;
        double d7 = ((Yea)rKa_23).Ga + (((Yea)g2).Z - ((Yea)g2).Ga) * (double)a2;
        double d8 = ((Yea)rKa_22).Ca + (((Yea)g2).A - ((Yea)g2).Ca) * (double)a2;
        double d9 = osa.b;
        Object object = rKa_22.J(d6, d7, d8);
        rKa_2<T> rKa_24 = g2;
        f7 = ((Yea)rKa_22).o + (((Yea)rKa_24).d - ((Yea)rKa_24).o) * a2;
        if (object != null) {
            rKa_2<T> rKa_25 = g2;
            Lz lz2 = rKa_25.J(d6, d7, d8, d9);
            Lz lz3 = rKa_25.J(d6, d7, d8, -d9);
            if (lz2 == null) {
                lz2 = object;
            }
            if (lz3 == null) {
                lz3 = object;
            }
            e2 += object.A - d6;
            d5 += (lz2.j + lz3.j) / KPa.y - d7;
            c2 += object.J - d8;
            Lz lz4 = lz3.f(-lz2.A, -lz2.j, -lz2.J);
            if (lz4.J() != aSa.V) {
                Lz lz5 = lz4 = lz4.J();
                b2 = (float)(Math.atan2(lz4.J, lz5.A) * kta.Da / lQa.f);
                f7 = (float)(Math.atan(lz5.j) * Fpa.y);
            }
        }
        uKa.J((float)((float)e2), (float)((float)d5 + MRa.K), (float)((float)c2));
        uKa.J((float)(Hra.Ga - b2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(-f7), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        rKa_2<T> rKa_26 = g2;
        f8 = (float)rKa_26.G() - a2;
        float f9 = rKa_26.J() - a2;
        if (f4 < JPa.N) {
            f9 = JPa.N;
        }
        if (f8 > JPa.N) {
            uKa.J((float)(Oz.d((float)f8) * f8 * f9 / FRa.Ga * (float)g2.D()), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
        rKa_2<T> rKa_27 = g2;
        int n2 = rKa_27.F();
        object = rKa_27.J();
        if (object.J().J() != hy.INVISIBLE) {
            uKa.e();
            rKa_2 rKa_28 = f5;
            f5.J(WKa.C);
            float f10 = wOa.w;
            uKa.l((float)f10, (float)f10, (float)f10);
            uKa.J((float)vPa.b, (float)((float)(n2 - Yqa.i) / Yra.i), (float)MQa.L);
            rKa_28.J((T)((Object)g2), (float)a2, (IBlockState)object);
            uKa.D();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            rKa_28.f((vL)g2);
        }
        uKa.l((float)vqa.T, (float)vqa.T, (float)pqa.r);
        f5.A.J((vL)g2, JPa.N, JPa.N, Qra.j, JPa.N, JPa.N, rRa.T);
        uKa.D();
        super.l((vL)g2, (double)e2, (double)d5, (double)c2, b2, (float)a2);
    }
}

