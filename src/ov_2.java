/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nx
 *  Oz
 *  Wsa
 *  gw
 *  oqa
 *  qta
 *  vRa
 */
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ov_2
extends RU {
    private double field_82673_e;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        ov_2 a2 = this;
        if (a2.rand.nextDouble() < a2.field_82673_e && a2.rand.nextInt(Fua.J) < Math.max(Math.abs((int)b2), Math.abs(c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ov_2(Map<String, String> map) {
        Map<String, String> b2 = map;
        ov_2 a2 = this;
        a2.field_82673_e = Wsa.I;
        for (Map.Entry entry : b2.entrySet()) {
            if (!((String)entry.getKey()).equals(qta.P)) continue;
            a2.field_82673_e = Oz.J((String)((String)entry.getValue()), (double)a2.field_82673_e);
        }
    }

    @Override
    public String J() {
        return oqa.N;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Nx J(int n2, int n3) {
        void b2;
        ov_2 a2;
        int c2 = n3;
        ov_2 ov_22 = a2 = this;
        return new gw(ov_22.worldObj, ov_22.rand, (int)b2, c2);
    }

    public ov_2() {
        ov_2 a2;
        a2.field_82673_e = Wsa.I;
    }
}

