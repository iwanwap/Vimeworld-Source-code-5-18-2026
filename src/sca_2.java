/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LEa
 *  fA
 *  sca
 *  vRa
 */
import java.io.IOException;

public final class sca_2
implements KC<fA> {
    private float M;
    private boolean k;
    private boolean j;
    private boolean J;
    private boolean A;
    private float I;

    public void f(float f2) {
        float b2 = f2;
        sca_2 a2 = this;
        a2.M = b2;
    }

    public boolean C() {
        sca_2 a2;
        return a2.A;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        sca_2 a2 = this;
        a2.I = b2;
    }

    public sca_2(LEa lEa2) {
        sca_2 a2;
        sca_2 b2 = lEa2;
        sca_2 sca_22 = a2 = this;
        sca_2 sca_23 = b2;
        sca_2 sca_24 = a2;
        sca_2 sca_25 = b2;
        Ax.J();
        a2.C(((LEa)sca_25).M);
        sca_24.l(sca_25.J());
        sca_24.J(b2.l());
        a2.f(sca_23.f());
        sca_22.J(sca_23.J());
        sca_22.f(b2.f());
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        sca_2 a2 = this;
        a2.k = b2;
    }

    public boolean l() {
        sca_2 a2;
        return a2.j;
    }

    public boolean f() {
        sca_2 a2;
        return a2.k;
    }

    public sca_2() {
        sca_2 a2;
        Ax.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        void a2;
        sca_2 sca_22 = this;
        int b2 = uSa.E;
        if (sca_22.f()) {
            b2 = (byte)(b2 | vRa.d);
        }
        if (sca_22.C()) {
            b2 = (byte)(b2 | uqa.g);
        }
        if (sca_22.l()) {
            b2 = (byte)(b2 | AQa.P);
        }
        if (sca_22.J()) {
            b2 = (byte)(b2 | Yqa.i);
        }
        a2.writeByte(b2);
        a2.writeFloat(sca_22.I);
        a2.writeFloat(sca_22.M);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        void a2;
        sca_2 sca_22 = this;
        byte b2 = a2.readByte();
        sca_22.C(((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0);
        sca_22.l(((b2 & uqa.g) > 0 ? vRa.d : uSa.E) != 0);
        sca_22.J(((b2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0);
        sca_22.f(((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
        sca_2 sca_23 = sca_22;
        sca_23.J(a2.readFloat());
        sca_23.f(a2.readFloat());
    }

    public boolean J() {
        sca_2 a2;
        return a2.J;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        sca_2 a2 = this;
        a2.A = b2;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        sca_2 a2 = this;
        a2.J = b2;
    }

    @Override
    public void J(fA fA2) {
        sca_2 b2 = fA2;
        sca_2 a2 = this;
        b2.J((sca)a2);
    }

    @Override
    public void J(boolean bl) {
        boolean b2 = bl;
        sca_2 a2 = this;
        a2.j = b2;
    }
}

