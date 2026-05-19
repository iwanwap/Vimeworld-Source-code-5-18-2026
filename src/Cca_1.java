/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ida
 *  vRa
 */
import java.io.IOException;

public final class Cca_1
extends ida {
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Cca_1 a2 = this;
        b2.writeFloat(a2.M);
        b2.writeFloat(a2.j);
        super.f(b2);
    }

    public Cca_1() {
        Cca_1 a2;
        a2.k = vRa.d;
    }

    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Cca_1 a2 = this;
        Lca lca2 = b2;
        a2.M = lca2.readFloat();
        a2.j = lca2.readFloat();
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Cca_1(float f2, float f3, boolean bl) {
        void b2;
        void c2;
        Cca_1 a2;
        boolean d2 = bl;
        Cca_1 cca_1 = a2 = this;
        a2.M = c2;
        cca_1.j = b2;
        cca_1.J = d2;
        cca_1.k = vRa.d;
    }
}

