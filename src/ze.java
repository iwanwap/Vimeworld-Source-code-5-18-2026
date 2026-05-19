/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ypa
 *  pua
 *  vRa
 */
import net.minecraft.block.state.BlockStateBase;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ze {
    private int[] A;
    private int I;

    public int J() {
        ze a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public ze(int n2, int[] nArray) {
        void b2;
        ze a2;
        Object c2 = nArray;
        ze ze2 = a2 = this;
        a2.I = pua.o;
        a2.A = null;
        ze2.I = b2;
        ze2.A = (int[])c2;
    }

    public ze(int n2) {
        ze a2;
        int b2 = n2;
        ze ze2 = a2 = this;
        a2.I = pua.o;
        ze2.A = null;
        ze2.I = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        ze a2 = this;
        if (a2.A != null && b2 >= 0 && b2 <= Ypa.A) {
            int n3;
            int n4 = n3 = uSa.E;
            while (n4 < a2.A.length) {
                if (a2.A[n3] == b2) {
                    return;
                }
                n4 = ++n3;
            }
            a2.A = Config.J(a2.A, b2);
        }
    }

    public boolean J(BlockStateBase blockStateBase) {
        BlockStateBase b2 = blockStateBase;
        ze a2 = this;
        if (b2.l() != a2.I) {
            return uSa.E != 0;
        }
        return Nf.J(b2.f(), a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public ze(int n2, int n3) {
        void b2;
        ze a2;
        int c2 = n3;
        ze ze2 = a2 = this;
        a2.I = pua.o;
        ze2.A = null;
        ze2.I = b2;
        if (c2 >= 0 && c2 <= Ypa.A) {
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = c2;
            a2.A = nArray;
        }
    }

    public int[] J() {
        ze a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        ze a2 = this;
        if (b2 != a2.I) {
            return uSa.E != 0;
        }
        return Nf.J(c2, a2.A);
    }

    public String toString() {
        ze a2;
        return new StringBuilder().insert(2 & 5, Mqa.y).append(a2.I).append(Era.Aa).append(Config.J(a2.A)).toString();
    }
}

