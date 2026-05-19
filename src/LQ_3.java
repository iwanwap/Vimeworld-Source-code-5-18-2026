/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EK
 *  Ep
 *  Ip
 *  JPa
 *  Kh
 *  LQ
 *  Oz
 *  Spa
 *  XM
 *  YM
 *  Ypa
 *  cRa
 *  fO
 *  jpa
 *  k
 *  kta
 *  pqa
 *  vRa
 *  wI
 *  wPa
 */
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LQ_3
extends Bp
implements yB {
    private String l;
    private float e;
    private float G;
    private String D;
    private wI f;
    private float F;
    private float g;
    private boolean L;
    private float E;
    private float m;
    private ScheduledFuture<?> C;
    private final TreeMap<Float, Integer> i;
    private final kL M;
    private float j;
    private float J;
    private float A;
    private int I;

    @Override
    public float e() {
        LQ_3 a2;
        return a2.M.f();
    }

    @Override
    public Object J() {
        LQ_3 a2;
        return Float.valueOf(a2.m);
    }

    @Override
    public float d() {
        LQ_3 a2;
        return a2.M.f();
    }

    /*
     * WARNING - void declaration
     */
    private int J(float f2) {
        float f3;
        void a2;
        LQ_3 lQ_3 = this;
        if (a2 <= JPa.N) {
            return lQ_3.i.firstEntry().getValue();
        }
        if (a2 >= pqa.r) {
            return lQ_3.i.lastEntry().getValue();
        }
        LQ_3 lQ_32 = lQ_3;
        Map.Entry<Float, Integer> b2 = lQ_32.i.floorEntry(Float.valueOf((float)a2));
        Map.Entry<Float, Integer> entry = lQ_32.i.ceilingEntry(Float.valueOf((float)a2));
        if (b2 == null) {
            return entry.getValue();
        }
        if (entry == null) {
            return (Integer)b2.getValue();
        }
        float f4 = ((Float)b2.getKey()).floatValue();
        if (f4 == (f3 = entry.getKey().floatValue())) {
            return (Integer)b2.getValue();
        }
        return EK.J((float)(pqa.r - (a2 - f4) / (f3 - f4)), (int)((Integer)b2.getValue()), (int)entry.getValue());
    }

    @Override
    public void C() {
        LQ_3 a2;
        LQ_3 lQ_3 = a2;
        super.C();
        if (lQ_3.j == vqa.T) {
            a2.j = a2.M.f() / FRa.Ga;
        }
        if (a2.A == vqa.T) {
            a2.A = a2.M.f();
        }
    }

    @Override
    public void J(fO fO2) {
        LQ_3 lQ_3;
        LQ_3 b2 = fO2;
        LQ_3 a2 = this;
        LQ_3 lQ_32 = b2;
        super.J((fO)lQ_32);
        b2 = lQ_32.getERadialSlider();
        if (b2.hasSize()) {
            LQ_3 lQ_33 = b2;
            lQ_3 = lQ_33;
            a2.M.J(lQ_33.getSize());
        } else if (b2.hasSizeAnim()) {
            LQ_3 lQ_34 = b2;
            lQ_3 = lQ_34;
            a2.M.J(lQ_34.getSizeAnim(), a2.L.C, a2.L.A);
        } else if (b2.hasSizeExpr()) {
            LQ_3 lQ_35 = b2;
            lQ_3 = lQ_35;
            a2.M.J(RJ.f(a2, lQ_35.getSizeExpr()));
        } else {
            if (b2.hasSizeExprAnim()) {
                a2.M.J(RJ.f(a2, b2.getSizeExprAnim()), a2.L.C, a2.L.A);
            }
            lQ_3 = b2;
        }
        if (lQ_3.hasValue()) {
            a2.m = b2.getValue();
        }
    }

    public static /* synthetic */ void J(LQ lQ2, wI wI2) {
        LQ b2 = wI2;
        LQ a2 = lQ2;
        OT.J((wI)b2);
        a2.C = null;
    }

    @Override
    public void J(long l2) {
        LQ_3 lQ_3;
        LQ_3 lQ_32 = lQ_3 = this;
        float a2 = lQ_32.M.f();
        float f2 = a2 / kta.v;
        float b2 = a2 / kta.v;
        Kh.J((float)f2, (float)b2, (float)(a2 / kta.v), (int)lQ_3.x.J);
        LQ_3 lQ_33 = lQ_3;
        Kh.J((float)f2, (float)b2, (float)(lQ_3.A / kta.v), (float)lQ_3.j, (float)CRa.ja, (int)lQ_33.l(lQ_33.I));
        LQ_3 lQ_34 = lQ_3;
        a2 = (lQ_32.m - lQ_3.F) / (lQ_3.e - lQ_34.F);
        int n2 = lQ_34.J(a2);
        Kh.J((float)f2, (float)b2, (float)(lQ_3.A / kta.v), (float)lQ_3.j, (float)(a2 * CRa.ja), (int)lQ_3.l(n2));
    }

    /*
     * WARNING - void declaration
     */
    private void f(boolean bl2) {
        LQ_3 lQ_3;
        void a2;
        LQ_3 lQ_32 = this;
        if (lQ_32.f == null) {
            return;
        }
        if (a2 == false) {
            LQ_3 lQ_33 = lQ_32;
            if (lQ_33.m == lQ_33.E) {
                return;
            }
            LQ_3 lQ_34 = lQ_32;
            lQ_3 = lQ_34;
            lQ_34.E = lQ_34.m;
        } else {
            lQ_3 = lQ_32;
            lQ_32.E = qQa.w;
        }
        Object b2 = lQ_3.C;
        if (b2 != null) {
            b2.cancel(uSa.E != 0);
        }
        b2 = (wI)lQ_32.f.clone();
        b2.put((Object)wPa.O, (Object)Float.valueOf(lQ_32.m));
        if (a2 != false) {
            OT.J((wI)b2);
            return;
        }
        lQ_32.C = OT.d.schedule(Ep.J((LQ)lQ_32, (wI)b2), Spa.R, TimeUnit.MILLISECONDS);
    }

    public LQ_3(k k2, XM xM2) {
        LQ_3 lQ_3;
        LQ_3 lQ_32;
        Iterator a2;
        LQ_3 b2;
        LQ_3 c2 = k2;
        LQ_3 lQ_33 = b2 = this;
        super((k)c2, (XM)a2);
        LQ_3 lQ_34 = b2;
        b2.M = new kL(JPa.N);
        lQ_34.F = JPa.N;
        b2.e = pqa.r;
        b2.G = Jpa.B;
        b2.j = vqa.T;
        b2.A = vqa.T;
        b2.I = cRa.r;
        lQ_33.i = new TreeMap();
        lQ_33.E = qQa.w;
        lQ_33.C = null;
        c2 = a2.getERadialSlider();
        if (c2.hasSize()) {
            LQ_3 lQ_35 = c2;
            lQ_32 = lQ_35;
            b2.M.J(lQ_35.getSize());
        } else {
            if (c2.hasSizeExpr()) {
                b2.M.J(RJ.f(b2, c2.getSizeExpr()));
            }
            lQ_32 = c2;
        }
        if (lQ_32.hasMin()) {
            b2.F = c2.getMin();
        }
        if (c2.hasMax()) {
            b2.e = c2.getMax();
        }
        if (c2.hasValue()) {
            LQ_3 lQ_36 = c2;
            lQ_3 = lQ_36;
            b2.m = lQ_36.getValue();
        } else {
            LQ_3 lQ_37 = b2;
            lQ_37.m = lQ_37.F + (lQ_37.e - b2.F) / kta.v;
            lQ_3 = c2;
        }
        if (lQ_3.hasStep()) {
            b2.G = c2.getStep();
        }
        if (c2.hasCallback()) {
            b2.f = new wI(c2.getCallback().toByteArray());
        }
        if (c2.hasDisplayId()) {
            b2.l = c2.getDisplayId();
        }
        if (c2.hasDisplayFormat()) {
            b2.D = c2.getDisplayFormat();
        }
        if (c2.hasTrackWidth()) {
            b2.j = c2.getTrackWidth();
        }
        if (c2.hasTrackSize()) {
            b2.A = c2.getTrackSize();
        }
        if (c2.hasTrackColor()) {
            b2.I = c2.getTrackColor();
        }
        if (c2.getArcColorsCount() > 0) {
            Iterator iterator = a2 = c2.getArcColorsList().iterator();
            while (iterator.hasNext()) {
                YM yM2 = (YM)a2.next();
                iterator = a2;
                b2.i.put(Float.valueOf(yM2.getValue()), yM2.getColor());
            }
        } else {
            LQ_3 lQ_38 = b2;
            if (c2.hasArcColor()) {
                lQ_38.i.put(Float.valueOf(JPa.N), c2.getArcColor());
                return;
            }
            lQ_38.i.put(Float.valueOf(JPa.N), Ura.I);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, long l2) {
        void a2;
        int d2;
        void b2;
        void c2;
        LQ_3 lQ_3;
        LQ_3 lQ_32 = lQ_3 = this;
        lQ_32.J = (float)c2;
        lQ_32.g = (float)b2;
        int n4 = d2 = c2 >= 0 && (float)c2 < lQ_3.J() && b2 >= 0 && (float)b2 < lQ_3.f() ? vRa.d : uSa.E;
        if (lQ_3.L) {
            d2 = vRa.d;
        }
        LQ_3 lQ_33 = lQ_3;
        boolean bl2 = lQ_33.a.J((int)c2, (int)b2, (long)a2, d2 != 0);
        d2 = bl2 ? 1 : 0;
        lQ_33.J(bl2, (long)a2);
        if (!lQ_33.L) {
            return;
        }
        if (!Mouse.isButtonDown(uSa.E)) {
            lQ_3.L = uSa.E;
            lQ_3.J(vRa.d != 0);
            return;
        }
        lQ_3.J(uSa.E != 0);
    }

    @Override
    public boolean J(long a22) {
        LQ_3 b2;
        LQ_3 lQ_3 = b2;
        boolean a22 = super.J(a22);
        if (lQ_3.l != null) {
            LQ_3 lQ_32 = b2;
            Bp bp2 = lQ_32.s.J(lQ_32.l);
            if (bp2 instanceof Ip) {
                if (b2.D != null) {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = Float.valueOf(b2.m);
                    ((Ip)bp2).J(String.format(b2.D, objectArray));
                    return a22;
                }
                ((Ip)bp2).J(b2.m);
            }
        }
        return a22;
    }

    /*
     * WARNING - void declaration
     */
    private void J(boolean bl2) {
        void a2;
        LQ_3 lQ_3;
        LQ_3 lQ_32 = lQ_3 = this;
        float b2 = lQ_32.M.f();
        float f2 = lQ_32.J - b2 / kta.v;
        lQ_32.m = ((float)Math.atan2(lQ_32.g - b2 / kta.v, f2) + jpa.f) / Ypa.Ha;
        if (lQ_32.m < JPa.N) {
            lQ_3.m += pqa.r;
        }
        if (lQ_3.m > pqa.r) {
            lQ_3.m -= pqa.r;
        }
        LQ_3 lQ_33 = lQ_3;
        LQ_3 lQ_34 = lQ_3;
        lQ_33.m = lQ_33.F + (lQ_34.e - lQ_3.F) * lQ_3.m;
        lQ_33.m = (float)Math.round(lQ_34.m / lQ_3.G) * lQ_3.G;
        LQ_3 lQ_35 = lQ_3;
        lQ_33.m = Oz.J((float)lQ_33.m, (float)lQ_35.F, (float)lQ_35.e);
        lQ_3.f((boolean)a2);
    }

    @Override
    public boolean J(int n2, int n3, int n4) {
        int d2 = n4;
        LQ_3 a2 = this;
        if (d2 != 0) {
            return uSa.E != 0;
        }
        a2.L = vRa.d;
        a2.J(uSa.E != 0);
        return vRa.d != 0;
    }
}

