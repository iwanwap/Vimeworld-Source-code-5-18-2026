/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  KA
 *  Kpa
 *  Qsa
 *  Xia
 *  pKa
 *  pY
 *  pua
 *  vRa
 */
import java.util.List;

public abstract class MOa
extends qMa {
    public final List<Xia> I;
    public final Kpa B;

    public int l() {
        MOa a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, pKa pKa2) {
        void c2;
        int d2 = n3;
        MOa b2 = this;
        KA.J((String)(pY.UNDERLINE + Mqa.y + pY.BOLD + b2.J()), (int)(c2 + b2.E / uqa.g), (int)Math.min(b2.M + yRa.d, d2), (int)pua.o);
    }

    public Xia J(int n2) {
        int b2 = n2;
        MOa a2 = this;
        return a2.J().get(b2);
    }

    public int e() {
        MOa a2;
        return a2.J().size();
    }

    public List<Xia> J() {
        MOa a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public MOa(Kpa kpa2, int n2, int n3, List<Xia> list) {
        void a2;
        void c2;
        void b2;
        MOa d2;
        MOa e2 = kpa2;
        MOa mOa = d2 = this;
        MOa mOa2 = e2;
        void v2 = b2;
        super((Kpa)mOa2, (int)c2, (int)v2, fPa.i, (int)(v2 - Fpa.ca + AQa.P), Qsa.Ha);
        mOa.B = mOa2;
        d2.I = a2;
        mOa.b = uSa.E;
        d2.J(vRa.d != 0, (int)((float)((Kpa)e2).Ea.u * Ira.d));
    }

    public int M() {
        MOa a2;
        return a2.g - uua.p;
    }

    public abstract String J();
}

