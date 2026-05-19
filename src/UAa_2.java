/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UAa
 *  XTa
 *  fA
 *  kFa
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UAa_2
implements KC<fA> {
    private int k;
    private kFa j;
    private int J;
    private String A;
    private boolean I;

    public boolean J() {
        UAa_2 a2;
        return a2.I;
    }

    public kFa J() {
        UAa_2 a2;
        return a2.j;
    }

    public String J() {
        UAa_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public UAa_2(String string, int n2, kFa kFa2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        UAa_2 a2;
        int n4 = n3;
        UAa_2 uAa_2 = a2 = this;
        UAa_2 uAa_22 = a2;
        uAa_22.A = d2;
        uAa_22.k = c2;
        uAa_2.j = b2;
        uAa_2.I = vRa.d;
        uAa_2.J = e2;
    }

    public UAa_2() {
        UAa_2 a2;
    }

    @Override
    public void J(fA fA2) {
        UAa_2 b2 = fA2;
        UAa_2 a2 = this;
        b2.J((UAa)a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        UAa_2 a2 = this;
        b2.writeString(a2.A);
        b2.writeByte(a2.k);
        b2.writeByte(a2.j.getChatVisibility());
        b2.writeBoolean(a2.I);
        b2.writeByte(a2.J);
    }

    @Override
    public void J(Lca lca) throws IOException {
        UAa_2 a2;
        Lca b2 = lca;
        UAa_2 uAa_2 = a2 = this;
        Object object = b2;
        UAa_2 uAa_22 = a2;
        uAa_22.A = b2.readStringFromBuffer(XTa.W);
        uAa_22.k = b2.readByte();
        a2.j = kFa.getEnumChatVisibility((int)((Lca)object).readByte());
        uAa_2.I = ((Lca)object).readBoolean();
        uAa_2.J = b2.readUnsignedByte();
    }

    public int J() {
        UAa_2 a2;
        return a2.J;
    }
}

