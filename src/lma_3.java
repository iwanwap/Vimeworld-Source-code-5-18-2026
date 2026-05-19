/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  JQa
 *  Waa
 *  bpa
 *  lma
 *  poa
 *  uOa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lma_3
implements D {
    public int version;
    public String serverIP;
    private String serverIcon;
    public String gameVersion;
    private poa resourceMode;
    public String playerList;
    public String serverName;
    public String populationInfo;
    public long pingToServer;
    public String serverMOTD;
    private boolean field_181042_l;
    public boolean field_78841_f;

    public poa J() {
        lma_3 a2;
        return a2.resourceMode;
    }

    public Waa J() {
        lma_3 lma_32 = this;
        lma_3 a2 = new Waa();
        a2.J(dua.T, lma_32.serverName);
        lma_3 lma_33 = lma_32;
        a2.J(bpa.Fa, lma_33.serverIP);
        if (lma_33.serverIcon != null) {
            a2.J(JQa.V, lma_32.serverIcon);
        }
        if (lma_32.resourceMode == poa.ENABLED) {
            lma_3 lma_34 = a2;
            lma_34.J(KSa.s, vRa.d != 0);
            return lma_34;
        }
        if (lma_32.resourceMode == poa.DISABLED) {
            a2.J(KSa.s, uSa.E != 0);
        }
        return a2;
    }

    public boolean J() {
        lma_3 a2;
        return a2.field_181042_l;
    }

    public void J(String string) {
        String b2 = string;
        lma_3 a2 = this;
        a2.serverIcon = b2;
    }

    public static lma J(Waa waa2) {
        Waa waa3 = waa2;
        lma_3 a2 = new lma_3(waa3.J(dua.T), waa3.J(bpa.Fa), uSa.E != 0);
        if (waa3.J(JQa.V, Yqa.i)) {
            a2.J(waa3.J(JQa.V));
        }
        if (waa3.J(KSa.s, vRa.d)) {
            if (waa3.f(KSa.s)) {
                Object object = a2;
                ((lma_3)object).J(poa.ENABLED);
                return object;
            }
            Object object = a2;
            ((lma_3)object).J(poa.DISABLED);
            return object;
        }
        Object object = a2;
        ((lma_3)object).J(poa.PROMPT);
        return object;
    }

    public void J(lma lma2) {
        lma_3 a2;
        lma_3 b2 = lma2;
        lma_3 lma_32 = a2 = this;
        lma_3 lma_33 = b2;
        lma_3 lma_34 = a2;
        lma_34.serverIP = b2.serverIP;
        lma_34.serverName = b2.serverName;
        a2.J(lma_33.J());
        lma_32.serverIcon = lma_33.serverIcon;
        lma_32.field_181042_l = b2.field_181042_l;
    }

    /*
     * WARNING - void declaration
     */
    public lma_3(String string, String string2, boolean bl) {
        void b2;
        void c2;
        lma_3 a2;
        boolean d2 = bl;
        lma_3 lma_32 = a2 = this;
        lma_3 lma_33 = a2;
        a2.version = uOa.F;
        lma_33.gameVersion = nua.D;
        lma_33.resourceMode = poa.PROMPT;
        lma_33.serverName = c2;
        lma_32.serverIP = b2;
        lma_32.field_181042_l = d2;
    }

    public String J() {
        lma_3 a2;
        return a2.serverIcon;
    }

    public void J(poa poa2) {
        lma_3 b2 = poa2;
        lma_3 a2 = this;
        a2.resourceMode = b2;
    }
}

