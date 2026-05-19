/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kna
 *  Kpa
 *  Lqa
 *  NTa
 *  PIa
 *  bSa
 *  cb
 *  pua
 *  vRa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public final class Oma_1
extends cb {
    public final /* synthetic */ cna A;
    private final List<oia> I;

    public Oma_1(cna cna2, Kpa kpa2) {
        Iterator a2;
        Object c2 = cna2;
        Oma_1 b2 = this;
        b2.A = c2;
        super((Kpa)a2, (int)((cna)((Object)c2)).A, (int)((cna)((Object)c2)).I, fPa.i, (int)(((cna)((Object)c2)).I - ysa.s), cna.f((cna)((Object)c2)).u * AQa.P);
        b2.I = Lists.newArrayList();
        b2.f(uSa.E != 0);
        for (oia oia2 : PIa.k.values()) {
            if (cna.J((cna)((Object)c2)).J(oia2.I) <= 0 && cna.J((cna)((Object)c2)).J(oia2.k) <= 0) continue;
            b2.I.add(oia2);
        }
    }

    public int e() {
        Oma_1 a2;
        return a2.I.size();
    }

    public void l() {
        Oma_1 a2;
        a2.A.i();
    }

    public boolean f(int n2) {
        int b2 = n2;
        Oma_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        int g322 = n2;
        Oma_1 f2 = this;
        oia g322 = f2.I.get(g322);
        String c2 = oha.J(new StringBuilder().insert(3 & 4, Lqa.H).append(PIa.J((int)g322.j)).append(tpa.N).toString(), new Object[uSa.E]);
        Oma_1 oma_1 = f2;
        int b2 = cna.J(oma_1.A).J(g322.I);
        int g322 = cna.J(oma_1.A).J(g322.k);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2;
        objectArray[vRa.d] = c2;
        String a2 = oha.J(Hta.L, objectArray);
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = c2;
        objectArray2[vRa.d] = g322;
        String string = oha.J(aua.Y, objectArray2);
        if (b2 == 0) {
            Object[] objectArray3 = new Object[vRa.d];
            objectArray3[uSa.E] = c2;
            a2 = oha.J(ysa.ja, objectArray3);
        }
        if (g322 == 0) {
            Object[] objectArray4 = new Object[vRa.d];
            objectArray4[uSa.E] = c2;
            string = oha.J(MRa.p, objectArray4);
        }
        Oma_1 oma_12 = f2;
        cna cfr_ignored_0 = oma_12.A;
        Oma_1 oma_13 = f2;
        cna.J((Kna)cna.l(oma_13.A), (String)c2, (int)(e2 + uqa.g - NTa.C), (int)(d2 + vRa.d), (int)pua.o);
        cna cfr_ignored_1 = oma_13.A;
        cna.J((Kna)cna.F(oma_12.A), (String)a2, (int)(e2 + uqa.g), (int)(d2 + vRa.d + cna.a((cna)f2.A).u), (int)(b2 == 0 ? bSa.L : uqa.A));
        Oma_1 oma_14 = f2;
        cna cfr_ignored_2 = oma_14.A;
        cna.J((Kna)cna.D(oma_14.A), (String)string, (int)(e2 + uqa.g), (int)(d2 + vRa.d + cna.J((cna)f2.A).u * uqa.g), (int)(g322 == 0 ? bSa.L : uqa.A));
    }

    public int C() {
        Oma_1 a2;
        return a2.e() * cna.d((cna)a2.A).u * AQa.P;
    }

    public void J(int n2, boolean bl, int n3, int n4) {
        int n5 = n4;
        Oma_1 a2 = this;
    }
}

