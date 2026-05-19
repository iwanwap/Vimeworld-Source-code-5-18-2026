/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  EC
 *  Ms
 *  RQa
 *  Ysa
 *  ac
 *  kT
 *  tu
 *  vRa
 *  zU
 */
public final class Bt_2
extends CS {
    private static final int m = 6;
    private static final int C = 3;
    private static final int i = 5;
    private static final int M = 4;
    private static final int j = 1;
    private static final int J = 2;

    public Bt_2(EC eC2) {
        Bt_2 b2 = eC2;
        Bt_2 a2 = this;
        super((EC)b2, Yqa.y);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(ac ac2) {
        Bt_2 b2 = ac2;
        Bt_2 a2 = this;
        switch (((ac)b2).C) {
            case 1: {
                a2.g.J((EC)new kT((EC)a2));
                return;
            }
            case 2: {
                a2.g.J((EC)new Ms((EC)a2));
                return;
            }
            case 3: {
                a2.g.J((EC)new tu((EC)a2));
                return;
            }
            case 4: {
                a2.g.J((EC)new Pt((EC)a2));
                return;
            }
            case 5: {
                zU.M.J((!zU.M.f() ? vRa.d : uSa.E) != 0);
                ((ac)a2.E.get(AQa.P)).J(new StringBuilder().insert(3 ^ 3, EPa.P).append(zU.M.f() ? GPa.E : RQa.G).toString());
                return;
            }
            case 6: {
                ts.A = !ts.A ? vRa.d : uSa.E;
                ((ac)a2.E.get(tTa.h)).J(new StringBuilder().insert(3 ^ 3, Ura.Ka).append(ts.A ? GPa.E : RQa.G).toString());
                return;
            }
        }
    }

    public void J() {
        Bt_2 a2;
        ac ac2 = a2.J(vRa.d, kra.ia);
        Bt_2 bt_2 = a2;
        a2.J(uqa.g, ypa.s);
        bt_2.J(yRa.d, Ysa.Ja);
        bt_2.J(tTa.h, new StringBuilder().insert(3 ^ 3, EPa.P).append(zU.M.f() ? GPa.E : RQa.G).toString());
        a2.J(uua.p, new StringBuilder().insert(5 >> 3, Ura.Ka).append(ts.A ? GPa.E : RQa.G).toString());
        a2.J(AQa.P, DPa.L);
    }
}

