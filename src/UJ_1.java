/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JK
 *  aSa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UJ_1
extends JK {
    public int J() {
        return yRa.d;
    }

    public static double J(int n2, double d2, double d3) {
        int c2;
        double b2;
        double a2;
        int n3 = n2;
        double d4 = Math.max(a2, b2);
        b2 = Math.min(a2, b2);
        a2 = aSa.V;
        int n4 = c2 = uSa.E;
        while (n4 < n3) {
            a2 += Math.random() * (d4 - b2) + b2;
            n4 = ++c2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public UJ_1(t[] tArray, String string) throws Exception {
        void b2;
        Object c2 = string;
        UJ_1 a2 = this;
        super((t[])b2, (String)c2);
    }

    public double J() {
        UJ_1 a2;
        return UJ_1.J((int)a2.J(uSa.E).J(), a2.J(vRa.d).J(), a2.J(uqa.g).J());
    }
}

