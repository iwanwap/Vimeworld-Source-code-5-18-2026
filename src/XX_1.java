/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  QFa
 *  vRa
 *  wX
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XX_1 {
    private wX i;
    private int M;
    private char[] k;
    private int j;
    private static final String J = "CL_00000375";
    private int A;
    private wX I;

    /*
     * WARNING - void declaration
     */
    public Block J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        XX_1 a2 = this;
        return a2.J((int)c2, (int)b2, d2).J();
    }

    /*
     * WARNING - void declaration
     */
    public int l(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        XX_1 a2 = this;
        return a2.I.J((int)c2, (int)b2, d2);
    }

    public wX f() {
        XX_1 a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public int f(int n2, int n3, int n4) {
        void a2;
        void b2;
        int d22 = n2;
        XX_1 c2 = this;
        IBlockState d22 = c2.J(d22, (int)b2, (int)a2);
        return d22.J().f(d22);
    }

    public boolean f() {
        XX_1 a2;
        if (a2.M > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        XX_1 a2 = this;
        return a2.i.J((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public XX_1(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        XX_1 a2 = this;
        a2.j = b2;
        a2.k = new char[mPa.H];
        XX_1 xX_1 = a2;
        xX_1.i = new wX();
        if (c2) {
            a2.I = new wX();
        }
    }

    public void J(char[] cArray) {
        Object b2 = cArray;
        XX_1 a2 = this;
        a2.k = (char[])b2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        XX_1 a2 = this;
        a2.I.J((int)d2, (int)c2, (int)b2, (int)e2);
    }

    public void J() {
        int n2;
        XX_1 xX_1 = this;
        List list = Block.BLOCK_STATE_IDS.J();
        int n3 = list.size();
        int n4 = uSa.E;
        int n5 = uSa.E;
        int n6 = n2 = uSa.E;
        while (n6 < ERa.C) {
            int n7 = n2 << Yqa.i;
            int n8 = uSa.E;
            while (n8 < ERa.C) {
                int n9;
                int n10 = n7 | n9 << AQa.P;
                int n11 = uSa.E;
                while (n11 < ERa.C) {
                    int n12;
                    char a2 = xX_1.k[n10 | n12];
                    if (a2 > '\u0000') {
                        ++n4;
                        if (a2 < n3 && (a2 = (IBlockState)list.get(a2)) != null && a2.J().M()) {
                            ++n5;
                        }
                    }
                    n11 = ++n12;
                }
                n8 = ++n9;
            }
            n6 = ++n2;
        }
        xX_1.A = n4;
        xX_1.M = n5;
    }

    public wX J() {
        XX_1 a2;
        return a2.I;
    }

    public boolean J() {
        XX_1 a2;
        if (a2.A == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(int n2, int n3, int n4) {
        void a2;
        void b2;
        int d22 = n2;
        XX_1 c2 = this;
        IBlockState d22 = (IBlockState)Block.BLOCK_STATE_IDS.J((int)c2.k[b2 << Yqa.i | a2 << AQa.P | d22]);
        if (d22 != null) {
            return d22;
        }
        return QFa.HF.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        void d2;
        XX_1 xX_1 = this;
        Block block = xX_1.J((int)d2, (int)c2, (int)b2).J();
        Block e2 = a2.J();
        if (block != QFa.HF) {
            xX_1.A -= vRa.d;
            if (block.M()) {
                xX_1.M -= vRa.d;
            }
        }
        if (e2 != QFa.HF) {
            xX_1.A += vRa.d;
            if (e2.M()) {
                xX_1.M += vRa.d;
            }
        }
        xX_1.k[c2 << Yqa.i | b2 << AQa.P | d2] = (char)Block.BLOCK_STATE_IDS.J((Object)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        XX_1 a2 = this;
        a2.i.J((int)d2, (int)c2, (int)b2, (int)e2);
    }

    public char[] J() {
        XX_1 a2;
        return a2.k;
    }

    public void f(wX wX2) {
        XX_1 b2 = wX2;
        XX_1 a2 = this;
        a2.i = b2;
    }

    public int J() {
        XX_1 a2;
        return a2.j;
    }

    public void J(wX wX2) {
        XX_1 b2 = wX2;
        XX_1 a2 = this;
        a2.I = b2;
    }
}

