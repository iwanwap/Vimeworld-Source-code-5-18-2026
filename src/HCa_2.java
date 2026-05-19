/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HCa
 *  Oz
 *  Pd
 *  hqa
 *  zEa
 */
import java.io.IOException;

public final class HCa_2
implements KC<Pd> {
    private int k;
    private int j;
    private int J;
    private int A;
    private int I;

    public int d() {
        HCa_2 a2;
        return a2.A;
    }

    public int C() {
        HCa_2 a2;
        return a2.J;
    }

    public HCa_2() {
        HCa_2 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        HCa_2 a2;
        Lca b2 = lca;
        HCa_2 hCa_2 = a2 = this;
        Object object = b2;
        HCa_2 hCa_22 = a2;
        hCa_22.k = b2.readVarIntFromBuffer();
        hCa_22.J = b2.readInt();
        a2.j = ((Lca)object).readInt();
        hCa_2.A = ((Lca)object).readInt();
        hCa_2.I = b2.readShort();
    }

    public int l() {
        HCa_2 a2;
        return a2.I;
    }

    public int f() {
        HCa_2 a2;
        return a2.j;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        HCa_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.k);
        ((Lca)object).writeInt(a2.J);
        b2.writeInt(a2.j);
        b2.writeInt(a2.A);
        b2.writeShort(a2.I);
    }

    public HCa_2(zEa zEa2) {
        HCa_2 a2;
        HCa_2 b2 = zEa2;
        HCa_2 hCa_2 = a2 = this;
        HCa_2 hCa_22 = b2;
        HCa_2 hCa_23 = a2;
        hCa_23.k = b2.M();
        hCa_23.J = Oz.f((double)(((zEa)b2).la * hqa.ha));
        a2.j = Oz.f((double)(((zEa)hCa_22).Z * hqa.ha));
        hCa_2.A = Oz.f((double)(((zEa)hCa_22).A * hqa.ha));
        hCa_2.I = b2.J();
    }

    @Override
    public void J(Pd pd2) {
        HCa_2 b2 = pd2;
        HCa_2 a2 = this;
        b2.J((HCa)a2);
    }

    public int J() {
        HCa_2 a2;
        return a2.k;
    }
}

