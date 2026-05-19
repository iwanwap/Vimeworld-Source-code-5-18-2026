/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Bsa
 *  CDa
 *  Cfa
 *  Cga
 *  Cta
 *  DDa
 *  Dfa
 *  Dga
 *  EDa
 *  ERa
 *  Epa
 *  FEa
 *  FPa
 *  Fpa
 *  GDa
 *  Gg
 *  HFa
 *  ISa
 *  Iea
 *  JQa
 *  JSa
 *  JTa
 *  LQa
 *  Lra
 *  MEa
 *  NQa
 *  NTa
 *  Nia
 *  ODa
 *  Oea
 *  Ppa
 *  Pqa
 *  QSa
 *  RGa
 *  RPa
 *  Rda
 *  Rea
 *  SOa
 *  Sqa
 *  Ssa
 *  TDa
 *  TQa
 *  UEa
 *  Uta
 *  VQa
 *  Vua
 *  WEa
 *  WFa
 *  WQa
 *  WSa
 *  Waa
 *  Wda
 *  XTa
 *  Yda
 *  Yfa
 *  Ypa
 *  Yra
 *  ZFa
 *  ZOa
 *  Zpa
 *  Zta
 *  aea
 *  afa
 *  aga
 *  aqa
 *  bpa
 *  bua
 *  cEa
 *  cQa
 *  cRa
 *  cfa
 *  cga
 *  dQa
 *  dpa
 *  ega
 *  fsa
 *  gea
 *  hqa
 *  iPa
 *  isa
 *  jFa
 *  jRa
 *  jea
 *  kDa
 *  kPa
 *  lEa
 *  lPa
 *  lqa
 *  mEa
 *  mFa
 *  nFa
 *  nQa
 *  nda
 *  pDa
 *  pPa
 *  pQa
 *  pqa
 *  sFa
 *  tDa
 *  uOa
 *  uda
 *  ura
 *  vL
 *  vQa
 *  vRa
 *  vea
 *  vpa
 *  wOa
 *  wra
 *  xDa
 *  xfa
 *  yra
 *  ysa
 *  zEa
 *  zTa
 *  zda
 *  zfa
 *  zsa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PIa_2 {
    private static final Map<Integer, Class<? extends vL>> i;
    private static final Map<Class<? extends vL>, Integer> M;
    public static final Map<Integer, oia> k;
    private static final Map<Class<? extends vL>, String> j;
    private static final Map<String, Integer> J;
    private static final Logger A;
    private static final Map<String, Class<? extends vL>> I;

    /*
     * WARNING - void declaration
     */
    private static void J(Class<? extends vL> clazz, String string, int n2) {
        void b2;
        int c2 = n2;
        Class<? extends vL> a2 = clazz;
        if (I.containsKey(b2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, Ypa.w).append((String)b2).toString());
        }
        if (i.containsKey(c2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, Ypa.w).append(c2).toString());
        }
        if (c2 == 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, Pqa.K).append(c2).toString());
        }
        if (a2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, wsa.U).append(c2).toString());
        }
        I.put((String)b2, a2);
        j.put(a2, (String)b2);
        i.put(c2, a2);
        M.put(a2, c2);
        J.put((String)b2, c2);
    }

    public static String J(vL a2) {
        return j.get(a2.getClass());
    }

    public PIa_2() {
        PIa_2 a2;
    }

    public static List<String> J() {
        Set<String> set = I.keySet();
        ArrayList<String> arrayList = Lists.newArrayList();
        for (String string : set) {
            if ((I.get(string).getModifiers() & ura.V) == ura.V) continue;
            arrayList.add(string);
        }
        ArrayList<String> arrayList2 = arrayList;
        arrayList2.add(NQa.U);
        return arrayList2;
    }

    /*
     * WARNING - void declaration
     */
    public static vL J(int n2, Gg gg2) {
        int n3 = n2;
        vL vL2 = null;
        try {
            Class<? extends vL> b2 = PIa_2.J(n3);
            if (b2 != null) {
                void a2;
                Class[] classArray = new Class[vRa.d];
                classArray[uSa.E] = Gg.class;
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2;
                vL2 = b2.getConstructor(classArray).newInstance(objectArray);
            }
        }
        catch (Exception b2) {
            b2.printStackTrace();
        }
        if (vL2 == null) {
            A.warn(new StringBuilder().insert(2 & 5, UTa.M).append(n3).toString());
        }
        return vL2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Class<? extends vL> clazz, String string, int n2, int n3, int n4) {
        void a2;
        void b2;
        void d2;
        int e2 = n2;
        Class<? extends vL> c2 = clazz;
        PIa_2.J(c2, (String)d2, e2);
        k.put(e2, new oia(e2, (int)b2, (int)a2));
    }

    public static void J() {
    }

    public static int J(String string) {
        String string2 = string;
        Integer a2 = J.get(string2);
        if (a2 == null) {
            return Jsa.ha;
        }
        return a2;
    }

    public static int J(vL vL2) {
        vL vL3 = vL2;
        Integer a2 = M.get(vL3.getClass());
        if (a2 == null) {
            return uSa.E;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static vL J(Waa waa2, Gg gg2) {
        Waa waa3 = waa2;
        Waa b2 = null;
        if (zpa.P.equals(waa3.J(QTa.O))) {
            Waa waa4 = waa3;
            waa4.J(QTa.O, Rda.byNetworkID((int)waa4.J(JTa.Ga)).getName());
            waa4.J(JTa.Ga);
        }
        try {
            Class<? extends vL> clazz = I.get(waa3.J(QTa.O));
            if (clazz != null) {
                void a2;
                Class[] classArray = new Class[vRa.d];
                classArray[uSa.E] = Gg.class;
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2;
                b2 = clazz.getConstructor(classArray).newInstance(objectArray);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (b2 != null) {
            Waa waa5 = b2;
            waa5.l(waa3);
            return waa5;
        }
        A.warn(new StringBuilder().insert(3 & 4, UTa.M).append(waa3.J(QTa.O)).toString());
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static vL J(String string, Gg gg2) {
        String string2 = string;
        vL vL2 = null;
        try {
            Class<? extends vL> b2 = I.get(string2);
            if (b2 != null) {
                void a2;
                Class[] classArray = new Class[vRa.d];
                classArray[uSa.E] = Gg.class;
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2;
                vL2 = (vL)b2.getConstructor(classArray).newInstance(objectArray);
            }
        }
        catch (Exception b2) {
            b2.printStackTrace();
        }
        return vL2;
    }

    static {
        A = LogManager.getLogger();
        I = Maps.newHashMap();
        j = Maps.newHashMap();
        i = Maps.newHashMap();
        M = Maps.newHashMap();
        J = Maps.newHashMap();
        k = Maps.newLinkedHashMap();
        PIa_2.J(jFa.class, zOa.Ha, vRa.d);
        PIa_2.J(zEa.class, TOa.j, uqa.g);
        PIa_2.J(WEa.class, NTa.ja, XTa.W);
        PIa_2.J(Nia.class, hqa.H, Yqa.i);
        PIa_2.J(WFa.class, Yra.A, WOa.fa);
        PIa_2.J(jea.class, Sqa.r, NTa.C);
        PIa_2.J(Pda.class, ERa.u, pPa.f);
        PIa_2.J(xDa.class, xua.ja, lqa.s);
        PIa_2.J(ZDa.class, sqa.l, uua.s);
        PIa_2.J(Dfa.class, Epa.q, hpa.Z);
        PIa_2.J(tDa.class, NSa.g, Ypa.A);
        PIa_2.J(kDa.class, Bsa.V, ERa.C);
        PIa_2.J(CDa.class, Ata.T, yta.Ka);
        PIa_2.J(FEa.class, SOa.e, yOa.B);
        PIa_2.J(afa.class, STa.d, wOa.t);
        PIa_2.J(vFa.class, lTa.M, kTa.j);
        PIa_2.J(aga.class, Vua.p, wOa.h);
        PIa_2.J(gea.class, oQa.X, cQa.o);
        PIa_2.J(Oea.class, JQa.e, Fsa.d);
        PIa_2.J(Wda.class, dsa.s, kra.U);
        PIa_2.J(ZEa.class, Rda.RIDEABLE.getName(), cQa.i);
        PIa_2.J(EDa.class, Rda.CHEST.getName(), iSa.x);
        PIa_2.J(yda.class, Rda.FURNACE.getName(), Yqa.D);
        PIa_2.J(Cga.class, Rda.TNT.getName(), wra.e);
        PIa_2.J(Cfa.class, Rda.HOPPER.getName(), Bpa.Ha);
        PIa_2.J(rEa.class, Rda.SPAWNER.getName(), uOa.F);
        PIa_2.J(RGa.class, Rda.COMMAND_BLOCK.getName(), wra.P);
        PIa_2.J(Yfa.class, Zta.ia, QSa.p);
        PIa_2.J(hFa.class, fsa.C, jRa.q);
        PIa_2.J(zfa.class, XTa.y, vpa.o, VPa.Y, uSa.E);
        PIa_2.J(lEa.class, cRa.S, cPa.Q, isa.Q, zsa.x);
        PIa_2.J(Dga.class, Vra.ja, FPa.F, AQa.fa, lTa.l);
        PIa_2.J(UEa.class, eta.I, Bpa.Z);
        PIa_2.J(nda.class, VQa.E, GPa.C, FRa.u, zsa.Y);
        PIa_2.J(cga.class, zpa.E, Fpa.ca, bsa.ca, LQa.h);
        PIa_2.J(Yda.class, Qpa.u, Upa.D, bsa.m, XOa.ca);
        PIa_2.J(MEa.class, rQa.H, KSa.x, Uta.P, yta.G);
        PIa_2.J(vea.class, ySa.V, lQa.R, Upa.l, uSa.E);
        PIa_2.J(aea.class, gua.K, lPa.p, Bra.Ga, lTa.l);
        PIa_2.J(qda.class, kra.n, Psa.M, nQa.v, Upa.B);
        PIa_2.J(Zfa.class, Mqa.Ja, tua.w, ISa.h, sOa.Aa);
        PIa_2.J(ega.class, Ypa.ca, ITa.V, fta.Ja, Epa.Ia);
        PIa_2.J(pDa.class, Upa.Ja, Ssa.u);
        PIa_2.J(IDa.class, vTa.B, ysa.s);
        PIa_2.J(mEa.class, NTa.i, fPa.ga, aqa.Z, uOa.f);
        PIa_2.J(nFa.class, Lra.i, SPa.T, fta.Ja, bsa.ca);
        PIa_2.J(uda.class, Jta.y, Vra.b, Upa.l, nQa.v);
        PIa_2.J(GDa.class, Ppa.T, WPa.L, MTa.l, pQa.H);
        PIa_2.J(zda.class, Zpa.B, Jsa.ha, uOa.Z, TQa.ja);
        PIa_2.J(ZFa.class, dQa.Ma, rRa.R, vQa.d, JSa.V);
        PIa_2.J(aDa.class, ZOa.q, iSa.ca, uOa.P, NSa.la);
        PIa_2.J(aEa.class, rta.L, fPa.t, NSa.la, Zqa.E);
        PIa_2.J(HFa.class, Nra.d, bpa.I, cRa.H, RPa.S);
        PIa_2.J(xfa.class, kPa.p, pqa.ga, NTa.I, yra.O);
        PIa_2.J(TDa.class, qsa.g, zua.m, iPa.p, Cta.Ha);
        PIa_2.J(Iea.class, vua.p, Hta.k);
        PIa_2.J(ODa.class, Vra.la, dpa.A, tTa.Ga, dqa.ga);
        PIa_2.J(DDa.class, gsa.p, zOa.v);
        PIa_2.J(Rea.class, fqa.S, ySa.T, uqa.E, zOa.m);
        PIa_2.J(cfa.class, WQa.g, zTa.C, bua.u, vTa.Q);
        PIa_2.J(mFa.class, cTa.v, sOa.D, XOa.e, Bta.v);
        PIa_2.J(sFa.class, WSa.G, ZOa.x);
    }

    public static String J(int a2) {
        return j.get(PIa_2.J(a2));
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(vL vL2, String string) {
        void v0;
        void a2;
        vL vL3 = vL2;
        Object b2 = PIa_2.J(vL3);
        if (b2 == null && vL3 instanceof Sx) {
            b2 = hqa.Ha;
            v0 = a2;
        } else {
            if (b2 == null && vL3 instanceof cEa) {
                b2 = NQa.U;
            }
            v0 = a2;
        }
        return v0.equals(b2);
    }

    public static boolean J(String a2) {
        if (hqa.Ha.equals(a2) || PIa_2.J().contains(a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Class<? extends vL> J(int a2) {
        return i.get(a2);
    }
}

