/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Faa
 *  Ypa
 *  lqa
 */
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SAa_2 {
    private final short J;
    private final IBlockState A;
    public final /* synthetic */ eba I;

    public short J() {
        SAa_2 a2;
        return a2.J;
    }

    public XF J() {
        SAa_2 a2;
        return new XF(eba.J(a2.I).J(a2.J >> lqa.s & Ypa.A, a2.J & osa.Ja, a2.J >> Yqa.i & Ypa.A));
    }

    /*
     * WARNING - void declaration
     */
    public SAa_2(eba eba2, short s, Faa faa2) {
        void b2;
        void c2;
        SAa_2 d2 = faa2;
        SAa_2 a2 = this;
        a2.I = c2;
        a2.J = b2;
        a2.A = d2.J(a2.J());
    }

    public IBlockState J() {
        SAa_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public SAa_2(eba eba2, short s, IBlockState iBlockState) {
        void b2;
        void c2;
        SAa_2 a2;
        IBlockState d2 = iBlockState;
        SAa_2 sAa_2 = a2 = this;
        a2.I = c2;
        sAa_2.J = b2;
        sAa_2.A = d2;
    }
}

