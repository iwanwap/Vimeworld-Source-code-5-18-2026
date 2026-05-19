/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ch
 *  Kpa
 *  Mi
 *  SRa
 *  Tg
 *  WN
 *  Xh
 *  Xi
 *  Zh
 *  aSa
 *  dN
 *  lo
 *  sG
 *  uKa
 *  vRa
 *  xy
 */
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Tg_2
extends jI {
    public boolean b;
    public int l;
    public xy e;
    public int G;
    public boolean D;
    public long f;
    private static final Map<lo, Function<dN, Tg>> F = new EnumMap<lo, Function<dN, Tg>>(lo.class);
    public float g;
    public K L;
    public int E;
    public Hi m;
    public final oLa C;
    public int i;
    public long M;
    public boolean k;
    public float j;
    public boolean J;
    public boolean A;
    public static final xy I;

    public void e() {
        Tg_2 a2;
        if (a2.M > OT.e + (long)a2.G) {
            a2.M = OT.e + (long)a2.G;
        }
    }

    public void l(long a2) {
    }

    public static Tg J(dN dN2) throws Exception {
        dN dN3 = dN2;
        Function<dN, Tg> a2 = F.get(dN3.getKind());
        if (a2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, SRa.v).append(dN3.getKindValue()).toString());
        }
        return (Tg_2)a2.apply(dN3);
    }

    public boolean J(ALa aLa2) {
        ALa b2 = aLa2;
        Tg_2 a2 = this;
        if (a2.m != null && !a2.m.J(Kpa.J(), (Tg)a2)) {
            return uSa.E != 0;
        }
        if (a2.D || b2.J(a2.e)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f(int n2) {
        int b2 = n2;
        Tg_2 a2 = this;
        return uSa.E != 0;
    }

    public void d() {
        Tg_2 a2;
        if (!a2.A) {
            uKa.J();
        }
        if (!a2.k) {
            uKa.d();
        }
    }

    public boolean J(int n2) {
        int b2 = n2;
        Tg_2 a2 = this;
        return uSa.E != 0;
    }

    public boolean J() {
        Tg_2 a2;
        Tg_2 tg_2 = a2;
        if (tg_2.j < tg_2.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static float J(float a2) {
        float f2 = a2;
        return f2 * f2;
    }

    public Tg_2(dN dN2) {
        Tg_2 tg_2;
        Tg_2 b2 = dN2;
        Tg_2 a2 = this;
        super(b2.hasId() ? b2.getId() : null, null);
        Tg_2 tg_22 = a2;
        tg_22.g = fPa.ea;
        tg_22.f = OT.e;
        tg_22.G = osa.Ja;
        tg_22.l = osa.Ja;
        tg_22.J = uSa.E;
        tg_22.E = ySa.T;
        tg_22.D = uSa.E;
        tg_22.L = sG.A;
        tg_22.i = osa.Ja;
        tg_22.A = vRa.d;
        tg_22.k = vRa.d;
        tg_22.C = Kpa.J().J();
        long l2 = b2.hasDuration() ? b2.getDuration() : gQa.U;
        a2.M = a2.f + l2;
        if (b2.hasStartFade()) {
            a2.l = b2.getStartFade();
        }
        if (b2.hasFinishFade()) {
            a2.G = b2.getFinishFade();
        }
        if (b2.hasRenderDistance()) {
            a2.g = Tg_2.f(b2.getRenderDistance());
        }
        if (b2.hasHoverable()) {
            a2.b = b2.getHoverable();
        }
        if (a2.b && b2.hasHoverRange()) {
            a2.E = Tg_2.f(b2.getHoverRange());
        }
        if (b2.hasFrustum()) {
            a2.D = !b2.getFrustum() ? vRa.d : uSa.E;
            int n2 = a2.D ? 1 : 0;
        }
        if (b2.hasVisibility()) {
            Tg_2 tg_23 = a2;
            tg_23.m = new Hi(b2.getVisibility());
        }
        if (b2.hasEditDuration()) {
            a2.i = b2.getEditDuration();
        }
        if (b2.hasEditEasing()) {
            Tg_2 tg_24 = b2;
            tg_2 = tg_24;
            a2.L = sG.J((WN)tg_24.getEditEasing(), (K)a2.L);
        } else {
            if (b2.hasEditEasingExpr()) {
                a2.L = sG.J((String)b2.getEditEasingExpr(), (K)a2.L);
            }
            tg_2 = b2;
        }
        if (tg_2.hasDepthTest()) {
            a2.A = b2.getDepthTest();
        }
        if (b2.hasFogTest()) {
            a2.k = b2.getFogTest();
        }
    }

    public static int f(int a2) {
        int n2 = a2;
        return n2 * n2;
    }

    public void J(RN rN2) {
        RN b2 = rN2;
        Tg_2 a2 = this;
        if (b2.hasEditDuration()) {
            a2.i = b2.getEditDuration();
        }
        if (b2.hasEditEasing()) {
            a2.L = sG.J((WN)b2.getEditEasing(), (K)a2.L);
            return;
        }
        if (b2.hasEditEasingExpr()) {
            a2.L = sG.J((String)b2.getEditEasingExpr(), (K)a2.L);
        }
    }

    static {
        F.put(lo.BEAM, Mi.J());
        F.put(lo.GROUP, Zh.J());
        F.put(lo.LINE, Xh.J());
        F.put(lo.DIRECTDRAW, Ch.J());
        F.put(lo.SPHERE, Xi.J());
        I = new xy(aSa.V, aSa.V, aSa.V, aSa.V, aSa.V, aSa.V);
    }

    public void C() {
        Tg_2 a2;
        if (!a2.A) {
            uKa.u();
        }
        if (!a2.k) {
            uKa.I();
        }
    }

    public static double J(double a2) {
        double d2 = a2;
        return d2 * d2;
    }

    public void f(long a2) {
    }

    public void l() {
        Tg_2 a2;
        a2.j = (float)(Tg_2.J(a2.C.A - (a2.e.A + a2.e.J) / KPa.y) + Tg_2.J(a2.C.D - (a2.e.M + a2.e.j) / KPa.y) + Tg_2.J(a2.C.g - (a2.e.k + a2.e.I) / KPa.y));
    }
}

