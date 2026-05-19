/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kna
 *  Kpa
 *  LW
 *  NTa
 *  Pna
 *  Qsa
 *  Qta
 *  Tpa
 *  cb
 *  lqa
 *  nQa
 *  pY
 *  pua
 *  vRa
 *  ysa
 */
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

public final class ena
extends cb {
    public final /* synthetic */ Pna I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, boolean bl, int n3, int n4) {
        void c2;
        void d2;
        ena b2;
        int e2 = n3;
        ena ena2 = b2 = this;
        Pna.J((Pna)ena2.I, (int)d2);
        e2 = Pna.J((Pna)ena2.I) >= 0 && Pna.J((Pna)b2.I) < b2.e() ? vRa.d : uSa.E;
        ena ena3 = b2;
        Pna.C((Pna)ena3.I).J = e2;
        Pna.l((Pna)ena3.I).J = e2;
        Pna.f((Pna)ena3.I).J = e2;
        Pna.J((Pna)ena3.I).J = e2;
        if (c2 != false && e2 != 0) {
            b2.I.J((int)d2);
        }
    }

    public int C() {
        ena a2;
        return Pna.J((Pna)a2.I).size() * Qsa.Ha;
    }

    public int e() {
        ena a2;
        return Pna.J((Pna)a2.I).size();
    }

    public void l() {
        ena a2;
        a2.I.i();
    }

    public boolean f(int n2) {
        int b2 = n2;
        ena a2 = this;
        if (b2 == Pna.J((Pna)a2.I)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public ena(Pna pna2, Kpa kpa2) {
        void a2;
        ena c2 = pna2;
        ena b2 = this;
        b2.I = c2;
        super((Kpa)a2, ((Pna)c2).A, ((Pna)c2).I, fPa.i, ((Pna)c2).I - ysa.s, Qsa.Ha);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        ena ena2;
        void f22;
        int n8 = n7;
        ena a2 = this;
        LW c2 = (LW)Pna.J((Pna)a2.I).get((int)f22);
        String b2 = c2.getDisplayName();
        if (StringUtils.isEmpty(b2)) {
            b2 = new StringBuilder().insert(2 & 5, Pna.J((Pna)a2.I)).append(Tpa.E).append((int)(f22 + vRa.d)).toString();
        }
        LW lW2 = c2;
        String f22 = lW2.getFileName();
        f22 = new StringBuilder().insert(3 & 4, f22).append(nQa.T).append(Pna.J((Pna)a2.I).format(new Date(c2.getLastTimePlayed()))).toString();
        f22 = new StringBuilder().insert(2 & 5, f22).append(hpa.b).toString();
        String g2 = Mqa.y;
        if (lW2.requiresConversion()) {
            g2 = new StringBuilder().insert(2 & 5, Pna.f((Pna)a2.I)).append(Tpa.E).append(g2).toString();
            ena2 = a2;
        } else {
            g2 = Pna.J((Pna)a2.I)[c2.getEnumGameType().getID()];
            if (c2.isHardcoreModeEnabled()) {
                g2 = pY.DARK_RED + oha.J(Tqa.I, new Object[uSa.E]) + pY.RESET;
            }
            if (c2.getCheatsEnabled()) {
                g2 = new StringBuilder().insert(3 >> 2, g2).append(TOa.n).append(oha.J(Jsa.N, new Object[uSa.E])).toString();
            }
            ena2 = a2;
        }
        Pna cfr_ignored_0 = ena2.I;
        ena ena3 = a2;
        Pna.J((Kna)ena3.I.L, (String)b2, (int)(e2 + uqa.g), (int)(d2 + vRa.d), (int)pua.o);
        Pna cfr_ignored_1 = ena3.I;
        ena ena4 = a2;
        Pna.J((Kna)ena4.I.L, (String)f22, (int)(e2 + uqa.g), (int)(d2 + lqa.s), (int)Qta.L);
        Pna cfr_ignored_2 = ena4.I;
        Pna.J((Kna)a2.I.L, (String)g2, (int)(e2 + uqa.g), (int)(d2 + lqa.s + NTa.C), (int)Qta.L);
    }
}

