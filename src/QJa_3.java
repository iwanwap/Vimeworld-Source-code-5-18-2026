/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  Dha
 *  Fc
 *  I
 *  MD
 *  MZ
 *  NLa
 *  Oz
 *  RA
 *  RIa
 *  SRa
 *  U
 *  WGa
 *  aKa
 *  hy
 *  j
 *  lKa
 *  oKa
 *  oqa
 *  pKa
 *  sla
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QJa_3
implements j {
    private oKa M;
    private final Kja k;
    private final NLa j;
    private static final String J = "CL_00002520";
    private final Cia A;
    private final sla I;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean J(IBlockState iBlockState, XF xF2, I i2, aKa aKa2) {
        void c2;
        IBlockState e2 = iBlockState;
        QJa_3 d2 = this;
        try {
            hy hy2 = e2.J().J();
            if (hy2 == hy.INVISIBLE) {
                return uSa.E != 0;
            }
            switch (lKa.I[hy2.ordinal()]) {
                case 1: {
                    void a2;
                    void b22;
                    if (Config.h()) {
                        Fc.J((IBlockState)e2, (XF)c2, (I)b22, (aKa)a2);
                    }
                    boolean bl2 = d2.I.J((I)b22, e2, (XF)c2, (aKa)a2);
                    if (Config.h()) {
                        Fc.C((aKa)a2);
                    }
                    return bl2;
                }
                case 2: {
                    void a2;
                    void b22;
                    RA rA2 = d2.J(e2, (I)b22, (XF)c2);
                    if (Config.h()) {
                        Fc.J((IBlockState)e2, (XF)c2, (I)b22, (aKa)a2);
                    }
                    boolean b22 = d2.k.J((I)b22, rA2, e2, (XF)c2, (aKa)a2);
                    if (Config.h()) {
                        Fc.C((aKa)a2);
                    }
                    return b22;
                }
            }
            return uSa.E != 0;
        }
        catch (Throwable throwable) {
            RIa rIa2 = RIa.J((Throwable)throwable, (String)SRa.y);
            Dha dha2 = rIa2.J(oqa.G);
            Dha.J((Dha)dha2, (XF)c2, (Block)e2.J(), (int)e2.J().f(e2));
            throw new MZ(rIa2);
        }
    }

    public oKa J() {
        QJa_3 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public QJa_3(oKa oKa2, Cia cia2) {
        void b2;
        QJa_3 a2;
        QJa_3 c2 = cia2;
        QJa_3 qJa_3 = a2 = this;
        QJa_3 qJa_32 = a2;
        a2.k = new Kja();
        qJa_32.j = new NLa();
        a2.I = new sla();
        qJa_3.M = b2;
        qJa_3.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    private RA J(IBlockState iBlockState, XF xF2) {
        void a2;
        Object c2 = iBlockState;
        QJa_3 b2 = this;
        c2 = b2.M.J((IBlockState)c2);
        if (a2 != null && b2.A.GA && c2 instanceof sIa) {
            c2 = ((sIa)c2).J(Oz.J((MD)a2));
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public RA J(IBlockState iBlockState, I i2, XF xF2) {
        QJa_3 qJa_3;
        void a2;
        IBlockState c2;
        QJa_3 qJa_32;
        block4: {
            void b2;
            qJa_32 = this;
            Block block = c2.J();
            if (b2.J() != Fy.A) {
                try {
                    c2 = block.J(c2, (I)b2, (XF)a2);
                    qJa_3 = qJa_32;
                    break block4;
                }
                catch (Exception d2) {
                    // empty catch block
                }
            }
            qJa_3 = qJa_32;
        }
        QJa_3 d2 = qJa_3.M.J(c2);
        if (a2 != null && qJa_32.A.GA && d2 instanceof sIa) {
            d2 = ((sIa)((Object)d2)).J(Oz.J((MD)a2));
        }
        return d2;
    }

    public Kja J() {
        QJa_3 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(IBlockState iBlockState, float f2) {
        void b2;
        QJa_3 qJa_3 = this;
        QJa_3 c2 = b2.J().J();
        if (c2 != hy.INVISIBLE) {
            void a2;
            switch (lKa.I[c2.ordinal()]) {
                default: {
                    return;
                }
                case 3: {
                    qJa_3.j.J(b2.J(), (float)a2);
                    return;
                }
                case 2: 
            }
            c2 = qJa_3.J((IBlockState)b2, null);
            qJa_3.k.J((RA)c2, (IBlockState)b2, (float)a2, vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(IBlockState iBlockState, XF xF2, KLa kLa2, I i2) {
        Object e2 = iBlockState;
        QJa_3 d2 = this;
        Block block = e2.J();
        if (block.J() == hy.MODEL) {
            RA b2;
            void c2;
            void a2;
            e2 = block.J((IBlockState)e2, (I)a2, (XF)c2);
            QJa_3 qJa_3 = d2;
            block = qJa_3.M.J((IBlockState)e2);
            b2 = new WGa((RA)block, (KLa)b2).J();
            qJa_3.k.J((I)a2, b2, (IBlockState)e2, (XF)c2, pKa.J().J());
        }
    }

    public boolean J(Block block, int n2) {
        Block c2 = block;
        QJa_3 b2 = this;
        if (c2 == null) {
            return uSa.E != 0;
        }
        if (c2.J() == hy.ENTITYBLOCK_ANIMATED) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(U u2) {
        QJa_3 b2 = u2;
        QJa_3 a2 = this;
        a2.I.J();
    }
}

