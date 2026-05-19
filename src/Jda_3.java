/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Jda
 *  Pd
 *  ica
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Jda_3
implements KC<Pd> {
    private String j;
    private int J;
    private kBa A;
    private String I;

    @Override
    public void f(Lca lca) throws IOException {
        Jda_3 a2;
        Lca b2 = lca;
        Jda_3 jda_3 = a2 = this;
        b2.writeString(a2.I);
        b2.writeByte(jda_3.J);
        if (jda_3.J == 0 || a2.J == uqa.g) {
            b2.writeString(a2.j);
            b2.writeString(a2.A.func_178796_a());
        }
    }

    public int J() {
        Jda_3 a2;
        return a2.J;
    }

    public String f() {
        Jda_3 a2;
        return a2.j;
    }

    public Jda_3() {
        Jda_3 a2;
    }

    public kBa J() {
        Jda_3 a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        Jda_3 b2 = pd2;
        Jda_3 a2 = this;
        b2.J((Jda)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Jda_3(ica ica2, int n2) {
        void a2;
        Jda_3 b2;
        Jda_3 c2 = ica2;
        Jda_3 jda_3 = b2 = this;
        Jda_3 jda_32 = c2;
        b2.I = c2.J();
        b2.j = jda_32.f();
        jda_3.A = jda_32.J().J();
        jda_3.J = a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Jda_3 a2 = this;
        a2.I = b2.readStringFromBuffer(ERa.C);
        a2.J = b2.readByte();
        if (a2.J == 0 || a2.J == uqa.g) {
            Jda_3 jda_3 = a2;
            Object object = b2;
            jda_3.j = ((Lca)object).readStringFromBuffer(fPa.i);
            jda_3.A = kBa.func_178795_a(((Lca)object).readStringFromBuffer(ERa.C));
        }
    }

    public String J() {
        Jda_3 a2;
        return a2.I;
    }
}

