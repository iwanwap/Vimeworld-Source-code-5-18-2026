/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  VQa
 *  XTa
 *  Ypa
 *  cRa
 *  jW
 *  lqa
 *  pPa
 *  pua
 *  uY
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class VV
extends jW {
    private static final String[] J;
    private static final Logger A;
    private static final List<baa> I;

    static {
        A = LogManager.getLogger();
        String[] stringArray = new String[AQa.P];
        stringArray[uSa.E] = cRa.S;
        stringArray[vRa.d] = VQa.E;
        stringArray[uqa.g] = VQa.E;
        stringArray[yRa.d] = Vra.ja;
        J = stringArray;
        baa[] baaArray = new baa[Ypa.A];
        baaArray[uSa.E] = new baa(Gea.NA, uSa.E, vRa.d, vRa.d, NTa.C);
        baaArray[vRa.d] = new baa(Gea.GA, uSa.E, vRa.d, AQa.P, NTa.C);
        baaArray[uqa.g] = new baa(Gea.Ra, uSa.E, vRa.d, vRa.d, NTa.C);
        baaArray[yRa.d] = new baa(Gea.DC, uSa.E, vRa.d, AQa.P, NTa.C);
        baaArray[AQa.P] = new baa(Gea.xB, uSa.E, vRa.d, AQa.P, NTa.C);
        baaArray[tTa.h] = new baa(Gea.gd, uSa.E, vRa.d, AQa.P, NTa.C);
        baaArray[uua.p] = new baa(Gea.Ca, uSa.E, vRa.d, vRa.d, NTa.C);
        baaArray[XTa.W] = new baa(Gea.pb, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[Yqa.i] = new baa(Gea.zc, uSa.E, vRa.d, AQa.P, NTa.C);
        baaArray[WOa.fa] = new baa(Gea.Va, uSa.E, vRa.d, vRa.d, AQa.P);
        baaArray[NTa.C] = new baa(Gea.dc, uSa.E, vRa.d, vRa.d, AQa.P);
        baaArray[pPa.f] = new baa(Gea.F, uSa.E, vRa.d, vRa.d, NTa.C);
        baaArray[lqa.s] = new baa(Gea.Yc, uSa.E, vRa.d, vRa.d, uqa.g);
        baaArray[uua.s] = new baa(Gea.La, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[hpa.Z] = new baa(Gea.sd, uSa.E, vRa.d, vRa.d, vRa.d);
        I = Lists.newArrayList(baaArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        XF xF3;
        int n2;
        int n3;
        void a2;
        int n4;
        void b2;
        VV d2 = gg2;
        VV c2 = this;
        void v0 = b2;
        int n5 = v0.nextInt(uqa.g) + uqa.g;
        int n6 = -n5 - vRa.d;
        int n7 = n5 + vRa.d;
        int n8 = v0.nextInt(uqa.g) + uqa.g;
        int n9 = -n8 - vRa.d;
        int n10 = n8 + vRa.d;
        int n11 = uSa.E;
        int n12 = n4 = n6;
        while (n12 <= n7) {
            int n13 = pua.o;
            while (n13 <= AQa.P) {
                int n14 = n9;
                while (n14 <= n10) {
                    xF3 = a2.add(n4, n3, n2);
                    Material material = d2.J(xF3).J().J();
                    boolean bl = material.i();
                    if (n3 == pua.o && !bl) {
                        return uSa.E != 0;
                    }
                    if (n3 == AQa.P && !bl) {
                        return uSa.E != 0;
                    }
                    if ((n4 == n6 || n4 == n7 || n2 == n9 || n2 == n10) && n3 == 0 && d2.J(xF3) && d2.J(xF3.up())) {
                        ++n11;
                    }
                    n14 = ++n2;
                }
                n13 = ++n3;
            }
            n12 = ++n4;
        }
        if (n11 >= vRa.d && n11 <= tTa.h) {
            int n15 = n4 = n6;
            while (n15 <= n7) {
                int n16 = yRa.d;
                while (n16 >= pua.o) {
                    int n17 = n9;
                    while (n17 <= n10) {
                        xF3 = a2.add(n4, n3, n2);
                        if (n4 != n6 && n3 != pua.o && n2 != n9 && n4 != n7 && n3 != AQa.P && n2 != n10) {
                            if (d2.J(xF3).J() != QFa.dC) {
                                d2.G(xF3);
                            }
                        } else if (xF3.getY() >= 0 && !d2.J(xF3.down()).J().J().i()) {
                            d2.G(xF3);
                        } else if (d2.J(xF3).J().J().i() && d2.J(xF3).J() != QFa.dC) {
                            if (n3 == pua.o && b2.nextInt(AQa.P) != 0) {
                                d2.J(xF3, QFa.h.J(), uqa.g);
                            } else {
                                d2.J(xF3, QFa.yB.J(), uqa.g);
                            }
                        }
                        n17 = ++n2;
                    }
                    n16 = --n3;
                }
                n15 = ++n4;
            }
            int n18 = n4 = uSa.E;
            while (n18 < uqa.g) {
                int n19 = uSa.E;
                while (n19 < yRa.d) {
                    int n20;
                    int n21;
                    void v9 = a2;
                    n2 = v9.getX() + b2.nextInt(n5 * uqa.g + vRa.d) - n5;
                    XF xF4 = new XF(n2, n21 = v9.getY(), n20 = v9.getZ() + b2.nextInt(n8 * uqa.g + vRa.d) - n8);
                    if (d2.J(xF4)) {
                        n6 = uSa.E;
                        for (DZ dZ2 : LX.HORIZONTAL) {
                            if (!d2.J(xF4.offset(dZ2)).J().J().i()) continue;
                            ++n6;
                        }
                        if (n6 == vRa.d) {
                            VV vV = d2;
                            vV.J(xF4, QFa.dC.J((Gg)vV, xF4, QFa.dC.J()), uqa.g);
                            baa[] baaArray = new baa[vRa.d];
                            baaArray[uSa.E] = Gea.ha.J((Random)b2);
                            List<baa> list = baa.J(I, baaArray);
                            uY uY2 = d2.J(xF4);
                            if (!(uY2 instanceof Fz)) break;
                            baa.J((Random)b2, list, (Fz)uY2, Yqa.i);
                            break;
                        }
                    }
                    n19 = ++n3;
                }
                n18 = ++n4;
            }
            d2.J((XF)a2, QFa.P.J(), uqa.g);
            uY uY3 = d2.J((XF)a2);
            if (uY3 instanceof Caa) {
                ((Caa)uY3).J().J(c2.J((Random)b2));
            } else {
                A.error(new StringBuilder().insert(5 >> 3, lqa.Da).append(a2.getX()).append(TOa.n).append(a2.getY()).append(TOa.n).append(a2.getZ()).append(hpa.b).toString());
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public VV() {
        VV a2;
    }

    private String J(Random random) {
        Random b2 = random;
        VV a2 = this;
        return J[b2.nextInt(J.length)];
    }
}

