/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bma
 *  EC
 *  Fpa
 *  Gua
 *  ISa
 *  IY
 *  JPa
 *  JQa
 *  Kpa
 *  Lra
 *  MQa
 *  NTa
 *  Oz
 *  Pna
 *  QSa
 *  RPa
 *  SQa
 *  Ssa
 *  Usa
 *  Uta
 *  VJa
 *  VQa
 *  Wsa
 *  XTa
 *  aKa
 *  aSa
 *  ac
 *  asa
 *  hra
 *  jsa
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  l
 *  lqa
 *  mka
 *  mra
 *  nka
 *  nna
 *  pKa
 *  pPa
 *  pY
 *  pqa
 *  pua
 *  uKa
 *  uOa
 *  vRa
 *  wra
 *  xOa
 *  yQa
 */
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public final class Moa_2
extends EC
implements l {
    private int H;
    private static final Random c;
    private int B;
    private String d;
    private int a;
    private String b;
    private float l;
    private int e;
    private int G;
    private int D;
    private static final AtomicInteger f;
    private static final ResourceLocation F;
    private static final ResourceLocation[] g;
    private String L;
    public static final String E;
    private int m;
    private VJa C;
    private static final ResourceLocation i;
    private final Object M;
    private ResourceLocation k;
    private String J;
    private ac A;
    private static final Logger I;

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3) {
        void a2;
        int c2 = n2;
        Moa_2 b2 = this;
        b2.E.add(new ac(vRa.d, (int)(b2.A / uqa.g - ySa.T), c2, oha.J(dua.L, new Object[uSa.E])));
        b2.E.add(new ac(uqa.g, (int)(b2.A / uqa.g - ySa.T), c2 + a2, oha.J(mra.J, new Object[uSa.E])));
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void a2;
        int c2 = n2;
        Moa_2 b2 = this;
        b2.E.add(new ac(pPa.f, (int)(b2.A / uqa.g - ySa.T), c2, oha.J(Wsa.N, new Object[uSa.E])));
        b2.A = new ac(lqa.s, (int)(b2.A / uqa.g - ySa.T), c2 + a2, oha.J(yRa.t, new Object[uSa.E]));
        b2.E.add(b2.A);
        if (b2.g.J().J(RPa.z) == null) {
            b2.A.J = uSa.E;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void A() {
        Moa_2 moa_2;
        Moa_2 moa_22;
        (moa_22 = this).C = new VJa(hra.Ja, hra.Ja);
        moa_22.k = (moa_22 = this).g.J().J(xOa.M, moa_22.C);
        Calendar a32422 = Calendar.getInstance();
        a32422.setTime(new Date());
        if (a32422.get(uqa.g) + vRa.d == lqa.s && a32422.get(tTa.h) == osa.c) {
            moa_2 = moa_22;
            moa_22.L = Nra.K;
        } else if (a32422.get(uqa.g) + vRa.d == vRa.d && a32422.get(tTa.h) == vRa.d) {
            moa_2 = moa_22;
            moa_22.L = VQa.U;
        } else {
            if (a32422.get(uqa.g) + vRa.d == NTa.C && a32422.get(tTa.h) == tua.U) {
                moa_22.L = MQa.y;
            }
            moa_2 = moa_22;
        }
        reference a32422 = moa_2.I / AQa.P + QSa.p;
        Moa_2 moa_23 = moa_22;
        moa_23.f((int)a32422, osa.c);
        moa_23.E.add(new ac(uSa.E, (int)(moa_22.A / uqa.g - ySa.T), (int)(a32422 + QSa.p), oha.J(zpa.q, new Object[uSa.E])));
        moa_22.E.add(new ac(AQa.P, (int)(moa_22.A / uqa.g - ySa.T), (int)(a32422 + Eqa.Ka), oha.J(JPa.r, new Object[uSa.E])));
        Object a32422 = moa_22.M;
        synchronized (a32422) {
            Moa_2 moa_24 = moa_22;
            Moa_2 moa_25 = moa_22;
            moa_24.D = moa_24.L.J(moa_25.d);
            moa_24.e = moa_25.L.J(moa_22.J);
            int n2 = Math.max(moa_24.D, moa_22.e);
            moa_24.H = (int)((moa_24.A - n2) / uqa.g);
            moa_24.G = ((ac)moa_24.E.get((int)uSa.E)).I - osa.c;
            Moa_2 moa_26 = moa_22;
            moa_26.m = moa_26.H + n2;
            moa_26.a = moa_26.G + osa.c;
            return;
        }
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        Moa_2 moa_2 = this;
    }

    private void J(float f2) {
        int n2;
        Moa_2 moa_2 = this;
        moa_2.g.J().J(moa_2.k);
        GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
        GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
        GL11.glCopyTexSubImage2D(BQa.Z, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, hra.Ja, hra.Ja);
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, uSa.E != 0);
        pKa a2 = pKa.J();
        aKa aKa2 = a2.J();
        aKa2.J(XTa.W, mka.a);
        uKa.c();
        int n3 = yRa.d;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            float b2 = pqa.r / (float)(n2 + vRa.d);
            Moa_2 moa_22 = moa_2;
            ac ac2 = moa_22.A;
            Logger logger = moa_22.I;
            float f3 = (float)(n2 - n3 / uqa.g) / Fpa.q;
            aKa aKa3 = aKa2;
            ac ac3 = ac2;
            aKa2.J((double)ac3, (double)logger, (double)moa_2.I).J((double)(JPa.N + f3), oua.i).J(pqa.r, pqa.r, pqa.r, b2).M();
            aKa3.J((double)ac3, aSa.V, (double)moa_2.I).J((double)(pqa.r + f3), oua.i).J(pqa.r, pqa.r, pqa.r, b2).M();
            aKa3.J(aSa.V, aSa.V, (double)moa_2.I).J((double)(pqa.r + f3), aSa.V).J(pqa.r, pqa.r, pqa.r, b2).M();
            aKa3.J(aSa.V, (double)logger, (double)moa_2.I).J((double)(JPa.N + f3), aSa.V).J(pqa.r, pqa.r, pqa.r, b2).M();
            n4 = ++n2;
        }
        a2.J();
        uKa.K();
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void l(int n2, int n3, float f2) {
        int n4;
        Moa_2 moa_2 = this;
        pKa c2 = pKa.J();
        aKa b2 = c2.J();
        uKa.G((int)WPa.s);
        uKa.e();
        uKa.y();
        Project.gluPerspective(JQa.q, pqa.r, Yqa.C, FRa.Ga);
        uKa.G((int)SQa.ca);
        uKa.e();
        uKa.y();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.J((float)Hra.Ga, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)ISa.a, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.B();
        uKa.c();
        uKa.m();
        uKa.J(uSa.E != 0);
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        int n5 = Yqa.i;
        int n6 = n4 = uSa.E;
        while (true) {
            void a2;
            int n7 = n5;
            if (n6 >= n7 * n7) break;
            uKa.e();
            float d2 = ((float)(n4 % n5) / (float)n5 - MQa.L) / EPa.r;
            float f3 = ((float)(n4 / n5) / (float)n5 - MQa.L) / EPa.r;
            float f4 = JPa.N;
            uKa.J((float)d2, (float)f3, (float)f4);
            Moa_2 moa_22 = moa_2;
            uKa.J((float)(Oz.d((float)(((float)moa_22.B + a2) / uSa.A)) * sSa.E + eta.e), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)(-((float)moa_22.B + a2) * Nra.e), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            int n8 = uSa.E;
            while (n8 < uua.p) {
                uKa.e();
                if (d2 == vRa.d) {
                    uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                }
                if (d2 == uqa.g) {
                    uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                }
                if (d2 == yRa.d) {
                    uKa.J((float)kPa.Ha, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                }
                if (d2 == AQa.P) {
                    uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                }
                if (d2 == tTa.h) {
                    uKa.J((float)kPa.Ha, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                }
                moa_2.g.J().J(g[d2]);
                aKa aKa2 = b2;
                aKa2.J(XTa.W, mka.a);
                int n9 = osa.Ja / (n4 + vRa.d);
                aKa2.J(pqa.q, pqa.q, oua.i).J(aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, n9).M();
                aKa2.J(oua.i, pqa.q, oua.i).J(oua.i, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, n9).M();
                aKa2.J(oua.i, oua.i, oua.i).J(oua.i, oua.i).J(osa.Ja, osa.Ja, osa.Ja, n9).M();
                aKa2.J(pqa.q, oua.i, oua.i).J(aSa.V, oua.i).J(osa.Ja, osa.Ja, osa.Ja, n9).M();
                c2.J();
                uKa.D();
                n8 = ++d2;
            }
            uKa.D();
            uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, uSa.E != 0);
            n6 = ++n4;
        }
        b2.f(aSa.V, aSa.V, aSa.V);
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        uKa.G((int)WPa.s);
        uKa.D();
        uKa.G((int)SQa.ca);
        uKa.D();
        uKa.J(vRa.d != 0);
        uKa.h();
        uKa.J();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void a22;
        void b2;
        Moa_2 c2;
        int d22 = n2;
        Moa_2 moa_2 = c2 = this;
        super.J(d22, (int)b2, (int)a22);
        Object a22 = moa_2.M;
        synchronized (a22) {
            if (c2.d.length() > 0 && d22 >= c2.H && d22 <= c2.m && b2 >= c2.G && b2 <= c2.a) {
                Moa_2 moa_22 = c2;
                WNa d22 = new WNa((l)moa_22, moa_22.b, uua.s, vRa.d != 0);
                d22.J();
                c2.g.J((EC)d22);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        Object c22;
        void a2;
        void b22;
        Moa_2 moa_2 = this;
        if (b22 != false && a2 == lqa.s) {
            c22 = moa_2.g.J();
            c22.J();
            c22.J(RPa.z);
            moa_2.g.J((EC)moa_2);
            return;
        }
        if (a2 == uua.s) {
            Moa_2 moa_22;
            block5: {
                if (b22 != false) {
                    try {
                        c22 = Class.forName(Usa.e);
                        Object b22 = ((Class)c22).getMethod(csa.i, new Class[uSa.E]).invoke(null, new Object[uSa.E]);
                        Class[] classArray = new Class[vRa.d];
                        classArray[uSa.E] = URI.class;
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = new URI(moa_2.b);
                        ((Class)c22).getMethod(ySa.l, classArray).invoke(b22, objectArray);
                        moa_22 = moa_2;
                        break block5;
                    }
                    catch (Throwable c22) {
                        I.error(XOa.la, c22);
                    }
                }
                moa_22 = moa_2;
            }
            moa_22.g.J((EC)moa_2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3, float f2) {
        aKa aKa2;
        void b22;
        void c22;
        Moa_2 a2;
        float d22 = f2;
        Moa_2 moa_2 = a2 = this;
        float f3 = d22;
        Moa_2 moa_22 = a2;
        float f4 = d22;
        Moa_2 moa_23 = a2;
        a2.g.J().f();
        uKa.f((int)uSa.E, (int)uSa.E, (int)hra.Ja, (int)hra.Ja);
        moa_23.l((int)c22, (int)b22, d22);
        moa_23.J(d22);
        a2.J(f4);
        moa_22.J(f4);
        moa_22.J(d22);
        a2.J(f3);
        moa_2.J(f3);
        moa_2.J(d22);
        moa_2.g.J().J(vRa.d != 0);
        Moa_2 moa_24 = a2;
        uKa.f((int)uSa.E, (int)uSa.E, (int)moa_24.g.t, (int)a2.g.k);
        float c22 = moa_24.A > a2.I ? JQa.q / (float)a2.A : JQa.q / (float)a2.I;
        Moa_2 moa_25 = a2;
        float b22 = (float)moa_25.I * c22 / Fpa.q;
        c22 = (float)moa_25.A * c22 / Fpa.q;
        ac d22 = moa_25.A;
        Logger logger = moa_25.I;
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.a);
        aKa4.J(aSa.V, (double)logger, (double)a2.I).J((double)(MQa.L - b22), (double)(MQa.L + c22)).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        aKa3.J((double)d22, (double)logger, (double)a2.I).J((double)(MQa.L - b22), (double)(MQa.L - c22)).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        aKa3.J((double)d22, aSa.V, (double)a2.I).J((double)(MQa.L + b22), (double)(MQa.L - c22)).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        aKa3.J(aSa.V, aSa.V, (double)a2.I).J((double)(MQa.L + b22), (double)(MQa.L + c22)).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        Moa_2 moa_2 = this;
        uKa.c();
        Moa_2 moa_22 = moa_2;
        moa_22.f((int)c2, (int)b2, (float)a2);
        uKa.K();
        pKa.J().J();
        Object object = Uta.H;
        object = moa_22.A / uqa.g - object / uqa.g;
        int d2 = Fsa.d;
        Moa_2 moa_23 = moa_2;
        moa_23.J(uSa.E, uSa.E, (int)moa_23.A, (int)moa_2.I, Gua.V, Wsa.K);
        Moa_2 moa_24 = moa_2;
        moa_22.J(uSa.E, uSa.E, (int)moa_24.A, (int)moa_24.I, uSa.E, ypa.L);
        moa_22.g.J().J(i);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        if ((double)moa_22.l < oQa.Ka) {
            Moa_2 moa_25 = moa_2;
            Object object2 = object;
            Moa_2 moa_26 = moa_2;
            moa_26.f((int)object, d2, uSa.E, uSa.E, zOa.v, Yqa.D);
            moa_26.f(object + zOa.v, d2, rpa.F, uSa.E, Lra.e, Yqa.D);
            moa_2.f(object2 + zOa.v + ITa.E, d2, rQa.i, uSa.E, yRa.d, Yqa.D);
            moa_25.f(object2 + zOa.v + ITa.E + yRa.d, d2, zOa.v, uSa.E, ITa.E, Yqa.D);
            moa_25.f(object + BQa.Q, d2, uSa.E, wra.e, BQa.Q, Yqa.D);
        } else {
            Moa_2 moa_27 = moa_2;
            Object object3 = object;
            moa_27.f((int)object3, d2, uSa.E, uSa.E, BQa.Q, Yqa.D);
            moa_27.f(object3 + BQa.Q, d2, uSa.E, wra.e, BQa.Q, Yqa.D);
        }
        uKa.e();
        uKa.J((float)((float)(moa_2.A / uqa.g + Jsa.ha)), (float)UOa.d, (float)JPa.N);
        uKa.J((float)Lsa.X, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        Moa_2 moa_28 = moa_2;
        float f3 = (Ssa.la - Oz.l((float)(Oz.d((float)((float)(Kpa.J() % asa.fa) / Jpa.r * pua.j * kta.v)) * Nra.e))) * QTa.G / (float)(moa_2.L.J(moa_28.L) + fPa.i);
        uKa.l((float)f3, (float)f3, (float)f3);
        uKa.D();
        if (moa_28.d != null && moa_2.d.length() > 0) {
            Moa_2 moa_29 = moa_2;
            Moa_2.J((int)(moa_29.H - uqa.g), (int)(moa_2.G - uqa.g), (int)(moa_2.m + uqa.g), (int)(moa_2.a - vRa.d), (int)mPa.U);
            Moa_2 moa_210 = moa_2;
            Moa_2.f((String)moa_29.d, (int)moa_210.H, (int)moa_210.G, (int)pua.o);
            Moa_2 moa_211 = moa_2;
            Moa_2.f((String)moa_29.J, (int)((moa_211.A - moa_211.e) / uqa.g), (int)(((ac)moa_2.E.get((int)uSa.E)).I - lqa.s), (int)pua.o);
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void J(ac ac2) throws IOException {
        EC b2 = ac2;
        Moa_2 a2 = this;
        if (b2.C == 0) {
            Moa_2 moa_2 = a2;
            a2.g.J((EC)new nna((EC)moa_2, moa_2.g.z));
        }
        if (b2.C == tTa.h) {
            Moa_2 moa_2 = a2;
            a2.g.J((EC)new Bma((EC)moa_2, a2.g.z, moa_2.g.J()));
        }
        if (b2.C == vRa.d) {
            a2.g.J((EC)new Pna((EC)a2));
        }
        if (b2.C == uqa.g) {
            a2.g.J((EC)new uLa(a2));
        }
        if (b2.C == AQa.P) {
            a2.g.L();
        }
        if (b2.C == pPa.f) {
            a2.g.J(RPa.z, RPa.z, IY.A);
        }
        if (b2.C == lqa.s && (b2 = a2.g.J().J(RPa.z)) != null) {
            Moa_2 moa_2 = a2;
            b2 = Pna.J((l)moa_2, (String)b2.f(), (int)lqa.s);
            moa_2.g.J(b2);
        }
    }

    public void l() {
        a.B += vRa.d;
    }

    static {
        f = new AtomicInteger(uSa.E);
        I = LogManager.getLogger();
        c = new Random();
        F = new ResourceLocation(jsa.N);
        i = new ResourceLocation(bsa.N);
        ResourceLocation[] resourceLocationArray = new ResourceLocation[uua.p];
        resourceLocationArray[uSa.E] = new ResourceLocation(Lsa.S);
        resourceLocationArray[vRa.d] = new ResourceLocation(xOa.c);
        resourceLocationArray[uqa.g] = new ResourceLocation(aSa.X);
        resourceLocationArray[yRa.d] = new ResourceLocation(PQa.R);
        resourceLocationArray[AQa.P] = new ResourceLocation(yQa.c);
        resourceLocationArray[tTa.h] = new ResourceLocation(uOa.j);
        g = resourceLocationArray;
        E = new StringBuilder().insert(2 & 5, ppa.d).append(pY.UNDERLINE).append(Fsa.a).append(pY.RESET).append(kta.Y).toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public Moa_2() {
        block17: {
            Moa_2 moa_2;
            Moa_2 moa_22;
            block16: {
                moa_22 = this;
                Moa_2 moa_23 = moa_22;
                moa_22.M = new Object();
                moa_23.J = E;
                moa_22.L = JPa.p;
                Object a2 = null;
                ArrayList<String> arrayList = Lists.newArrayList();
                a2 = new BufferedReader(new InputStreamReader(Kpa.J().J().J(F).J(), Charsets.UTF_8));
                block10: while (true) {
                    String string;
                    Object object = a2;
                    while ((string = ((BufferedReader)object).readLine()) != null) {
                        if ((string = string.trim()).isEmpty()) continue block10;
                        object = a2;
                        arrayList.add(string);
                    }
                    break;
                }
                if (!arrayList.isEmpty()) {
                    do {
                        ArrayList<String> arrayList2 = arrayList;
                        moa_22.L = (String)arrayList2.get(c.nextInt(arrayList2.size()));
                    } while (moa_22.L.hashCode() == Tqa.P);
                }
                if (a2 == null) break block16;
                try {
                    ((BufferedReader)a2).close();
                    moa_2 = moa_22;
                }
                catch (IOException iOException) {
                    moa_2 = moa_22;
                }
                break block17;
                catch (IOException iOException) {
                    if (a2 == null) break block16;
                    try {
                        ((BufferedReader)a2).close();
                        moa_2 = moa_22;
                    }
                    catch (IOException iOException2) {
                        moa_2 = moa_22;
                    }
                    break block17;
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    if (a2 != null) {
                        try {
                            ((BufferedReader)a2).close();
                            throwable2 = throwable;
                        }
                        catch (IOException iOException) {}
                    }
                    throwable2 = throwable;
                    throw throwable2;
                }
            }
            moa_2 = moa_22;
        }
        moa_2.l = c.nextFloat();
        moa_22.d = Mqa.y;
        if (!GLContext.getCapabilities().OpenGL20 && !nka.l()) {
            moa_22.d = oha.J(MTa.Ka, new Object[uSa.E]);
            moa_22.J = oha.J(kqa.a, new Object[uSa.E]);
            moa_22.b = VPa.C;
        }
    }
}

