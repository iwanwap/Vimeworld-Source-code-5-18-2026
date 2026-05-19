/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mba
 *  Pd
 */
import java.io.IOException;

public final class Mba_1
implements KC<Pd> {
    private long A;
    private long I;

    @Override
    public void J(Pd pd2) {
        Mba_1 b2 = pd2;
        Mba_1 a2 = this;
        b2.J((Mba)a2);
    }

    public long f() {
        Mba_1 a2;
        return a2.A;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Mba_1 a2 = this;
        b2.writeLong(a2.I);
        b2.writeLong(a2.A);
    }

    public long J() {
        Mba_1 a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Mba_1 a2;
        Lca b2 = lca;
        Mba_1 mba_1 = a2 = this;
        mba_1.I = b2.readLong();
        mba_1.A = b2.readLong();
    }

    /*
     * WARNING - void declaration
     */
    public Mba_1(long l2, long l3, boolean bl) {
        void d2;
        void b2;
        void c2;
        Mba_1 a2;
        boolean bl2 = bl;
        Mba_1 mba_1 = a2 = this;
        mba_1.I = c2;
        mba_1.A = b2;
        if (d2 == false) {
            Mba_1 mba_12 = a2;
            mba_12.A = -mba_12.A;
            if (mba_12.A == nqa.i) {
                a2.A = fqa.Da;
            }
        }
    }

    public Mba_1() {
        Mba_1 a2;
    }
}

