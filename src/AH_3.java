/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EK
 *  ERa
 *  MH
 *  Pn
 *  Tg
 *  Vg
 *  aKa
 *  bj
 *  dN
 *  mka
 *  nO
 *  pKa
 *  pPa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  xy
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class AH_3
extends Tg {
    private boolean M;
    public List<Vg> j;
    public kL J;
    public TreeMap<Integer, EK> A;
    public MH I;

    private void M() {
        Iterator<Vg> iterator;
        AH_3 aH_3 = this;
        float f2 = pPa.T;
        float f3 = Zqa.Q;
        float f4 = pPa.T;
        float f5 = Zqa.Q;
        float f6 = pPa.T;
        float f7 = Zqa.Q;
        Iterator<Vg> iterator2 = iterator = aH_3.j.iterator();
        while (iterator2.hasNext()) {
            AH_3 a2 = iterator.next();
            f2 = Math.min(f2, ((Vg)a2).I.f());
            f3 = Math.max(f3, ((Vg)a2).I.f());
            f4 = Math.min(f4, ((Vg)a2).J.f());
            f5 = Math.max(f5, ((Vg)a2).J.f());
            f6 = Math.min(f6, ((Vg)a2).A.f());
            f7 = Math.max(f7, ((Vg)a2).A.f());
            iterator2 = iterator;
        }
        aH_3.e = new xy((double)f2, (double)f4, (double)f6, (double)f3, (double)f5, (double)f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(RN rN2) {
        Xn xn2;
        Object a2;
        AH_3 aH_3 = this;
        void v0 = a2;
        super.J((RN)v0);
        if (!v0.hasELine()) {
            return;
        }
        if (((Xn)(a2 = ((RN)a2).getELine())).hasWidth()) {
            Xn xn3 = a2;
            xn2 = xn3;
            aH_3.J.J(xn3.getWidth());
        } else {
            if (((Xn)a2).hasWidthAnim()) {
                AH_3 aH_32 = aH_3;
                aH_3.J.J(((Xn)a2).getWidthAnim(), aH_32.i, aH_32.L);
            }
            xn2 = a2;
        }
        a2 = xn2.getActionsList().iterator();
        while (true) {
            if (!a2.hasNext()) {
                aH_3.M();
                return;
            }
            Pn b2 = (Pn)a2.next();
            switch (bj.A[b2.getKind().ordinal()]) {
                case 1: {
                    Vg vg2 = new Vg(b2.getPos(uSa.E), b2.getPos(vRa.d), b2.getPos(uqa.g));
                    AH_3 aH_33 = aH_3;
                    if (b2.hasIndex()) {
                        aH_33.j.add(b2.getIndex(), vg2);
                        break;
                    }
                    aH_33.j.add(vg2);
                    break;
                }
                case 2: {
                    Vg vg2 = aH_3.j.get(b2.getIndex());
                    vg2.I.J(b2.getPos(uSa.E));
                    vg2.J.J(b2.getPos(vRa.d));
                    vg2.A.J(b2.getPos(uqa.g));
                    break;
                }
                case 3: {
                    Vg vg2 = aH_3.j.get(b2.getIndex());
                    AH_3 aH_34 = aH_3;
                    vg2.I.J(b2.getPos(uSa.E), aH_34.i, aH_34.L);
                    AH_3 aH_35 = aH_3;
                    vg2.J.J(b2.getPos(vRa.d), aH_35.i, aH_35.L);
                    AH_3 aH_36 = aH_3;
                    vg2.A.J(b2.getPos(uqa.g), aH_36.i, aH_36.L);
                    break;
                }
                case 4: {
                    aH_3.j.remove(b2.getIndex());
                    break;
                }
                case 5: {
                    aH_3.J(b2.getIndex()).J(b2.getColor());
                    break;
                }
                case 6: {
                    AH_3 aH_37 = aH_3;
                    aH_3.J(b2.getIndex()).J(b2.getColor(), aH_37.i, aH_37.L);
                    break;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        Object b2;
        void a2;
        AH_3 aH_3 = this;
        int n2 = aH_3.M - a2;
        int n3 = (int)(a2 - aH_3.f);
        if (n3 < 0) {
            return;
        }
        float f2 = pqa.r;
        if (n3 < aH_3.l) {
            f2 = (float)n3 / (float)aH_3.l;
        }
        if (n2 < aH_3.G) {
            f2 = (float)n2 / (float)aH_3.G;
        }
        uKa.z();
        uKa.J(vRa.d != 0);
        AH_3 aH_32 = aH_3;
        uKa.C((float)aH_32.J.f());
        aH_32.C();
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        if (aH_32.A.size() == vRa.d) {
            Iterator<Vg> iterator;
            int n4 = aH_3.A.firstEntry().getValue().J();
            if (f2 != pqa.r) {
                int n5 = n4;
                n4 = AH_3.l((int)n5, (int)((int)((float)AH_3.J((int)n5) * f2)));
            }
            AH_3.J((int)n4);
            AH_3 aH_33 = aH_3;
            aKa2.J(aH_33.I.glDrawMode, mka.M);
            Iterator<Vg> iterator2 = iterator = aH_33.j.iterator();
            while (iterator2.hasNext()) {
                b2 = iterator.next();
                iterator2 = iterator;
                aKa2.J((double)((Vg)b2).I.f() - RKa.k, (double)((Vg)b2).J.f() - RKa.C, (double)((Vg)b2).A.f() - RKa.f).M();
            }
        } else {
            Object object;
            aKa2.J(aH_3.I.glDrawMode, mka.I);
            Iterator<Map.Entry<Integer, EK>> iterator = aH_3.A.entrySet().iterator();
            b2 = object = iterator.next();
            object.getValue().J();
            int n6 = uSa.E;
            Iterator<Vg> iterator3 = aH_3.j.iterator();
            Iterator<Vg> iterator4 = iterator3;
            while (iterator4.hasNext()) {
                float f3;
                int n7;
                Vg vg2 = iterator3.next();
                if ((Integer)b2.getKey() < n6) {
                    object = b2;
                    if (iterator.hasNext()) {
                        b2 = iterator.next();
                        b2.getValue().J();
                    }
                }
                if (n6 <= (Integer)object.getKey()) {
                    n7 = ((EK)object.getValue()).J;
                    f3 = f2;
                } else if (n6 < (Integer)b2.getKey()) {
                    n7 = EK.J((float)((float)(n6 - (Integer)object.getKey()) / (float)((Integer)b2.getKey() - (Integer)object.getKey())), (int)((EK)b2.getValue()).J, (int)((EK)object.getValue()).J);
                    f3 = f2;
                } else {
                    n7 = ((EK)b2.getValue()).J;
                    f3 = f2;
                }
                if (f3 != pqa.r) {
                    int n8 = n7;
                    n7 = AH_3.l((int)n8, (int)((int)((float)AH_3.J((int)n8) * f2)));
                }
                ++n6;
                aKa2.J((double)vg2.I.f() - RKa.k, (double)vg2.J.f() - RKa.C, (double)vg2.A.f() - RKa.f).J(n7 >> ERa.C & osa.Ja, n7 >> Yqa.i & osa.Ja, n7 & osa.Ja, n7 >> osa.c & osa.Ja).M();
                iterator4 = iterator3;
            }
        }
        pKa2.J();
        uKa.C((float)pqa.r);
        uKa.H();
        AH_3 aH_34 = aH_3;
        aH_34.d();
        aH_34.l((long)a2);
    }

    /*
     * WARNING - void declaration
     */
    private EK J(int n2) {
        void a2;
        AH_3 aH_3 = this;
        EK eK2 = aH_3.A.get((int)a2);
        if (eK2 == null) {
            AH_3 aH_32 = aH_3;
            Map.Entry<Integer, EK> entry = aH_32.A.ceilingEntry((int)a2);
            Map.Entry<Integer, EK> b2 = aH_32.A.floorEntry((int)a2);
            int n3 = entry == null ? ((EK)b2.getValue()).J() : (b2 == null ? entry.getValue().J() : EK.J((float)((float)(a2 - (Integer)b2.getKey()) / (float)(entry.getKey() - (Integer)b2.getKey())), (int)entry.getValue().J, (int)((EK)b2.getValue()).J));
            eK2 = new EK(n3);
            aH_3.A.put((int)a2, eK2);
        }
        return eK2;
    }

    public void l(long a22) {
        int n2;
        AH_3 b2;
        int a22;
        block2: {
            a22 = uSa.E;
            Iterator<Vg> iterator = b2.j.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().J() == nqa.i) continue;
                n2 = a22 = vRa.d;
                break block2;
            }
            n2 = a22;
        }
        if (n2 != 0 || b2.M) {
            b2.M = a22;
            b2.M();
        }
    }

    public AH_3(dN dN2) {
        int n2;
        AH_3 a2;
        AH_3 b2 = dN2;
        AH_3 aH_3 = a2 = this;
        super((dN)b2);
        AH_3 aH_32 = a2;
        a2.A = new TreeMap();
        aH_32.J = kL.f();
        aH_3.I = MH.LINE_STRIP;
        aH_3.M = uSa.E;
        b2 = b2.getELine();
        int n3 = b2.getPointsCount() / yRa.d;
        aH_3.j = new ArrayList<Vg>(n3);
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            float f2 = b2.getPoints(n2);
            float f3 = b2.getPoints(n2 + vRa.d);
            int n5 = n2 + uqa.g;
            a2.j.add(new Vg(f2, f3, b2.getPoints(n5)));
            n4 = n2 += 3;
        }
        if (b2.getColorsCount() > 0) {
            int n6 = n2 = uSa.E;
            while (n6 < b2.getColorsCount()) {
                a2.A.put(b2.getColorPositions(n2), new EK(b2.getColors(n2++)));
                n6 = n2;
            }
        } else {
            a2.A.put(uSa.E, new EK(pua.o));
        }
        if (b2.hasWidth()) {
            a2.J.J(b2.getWidth());
        }
        if (b2.hasDrawMode()) {
            a2.I = MH.fromProto((nO)b2.getDrawMode());
        }
        a2.M();
    }
}

