/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  At
 *  CV
 *  Cs
 *  Ct
 *  DQa
 *  Ds
 *  Fs
 *  Ft
 *  Gu
 *  JPa
 *  JQa
 *  Kpa
 *  LI
 *  LT
 *  MT
 *  NS
 *  Nu
 *  Oz
 *  TR
 *  Us
 *  Yra
 *  ZT
 *  dT
 *  fS
 *  fi
 *  fpa
 *  hS
 *  jT
 *  oS
 *  pda
 *  pqa
 *  psa
 *  pt
 *  pua
 *  qt
 *  sR
 *  tt
 *  vRa
 *  wt
 *  ys
 */
public final class St
extends LI {
    public dT context;
    private static final fi PI = new fi(pua.j);
    public static final St INSTANCE = new St();

    public static /* synthetic */ float J() {
        return (float)Kpa.J().N.f() + CV.M;
    }

    public static /* synthetic */ float k(b[] bArray) {
        int n2;
        b[] bArray2 = bArray;
        float a2 = bArray2[uSa.E].J();
        int n3 = n2 = vRa.d;
        while (n3 < bArray2.length) {
            b b2 = bArray2[n2];
            a2 = Math.min(a2, b2.J());
            n3 = ++n2;
        }
        return a2;
    }

    public static /* synthetic */ float G(b[] a2) {
        return Oz.J((float)a2[vRa.d].J(), (float)a2[uSa.E].J(), (float)a2[uqa.g].J());
    }

    public static /* synthetic */ b k(b[] a2) {
        return fS.J((b[])a2);
    }

    public static /* synthetic */ float C(St a2) {
        if (a2.context.l()) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ b G(b[] a2) {
        return sR.J((b[])a2);
    }

    public static /* synthetic */ float D(b[] a2) {
        return Oz.d((float)St.J(a2[uSa.E].J()));
    }

    public static /* synthetic */ float l(St a2) {
        if (a2.context.J(pda.HAT)) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ b C(St a2) {
        return qS.J(a2);
    }

    public static /* synthetic */ b D(b[] a2) {
        return ZT.J((b[])a2);
    }

    public static /* synthetic */ b A(b[] a2) {
        return zS.J(a2);
    }

    public static /* synthetic */ float A(b[] a2) {
        return Oz.C((float)St.J(a2[uSa.E].J()));
    }

    public static /* synthetic */ b i(b[] a2) {
        return Os.J(a2);
    }

    public static /* synthetic */ float i(b[] bArray) {
        int n2;
        b[] bArray2 = bArray;
        float a2 = bArray2[uSa.E].J();
        int n3 = n2 = vRa.d;
        while (n3 < bArray2.length) {
            b b2 = bArray2[n2];
            a2 = Math.max(a2, b2.J());
            n3 = ++n2;
        }
        return a2;
    }

    public static /* synthetic */ float f(St a2) {
        if (a2.context.J(pda.JACKET)) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ float J(St a2) {
        if (a2.context.d()) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ b l(St a2) {
        return Ft.J((St)a2);
    }

    public static /* synthetic */ b f() {
        return PI;
    }

    public static /* synthetic */ b M(b[] a2) {
        return Fs.J((b[])a2);
    }

    public static /* synthetic */ b J() {
        return jT.J();
    }

    public static /* synthetic */ b e(b[] a2) {
        return ys.J((b[])a2);
    }

    private St() {
        St a2;
        St st = a2;
        st.J(vsa.G, Nu.J());
        st.J(DQa.F, oS.J());
        st.J(psa.Ga, Ct.J((St)a2));
        st.J(Yra.Z, pt.J((St)a2));
        st.J(Npa.g, Ys.J(a2));
        st.J(BQa.s, kt.J(a2));
        st.f(kua.A, qt.J());
        st.f(JQa.D, Ds.J());
        st.f(BQa.C, Cs.J());
        st.f(Yra.l, tt.J());
        st.f(ypa.r, NS.J());
        st.f(nqa.U, TR.J());
        st.f(Bua.r, wt.J());
        st.f(fpa.s, UT.J());
        st.f(PQa.S, At.J());
        st.f(XOa.J, mT.J());
        st.f(fqa.la, hS.J());
    }

    public static /* synthetic */ float M(b[] a2) {
        return Oz.f((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b d(b[] a2) {
        return Su.J(a2);
    }

    public static /* synthetic */ b f(St a2) {
        return FS.J(a2);
    }

    public static /* synthetic */ float e(b[] a2) {
        return a2[uSa.E].J() % a2[vRa.d].J();
    }

    public static /* synthetic */ float d(b[] a2) {
        return Math.abs(a2[uSa.E].J());
    }

    public static /* synthetic */ b J(St a2) {
        return Gu.J((St)a2);
    }

    public static /* synthetic */ b C(b[] a2) {
        return Us.J((b[])a2);
    }

    private static float J(float a2) {
        return ((a2 + Hra.Ga) % CRa.ja + Hra.Ga) % CRa.ja;
    }

    public static /* synthetic */ b l(b[] a2) {
        return MT.J((b[])a2);
    }

    public static /* synthetic */ float C(b[] a2) {
        return (float)Math.pow(a2[uSa.E].J(), a2[vRa.d].J());
    }

    public static /* synthetic */ float l(b[] a2) {
        return Oz.J((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b f(b[] a2) {
        return LT.J((b[])a2);
    }

    public static /* synthetic */ float f(b[] a2) {
        return Oz.J((float)a2[uSa.E].J());
    }
}

