/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F
 *  FPa
 *  Gua
 *  IT
 *  Oqa
 *  Qqa
 *  Qsa
 *  Rua
 *  Ypa
 *  Yra
 *  Zta
 *  Zua
 *  ad
 *  kta
 *  pqa
 *  tS
 *  vQa
 *  vRa
 */
import java.util.Iterator;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tS_3
extends eF {
    private final nu J;
    private final IT A;
    private final BedrockModel I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        tS_3 tS_32 = this;
        tS_3 e2 = tS_32.J();
        if (e2 == null) {
            return;
        }
        ((F)e2).J((int)d2, (int)c2, (int)b2, (boolean)a2);
    }

    public IT J() {
        tS_3 a2;
        return a2.A;
    }

    public BedrockModel J() {
        tS_3 a2;
        return a2.I;
    }

    public tS_3(nu nu2) {
        tS_3 a2;
        Object b2 = nu2;
        tS_3 tS_32 = a2 = this;
        super(Oqa.COLUMN, AQa.P, uSa.E != 0);
        tS_32.J = b2;
        tS_32.I = (BedrockModel)nu.J((nu)((Object)b2)).J().model;
        tS_3 tS_33 = a2;
        tS_33.k = b2.l() - Zta.ba;
        tS_33.j = Qsa.w;
        tS_3 tS_34 = a2;
        tS_3 tS_35 = a2;
        tS_35.f((ad)new lS((tS)tS_35, Gua.x, uSa.E, Zua.Ja, dua.ca, kta.v, POa.o));
        tS_33.f((ad)new lS((tS)a2, Gua.x, vRa.d, Jqa.Y, dua.ca, kta.v, POa.o));
        tS_33.f((ad)new lS((tS)a2, Gua.x, uqa.g, Yra.k, dua.ca, kta.v, POa.o));
        tS_33.f((ad)new lS((tS)a2, Rua.C, uSa.E, dsa.d, Nra.e, vQa.q, POa.o));
        tS_33.f((ad)new lS((tS)a2, Rua.C, vRa.d, Qqa.H, Nra.e, vQa.q, POa.o));
        tS_33.f((ad)new lS((tS)a2, Rua.C, uqa.g, CRa.B, Nra.e, vQa.q, POa.o));
        tS_33.f((ad)new lS((tS)a2, Zqa.n, uSa.E, Ypa.k, xua.V, Hra.Ga, pqa.r));
        tS_33.f((ad)new lS((tS)a2, Zqa.n, vRa.d, yta.fa, xua.V, Hra.Ga, pqa.r));
        tS_33.f((ad)new lS((tS)a2, Zqa.n, uqa.g, xua.j, xua.V, Hra.Ga, pqa.r));
        tS_33.A = new IT((tS)a2);
        tS_33.f((ad)tS_33.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        Iterator iterator;
        void a2;
        void b2;
        tS_3 tS_32;
        tS_3 tS_33 = tS_32 = this;
        tS_32.k = tS_32.J.l() - Zta.ba;
        tS_32.j = Qsa.w;
        tS_33.f((int)b2, (int)a2);
        reference var3_4 = tS_32.J;
        Iterator iterator2 = iterator = tS_33.f.iterator();
        while (iterator2.hasNext()) {
            tS_3 c2 = (ad)iterator.next();
            iterator2 = iterator;
            tS_3 tS_34 = c2;
            tS_3 tS_35 = c2;
            tS_35.C((double)tS_32.I);
            tS_35.l((double)var3_4);
            tS_34.J(tS_32.k);
            tS_34.J((int)b2, (int)a2);
            var3_4 += c2.J() + FPa.T;
        }
    }
}

