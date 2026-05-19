/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  Gl
 *  dFa
 *  vRa
 *  zfa
 */
public final class mia_2
extends dFa {
    public Gl A;
    public DDa I;

    public boolean f() {
        mia_2 mia_22 = this;
        mia_2 a2 = mia_22.I.J();
        if (a2 == null) {
            return uSa.E != 0;
        }
        mia_22.A = a2.J((Gl)mia_22.I);
        if (mia_22.A instanceof zfa) {
            return uSa.E != 0;
        }
        mia_2 mia_23 = mia_22;
        if (!mia_23.J(mia_23.A, uSa.E != 0)) {
            if (mia_22.j.J().nextInt(kTa.j) == 0) {
                mia_2 mia_24 = mia_22;
                mia_22.A = a2.J((Gl)mia_24.I);
                return mia_22.J(mia_24.A, uSa.E != 0);
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public mia_2(DDa dDa2) {
        mia_2 a2;
        mia_2 b2 = dDa2;
        mia_2 mia_22 = a2 = this;
        super((bga)((Object)b2), uSa.E != 0, vRa.d != 0);
        mia_22.I = b2;
        mia_22.J(vRa.d);
    }

    public void l() {
        mia_2 a2;
        mia_2 mia_22 = a2;
        a2.I.C(mia_22.A);
        super.l();
    }
}

