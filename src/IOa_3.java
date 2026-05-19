/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kna
 *  Kpa
 *  NTa
 *  Tz
 *  Wsa
 *  aX
 *  cb
 *  vRa
 *  ysa
 */
public final class IOa_3
extends cb {
    public final /* synthetic */ cna I;

    public boolean f(int n2) {
        int b2 = n2;
        IOa_3 a2 = this;
        return uSa.E != 0;
    }

    public void J(int n2, boolean bl2, int n3, int n4) {
        int n5 = n4;
        IOa_3 a2 = this;
    }

    public int e() {
        return Tz.V.size();
    }

    /*
     * WARNING - void declaration
     */
    public IOa_3(cna cna2, Kpa kpa2) {
        void a2;
        IOa_3 b2;
        Object c2 = cna2;
        IOa_3 iOa_3 = b2 = this;
        iOa_3.I = c2;
        super((Kpa)a2, (int)((cna)((Object)c2)).A, (int)((cna)((Object)c2)).I, fPa.i, (int)(((cna)((Object)c2)).I - ysa.s), NTa.C);
        iOa_3.f(uSa.E != 0);
    }

    public int C() {
        IOa_3 a2;
        return a2.e() * NTa.C;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        void f2;
        int n8 = n5;
        IOa_3 c2 = this;
        Object g2 = (aX)Tz.V.get((int)f2);
        IOa_3 iOa_3 = c2;
        cna cfr_ignored_0 = iOa_3.I;
        cna.J((Kna)cna.i(iOa_3.I), (String)g2.f().f(), (int)(e2 + uqa.g), (int)(d2 + vRa.d), (int)(f2 % uqa.g == false ? Wsa.K : uqa.A));
        aX aX2 = g2;
        g2 = aX2.J(cna.J(c2.I).J(aX2));
        IOa_3 iOa_32 = c2;
        cna cfr_ignored_1 = iOa_32.I;
        Object object = g2;
        cna.J((Kna)cna.G(iOa_32.I), (String)object, (int)(e2 + uqa.g + xra.ja - cna.I(c2.I).J((String)object)), (int)(d2 + vRa.d), (int)(f2 % uqa.g == false ? Wsa.K : uqa.A));
    }

    public void l() {
        IOa_3 a2;
        a2.I.i();
    }
}

