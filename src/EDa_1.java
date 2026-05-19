/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  HA
 *  JPa
 *  Lra
 *  QFa
 *  Qea
 *  Rda
 *  Vea
 *  eAa
 *  gZ
 *  kPa
 *  kea
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class EDa_1
extends Vea {
    public int f() {
        return Lra.e;
    }

    /*
     * WARNING - void declaration
     */
    public Ega J(kea kea2, Sx sx2) {
        void b2;
        Object c2 = sx2;
        EDa_1 a2 = this;
        return new Qea((HA)b2, (HA)a2, (Sx)((Object)c2));
    }

    public String f() {
        return kPa.Ja;
    }

    public Rda J() {
        return Rda.CHEST;
    }

    public IBlockState f() {
        return QFa.dC.J().J(BlockChest.FACING, DZ.NORTH);
    }

    public EDa_1(Gg gg2) {
        EDa_1 b2 = gg2;
        EDa_1 a2 = this;
        super((Gg)b2);
    }

    public int k() {
        return Yqa.i;
    }

    public void J(gZ gZ2) {
        EDa_1 a2;
        EDa_1 b2 = gZ2;
        EDa_1 eDa_1 = a2 = this;
        super.J((gZ)b2);
        if (eDa_1.j.J().f(qQa.y)) {
            a2.J(eAa.J((Block)QFa.dC), vRa.d, JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    public EDa_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        EDa_1 e2 = gg2;
        EDa_1 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }
}

