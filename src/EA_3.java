/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  ERa
 *  Epa
 *  FPa
 *  Fpa
 *  Le
 *  NOa
 *  PF
 *  RQa
 *  SOa
 *  Uqa
 *  XTa
 *  YSa
 *  aSa
 *  asa
 *  fTa
 *  if
 *  oqa
 *  uRa
 *  vB
 *  vRa
 *  wOa
 */
import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.List;

public final class EA_3
extends vB {
    private static final List<String> I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        reference v6;
        String string;
        EA_3 eA_3;
        rc rc2;
        Object c222;
        String string2;
        String string3;
        void b232;
        int c222 = n3;
        EA_3 a2 = this;
        if (!WF.f()) {
            EA_3 eA_32 = a2;
            eA_32.k = aSa.V;
            eA_32.j = aSa.V;
            return;
        }
        super.f((int)b232, c222);
        a2.k = cPa.x;
        a2.j = DPa.Aa;
        rc b232 = Bc.Ba;
        if (WF.J()) {
            EA_3 eA_33 = a2;
            string3 = eA_33.J(OT.e - WF.J());
            string2 = Fpa.fa;
            c222 = eA_33.A ? Bc.sb : Bc.I;
            rc2 = a2.A ? Bc.Da : Bc.sb;
            eA_3 = a2;
        } else if (WF.h) {
            string3 = wOa.la;
            string2 = I.get((int)((System.currentTimeMillis() - WF.m) / WOa.D) % I.size());
            c222 = a2.A ? Bc.S : Bc.oa;
            rc2 = a2.A ? Bc.u : Bc.S;
            eA_3 = a2;
        } else {
            string3 = NOa.L;
            string2 = null;
            c222 = a2.A ? Bc.X : Bc.Za;
            rc2 = a2.A ? Bc.K : Bc.X;
            eA_3 = a2;
        }
        if.J(eA_3.I, (double)a2.J, (double)a2.k, (double)a2.j, (double)oua.i, (Color)((rc)c222).transparent(WF.J()), (Color)rc2.transparent(WF.J()));
        c222 = Le.J((PF)PF.VIME_ART, (int)ERa.C);
        ((Ii)c222).J(string3, (int)(a2.I + (double)(string2 != null ? yta.Ka : tTa.h)), (int)(a2.J + FPa.T), b232.transparent(WF.J()).getRGB(), uSa.E != 0);
        if (string2 != null) {
            ((Ii)c222).J(string2, (int)(a2.I + DQa.S), (int)(a2.J + uRa.I), b232.transparent(WF.J()).getRGB(), uSa.E != 0);
        }
        EA_3 eA_34 = a2;
        reference var6_10 = eA_34.I + a2.k - SOa.w;
        double d2 = eA_34.J + (a2.j - Wqa.m) / KPa.y - oua.i;
        Ii ii2 = Le.J((PF)PF.VIME_ART, (int)ERa.C);
        if (!WF.J() && !WF.h) {
            string = MTa.q;
            v6 = var6_10;
        } else {
            string = tua.x;
            v6 = var6_10;
        }
        ii2.J(string, (int)v6, (int)d2, b232.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    private String J(long a2) {
        long l2 = (a2 /= asa.fa) / Uqa.r;
        long l3 = a2 % Uqa.r / kra.J;
        long l4 = a2 % kra.J / RQa.N;
        a2 %= RQa.N;
        if (l2 > nqa.i) {
            Object[] objectArray = new Object[AQa.P];
            objectArray[uSa.E] = l2;
            objectArray[vRa.d] = l3;
            objectArray[uqa.g] = l4;
            objectArray[yRa.d] = a2;
            return String.format(fTa.n, objectArray);
        }
        if (l3 > nqa.i) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = l3;
            objectArray[vRa.d] = l4;
            objectArray[uqa.g] = a2;
            return String.format(YSa.l, objectArray);
        }
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = l4;
        objectArray[vRa.d] = a2;
        return String.format(Tqa.ga, objectArray);
    }

    public EA_3() {
        super(uSa.E, uSa.E, DPa.J, yOa.B, null, null);
        EA_3 a2;
    }

    static {
        String[] stringArray = new String[Yqa.i];
        stringArray[uSa.E] = zua.q;
        stringArray[vRa.d] = oqa.Aa;
        stringArray[uqa.g] = lQa.ea;
        stringArray[yRa.d] = DPa.Z;
        stringArray[AQa.P] = Epa.p;
        stringArray[tTa.h] = DPa.Z;
        stringArray[uua.p] = lQa.ea;
        stringArray[XTa.W] = oqa.Aa;
        I = Lists.newArrayList(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void b2;
        void e2;
        boolean bl3 = bl2;
        EA_3 a2 = this;
        if (!a2.f()) {
            return;
        }
        if (e2 != false && b2 == false) {
            if (WF.J() || WF.h) {
                WF.l();
                return;
            }
            WF.M();
        }
    }
}

