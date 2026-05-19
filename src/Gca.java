/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  aba
 *  ld
 *  pua
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Gca
implements KC<Pd> {
    private aba k;
    private int j;
    private int J;
    private int A;
    private ld I;

    public int l() {
        Gca a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public Gca(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Gca a2 = this;
        a2(aba.TIMES, null, (int)c2, (int)b2, d2);
    }

    public int f() {
        Gca a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        Gca b2 = pd2;
        Gca a2 = this;
        b2.J(a2);
    }

    public Gca() {
        Gca a2;
    }

    public aba J() {
        Gca a2;
        return a2.k;
    }

    public int J() {
        Gca a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Gca(aba aba2, ld ld2, int n2, int n3, int n4) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        Gca a2;
        int n5 = n4;
        Gca gca = a2 = this;
        Gca gca2 = a2;
        a2.k = e2;
        gca2.I = d2;
        gca2.A = c2;
        gca.J = b2;
        gca.j = f2;
    }

    public ld J() {
        Gca a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Gca(aba aba2, ld ld2) {
        void b2;
        Gca c2 = ld2;
        Gca a2 = this;
        a2((aba)b2, (ld)c2, pua.o, pua.o, pua.o);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Gca a2;
        Lca b2 = lca;
        Gca gca = a2 = this;
        b2.writeEnumValue((Enum<?>)gca.k);
        if (gca.k == aba.TITLE || a2.k == aba.SUBTITLE) {
            b2.writeChatComponent(a2.I);
        }
        if (a2.k == aba.TIMES) {
            b2.writeInt(a2.A);
            b2.writeInt(a2.J);
            b2.writeInt(a2.j);
        }
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Gca a2 = this;
        a2.k = b2.readEnumValue(aba.class);
        if (a2.k == aba.TITLE || a2.k == aba.SUBTITLE) {
            a2.I = b2.readChatComponent();
        }
        if (a2.k == aba.TIMES) {
            Gca gca = a2;
            Object object = b2;
            a2.A = ((Lca)object).readInt();
            gca.J = ((Lca)object).readInt();
            gca.j = b2.readInt();
        }
    }
}

