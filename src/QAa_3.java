/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ida
 *  vRa
 */
import java.io.IOException;

public final class QAa_3
extends ida {
    public QAa_3() {
        QAa_3 a2;
        a2.A = vRa.d;
        a2.k = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public QAa_3(double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        QAa_3 a2;
        boolean bl3 = bl2;
        QAa_3 qAa_3 = a2 = this;
        QAa_3 qAa_32 = a2;
        QAa_3 qAa_33 = a2;
        QAa_3 qAa_34 = a2;
        qAa_34.i = f4;
        qAa_34.C = e2;
        qAa_33.I = d5;
        qAa_33.M = c2;
        qAa_32.j = b2;
        qAa_3.J = g2;
        qAa_32.k = vRa.d;
        qAa_3.A = vRa.d;
    }

    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        QAa_3 a2 = this;
        Lca lca2 = b2;
        QAa_3 qAa_3 = a2;
        Lca lca3 = b2;
        a2.i = lca3.readDouble();
        qAa_3.C = lca3.readDouble();
        qAa_3.I = b2.readDouble();
        a2.M = lca2.readFloat();
        a2.j = lca2.readFloat();
        super.J(b2);
    }

    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        QAa_3 a2 = this;
        b2.writeDouble(a2.i);
        b2.writeDouble(a2.C);
        b2.writeDouble(a2.I);
        b2.writeFloat(a2.M);
        b2.writeFloat(a2.j);
        super.f(b2);
    }
}

