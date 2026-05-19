/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  FBa
 *  Gg
 *  JPa
 *  NTa
 *  OCa
 *  Tf
 *  XB
 *  XTa
 *  asa
 *  gda
 *  sF
 *  vRa
 *  vU
 */
import optifine.Config;

public final class vE_2
extends Tf {
    private OCa I;

    private void j() {
        vE_2 a2;
        if (a2.K.J().getID() == vRa.d) {
            long l2 = a2.f();
            long l3 = l2 % dua.Aa;
            if (Config.p()) {
                if (l3 <= asa.fa) {
                    a2.f(l2 - l3 + KSa.k);
                }
                if (l3 >= NTa.J) {
                    a2.f(l2 - l3 + fPa.U);
                }
            }
            if (Config.Ma()) {
                if (l3 <= zta.Ja) {
                    a2.f(l2 - l3 + mPa.v);
                }
                if (l3 >= tua.Q) {
                    a2.f(l2 - l3 + dua.Aa + mPa.v);
                }
            }
        }
    }

    private void F() {
        vE_2 a2;
        if (a2.K.f() || a2.K.J()) {
            vE_2 vE_22 = a2;
            vE_22.K.M(uSa.E);
            vE_22.K.d(uSa.E != 0);
            vE_22.J(JPa.N);
            vE_22.K.d(uSa.E);
            vE_22.K.C(uSa.E != 0);
            vE_22.f(JPa.N);
            vE_22.I.J().J((KC)new FBa(uqa.g, JPa.N));
            vE_22.I.J().J((KC)new FBa(XTa.W, JPa.N));
            vE_22.I.J().J((KC)new FBa(Yqa.i, JPa.N));
        }
    }

    public void f() {
        vE_2 a2;
        if (!Config.o()) {
            a2.F();
        }
        super.f();
    }

    public void e() {
        vE_2 a2;
        super.e();
        if (!Config.n()) {
            a2.j();
        }
        if (Config.waterOpacityChanged) {
            Config.waterOpacityChanged = uSa.E;
            sF.J((Cia)Config.J(), (Gg)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public vE_2(OCa oCa, XB xB2, vU vU2, int n2, gda gda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        vE_2 f2 = oCa;
        vE_2 e2 = this;
        super((OCa)f2, (XB)d2, (vU)c2, (int)b2, (gda)a2);
        e2.I = f2;
    }
}

