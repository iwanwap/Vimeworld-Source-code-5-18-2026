/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ip
 *  JPa
 *  Oz
 *  Spa
 *  Ypa
 *  fQ
 *  fpa
 *  jpa
 *  kta
 *  ml
 *  pqa
 *  vRa
 *  wI
 *  wPa
 */
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.lwjgl.input.Mouse;

public final class Cq
extends dQ
implements yB {
    private float F;
    public Bp g;
    private final float L;
    private final String E;
    private float m;
    private final wI C;
    private float i;
    private ScheduledFuture<?> M;
    private final String k;
    private boolean j;
    private final String J;
    private final float A;
    private final float I;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3, long l2, boolean bl) {
        void v1;
        void c2;
        float f2;
        void d2;
        int e2;
        boolean bl2 = bl;
        Cq a2 = this;
        if (a2.g == null) {
            return e2 != 0;
        }
        Cq cq2 = a2;
        cq2.F = (float)d2;
        float b2 = cq2.g.l();
        float f3 = cq2.I.f();
        float f4 = JPa.N;
        if (f3 < b2) {
            f4 = -(b2 - f3) / kta.v;
            f2 = f4 + b2;
            v1 = c2;
        } else {
            f2 = f4 + f3;
            v1 = c2;
        }
        if ((float)v1 > f4 && (float)c2 < f2 && d2 > 0 && (float)d2 < a2.I.J()) {
            e2 = vRa.d;
        }
        if (a2.j) {
            if (!Mouse.isButtonDown(uSa.E)) {
                a2.j = uSa.E;
                a2.J(vRa.d != 0);
                return e2 != 0;
            }
            e2 = vRa.d;
            a2.J(uSa.E != 0);
        }
        return e2 != 0;
    }

    @Override
    public Object J() {
        Cq a2;
        return Float.valueOf(a2.m);
    }

    /*
     * WARNING - void declaration
     */
    private void f(boolean bl) {
        Cq cq2;
        void a2;
        Cq cq3 = this;
        if (cq3.C == null) {
            return;
        }
        if (a2 == false) {
            Cq cq4 = cq3;
            if (cq4.m == cq4.i) {
                return;
            }
            Cq cq5 = cq3;
            cq2 = cq5;
            cq5.i = cq5.m;
        } else {
            cq2 = cq3;
            cq3.i = qQa.w;
        }
        Object b2 = cq2.M;
        if (b2 != null) {
            b2.cancel(uSa.E != 0);
        }
        b2 = (wI)cq3.C.clone();
        b2.put((Object)wPa.O, (Object)Float.valueOf(cq3.m));
        if (a2 != false) {
            OT.J((wI)b2);
            return;
        }
        cq3.M = OT.d.schedule(fQ.J((Cq)cq3, (wI)b2), Spa.R, TimeUnit.MILLISECONDS);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean J(long a222) {
        Cq cq2;
        Cq b2;
        if (b2.g == null) {
            Bp a222 = b2.I.s.J(b2.E);
            if (a222 == null) return vRa.d != 0;
            cq2 = b2;
            b2.g = a222;
            b2.g.v = new ml((String)b2.I.I, yG.LEFT);
            b2.g.v.j = yG.RIGHT;
        } else {
            cq2 = b2;
        }
        Cq cq3 = b2;
        float a222 = (cq2.m - b2.I) / (cq3.L - cq3.I);
        Cq cq4 = b2;
        b2.g.d.J((b2.I.C() - cq4.g.C()) * a222);
        Bp a222 = cq4.I.s.J(b2.k);
        if (!(a222 instanceof Ip)) return uSa.E != 0;
        Bp bp2 = a222;
        if (b2.J != null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = Float.valueOf(b2.m);
            ((Ip)bp2).J(String.format(b2.J, objectArray));
            return uSa.E != 0;
        } else {
            ((Ip)bp2).J(b2.m);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Cq(Bp bp2, wI wI2) {
        void b2;
        Cq a2;
        Cq c2 = wI2;
        Cq cq2 = a2 = this;
        Cq cq3 = c2;
        Cq cq4 = a2;
        Cq cq5 = c2;
        Cq cq6 = a2;
        super((Bp)b2);
        a2.M = null;
        cq6.E = c2.getString(Eqa.T);
        cq6.I = c2.getFloat(Bua.r, JPa.N);
        a2.L = cq5.getFloat(fpa.s, pqa.r);
        cq4.A = cq5.getFloat(dqa.k, Jpa.B);
        cq4.m = c2.getFloat(wPa.O, JPa.N);
        a2.C = cq3.getMap(jpa.l);
        cq2.k = cq3.getString(GPa.A);
        cq2.J = c2.getString(Ypa.N);
    }

    public static /* synthetic */ void J(Cq cq2, wI wI2) {
        Cq b2 = wI2;
        Cq a2 = cq2;
        OT.J((wI)b2);
        a2.M = null;
    }

    @Override
    public boolean J(int n2, int n3, int n4) {
        int d2 = n4;
        Cq a2 = this;
        a2.j = vRa.d;
        a2.J(uSa.E != 0);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(boolean bl) {
        void a2;
        Cq cq2;
        Cq cq3 = cq2 = this;
        float f2 = cq3.I.J();
        float b2 = cq3.g.J();
        float f3 = Oz.J((float)(cq3.F - b2 / kta.v), (float)JPa.N, (float)(f2 - b2));
        Cq cq4 = cq2;
        cq3.m = cq3.I + (cq4.L - cq4.I) * f3 / (f2 - b2);
        cq3.m = (float)Math.round(cq3.m / cq2.A) * cq2.A;
        Cq cq5 = cq2;
        cq3.m = Oz.J((float)cq3.m, (float)cq5.I, (float)cq5.L);
        cq3.f((boolean)a2);
    }
}

