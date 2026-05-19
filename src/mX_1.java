/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lqa
 *  Tpa
 *  mX
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mX_1 {
    private String[] J;
    private Random A;
    private static final mX I = new mX_1();

    public void J(long a2) {
        mX_1 b2;
        b2.A.setSeed(a2);
    }

    public mX_1() {
        mX_1 a2;
        mX_1 mX_12 = a2;
        a2.A = new Random();
        mX_12.J = Lqa.Y.split(Tpa.E);
    }

    public String J() {
        int n2;
        mX_1 mX_12 = this;
        int n3 = mX_12.A.nextInt(uqa.g) + yRa.d;
        Object a2 = Mqa.y;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            if (n2 > 0) {
                a2 = new StringBuilder().insert(5 >> 3, (String)a2).append(Tpa.E).toString();
            }
            mX_1 mX_13 = mX_12;
            a2 = new StringBuilder().insert(3 & 4, (String)a2).append(mX_13.J[mX_13.A.nextInt(mX_12.J.length)]).toString();
            n4 = ++n2;
        }
        return a2;
    }

    public static mX J() {
        return I;
    }
}

