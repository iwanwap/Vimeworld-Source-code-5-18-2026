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
public final class mj_3
extends JK {
    /*
     * WARNING - void declaration
     */
    public mj_3(t[] tArray, String string) throws Exception {
        void b2;
        Object c2 = string;
        mj_3 a2 = this;
        super((t[])b2, (String)c2);
    }

    public double J() {
        double d2;
        mj_3 a2;
        double d3 = a2.J(uSa.E).J();
        if (d2 < aSa.V) {
            return Math.ceil(d3);
        }
        return Math.floor(d3);
    }

    public int J() {
        return vRa.d;
    }
}

