/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hqa
 *  ib
 *  vRa
 */
import java.util.concurrent.ThreadLocalRandom;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ox_2
implements ib {
    private final int A;
    private final int I;

    public float J() {
        Ox_2 a2;
        Ox_2 ox_2 = a2;
        return Float.intBitsToFloat(ox_2.I ^ (ox_2.A ^ hqa.g));
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(float f2, float f3) {
        void b2;
        float c2 = f3;
        Ox_2 a2 = this;
        if (Math.abs(a2.J() - b2) < c2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        Ox_2 a2;
        return Float.hashCode(a2.J());
    }

    public long J() {
        Ox_2 a2;
        Ox_2 ox_2 = a2;
        return ox_2.I + ox_2.A + a2.I ^ a2.A;
    }

    public Ox_2(float f2) {
        float b2 = f2;
        Ox_2 a2 = this;
        a2.A = ThreadLocalRandom.current().nextInt();
        a2.I = Float.floatToIntBits(b2) ^ (a2.A ^ hqa.g);
    }
}

