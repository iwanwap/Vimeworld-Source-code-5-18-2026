/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ol
 *  Wj
 *  YL
 *  bl
 *  fl
 *  pua
 *  uQa
 *  vRa
 *  xOa
 */
public final class Wj_3
implements Runnable {
    public YL A;
    public final /* synthetic */ Ol I;

    public static /* synthetic */ void f(Wj a2) {
        Wj wj2 = a2;
        Ol.J((Ol)wj2.I, (YL)wj2.A);
    }

    public static /* synthetic */ void J(Wj a2) {
        Wj wj2 = a2;
        Ol.J((Ol)wj2.I, (YL)wj2.A);
    }

    @Override
    public void run() {
        Wj_3 a22;
        Wj_3 wj_3 = this;
        if (wj_3.A.m.startsWith(uQa.Y)) {
            a22 = OT.i.C.J(wj_3.A.m.substring(vRa.d));
            a22.J().join();
            wj_3.A.m = new StringBuilder().insert(3 >> 2, pua.v).append(a22.f()).append(Lsa.D).toString();
            Ol.J((Ol)wj_3.I).J(fl.J((Wj)wj_3));
            return;
        }
        try {
            a22 = OT.i.C.J(wj_3.A.m, nua.Ha, gsa.Y);
            wj_3.A.m = new StringBuilder().insert(2 & 5, fqa.u).append(a22.J()).toString();
            Ol.J((Ol)wj_3.I).J(bl.J((Wj)wj_3));
            return;
        }
        catch (Exception a22) {
            OT.b.warn(new StringBuilder().insert(3 & 4, xOa.Ha).append(wj_3.A.m).append(TOa.G).toString(), (Throwable)a22);
            return;
        }
    }

    public Wj_3(Ol ol2, YL yL2) {
        Wj_3 b2 = yL2;
        Wj_3 a2 = this;
        a2.I = ol2;
        a2.A = b2;
    }
}

