/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ib
 */
import java.util.concurrent.ThreadLocalRandom;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QW_1
implements ib {
    private final int A;
    private final int I;

    public int hashCode() {
        QW_1 a2;
        return Integer.hashCode(a2.J());
    }

    public QW_1(int n2) {
        int b2 = n2;
        QW_1 a2 = this;
        a2.A = ThreadLocalRandom.current().nextInt();
        a2.I = b2 ^ (a2.A ^ sSa.I);
    }

    public long J() {
        QW_1 a2;
        QW_1 qW_1 = a2;
        return qW_1.I + qW_1.A + a2.I ^ a2.A;
    }

    public int J() {
        QW_1 a2;
        QW_1 qW_1 = a2;
        return qW_1.I ^ (qW_1.A ^ sSa.I);
    }
}

