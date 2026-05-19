/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  ERa
 *  Ega
 *  HA
 *  XTa
 *  bea
 *  cQa
 *  kea
 *  lqa
 *  mra
 *  pPa
 *  pqa
 *  uKa
 */
import net.minecraft.util.ResourceLocation;

public final class kOa
extends Ama {
    private final kea J;
    private HA A;
    private static final ResourceLocation I = new ResourceLocation(uqa.l);

    /*
     * WARNING - void declaration
     */
    public kOa(kea kea2, HA hA2) {
        void b2;
        kOa a2;
        kOa c2 = hA2;
        kOa kOa2 = a2 = this;
        super((Ega)new bea((kea)b2, (HA)c2));
        kOa2.J = b2;
        kOa2.A = c2;
    }

    public void J(float f2, int n2, int n3) {
        kOa kOa2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        kOa kOa3 = kOa2;
        kOa3.g.J().J(I);
        kOa kOa4 = kOa2;
        reference c2 = (kOa3.A - kOa4.j) / uqa.g;
        reference b2 = (kOa4.I - kOa2.F) / uqa.g;
        kOa kOa5 = kOa2;
        kOa3.f((int)c2, (int)b2, uSa.E, uSa.E, kOa5.j, kOa5.F);
        int a2 = kOa3.A.J(uSa.E);
        if (a2 > 0) {
            int n4;
            int d2 = (int)(mra.q * (pqa.r - (float)a2 / uSa.A));
            if (d2 > 0) {
                kOa2.f((int)(c2 + Hta.k), (int)(b2 + ERa.C), MTa.U, uSa.E, WOa.fa, d2);
            }
            switch (a2 / uqa.g % XTa.W) {
                case 0: {
                    while (false) {
                    }
                    n4 = d2 = ITa.A;
                    break;
                }
                case 1: {
                    n4 = d2 = osa.c;
                    break;
                }
                case 2: {
                    n4 = d2 = kTa.j;
                    break;
                }
                case 3: {
                    n4 = d2 = ERa.C;
                    break;
                }
                case 4: {
                    n4 = d2 = pPa.f;
                    break;
                }
                case 5: {
                    n4 = d2 = uua.p;
                    break;
                }
                case 6: {
                    d2 = uSa.E;
                }
                default: {
                    n4 = d2;
                }
            }
            if (n4 > 0) {
                kOa2.f((int)(c2 + fPa.ga), (int)(b2 + hpa.Z + ITa.A - d2), cQa.q, ITa.A - d2, lqa.s, d2);
            }
        }
    }

    public void J(int n2, int n3) {
        kOa b2;
        int c2 = n2;
        kOa kOa2 = b2 = this;
        String string = c2 = kOa2.A.J().f();
        kOa2.L.J(string, b2.j / uqa.g - b2.L.J(string) / uqa.g, uua.p, tpa.i);
        kOa kOa3 = b2;
        kOa3.L.J(kOa3.J.J().f(), Yqa.i, b2.F - zua.m + uqa.g, tpa.i);
    }
}

