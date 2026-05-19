/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  Mda
 *  NCa
 *  Paa
 *  Waa
 *  bqa
 *  waa
 *  yDa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MFa_3
extends yDa {
    private Paa I;

    /*
     * WARNING - void declaration
     */
    public void J(waa waa2) {
        void a2;
        int b2;
        MFa_3 mFa_3 = this;
        int n2 = b2 = uSa.E;
        while (n2 < mFa_3.f()) {
            mFa_3.J(b2++, null);
            n2 = b2;
        }
        int n3 = b2 = uSa.E;
        while (n3 < a2.J()) {
            Waa waa3 = a2.J(b2);
            int n4 = waa3.J(kua.E) & osa.Ja;
            if (n4 >= 0 && n4 < mFa_3.f()) {
                mFa_3.J(n4, Mda.J((Waa)waa3));
            }
            n3 = ++b2;
        }
    }

    public void J(Paa paa2) {
        MFa_3 b2 = paa2;
        MFa_3 a2 = this;
        a2.I = b2;
    }

    public void f(Sx sx2) {
        Object b2 = sx2;
        MFa_3 a2 = this;
        if (a2.I != null) {
            a2.I.l();
        }
        super.f((Sx)((Object)b2));
    }

    public void J(Sx sx2) {
        Object b2 = sx2;
        MFa_3 a2 = this;
        if (a2.I != null) {
            a2.I.M();
        }
        super.J((Sx)((Object)b2));
        a2.I = null;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        MFa_3 a2 = this;
        if (a2.I != null && !a2.I.J((Sx)((Object)b2))) {
            return uSa.E != 0;
        }
        return super.J((Sx)((Object)b2));
    }

    public waa J() {
        int a2;
        MFa_3 mFa_3 = this;
        waa waa2 = new waa();
        int n2 = a2 = uSa.E;
        while (n2 < mFa_3.f()) {
            Mda mda2 = mFa_3.J(a2);
            if (mda2 != null) {
                Waa waa3;
                Waa waa4 = waa3 = new Waa();
                waa4.J(kua.E, (byte)a2);
                mda2.J(waa4);
                waa2.J((NCa)waa3);
            }
            n2 = ++a2;
        }
        return waa2;
    }

    public MFa_3() {
        super(bqa.B, uSa.E != 0, Lra.e);
        MFa_3 a2;
    }
}

