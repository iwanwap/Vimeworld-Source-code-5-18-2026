/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CV
 *  GP
 *  Gl
 *  Kpa
 *  Wr
 *  Xr
 *  YQ
 *  pP
 *  pQ
 *  pqa
 *  vL
 *  vQa
 *  vRa
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pP_1 {
    private YQ m;
    private final AR C;
    private final int i;
    private boolean M;
    private final Map<String, pp> k;
    private float j;
    private static final Logger J = LogManager.getLogger();
    private final Map<gq, List<pp>> A;
    private gq I;

    /*
     * WARNING - void declaration
     */
    public void J(gq gq2, boolean bl) {
        void b2;
        boolean c22 = bl;
        pP_1 a2 = this;
        if (a2.m == null) {
            return;
        }
        if (b2 == null) {
            return;
        }
        if (a2.I != b2 || c22) {
            if (a2.I != null && a2.I.getPriority() > b2.getPriority() && a2.C.f()) {
                return;
            }
            List<pp> c22 = a2.A.get(b2);
            if (c22 == null || c22.isEmpty()) {
                return;
            }
            c22 = (pp)Xr.J(c22);
            a2.C.J((pp)((Object)c22), b2.isLooped(), pqa.r);
            a2.I = b2;
        }
    }

    public static /* synthetic */ List J(gq a2) {
        return new ArrayList();
    }

    public void l() {
        pP_1 a2;
        if (a2.m != null) {
            a2.m.i -= vRa.d;
            a2.m.A = OT.e;
            a2.m = null;
        }
    }

    public void J(vL vL2) {
        pP_1 b2 = vL2;
        pP_1 a2 = this;
        boolean bl = ((vL)b2).ha;
        if (a2.M != bl) {
            a2.M = bl;
            a2.J(bl ? gq.LAND : gq.JUMP, uSa.E != 0);
        }
        if (a2.M || ((vL)b2).la == ((vL)b2).V && ((vL)b2).Z == ((vL)b2).Ga && ((vL)b2).A == ((vL)b2).Ca) {
            a2.J(gq.IDLE, uSa.E != 0);
            return;
        }
        a2.J(gq.FALL, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, boolean bl, float f2, boolean bl2) {
        void a2;
        Object e2 = string;
        pP_1 d2 = this;
        if (a2 == false && d2.C.f()) {
            return;
        }
        if ((e2 = d2.k.get(e2)) != null) {
            void b2;
            void c2;
            d2.I = gq.CUSTOM_ANIMATION;
            d2.C.J((pp)e2, (boolean)c2, (float)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        void f4;
        float f5 = f2;
        pP_1 b2 = this;
        if (b2.m == null) {
            return uSa.E != 0;
        }
        pP_1 pP_12 = b2;
        boolean g2 = pP_12.J((vL)f4);
        pP_12.m.f((vL)f4, (double)e2, (double)d5, (double)c2, b2.j);
        if (g2) {
            b2.C.J();
        }
        return vRa.d != 0;
    }

    private void J(YQ yQ2) {
        pP_1 a2;
        pP_1 b2 = yQ2;
        pP_1 pP_12 = a2 = this;
        a2.m = b2;
        pP_1 pP_13 = a2.m;
        ((YQ)pP_13).i += vRa.d;
        pP_12.k.clear();
        pP_12.A.clear();
        pP_13.J().forEach(GP.J((pP)a2));
    }

    public void J(Gl gl2) {
        boolean bl;
        pP_1 b22 = gl2;
        pP_1 a2 = this;
        if (((Gl)b22).a > 0 || ((Gl)b22).J) {
            a2.J(gq.DEATH, uSa.E != 0);
            return;
        }
        if (((Gl)b22).ha > 0) {
            pP_1 pP_12 = b22;
            if (((Gl)pP_12).ha >= ((Gl)pP_12).la - vRa.d) {
                a2.J(gq.DAMAGED, uSa.E != 0);
            }
        }
        if (a2.M != (bl = ((Gl)b22).ha)) {
            a2.M = bl;
            a2.J(bl ? gq.LAND : gq.JUMP, uSa.E != 0);
        }
        if (a2.M || ((Gl)b22).la == ((Gl)b22).V && ((Gl)b22).Z == ((Gl)b22).Ga && ((Gl)b22).A == ((Gl)b22).Ca) {
            pP_1 pP_13 = b22;
            float b22 = ((Gl)pP_13).z + (((Gl)pP_13).U - ((Gl)b22).z) * CV.M;
            a2.J(b22 > Nra.e ? gq.WALK : gq.IDLE, uSa.E != 0);
            return;
        }
        a2.J(gq.FALL, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(vL vL2) {
        pP_1 pP_12 = this;
        float f2 = (float)Kpa.J().N.f() + Kpa.J().w.j.J();
        float b2 = (f2 - pP_12.j) / eta.e;
        pP_12.j = f2;
        if (pP_12.C.l()) {
            void a2;
            pQ.I = a2;
            pP_12.C.J(b2);
            pQ.J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public YQ J() {
        pP_1 a2;
        return a2.m;
    }

    public AR J() {
        pP_1 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2, float f3, int n2, int n3, float f4, float f5, float f6, float f7) {
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        void h2;
        void i2;
        float f9 = f7;
        pP_1 a2 = this;
        if (a2.m == null) {
            return;
        }
        pP_1 pP_12 = a2;
        boolean j2 = pP_12.J((vL)i2);
        pP_12.m.J((vL)i2, (float)h2, (float)g2, (int)f8, (int)e2, (float)d2, (float)c2, (float)b2, a2.j);
        if (j2) {
            a2.C.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public pP_1(int n2, YQ yQ2) {
        void b2;
        pP_1 a2;
        pP_1 c2 = yQ2;
        pP_1 pP_12 = a2 = this;
        pP_1 pP_13 = a2;
        pP_12.A = new EnumMap<gq, List<pp>>(gq.class);
        pP_12.k = new HashMap<String, pp>();
        pP_12.i = b2;
        a2.j = (float)Kpa.J().N.f() + Kpa.J().w.j.J();
        a2.C = new AR((YQ)c2);
        a2.J((YQ)c2);
    }

    public void f() {
        pP_1 a2;
        a2.C.l();
    }

    public int J() {
        pP_1 a2;
        return a2.i;
    }

    public void J() {
        pP_1 a2;
        a2.C.f();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(pP pP2, String string, pp pp2) {
        void a2;
        Object c2 = string;
        pP b2 = pP2;
        b2.k.put((String)c2, (pp)a2);
        c2 = ((String)c2).split(vQa.B)[uSa.E].toUpperCase();
        try {
            b2.A.computeIfAbsent(gq.valueOf((String)c2), Wr.J()).add((pp)a2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }
}

