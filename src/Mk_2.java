/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JK
 *  vRa
 */
import java.util.Random;

public class Mk_2
extends JK {
    public Random random;

    public double J() {
        double d2;
        Mk_2 mk_2;
        Mk_2 a2;
        if (a2.args.length >= yRa.d) {
            Mk_2 mk_22 = a2;
            Mk_2 mk_23 = a2;
            mk_2 = mk_23;
            mk_22.random.setSeed((long)mk_23.J(uqa.g).J());
            d2 = mk_22.random.nextDouble();
        } else {
            d2 = Math.random();
            mk_2 = a2;
        }
        if (mk_2.args.length >= uqa.g) {
            Mk_2 mk_24 = a2;
            double d3 = mk_24.J(uSa.E).J();
            double d4 = mk_24.J(vRa.d).J();
            double d5 = Math.min(d3, d4);
            d3 = Math.max(d3, d4);
            d2 = d2 * (d3 - d5) + d5;
            return d2;
        }
        if (a2.args.length >= vRa.d) {
            d2 *= a2.J(uSa.E).J();
        }
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public Mk_2(t[] tArray, String string) throws Exception {
        void b2;
        Object c2 = string;
        Mk_2 a2 = this;
        super((t[])b2, (String)c2);
        Mk_2 mk_2 = a2;
        mk_2.random = new Random();
    }
}

