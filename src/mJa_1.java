/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  JPa
 *  MQa
 *  Mda
 *  Xja
 *  eAa
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  xKa
 */
import net.minecraft.util.ResourceLocation;

public class mJa_1<T extends vL>
extends GC<T> {
    public final eAa A;
    private final xKa I;

    /*
     * WARNING - void declaration
     */
    public void l(T t2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        mJa_1<T> g2 = t2;
        mJa_1 f4 = this;
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        uKa.o();
        uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
        mJa_1 mJa_12 = f4;
        uKa.J((float)(-mJa_12.A.c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)mJa_12.A.l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        mJa_12.J(WKa.C);
        mJa_12.I.J(f4.J((T)((Object)g2)), Xja.GROUND);
        uKa.E();
        uKa.D();
        super.l((vL)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public mJa_1(oLa oLa2, eAa eAa2, xKa xKa2) {
        void b2;
        void c2;
        mJa_1 a2;
        mJa_1 d2 = xKa2;
        mJa_1 mJa_12 = a2 = this;
        super((oLa)c2);
        mJa_12.A = b2;
        mJa_12.I = d2;
    }

    public Mda J(T t2) {
        mJa_1<T> b2 = t2;
        mJa_1 a2 = this;
        return new Mda(a2.A, vRa.d, uSa.E);
    }

    public ResourceLocation J(vL vL2) {
        mJa_1 b2 = vL2;
        mJa_1 a2 = this;
        return WKa.C;
    }
}

