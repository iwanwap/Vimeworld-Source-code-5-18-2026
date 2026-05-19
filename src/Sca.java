/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  WFa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sca
implements KC<Pd> {
    private DZ j;
    private int J;
    private String A;
    private XF I;

    @Override
    public void J(Pd pd2) {
        Sca b2 = pd2;
        Sca a2 = this;
        b2.J(a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Sca a2;
        Lca b2 = lca;
        Sca sca2 = a2 = this;
        Object object = b2;
        a2.J = b2.readVarIntFromBuffer();
        a2.A = ((Lca)object).readStringFromBuffer(JEa.field_180001_A);
        sca2.I = ((Lca)object).readBlockPos();
        sca2.j = DZ.getHorizontal(b2.readUnsignedByte());
    }

    public Sca(WFa wFa) {
        Sca a2;
        Sca b2 = wFa;
        Sca sca2 = a2 = this;
        Sca sca3 = b2;
        a2.J = b2.M();
        a2.I = sca3.f();
        sca2.j = ((WFa)sca3).j;
        sca2.A = ((WFa)b2).I.title;
    }

    public Sca() {
        Sca a2;
    }

    public int J() {
        Sca a2;
        return a2.J;
    }

    public DZ J() {
        Sca a2;
        return a2.j;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Sca a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeString(a2.A);
        Object object2 = b2;
        ((Lca)object2).writeBlockPos(a2.I);
        ((Lca)object2).writeByte(a2.j.getHorizontalIndex());
    }

    public String J() {
        Sca a2;
        return a2.A;
    }

    public XF J() {
        Sca a2;
        return a2.I;
    }
}

