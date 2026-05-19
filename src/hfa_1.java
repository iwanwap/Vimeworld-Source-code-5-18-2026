/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ez
 *  Gg
 *  Mda
 *  NTa
 *  Pqa
 *  QFa
 *  Waa
 *  Yca
 *  fy
 *  rba
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockSkull;

public final class hfa_1
extends Yca {
    private boolean I = vRa.d;

    public void J(dc dc2) {
        dc b2 = dc2;
        hfa_1 a2 = this;
        if (a2.I) {
            b2.J().f(PRa.U, b2.J(), uSa.E);
            return;
        }
        b2.J().f(BQa.J, b2.J(), uSa.E);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Mda f(dc var1_1, Mda var2_2) {
        block4: {
            block3: {
                block5: {
                    block7: {
                        block6: {
                            var3_3 = this;
                            v0 = b;
                            b = v0.J();
                            var5_4 = BlockDispenser.J(v0.J());
                            var4_5 = v0.J().offset(var5_4);
                            c = QFa.kC;
                            if (!b.J(var4_5) || !c.J((Gg)b, var4_5, (Mda)a)) break block3;
                            if (b.e) break block4;
                            b.J(var4_5, c.J().J(BlockSkull.FACING, DZ.UP), yRa.d);
                            c = b.J(var4_5);
                            if (!(c instanceof fy)) break block5;
                            if (a.J() != yRa.d) break block6;
                            var6_6 = null;
                            if (!a.M()) ** GOTO lbl23
                            var7_7 /* !! */  = a.J();
                            if (var7_7 /* !! */ .J(Pqa.Aa, NTa.C)) {
                                var6_6 = rba.J((Waa)var7_7 /* !! */ .J(Pqa.Aa));
                                v1 = c;
                            } else {
                                if (var7_7 /* !! */ .J(Pqa.Aa, Yqa.i) && !Ez.J((String)(var7_7 /* !! */  = var7_7 /* !! */ .J(Pqa.Aa)))) {
                                    var6_6 = new GameProfile(null, (String)var7_7 /* !! */ );
                                }
lbl23:
                                // 4 sources

                                v1 = c;
                            }
                            ((fy)v1).J(var6_6);
                            v2 = c;
                            break block7;
                        }
                        ((fy)c).f(a.J());
                        v2 = c;
                    }
                    ((fy)v2).J(var5_4.getOpposite().getHorizontalIndex() * AQa.P);
                    QFa.kC.J((Gg)b, var4_5, (fy)c);
                }
                v3 = a;
                v3.E -= vRa.d;
                return v3;
            }
            var3_3.I = uSa.E;
        }
        return a;
    }

    public hfa_1() {
        hfa_1 a2;
    }
}

