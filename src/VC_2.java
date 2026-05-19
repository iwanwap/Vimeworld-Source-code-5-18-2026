/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gd
 *  IC
 *  Tpa
 *  VC
 *  aSa
 *  uRa
 *  vRa
 *  yra
 */
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class VC_2
extends Gd {
    private final IC j;
    private final IC J;
    private final List<IC> A;
    private int I;

    private void J() {
        double d2;
        VC_2 vC_2 = this;
        if (vC_2.j == null || vC_2.J == null) {
            return;
        }
        vC_2.A.clear();
        double d3 = oua.i / (double)vC_2.I;
        double d4 = d2 = aSa.V;
        while (d4 <= oua.i) {
            VC_2 vC_22 = vC_2;
            VC_2 a2 = vC_22.J(d2);
            vC_22.A.add(new IC(((IC)a2).I, oua.i).C(aSa.V, ((IC)a2).A));
            d4 = d2 += d3;
        }
        vC_2.A.add(new IC(oua.i, aSa.V));
    }

    /*
     * WARNING - void declaration
     */
    public VC_2(String string) {
        void a2;
        String[] stringArray = this;
        String[] stringArray2 = stringArray;
        stringArray.A = new ArrayList<IC>();
        stringArray.I = uSa.E;
        String[] b2 = a2.replace(Tpa.E, Mqa.y).split(yra.t);
        if (b2.length != AQa.P) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, pta.Y).append((String)a2).append(uRa.N).toString());
        }
        stringArray.j = new IC(new StringBuilder().insert(3 >> 2, b2[uSa.E]).append(yra.t).append(b2[vRa.d]).toString());
        stringArray.J = new IC(new StringBuilder().insert(3 & 4, b2[uqa.g]).append(yra.t).append(b2[yRa.d]).toString());
        stringArray.J(kTa.g);
    }

    /*
     * WARNING - void declaration
     */
    private Map.Entry<IC, IC> J(double d2) {
        VC_2 vC_2;
        void a2;
        VC_2 b2;
        Object object;
        block5: {
            VC_2 vC_22 = this;
            if (vC_22.A.isEmpty()) {
                return new AbstractMap.SimpleEntry<IC, IC>(new IC(aSa.V, aSa.V), new IC(aSa.V, aSa.V));
            }
            object = vC_22.A.get(uSa.E);
            VC_2 vC_23 = vC_22;
            b2 = vC_23.A.get(vC_23.A.size() - vRa.d);
            for (IC iC : vC_22.A) {
                IC iC2;
                if (iC2.I < a2) {
                    object = iC;
                    continue;
                }
                if (!(iC.I > a2) || !(((IC)b2).I >= iC.I)) continue;
                vC_2 = b2 = iC;
                break block5;
            }
            vC_2 = b2;
        }
        if (((IC)vC_2).I < a2) {
            b2 = object;
        }
        if (object.I > a2) {
            object = b2;
        }
        return new AbstractMap.SimpleEntry<IC, VC_2>((IC)object, b2);
    }

    public int J() {
        VC_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public VC_2(IC iC, IC iC2, int n2) {
        void b2;
        void c2;
        VC_2 a2;
        int d2 = n2;
        VC_2 vC_2 = a2 = this;
        vC_2((IC)c2, (IC)b2);
        vC_2.J(d2);
    }

    public void J(int n2) {
        int b2 = n2;
        VC_2 a2 = this;
        if (a2.I == b2) {
            return;
        }
        a2.I = b2;
        a2.J();
    }

    public List<IC> J() {
        VC_2 a2;
        return Collections.unmodifiableList(a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public VC_2(IC iC, IC iC2) {
        void b2;
        VC_2 c2 = iC2;
        VC_2 a2 = this;
        VC_2 vC_2 = a2;
        a2.A = new ArrayList<IC>();
        vC_2.I = uSa.E;
        a2.j = b2;
        a2.J = c2;
        a2.J(kTa.g);
    }

    public IC C() {
        VC_2 a2;
        return a2.j.J();
    }

    /*
     * WARNING - void declaration
     */
    public VC_2(String string, int n2) {
        void b2;
        VC_2 a2;
        int c2 = n2;
        VC_2 vC_2 = a2 = this;
        vC_2((String)b2);
        vC_2.J(c2);
    }

    public VC_2() {
        VC_2 a2;
        VC_2 vC_2 = a2;
        VC_2 vC_22 = a2;
        vC_2.A = new ArrayList<IC>();
        vC_22.I = uSa.E;
        vC_2.j = new IC(aSa.V, aSa.V);
        vC_2.J = new IC(oua.i, oua.i);
        vC_2.J(kTa.g);
    }

    public VC J() {
        VC_2 a2;
        return new VC_2((VC)a2);
    }

    public IC l() {
        VC_2 a2;
        return a2.J.J();
    }

    public double J(double d2) {
        double a2;
        VC_2 vC_2 = this;
        if (vC_2.j == null || vC_2.J == null) {
            return aSa.V;
        }
        IC iC = vC_2.J(a2);
        VC_2 b2 = iC.getKey();
        if (((Object)((Object)b2)).equals(iC = iC.getValue())) {
            return oua.i - ((IC)b2).A;
        }
        a2 = (iC.A - ((IC)b2).A) / (iC.I - ((IC)b2).I) * (a2 - ((IC)b2).I) + ((IC)b2).A;
        return oua.i - a2;
    }

    private IC J(double a2) {
        VC_2 b2;
        if (b2.j == null || b2.J == null) {
            throw new NullPointerException(Ora.Q);
        }
        double d2 = oua.i - a2;
        return new IC(((IC)b2.A).I * Math.pow(d2, uRa.I) + uRa.I * b2.j.I * a2 * Math.pow(d2, KPa.y) + uRa.I * b2.J.I * Math.pow(a2, KPa.y) * d2 + b2.I.I * Math.pow(a2, uRa.I), ((IC)b2.A).A * Math.pow(d2, uRa.I) + uRa.I * b2.j.A * a2 * Math.pow(d2, KPa.y) + uRa.I * b2.J.A * Math.pow(a2, KPa.y) * d2 + b2.I.A * Math.pow(a2, uRa.I));
    }

    public VC_2(VC vC2) {
        VC_2 b2 = vC2;
        VC_2 a2 = this;
        VC_2 vC_2 = a2;
        a2.A = new ArrayList<IC>();
        vC_2.I = uSa.E;
        a2.j = b2.C();
        a2.J = b2.l();
        a2.J(kTa.g);
    }

    public VC_2(int n2) {
        VC_2 a2;
        int b2 = n2;
        VC_2 vC_2 = a2 = this;
        vC_2();
        vC_2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public VC_2(VC vC2, int n2) {
        void b2;
        VC_2 a2;
        int c2 = n2;
        VC_2 vC_2 = a2 = this;
        vC_2((VC)b2);
        vC_2.J(c2);
    }
}

