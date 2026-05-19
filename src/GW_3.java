/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BV
 *  ERa
 *  Gg
 *  Jy
 *  Nx
 *  xV
 */
import java.util.Random;

public final class GW_3
extends Nx {
    /*
     * WARNING - void declaration
     */
    public GW_3(Gg gg2, Random random, int n2, int n3) {
        GW_3 gW_3;
        block2: {
            GW_3 gW_32;
            block3: {
                Object e2;
                void c2;
                void a2;
                void b2;
                block0: {
                    Jy d2;
                    block1: {
                        gW_32 = this;
                        super((int)b2, (int)a2);
                        d2 = d2.J(new XF((int)(b2 * ERa.C + Yqa.i), uSa.E, (int)(a2 * ERa.C + Yqa.i)));
                        if (d2 == Jy.Fa || d2 == Jy.y) break block0;
                        if (d2 != Jy.g) break block1;
                        e2 = new BV((Random)c2, (int)(b2 * ERa.C), (int)(a2 * ERa.C));
                        GW_3 gW_33 = gW_32;
                        gW_3 = gW_33;
                        gW_33.components.add(e2);
                        break block2;
                    }
                    if (d2 != Jy.ea && d2 != Jy.Ga) break block3;
                    e2 = new Tw((Random)c2, (int)(b2 * ERa.C), (int)(a2 * ERa.C));
                    GW_3 gW_34 = gW_32;
                    gW_3 = gW_34;
                    gW_34.components.add(e2);
                    break block2;
                }
                e2 = new xV((Random)c2, (int)(b2 * ERa.C), (int)(a2 * ERa.C));
                gW_32.components.add(e2);
            }
            gW_3 = gW_32;
        }
        gW_3.J();
    }

    public GW_3() {
        GW_3 a2;
    }
}

