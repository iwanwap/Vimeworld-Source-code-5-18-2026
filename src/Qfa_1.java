/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yda
 *  Yra
 *  gFa
 *  kta
 *  pqa
 *  vRa
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qfa_1
extends gFa {
    private Yda I;

    public void l() {
        Qfa_1 qfa_1;
        Qfa_1 qfa_12 = qfa_1 = this;
        Random a2 = qfa_12.I.J();
        double d2 = qfa_12.I.la + (double)((a2.nextFloat() * kta.v - pqa.r) * Yra.i);
        double d3 = qfa_12.I.Z + (double)((a2.nextFloat() * kta.v - pqa.r) * Yra.i);
        double d4 = qfa_12.I.A + (double)((a2.nextFloat() * kta.v - pqa.r) * Yra.i);
        qfa_12.I.J().J(d2, d3, d4, oua.i);
    }

    public Qfa_1(Yda yda2) {
        Qfa_1 a2;
        Qfa_1 b2 = yda2;
        Qfa_1 qfa_1 = a2 = this;
        qfa_1.I = b2;
        qfa_1.J(vRa.d);
    }

    public boolean l() {
        return uSa.E != 0;
    }

    public boolean f() {
        Qfa_1 qfa_1 = this;
        Qfa_1 a2 = qfa_1.I.J();
        if (!a2.J()) {
            return vRa.d != 0;
        }
        Qfa_1 qfa_12 = a2;
        double d2 = qfa_12.f() - qfa_1.I.la;
        double d3 = qfa_12.l() - qfa_1.I.Z;
        double d4 = qfa_12.J() - qfa_1.I.A;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        d2 = d5 * d5 + d6 * d6 + d7 * d7;
        if (d2 < oua.i || d2 > MRa.b) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

