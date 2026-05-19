/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Kpa
 *  OH
 *  Tg
 *  Yra
 *  dN
 *  nLa
 *  pKa
 *  pPa
 *  pqa
 *  uKa
 *  vRa
 *  xy
 *  yQa
 */
import java.nio.ByteBuffer;

public final class Dj_1
extends Tg {
    private int[] F;
    public int g;
    public int L;
    private boolean E;
    public hKa m;
    public int C;
    public boolean M;
    private long j;
    private static final zz J = new zz();
    public ByteBuffer A;
    private final OH[] I;

    /*
     * Enabled aggressive block sorting
     */
    public void J(long l2) {
        Dj_1 dj_1 = this;
        Kpa a2 = Kpa.J();
        int n2 = vRa.d;
        if (dj_1.E) {
            int b2 = a2.N.f();
            if ((long)b2 < dj_1.j || (long)b2 - dj_1.j > Yra.t) {
                dj_1.j = b2;
                n2 = uSa.E;
            }
            a2.R.i();
            nLa.C();
        }
        if (dj_1.M) {
            uKa.h();
        } else {
            uKa.m();
        }
        uKa.z();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.J(vRa.d != 0);
        Dj_1 dj_12 = dj_1;
        dj_12.C();
        dj_12.A.position(uSa.E);
        Dj_1 b2 = pKa.J().J();
        Dj_1 dj_13 = dj_1;
        b2.J(dj_13.L, dj_13.m);
        float f2 = JPa.N;
        float f3 = JPa.N;
        float f4 = JPa.N;
        int n3 = uSa.E;
        int n4 = n3;
        while (true) {
            int n5;
            if (n4 < dj_1.g) {
                n5 = uSa.E;
            } else {
                pKa.J().J();
                uKa.H();
                Dj_1 dj_14 = dj_1;
                dj_14.d();
                if (dj_14.E) {
                    a2.R.D();
                }
                return;
            }
            while (n5 < dj_1.I.length) {
                int n6;
                switch (XI.I[dj_1.I[n6].ordinal()]) {
                    case 1: {
                        f2 = dj_1.A.getFloat();
                        f3 = dj_1.A.getFloat();
                        f4 = dj_1.A.getFloat();
                        b2.J((double)f2 - RKa.k, (double)f3 - RKa.C, (double)f4 - RKa.f);
                        break;
                    }
                    case 2: {
                        b2.J(dj_1.A.get(), dj_1.A.get(), dj_1.A.get(), dj_1.A.get());
                        break;
                    }
                    case 3: {
                        int n7 = n3 * b2.J().C() + b2.J().J(n6);
                        b2.J().put(n7, dj_1.A.get()).put(n7 + vRa.d, dj_1.A.get()).put(n7 + uqa.g, dj_1.A.get());
                        break;
                    }
                    case 4: {
                        int n7;
                        int n8 = (n2 != 0 ? (n7 = dj_1.F[n3]) : (n7 = a2.Ta.J((XF)J.func_181079_c((int)f2, (int)f3, (int)f4), uSa.E))) >> ERa.C & yQa.j;
                        b2.J(n8, n7 &= yQa.j);
                        break;
                    }
                }
                n5 = ++n6;
            }
            b2.M();
            n4 = ++n3;
        }
    }

    private void M() {
        int n2;
        Dj_1 dj_1 = this;
        float f2 = pPa.T;
        float f3 = pPa.T;
        float f4 = pPa.T;
        float f5 = CRa.V;
        float f6 = CRa.V;
        float f7 = CRa.V;
        int n3 = n2 = uSa.E;
        while (n3 < dj_1.g) {
            int n4 = uSa.E;
            int n5 = uSa.E;
            int n6 = n4;
            while (n6 < dj_1.I.length) {
                if (dj_1.I[n4] == OH.POSITION_3F) {
                    int a22 = n2 * dj_1.C + n5;
                    Dj_1 dj_12 = dj_1;
                    float f8 = dj_12.A.getFloat(a22);
                    float f9 = dj_12.A.getFloat(a22 + AQa.P);
                    float a22 = dj_12.A.getFloat(a22 + Yqa.i);
                    f2 = Math.min(f8, f2);
                    f3 = Math.min(f9, f3);
                    f4 = Math.min(a22, f4);
                    f5 = Math.max(f8, f5);
                    f6 = Math.max(f9, f6);
                    f7 = Math.max(a22, f7);
                    break;
                }
                OH oH = dj_1.I[n4];
                n5 += oH.inputSize;
                n6 = ++n4;
            }
            n3 = ++n2;
        }
        dj_1.e = xy.J((double)f2, (double)f3, (double)f4, (double)f5, (double)f6, (double)f7);
    }

    public Dj_1(dN dN2) {
        int n2;
        int n3;
        Dj_1 a2;
        Dj_1 b22 = dN2;
        Dj_1 dj_1 = a2 = this;
        super((dN)b22);
        dj_1.M = vRa.d;
        b22 = b22.getEDirectDraw();
        a2.L = b22.getMode();
        dj_1.A = ByteBuffer.allocate(b22.getData().size());
        a2.A.put(b22.getData().asReadOnlyByteBuffer());
        a2.I = new OH[b22.getVertexFormatCount()];
        int n4 = n3 = uSa.E;
        while (n4 < a2.I.length) {
            int n5 = n3++;
            a2.I[n5] = OH.values()[b22.getVertexFormat(n5)];
            n4 = n3;
        }
        if (b22.hasCulling()) {
            a2.M = b22.getCulling();
        }
        Dj_1 dj_12 = a2;
        dj_12.l = uSa.E;
        dj_12.G = uSa.E;
        dj_12.b = uSa.E;
        Dj_1 dj_13 = a2;
        dj_12.m = new hKa();
        OH[] oHArray = dj_12.I;
        int b22 = dj_12.I.length;
        int n6 = n2 = uSa.E;
        while (n6 < b22) {
            OH oH;
            OH oH2 = oH = oHArray[n2];
            a2.m.J(oH2.element);
            a2.C += oH.inputSize;
            if (oH2 == OH.LIGHT_DYNAMIC_BLOCKSKY) {
                a2.E = vRa.d;
            }
            n6 = ++n2;
        }
        a2.g = a2.A.array().length / a2.C;
        Dj_1 dj_14 = a2;
        if (dj_14.g * dj_14.C != a2.A.array().length) {
            throw new IllegalArgumentException(vua.a);
        }
        if (a2.E) {
            a2.F = new int[a2.g];
        }
        a2.M();
    }
}

