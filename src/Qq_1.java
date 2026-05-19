/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Gua
 *  JPa
 *  Kh
 *  NTa
 *  Np
 *  Ppa
 *  SQ
 *  TPa
 *  Vq
 *  YSa
 *  ZOa
 *  aSa
 *  fR
 *  jsa
 *  k
 *  ml
 *  nQa
 *  tp
 *  tq
 *  uRa
 *  vP
 *  vRa
 *  ysa
 */
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qq_1
extends tp {
    private final fr A;
    private final Vq I;

    private tp J() {
        int n2;
        Qq_1 qq_1 = this;
        tp tp2 = new tp((k)qq_1, jsa.J, vqa.T, vqa.T);
        tp2.M.J(RJ.f((Bp)tp2, dsa.F));
        tp2.i.J(RJ.J((Bp)tp2, TPa.d));
        tp2.j = vRa.d;
        tp2.c = yG.TOP_LEFT;
        Object a2 = OT.i.k;
        tq[] tqArray = new tq[uqa.g];
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = TPa.q;
        stringArray[vRa.d] = Ppa.W;
        tqArray[uSa.E] = new tq((k)tp2, eua.u, fR.J((vP)a2), OQ.J((vP)a2)).J(stringArray);
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = Bta.Ia;
        stringArray2[vRa.d] = NSa.C;
        stringArray2[uqa.g] = nQa.o;
        tqArray[vRa.d] = new tq((k)tp2, ysa.u, Np.J((vP)a2), SQ.J((vP)a2)).J(stringArray2);
        a2 = Arrays.asList(tqArray);
        int n3 = n2 = uSa.E;
        while (n3 < a2.size()) {
            tq tq2;
            tq tq3 = tq2 = (tq)a2.get(n2);
            tq3.c = yG.TOP_LEFT;
            tq tq4 = tq2;
            tq3.d.J(RJ.f((Bp)tq4, YSa.H));
            int n4 = n2 / uqa.g * (n2 * NTa.C);
            tq4.b.J(n4);
            tp2.l((Bp)tq3);
            n3 = ++n2;
        }
        return tp2;
    }

    public fr J() {
        Qq_1 a2;
        return a2.A;
    }

    public static /* synthetic */ void f(vP vP2, Boolean bl) {
        Boolean b2 = bl;
        vP a2 = vP2;
        a2.J = b2;
    }

    public Vq J() {
        Qq_1 a2;
        return a2.I;
    }

    public static /* synthetic */ boolean f(vP a2) {
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public Qq_1(k k2, String string) {
        void a2;
        Qq_1 b2;
        Qq_1 c2 = k2;
        Qq_1 qq_1 = b2 = this;
        super((k)c2, (String)a2, dua.ca, dua.ca);
        qq_1.j = vRa.d;
        qq_1.W = vRa.d;
        c2 = new tp((k)b2, JPa.H, JPa.N, JPa.N);
        c2.M.J(RJ.f((Bp)((Object)c2), Jsa.R));
        c2.i.J(RJ.J((Bp)((Object)c2), dsa.F));
        c2.c = yG.LEFT;
        c2.o = Tq.VERTICAL;
        c2.J = Gua.V;
        c2.L = uSa.E;
        c2.j = vRa.d;
        Qq_1 qq_12 = b2;
        qq_1.I = new Vq((k)c2, rQa.t);
        qq_1.I.c = yG.TOP_LEFT;
        Qq_1 qq_13 = c2;
        qq_13.l((Bp)b2.I);
        qq_1.l((Bp)((Object)qq_13));
        Qq_1 qq_14 = c2 = new tp((k)b2, ZOa.c, JPa.N, JPa.N);
        Qq_1 qq_15 = c2;
        qq_14.M.J(RJ.f((Bp)((Object)qq_15), Jsa.R));
        qq_14.i.J(RJ.J((Bp)((Object)c2), dsa.F));
        qq_15.d.J(eua.C);
        qq_14.c = yG.RIGHT;
        qq_14.o = Tq.VERTICAL;
        qq_14.J = Gua.V;
        c2.L = uSa.E;
        c2.j = vRa.d;
        c2.l((Bp)b2.J());
        qq_1.A = new fr((k)c2, gua.k);
        qq_1.A.v = new ml(jsa.J, yG.BOTTOM_LEFT);
        qq_1.A.v.j = yG.BOTTOM_RIGHT;
        Qq_1 qq_16 = c2;
        qq_16.l(b2.A);
        qq_1.l((Bp)((Object)qq_16));
    }

    public static /* synthetic */ void J(vP vP2, Boolean bl) {
        Boolean b2 = bl;
        vP a2 = vP2;
        a2.A = b2;
    }

    public static /* synthetic */ boolean J(vP a2) {
        return a2.J;
    }

    public void J(long a2) {
        Qq_1 b2;
        Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)Bpa.K, (double)uRa.I);
        super.J(a2);
    }
}

