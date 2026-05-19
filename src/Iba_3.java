/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Iba
 *  Pd
 *  ica
 *  jba
 *  pba
 *  wra
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Iba_3
implements KC<Pd> {
    private pba j;
    private int J;
    private String A;
    private String I;

    public pba J() {
        Iba_3 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Iba_3(String string, ica ica2) {
        void b2;
        Iba_3 a2;
        Iba_3 c2 = ica2;
        Iba_3 iba_3 = a2 = this;
        Iba_3 iba_32 = a2;
        a2.I = Mqa.y;
        a2.A = Mqa.y;
        iba_32.I = b2;
        iba_3.A = c2.J();
        iba_32.J = uSa.E;
        iba_3.j = pba.REMOVE;
    }

    public String f() {
        Iba_3 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        Iba_3 b2 = pd2;
        Iba_3 a2 = this;
        b2.J((Iba)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Iba_3 a2;
        Lca b2 = lca;
        Iba_3 iba_3 = a2 = this;
        iba_3.I = b2.readStringFromBuffer(wra.P);
        iba_3.j = b2.readEnumValue(pba.class);
        a2.A = b2.readStringFromBuffer(ERa.C);
        if (a2.j != pba.REMOVE) {
            a2.J = b2.readVarIntFromBuffer();
        }
    }

    @Override
    public void f(Lca lca) throws IOException {
        Iba_3 a2;
        Lca b2 = lca;
        Iba_3 iba_3 = a2 = this;
        b2.writeString(a2.I);
        b2.writeEnumValue((Enum<?>)a2.j);
        b2.writeString(iba_3.A);
        if (iba_3.j != pba.REMOVE) {
            b2.writeVarIntToBuffer(a2.J);
        }
    }

    public Iba_3(jba jba2) {
        Iba_3 a2;
        Iba_3 b2 = jba2;
        Iba_3 iba_3 = a2 = this;
        Iba_3 iba_32 = b2;
        a2.I = Mqa.y;
        a2.A = Mqa.y;
        a2.I = iba_32.J();
        iba_3.A = iba_32.J().J();
        iba_3.J = b2.J();
        iba_3.j = pba.CHANGE;
    }

    public String J() {
        Iba_3 a2;
        return a2.A;
    }

    public Iba_3(String string) {
        Iba_3 a2;
        String b2 = string;
        Iba_3 iba_3 = a2 = this;
        Iba_3 iba_32 = a2;
        a2.I = Mqa.y;
        iba_32.A = Mqa.y;
        iba_3.I = b2;
        iba_32.A = Mqa.y;
        iba_3.J = uSa.E;
        iba_3.j = pba.REMOVE;
    }

    public int J() {
        Iba_3 a2;
        return a2.J;
    }

    public Iba_3() {
        Iba_3 a2;
        a2.I = Mqa.y;
        a2.A = Mqa.y;
    }
}

