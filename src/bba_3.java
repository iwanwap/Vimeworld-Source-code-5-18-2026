/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Oz
 *  Pd
 *  bba
 *  hqa
 *  vL
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bba_3
implements KC<Pd> {
    private byte i;
    private boolean M;
    private int k;
    private int j;
    private int J;
    private int A;
    private byte I;

    /*
     * WARNING - void declaration
     */
    public bba_3(int n2, int n3, int n4, int n5, byte by2, byte by3, boolean bl2) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        bba_3 a2;
        boolean bl3 = bl2;
        bba_3 bba_32 = a2 = this;
        bba_3 bba_33 = a2;
        bba_3 bba_34 = a2;
        a2.J = g2;
        bba_34.A = f2;
        bba_34.j = e2;
        bba_33.k = d2;
        bba_33.I = c2;
        bba_32.i = b2;
        bba_32.M = h2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        bba_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeInt(a2.A);
        b2.writeInt(a2.j);
        b2.writeInt(a2.k);
        b2.writeByte(a2.I);
        b2.writeByte(a2.i);
        b2.writeBoolean(a2.M);
    }

    public byte f() {
        bba_3 a2;
        return a2.I;
    }

    public bba_3(vL vL2) {
        bba_3 a2;
        bba_3 b2 = vL2;
        bba_3 bba_32 = a2 = this;
        bba_3 bba_33 = b2;
        bba_3 bba_34 = a2;
        bba_3 bba_35 = b2;
        a2.J = b2.M();
        a2.A = Oz.f((double)(((vL)bba_35).la * hqa.ha));
        bba_34.j = Oz.f((double)(((vL)bba_35).Z * hqa.ha));
        bba_34.k = Oz.f((double)(((vL)b2).A * hqa.ha));
        a2.I = (byte)(((vL)bba_33).X * Fpa.q / CRa.ja);
        bba_32.i = (byte)(((vL)bba_33).d * Fpa.q / CRa.ja);
        bba_32.M = ((vL)b2).ha;
    }

    public int C() {
        bba_3 a2;
        return a2.J;
    }

    public int l() {
        bba_3 a2;
        return a2.A;
    }

    @Override
    public void J(Lca lca) throws IOException {
        bba_3 a2;
        Lca b2 = lca;
        bba_3 bba_32 = a2 = this;
        Object object = b2;
        bba_3 bba_33 = a2;
        Object object2 = b2;
        a2.J = b2.readVarIntFromBuffer();
        a2.A = ((Lca)object2).readInt();
        bba_33.j = ((Lca)object2).readInt();
        bba_33.k = b2.readInt();
        a2.I = ((Lca)object).readByte();
        bba_32.i = ((Lca)object).readByte();
        bba_32.M = b2.readBoolean();
    }

    public int f() {
        bba_3 a2;
        return a2.k;
    }

    @Override
    public void J(Pd pd2) {
        bba_3 b2 = pd2;
        bba_3 a2 = this;
        b2.J((bba)a2);
    }

    public bba_3() {
        bba_3 a2;
    }

    public boolean J() {
        bba_3 a2;
        return a2.M;
    }

    public byte J() {
        bba_3 a2;
        return a2.i;
    }

    public int J() {
        bba_3 a2;
        return a2.j;
    }
}

