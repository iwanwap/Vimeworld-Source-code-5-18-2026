/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Mda
 *  Waa
 *  YDa
 *  vL
 */
import com.google.common.collect.Lists;

public final class WFa_1
extends YDa {
    public JEa I;

    /*
     * WARNING - void declaration
     */
    public WFa_1(Gg gg2, XF xF2, DZ dZ2) {
        void a2;
        int n2;
        JEa[] b2;
        Object d2 = gg2;
        WFa_1 c2 = this;
        super((Gg)d2, (XF)b2);
        d2 = Lists.newArrayList();
        b2 = JEa.values();
        int n3 = b2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            JEa jEa2 = b2[n2];
            WFa_1 wFa_1 = c2;
            wFa_1.I = jEa2;
            wFa_1.J((DZ)a2);
            if (wFa_1.l()) {
                d2.add(jEa2);
            }
            n4 = ++n2;
        }
        if (!d2.isEmpty()) {
            c2.I = (JEa)((Object)d2.get(c2.R.nextInt(d2.size())));
        }
        c2.J((DZ)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void e2;
        void f4;
        void g2;
        WFa_1 d5;
        float f5 = f2;
        WFa_1 wFa_1 = d5 = this;
        XF h2 = wFa_1.J.add((double)(g2 - d5.la), (double)(f4 - d5.Z), (double)(e2 - d5.A));
        wFa_1.l(h2.getX(), h2.getY(), h2.getZ());
    }

    public int J() {
        WFa_1 a2;
        return a2.I.sizeY;
    }

    public int f() {
        WFa_1 a2;
        return a2.I.sizeX;
    }

    /*
     * WARNING - void declaration
     */
    public WFa_1(Gg gg2, XF xF2, DZ dZ2, String string) {
        WFa_1 wFa_1;
        void b2;
        block2: {
            int e2;
            void c22;
            JEa[] d2;
            WFa_1 wFa_12 = this;
            wFa_12((Gg)d2, (XF)c22, (DZ)b2);
            d2 = JEa.values();
            int c22 = d2.length;
            int n2 = e2 = uSa.E;
            while (n2 < c22) {
                void a2;
                JEa jEa2 = d2[e2];
                if (jEa2.title.equals(a2)) {
                    wFa_1 = wFa_12;
                    wFa_12.I = jEa2;
                    break block2;
                }
                n2 = ++e2;
            }
            wFa_1 = wFa_12;
        }
        wFa_1.J((DZ)b2);
    }

    public WFa_1(Gg gg2) {
        WFa_1 b2 = gg2;
        WFa_1 a2 = this;
        super((Gg)b2);
    }

    public void e(vL vL2) {
        WFa_1 b2 = vL2;
        WFa_1 a2 = this;
        if (a2.j.J().f(qQa.y)) {
            if (b2 instanceof Sx && ((Sx)((Object)b2)).h.f()) {
                return;
            }
            a2.J(new Mda(Gea.xa), JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        WFa_1 wFa_1 = this;
        String string = a2.J(xqa.o);
        JEa[] jEaArray = JEa.values();
        int n2 = jEaArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            JEa jEa2 = jEaArray[b2];
            if (jEa2.title.equals(string)) {
                wFa_1.I = jEa2;
            }
            n3 = ++b2;
        }
        if (wFa_1.I == null) {
            wFa_1.I = JEa.KEBAB;
        }
        super.J((Waa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        WFa_1 b2;
        float f4 = f2;
        WFa_1 wFa_1 = b2 = this;
        XF f5 = wFa_1.J.add((double)(e2 - b2.la), (double)(d5 - b2.Z), (double)(c2 - b2.A));
        wFa_1.l(f5.getX(), f5.getY(), f5.getZ());
    }

    public void f(Waa waa2) {
        WFa_1 b2 = waa2;
        WFa_1 a2 = this;
        WFa_1 wFa_1 = b2;
        wFa_1.J(xqa.o, a2.I.title);
        super.f((Waa)wFa_1);
    }
}

