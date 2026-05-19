/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  Pd
 *  cEa
 *  hda
 *  hqa
 *  vL
 *  vRa
 */
import java.io.IOException;

public final class hda_2
implements KC<Pd> {
    private int k;
    private int j;
    private int J;
    private int A;
    private int I;

    public int d() {
        hda_2 a2;
        return a2.I;
    }

    public int C() {
        hda_2 a2;
        return a2.J;
    }

    public hda_2(vL vL2) {
        hda_2 b2 = vL2;
        hda_2 a2 = this;
        hda_2 hda_22 = b2;
        hda_2 hda_23 = a2;
        hda_2 hda_24 = b2;
        a2.J = hda_24.M();
        hda_23.j = Oz.f((double)(((vL)hda_24).la * hqa.ha));
        hda_23.k = Oz.f((double)(((vL)b2).Z * hqa.ha));
        a2.I = Oz.f((double)(((vL)hda_22).A * hqa.ha));
        if (hda_22 instanceof cEa) {
            a2.A = vRa.d;
        }
    }

    @Override
    public void J(Pd pd2) {
        hda_2 b2 = pd2;
        hda_2 a2 = this;
        b2.J((hda)a2);
    }

    public int l() {
        hda_2 a2;
        return a2.A;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        hda_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeByte(a2.A);
        b2.writeInt(a2.j);
        b2.writeInt(a2.k);
        b2.writeInt(a2.I);
    }

    public int f() {
        hda_2 a2;
        return a2.k;
    }

    @Override
    public void J(Lca lca) throws IOException {
        hda_2 a2;
        Lca b2 = lca;
        hda_2 hda_22 = a2 = this;
        Object object = b2;
        hda_2 hda_23 = a2;
        hda_23.J = b2.readVarIntFromBuffer();
        hda_23.A = b2.readByte();
        a2.j = ((Lca)object).readInt();
        hda_22.k = ((Lca)object).readInt();
        hda_22.I = b2.readInt();
    }

    public int J() {
        hda_2 a2;
        return a2.j;
    }

    public hda_2() {
        hda_2 a2;
    }
}

