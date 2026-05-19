/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  gFa
 *  kpa
 *  kqa
 *  vL
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fea
extends gFa {
    private qda A;
    private int I;

    public boolean f() {
        Fea a2;
        if (a2.I > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        Fea fea2;
        Fea fea3 = fea2 = this;
        fea3.I -= vRa.d;
        if (fea3.I <= 0) {
            int a2;
            Fea fea4 = fea2;
            Gg gg2 = fea4.A.j;
            Random random = fea4.A.J();
            XF xF = new XF((vL)fea2.A);
            int n2 = a2 = uSa.E;
            while (n2 <= tTa.h && a2 >= kpa.w) {
                int n3;
                int n4 = uSa.E;
                while (n4 <= NTa.C && n3 >= ypa.y) {
                    int n5;
                    int n6 = uSa.E;
                    while (n6 <= NTa.C && n5 >= ypa.y) {
                        XF xF2 = xF.add(n3, a2, n5);
                        IBlockState iBlockState = gg2.J(xF2);
                        if (iBlockState.J() == QFa.Od) {
                            Random random2;
                            if (gg2.J().f(kqa.N)) {
                                random2 = random;
                                gg2.f(xF2, vRa.d != 0);
                            } else {
                                gg2.J(xF2, iBlockState.J(BlockSilverfish.VARIANT).getModelBlock(), yRa.d);
                                random2 = random;
                            }
                            if (random2.nextBoolean()) {
                                return;
                            }
                        }
                        n6 = n5 = n5 <= 0 ? vRa.d - n5 : uSa.E - n5;
                    }
                    n4 = n3 = n3 <= 0 ? vRa.d - n3 : uSa.E - n3;
                }
                n2 = a2 = a2 <= 0 ? vRa.d - a2 : uSa.E - a2;
            }
        }
    }

    public void C() {
        Fea a2;
        if (a2.I == 0) {
            a2.I = kTa.j;
        }
    }

    public Fea(qda qda2) {
        Object b2 = qda2;
        Fea a2 = this;
        a2.A = b2;
    }
}

