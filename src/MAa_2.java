/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MAa
 *  TB
 *  wBa
 *  yQa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MAa_2
implements KC<TB> {
    private wBa j;
    private int J;
    private String A;
    private int I;

    public int J() {
        MAa_2 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        MAa_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeString(a2.A);
        b2.writeShort(a2.I);
        b2.writeVarIntToBuffer(a2.j.getId());
    }

    @Override
    public void J(TB tB2) {
        MAa_2 b2 = tB2;
        MAa_2 a2 = this;
        b2.J((MAa)a2);
    }

    public MAa_2() {
        MAa_2 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        MAa_2 a2;
        Lca b2 = lca;
        MAa_2 mAa_2 = a2 = this;
        Object object = b2;
        a2.J = b2.readVarIntFromBuffer();
        a2.A = ((Lca)object).readStringFromBuffer(osa.Ja);
        mAa_2.I = ((Lca)object).readUnsignedShort();
        mAa_2.j = wBa.getById((int)b2.readVarIntFromBuffer());
    }

    public wBa J() {
        MAa_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public MAa_2(int n2, String string, int n3, wBa wBa2) {
        MAa_2 e2;
        void b2;
        void c2;
        void d2;
        MAa_2 a2;
        MAa_2 mAa_2 = mAa_22;
        MAa_2 mAa_22 = wBa2;
        MAa_2 mAa_23 = a2 = mAa_2;
        a2.J = d2;
        MAa_2 mAa_24 = a2;
        a2.A = (String)c2 + yQa.Ka;
        mAa_23.I = b2;
        mAa_23.j = e2;
    }
}

