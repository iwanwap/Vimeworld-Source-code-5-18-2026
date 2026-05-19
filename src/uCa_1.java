/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Mda
 *  Oz
 *  Pd
 *  eAa
 *  hqa
 *  uCa
 */
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uCa_1
implements KC<Pd> {
    private byte E;
    private byte m;
    private hga C;
    private int i;
    private List<TIa> M;
    private int k;
    private int j;
    private int J;
    private int A;
    private UUID I;

    @Override
    public void J(Pd pd2) {
        uCa_1 b2 = pd2;
        uCa_1 a2 = this;
        b2.J((uCa)a2);
    }

    public uCa_1() {
        uCa_1 a2;
    }

    public byte f() {
        uCa_1 a2;
        return a2.E;
    }

    public byte J() {
        uCa_1 a2;
        return a2.m;
    }

    public uCa_1(Sx sx2) {
        uCa_1 a2;
        Sx b2 = sx2;
        uCa_1 uCa_12 = a2 = this;
        Sx sx3 = b2;
        uCa_1 uCa_13 = a2;
        Sx sx4 = b2;
        uCa_1 uCa_14 = a2;
        uCa_14.k = b2.M();
        uCa_14.I = b2.J().getId();
        a2.j = Oz.f((double)(sx4.la * hqa.ha));
        uCa_13.A = Oz.f((double)(sx4.Z * hqa.ha));
        uCa_13.i = Oz.f((double)(b2.A * hqa.ha));
        a2.m = (byte)(sx3.X * Fpa.q / CRa.ja);
        uCa_12.E = (byte)(sx3.d * Fpa.q / CRa.ja);
        Mda mda2 = b2.K.f();
        uCa_12.J = mda2 == null ? uSa.E : eAa.J((eAa)mda2.J());
        a2.C = b2.J();
    }

    public int d() {
        uCa_1 a2;
        return a2.i;
    }

    public List<TIa> J() {
        uCa_1 a2;
        if (a2.M == null) {
            a2.M = a2.C.f();
        }
        return a2.M;
    }

    public int C() {
        uCa_1 a2;
        return a2.A;
    }

    public int l() {
        uCa_1 a2;
        return a2.j;
    }

    @Override
    public void J(Lca lca) throws IOException {
        uCa_1 a2;
        Lca b2 = lca;
        uCa_1 uCa_12 = a2 = this;
        Object object = b2;
        uCa_1 uCa_13 = a2;
        Object object2 = b2;
        uCa_1 uCa_14 = a2;
        Object object3 = b2;
        a2.k = ((Lca)object3).readVarIntFromBuffer();
        uCa_14.I = ((Lca)object3).readUuid();
        uCa_14.j = b2.readInt();
        a2.A = ((Lca)object2).readInt();
        uCa_13.i = ((Lca)object2).readInt();
        uCa_13.m = b2.readByte();
        a2.E = ((Lca)object).readByte();
        uCa_12.J = ((Lca)object).readShort();
        uCa_12.M = hga.J(b2);
    }

    public int f() {
        uCa_1 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        uCa_1 a2 = this;
        Object object = b2;
        uCa_1 uCa_12 = a2;
        b2.writeVarIntToBuffer(uCa_12.k);
        ((Lca)object).writeUuid(uCa_12.I);
        ((Lca)object).writeInt(a2.j);
        b2.writeInt(a2.A);
        b2.writeInt(a2.i);
        b2.writeByte(a2.m);
        b2.writeByte(a2.E);
        b2.writeShort(a2.J);
        a2.C.J(b2);
    }

    public int J() {
        uCa_1 a2;
        return a2.k;
    }

    public UUID J() {
        uCa_1 a2;
        return a2.I;
    }
}

