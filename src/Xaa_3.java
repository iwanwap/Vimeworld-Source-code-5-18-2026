/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Gl
 *  JTa
 *  Oz
 *  PIa
 *  Pd
 *  Xaa
 *  Zta
 *  hqa
 *  vL
 */
import java.io.IOException;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xaa_3
implements KC<Pd> {
    private int F;
    private byte g;
    private byte L;
    private int E;
    private hga m;
    private int C;
    private List<TIa> i;
    private int M;
    private int k;
    private int j;
    private int J;
    private byte A;
    private int I;

    public byte l() {
        Xaa_3 a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        Xaa_3 b2 = pd2;
        Xaa_3 a2 = this;
        b2.J((Xaa)a2);
    }

    public int i() {
        Xaa_3 a2;
        return a2.I;
    }

    public int M() {
        Xaa_3 a2;
        return a2.E;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Xaa_3 a2;
        Lca b2 = lca;
        Xaa_3 xaa_3 = a2 = this;
        Object object = b2;
        Xaa_3 xaa_32 = a2;
        Object object2 = b2;
        Xaa_3 xaa_33 = a2;
        Object object3 = b2;
        Xaa_3 xaa_34 = a2;
        Lca lca2 = b2;
        a2.k = lca2.readVarIntFromBuffer();
        xaa_34.I = lca2.readByte() & osa.Ja;
        xaa_34.M = b2.readInt();
        a2.j = ((Lca)object3).readInt();
        xaa_33.E = ((Lca)object3).readInt();
        xaa_33.g = b2.readByte();
        a2.A = ((Lca)object2).readByte();
        xaa_32.L = ((Lca)object2).readByte();
        xaa_32.C = b2.readShort();
        a2.J = ((Lca)object).readShort();
        xaa_3.F = ((Lca)object).readShort();
        xaa_3.i = hga.J(b2);
    }

    public byte f() {
        Xaa_3 a2;
        return a2.L;
    }

    public Xaa_3() {
        Xaa_3 a2;
    }

    public Xaa_3(Gl gl2) {
        Xaa_3 a2;
        Xaa_3 b2 = gl2;
        Xaa_3 xaa_3 = a2 = this;
        Xaa_3 xaa_32 = b2;
        Xaa_3 xaa_33 = a2;
        Xaa_3 xaa_34 = b2;
        Xaa_3 xaa_35 = a2;
        Xaa_3 xaa_36 = b2;
        a2.k = xaa_36.M();
        xaa_35.I = (byte)PIa.J((vL)xaa_36);
        xaa_35.M = Oz.f((double)(((Gl)b2).la * hqa.ha));
        a2.j = Oz.f((double)(((Gl)xaa_34).Z * hqa.ha));
        xaa_33.E = Oz.f((double)(((Gl)xaa_34).A * hqa.ha));
        xaa_33.g = (byte)(((Gl)b2).X * Fpa.q / CRa.ja);
        xaa_3.A = (byte)(((Gl)xaa_32).d * Fpa.q / CRa.ja);
        xaa_3.L = (byte)(((Gl)xaa_32).t * Fpa.q / CRa.ja);
        double d2 = JTa.Aa;
        Xaa_3 xaa_37 = b2;
        double d3 = ((Gl)xaa_37).i;
        double d4 = ((Gl)xaa_37).Ea;
        double d5 = ((Gl)xaa_37).f;
        if (d3 < -d2) {
            d3 = -d2;
        }
        if (d4 < -d2) {
            d4 = -d2;
        }
        if (d5 < -d2) {
            d5 = -d2;
        }
        if (d3 > d2) {
            d3 = d2;
        }
        if (d4 > d2) {
            d4 = d2;
        }
        if (d5 > d2) {
            d5 = d2;
        }
        Xaa_3 xaa_38 = a2;
        a2.C = (int)(d3 * Zta.C);
        xaa_38.J = (int)(d4 * Zta.C);
        xaa_38.F = (int)(d5 * Zta.C);
        a2.m = b2.J();
    }

    public int e() {
        Xaa_3 a2;
        return a2.F;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Xaa_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.k);
        ((Lca)object).writeByte(a2.I & osa.Ja);
        b2.writeInt(a2.M);
        b2.writeInt(a2.j);
        b2.writeInt(a2.E);
        b2.writeByte(a2.g);
        b2.writeByte(a2.A);
        b2.writeByte(a2.L);
        b2.writeShort(a2.C);
        b2.writeShort(a2.J);
        b2.writeShort(a2.F);
        a2.m.J(b2);
    }

    public int d() {
        Xaa_3 a2;
        return a2.j;
    }

    public List<TIa> J() {
        Xaa_3 a2;
        if (a2.i == null) {
            a2.i = a2.m.f();
        }
        return a2.i;
    }

    public byte J() {
        Xaa_3 a2;
        return a2.g;
    }

    public int C() {
        Xaa_3 a2;
        return a2.J;
    }

    public int l() {
        Xaa_3 a2;
        return a2.C;
    }

    public int f() {
        Xaa_3 a2;
        return a2.k;
    }

    public int J() {
        Xaa_3 a2;
        return a2.M;
    }
}

