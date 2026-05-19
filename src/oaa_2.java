/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Baa
 *  Dha
 *  Faa
 *  Gg
 *  ISa
 *  MZ
 *  RIa
 *  Saa
 *  Spa
 *  Tf
 *  Uta
 *  XTa
 *  YLa
 *  gc
 *  hd
 *  oZ
 *  vQa
 *  vRa
 *  yQa
 *  yc
 *  zsa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oaa_2
implements hd {
    public boolean m;
    private List<Faa> C;
    private YLa i;
    private Faa M;
    private Set<Long> k;
    private hd j;
    private Tf J;
    private static final Logger A = LogManager.getLogger();
    private yc I;

    /*
     * WARNING - void declaration
     */
    public Faa l(int n2, int n3) {
        void a2;
        void b2;
        oaa_2 oaa_22 = this;
        long l2 = Baa.J((int)b2, (int)a2);
        oaa_2 oaa_23 = oaa_22;
        oaa_23.k.remove(l2);
        oaa_2 c2 = (Faa)oaa_23.i.J(l2);
        if (c2 == null) {
            oaa_2 oaa_24;
            c2 = oaa_22.f((int)b2, (int)a2);
            if (c2 == null) {
                if (oaa_22.j == null) {
                    oaa_2 oaa_25 = oaa_22;
                    oaa_24 = oaa_25;
                    c2 = oaa_25.M;
                } else {
                    try {
                        c2 = oaa_22.j.J((int)b2, (int)a2);
                        oaa_24 = oaa_22;
                    }
                    catch (Throwable throwable) {
                        RIa rIa2 = RIa.J((Throwable)throwable, (String)rpa.h);
                        Dha dha = rIa2.J(Uta.a);
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = (int)b2;
                        objectArray[vRa.d] = (int)a2;
                        dha.J(Bua.F, (Object)String.format(oQa.ca, objectArray));
                        Dha dha2 = dha;
                        dha2.J(zsa.X, (Object)l2);
                        dha2.J(vQa.y, (Object)oaa_22.j.J());
                        throw new MZ(rIa2);
                    }
                }
            } else {
                oaa_24 = oaa_22;
            }
            oaa_24.i.J(l2, (Object)c2);
            oaa_22.C.add((Faa)c2);
            oaa_2 oaa_26 = oaa_22;
            oaa_2 oaa_27 = c2;
            oaa_27.C();
            oaa_27.J(oaa_26, oaa_26, (int)b2, (int)a2);
        }
        return c2;
    }

    public String J() {
        oaa_2 a2;
        return new StringBuilder().insert(5 >> 3, Spa.N).append(a2.i.J()).append(APa.V).append(a2.k.size()).toString();
    }

    public List<Faa> J() {
        oaa_2 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(boolean bl, gc gc2) {
        int n2;
        oaa_2 oaa_22 = this;
        int a2 = uSa.E;
        ArrayList<Faa> arrayList = Lists.newArrayList(oaa_22.C);
        int n3 = n2 = uSa.E;
        while (n3 < arrayList.size()) {
            void b2;
            oaa_2 c2 = (Faa)arrayList.get(n2);
            if (b2 != false) {
                oaa_22.f((Faa)c2);
            }
            if (c2.J((boolean)b2)) {
                oaa_2 oaa_23 = c2;
                oaa_22.J((Faa)oaa_23);
                oaa_23.d(uSa.E != 0);
                if (++a2 == osa.c && b2 == false) {
                    return uSa.E != 0;
                }
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        oaa_2 a2 = this;
        return a2.i.J(Baa.J((int)b2, (int)c2));
    }

    /*
     * WARNING - void declaration
     */
    private Faa f(int n2, int n3) {
        oaa_2 oaa_22 = this;
        if (oaa_22.I == null) {
            return null;
        }
        try {
            void a2;
            void b2;
            oaa_2 oaa_23 = oaa_22;
            oaa_2 c2 = oaa_23.I.J((Gg)oaa_23.J, (int)b2, (int)a2);
            if (c2 != null) {
                oaa_2 oaa_24 = oaa_22;
                c2.J(oaa_24.J.l());
                if (oaa_24.j != null) {
                    oaa_22.j.J((Faa)c2, (int)b2, (int)a2);
                }
            }
            return c2;
        }
        catch (Exception c2) {
            A.error(KQa.N, (Throwable)c2);
            return null;
        }
    }

    public void J() {
        oaa_2 a2;
        if (a2.I != null) {
            a2.I.f();
        }
    }

    public void f() {
        Object a2;
        oaa_2 oaa_22 = this;
        Object object = a2 = oaa_22.C.iterator();
        while (object.hasNext()) {
            Faa faa2 = (Faa)a2.next();
            object = a2;
            Faa faa3 = faa2;
            oaa_22.J(faa3.I, faa3.G);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(hd hd2, int n2, int n3) {
        void a2;
        void b2;
        oaa_2 oaa_22 = this;
        oaa_2 d2 = oaa_22.J((int)b2, (int)a2);
        if (!d2.J()) {
            d2.e();
            if (oaa_22.j != null) {
                void c2;
                oaa_22.j.J((hd)c2, (int)b2, (int)a2);
                d2.l();
            }
        }
    }

    public Faa J(XF xF) {
        Object b2 = xF;
        oaa_2 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public boolean J() {
        oaa_2 oaa_22 = this;
        if (!oaa_22.J.i) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < ySa.T) {
                if (!oaa_22.k.isEmpty()) {
                    Long l2 = oaa_22.k.iterator().next();
                    oaa_2 a2 = (Faa)oaa_22.i.J(l2.longValue());
                    if (a2 != null) {
                        a2.M();
                        oaa_2 oaa_23 = oaa_22;
                        oaa_23.J((Faa)a2);
                        oaa_23.f((Faa)a2);
                        oaa_23.i.f(l2.longValue());
                        oaa_22.C.remove(a2);
                    }
                    oaa_22.k.remove(l2);
                }
                n3 = ++n2;
            }
            if (oaa_22.I != null) {
                oaa_22.I.J();
            }
        }
        return oaa_22.j.J();
    }

    /*
     * WARNING - void declaration
     */
    public XF J(Gg gg2, String string, XF xF) {
        void b2;
        void c2;
        Object d2 = xF;
        oaa_2 a2 = this;
        return a2.j.J((Gg)c2, (String)b2, (XF)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        oaa_2 a2 = this;
        if (a2.j != null && a2.j.J((hd)d2, (Faa)c2, (int)b2, (int)e2)) {
            a2.J((int)b2, (int)e2).l();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Faa faa2, int n2, int n3) {
        int d2 = n3;
        oaa_2 oaa_22 = this;
    }

    private void f(Faa faa2) {
        oaa_2 b22 = faa2;
        oaa_2 a2 = this;
        if (a2.I != null) {
            try {
                oaa_2 oaa_22 = a2;
                oaa_22.I.J((Gg)oaa_22.J, (Faa)b22);
                return;
            }
            catch (Exception b22) {
                A.error(XTa.l, (Throwable)b22);
            }
        }
    }

    private void J(Faa faa2) {
        oaa_2 b22 = faa2;
        oaa_2 a2 = this;
        if (a2.I != null) {
            try {
                b22.J(a2.J.l());
                oaa_2 oaa_22 = a2;
                oaa_22.I.f((Gg)oaa_22.J, (Faa)b22);
                return;
            }
            catch (IOException b22) {
                A.error(ISa.e, (Throwable)b22);
                return;
            }
            catch (oZ b22) {
                A.error(yQa.I, (Throwable)b22);
            }
        }
    }

    public int J() {
        oaa_2 a2;
        return a2.i.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        oaa_2 a2 = this;
        if (a2.J.F.l()) {
            if (!a2.J.J((int)b2, c2)) {
                a2.k.add(Baa.J((int)b2, (int)c2));
                return;
            }
        } else {
            a2.k.add(Baa.J((int)b2, (int)c2));
        }
    }

    public boolean f() {
        oaa_2 a2;
        if (!a2.J.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public oaa_2(Tf tf, yc yc2, hd hd2) {
        void a2;
        void b2;
        oaa_2 c2;
        oaa_2 d2 = tf;
        oaa_2 oaa_22 = c2 = this;
        oaa_2 oaa_23 = c2;
        oaa_2 oaa_24 = c2;
        c2.k = Collections.newSetFromMap(new ConcurrentHashMap());
        oaa_24.m = vRa.d;
        c2.i = new YLa();
        oaa_23.C = Lists.newArrayList();
        oaa_23.M = new Saa((Gg)d2, uSa.E, uSa.E);
        oaa_23.J = d2;
        oaa_22.I = b2;
        oaa_22.j = a2;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        void a2;
        void b2;
        oaa_2 oaa_22 = this;
        oaa_2 c2 = (Faa)oaa_22.i.J(Baa.J((int)b2, (int)a2));
        if (c2 == null) {
            if (!oaa_22.J.C() && !oaa_22.m) {
                return oaa_22.M;
            }
            return oaa_22.l((int)b2, (int)a2);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public List<AZ> J(VIa vIa, XF xF) {
        void b2;
        Object c2 = xF;
        oaa_2 a2 = this;
        return a2.j.J((VIa)b2, (XF)((Object)c2));
    }
}

