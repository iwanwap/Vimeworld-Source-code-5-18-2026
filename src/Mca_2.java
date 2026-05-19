/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hCa
 *  vRa
 */
import java.io.IOException;

public final class Mca_2
extends hCa {
    /*
     * WARNING - void declaration
     */
    public Mca_2(int n2, byte by2, byte by3, byte by4, byte by5, byte by6, boolean bl) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        Mca_2 a2;
        boolean bl2 = bl;
        Mca_2 mca_2 = a2 = this;
        Mca_2 mca_22 = a2;
        Mca_2 mca_23 = a2;
        super((int)g2);
        mca_23.j = f2;
        mca_23.J = e2;
        mca_22.i = d2;
        mca_22.M = c2;
        mca_2.A = b2;
        mca_2.I = h2;
        mca_2.C = vRa.d;
    }

    public Mca_2() {
        Mca_2 a2;
        a2.C = vRa.d;
    }

    public void f(Lca lca) throws IOException {
        Mca_2 a2;
        Lca b2 = lca;
        Mca_2 mca_2 = a2 = this;
        Lca lca2 = b2;
        super.f(lca2);
        lca2.writeByte(mca_2.j);
        b2.writeByte(a2.J);
        b2.writeByte(a2.i);
        b2.writeByte(a2.M);
        b2.writeByte(a2.A);
        b2.writeBoolean(a2.I);
    }

    public void J(Lca lca) throws IOException {
        Mca_2 a2;
        Lca b2 = lca;
        Mca_2 mca_2 = a2 = this;
        Lca lca2 = b2;
        Mca_2 mca_22 = a2;
        Lca lca3 = b2;
        super.J(b2);
        a2.j = lca3.readByte();
        mca_22.J = lca3.readByte();
        mca_22.i = b2.readByte();
        a2.M = lca2.readByte();
        mca_2.A = lca2.readByte();
        mca_2.I = b2.readBoolean();
    }
}

