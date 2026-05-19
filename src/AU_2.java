/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AP
 *  AU
 *  CR
 *  Fr
 *  JPa
 *  Kpa
 *  RR
 *  Wsa
 *  fp
 *  jt
 *  k
 *  kta
 *  sq
 *  uw
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AU_2
extends Bp {
    private final Kpa M;
    public static final AU k = new AU_2();
    private String j;
    private float J;
    public static final String A = "##TNetworkInfoHud";

    public AU_2() {
        AU_2 a2;
        AU_2 aU_2 = a2;
        super((k)OT.i.F, opa.M);
        aU_2.M = Kpa.J();
        aU_2.d.J(kta.v);
        aU_2.b.J(kta.v);
        aU_2.c = yG.TOP_RIGHT;
        AU_2 aU_22 = a2;
        sq[] sqArray = new sq[uqa.g];
        sqArray[uSa.E] = new fp().J(vRa.d != 0);
        sqArray[vRa.d] = new AP().J(uSa.E != 0);
        aU_2.w = new Fr(CR.HUD, sqArray);
    }

    @Override
    public boolean J(long a2) {
        AU_2 b2;
        if (super.J(a2)) {
            AU_2 aU_2;
            if (b2.M.c != null && b2.M.c.J() != null) {
                aU_2 = b2;
                b2.j = Pua.g + Kpa.J() + Mqa.z + b2.M.c.J().f();
            } else {
                aU_2 = b2;
                b2.j = new StringBuilder().insert(3 >> 2, Pua.g).append(Kpa.J()).toString();
            }
            aU_2.J = b2.M.Ea.J(b2.j);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void A() {
        jt.l.J(yG.TOP_RIGHT);
        RR.J((Bp)k, (boolean)jt.k);
    }

    @Override
    public float e() {
        AU_2 a2;
        return a2.J;
    }

    @Override
    public void J(long a2) {
        AU_2 b2;
        if (uw.p) {
            return;
        }
        b2.M.Ea.J(b2.j, JPa.N, JPa.N, Wsa.K);
    }

    @Override
    public float d() {
        AU_2 a2;
        return a2.M.Ea.u;
    }
}

