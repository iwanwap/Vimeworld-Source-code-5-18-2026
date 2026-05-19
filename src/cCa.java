/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  kba
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cCa
implements KC<Pd> {
    private byte k;
    private byte j;
    private int J;
    private byte A;
    private int I;

    public int f() {
        cCa a2;
        return a2.J;
    }

    public int J() {
        cCa a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public cCa(int n2, kba kba2) {
        cCa cCa2;
        void b2;
        cCa c2 = kba2;
        cCa a2 = this;
        cCa cCa3 = c2;
        cCa cCa4 = a2;
        cCa4.J = b2;
        cCa4.A = (byte)(c2.f() & osa.Ja);
        a2.j = (byte)(cCa3.J() & osa.Ja);
        if (cCa3.l() > BQa.h) {
            cCa2 = a2;
            a2.I = BQa.h;
        } else {
            cCa2 = a2;
            a2.I = c2.l();
        }
        cCa2.k = (byte)(c2.J() ? vRa.d : uSa.E);
    }

    public boolean f() {
        cCa a2;
        if (a2.I == BQa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public byte f() {
        cCa a2;
        return a2.A;
    }

    public cCa() {
        cCa a2;
    }

    public byte J() {
        cCa a2;
        return a2.j;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        cCa a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeByte(a2.A);
        b2.writeByte(a2.j);
        Object object2 = b2;
        ((Lca)object2).writeVarIntToBuffer(a2.I);
        ((Lca)object2).writeByte(a2.k);
    }

    public boolean J() {
        cCa a2;
        if (a2.k != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(Pd pd2) {
        cCa b2 = pd2;
        cCa a2 = this;
        b2.J(a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        cCa a2;
        Lca b2 = lca;
        cCa cCa2 = a2 = this;
        Object object = b2;
        cCa cCa3 = a2;
        cCa3.J = b2.readVarIntFromBuffer();
        cCa3.A = b2.readByte();
        a2.j = ((Lca)object).readByte();
        cCa2.I = ((Lca)object).readVarIntFromBuffer();
        cCa2.k = b2.readByte();
    }
}

