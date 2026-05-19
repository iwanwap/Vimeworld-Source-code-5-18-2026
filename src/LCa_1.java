/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  LCa
 *  Pd
 */
import java.io.IOException;

public final class LCa_1
implements KC<Pd> {
    private int A;
    private XF I;

    public XF J() {
        LCa_1 a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        LCa_1 a2;
        Lca b2 = lca;
        LCa_1 lCa_1 = a2 = this;
        lCa_1.A = b2.readVarIntFromBuffer();
        lCa_1.I = b2.readBlockPos();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        LCa_1 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A);
        ((Lca)object).writeBlockPos(a2.I);
    }

    @Override
    public void J(Pd pd2) {
        LCa_1 b2 = pd2;
        LCa_1 a2 = this;
        b2.J((LCa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public LCa_1(Sx sx2, XF xF) {
        void b2;
        LCa_1 a2;
        Object c2 = xF;
        LCa_1 lCa_1 = a2 = this;
        lCa_1.A = b2.M();
        lCa_1.I = c2;
    }

    public LCa_1() {
        LCa_1 a2;
    }

    public Sx J(Gg gg2) {
        LCa_1 b2 = gg2;
        LCa_1 a2 = this;
        return (Sx)b2.J(a2.A);
    }
}

