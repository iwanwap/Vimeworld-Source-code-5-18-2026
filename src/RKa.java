/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cz
 *  Dha
 *  Eka
 *  Gg
 *  HLa
 *  Kna
 *  LKa
 *  MZ
 *  Ola
 *  Paa
 *  QSa
 *  RIa
 *  WQa
 *  aJa
 *  aZ
 *  aaa
 *  bka
 *  fy
 *  hLa
 *  nZ
 *  nka
 *  pqa
 *  pua
 *  rLa
 *  tZ
 *  uKa
 *  uY
 *  vL
 *  zja
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

public final class RKa {
    public static double f;
    public float F;
    private Map<Class<? extends uY>, Ola<? extends uY>> g;
    public Gg L;
    public static RKa E;
    public aJa m;
    public static double C;
    public float i;
    public double M;
    public static double k;
    public double j;
    public vL J;
    private Kna A;
    public double I;

    public Kna J() {
        RKa a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uY uY2, double d2, double d3, double d4, float f2, int n2) {
        void f3;
        float f4 = f2;
        RKa b2 = this;
        Ola ola = b2.J((uY)f3);
        if (ola != null) {
            try {
                void a2;
                void g2;
                void c2;
                void d5;
                void e2;
                ola.J((uY)f3, (double)e2, (double)d5, (double)c2, (float)g2, (int)a2);
                return;
            }
            catch (Throwable g2) {
                RIa g2 = RIa.J((Throwable)g2, (String)QSa.Y);
                Dha a2 = g2.J(WQa.Aa);
                f3.J(a2);
                throw new MZ(g2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, aJa aJa2, Kna kna2, vL vL2, float f2) {
        void a2;
        void c2;
        void d2;
        RKa f3;
        void e2;
        RKa rKa = rKa2;
        RKa rKa2 = vL2;
        RKa b2 = rKa;
        if (b2.L != e2) {
            b2.J((Gg)e2);
        }
        RKa rKa3 = b2;
        RKa rKa4 = f3;
        RKa rKa5 = b2;
        RKa rKa6 = b2;
        b2.m = d2;
        rKa6.J = f3;
        rKa6.A = c2;
        RKa rKa7 = f3;
        rKa6.i = ((vL)f3).s + (((vL)rKa7).X - ((vL)f3).s) * a2;
        RKa rKa8 = f3;
        rKa5.F = ((vL)rKa7).o + (((vL)rKa8).d - ((vL)rKa8).o) * a2;
        rKa5.I = ((vL)f3).V + (((vL)f3).la - ((vL)f3).V) * (double)a2;
        rKa3.j = ((vL)rKa4).Ga + (((vL)f3).Z - ((vL)f3).Ga) * (double)a2;
        rKa3.M = ((vL)rKa4).Ca + (((vL)f3).A - ((vL)f3).Ca) * (double)a2;
    }

    private RKa() {
        RKa rKa;
        RKa rKa2 = rKa = this;
        rKa2.g = Maps.newHashMap();
        rKa2.g.put(aaa.class, (Ola<? extends uY>)new bka());
        rKa.g.put(Caa.class, (Ola<? extends uY>)new Eka());
        rKa.g.put(nZ.class, (Ola<? extends uY>)new rLa());
        rKa.g.put(Fz.class, (Ola<? extends uY>)new hLa());
        rKa.g.put(Paa.class, new qJa());
        rKa.g.put(aZ.class, new Pka());
        rKa.g.put(jY.class, (Ola<? extends uY>)new HLa());
        rKa.g.put(Cz.class, (Ola<? extends uY>)new LKa());
        rKa.g.put(fy.class, new Mka());
        rKa.g.put(tZ.class, (Ola<? extends uY>)new zja());
        Iterator<Ola<? extends uY>> a2 = rKa.g.values().iterator();
        Iterator<Ola<? extends uY>> iterator = a2;
        while (iterator.hasNext()) {
            ((Ola)a2.next()).J(rKa);
            iterator = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(uY uY2, double d2, double d3, double d4, float f2) {
        void f3;
        void b2;
        void c2;
        void d5;
        void e2;
        float f4 = f2;
        RKa a2 = this;
        a2.J((uY)e2, (double)d5, (double)c2, (double)b2, (float)f3, pua.o);
    }

    public void J(Gg gg2) {
        RKa b2 = gg2;
        RKa a2 = this;
        a2.L = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uY uY2, float f2, int n2) {
        Object d2 = uY2;
        RKa c2 = this;
        if (d2.J(c2.I, c2.j, c2.M) < d2.C()) {
            void a2;
            void b2;
            RKa rKa = c2;
            int n3 = rKa.L.J(d2.J(), uSa.E);
            int n4 = n3 % opa.w;
            nka.J((int)nka.P, (float)((float)n4 / pqa.r), (float)((float)(n3 /= opa.w) / pqa.r));
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            d2 = d2.J();
            rKa.J((uY)d2, (double)d2.getX() - k, (double)d2.getY() - C, (double)d2.getZ() - f, (float)b2, (int)a2);
        }
    }

    static {
        E = new RKa();
    }

    public <T extends uY> Ola<T> J(uY uY2) {
        RKa b2 = uY2;
        RKa a2 = this;
        if (b2 == null) {
            return null;
        }
        return a2.J(b2.getClass());
    }

    /*
     * WARNING - void declaration
     */
    public <T extends uY> Ola<T> J(Class<? extends uY> clazz) {
        void a2;
        Ola<? extends uY> ola = this;
        Object b2 = ola.g.get(a2);
        if (b2 == null && a2 != uY.class) {
            Ola<? extends uY> ola2 = ola;
            b2 = ola2.J(a2.getSuperclass());
            ola2.g.put((Class<? extends uY>)a2, (Ola<? extends uY>)b2);
        }
        return b2;
    }
}

