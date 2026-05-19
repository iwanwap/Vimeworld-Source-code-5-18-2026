/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  JTa
 *  KF
 *  Kpa
 *  NOa
 *  aF
 *  aQa
 *  aSa
 *  aqa
 *  bc
 *  bqa
 *  hf
 *  ke
 *  pua
 *  qf
 *  sB
 *  vQa
 *  vRa
 *  wI
 *  wOa
 *  wca
 *  ysa
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qf_3 {
    public static final int i = 2;
    private final vC M;
    private final vC k;
    private final Queue<KF> j;
    private static final qf J = new qf_3();
    private final Map<KF, vC> A;
    private final Queue<KF> I;

    public boolean f() {
        qf_3 qf_32 = this;
        Iterator a2 = qf_32.j.iterator();
        while (a2.hasNext()) {
            if (!((KF)a2.next()).f()) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        qf_3 c2;
        qf_3 qf_32;
        qf_3 qf_33 = this;
        double d2 = WF.J();
        double d3 = vQa.c;
        if (d2 > aSa.V) {
            if (OT.i.B.hidePartyMenu) {
                qf_3 qf_34 = qf_33;
                qf_32 = qf_34;
                qf_34.k.f(ITa.a, iSa.P, sB.N);
                qf_34.M.f(aSa.V, iSa.P, sB.N);
            } else if (!WF.f() && WF.J().J() == bc.PARTY) {
                qf_3 qf_35 = qf_33;
                qf_32 = qf_35;
                qf_35.k.f(WF.J().J() + vQa.c, iSa.P, sB.N);
                qf_35.M.f(aSa.V, iSa.P, sB.N);
            } else {
                qf_3 qf_36 = qf_33;
                qf_32 = qf_36;
                qf_36.M.f(Jsa.d, iSa.P, sB.N);
            }
        } else {
            qf_3 qf_37 = qf_33;
            qf_37.M.f(aSa.V, iSa.P, sB.N);
            qf_37.k.f(WF.f() ? vQa.c : aSa.V, iSa.P, sB.N);
            qf_32 = qf_33;
        }
        qf_32.k.J();
        qf_33.M.J();
        d3 += qf_33.k.l();
        long l2 = OT.e;
        Iterator iterator = qf_33.j.iterator();
        int n4 = uSa.E;
        int n5 = uSa.E;
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            int n6;
            void a2;
            void b2;
            c2 = (KF)iterator.next();
            vC vC2 = qf_33.A.get(c2);
            if (vC2 == null) {
                iterator2 = iterator;
                continue;
            }
            vC2.J();
            double d4 = vC2.l();
            double d5 = dsa.Ja * (oua.i - (double)c2.f().J()) + qf_33.M.l();
            if (d4 != (double)n4 && vC2.d() != (double)n4) {
                vC2.f(n4, aQa.r, sB.v);
            }
            int n7 = (int)(d5 + Wqa.m + qf_33.M.l());
            int n8 = (int)(d3 + d4);
            qf_3 qf_38 = c2;
            c2.C(n7);
            qf_38.l(n8);
            qf_38.J((int)b2, (int)a2);
            if (l2 >= c2.f() || c2.J() && c2.f().J() <= JPa.N) {
                iterator.remove();
                qf_33.A.remove(c2);
                n5 = vRa.d;
                n6 = n4;
            } else {
                if (l2 >= c2.f() - WOa.D || c2.J()) {
                    c2.f().f(aSa.V, aQa.r, sB.b);
                }
                n6 = n4;
            }
            n4 = n6 + (int)(c2.J() + Wqa.m + (double)(c2.e() ? wOa.t : uSa.E));
            iterator2 = iterator;
        }
        if (n5 != 0 && !qf_33.I.isEmpty()) {
            c2 = qf_33.I.poll();
            c2.J(l2);
            qf_33.j.offer((KF)c2);
            c2.f().f(oua.i, aQa.r, sB.v);
            qf_33.A.put((KF)c2, new vC((qf_33.j.size() - vRa.d) * bqa.Ga));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(Cda cda2) {
        int n2;
        Object b2 = cda2;
        qf_3 a2 = this;
        b2 = new wI(((Cda)b2).J());
        ArrayList<hf> arrayList = new ArrayList<hf>();
        KF kF2 = b2.getMapArray(JTa.Z);
        int n3 = ((wI[])kF2).length;
        int n4 = n2 = uSa.E;
        while (true) {
            ArrayList<hf> arrayList2;
            int n5;
            Consumer consumer;
            wI wI2;
            block10: {
                if (n4 >= n3) {
                    kF2 = new KF(oE.valueOf(b2.getString(NOa.m)), b2.getString(xra.d), b2.getString(BQa.c), arrayList, b2.getLong(ysa.M), b2.getBoolean(ISa.o));
                    a2.J(kF2);
                    return;
                }
                wI2 = kF2[n2];
                consumer = null;
                String string = wI2.getString(ysa.M);
                int n6 = pua.o;
                switch (string.hashCode()) {
                    case 98618: {
                        if (!string.equals(aqa.A)) break;
                        n5 = n6 = uSa.E;
                        break block10;
                    }
                    case 94756344: {
                        if (!string.equals(BPa.C)) break;
                        n6 = vRa.d;
                    }
                }
                n5 = n6;
            }
            switch (n5) {
                case 0: {
                    consumer = aF.J((String)wI2.getString(kra.k));
                    arrayList2 = arrayList;
                    break;
                }
                case 1: {
                    consumer = ke.J();
                }
                default: {
                    arrayList2 = arrayList;
                }
            }
            arrayList2.add(new hf(wI2.getString(xra.d), Fg.valueOf(wI2.getString(eua.ca)), consumer));
            n4 = ++n2;
        }
    }

    public static qf J() {
        return J;
    }

    public boolean J() {
        qf_3 a2;
        if (!a2.j.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, boolean bl2) {
        qf_3 qf_32 = this;
        for (KF e2 : qf_32.j) {
            void a2;
            void b2;
            void c2;
            void d2;
            if (!e2.f()) continue;
            KF kF2 = e2;
            kF2.J((int)((double)d2 - kF2.f()), (int)((double)c2 - e2.C()), (int)b2, (boolean)a2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(String string, KF kF2) {
        String b2 = kF2;
        String a2 = string;
        Kpa.J().J().J((KC)new wca(a2));
        b2.J();
    }

    private qf_3() {
        qf_3 a2;
        qf_3 qf_32 = a2;
        a2.j = new ArrayDeque<KF>();
        qf_32.I = new ArrayDeque<KF>();
        a2.A = new LinkedHashMap<KF, vC>();
        a2.k = new vC();
        a2.M = new vC();
    }

    public void J(KF kF2) {
        qf_3 b2 = kF2;
        qf_3 a2 = this;
        if (a2.j.size() < uqa.g) {
            a2.j.offer((KF)b2);
            a2.A.put((KF)b2, new vC((a2.j.size() - vRa.d) * bqa.Ga));
            b2.f().f(oua.i, aQa.r, sB.v);
            return;
        }
        a2.I.offer((KF)b2);
    }
}

