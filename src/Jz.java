/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JTa
 *  NCa
 *  Rda
 *  SZ
 *  Waa
 *  oX
 *  vRa
 */
public final class Jz
extends oX {
    private final Waa J;
    public final /* synthetic */ SZ A;
    private final String I;

    public static /* synthetic */ String J(Jz a2) {
        return a2.I;
    }

    /*
     * Unable to fully structure code
     */
    private Jz(SZ var1_1, Waa var2_2, String var3_3, int var4_4) {
        e = var3_3;
        b = this;
        b.A = d;
        super((int)a);
        if (!e.equals(zpa.P)) ** GOTO lbl11
        if (c != null) {
            e = Rda.byNetworkID((int)c.J(JTa.Ga)).getName();
            v0 = b;
        } else {
            e = APa.q;
lbl11:
            // 2 sources

            v0 = b;
        }
        v0.J = c;
        b.I = e;
    }

    public Waa J() {
        Jz a2;
        Waa waa2 = new Waa();
        waa2.J(Yqa.N, (NCa)a2.J);
        waa2.J(JTa.Ga, a2.I);
        waa2.J(PRa.Ha, a2.itemWeight);
        return waa2;
    }

    /*
     * WARNING - void declaration
     */
    public Jz(SZ sZ2, Waa waa2, String string) {
        void b2;
        void c2;
        Object d2 = string;
        Jz a2 = this;
        a2((SZ)c2, (Waa)b2, (String)d2, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public Jz(SZ sZ2, Waa waa2) {
        void b2;
        Jz c2 = waa2;
        Jz a2 = this;
        a2((SZ)b2, c2.J(Yqa.N), c2.J(JTa.Ga), c2.J(PRa.Ha));
    }

    public static /* synthetic */ Waa J(Jz a2) {
        return a2.J;
    }
}

