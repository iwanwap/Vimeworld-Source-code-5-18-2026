/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ida
 *  vRa
 */
import java.io.IOException;

public final class dAa_2
extends ida {
    public dAa_2() {
        dAa_2 a2;
        a2.A = vRa.d;
    }

    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        dAa_2 a2 = this;
        Lca lca2 = b2;
        a2.i = b2.readDouble();
        a2.C = lca2.readDouble();
        a2.I = lca2.readDouble();
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public dAa_2(double d2, double d3, double d4, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d5;
        dAa_2 a2;
        boolean bl3 = bl2;
        dAa_2 dAa_22 = a2 = this;
        dAa_2 dAa_23 = a2;
        dAa_23.i = d5;
        dAa_23.C = c2;
        dAa_22.I = b2;
        dAa_22.J = e2;
        dAa_22.A = vRa.d;
    }

    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        dAa_2 a2 = this;
        b2.writeDouble(a2.i);
        b2.writeDouble(a2.C);
        b2.writeDouble(a2.I);
        super.f(b2);
    }
}

