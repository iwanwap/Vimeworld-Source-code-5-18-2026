/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RQa
 *  ib
 */
import java.util.concurrent.ThreadLocalRandom;

public final class nv
implements ib {
    private final long A;
    private final long I;

    public long f() {
        nv a2;
        return a2.I ^ (a2.A ^ RQa.ca);
    }

    public int hashCode() {
        nv a2;
        return Long.hashCode(a2.f());
    }

    public long J() {
        nv a2;
        return a2.I + a2.A + a2.I ^ a2.A;
    }

    public nv(long a2) {
        nv b2;
        nv nv2 = b2;
        nv2.A = ThreadLocalRandom.current().nextLong();
        nv2.I = a2 ^ (b2.A ^ RQa.ca);
    }
}

