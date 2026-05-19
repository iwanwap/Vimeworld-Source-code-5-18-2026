/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SRa
 *  aSa
 *  vRa
 *  yk
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class wk_3
implements t {
    private String stringValue;
    private double doubleValue;

    @Override
    public String J() {
        wk_3 a2;
        return a2.stringValue;
    }

    @Override
    public t J() {
        wk_3 a2;
        return a2;
    }

    @Override
    public void J(double a2) {
        wk_3 b2;
        wk_3 wk_32 = b2;
        wk_32.doubleValue = a2;
        wk_32.stringValue = null;
    }

    public wk_3(double a2) {
        wk_3 b2;
        b2.doubleValue = a2;
    }

    @Override
    public boolean f() {
        wk_3 a2;
        if (a2.stringValue == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public wk_3(String string) {
        String b2 = string;
        wk_3 a2 = this;
        a2.stringValue = b2;
    }

    @Override
    public void J(String string) {
        wk_3 a2;
        String b2 = string;
        wk_3 wk_32 = a2 = this;
        wk_32.doubleValue = aSa.V;
        wk_32.stringValue = b2;
    }

    public String toString() {
        wk_3 a2;
        if (a2.stringValue == null) {
            return String.valueOf(a2.doubleValue);
        }
        return new StringBuilder().insert(2 & 5, SRa.b).append(a2.stringValue).append(SRa.b).toString();
    }

    @Override
    public boolean J() {
        wk_3 a2;
        if (a2.f()) {
            return yk.isTrue((double)a2.doubleValue);
        }
        return a2.stringValue.equalsIgnoreCase(oQa.l);
    }

    @Override
    public double J() {
        wk_3 a2;
        return a2.doubleValue;
    }
}

