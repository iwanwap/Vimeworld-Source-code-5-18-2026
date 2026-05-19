/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Ega
 *  HA
 *  JPa
 *  Mda
 *  QNa
 *  kea
 *  vRa
 *  wra
 */
import com.google.common.collect.Lists;
import java.util.List;

public final class Jna
extends Ega {
    public List<Mda> J;

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        void a22;
        Jna jna = this;
        int b2 = (jna.J.size() + WOa.fa - vRa.d) / WOa.fa - tTa.h;
        int a22 = (int)((double)(a22 * (float)b2) + kTa.B);
        if (a22 < 0) {
            a22 = uSa.E;
        }
        int n2 = b2 = uSa.E;
        while (n2 < tTa.h) {
            int n3 = uSa.E;
            while (n3 < WOa.fa) {
                int n4;
                int n5 = n4 + (b2 + a22) * WOa.fa;
                if (n5 >= 0 && n5 < jna.J.size()) {
                    QNa.J().J(n4 + b2 * WOa.fa, jna.J.get(n5));
                } else {
                    QNa.J().J(n4 + b2 * WOa.fa, (Mda)null);
                }
                n3 = ++n4;
            }
            n2 = ++b2;
        }
    }

    public boolean J(sEa sEa2) {
        Object b2 = sEa2;
        Jna a2 = this;
        if (((sEa)b2).J instanceof kea || ((sEa)b2).A > Jsa.ha && ((sEa)b2).j <= vua.y) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Jna(Sx sx2) {
        int b2;
        kea a2;
        Jna jna = this;
        jna.J = Lists.newArrayList();
        a2 = a2.K;
        int n2 = b2 = uSa.E;
        while (n2 < tTa.h) {
            int n3 = uSa.E;
            while (n3 < WOa.fa) {
                int n4;
                int n5 = b2 * WOa.fa + n4;
                int n6 = WOa.fa + n4 * yOa.B;
                jna.J(new sEa((HA)QNa.J(), n5, n6, yOa.B + b2 * yOa.B));
                n3 = ++n4;
            }
            n2 = ++b2;
        }
        int n7 = b2 = uSa.E;
        while (n7 < WOa.fa) {
            int n8 = b2++;
            jna.J(new sEa((HA)a2, n8, WOa.fa + n8 * yOa.B, BRa.E));
            n7 = b2;
        }
        jna.J(JPa.N);
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        Jna a2 = this;
        return vRa.d != 0;
    }

    public boolean J(Mda mda2, sEa sEa2) {
        Object c2 = sEa2;
        Jna a2 = this;
        if (((sEa)c2).A > Jsa.ha) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Mda J(Sx sx2, int n2) {
        sEa b2;
        int c2 = n2;
        Jna a2 = this;
        if (c2 >= a2.A.size() - WOa.fa && c2 < a2.A.size() && (b2 = (sEa)a2.A.get(c2)) != null && b2.J()) {
            b2.J((Mda)null);
        }
        return null;
    }

    public boolean J() {
        Jna a2;
        if (a2.J.size() > wra.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(int n2, int n3, boolean bl, Sx sx2) {
        Jna jna = object;
        Object object = sx2;
        Jna a2 = jna;
    }
}

