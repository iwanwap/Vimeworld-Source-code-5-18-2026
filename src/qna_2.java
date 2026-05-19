/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  KTa
 *  Kpa
 *  We
 *  ZOa
 *  ac
 *  cra
 *  hra
 *  mra
 *  pua
 *  qma
 *  qna
 *  vRa
 *  zf
 */
import java.io.IOException;

public final class qna_2
extends EC {
    private qma C;
    private EC i;
    public mIa M;
    private ac k;
    private Cia j;
    public long J;
    private static final Fha[] A;
    public String I;

    public void d() throws IOException {
        qna_2 a2;
        qna_2 qna_22 = a2;
        super.d();
        qna_22.C.f();
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        qna_2 a2 = this;
        if (a2.M != null) {
            qna_2 qna_22;
            if (c3 == vRa.d) {
                qna_2 qna_23 = a2;
                qna_22 = qna_23;
                a2.j.J(qna_23.M, uSa.E);
            } else if (c3 != 0) {
                qna_2 qna_24 = a2;
                qna_22 = qna_24;
                a2.j.J(qna_24.M, c3);
            } else {
                if (b2 > 0) {
                    qna_2 qna_25 = a2;
                    qna_25.j.J(qna_25.M, (int)(b2 + hra.Ja));
                }
                qna_22 = a2;
            }
            qna_22.M = null;
            a2.J = Kpa.J();
            mIa.resetKeyBindingArrayAndHash();
            return;
        }
        super.J((char)b2, c3);
    }

    public void J(ac ac2) throws IOException {
        qna_2 b2 = ac2;
        qna_2 a2 = this;
        if (((ac)b2).C == ZOa.x) {
            qna_2 qna_22 = a2;
            qna_22.g.J(qna_22.i);
            return;
        }
        if (((ac)b2).C == Tqa.K) {
            int n2;
            mIa[] mIaArray = a2.g.z.ja;
            int n3 = a2.g.z.ja.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                mIa mIa2 = mIaArray[n2];
                mIa2.setKeyCode(mIa2.getKeyCodeDefault());
                n4 = ++n2;
            }
            mIa.resetKeyBindingArrayAndHash();
            return;
        }
        if (((ac)b2).C < ySa.T && b2 instanceof zf) {
            a2.j.f(((zf)b2).f(), vRa.d);
            ((ac)b2).i = a2.j.J(Fha.getEnumOptions(((ac)b2).C));
        }
    }

    public void A() {
        int n2;
        qna_2 qna_22;
        qna_2 qna_23 = qna_22;
        (qna_22 = this).C = new qma((qna)qna_23, qna_23.g);
        (qna_22 = this).E.add(new ac(ZOa.x, (int)(qna_22.A / uqa.g - BQa.Q), (int)(qna_22.I - ITa.A), Jpa.Ha, kTa.j, oha.J(cra.g, new Object[uSa.E])));
        qna_22.k = new ac(Tqa.K, (int)(qna_22.A / uqa.g - BQa.Q + rRa.f), (int)(qna_22.I - ITa.A), Jpa.Ha, kTa.j, oha.J(Upa.ca, new Object[uSa.E]));
        qna_22.E.add(qna_22.k);
        qna_22.I = oha.J(Asa.Y, new Object[uSa.E]);
        int n3 = uSa.E;
        Fha[] fhaArray = A;
        int n4 = A.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            Object a2 = fhaArray[n2];
            if (((Fha)((Object)a2)).getEnumFloat()) {
                qna_22.E.add(new We(((Fha)((Object)a2)).returnEnumOrdinal(), (int)(qna_22.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), yOa.B + osa.c * (n3 >> vRa.d), (Fha)((Object)a2)));
            } else {
                qna_2 qna_24 = a2;
                qna_22.E.add(new zf(((Fha)((Object)a2)).returnEnumOrdinal(), (int)(qna_22.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), yOa.B + osa.c * (n3 >> vRa.d), (Fha)((Object)qna_24), qna_22.j.J((Fha)((Object)qna_24))));
            }
            ++n3;
            n5 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public qna_2(EC eC2, Cia cia2) {
        void b2;
        qna_2 a2;
        qna_2 c2 = cia2;
        qna_2 qna_22 = a2 = this;
        a2.I = KTa.T;
        a2.M = null;
        qna_22.i = b2;
        qna_22.j = c2;
    }

    static {
        Fha[] fhaArray = new Fha[yRa.d];
        fhaArray[uSa.E] = Fha.INVERT_MOUSE;
        fhaArray[vRa.d] = Fha.SENSITIVITY;
        fhaArray[uqa.g] = Fha.TOUCHSCREEN;
        A = fhaArray;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        int n4;
        void a2;
        void b2;
        void c2;
        qna_2 qna_22;
        block2: {
            qna_2 qna_23;
            int d2;
            qna_2 qna_24 = qna_22 = this;
            qna_24.i();
            qna_24.C.J((int)c2, (int)b2, (float)a2);
            qna_2.J((String)qna_24.I, (int)(qna_22.A / uqa.g), (int)Yqa.i, (int)pua.o);
            n4 = vRa.d;
            mIa[] mIaArray = qna_24.j.ja;
            int n5 = mIaArray.length;
            int n6 = d2 = uSa.E;
            while (n6 < n5) {
                mIa mIa2 = mIaArray[d2];
                if (mIa2.getKeyCode() != mIa2.getKeyCodeDefault()) {
                    n4 = uSa.E;
                    qna_23 = qna_22;
                    break block2;
                }
                n6 = ++d2;
            }
            qna_23 = qna_22;
        }
        qna_23.k.J = n4 == 0 ? vRa.d : uSa.E;
        super.J((int)c2, (int)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        int d2 = n4;
        qna_2 a2 = this;
        if (a2.M != null) {
            a2.j.J(a2.M, mra.Z + d2);
            a2.M = null;
            mIa.resetKeyBindingArrayAndHash();
            return;
        }
        if (d2 != 0 || !a2.C.J((int)c2, (int)b2, d2)) {
            super.J((int)c2, (int)b2, d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        qna_2 a2 = this;
        if (d2 != 0 || !a2.C.f((int)c2, (int)b2, d2)) {
            super.f((int)c2, (int)b2, d2);
        }
    }
}

