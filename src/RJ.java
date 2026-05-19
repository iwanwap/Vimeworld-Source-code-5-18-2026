/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AJ
 *  Aj
 *  Ama
 *  BJ
 *  CI
 *  DEa
 *  DG
 *  DK
 *  DQa
 *  EC
 *  EI
 *  FJ
 *  Fpa
 *  GI
 *  Gua
 *  HH
 *  HK
 *  HL
 *  Hk
 *  IK
 *  Ik
 *  JPa
 *  JQa
 *  Jj
 *  Jl
 *  Kpa
 *  LI
 *  LK
 *  LQa
 *  Lk
 *  Lra
 *  MJ
 *  MK
 *  NPa
 *  Ng
 *  OK
 *  Ok
 *  Oz
 *  PK
 *  Rj
 *  Rl
 *  SG
 *  SOa
 *  Sj
 *  TK
 *  TPa
 *  Ti
 *  Tj
 *  Tl
 *  Tpa
 *  Ui
 *  VG
 *  VI
 *  VQa
 *  Vk
 *  WG
 *  WSa
 *  Wsa
 *  Xsa
 *  YH
 *  YSa
 *  Yj
 *  Yk
 *  Ypa
 *  Yra
 *  Ysa
 *  ZOa
 *  Zj
 *  Zta
 *  Zua
 *  aG
 *  aI
 *  aJ
 *  al
 *  asa
 *  cQa
 *  ci
 *  cl
 *  dQa
 *  dk
 *  eJ
 *  eK
 *  fJ
 *  fh
 *  fi
 *  fk
 *  fpa
 *  hL
 *  hj
 *  hl
 *  iI
 *  iK
 *  ii
 *  isa
 *  jJ
 *  jL
 *  k
 *  kl
 *  lH
 *  lJ
 *  lh
 *  ll
 *  mI
 *  mJ
 *  mi
 *  mk
 *  nK
 *  nL
 *  nl
 *  oi
 *  ok
 *  ol
 *  pK
 *  pl
 *  pqa
 *  psa
 *  pua
 *  qi
 *  r
 *  rG
 *  rK
 *  rL
 *  rl
 *  sJ
 *  sl
 *  tl
 *  uK
 *  uOa
 *  vJ
 *  vRa
 *  vl
 *  wG
 *  wH
 *  wPa
 *  wh
 *  xh
 *  xj
 *  xk
 *  yK
 *  yQa
 *  zJ
 *  zK
 *  zj
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Supplier;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RJ
extends LI {
    public static final RJ M = new RJ();
    private final Random k;
    private Bp j;
    private boolean J;
    private final Map<String, Map<k, wG>> A;
    private final Map<Bp, Hh> I;

    public static /* synthetic */ float F(RJ a2) {
        return a2.j.s.f();
    }

    public static /* synthetic */ float k(RJ a2) {
        return a2.j.k.f();
    }

    public static /* synthetic */ b b() {
        return wH.J();
    }

    public static /* synthetic */ float G(RJ a2) {
        return a2.j.e();
    }

    public static Function<Bp, Bp> J(String a2) {
        if (a2.startsWith(WSa.f)) {
            return zJ.J();
        }
        if (!a2.contains(WSa.f)) {
            return fh.J((String)a2);
        }
        return Rg.J(RJ.J(a2));
    }

    public static /* synthetic */ float D(RJ a2) {
        return a2.j.C();
    }

    public static /* synthetic */ b k(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return rL.J(a2.J((String)b2));
    }

    public static /* synthetic */ float H() {
        EC eC2 = Kpa.J().ta;
        if (eC2 instanceof Ama) {
            return ((Ama)eC2).j;
        }
        return JPa.N;
    }

    public static /* synthetic */ wG J(k a2) {
        return new wG(null);
    }

    public static /* synthetic */ b G(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return yJ.J(a2.J((String)b2));
    }

    public static /* synthetic */ b D(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return vl.J(a2.J((String)b2));
    }

    public static /* synthetic */ b a() {
        return ci.J();
    }

    public static /* synthetic */ float g() {
        return hl.J((float)Kpa.J().c.X);
    }

    public static /* synthetic */ b j(b[] a2) {
        return MI.J(a2);
    }

    public static /* synthetic */ b k(RJ a2) {
        return mL.J(a2);
    }

    public static /* synthetic */ float I() {
        return (float)((double)(OT.e % Fpa.ga) / Tpa.M);
    }

    public static /* synthetic */ float j() {
        int n2 = eq.A.l();
        Kpa kpa2 = Kpa.J();
        int n3 = PRa.U;
        int n4 = n2;
        while (n4 < n3 && kpa2.t / (n2 + vRa.d) >= cQa.Z && kpa2.k / (n2 + vRa.d) >= YSa.c) {
            n4 = ++n2;
        }
        return n2;
    }

    private static r[] J(String string) {
        int n2;
        String string2 = string;
        String[] stringArray = string2.split(WSa.f);
        ArrayList a2 = new ArrayList();
        int n3 = stringArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            String string3 = stringArray[n2];
            if (string3.equals(xTa.O)) {
                a2.add(Aj.J());
            } else if (string3.equals(VQa.ja)) {
                a2.add(Ng.J());
            } else {
                a2.add(qi.J((String)string3));
            }
            n4 = ++n2;
        }
        return a2.toArray(new r[uSa.E]);
    }

    public static /* synthetic */ b F(b[] a2) {
        return xH.J(a2);
    }

    public static /* synthetic */ b k(b[] a2) {
        return new ii(a2[uSa.E], a2[vRa.d], a2.length > uqa.g ? a2[uqa.g] : null);
    }

    public static /* synthetic */ float A(RJ a2) {
        if (a2.j.W && OT.i.F.J(a2.j)) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ b H() {
        return ug.J();
    }

    public static /* synthetic */ Bp J(r[] rArray, Bp bp) {
        int n2;
        Object b2 = bp;
        r[] a2 = rArray;
        VI vI = new VI(null);
        VI.J((VI)vI, (Bp)b2);
        VI.J((VI)vI, (Object)b2.s);
        b2 = a2;
        int n3 = ((r[])b2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            VI vI2 = vI;
            b2[n2].J(vI2);
            if (VI.J((VI)vI2) == null) {
                return null;
            }
            n4 = ++n2;
        }
        return VI.J((VI)vI);
    }

    public static /* synthetic */ b G(RJ a2) {
        return AL.J(a2);
    }

    public static /* synthetic */ b D(RJ a2) {
        return LK.J((RJ)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ float J(RJ rJ, b[] bArray) {
        Object object;
        void a2;
        RJ rJ2;
        RJ rJ3 = rJ2 = rJ;
        Hh hh = rJ3.I.computeIfAbsent(rJ3.j, iK.J());
        Object b2 = hh.I.get(a2);
        if (b2 == null) {
            b2 = new Fh(null);
            void v1 = a2;
            new Fh(null).I = v1[uSa.E].J();
            if (((void)v1).length > vRa.d) {
                ((Fh)b2).A = a2[vRa.d].J();
            }
            hh.I.put(a2, (Fh)b2);
            object = b2;
        } else {
            float f2;
            if (((void)a2).length > vRa.d && (f2 = a2[vRa.d].J()) != ((Fh)b2).A) {
                Object object2 = b2;
                ((Fh)object2).I = a2[uSa.E].J();
                ((Fh)object2).A = f2;
            }
            object = b2;
        }
        return ((Fh)object).I;
    }

    public static /* synthetic */ float i(RJ a2) {
        return a2.j.l();
    }

    public static /* synthetic */ float G(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.C();
    }

    public static /* synthetic */ b g() {
        return YH.J();
    }

    /*
     * WARNING - void declaration
     */
    public List<DEa<String, b>> J(String string, boolean bl) {
        void b2;
        boolean c2 = bl;
        RJ a2 = this;
        a2.J = c2;
        return super.J((String)b2);
    }

    public static /* synthetic */ float F(b[] a2) {
        return Oz.J((float)a2[uSa.E].J());
    }

    public static /* synthetic */ float F() {
        return eq.A.l();
    }

    public static /* synthetic */ float D(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.d();
    }

    public static /* synthetic */ float k(b[] bArray) {
        int n2;
        b[] bArray2 = bArray;
        float a2 = bArray2[uSa.E].J();
        int n3 = n2 = vRa.d;
        while (n3 < bArray2.length) {
            b b2 = bArray2[n2];
            a2 = Math.max(a2, b2.J());
            n3 = ++n2;
        }
        return a2;
    }

    public static /* synthetic */ float k() {
        return (float)RKa.C;
    }

    public static /* synthetic */ b G(b[] a2) {
        return mJ.J((b[])a2);
    }

    public static /* synthetic */ float G() {
        return eq.f;
    }

    public static /* synthetic */ b I() {
        return Ti.J();
    }

    public static /* synthetic */ float G(b[] a2) {
        return Oz.J((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b j() {
        return EI.J();
    }

    public static /* synthetic */ b A(RJ a2) {
        return Hk.J((RJ)a2);
    }

    public static /* synthetic */ b A(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return TK.J(a2.J((String)b2));
    }

    public static /* synthetic */ float M(RJ a2) {
        return a2.j.J.f();
    }

    public static /* synthetic */ float A(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.e();
    }

    public static b f(Bp bp, String string) {
        String b2 = string;
        Bp a2 = bp;
        return RJ.J(a2, b2, vRa.d != 0);
    }

    public static /* synthetic */ b F() {
        return GI.J();
    }

    public static /* synthetic */ b i(RJ a2) {
        return tK.J(a2);
    }

    public static /* synthetic */ b f(RJ rJ, b[] bArray) {
        b[] b2 = bArray;
        RJ a2 = rJ;
        Random random = a2.k;
        random.getClass();
        return wh.J((Random)random);
    }

    public static /* synthetic */ b l(String a2) {
        return aI.J(Sp.valueOf((String)a2.toUpperCase()).clazz);
    }

    public static /* synthetic */ float D() {
        return eq.E;
    }

    public static /* synthetic */ b D(b[] a2) {
        return iI.J((b[])a2);
    }

    public static /* synthetic */ b A(b[] a2) {
        return rI.J(a2);
    }

    public static /* synthetic */ float D(b[] bArray) {
        int n2;
        b[] bArray2 = bArray;
        float a2 = bArray2[uSa.E].J();
        int n3 = n2 = vRa.d;
        while (n3 < bArray2.length) {
            b b2 = bArray2[n2];
            a2 = Math.min(a2, b2.J());
            n3 = ++n2;
        }
        return a2;
    }

    public static /* synthetic */ b i(b[] a2) {
        return oI.J(a2);
    }

    public static /* synthetic */ float A(b[] a2) {
        return Math.abs(a2[uSa.E].J());
    }

    public static /* synthetic */ float i(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.J().I + a2.C();
    }

    public static /* synthetic */ float A() {
        return eq.F;
    }

    public static /* synthetic */ float M(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.J().A;
    }

    /*
     * WARNING - void declaration
     */
    private Supplier<Bp> J(String string) {
        Object b2;
        void a2;
        RJ rJ = this;
        if (a2.startsWith(Iqa.L) && a2.endsWith(hpa.b)) {
            void v0 = a2;
            b2 = v0.substring(uua.p, v0.length() - vRa.d);
            return Jj.J((RJ)rJ, (String)b2);
        }
        b2 = RJ.J((String)a2);
        return oL.J(rJ, (Function)b2);
    }

    public static /* synthetic */ float i(b[] a2) {
        return Oz.d((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b k() {
        return CI.J();
    }

    public static /* synthetic */ b G() {
        return FJ.J();
    }

    public static /* synthetic */ b i(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return xk.J(a2.J((String)b2));
    }

    public static /* synthetic */ b M(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return ZJ.J(a2, (String)b2);
    }

    public static /* synthetic */ b D() {
        return aG.J();
    }

    public static /* synthetic */ float i() {
        return (float)RKa.f;
    }

    public static /* synthetic */ b M(b[] a2) {
        return yi.J(a2);
    }

    public static /* synthetic */ float J(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return a2.J((String)b2).J(a2.j);
    }

    public static /* synthetic */ b M(RJ a2) {
        return eJ.J((RJ)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static b J(Bp bp, String string, boolean bl) {
        void b2;
        void a2;
        Bp bp2 = bp;
        Object c2 = M;
        ((RJ)((Object)c2)).J = a2;
        if ((c2 = c2.J((String)b2)) instanceof fi) {
            return c2;
        }
        return new xh((String)b2, bp2, (b)c2, (boolean)a2);
    }

    public static /* synthetic */ b A() {
        return lh.J();
    }

    public static /* synthetic */ float M() {
        EC eC2 = Kpa.J().ta;
        if (eC2 instanceof Ama) {
            return ((Ama)eC2).e;
        }
        return JPa.N;
    }

    public static /* synthetic */ Map J(String a2) {
        return new HashMap();
    }

    public static /* synthetic */ float e() {
        EC eC2 = Kpa.J().ta;
        if (eC2 instanceof Ama) {
            return ((Ama)eC2).F;
        }
        return JPa.N;
    }

    public static /* synthetic */ void f(VI a2) {
        VI vI = a2;
        VI.J((VI)vI, (Object)VI.J((VI)vI));
    }

    public static /* synthetic */ b i() {
        return DG.J();
    }

    public static /* synthetic */ float d() {
        EC eC2 = Kpa.J().ta;
        if (eC2 instanceof Ama) {
            return ((Ama)eC2).v;
        }
        return JPa.N;
    }

    public static /* synthetic */ b e(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return Nk.J(a2.J((String)b2));
    }

    public static /* synthetic */ float e(Supplier a2) {
        if ((Bp)a2.get() == null) {
            return JPa.N;
        }
        return pqa.r;
    }

    public static /* synthetic */ float C() {
        return Kpa.J().c.K.J;
    }

    public static /* synthetic */ float l() {
        return (float)RKa.k;
    }

    public static /* synthetic */ float e(RJ a2) {
        return a2.j.s.J();
    }

    public static /* synthetic */ float d(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        if (a2.e || a2.q) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ float M(b[] a2) {
        return Oz.J((float)a2[vRa.d].J(), (float)a2[uSa.E].J(), (float)a2[uqa.g].J());
    }

    public static /* synthetic */ float C(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 != null && a2.W && OT.i.F.J(a2)) {
            return pqa.r;
        }
        return JPa.N;
    }

    private wG J(String string) {
        Object b2 = string;
        RJ a2 = this;
        return a2.A.computeIfAbsent((String)b2, Tj.J()).computeIfAbsent(a2.j.s, Ck.J());
    }

    public static /* synthetic */ float e(b[] a2) {
        return Oz.f((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b e(RJ a2) {
        return oi.J((RJ)a2);
    }

    public static /* synthetic */ b e(b[] a2) {
        return pH.J(a2);
    }

    public static /* synthetic */ float l(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.l();
    }

    public void J() {
        RJ a2;
        a2.A.clear();
        a2.j = null;
    }

    public static /* synthetic */ b e() {
        return mi.J();
    }

    public static /* synthetic */ Bp J(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return a2.J((String)b2).J(a2.j);
    }

    public static /* synthetic */ b d(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return Vk.J(a2.J((String)b2));
    }

    public static /* synthetic */ void J(String string, VI vI) {
        String b2 = vI;
        String a2 = string;
        if (VI.J((VI)b2) instanceof k) {
            String string2 = b2;
            VI.J((VI)string2, (Bp)((k)VI.J((VI)string2)).J(a2));
            String string3 = b2;
            VI.J((VI)string3, (Object)VI.J((VI)string3));
            return;
        }
        VI.J((VI)b2, null);
    }

    public static b J(Bp bp, String string) {
        String b2 = string;
        Bp a2 = bp;
        return RJ.J(a2, b2, uSa.E != 0);
    }

    public static /* synthetic */ b d() {
        return WG.J();
    }

    public static /* synthetic */ b d(RJ a2) {
        return nK.J((RJ)a2);
    }

    public static /* synthetic */ b C() {
        return new fi(pua.j);
    }

    public static /* synthetic */ float f() {
        if (Kpa.J().c.J().isEmpty()) {
            return JPa.N;
        }
        return pqa.r;
    }

    public static /* synthetic */ void J(VI a2) {
        if (VI.J((VI)a2) instanceof Bp) {
            VI vI = a2;
            VI.J((VI)vI, (Bp)((Bp)VI.J((VI)vI)));
            VI vI2 = a2;
            VI.J((VI)vI2, (Object)VI.J((VI)vI2).s);
            return;
        }
        VI.J((VI)a2, null);
    }

    public static /* synthetic */ b C(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return IK.J(a2.J((String)b2));
    }

    public static /* synthetic */ b l() {
        return rG.J();
    }

    public static /* synthetic */ float J(Class clazz) {
        Class clazz2 = clazz;
        Class a2 = Kpa.J().ta;
        if (a2 != null && a2.getClass() == clazz2) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ float d(RJ a2) {
        if (a2.j.e || a2.j.q) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ b l(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return xj.J(a2.J((String)b2));
    }

    public static /* synthetic */ float C(RJ rJ) {
        Bp bp;
        RJ rJ2 = rJ;
        float f2 = (float)eq.F - (float)Mouse.getY() * ((float)eq.F / (float)Kpa.J().k);
        float f3 = pqa.r;
        float a2 = JPa.N;
        Bp bp2 = bp = rJ2.j;
        while (bp2.s instanceof Bp) {
            Bp bp3 = bp = (Bp)bp.s;
            float f4 = bp3.J.f();
            f3 *= f4;
            if (bp3 != rJ2.j.s) {
                a2 *= f4;
            }
            a2 += bp.J().A;
            bp2 = bp;
        }
        return (f2 - a2) / f3;
    }

    public static /* synthetic */ b d(b[] a2) {
        return SG.J((b[])a2);
    }

    public static /* synthetic */ float d(b[] a2) {
        return (float)Math.pow(a2[uSa.E].J(), a2[vRa.d].J());
    }

    public static /* synthetic */ b C(RJ a2) {
        return nL.J((RJ)a2);
    }

    public static /* synthetic */ b l(RJ a2) {
        if (a2.J) {
            return NJ.J(a2);
        }
        return tj.J(a2);
    }

    public static /* synthetic */ b f(RJ a2) {
        return mI.J((RJ)a2);
    }

    public static /* synthetic */ b f(String a2) {
        return new HH(a2, null);
    }

    /*
     * WARNING - void declaration
     */
    public float J(b b2, Bp bp) {
        void a2;
        b c22 = b2;
        RJ b3 = this;
        Bp bp2 = b3.j;
        b3.j = a2;
        float c22 = c22.J();
        b3.j = bp2;
        return c22;
    }

    public static /* synthetic */ float C(b[] a2) {
        return Oz.C((float)a2[uSa.E].J());
    }

    public static /* synthetic */ Bp J(Bp a2) {
        return null;
    }

    public static /* synthetic */ float l(RJ a2) {
        return (float)((double)(OT.e - a2.j.F) / Tpa.M);
    }

    public static /* synthetic */ b f(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return aJ.J(a2.J((String)b2));
    }

    public static /* synthetic */ b J(RJ a2) {
        return PK.J((RJ)a2);
    }

    public static /* synthetic */ Bp J(String string, Bp bp) {
        Bp b2 = bp;
        String a2 = string;
        return b2.s.J(a2);
    }

    public static /* synthetic */ b f() {
        return Ui.J();
    }

    public static /* synthetic */ b J(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return Zj.J(a2.J((String)b2));
    }

    private RJ() {
        RJ a2;
        RJ rJ = a2;
        RJ rJ2 = a2;
        rJ.k = new Random();
        rJ2.A = new HashMap<String, Map<k, wG>>();
        rJ.I = new WeakHashMap<Bp, Hh>();
        rJ.J(pK.J((RJ)rJ));
        rJ.J(Zqa.q, zj.J((RJ)a2));
        rJ.J(opa.h, Yk.J((RJ)a2));
        rJ.J(yQa.s, tl.J((RJ)a2));
        rJ.J(TPa.d, wL.J(a2));
        rJ.J(LQa.da, zK.J((RJ)a2));
        rJ.J(LPa.ca, Lh.J(a2));
        rJ.J(tSa.v, lH.J((RJ)a2));
        rJ.J(LPa.Ha, Xg.J(a2));
        rJ.J(eua.Z, ok.J((RJ)a2));
        rJ.J(vsa.G, HK.J());
        rJ.J(DQa.F, hL.J());
        rJ.J(rRa.X, nl.J((RJ)a2));
        rJ.J(uOa.Ja, rl.J((RJ)a2));
        rJ.J(Zqa.q, Ik.J((RJ)a2));
        rJ.J(opa.h, jL.J((RJ)a2));
        rJ.J(UTa.l, Lk.J((RJ)a2));
        rJ.J(SOa.v, hj.J((RJ)a2));
        rJ.J(yQa.s, Mj.J(a2));
        rJ.J(TPa.d, sJ.J((RJ)a2));
        rJ.J(ZOa.z, sl.J((RJ)a2));
        rJ.J(LPa.Ha, aK.J(a2));
        rJ.J(eua.Z, Tl.J((RJ)a2));
        rJ.J(Ysa.P, FL.J(a2));
        rJ.J(nqa.J, Yj.J());
        rJ.f(asa.j, eK.J((RJ)a2));
        rJ.f(cQa.Aa, kl.J());
        rJ.f(kua.A, mk.J());
        rJ.f(JQa.D, Jk.J());
        rJ.f(BQa.C, fJ.J());
        rJ.f(Yra.l, kk.J());
        rJ.f(ypa.r, al.J());
        rJ.f(nqa.U, Vj.J());
        rJ.f(Bua.r, lJ.J());
        rJ.f(fpa.s, OK.J());
        rJ.f(PQa.S, dk.J());
        rJ.f(XOa.J, cl.J());
        rJ.f(fqa.la, fk.J());
        rJ.f(iSa.Y, ol.J((RJ)a2));
        rJ.J(xqa.F, HL.J());
        rJ.J(Xsa.m, BJ.J());
        rJ.J(Ypa.Fa, Rj.J());
        rJ.J(Lra.Fa, Sj.J());
        rJ.J(Nra.ca, pl.J());
        rJ.f(NPa.C, uK.J());
        rJ.J(Wsa.C, ll.J());
        rJ.J(dQa.k, Ok.J());
        rJ.J(psa.n, vJ.J());
        rJ.J(Gua.fa, AJ.J());
        rJ.J(Zta.F, DK.J());
        rJ.J(osa.fa, jJ.J());
        rJ.J(wPa.V, MK.J());
        rJ.J(Hta.Ka, Rl.J());
        rJ.J(vRa.ha, pJ.J());
        rJ.J(isa.y, BK.J());
        rJ.J(Era.I, RK.J());
        rJ.J(CRa.t, MJ.J((RJ)a2));
        rJ.J(Zua.Ka, Jl.J((RJ)a2));
        rJ.J(Jsa.h, yK.J());
    }

    public static /* synthetic */ b C(b[] a2) {
        return rK.J((b[])a2);
    }

    public static /* synthetic */ float l(b[] a2) {
        return a2[uSa.E].J() % a2[vRa.d].J();
    }

    public static /* synthetic */ b J(RJ rJ, b[] bArray) {
        b[] b2 = bArray;
        RJ a2 = rJ;
        return XJ.J(a2, b2);
    }

    public static /* synthetic */ b l(b[] a2) {
        return VG.J((b[])a2);
    }

    public static /* synthetic */ float f(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.J().A + a2.l();
    }

    public static /* synthetic */ b J() {
        return aH.J();
    }

    public static /* synthetic */ b f(b[] a2) {
        return nG.J(a2);
    }

    public static /* synthetic */ float J(Supplier supplier) {
        Supplier supplier2 = supplier;
        Bp a2 = (Bp)supplier2.get();
        if (a2 == null) {
            return JPa.N;
        }
        return a2.J().I;
    }

    public static /* synthetic */ float J() {
        return eq.m;
    }

    public static /* synthetic */ float f(b[] bArray) {
        b[] bArray2 = bArray;
        float f2 = bArray2[uSa.E].J();
        float f3 = bArray2[vRa.d].J();
        float f4 = (float)Kpa.J().c.la;
        float a2 = (float)Kpa.J().c.A;
        return hl.J((float)((float)Math.toDegrees(Math.atan2(f3 - a2, f2 - f4))));
    }

    public static /* synthetic */ float f(RJ a2) {
        return a2.j.d();
    }

    public static /* synthetic */ float J(RJ rJ) {
        Bp bp;
        RJ rJ2 = rJ;
        float f2 = (float)Mouse.getX() * ((float)eq.f / (float)Kpa.J().t);
        float f3 = pqa.r;
        float a2 = JPa.N;
        Bp bp2 = bp = rJ2.j;
        while (bp2.s instanceof Bp) {
            Bp bp3 = bp = (Bp)bp.s;
            float f4 = bp3.k.f();
            f3 *= f4;
            if (bp3 != rJ2.j.s) {
                a2 *= f4;
            }
            a2 += bp.J().I;
            bp2 = bp;
        }
        return (f2 - a2) / f3;
    }

    public static /* synthetic */ Hh J(Bp a2) {
        return new Hh(null);
    }

    public static /* synthetic */ Bp J(RJ rJ, Function function) {
        Function b2 = function;
        RJ a2 = rJ;
        return (Bp)b2.apply(a2.j);
    }
}

