/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AP
 *  CR
 *  Fr
 *  Kpa
 *  Ot
 *  fp
 *  jt
 *  mS
 *  pS
 *  qu
 *  sQ
 *  sq
 *  vRa
 */
import java.util.EnumMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gs_3 {
    private yG M;
    public final Map<yG, Bp> k;
    private static final Fr j;
    private Bp J;
    private static final Fr A;
    private static final Fr I;

    public gs_3() {
        gs_3 a2;
        gs_3 gs_32 = a2;
        gs_32.k = new EnumMap<yG, Bp>(yG.class);
        a2.J(yG.LEFT, (Bp)pS.M);
        gs_32.J(yG.TOP_RIGHT, (Bp)mS.C);
        gs_32.J(yG.BOTTOM_RIGHT, (Bp)qu.J);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Bp bp2) {
        gs_3 gs_32;
        void a2;
        gs_3 gs_33 = this;
        Object b2 = a2.c;
        if (gs_33.J == null || !gs_33.J.equals(a2)) {
            gs_33.M = b2;
            gs_33.J = a2;
        }
        yG yG2 = gs_3.J((yG)((Object)b2));
        if (gs_33.M == b2) {
            Bp bp3 = gs_33.k.get((Object)yG2);
            gs_3 gs_34 = gs_33;
            gs_32 = gs_34;
            gs_34.J((yG)((Object)b2), bp3);
        } else {
            gs_3 gs_35 = gs_33;
            Bp bp4 = gs_35.k.get((Object)gs_35.M);
            if (gs_33.M != yG2) {
                Bp bp5 = gs_33.k.get((Object)yG2);
                gs_3 gs_36 = gs_33;
                gs_36.J(gs_36.M, bp5);
            }
            gs_3 gs_37 = gs_33;
            gs_32 = gs_37;
            gs_37.J((yG)((Object)b2), bp4);
        }
        gs_32.J(yG2, (Bp)a2);
    }

    static {
        sq[] sqArray = new sq[yRa.d];
        sqArray[uSa.E] = new fp().J(vRa.d != 0);
        sqArray[vRa.d] = new sQ().J(uSa.E != 0);
        sqArray[uqa.g] = new AP().J(uSa.E != 0);
        j = new Fr(CR.HUD, sqArray);
        sq[] sqArray2 = new sq[uqa.g];
        sqArray2[uSa.E] = new fp().J(vRa.d != 0);
        sqArray2[vRa.d] = new AP().J(uSa.E != 0);
        I = new Fr(CR.HUD, sqArray2);
        sq[] sqArray3 = new sq[vRa.d];
        sqArray3[uSa.E] = new fp().J(vRa.d != 0);
        A = new Fr(CR.HUD, sqArray3);
    }

    /*
     * WARNING - void declaration
     */
    public void J(yG yG2) {
        void a2;
        gs_3 gs_32 = this;
        Bp b2 = gs_32.k.get(a2);
        if (b2 != null) {
            gs_32.J((yG)a2, b2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static yG J(yG a2) {
        switch (Ot.I[a2.ordinal()]) {
            case 1: {
                return yG.TOP_RIGHT;
            }
            case 2: {
                return yG.BOTTOM_RIGHT;
            }
            case 3: {
                return yG.LEFT;
            }
        }
        throw new IllegalArgumentException();
    }

    /*
     * WARNING - void declaration
     */
    public void J(yG yG2, Bp bp2) {
        void a2;
        Object c2 = yG2;
        gs_3 b2 = this;
        a2.w = c2 == yG.LEFT ? j : (c2 == yG.TOP_RIGHT ? I : A);
        a2.c = c2;
        a2.b.J((jt.k && c2 == yG.TOP_RIGHT ? Kpa.J().Ea.u : uSa.E) + uqa.g);
        b2.k.put((yG)((Object)c2), (Bp)a2);
    }
}

