/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  ERa
 *  Gg
 *  Jv
 *  Jy
 *  NTa
 *  ODa
 *  QFa
 *  XTa
 *  jW
 *  rY
 *  vRa
 *  vpa
 */
import java.util.Random;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cY
extends Jy {
    private static final IBlockState j = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.JUNGLE);
    private static final IBlockState J;
    private static final IBlockState A;
    private boolean I;

    public bV J(Random random) {
        Random b2 = random;
        cY a2 = this;
        if (b2.nextInt(NTa.C) == 0) {
            return a2.e;
        }
        if (b2.nextInt(uqa.g) == 0) {
            return new Jv(j, J);
        }
        if (!a2.I && b2.nextInt(yRa.d) == 0) {
            return new jw(uSa.E != 0, NTa.C, kTa.j, j, A);
        }
        return new hx(uSa.E != 0, AQa.P + b2.nextInt(XTa.W), j, A, vRa.d != 0);
    }

    static {
        A = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.JUNGLE).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
        J = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.OAK).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF) {
        void a2;
        void b2;
        void c2;
        cY cY2 = this;
        void v0 = c2;
        super.J((Gg)v0, (Random)b2, (XF)a2);
        void v1 = b2;
        int n2 = v1.nextInt(ERa.C) + Yqa.i;
        int d2 = v1.nextInt(ERa.C) + Yqa.i;
        int n3 = v1.nextInt(v0.l(a2.add(n2, uSa.E, d2)).getY() * uqa.g);
        new wU().J((Gg)c2, (Random)b2, a2.add(n2, n3, d2));
        Bx bx2 = new Bx();
        d2 = uSa.E;
        int n4 = d2;
        while (n4 < vpa.o) {
            void v3 = b2;
            n3 = v3.nextInt(ERa.C) + Yqa.i;
            int n5 = v3.nextInt(ERa.C) + Yqa.i;
            bx2.J((Gg)c2, (Random)b2, a2.add(n3, XOa.h, n5));
            n4 = ++d2;
        }
    }

    public jW J(Random random) {
        Random b2 = random;
        cY a2 = this;
        if (b2.nextInt(AQa.P) == 0) {
            return new dx(BlockTallGrass$EnumType.FERN);
        }
        return new dx(BlockTallGrass$EnumType.GRASS);
    }

    /*
     * WARNING - void declaration
     */
    public cY(int n2, boolean bl) {
        cY cY2;
        void b2;
        boolean c2 = bl;
        cY a2 = this;
        super((int)b2);
        a2.I = c2;
        if (a2.I) {
            cY2 = a2;
            ((rY)a2.A).h = uqa.g;
        } else {
            cY2 = a2;
            ((rY)a2.A).h = vpa.o;
        }
        ((rY)cY2.A).T = kTa.g;
        ((rY)a2.A).C = AQa.P;
        if (!c2) {
            a2.ga.add(new AZ(ODa.class, uqa.g, vRa.d, vRa.d));
        }
        a2.q.add(new AZ(aEa.class, NTa.C, AQa.P, AQa.P));
    }
}

