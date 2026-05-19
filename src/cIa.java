/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  XTa
 *  Yfa
 *  gFa
 *  kqa
 *  vL
 *  vRa
 *  vpa
 *  wra
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cIa
extends gFa {
    private static final Predicate<IBlockState> j = BlockStateHelper.J(QFa.y).J(BlockTallGrass.TYPE, Predicates.equalTo(BlockTallGrass$EnumType.GRASS));
    private Gg J;
    private Yfa A;
    public int I;

    public void J() {
        a.I = uSa.E;
    }

    public boolean l() {
        cIa a2;
        if (a2.I > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        cIa cIa2 = this;
        if (cIa2.A.J().nextInt(cIa2.A.Y() ? vpa.o : PRa.U) != 0) {
            return uSa.E != 0;
        }
        Object a2 = new XF(cIa2.A.la, cIa2.A.Z, cIa2.A.A);
        if (j.apply(cIa2.J.J((XF)((Object)a2)))) {
            return vRa.d != 0;
        }
        if (cIa2.J.J(((XF)((Object)a2)).down()).J() == QFa.lf) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        cIa a2;
        a2.I = wra.P;
        cIa cIa2 = a2;
        a2.J.J((vL)cIa2.A, (byte)NTa.C);
        cIa2.A.J().f();
    }

    public void f() {
        cIa cIa2;
        cIa cIa3 = cIa2 = this;
        cIa3.I = Math.max(uSa.E, cIa3.I - vRa.d);
        if (cIa3.I == AQa.P) {
            Object a2 = new XF(cIa2.A.la, cIa2.A.Z, cIa2.A.A);
            if (j.apply(cIa2.J.J((XF)((Object)a2)))) {
                if (cIa2.J.J().f(kqa.N)) {
                    cIa2.J.f((XF)((Object)a2), uSa.E != 0);
                }
                cIa2.A.w();
                return;
            }
            if (cIa2.J.J((XF)((Object)(a2 = ((XF)((Object)a2)).down()))).J() == QFa.lf) {
                if (cIa2.J.J().f(kqa.N)) {
                    cIa cIa4 = cIa2;
                    cIa4.J.f(zta.Z, (XF)((Object)a2), Block.J(QFa.lf));
                    cIa4.J.J((XF)((Object)a2), QFa.Bc.J(), uqa.g);
                }
                cIa2.A.w();
            }
        }
    }

    public int f() {
        cIa a2;
        return a2.I;
    }

    public cIa(Yfa yfa) {
        cIa b2 = yfa;
        cIa a2 = this;
        a2.A = b2;
        a2.J = ((Yfa)b2).j;
        a2.J(XTa.W);
    }
}

