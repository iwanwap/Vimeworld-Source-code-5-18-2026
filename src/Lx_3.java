/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ib
 *  vRa
 */
import java.util.concurrent.ThreadLocalRandom;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lx_3
implements ib {
    private final long A;
    private final long I;

    public boolean equals(double b2, double a2) {
        Lx_3 c2;
        if (Math.abs(c2.J() - b2) < a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double J() {
        Lx_3 a2;
        return Double.longBitsToDouble(a2.I ^ (a2.A ^ mSa.H));
    }

    public int hashCode() {
        Lx_3 a2;
        return Double.hashCode(a2.J());
    }

    public long J() {
        Lx_3 a2;
        return a2.I + a2.A + a2.I ^ a2.A;
    }

    public Lx_3(double a2) {
        Lx_3 b2;
        Lx_3 lx_3 = b2;
        lx_3.A = ThreadLocalRandom.current().nextLong();
        lx_3.I = Double.doubleToLongBits(a2) ^ (b2.A ^ mSa.H);
    }
}

