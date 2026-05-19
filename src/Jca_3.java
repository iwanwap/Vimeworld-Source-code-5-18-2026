/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jca
 *  Pd
 *  ld
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Jca_3
implements KC<Pd> {
    private int k;
    private int j;
    private ld J;
    private String A;
    private int I;

    public boolean J() {
        Jca_3 a2;
        if (a2.k > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        Jca_3 a2;
        return a2.A;
    }

    public int l() {
        Jca_3 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Jca_3(int n2, String string, ld ld2) {
        void b2;
        void c2;
        Jca_3 d2 = ld2;
        Jca_3 a2 = this;
        a2((int)c2, (String)b2, (ld)d2, uSa.E);
    }

    @Override
    public void J(Pd pd2) {
        Jca_3 b2 = pd2;
        Jca_3 a2 = this;
        b2.J((Jca)a2);
    }

    public int f() {
        Jca_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Jca_3(int n2, String string, ld ld2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        Jca_3 a2;
        int n4 = n3;
        Jca_3 jca_3 = a2 = this;
        Jca_3 jca_32 = a2;
        jca_32.I = d2;
        jca_32.A = c2;
        jca_3.J = b2;
        jca_3.k = e2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Jca_3 a2;
        Lca b2 = lca;
        Jca_3 jca_3 = a2 = this;
        b2.writeByte(a2.I);
        b2.writeString(jca_3.A);
        Object object = b2;
        ((Lca)object).writeChatComponent(a2.J);
        ((Lca)object).writeByte(a2.k);
        if (jca_3.A.equals(fqa.S)) {
            b2.writeInt(a2.j);
        }
    }

    public ld J() {
        Jca_3 a2;
        return a2.J;
    }

    public int J() {
        Jca_3 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public Jca_3(int n2, String string, ld ld2, int n3, int n4) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n5 = n4;
        Jca_3 a2 = this;
        a2((int)e2, (String)d2, (ld)c2, (int)b2);
        a2.j = f2;
    }

    public Jca_3() {
        Jca_3 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Jca_3 a2 = this;
        Object object = b2;
        a2.I = b2.readUnsignedByte();
        a2.A = ((Lca)object).readStringFromBuffer(fPa.i);
        a2.J = ((Lca)object).readChatComponent();
        a2.k = b2.readUnsignedByte();
        if (a2.A.equals(fqa.S)) {
            a2.j = b2.readInt();
        }
    }
}

