/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  oba
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oba_1
implements KC<Pd> {
    private boolean A;
    private sZ I;

    public sZ J() {
        oba_1 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        oba_1 a2 = this;
        b2.writeByte(a2.I.getDifficultyId());
    }

    @Override
    public void J(Pd pd2) {
        oba_1 b2 = pd2;
        oba_1 a2 = this;
        b2.J((oba)a2);
    }

    public boolean J() {
        oba_1 a2;
        return a2.A;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        oba_1 a2 = this;
        a2.I = sZ.getDifficultyEnum(b2.readUnsignedByte());
    }

    /*
     * WARNING - void declaration
     */
    public oba_1(sZ sZ2, boolean bl) {
        void b2;
        oba_1 a2;
        boolean c2 = bl;
        oba_1 oba_12 = a2 = this;
        oba_12.I = b2;
        oba_12.A = c2;
    }

    public oba_1() {
        oba_1 a2;
    }
}

