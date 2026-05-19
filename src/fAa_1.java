/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LEa
 *  Pd
 *  fAa
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fAa_1
implements KC<Pd> {
    private boolean M;
    private boolean k;
    private float j;
    private boolean J;
    private boolean A;
    private float I;

    public void C(boolean bl) {
        boolean b2 = bl;
        fAa_1 a2 = this;
        a2.M = b2;
    }

    public boolean C() {
        fAa_1 a2;
        return a2.A;
    }

    public float f() {
        fAa_1 a2;
        return a2.I;
    }

    public boolean l() {
        fAa_1 a2;
        return a2.J;
    }

    public fAa_1() {
        fAa_1 a2;
    }

    public void f(float f2) {
        float b2 = f2;
        fAa_1 a2 = this;
        a2.j = b2;
    }

    @Override
    public void J(Pd pd2) {
        fAa_1 b2 = pd2;
        fAa_1 a2 = this;
        b2.J((fAa)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        void a2;
        fAa_1 fAa_12 = this;
        byte b2 = a2.readByte();
        fAa_12.l(((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0);
        fAa_12.f(((b2 & uqa.g) > 0 ? vRa.d : uSa.E) != 0);
        fAa_12.J(((b2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0);
        fAa_12.C(((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
        fAa_1 fAa_13 = fAa_12;
        fAa_13.J(a2.readFloat());
        fAa_13.f(a2.readFloat());
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        fAa_1 a2 = this;
        a2.J = b2;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        fAa_1 a2 = this;
        a2.k = b2;
    }

    public boolean f() {
        fAa_1 a2;
        return a2.M;
    }

    @Override
    public void J(boolean bl) {
        boolean b2 = bl;
        fAa_1 a2 = this;
        a2.A = b2;
    }

    public boolean J() {
        fAa_1 a2;
        return a2.k;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        fAa_1 a2 = this;
        a2.I = b2;
    }

    public fAa_1(LEa lEa2) {
        fAa_1 a2;
        fAa_1 b2 = lEa2;
        fAa_1 fAa_12 = a2 = this;
        fAa_1 fAa_13 = b2;
        fAa_1 fAa_14 = a2;
        fAa_1 fAa_15 = b2;
        a2.l(((LEa)fAa_15).M);
        fAa_14.f(fAa_15.J());
        fAa_14.J(b2.l());
        a2.C(fAa_13.f());
        fAa_12.J(fAa_13.J());
        fAa_12.f(b2.f());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        void a2;
        fAa_1 fAa_12 = this;
        int b2 = uSa.E;
        if (fAa_12.l()) {
            b2 = (byte)(b2 | vRa.d);
        }
        if (fAa_12.J()) {
            b2 = (byte)(b2 | uqa.g);
        }
        if (fAa_12.C()) {
            b2 = (byte)(b2 | AQa.P);
        }
        if (fAa_12.f()) {
            b2 = (byte)(b2 | Yqa.i);
        }
        a2.writeByte(b2);
        a2.writeFloat(fAa_12.I);
        a2.writeFloat(fAa_12.j);
    }

    public float J() {
        fAa_1 a2;
        return a2.j;
    }
}

