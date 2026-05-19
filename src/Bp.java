/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EK
 *  EP
 *  Epa
 *  FP
 *  FQ
 *  Fr
 *  JPa
 *  KR
 *  Kpa
 *  Kr
 *  LI
 *  LR
 *  Ll
 *  Lq
 *  Lra
 *  OP
 *  Pp
 *  Ri
 *  Rq
 *  SI
 *  SK
 *  SRa
 *  VQa
 *  WN
 *  XM
 *  XTa
 *  Yg
 *  Zq
 *  bp
 *  cQa
 *  cq
 *  dR
 *  fO
 *  fTa
 *  fi
 *  hl
 *  hp
 *  k
 *  kR
 *  kpa
 *  kta
 *  lP
 *  lq
 *  ml
 *  nQ
 *  nr
 *  pqa
 *  pua
 *  qq
 *  rQ
 *  sG
 *  uKa
 *  uOa
 *  uRa
 *  vQ
 *  vRa
 *  vr
 *  wI
 *  wQ
 *  xh
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Bp
extends jI {
    public SK p;
    private final Ri n;
    public final k s;
    public Fr w;
    public boolean W;
    public boolean q;
    public EK x;
    public ml v;
    public long o;
    public SK h;
    private static final Map<MM, BiFunction<k, XM, Bp>> K = new EnumMap<MM, BiFunction<k, XM, Bp>>(MM.class);
    public boolean H;
    public yG c;
    public SI B;
    public kL d;
    public dQ a;
    public kL b;
    public boolean l;
    public boolean e;
    private boolean G;
    private long D;
    public String[] f;
    public long F;
    public long g;
    public Ll L;
    private int E;
    public long m;
    public hl C;
    public long i;
    public boolean M;
    public kL k;
    public boolean j;
    public kL J;
    public boolean A;
    public Yg I;

    public abstract float e();

    /*
     * WARNING - void declaration
     */
    private static b J(b b2, float f2) {
        void a2;
        b b3 = b2;
        if (b3 instanceof xh) {
            b b4 = (xh)b3;
            b b5 = LI.C((b)b4.J(), (b)fi.J((float)a2));
            return new xh(new StringBuilder().insert(5 >> 3, b4.J()).append(wta.E).append((float)a2).toString(), b4.J(), b5, b4.J());
        }
        return LI.C((b)b3, (b)fi.J((float)a2));
    }

    public void i() {
    }

    /*
     * WARNING - void declaration
     */
    public Bp(k k2, String string) {
        void b2;
        Bp a2;
        String c2 = string;
        Bp bp = a2 = this;
        Bp bp2 = a2;
        Bp bp3 = a2;
        Bp bp4 = a2;
        Bp bp5 = a2;
        Bp bp6 = a2;
        Bp bp7 = a2;
        Bp bp8 = a2;
        super(c2, null);
        bp8.A = uSa.E;
        bp8.F = OT.e;
        bp8.i = bp8.F + WRa.y;
        bp8.E = pua.o;
        Bp bp9 = a2;
        bp8.x = new EK(a2.E);
        bp8.d = kL.J();
        bp8.b = kL.J();
        bp8.k = kL.f();
        bp8.J = kL.f();
        bp8.C = hl.J();
        bp8.o = nqa.i;
        bp7.c = yG.CENTER;
        bp6.v = null;
        bp7.n = new Ri();
        bp6.D = nqa.i;
        bp6.L = new Ll();
        bp5.p = null;
        bp4.h = null;
        bp5.w = Fr.I;
        bp4.W = uSa.E;
        bp4.G = uSa.E;
        bp4.e = uSa.E;
        bp3.q = uSa.E;
        bp3.j = uSa.E;
        bp3.I = null;
        bp2.l = uSa.E;
        bp2.f = null;
        bp2.H = vRa.d;
        bp.B = null;
        bp.a = new dQ(a2);
        bp.s = b2;
    }

    public boolean f() {
        Bp a2;
        if (OT.i.F.J() == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     */
    public Ri J(long var1_2) {
        block38: {
            var3_4 = this;
            if (var3_4.D == a) {
                return var3_4.n;
            }
            v0 = var3_4;
            v0.D = a;
            var4_5 = v0.d.f();
            b = v0.b.f();
            if (v0.v == null) break block38;
            v1 = var3_4;
            var5_6 = v1.s.J(v1.v.A);
            if (var5_6 == null) {
                if (var3_4.v.I) {
                    var3_4.l();
                }
                return var3_4.n;
            }
            v2 = var3_4;
            var6_7 = v2.C();
            var7_8 = v2.l();
            a = var5_6.J((long)a);
            switch (nQ.A[var3_4.v.J.ordinal()]) lbl-1000:
            // 2 sources

            {
                case 1: {
                    if (false) ** GOTO lbl-1000
                    var4_5 += a.I + var5_6.C() - var6_7 / kta.v;
                    b += a.A + (var5_6.l() - var7_8) / kta.v;
                    break;
                }
                case 2: {
                    var4_5 += a.I - var6_7 / kta.v;
                    b += a.A + (var5_6.l() - var7_8) / kta.v;
                    break;
                }
                case 3: {
                    var4_5 += a.I + (var5_6.C() - var6_7) / kta.v;
                    b += a.A + var5_6.l() - var7_8 / kta.v;
                    break;
                }
                case 4: {
                    var4_5 += a.I + (var5_6.C() - var6_7) / kta.v;
                    b += a.A - var7_8 / kta.v;
                    break;
                }
                case 5: {
                    var4_5 += a.I - var6_7 / kta.v;
                    b += a.A + var5_6.l() - var7_8 / kta.v;
                    break;
                }
                case 6: {
                    var4_5 += a.I + var5_6.C() - var6_7 / kta.v;
                    b += a.A + var5_6.l() - var7_8 / kta.v;
                    break;
                }
                case 7: {
                    var4_5 += a.I - var6_7 / kta.v;
                    b += a.A - var7_8 / kta.v;
                    break;
                }
                case 8: {
                    var4_5 += a.I + var5_6.C() - var6_7 / kta.v;
                    b += a.A - var7_8 / kta.v;
                    break;
                }
                case 9: {
                    var4_5 += a.I + (var5_6.C() - var6_7) / kta.v;
                    b += a.A + (var5_6.l() - var7_8) / kta.v;
                }
            }
            switch (nQ.A[var3_4.v.j.ordinal()]) {
                case 6: {
                    b += var7_8 / kta.v;
                }
lbl59:
                // 3 sources

                case 1: {
                    if (false) ** GOTO lbl59
                    var4_5 += var6_7 / kta.v;
                    break;
                }
                case 5: {
                    b += var7_8 / kta.v;
                }
                case 2: {
                    var4_5 -= var6_7 / kta.v;
                    break;
                }
                case 3: {
                    b += var7_8 / kta.v;
                    break;
                }
                case 4: {
                    b -= var7_8 / kta.v;
                    break;
                }
                case 7: {
                    var4_5 -= var6_7 / kta.v;
                    b -= var7_8 / kta.v;
                    break;
                }
                case 8: {
                    var4_5 += var6_7 / kta.v;
                    b -= var7_8 / kta.v;
                }
            }
            ** GOTO lbl-1000
        }
        if (var3_4.c == null) ** GOTO lbl-1000
        switch (nQ.A[var3_4.c.ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                var4_5 = var3_4.s.J() - var3_4.C() - var4_5;
            }
            case 2: {
                b += (var3_4.s.f() - var3_4.l()) / kta.v;
                v3 = var3_4;
                break;
            }
            case 5: {
                v4 = var3_4;
                v3 = v4;
                b = v4.s.f() - var3_4.l() - b;
                break;
            }
            case 3: {
                b = var3_4.s.f() - var3_4.l() - b;
            }
            case 4: {
                var4_5 += (var3_4.s.J() - var3_4.C()) / kta.v;
                v3 = var3_4;
                break;
            }
            case 6: {
                b = var3_4.s.f() - var3_4.l() - b;
            }
            case 8: {
                v5 = var3_4;
                v3 = v5;
                var4_5 = v5.s.J() - var3_4.C() - var4_5;
                break;
            }
            case 9: {
                var4_5 += (var3_4.s.J() - var3_4.C()) / kta.v;
                b += (var3_4.s.f() - var3_4.l()) / kta.v;
            }
            default: lbl-1000:
            // 3 sources

            {
                v3 = var3_4;
            }
        }
        if (v3.M && !var3_4.d.J() && !var3_4.b.J()) {
            var4_5 = (int)var4_5;
            b = (int)b;
        }
        v6 = var3_4;
        v6.n.J(var4_5, b);
        return v6.n;
    }

    public boolean J() {
        Bp a2;
        return a2.e;
    }

    public abstract float d();

    /*
     * WARNING - void declaration
     */
    private void l(SK sK2, long l2) {
        Bp bp;
        Bp bp2;
        Bp bp3;
        Bp bp4;
        Bp bp5;
        Bp bp6;
        void a2;
        b b2;
        Bp c2 = sK2;
        Bp b3 = this;
        SK sK3 = new SK((SK)c2);
        if (sK3.B && sK3.e == null) {
            sK3.e = c2;
        }
        if (((SK)c2).I != JPa.N) {
            Bp bp7 = b3;
            b2 = Bp.J(bp7.d.J(), ((SK)c2).I);
            Bp bp8 = c2;
            bp7.d.J(b2, ((SK)bp8).F, ((SK)bp8).E, (long)a2);
            Bp bp9 = c2;
            bp6 = bp9;
            sK3.I = -((SK)bp9).I;
        } else if (((SK)c2).i != null) {
            Bp bp10 = c2;
            bp6 = bp10;
            b3.d.J(((SK)c2).i.floatValue(), ((SK)bp10).F, ((SK)c2).E, (long)a2);
        } else {
            if (((SK)c2).G != null) {
                Bp bp11 = c2;
                b3.d.J(RJ.f(b3, ((SK)c2).G), ((SK)bp11).F, ((SK)bp11).E, (long)a2);
            }
            bp6 = c2;
        }
        if (((SK)bp6).d != JPa.N) {
            Bp bp12 = b3;
            b2 = Bp.J(bp12.b.J(), ((SK)c2).d);
            Bp bp13 = c2;
            bp12.b.J(b2, ((SK)bp13).F, ((SK)bp13).E, (long)a2);
            Bp bp14 = c2;
            bp5 = bp14;
            sK3.d = -((SK)bp14).d;
        } else if (((SK)c2).a != null) {
            Bp bp15 = c2;
            bp5 = bp15;
            b3.b.J(((SK)c2).a.floatValue(), ((SK)bp15).F, ((SK)c2).E, (long)a2);
        } else {
            if (((SK)c2).g != null) {
                Bp bp16 = c2;
                b3.b.J(RJ.J(b3, ((SK)c2).g), ((SK)bp16).F, ((SK)bp16).E, (long)a2);
            }
            bp5 = c2;
        }
        if (((SK)bp5).C != JPa.N) {
            Bp bp17 = b3;
            b2 = Bp.J(bp17.k.J(), ((SK)c2).C);
            Bp bp18 = c2;
            bp17.k.J(b2, ((SK)bp18).F, ((SK)bp18).E, (long)a2);
            Bp bp19 = c2;
            bp4 = bp19;
            sK3.C = -((SK)bp19).C;
        } else if (((SK)c2).m != null) {
            Bp bp20 = c2;
            bp4 = bp20;
            b3.k.J(((SK)c2).m.floatValue(), ((SK)bp20).F, ((SK)c2).E, (long)a2);
        } else {
            if (((SK)c2).D != null) {
                Bp bp21 = c2;
                b3.k.J(RJ.f(b3, ((SK)c2).D), ((SK)bp21).F, ((SK)bp21).E, (long)a2);
            }
            bp4 = c2;
        }
        if (((SK)bp4).M != JPa.N) {
            Bp bp22 = b3;
            b2 = Bp.J(bp22.J.J(), ((SK)c2).M);
            Bp bp23 = c2;
            bp22.J.J(b2, ((SK)bp23).F, ((SK)bp23).E, (long)a2);
            Bp bp24 = c2;
            bp3 = bp24;
            sK3.M = -((SK)bp24).M;
        } else if (((SK)c2).A != null) {
            Bp bp25 = c2;
            bp3 = bp25;
            b3.J.J(((SK)c2).A.floatValue(), ((SK)bp25).F, ((SK)c2).E, (long)a2);
        } else {
            if (((SK)c2).L != null) {
                Bp bp26 = c2;
                b3.J.J(RJ.J(b3, ((SK)c2).L), ((SK)bp26).F, ((SK)bp26).E, (long)a2);
            }
            bp3 = c2;
        }
        if (((SK)bp3).b != JPa.N) {
            Bp bp27 = b3;
            b2 = Bp.J(bp27.C.J(), ((SK)c2).b);
            Bp bp28 = c2;
            bp27.C.J(b2, ((SK)bp28).F, ((SK)bp28).E, (long)a2);
            Bp bp29 = c2;
            bp2 = bp29;
            sK3.b = -((SK)bp29).b;
        } else if (((SK)c2).j != null) {
            Bp bp30 = c2;
            bp2 = bp30;
            b3.C.J(((SK)c2).j.floatValue(), ((SK)bp30).F, ((SK)c2).E, (long)a2);
        } else {
            if (((SK)c2).J != null) {
                Bp bp31 = c2;
                b3.C.J(RJ.f(b3, ((SK)c2).J), ((SK)bp31).F, ((SK)bp31).E, (long)a2);
            }
            bp2 = c2;
        }
        Bp bp32 = b3;
        if (((SK)bp2).l != null) {
            Bp bp33 = c2;
            bp32.x.J(((SK)c2).l.intValue(), ((SK)bp33).F, ((SK)bp33).E, (long)a2);
            bp = b3;
        } else {
            if (bp32.x.M != b3.E) {
                Bp bp34 = b3;
                Bp bp35 = c2;
                bp34.x.J(bp34.E, ((SK)bp35).F, ((SK)bp35).E, (long)a2);
            }
            bp = b3;
        }
        bp.h = sK3;
        Bp bp36 = b3;
        bp36.g = a2;
        bp36.D = nqa.i;
    }

    public void J(xm xm2) {
        xm b2 = xm2;
        Bp a2 = this;
        a2.J(b2.getKind(), new wI(b2.getData().toByteArray()));
    }

    public Bp J() {
        Bp bp;
        Bp a2;
        Bp bp2 = a2 = (bp = this);
        while (bp2.s instanceof Bp) {
            bp2 = (Bp)a2.s;
        }
        return a2;
    }

    public boolean J(Kpa kpa2) {
        Bp a2;
        Bp b22 = kpa2;
        Bp bp = a2 = this;
        int b22 = a2.w.J((Kpa)b22, bp);
        int n2 = bp.G;
        a2.G = b22;
        if (n2 != b22) {
            if (b22 != 0 && a2.L.M != null) {
                Bp bp2 = a2;
                bp2.J(bp2.L.M, OT.e);
            }
            if (b22 == 0 && a2.L.k != null) {
                Bp bp3 = a2;
                bp3.J(bp3.L.k, OT.e);
            }
            if (b22 == 0 && a2.l && a2.f()) {
                OT.i.F.J();
            }
        }
        if (!a2.G && a2.L.k != null) {
            Bp bp4 = a2;
            if (bp4.p == bp4.L.k && OT.e - a2.g < (long)a2.L.k.k) {
                b22 = vRa.d;
            }
        }
        a2.W = b22;
        return b22 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(long l2) {
        float f2;
        float f3;
        void a2;
        Bp bp = this;
        bp.o = bp.d.i + bp.b.i + bp.k.i + bp.J.i;
        if (!bp.J((long)a2)) {
            return;
        }
        Bp bp2 = bp;
        Ri ri = bp2.J((long)a2);
        bp2.x.J();
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        uKa.e();
        if (ri.I != JPa.N || ri.A != JPa.N) {
            Ri ri2 = ri;
            uKa.J((float)ri2.I, (float)ri2.A, (float)JPa.N);
        }
        if ((f3 = bp.C.f()) != JPa.N) {
            Bp bp3 = bp;
            f2 = bp3.C();
            float b2 = bp3.l();
            uKa.J((float)(f2 / kta.v), (float)(b2 / kta.v), (float)JPa.N);
            uKa.J((float)f3, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.J((float)(-f2 / kta.v), (float)(-b2 / kta.v), (float)JPa.N);
        }
        Bp bp4 = bp;
        f2 = bp4.k.f();
        float b2 = bp4.J.f();
        if (f2 != pqa.r || b2 != pqa.r) {
            uKa.l((float)f2, (float)b2, (float)pqa.r);
        }
        Bp bp5 = bp;
        bp5.a.J();
        bp5.J((long)a2);
        bp.a.f();
        uKa.D();
    }

    public void M() {
    }

    public int l(int n2) {
        int b2 = n2;
        Bp a2 = this;
        int n3 = Bp.J(a2.x.J);
        if (n3 >= Bp.J(b2)) {
            return b2;
        }
        return Bp.l(b2, n3);
    }

    public float C() {
        Bp a2;
        return a2.k.f() * a2.J();
    }

    /*
     * Unable to fully structure code
     */
    public void J(fO var1_1) {
        b = var1_1;
        a = this;
        if (b.hasEditEasing()) {
            v0 = b;
            v1 = v0;
            a.L.A = sG.J((WN)v0.getEditEasing(), (K)a.L.A);
        } else {
            if (b.hasEditEasingExpr()) {
                a.L.A = sG.J((String)b.getEditEasingExpr(), (K)a.L.A);
            }
            v1 = b;
        }
        if (v1.hasEditDuration()) {
            a.L.C = b.getEditDuration();
        }
        if (b.hasX()) {
            v2 = b;
            v3 = v2;
            a.d.J(v2.getX());
        } else if (b.hasXExpr()) {
            v4 = b;
            v3 = v4;
            a.d.J(RJ.f(a, v4.getXExpr()));
        } else if (b.hasXAnim()) {
            v5 = b;
            v3 = v5;
            a.d.J(v5.getXAnim(), a.L.C, a.L.A);
        } else {
            if (b.hasXExprAnim()) {
                a.d.J(RJ.f(a, b.getXExprAnim()), a.L.C, a.L.A);
            }
            v3 = b;
        }
        if (v3.hasY()) {
            v6 = b;
            v7 = v6;
            a.b.J(v6.getY());
        } else if (b.hasYExpr()) {
            v8 = b;
            v7 = v8;
            a.b.J(RJ.J(a, v8.getYExpr()));
        } else if (b.hasYAnim()) {
            v9 = b;
            v7 = v9;
            a.b.J(v9.getYAnim(), a.L.C, a.L.A);
        } else {
            if (b.hasYExprAnim()) {
                a.b.J(RJ.J(a, b.getYExprAnim()), a.L.C, a.L.A);
            }
            v7 = b;
        }
        if (v7.hasColor()) {
            v10 = a;
            a.L.J(v10.E, b.getColor());
            a.E = b.getColor();
            v10.x.J(a.E);
            v11 = b;
        } else {
            if (b.hasColorAnim()) {
                v12 = a;
                v12.L.J(a.x.M, b.getColorAnim());
                v12.E = b.getColorAnim();
                v13 = a;
                v12.x.J(v13.E, v13.L.C, a.L.A);
            }
            v11 = b;
        }
        if (v11.hasScaleX()) {
            v14 = b;
            v15 = v14;
            a.k.J(v14.getScaleX());
        } else if (b.hasScaleXExpr()) {
            v16 = b;
            v15 = v16;
            a.k.J(RJ.f(a, v16.getScaleXExpr()));
        } else if (b.hasScaleXAnim()) {
            v17 = b;
            v15 = v17;
            a.k.J(v17.getScaleXAnim(), a.L.C, a.L.A);
        } else {
            if (b.hasScaleXExprAnim()) {
                a.k.J(RJ.f(a, b.getScaleXExprAnim()), a.L.C, a.L.A);
            }
            v15 = b;
        }
        if (v15.hasScaleY()) {
            v18 = b;
            v19 = v18;
            a.J.J(v18.getScaleY());
        } else if (b.hasScaleYExpr()) {
            v20 = b;
            v19 = v20;
            a.J.J(RJ.J(a, v20.getScaleYExpr()));
        } else if (b.hasScaleYAnim()) {
            v21 = b;
            v19 = v21;
            a.J.J(v21.getScaleYAnim(), a.L.C, a.L.A);
        } else {
            if (b.hasScaleYExprAnim()) {
                a.J.J(RJ.J(a, b.getScaleYExprAnim()), a.L.C, a.L.A);
            }
            v19 = b;
        }
        if (v19.hasRotate()) {
            v22 = b;
            v23 = v22;
            a.C.J(v22.getRotate());
        } else if (b.hasRotateExpr()) {
            v24 = b;
            v23 = v24;
            a.C.J(RJ.f(a, v24.getRotateExpr()));
        } else if (b.hasRotateAnim()) {
            v25 = b;
            v23 = v25;
            a.C.J(v25.getRotateAnim(), a.L.C, a.L.A);
        } else if (b.hasRotateAnimSmart()) {
            v26 = b;
            v23 = v26;
            a.C.f(v26.getRotateAnimSmart(), a.L.C, a.L.A);
        } else {
            if (b.hasRotateExprAnim()) {
                a.C.J(RJ.f(a, b.getRotateExprAnim()), a.L.C, a.L.A);
            }
            v23 = b;
        }
        if (v23.getTooltipCount() <= 0) ** GOTO lbl128
        if (b.getTooltipCount() == vRa.d && b.getTooltip(uSa.E).isEmpty()) {
            v27 = b;
            a.f = null;
        } else {
            a.f = b.getTooltipList().toArray(new String[uSa.E]);
lbl128:
            // 2 sources

            v27 = b;
        }
        if (v27.getAnimateCount() > 0) {
            a.J(Ll.J((List)b.getAnimateList()), OT.e);
        }
        if (b.hasHoverable()) {
            a.j = b.getHoverable();
            if (!a.j) {
                v28 = a;
                v28.J((boolean)uSa.E, OT.e);
                if (v28.f()) {
                    OT.i.F.J();
                }
            }
        }
        OT.i.k.J(a);
    }

    public float f() {
        Bp a2;
        return a2.d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(long l2) {
        void a2;
        Bp bp = this;
        if (a2 < bp.F || a2 > bp.i) {
            return uSa.E != 0;
        }
        if (bp.a.J((long)a2)) {
            return uSa.E != 0;
        }
        if (bp.m != nqa.i && a2 + bp.m > bp.i) {
            Bp bp2 = bp;
            bp2.J(bp2.L.J, bp.i - bp.m);
            bp.m = nqa.i;
        }
        int b2 = uSa.E;
        Bp bp3 = bp;
        while (bp3.h != null && a2 - bp.g > (long)bp.h.k) {
            if (b2 == PRa.U) {
                return uSa.E != 0;
            }
            Bp bp4 = bp;
            if (bp.h.e != null) {
                bp4.l(bp.h.e, bp.g + (long)bp.h.k);
            } else if (bp4.h.B) {
                Bp bp5 = bp;
                bp.l(bp5.h, bp5.g + (long)bp.h.k);
            } else {
                bp.h = null;
                Bp bp6 = bp;
                bp6.p = null;
                bp6.D = nqa.i;
            }
            ++b2;
            bp3 = bp;
        }
        bp.o = bp.d.i + bp.b.i + bp.k.i + bp.J.i;
        return vRa.d != 0;
    }

    public float J() {
        Bp a2;
        return a2.e();
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, long l2) {
        void a2;
        boolean c2 = bl;
        Bp b2 = this;
        if (b2.I != null) {
            Bp bp = b2;
            Bp bp2 = b2;
            bp.I.J(bp2, c2);
            boolean bl2 = bp.I.J();
            if (bp2.q != bl2) {
                b2.q = bl2;
                if (b2.q && b2.L.m != null) {
                    Bp bp3 = b2;
                    bp3.J(bp3.L.m, (long)a2);
                }
                if (!bl2 && b2.L.i != null) {
                    Bp bp4 = b2;
                    bp4.J(bp4.L.i, (long)a2);
                }
            }
        } else if (b2.e != c2) {
            if (c2 && b2.L.m != null) {
                Bp bp = b2;
                bp.J(bp.L.m, (long)a2);
            }
            if (!c2 && b2.L.i != null) {
                Bp bp = b2;
                bp.J(bp.L.i, (long)a2);
            }
        }
        b2.e = c2;
    }

    public boolean J(int n2) {
        int b2 = n2;
        Bp a2 = this;
        return a2.a.J(b2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean J(int n2, int n3, int n4) {
        void b22;
        void c22;
        int d22 = n4;
        Bp a2 = this;
        if (a2.a.J((int)c22, (int)b22, d22)) {
            return vRa.d != 0;
        }
        if (a2.l && !a2.A) {
            OT.i.F.f(a2);
            return vRa.d != 0;
        }
        if (a2.B == null) return uSa.E != 0;
        switch (nQ.I[a2.B.I.ordinal()]) {
            case 1: {
                Sg.l((String)a2.B.A);
                return vRa.d != 0;
            }
            case 2: {
                Sg.f((String)a2.B.A);
                return vRa.d != 0;
            }
            case 3: {
                wI c22 = new wI((HashMap)((wI)a2.B.A));
                if (!c22.containsKey((Object)uOa.W)) {
                    c22.put((Object)uOa.W, (Object)d22);
                }
                if (!c22.containsKey((Object)Gta.g)) {
                    int n5;
                    ArrayList<Integer> b22 = new ArrayList<Integer>();
                    int[] nArray = new int[Yqa.i];
                    nArray[uSa.E] = ITa.A;
                    nArray[vRa.d] = Epa.ja;
                    nArray[uqa.g] = cQa.i;
                    nArray[yRa.d] = GPa.C;
                    nArray[AQa.P] = Upa.D;
                    nArray[tTa.h] = kTa.T;
                    nArray[uua.p] = yRa.T;
                    nArray[XTa.W] = fTa.Ja;
                    int[] d22 = nArray;
                    int n6 = nArray.length;
                    int n7 = n5 = uSa.E;
                    while (n7 < n6) {
                        int n8 = d22[n5];
                        if (Keyboard.isKeyDown(n8)) {
                            b22.add(n8);
                        }
                        n7 = ++n5;
                    }
                    if (!b22.isEmpty()) {
                        c22.put((Object)Gta.g, (Object)b22.stream().mapToInt(FQ.J()).toArray());
                    }
                }
                if (c22.containsKey((Object)yta.P)) {
                    wI wI2 = c22;
                    BiConsumer b22 = hp.J((wI)wI2);
                    Object d22 = wI2.get((Object)yta.P);
                    if (d22 instanceof wI) {
                        wI wI3 = (wI)d22;
                        for (String string : wI3.keySet()) {
                            d22 = wI3.get((Object)string);
                            if (d22 instanceof UUID) {
                                k k2 = a2.J();
                                ArrayList arrayList = new ArrayList();
                                k2.J((UUID)d22, arrayList);
                                if (arrayList.isEmpty()) continue;
                                b22.accept(string, arrayList.get(uSa.E));
                                continue;
                            }
                            if (!(d22 instanceof String)) continue;
                            Bp bp = RJ.J((String)d22).apply(a2);
                            b22.accept(string, bp);
                        }
                    }
                    c22.remove((Object)yta.P);
                }
                OT.J(c22);
                return vRa.d != 0;
            }
            case 4: {
                Kpa.J().J(null);
                return vRa.d != 0;
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(SK sK2, long l2) {
        Bp bp;
        Bp bp2;
        Bp bp3;
        Bp bp4;
        void a2;
        Bp bp5;
        Bp c2 = sK2;
        Bp b2 = this;
        if (((SK)c2).I != JPa.N) {
            Bp bp6 = c2;
            bp5 = bp6;
            Bp.f(b2.d, ((SK)c2).I, (SK)bp6, (long)a2);
        } else if (((SK)c2).i != null) {
            Bp bp7 = c2;
            bp5 = bp7;
            Bp.J(b2.d, ((SK)c2).i.floatValue(), (SK)bp7, (long)a2);
        } else {
            if (((SK)c2).G != null) {
                Bp.J(b2.d, RJ.f(b2, ((SK)c2).G), (SK)c2, (long)a2);
            }
            bp5 = c2;
        }
        if (((SK)bp5).d != JPa.N) {
            Bp bp8 = c2;
            bp4 = bp8;
            Bp.f(b2.b, ((SK)c2).d, (SK)bp8, (long)a2);
        } else if (((SK)c2).a != null) {
            Bp bp9 = c2;
            bp4 = bp9;
            Bp.J(b2.b, ((SK)c2).a.floatValue(), (SK)bp9, (long)a2);
        } else {
            if (((SK)c2).g != null) {
                Bp.J(b2.b, RJ.J(b2, ((SK)c2).g), (SK)c2, (long)a2);
            }
            bp4 = c2;
        }
        if (((SK)bp4).C != JPa.N) {
            Bp bp10 = c2;
            bp3 = bp10;
            Bp.f(b2.k, ((SK)c2).C, (SK)bp10, (long)a2);
        } else if (((SK)c2).m != null) {
            Bp bp11 = c2;
            bp3 = bp11;
            Bp.J(b2.k, ((SK)c2).m.floatValue(), (SK)bp11, (long)a2);
        } else {
            if (((SK)c2).D != null) {
                Bp.J(b2.k, RJ.f(b2, ((SK)c2).D), (SK)c2, (long)a2);
            }
            bp3 = c2;
        }
        if (((SK)bp3).M != JPa.N) {
            Bp bp12 = c2;
            bp2 = bp12;
            Bp.f(b2.J, ((SK)c2).M, (SK)bp12, (long)a2);
        } else if (((SK)c2).A != null) {
            Bp bp13 = c2;
            bp2 = bp13;
            Bp.J(b2.J, ((SK)c2).A.floatValue(), (SK)bp13, (long)a2);
        } else {
            if (((SK)c2).L != null) {
                Bp.J(b2.J, RJ.J(b2, ((SK)c2).L), (SK)c2, (long)a2);
            }
            bp2 = c2;
        }
        if (((SK)bp2).b != JPa.N) {
            Bp bp14 = c2;
            bp = bp14;
            Bp.f((kL)b2.C, ((SK)c2).b, (SK)bp14, (long)a2);
        } else if (((SK)c2).j != null) {
            Bp bp15 = c2;
            bp = bp15;
            Bp.J((kL)b2.C, ((SK)c2).j.floatValue(), (SK)bp15, (long)a2);
        } else {
            if (((SK)c2).J != null) {
                Bp.J((kL)b2.C, RJ.f(b2, ((SK)c2).J), (SK)c2, (long)a2);
            }
            bp = c2;
        }
        if (((SK)bp).l != null) {
            Bp bp16 = c2;
            b2.x.J(b2.x.M, ((SK)bp16).F, ((SK)bp16).E, (long)a2);
            b2.x.A = ((SK)c2).l;
        }
        Bp bp17 = b2;
        b2.D = nqa.i;
        bp17.h = c2;
        bp17.p = c2;
        b2.g = a2;
    }

    public String J() {
        Bp a2;
        if (a2.s instanceof Bp) {
            return ((Bp)a2.s).J() + VQa.ja + (String)a2.I;
        }
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(char c2, int n2) {
        void b2;
        int c3 = n2;
        Bp a2 = this;
        return a2.a.J((char)b2, c3);
    }

    /*
     * WARNING - void declaration
     */
    public void J(SK sK2, long l2) {
        void a2;
        Bp b2;
        Bp c2 = sK2;
        Bp bp = b2 = this;
        if (bp.p == bp.L.J) {
            return;
        }
        Bp bp2 = c2;
        b2.l((SK)bp2, (long)a2);
        b2.p = bp2;
    }

    public int f(int n2) {
        int b2 = n2;
        Bp a2 = this;
        return Bp.l(b2, Bp.J(a2.x.J));
    }

    static {
        K.put(MM.RECTANGLE, cq.J());
        K.put(MM.TEXT, lq.J());
        K.put(MM.TEXT_TIMER, wQ.J());
        K.put(MM.TEXT_STOPWATCH, LR.J());
        K.put(MM.TEXT_CLOCK, bp.J());
        K.put(MM.TEXT_INPUT, ep.J());
        K.put(MM.TEXT_PLACEHOLDER, OP.J());
        K.put(MM.IMAGE, Lq.J());
        K.put(MM.IMAGE_9SLICE, vr.J());
        K.put(MM.PROGRESS_BAR, rQ.J());
        K.put(MM.PROGRESS_TIMER, BQ.J());
        K.put(MM.RADIAL_PROGRESS_BAR, FP.J());
        K.put(MM.RADIAL_PROGRESS_TIMER, dR.J());
        K.put(MM.VIGNETTE, EP.J());
        K.put(MM.TABLE, lP.J());
        K.put(MM.BUTTON, nr.J());
        K.put(MM.CONTAINER, vQ.J());
        K.put(MM.SPACER, aP.J());
        K.put(MM.RADIAL_SLIDER, Pp.J());
        K.put(MM.MINIDOT_PREVIEW, Kr.J());
        K.put(MM.MODEL_PREVIEW, Zq.J());
        K.put(MM.PLAYER_PREVIEW, eR.J());
    }

    public void e() {
        a.D = nqa.i;
    }

    @Override
    public void f() {
        Bp a2;
        Bp bp2 = a2;
        super.f();
        bp2.a.l();
    }

    /*
     * WARNING - void declaration
     */
    private static void f(kL kL2, float f2, SK sK2, long l2) {
        void a2;
        void c2;
        kL b2;
        kL d2 = sK2;
        kL kL3 = b2 = kL2;
        Bp.J(kL3, Bp.J(kL3.J(), (float)c2), (SK)d2, (long)a2);
    }

    public void d() {
        Bp a2;
        Bp bp2 = a2;
        bp2.A = vRa.d;
        bp2.M = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(kL kL2, float f2, SK sK2, long l2) {
        void a2;
        void b2;
        void c2;
        kL kL3;
        kL kL4 = kL3 = kL2;
        b d2 = kL4.J();
        kL4.J((float)c2);
        void v1 = b2;
        kL4.J(d2, v1.F, v1.E, (long)a2);
    }

    public void C() {
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(wI wI2, String string, Bp bp) {
        void b2;
        Object c2 = bp;
        wI a2 = wI2;
        if (c2 == null) {
            return;
        }
        if (c2 instanceof yB) {
            a2.put((Object)b2, ((yB)c2).J());
        }
        if (c2.a instanceof yB) {
            a2.put((Object)b2, ((yB)((Object)c2.a)).J());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(String string, wI wI2) {
        int n2;
        void b2;
        Bp bp2;
        block14: {
            bp2 = this;
            void var3_5 = b2;
            int c2 = pua.o;
            switch (var3_5.hashCode()) {
                case -1262408535: {
                    if (!var3_5.equals(Bra.Z)) break;
                    n2 = c2 = uSa.E;
                    break block14;
                }
                case 281361500: {
                    if (!var3_5.equals(BPa.m)) break;
                    n2 = c2 = vRa.d;
                    break block14;
                }
                case 1295494174: {
                    if (!var3_5.equals(qQa.la)) break;
                    n2 = c2 = uqa.g;
                    break block14;
                }
                case 1457992760: {
                    if (!var3_5.equals(osa.Q)) break;
                    n2 = c2 = yRa.d;
                    break block14;
                }
                case -1791696787: {
                    if (!var3_5.equals(KPa.Ka)) break;
                    c2 = AQa.P;
                }
            }
            n2 = c2;
        }
        switch (n2) {
            case 0: {
                void a2;
                bp2.a = new KR(bp2, (wI)a2);
                return;
            }
            case 1: {
                void a2;
                bp2.a = new kR(bp2, (wI)a2);
                return;
            }
            case 2: {
                bp2.a = new qq(bp2);
                return;
            }
            case 3: {
                void a2;
                bp2.a = new Rq(bp2, (wI)a2);
                return;
            }
            case 4: {
                void a2;
                bp2.a = new Cq(bp2, (wI)a2);
                return;
            }
        }
        OT.b.warn(new StringBuilder().insert(3 & 4, AQa.O).append((String)b2).append(uRa.r).append((String)bp2.I).toString());
    }

    /*
     * WARNING - void declaration
     */
    private static void J(kL kL2, b b2, SK sK2, long l2) {
        void a2;
        void b3;
        void c2;
        kL kL3;
        kL kL4 = kL3 = kL2;
        b d2 = kL4.J();
        kL4.J((b)c2);
        void v1 = b3;
        kL4.J(d2, v1.F, v1.E, (long)a2);
    }

    public Ri J() {
        Bp a2;
        return a2.J(OT.e);
    }

    public float l() {
        Bp a2;
        return a2.J.f() * a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public static Bp J(XM xM2, k k2) throws Exception {
        void a2;
        XM xM3 = xM2;
        BiFunction<k, XM, Bp> b2 = K.get(xM3.getKind());
        if (b2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, SRa.v).append(xM3.getKindValue()).toString());
        }
        Bp bp2 = (Bp)b2.apply((k)a2, xM3);
        bp2.C();
        return bp2;
    }

    public void l() {
        Bp a2;
        long l2 = OT.e;
        if (a2.i > l2 + a2.m) {
            a2.i = l2 + a2.m;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, long l2) {
        void a2;
        void b2;
        void c2;
        Bp bp2 = this;
        int d2 = c2 >= 0 && (float)c2 < bp2.J() && b2 >= 0 && (float)b2 < bp2.f() ? vRa.d : uSa.E;
        Bp bp3 = bp2;
        d2 = bp3.a.J((int)c2, (int)b2, (long)a2, d2 != 0);
        bp3.J(d2 != 0, (long)a2);
    }

    public static /* synthetic */ int J(Integer a2) {
        return a2;
    }

    public String toString() {
        Bp a2;
        return new StringBuilder().insert(3 & 4, a2.getClass().getSimpleName()).append(dqa.X).append((String)a2.I).append(XOa.D).toString();
    }

    /*
     * WARNING - void declaration
     */
    public Bp(k k2, XM xM2) {
        Bp bp2;
        Bp bp3;
        Bp bp4;
        Bp bp5;
        void b2;
        Bp bp6;
        String string;
        Bp c2 = xM2;
        Bp a2 = this;
        if (c2.hasId()) {
            string = c2.getId();
            bp6 = c2;
        } else {
            string = null;
            bp6 = c2;
        }
        super(string, bp6.hasUuid() ? bh.J(c2.getUuid().toByteArray()) : null);
        Bp bp7 = a2;
        Bp bp8 = a2;
        Bp bp9 = a2;
        Bp bp10 = a2;
        Bp bp11 = a2;
        Bp bp12 = a2;
        Bp bp13 = a2;
        a2.A = uSa.E;
        a2.F = OT.e;
        a2.i = a2.F + WRa.y;
        a2.E = pua.o;
        Bp bp14 = a2;
        a2.x = new EK(a2.E);
        a2.d = kL.J();
        a2.b = kL.J();
        a2.k = kL.f();
        a2.J = kL.f();
        a2.C = hl.J();
        a2.o = nqa.i;
        bp13.c = yG.CENTER;
        bp12.v = null;
        bp13.n = new Ri();
        bp12.D = nqa.i;
        bp12.L = new Ll();
        bp11.p = null;
        bp10.h = null;
        bp11.w = Fr.I;
        bp10.W = uSa.E;
        bp10.G = uSa.E;
        bp10.e = uSa.E;
        bp9.q = uSa.E;
        bp9.j = uSa.E;
        bp9.I = null;
        bp8.l = uSa.E;
        bp8.f = null;
        bp8.H = vRa.d;
        bp7.B = null;
        bp7.a = new dQ(a2);
        bp7.s = b2;
        if (c2.hasXExpr()) {
            Bp bp15 = c2;
            bp5 = bp15;
            a2.d.J(RJ.f(a2, bp15.getXExpr()));
        } else {
            if (c2.hasX()) {
                a2.d.J(c2.getX());
            }
            bp5 = c2;
        }
        if (bp5.hasYExpr()) {
            Bp bp16 = c2;
            bp4 = bp16;
            a2.b.J(RJ.J(a2, bp16.getYExpr()));
        } else {
            if (c2.hasY()) {
                a2.b.J(c2.getY());
            }
            bp4 = c2;
        }
        if (bp4.hasRotateExpr()) {
            Bp bp17 = c2;
            bp3 = bp17;
            a2.C.J(RJ.f(a2, bp17.getRotateExpr()));
        } else {
            if (c2.hasRotate()) {
                a2.C.J(c2.getRotate());
            }
            bp3 = c2;
        }
        if (bp3.hasColor()) {
            a2.E = c2.getColor();
            a2.x.J(a2.E);
        }
        if (c2.hasScale()) {
            Bp bp18 = a2;
            bp2 = bp18;
            bp18.k.J(c2.getScale());
            bp18.J.J(c2.getScale());
        } else {
            Bp bp19;
            if (c2.hasScaleX()) {
                Bp bp20 = c2;
                bp19 = bp20;
                a2.k.J(bp20.getScaleX());
            } else {
                if (c2.hasScaleXExpr()) {
                    a2.k.J(RJ.f(a2, c2.getScaleXExpr()));
                }
                bp19 = c2;
            }
            if (bp19.hasScaleY()) {
                Bp bp21 = a2;
                bp2 = bp21;
                bp21.J.J(c2.getScaleY());
            } else {
                if (c2.hasScaleYExpr()) {
                    a2.J.J(RJ.J(a2, c2.getScaleYExpr()));
                }
                bp2 = a2;
            }
        }
        bp2.F += (long)c2.getDelay();
        long l2 = c2.hasDuration() ? c2.getDuration() : gQa.U;
        Bp bp22 = a2;
        bp22.i = bp22.F + l2;
        Bp bp23 = c2;
        bp22.L.J((XM)bp23, a2.x.M);
        if (bp23.hasPosition()) {
            a2.c = yG.fromProto(c2.getPosition(), null);
        }
        if (c2.hasAttachment()) {
            a2.v = new ml(c2.getAttachment());
        }
        if (c2.getTooltipCount() > 0) {
            a2.f = c2.getTooltipList().toArray(new String[uSa.E]);
            a2.j = vRa.d;
        }
        if (c2.hasTooltipDrawVanillaBackground()) {
            a2.H = c2.getTooltipDrawVanillaBackground();
        }
        if (c2.hasOnClick()) {
            Bp bp24 = a2;
            bp24.B = new SI(c2.getOnClick());
            bp24.j = vRa.d;
        }
        if (c2.hasVisibility()) {
            a2.w = new Fr(c2.getVisibility());
        }
        if (c2.hasHoverGroup()) {
            a2.I = Yg.J((k)b2, (String)c2.getHoverGroup());
            a2.I.J(a2);
            a2.j = vRa.d;
        }
        boolean bl = a2.j = c2.hasHoverable() ? c2.getHoverable() : a2.j;
        int n2 = c2.hasFloatPosition() ? (!c2.getFloatPosition() ? vRa.d : uSa.E) : (a2.M = a2.M);
        if (c2.hasBehavior()) {
            a2.J(c2.getBehavior());
        }
        if (a2.L.J.f) {
            c2 = a2.L.J;
            do {
                a2.m += (long)((SK)c2).k;
            } while ((c2 = ((SK)c2).e) != null && !((SK)c2).B);
        } else {
            a2.m = a2.L.J.k;
        }
        if (a2.v != null && a2.v.I && (c2 = b2.J(a2.v.A)) != null && a2.i > c2.i) {
            a2.i = c2.i;
        }
        Bp bp25 = a2;
        bp25.f(bp25.L.j, a2.F);
    }

    public k J() {
        Bp bp2 = this;
        Bp a2 = bp2.J();
        if (a2.s != null) {
            return a2.s;
        }
        if (a2 instanceof k) {
            return (k)a2;
        }
        return null;
    }

    @Override
    public void J() {
        Bp a2;
        if (a2.I != null) {
            a2.I.f(a2);
            a2.I = null;
        }
        super.J();
    }
}

