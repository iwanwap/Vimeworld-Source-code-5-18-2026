/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  QCa
 */
import java.io.IOException;

public final class QCa_1
implements KC<Pd> {
    private int[] I;

    public QCa_1(int ... nArray) {
        Object b2 = nArray;
        QCa_1 a2 = this;
        a2.I = (int[])b2;
    }

    public QCa_1() {
        QCa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int b2;
        void a2;
        QCa_1 qCa_1 = this;
        qCa_1.I = new int[a2.readVarIntFromBuffer()];
        int n2 = b2 = uSa.E;
        while (n2 < qCa_1.I.length) {
            qCa_1.I[b2++] = a2.readVarIntFromBuffer();
            n2 = b2;
        }
    }

    public int[] J() {
        QCa_1 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        QCa_1 b2 = pd2;
        QCa_1 a2 = this;
        b2.J((QCa)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        int b2;
        void a2;
        QCa_1 qCa_1 = this;
        a2.writeVarIntToBuffer(qCa_1.I.length);
        int n2 = b2 = uSa.E;
        while (n2 < qCa_1.I.length) {
            a2.writeVarIntToBuffer(qCa_1.I[b2++]);
            n2 = b2;
        }
    }
}

