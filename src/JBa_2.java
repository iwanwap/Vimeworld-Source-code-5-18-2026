/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  JBa
 *  JTa
 *  Oz
 *  Pd
 *  Zta
 *  hqa
 *  vL
 */
import java.io.IOException;

public final class JBa_2
implements KC<Pd> {
    private int L;
    private int E;
    private int m;
    private int C;
    private int i;
    private int M;
    private int k;
    private int j;
    private int J;
    private int A;
    private int I;

    public void M(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.J = b2;
    }

    public int G() {
        JBa_2 a2;
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public JBa_2(vL vL2, int n2) {
        void b2;
        int c2 = n2;
        JBa_2 a2 = this;
        a2((vL)b2, c2, uSa.E);
    }

    public void e(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.I = b2;
    }

    public int D() {
        JBa_2 a2;
        return a2.k;
    }

    public void d(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.E = b2;
    }

    public void C(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.m = b2;
    }

    public int A() {
        JBa_2 a2;
        return a2.i;
    }

    public int i() {
        JBa_2 a2;
        return a2.M;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        JBa_2 a2 = this;
        Object object = b2;
        JBa_2 jBa_2 = a2;
        Object object2 = b2;
        JBa_2 jBa_22 = a2;
        jBa_22.A = b2.readVarIntFromBuffer();
        jBa_22.i = b2.readByte();
        a2.k = ((Lca)object2).readInt();
        jBa_2.I = ((Lca)object2).readInt();
        jBa_2.j = b2.readInt();
        a2.M = ((Lca)object).readByte();
        a2.C = ((Lca)object).readByte();
        a2.E = b2.readInt();
        if (a2.E > 0) {
            JBa_2 jBa_23 = a2;
            Object object3 = b2;
            a2.L = ((Lca)object3).readShort();
            jBa_23.J = ((Lca)object3).readShort();
            jBa_23.m = b2.readShort();
        }
    }

    public void l(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.j = b2;
    }

    public int M() {
        JBa_2 a2;
        return a2.A;
    }

    public int e() {
        JBa_2 a2;
        return a2.J;
    }

    public JBa_2() {
        JBa_2 a2;
    }

    public void f(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.L = b2;
    }

    @Override
    public void J(Pd pd2) {
        JBa_2 b2 = pd2;
        JBa_2 a2 = this;
        b2.J((JBa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public JBa_2(vL vL2, int n2, int n3) {
        void a2;
        void b2;
        JBa_2 c2;
        JBa_2 d2 = vL2;
        JBa_2 jBa_2 = c2 = this;
        JBa_2 jBa_22 = d2;
        JBa_2 jBa_23 = c2;
        JBa_2 jBa_24 = d2;
        c2.A = d2.M();
        c2.k = Oz.f((double)(((vL)jBa_24).la * hqa.ha));
        jBa_23.I = Oz.f((double)(((vL)jBa_24).Z * hqa.ha));
        jBa_23.j = Oz.f((double)(((vL)d2).A * hqa.ha));
        c2.M = Oz.J((float)(((vL)jBa_22).d * Fpa.q / CRa.ja));
        jBa_2.C = Oz.J((float)(((vL)jBa_22).X * Fpa.q / CRa.ja));
        jBa_2.i = b2;
        c2.E = a2;
        if (c2.E > 0) {
            JBa_2 jBa_25 = d2;
            double d3 = ((vL)jBa_25).i;
            double d4 = ((vL)jBa_25).Ea;
            double d5 = ((vL)jBa_25).f;
            double d6 = JTa.Aa;
            if (d3 < -d6) {
                d3 = -d6;
            }
            if (d4 < -d6) {
                d4 = -d6;
            }
            if (d5 < -d6) {
                d5 = -d6;
            }
            if (d3 > d6) {
                d3 = d6;
            }
            if (d4 > d6) {
                d4 = d6;
            }
            if (d5 > d6) {
                d5 = d6;
            }
            JBa_2 jBa_26 = c2;
            jBa_26.L = (int)(d3 * Zta.C);
            jBa_26.J = (int)(d4 * Zta.C);
            c2.m = (int)(d5 * Zta.C);
        }
    }

    public int d() {
        JBa_2 a2;
        return a2.m;
    }

    @Override
    public void J(int n2) {
        int b2 = n2;
        JBa_2 a2 = this;
        a2.k = b2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        JBa_2 a2 = this;
        Object object = b2;
        JBa_2 jBa_2 = a2;
        ((Lca)object).writeVarIntToBuffer(jBa_2.A);
        JBa_2 jBa_22 = a2;
        ((Lca)object).writeByte(jBa_2.i);
        b2.writeInt(jBa_22.k);
        b2.writeInt(a2.I);
        b2.writeInt(a2.j);
        b2.writeByte(a2.M);
        b2.writeByte(a2.C);
        b2.writeInt(a2.E);
        if (jBa_22.E > 0) {
            b2.writeShort(a2.L);
            b2.writeShort(a2.J);
            b2.writeShort(a2.m);
        }
    }

    public int C() {
        JBa_2 a2;
        return a2.I;
    }

    public int l() {
        JBa_2 a2;
        return a2.j;
    }

    public int f() {
        JBa_2 a2;
        return a2.E;
    }

    public int J() {
        JBa_2 a2;
        return a2.C;
    }
}

