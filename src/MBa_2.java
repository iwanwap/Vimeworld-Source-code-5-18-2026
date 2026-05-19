/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MBa
 *  pua
 *  vRa
 */
public final class MBa_2
implements Comparable {
    private static final String __OBFID = "CL_00001498";
    public double field_76332_a;
    public double field_76330_b;
    public String field_76331_c;

    public int func_76329_a() {
        MBa_2 a2;
        return (a2.field_76331_c.hashCode() & gsa.S) + oQa.Y;
    }

    /*
     * WARNING - void declaration
     */
    public MBa_2(String string, double d2, double d3) {
        void a2;
        void b2;
        MBa_2 c2;
        String d4 = string;
        MBa_2 mBa_2 = c2 = this;
        c2.field_76331_c = d4;
        mBa_2.field_76332_a = b2;
        mBa_2.field_76330_b = a2;
    }

    public int compareTo(Object object) {
        Object b2 = object;
        MBa_2 a2 = this;
        return a2.compareTo((MBa)((MBa_2)b2));
    }

    public int compareTo(MBa mBa2) {
        MBa_2 b2 = mBa2;
        MBa_2 a2 = this;
        if (b2.field_76332_a < a2.field_76332_a) {
            return pua.o;
        }
        if (b2.field_76332_a > a2.field_76332_a) {
            return vRa.d;
        }
        return b2.field_76331_c.compareTo(a2.field_76331_c);
    }
}

