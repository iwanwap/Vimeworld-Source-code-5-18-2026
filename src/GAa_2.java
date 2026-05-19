/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hCa
 *  vRa
 */
import java.io.IOException;

public final class GAa_2
extends hCa {
    public GAa_2() {
        GAa_2 a2;
        a2.C = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public GAa_2(int n2, byte by2, byte by3, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        GAa_2 a2;
        boolean bl3 = bl2;
        GAa_2 gAa_2 = a2 = this;
        super((int)d2);
        a2.M = c2;
        gAa_2.A = b2;
        gAa_2.C = vRa.d;
        gAa_2.I = e2;
    }

    public void J(Lca lca) throws IOException {
        GAa_2 a2;
        Lca b2 = lca;
        GAa_2 gAa_2 = a2 = this;
        Lca lca2 = b2;
        super.J(b2);
        a2.M = lca2.readByte();
        gAa_2.A = lca2.readByte();
        gAa_2.I = b2.readBoolean();
    }

    public void f(Lca lca) throws IOException {
        GAa_2 a2;
        Lca b2 = lca;
        GAa_2 gAa_2 = a2 = this;
        Lca lca2 = b2;
        super.f(lca2);
        lca2.writeByte(gAa_2.M);
        b2.writeByte(a2.A);
        b2.writeBoolean(a2.I);
    }
}

