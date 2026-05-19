/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hCa
 */
import java.io.IOException;

public final class ZCa
extends hCa {
    public void f(Lca lca) throws IOException {
        ZCa a2;
        Lca b2 = lca;
        ZCa zCa = a2 = this;
        Lca lca2 = b2;
        super.f(lca2);
        lca2.writeByte(zCa.j);
        b2.writeByte(a2.J);
        b2.writeByte(a2.i);
        b2.writeBoolean(a2.I);
    }

    public void J(Lca lca) throws IOException {
        ZCa a2;
        Lca b2 = lca;
        ZCa zCa = a2 = this;
        Lca lca2 = b2;
        super.J(b2);
        a2.j = b2.readByte();
        a2.J = lca2.readByte();
        zCa.i = lca2.readByte();
        zCa.I = b2.readBoolean();
    }

    /*
     * WARNING - void declaration
     */
    public ZCa(int n2, byte by, byte by2, byte by3, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        ZCa a2;
        boolean bl2 = bl;
        ZCa zCa = a2 = this;
        ZCa zCa2 = a2;
        super((int)e2);
        zCa2.j = d2;
        zCa2.J = c2;
        zCa.i = b2;
        zCa.I = f2;
    }

    public ZCa() {
        ZCa a2;
    }
}

