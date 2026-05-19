/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Ey
 *  Ez
 *  Gg
 *  HA
 *  HY
 *  JCa
 *  Mda
 *  NCa
 *  PTa
 *  Tz
 *  Vua
 *  Waa
 *  bFa
 *  bqa
 *  cra
 *  eAa
 *  ld
 *  ny
 *  pY
 *  tba
 *  tca
 *  vL
 *  vRa
 *  waa
 */
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class JDa
extends eAa {
    public JDa() {
        JDa a2;
        JDa jDa = a2;
        jDa.J(vRa.d);
    }

    public String l(Mda mda2) {
        String string;
        JDa b2 = mda2;
        JDa a2 = this;
        if (b2.M() && !Ez.J((String)(string = b2.J().J(xqa.U)))) {
            return string;
        }
        return super.l((Mda)b2);
    }

    public boolean l(Mda mda2) {
        JDa b2 = mda2;
        JDa a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void a2;
        void b2;
        JDa d2 = mda2;
        JDa c2 = this;
        if (!b2.e) {
            c2.J((Mda)d2, (Sx)a2);
        }
        void v0 = a2;
        v0.J((Mda)d2);
        v0.J(Tz.H[eAa.J((eAa)c2)]);
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl) {
        JDa e2 = mda2;
        JDa d2 = this;
        if (e2.M()) {
            void b2;
            String c2 = (e2 = e2.J()).J(osa.i);
            if (!Ez.J((String)c2)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2;
                b2.add(pY.GRAY + Ey.J((String)cra.p, (Object[])objectArray));
            }
            b2.add(pY.GRAY + Ey.f((String)new StringBuilder().insert(3 & 4, Vua.x).append(e2.J(bqa.b)).toString()));
        }
    }

    public static int f(Mda a2) {
        return a2.J().J(bqa.b);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Mda mda2, Sx sx2) {
        Waa waa2;
        void b2;
        JDa jDa = this;
        if (b2 != null && b2.J() != null && !(waa2 = b2.J()).f(PTa.j)) {
            Waa waa3 = waa2;
            waa3.J(PTa.j, vRa.d != 0);
            if (JDa.f(waa3)) {
                void a2;
                int c22;
                waa waa4 = waa2.J(sra.A, Yqa.i);
                int n2 = c22 = uSa.E;
                while (n2 < waa4.J()) {
                    waa waa5;
                    ld ld2;
                    String string = waa4.J(c22);
                    try {
                        ld2 = HY.J((String)string);
                        void v2 = a2;
                        ld2 = ny.J((u)v2, (ld)ld2, (vL)v2);
                        waa5 = waa4;
                    }
                    catch (Exception exception) {
                        ld2 = new CY(string);
                        waa5 = waa4;
                    }
                    int n3 = c22;
                    int n4 = c22++;
                    waa5.J(n3, (NCa)new tca(HY.J((ld)ld2)));
                    n2 = c22;
                }
                waa2.J(sra.A, (NCa)waa4);
                if (a2 instanceof bFa && a2.f() == b2) {
                    void v7 = a2;
                    void v8 = a2;
                    sEa c22 = v7.G.J((HA)v7.K, v8.K.J);
                    ((bFa)v8).I.J((KC)new tba(uSa.E, c22.I, (Mda)b2));
                }
            }
        }
    }

    public static boolean f(Waa waa2) {
        Waa waa3 = waa2;
        if (!JCa.f((Waa)waa3)) {
            return uSa.E != 0;
        }
        if (!waa3.J(xqa.U, Yqa.i)) {
            return uSa.E != 0;
        }
        String a2 = waa3.J(xqa.U);
        if (a2 != null && a2.length() <= fPa.i) {
            return waa3.J(osa.i, Yqa.i);
        }
        return uSa.E != 0;
    }
}

