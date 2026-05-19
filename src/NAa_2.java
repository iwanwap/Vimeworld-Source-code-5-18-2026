/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Ey
 *  Gg
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  Pqa
 *  QFa
 *  VQa
 *  Waa
 *  Ypa
 *  Yra
 *  eAa
 *  fy
 *  jRa
 *  qta
 *  rba
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.block.BlockSkull;

public final class NAa_2
extends eAa {
    private static final String[] I;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean J(Mda var1_1, Sx var2_2, Gg var3_3, XF var4_4, DZ var5_5, float var6_7, float var7_9, float var8_11) {
        block9: {
            block10: {
                block12: {
                    block11: {
                        v0 = this /* !! */ ;
                        this /* !! */  = var4_4;
                        e = v0;
                        if (d == DZ.DOWN) {
                            return (boolean)uSa.E;
                        }
                        if (!f.J((XF)i /* !! */ ).J().f((Gg)f, (XF)i /* !! */ )) {
                            if (!f.J((XF)i /* !! */ ).J().J().i()) {
                                return (boolean)uSa.E;
                            }
                            i /* !! */  = i /* !! */ .offset((DZ)d);
                        }
                        if (!g.J((XF)i /* !! */ , (DZ)d, (Mda)h)) {
                            return (boolean)uSa.E;
                        }
                        if (!QFa.kC.J((Gg)f, (XF)i /* !! */ )) {
                            return (boolean)uSa.E;
                        }
                        if (f.e) break block9;
                        f.J((XF)i /* !! */ , QFa.kC.J().J(BlockSkull.FACING, d), yRa.d);
                        d = uSa.E;
                        if (d == DZ.UP) {
                            d = Oz.f((double)((double)(g.X * Yra.i / CRa.ja) + kTa.B)) & Ypa.A;
                        }
                        if (!((g = f.J((XF)i /* !! */ )) instanceof fy)) break block10;
                        g = (fy)g;
                        if (h.J() != yRa.d) break block11;
                        c = null;
                        if (!h.M()) ** GOTO lbl32
                        v1 = b = h.J();
                        if (b.J(Pqa.Aa, NTa.C)) {
                            c = rba.J((Waa)v1.J(Pqa.Aa));
                            v2 = g;
                        } else {
                            if (v1.J(Pqa.Aa, Yqa.i) && b.J(Pqa.Aa).length() > 0) {
                                c = new GameProfile(null, b.J(Pqa.Aa));
                            }
lbl32:
                            // 4 sources

                            v2 = g;
                        }
                        v2.J(c);
                        v3 = g;
                        break block12;
                    }
                    v4 = g;
                    v3 = v4;
                    v4.f(h.J());
                }
                v3.J(d);
                QFa.kC.J((Gg)f, (XF)i /* !! */ , (fy)g);
            }
            h.E -= vRa.d;
        }
        return (boolean)vRa.d;
    }

    public String C(Mda mda2) {
        NAa_2 b22 = mda2;
        NAa_2 a2 = this;
        int b22 = b22.J();
        if (b22 < 0 || b22 >= I.length) {
            b22 = uSa.E;
        }
        return new StringBuilder().insert(3 >> 2, super.J()).append(VQa.ja).append(I[b22]).toString();
    }

    public int J(int n2) {
        int b2 = n2;
        NAa_2 a2 = this;
        return b2;
    }

    static {
        String[] stringArray = new String[tTa.h];
        stringArray[uSa.E] = vRa.Ka;
        stringArray[vRa.d] = POa.Q;
        stringArray[uqa.g] = Asa.Q;
        stringArray[yRa.d] = Zra.H;
        stringArray[AQa.P] = qta.B;
        I = stringArray;
    }

    public String l(Mda mda2) {
        NAa_2 b2 = mda2;
        NAa_2 a2 = this;
        if (b2.J() == yRa.d && b2.M()) {
            Waa waa2;
            if (b2.J().J(Pqa.Aa, Yqa.i)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = b2.J().J(Pqa.Aa);
                return Ey.J((String)jRa.Q, (Object[])objectArray);
            }
            if (b2.J().J(Pqa.Aa, NTa.C) && (waa2 = b2.J().J(Pqa.Aa)).J(DQa.N, Yqa.i)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = waa2.J(DQa.N);
                return Ey.J((String)jRa.Q, (Object[])objectArray);
            }
        }
        return super.l((Mda)b2);
    }

    public NAa_2() {
        NAa_2 a2;
        NAa_2 nAa_2 = a2;
        nAa_2.J(yGa.a);
        a2.f(uSa.E);
        a2.J(vRa.d != 0);
    }

    public boolean J(Waa waa2) {
        NAa_2 b2 = waa2;
        NAa_2 a2 = this;
        NAa_2 nAa_2 = b2;
        super.J((Waa)nAa_2);
        if (nAa_2.J(Pqa.Aa, Yqa.i) && b2.J(Pqa.Aa).length() > 0) {
            GameProfile gameProfile = new GameProfile(null, b2.J(Pqa.Aa));
            gameProfile = fy.J((GameProfile)gameProfile);
            b2.J(Pqa.Aa, (NCa)rba.J((Waa)new Waa(), (GameProfile)gameProfile));
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        Object d2 = yGa2;
        NAa_2 b2 = this;
        int n2 = d2 = uSa.E;
        while (n2 < I.length) {
            void c2;
            void a2;
            a2.add(new Mda((eAa)c2, vRa.d, d2++));
            n2 = d2;
        }
    }
}

