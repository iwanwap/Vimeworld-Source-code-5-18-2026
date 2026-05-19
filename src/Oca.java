/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aca
 *  Pca
 *  Pd
 */
import java.io.IOException;

public final class Oca
implements KC<Pd> {
    private double m;
    private long C;
    private double i;
    private int M;
    private Pca k;
    private double j;
    private double J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Oca(PX pX, Pca pca) {
        void a2;
        Oca b2;
        PX c2 = pX;
        Oca oca = b2 = this;
        PX pX2 = c2;
        Oca oca2 = b2;
        PX pX3 = c2;
        Oca oca3 = b2;
        b2.k = a2;
        oca3.J = c2.D();
        oca3.j = c2.C();
        b2.i = pX3.A();
        oca2.m = pX3.G();
        oca2.C = c2.J();
        b2.A = pX2.l();
        oca.I = pX2.J();
        oca.M = c2.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Oca a2 = this;
        b2.writeEnumValue((Enum<?>)a2.k);
        switch (Aca.I[a2.k.ordinal()]) {
            case 1: {
                b2.writeDouble(a2.m);
                return;
            }
            case 2: {
                b2.writeDouble(a2.i);
                b2.writeDouble(a2.m);
                b2.writeVarLong(a2.C);
                return;
            }
            case 3: {
                b2.writeDouble(a2.J);
                b2.writeDouble(a2.j);
                return;
            }
            case 4: {
                b2.writeVarIntToBuffer(a2.I);
                return;
            }
            case 5: {
                b2.writeVarIntToBuffer(a2.M);
                return;
            }
            case 6: {
                b2.writeDouble(a2.J);
                b2.writeDouble(a2.j);
                b2.writeDouble(a2.i);
                b2.writeDouble(a2.m);
                Object object = b2;
                Oca oca = a2;
                b2.writeVarLong(a2.C);
                b2.writeVarIntToBuffer(oca.A);
                ((Lca)object).writeVarIntToBuffer(oca.I);
                ((Lca)object).writeVarIntToBuffer(a2.M);
                return;
            }
        }
    }

    @Override
    public void J(Pd pd2) {
        Oca b2 = pd2;
        Oca a2 = this;
        b2.J(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Oca a2 = this;
        a2.k = b2.readEnumValue(Pca.class);
        switch (Aca.I[a2.k.ordinal()]) {
            case 1: {
                a2.m = b2.readDouble();
                return;
            }
            case 2: {
                Oca oca = a2;
                Object object = b2;
                a2.i = b2.readDouble();
                oca.m = ((Lca)object).readDouble();
                oca.C = ((Lca)object).readVarLong();
                return;
            }
            case 3: {
                Oca oca = a2;
                Object object = b2;
                oca.J = ((Lca)object).readDouble();
                oca.j = ((Lca)object).readDouble();
                return;
            }
            case 4: {
                a2.I = b2.readVarIntFromBuffer();
                return;
            }
            case 5: {
                a2.M = b2.readVarIntFromBuffer();
                return;
            }
            case 6: {
                Oca oca = a2;
                Object object = b2;
                Oca oca2 = a2;
                Lca lca2 = b2;
                Oca oca3 = a2;
                Lca lca3 = b2;
                a2.J = lca3.readDouble();
                oca3.j = lca3.readDouble();
                oca3.i = b2.readDouble();
                a2.m = lca2.readDouble();
                oca2.C = lca2.readVarLong();
                oca2.A = b2.readVarIntFromBuffer();
                oca.I = ((Lca)object).readVarIntFromBuffer();
                oca.M = ((Lca)object).readVarIntFromBuffer();
                return;
            }
        }
    }

    public Oca() {
        Oca a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(PX pX) {
        PX b2 = pX;
        Oca a2 = this;
        switch (Aca.I[a2.k.ordinal()]) {
            case 1: {
                b2.J(a2.m);
                return;
            }
            case 2: {
                b2.J(a2.i, a2.m, a2.C);
                return;
            }
            case 3: {
                b2.J(a2.J, a2.j);
                return;
            }
            case 4: {
                b2.f(a2.I);
                return;
            }
            case 5: {
                b2.l(a2.M);
                return;
            }
            case 6: {
                PX pX2;
                b2.J(a2.J, a2.j);
                Object object = b2;
                if (a2.C > nqa.i) {
                    ((PX)object).J(a2.i, a2.m, a2.C);
                    pX2 = b2;
                } else {
                    ((PX)object).J(a2.m);
                    pX2 = b2;
                }
                pX2.J(a2.A);
                Object object2 = b2;
                ((PX)object2).f(a2.I);
                ((PX)object2).l(a2.M);
                return;
            }
        }
    }
}

