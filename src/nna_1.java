/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bma
 *  Bsa
 *  Bt
 *  CY
 *  CZ
 *  Cia
 *  EC
 *  Lqa
 *  QSa
 *  RPa
 *  Sqa
 *  UMa
 *  We
 *  Xsa
 *  Yma
 *  Ypa
 *  Yra
 *  ZOa
 *  ac
 *  boa
 *  cra
 *  hqa
 *  jRa
 *  jna
 *  jpa
 *  l
 *  ld
 *  lqa
 *  pua
 *  qna
 *  vRa
 *  zTa
 *  zf
 *  zna
 */
import java.io.IOException;

public final class nna_1
extends EC
implements l {
    private final EC k;
    public String j;
    private static final Fha[] J;
    private final Cia A;
    private ac I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        nna_1 a2;
        float d2 = f2;
        nna_1 nna_12 = a2 = this;
        a2.i();
        nna_1.J((String)nna_12.j, (int)(a2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public void A() {
        int n2;
        nna_1 nna_12 = this;
        int n3 = uSa.E;
        nna_12.j = oha.J(MTa.Y, new Object[uSa.E]);
        Object object = J;
        int n4 = J.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            Object a2 = object[n2];
            if (((Fha)((Object)a2)).getEnumFloat()) {
                nna_12.E.add(new We(((Fha)((Object)a2)).returnEnumOrdinal(), (int)(nna_12.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), (int)(nna_12.I / uua.p - lqa.s + osa.c * (n3 >> vRa.d)), (Fha)((Object)a2)));
            } else {
                nna_1 nna_13 = a2;
                a2 = new zf(((Fha)((Object)a2)).returnEnumOrdinal(), (int)(nna_12.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), (int)(nna_12.I / uua.p - lqa.s + osa.c * (n3 >> vRa.d)), (Fha)((Object)nna_13), nna_12.A.J((Fha)((Object)nna_13)));
                nna_12.E.add(a2);
            }
            ++n3;
            n5 = ++n2;
        }
        if (nna_12.g.Ta != null) {
            object = nna_12.g.Ta.J();
            nna_12.I = new ac(Jra.o, (int)(nna_12.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), (int)(nna_12.I / uua.p - lqa.s + osa.c * (n3 >> vRa.d)), Jpa.Ha, kTa.j, nna_12.J((sZ)((Object)object)));
            nna_12.E.add(nna_12.I);
            nna_12.I.J = nna_12.g.f() && !nna_12.g.Ta.J().d() ? vRa.d : uSa.E;
        }
        nna_12.E.add(new ac(Iqa.M, (int)(nna_12.A / uqa.g - BQa.Q), (int)(nna_12.I / uua.p + QSa.p - uua.p), Jpa.Ha, kTa.j, oha.J(gQa.T, new Object[uSa.E])));
        nna_12.E.add(new ac(Yra.j, (int)(nna_12.A / uqa.g - BQa.Q), (int)(nna_12.I / uua.p + Eqa.Ka - uua.p), Jpa.Ha, kTa.j, oha.J(RPa.ca, new Object[uSa.E])));
        nna_12.E.add(new ac(jpa.E, (int)(nna_12.A / uqa.g + tTa.h), (int)(nna_12.I / uua.p + Eqa.Ka - uua.p), Jpa.Ha, kTa.j, Yqa.y));
        nna_12.E.add(new ac(zTa.C, (int)(nna_12.A / uqa.g - BQa.Q), (int)(nna_12.I / uua.p + zua.m - uua.p), Jpa.Ha, kTa.j, oha.J(bsa.K, new Object[uSa.E])));
        nna_12.E.add(new ac(ySa.T, (int)(nna_12.A / uqa.g + tTa.h), (int)(nna_12.I / uua.p + zua.m - uua.p), Jpa.Ha, kTa.j, oha.J(Xsa.h, new Object[uSa.E])));
        nna_12.E.add(new ac(jRa.v, (int)(nna_12.A / uqa.g + tTa.h), (int)(nna_12.I / uua.p + QSa.p - uua.p), Jpa.Ha, kTa.j, oha.J(pua.h, new Object[uSa.E])));
        nna_12.E.add(new ac(Bsa.E, (int)(nna_12.A / uqa.g + tTa.h), (int)(nna_12.I / uua.p + sOa.D - uua.p), Jpa.Ha, kTa.j, oha.J(qQa.Ga, new Object[uSa.E])));
        nna_12.E.add(new ac(xua.S, (int)(nna_12.A / uqa.g - BQa.Q), (int)(nna_12.I / uua.p + sOa.D - uua.p), Jpa.Ha, kTa.j, oha.J(mSa.w, new Object[uSa.E])));
        nna_12.E.add(new ac(ZOa.x, (int)(nna_12.A / uqa.g - ySa.T), (int)(nna_12.I / uua.p + tua.i), oha.J(cra.g, new Object[uSa.E])));
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        nna_1 a2 = this;
        a2.g.J((EC)a2);
    }

    /*
     * WARNING - void declaration
     */
    public nna_1(EC eC2, Cia cia) {
        void b2;
        nna_1 a2;
        nna_1 c2 = cia;
        nna_1 nna_12 = a2 = this;
        a2.j = Sqa.E;
        nna_12.k = b2;
        nna_12.A = c2;
    }

    public void J(ac ac2) throws IOException {
        nna_1 b2 = ac2;
        nna_1 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C < ySa.T && b2 instanceof zf) {
                Fha fha = ((zf)b2).f();
                nna_1 nna_12 = a2;
                nna_12.A.f(fha, vRa.d);
                ((ac)b2).i = nna_12.A.J(Fha.getEnumOptions(((ac)b2).C));
            }
            if (((ac)b2).C == Jra.o) {
                a2.g.Ta.J().J(sZ.getDifficultyEnum(a2.g.Ta.J().getDifficultyId() + vRa.d));
                nna_1 nna_13 = a2;
                a2.I.i = nna_13.J(nna_13.g.Ta.J());
            }
            if (((ac)b2).C == rSa.i) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = new CZ(a2.g.Ta.J().J().getDifficultyResourceKey(), new Object[uSa.E]);
                a2.g.J((EC)new Vma(a2, new CZ(hqa.E, new Object[uSa.E]).l(), new CZ(WRa.N, objectArray).l(), rSa.i));
            }
            if (((ac)b2).C == Iqa.M) {
                nna_1 nna_14 = a2;
                nna_14.g.z.d();
                nna_14.g.J((EC)new boa((EC)a2));
            }
            if (((ac)b2).C == QTa.Ma) {
                a2.g.R.e();
            }
            if (((ac)b2).C == zTa.C) {
                nna_1 nna_15 = a2;
                nna_15.g.z.d();
                nna_1 nna_16 = a2;
                nna_15.g.J((EC)new zna((EC)nna_16, nna_16.A));
            }
            if (((ac)b2).C == ySa.T) {
                nna_1 nna_17 = a2;
                nna_17.g.z.d();
                nna_1 nna_18 = a2;
                nna_17.g.J((EC)new qna((EC)nna_18, nna_18.A));
            }
            if (((ac)b2).C == jRa.v) {
                nna_1 nna_19 = a2;
                nna_19.g.z.d();
                nna_1 nna_110 = a2;
                nna_19.g.J((EC)new Bma((EC)nna_110, a2.A, nna_110.g.J()));
            }
            if (((ac)b2).C == Bsa.E) {
                nna_1 nna_111 = a2;
                nna_111.g.z.d();
                nna_1 nna_112 = a2;
                nna_111.g.J((EC)new UMa((EC)nna_112, nna_112.A));
            }
            if (((ac)b2).C == Lqa.h) {
                nna_1 nna_113 = a2;
                nna_113.g.z.d();
                nna_1 nna_114 = a2;
                nna_113.g.J((EC)new jna((EC)nna_114, nna_114.A));
            }
            if (((ac)b2).C == ZOa.x) {
                nna_1 nna_115 = a2;
                nna_115.g.z.d();
                nna_115.g.J(a2.k);
            }
            if (((ac)b2).C == xua.S) {
                nna_1 nna_116 = a2;
                nna_116.g.z.d();
                nna_116.g.J((EC)new Yma((EC)a2));
            }
            if (((ac)b2).C == Yra.j) {
                nna_1 nna_117 = a2;
                nna_117.g.z.d();
                nna_1 nna_118 = a2;
                nna_117.g.J((EC)new Hoa(nna_118, nna_118.A));
            }
            if (((ac)b2).C == jpa.E) {
                nna_1 nna_119 = a2;
                nna_119.g.z.d();
                nna_119.g.J((EC)new Bt((EC)a2));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public String J(sZ sZ2) {
        void a2;
        nna_1 nna_12 = this;
        nna_1 b2 = new CY(Mqa.y);
        b2.J((ld)new CZ(Hra.R, new Object[uSa.E]));
        b2.J(Xpa.E);
        b2.J((ld)new CZ(a2.getDifficultyResourceKey(), new Object[uSa.E]));
        return b2.l();
    }

    static {
        Fha[] fhaArray = new Fha[vRa.d];
        fhaArray[uSa.E] = Fha.FOV;
        J = fhaArray;
    }
}

