/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  JPa
 *  Kh
 *  Od
 *  XM
 *  aSa
 *  cI
 *  dp
 *  gQ
 *  k
 *  pqa
 *  pua
 *  rt
 *  uKa
 *  vRa
 *  wI
 */
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class dp_1
extends nP {
    private float M;
    private float k;
    private final MiniDotItem j;
    private final Od J;
    private float A;
    private float I;

    public static /* synthetic */ void f(dp a2) {
        Kh.J((double)aSa.V, (double)aSa.V, (double)a2.J(), (double)a2.f(), (int)pua.o);
    }

    @Override
    public void J(long a22) {
        dp_1 b2;
        dp_1 dp_12 = b2;
        dp_12.J.J(dp_12.e);
        th a22 = OT.i.g.J();
        if (!a22.J()) {
            Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)Ura.I);
            dp_1 dp_13 = b2;
            cI.J((Runnable)Rr.J((dp)dp_13));
            float f2 = dp_13.A / eua.C;
            dp_13.J(dp_13.J() * (pqa.r / f2), b2.f() * (pqa.r / f2));
            cI.J();
            return;
        }
        int n2 = a22.J((int)b2.J(), (int)b2.f(), gQ.J((dp)b2));
        dp_1.J(b2.x.J);
        uKa.H();
        uKa.C((int)n2);
        Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)JPa.N, (float)pqa.r, (float)pqa.r, (float)JPa.N, (float)b2.I.f());
    }

    public static /* synthetic */ void J(dp a2) {
        dp dp2 = a2;
        dp2.J(a2.J(), dp2.f());
    }

    public static /* synthetic */ void J(dp dp2, float f2) {
        float b2 = f2;
        dp a2 = dp2;
        a2.J.J(aSa.V, aSa.V, (double)(a2.J() * (pqa.r / b2)), (double)(a2.f() * (pqa.r / b2)), vRa.d != 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(double b222, double a2) {
        dp_1 c2;
        uKa.e();
        dp_1 dp_12 = c2;
        float b222 = dp_12.A / eua.C;
        uKa.l((float)b222, (float)b222, (float)b222);
        dp_1 dp_13 = c2;
        uKa.J((float)dp_12.M, (float)c2.I, (float)dp_13.k);
        Runnable b222 = aQ.J((dp)dp_13, b222);
        switch (xQ.I[c2.j.type.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                b222.run();
                break;
            }
            default: {
                vb.J(b222);
            }
        }
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    public dp_1(k k2, XM xM2) {
        void a322;
        dp_1 c2 = k2;
        dp_1 b2 = this;
        super((k)c2, (XM)a322);
        b2.A = pqa.r;
        b2.M = JPa.N;
        b2.I = JPa.N;
        b2.k = JPa.N;
        if (!a322.hasHoverable()) {
            b2.j = (MiniDotItem)vRa.d;
        }
        c2 = a322.getEMiniDot();
        int a322 = c2.getId();
        b2.j = (MiniDotItem)BS.ITEMS.get(a322);
        if (b2.j == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, pta.f).append(a322).toString());
        }
        rt a322 = null;
        if (c2.hasOptions()) {
            wI wI2 = new wI(c2.getOptions().toByteArray());
            a322 = new rt();
            a322.J(wI2);
        }
        if (c2.hasScale()) {
            b2.A = c2.getScale();
        }
        if (c2.hasOffsetX()) {
            b2.M = c2.getOffsetX();
        }
        if (c2.hasOffsetY()) {
            b2.I = c2.getOffsetY();
        }
        if (c2.hasOffsetZ()) {
            b2.k = c2.getOffsetZ();
        }
        b2.J = new Od(b2.j, a322);
    }
}

