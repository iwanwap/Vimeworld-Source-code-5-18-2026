/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  Ypa
 *  dW
 *  kpa
 *  vz
 */
import java.io.IOException;
import java.util.Collection;

public final class AAa
implements KC<Pd> {
    private byte C;
    private int i;
    private int M;
    private int k;
    private vz[] j;
    private int J;
    private int A;
    private byte[] I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(dW dW2) {
        int b2;
        void a2;
        AAa aAa2 = this;
        a2.C = aAa2.C;
        a2.A.clear();
        int n2 = b2 = uSa.E;
        while (n2 < aAa2.j.length) {
            vz vz2 = aAa2.j[b2];
            StringBuilder stringBuilder = new StringBuilder().insert(5 >> 3, kpa.A).append(b2);
            a2.A.put(stringBuilder.toString(), vz2);
            n2 = ++b2;
        }
        int n3 = b2 = uSa.E;
        while (n3 < aAa2.i) {
            int n4 = uSa.E;
            while (n4 < aAa2.M) {
                int n5;
                int n6 = aAa2.k + b2 + (aAa2.J + n5) * XOa.h;
                byte by2 = aAa2.I[b2 + n5 * aAa2.i];
                a2.j[n6] = by2;
                n4 = ++n5;
            }
            n3 = ++b2;
        }
    }

    public int J() {
        AAa a2;
        return a2.A;
    }

    @Override
    public void f(Lca lca) throws IOException {
        int n2;
        Lca b2 = lca;
        AAa a2 = this;
        Object object = b2;
        AAa aAa2 = a2;
        b2.writeVarIntToBuffer(aAa2.A);
        ((Lca)object).writeByte(aAa2.C);
        ((Lca)object).writeVarIntToBuffer(a2.j.length);
        vz[] vzArray = a2.j;
        int n3 = a2.j.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            vz vz2 = vzArray[n2];
            b2.writeByte((vz2.l() & Ypa.A) << AQa.P | vz2.J() & Ypa.A);
            b2.writeByte(vz2.C());
            b2.writeByte(vz2.f());
            n4 = ++n2;
        }
        b2.writeByte(a2.i);
        if (a2.i > 0) {
            b2.writeByte(a2.M);
            b2.writeByte(a2.k);
            b2.writeByte(a2.J);
            b2.writeByteArray(a2.I);
        }
    }

    public AAa() {
        AAa a2;
    }

    /*
     * WARNING - void declaration
     */
    public AAa(int n2, byte n3, Collection<vz> collection, byte[] byArray, int n4, int n5, int n6, int n7) {
        void a2;
        void b2;
        void c2;
        void d2;
        int h2;
        void f2;
        int i2 = n3;
        AAa g2 = this;
        void v0 = f2;
        AAa aAa2 = g2;
        g2.A = h2;
        aAa2.C = i2;
        aAa2.j = v0.toArray(new vz[v0.size()]);
        AAa aAa3 = g2;
        AAa aAa4 = g2;
        g2.k = d2;
        aAa4.J = c2;
        aAa4.i = b2;
        aAa3.M = a2;
        aAa3.I = new byte[b2 * a2];
        int n8 = h2 = uSa.E;
        while (n8 < b2) {
            int n9 = uSa.E;
            while (n9 < a2) {
                void e2;
                int n10 = h2 + i2 * b2;
                void v7 = e2[d2 + h2 + (c2 + i2) * XOa.h];
                g2.I[n10] = v7;
                n9 = ++i2;
            }
            n8 = ++h2;
        }
    }

    @Override
    public void J(Pd pd2) {
        AAa b2 = pd2;
        AAa a2 = this;
        b2.J(a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        AAa a2;
        Lca b2 = lca;
        AAa aAa2 = a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readVarIntFromBuffer();
        aAa2.C = ((Lca)object).readByte();
        aAa2.j = new vz[b2.readVarIntFromBuffer()];
        int n3 = n2 = uSa.E;
        while (n3 < a2.j.length) {
            short s2 = b2.readByte();
            a2.j[n2++] = new vz((byte)(s2 >> AQa.P & Ypa.A), b2.readByte(), b2.readByte(), (byte)(s2 & Ypa.A));
            n3 = n2;
        }
        a2.i = b2.readUnsignedByte();
        if (a2.i > 0) {
            AAa aAa3 = a2;
            Object object2 = b2;
            a2.M = b2.readUnsignedByte();
            a2.k = ((Lca)object2).readUnsignedByte();
            aAa3.J = ((Lca)object2).readUnsignedByte();
            aAa3.I = b2.readByteArray();
        }
    }
}

