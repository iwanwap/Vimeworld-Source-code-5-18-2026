/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Bpa
 *  Cta
 *  DD
 *  Dpa
 *  EF
 *  EQa
 *  ERa
 *  Epa
 *  FPa
 *  Gf
 *  HE
 *  Ie
 *  JF
 *  JPa
 *  Kd
 *  Kpa
 *  Le
 *  Lf
 *  Lra
 *  MQa
 *  NOa
 *  NQa
 *  NTa
 *  Oqa
 *  PF
 *  PTa
 *  Qsa
 *  Spa
 *  Ssa
 *  TE
 *  VA
 *  VQa
 *  Ve
 *  Vua
 *  WSa
 *  Wd
 *  XTa
 *  Xoa
 *  Ypa
 *  ZRa
 *  aQa
 *  aSa
 *  ad
 *  cQa
 *  cra
 *  dQa
 *  fb
 *  hra
 *  if
 *  isa
 *  jRa
 *  kpa
 *  lPa
 *  lqa
 *  pB
 *  pqa
 *  qF
 *  qf
 *  sB
 *  uKa
 *  uRa
 *  vD
 *  vQa
 *  vRa
 *  vpa
 *  wI
 *  wPa
 *  wca
 *  wra
 *  xd
 *  yD
 *  yra
 *  ysa
 *  zD
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ExecutionError;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class WF {
    private static final LoadingCache<Integer, List<byte[]>> x;
    private static final DD v;
    private static final yD o;
    public static boolean h;
    private static final vD K;
    private static boolean H;
    private static vC c;
    private static String B;
    public static final Map<Integer, String> d;
    private static final Logger a;
    private static List<qF> b;
    private static int l;
    public static final Set<String> e;
    private static HE G;
    private static int D;
    private static int f;
    public static final List<String> F;
    public static final vC g;
    public static final Map<String, Boolean> L;
    private static final eF E;
    public static long m;
    private static String C;
    private static final TE i;
    private static final Ie M;
    private static long k;
    private static final fb j;
    public static final boolean J;
    private static final zD A;
    private static boolean I;

    public static boolean C() {
        return OT.i.B.hidePartyMenu;
    }

    public static void G() {
        WF.J().J(aSa.V, xSa.ca, sB.c);
        EF.J(null);
        Ve.f(uSa.E != 0);
        Wd.f(uSa.E != 0);
        VA.J(null);
    }

    public static boolean l() {
        return Objects.equals(B, Kpa.J().J().J());
    }

    public static boolean J(int a2) {
        if (VA.J() == null) {
            return uSa.E != 0;
        }
        if (a2 >= 0 && a2 <= vRa.d) {
            return uSa.E != 0;
        }
        OT.i.B.voiceChatKeyBind = a2 - ySa.T;
        VoiceChatConfiguration.J();
        VA.J(null);
        return vRa.d != 0;
    }

    public static String f() {
        return B;
    }

    public static void J(boolean a2) {
        if (OT.i.B.hidePartyMenu == a2) {
            return;
        }
        if (g.l()) {
            return;
        }
        OT.i.B.hidePartyMenu = a2;
        VoiceChatConfiguration.J();
        g.f(a2 ? aSa.V : oua.i, iSa.P, sB.N);
    }

    public static void J(byte[] a2) {
        OT.i.B.selectedMicrophone = a2;
        VoiceChatConfiguration.J();
        if (OT.i.l != null) {
            OT.i.l.J(a2);
        }
        A.J();
    }

    public static void J(HE a2) {
        Kpa.J().J().J((KC)new wca(a2.getCommand()));
    }

    public WF() {
        WF a2;
    }

    public static boolean J(char c2, int n2) {
        char b2 = (char)n2;
        char a2 = c2;
        if (VA.J() != null) {
            if (b2 == vRa.d) {
                VA.J(null);
                return vRa.d != 0;
            }
            if (!Character.isLetterOrDigit(a2) && !d.containsKey(b2)) {
                return vRa.d != 0;
            }
            OT.i.B.voiceChatKeyBind = b2;
            VoiceChatConfiguration.J();
            VA.J(null);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void D() {
        Kpa.J().J().J((KC)new wca(aQa.j));
    }

    static {
        J = Objects.equals(System.getProperty(MQa.U), oQa.l);
        a = LogManager.getLogger();
        x = CacheBuilder.newBuilder().expireAfterWrite(dQa.Ga, TimeUnit.MINUTES).build(new Lf());
        L = new HashMap<String, Boolean>();
        e = new HashSet<String>();
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = uRa.F;
        F = Arrays.asList(stringArray);
        B = null;
        G = null;
        b = new ArrayList<qF>();
        I = uSa.E;
        C = F.get(uSa.E);
        D = uSa.E;
        H = uSa.E;
        k = nqa.i;
        h = uSa.E;
        m = nqa.i;
        E = new eF(WOa.fa, osa.c, Oqa.COLUMN, NTa.C);
        j = new fb();
        A = new zD();
        v = new DD();
        o = new yD();
        M = new Ie();
        i = new TE();
        K = new vD();
        c = null;
        g = new vC(OT.i.B.hidePartyMenu ? aSa.V : oua.i);
        d = new HashMap<Integer, String>();
        d.put(cPa.Q, yra.t);
        d.put(FPa.F, VQa.ja);
        d.put(CRa.L, rua.Aa);
        d.put(wra.P, XTa.Z);
        d.put(Bpa.Z, WSa.f);
        d.put(iSa.x, vpa.H);
        d.put(ITa.E, dqa.X);
        d.put(Lra.e, XOa.D);
        d.put(lqa.s, Vua.m);
        d.put(uua.s, vTa.S);
        d.put(kra.U, Fua.E);
        d.put(Ypa.A, kpa.Fa);
        d.put(lQa.R, Bta.Ga);
        d.put(ITa.A, Ira.U);
        d.put(Epa.ja, Ira.U);
        d.put(cQa.i, BPa.L);
        d.put(GPa.C, BPa.L);
        d.put(Upa.D, uua.la);
        d.put(kTa.T, uua.la);
        d.put(xSa.r, Pua.C);
        d.put(Vra.u, vpa.A);
        d.put(Jsa.Ga, Cta.Z);
        d.put(nua.q, vua.Ea);
        d.put(kua.Ia, ysa.d);
        d.put(tSa.C, Jra.P);
        d.put(uqa.F, lQa.fa);
        d.put(lPa.p, vsa.M);
        d.put(Psa.M, AQa.m);
        d.put(tua.w, uua.Q);
        d.put(ITa.V, sSa.d);
        d.put(Ssa.u, kua.o);
        d.put(ysa.s, hQa.g);
        d.put(fPa.ga, NQa.n);
        d.put(SPa.T, VQa.Ha);
        d.put(Vra.b, nqa.Da);
        d.put(WPa.L, Ypa.g);
        d.put(Jqa.S, TOa.u);
        d.put(ZRa.D, FPa.E);
    }

    public static void A() {
        f = eq.m;
        l = eq.E;
        WF.J().J();
        g.J();
        qf.J().J(f, l);
        if ((double)WF.J() > aSa.V) {
            uKa.e();
            uKa.J((float)(csa.P + Fua.Y * WF.J()), (float)JPa.N, (float)JPa.N);
            K.J(f, l);
            uKa.J((float)(POa.k + g.J() * sqa.t), (float)JPa.N, (float)JPa.N);
            if ((double)g.J() > fPa.ca) {
                ad ad2;
                A.J(f, l);
                i.J(f, l);
                M.J(f, l);
                if (Ve.l()) {
                    v.J(f, l);
                }
                if (Wd.l()) {
                    o.J(f, l);
                }
                if ((ad2 = A.J()) instanceof Gf) {
                    String[] stringArray = ((Gf)ad2).J();
                    int n2 = f + yRa.d;
                    int n3 = l + yRa.d;
                    int n4 = ERa.T;
                    int n5 = WF.f() && WF.l() ? Bpa.Z : Vra.b;
                    Ii ii2 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
                    if.C((double)(n2 - yRa.d), (double)(n3 - yRa.d), (double)(n4 + uua.p), (double)(n5 + uua.p), (Color)Bc.q.transparent(WF.J() * Ora.D), (Kd)Kd.S);
                    double d2 = n3;
                    if.J((double)n2, (double)d2, (double)n4, (double)n5, (Color)Bc.Ja.transparent(WF.J()), (Color)Bc.Ga.transparent(WF.J()), (Kd)Kd.S);
                    int n6 = n3 += 10;
                    n3 += 14;
                    ii2.J(stringArray.getTitle(), n2 += 10, n6, Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
                    stringArray = stringArray.getDescription();
                    n4 = stringArray.length;
                    int n7 = n5 = uSa.E;
                    while (n7 < n4) {
                        String string = stringArray[n5];
                        int n8 = n3;
                        n3 += 10;
                        ii2.J(string, n2, n8, Bc.qa.transparent(WF.J()).getRGB(), uSa.E != 0);
                        n7 = ++n5;
                    }
                    n3 += 4;
                    if (WF.f() && !WF.l()) {
                        ii2.J(yta.l, n2, n3, Bc.ca.transparent(WF.J()).getRGB(), uSa.E != 0);
                    } else if (!WF.f()) {
                        ii2.J(mPa.Fa, n2, n3, Bc.ca.transparent(WF.J()).getRGB(), uSa.E != 0);
                    }
                }
            }
            uKa.D();
        }
        if (!I) {
            return;
        }
        if (WF.J().l() >= vQa.fa) {
            return;
        }
        if (e.isEmpty()) {
            return;
        }
        E.J(uSa.E, uSa.E);
        if (e.size() > tTa.h) {
            j.C(E.f() + E.l() + Wqa.m);
            int n9 = (int)(E.J() - j.J());
            j.l(E.C() + (double)Math.max(vRa.d, n9 / uqa.g));
            j.J(uSa.E, uSa.E);
        }
    }

    public static void M(String a2) {
        L.remove(a2);
    }

    public static List<String> l() {
        return F;
    }

    private static vC J() {
        if (c == null) {
            c = new vC();
        }
        return c;
    }

    public static void J(String string, boolean bl) {
        boolean b2 = bl;
        String a2 = string;
        if (a2 == null || !L.containsKey(a2)) {
            return;
        }
        L.put(a2, b2);
    }

    public static int J() {
        return D;
    }

    public static void i() {
        h = uSa.E;
        H = uSa.E;
        k = nqa.i;
    }

    public static String J() {
        return C;
    }

    public static void e(String a2) {
        C = a2;
    }

    public static float J() {
        return WF.J().J();
    }

    public static HE J() {
        return G;
    }

    public static void d(String a2) {
        Kpa.J().J().J((KC)new wca(new StringBuilder().insert(3 ^ 3, dQa.a).append(a2).toString()));
    }

    public static void M() {
        WF.J().J().J();
        h = vRa.d;
        m = System.currentTimeMillis();
        Kpa.J().J().J((KC)new wca(PTa.W));
    }

    public static void e() {
        E.f().clear();
        int n2 = uSa.E;
        Iterator<String> iterator = e.iterator();
        block0: while (true) {
            Iterator<String> iterator2 = iterator;
            while (iterator2.hasNext()) {
                String string = iterator.next();
                if (string.equals(Kpa.J().J().J())) {
                    iterator2 = iterator;
                    continue;
                }
                E.f((ad)new pB(string, null));
                if (++n2 < tTa.h) continue block0;
            }
            break;
        }
        int n3 = Math.max(uSa.E, e.size() - tTa.h);
        j.l(n3);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(int n2, int n3, int n4, boolean bl) {
        void a2;
        void c2;
        int d2 = n4;
        int b2 = n2;
        if (qf.J().J(b2, (int)c2, d2, (boolean)a2)) {
            return vRa.d != 0;
        }
        if (d2 == 0 && a2 == false) {
            EF.J(null);
        } else if (d2 == 0) {
            if (Ve.l() && v.f()) {
                v.J(b2, (int)c2, d2, (boolean)a2);
                return vRa.d != 0;
            }
            if (Wd.l() && o.f()) {
                o.J(b2, (int)c2, d2, (boolean)a2);
                return vRa.d != 0;
            }
            if (Ve.l() && !v.f()) {
                Ve.f(uSa.E != 0);
                return vRa.d != 0;
            }
            if (Wd.l() && !o.f()) {
                Wd.f(uSa.E != 0);
                return vRa.d != 0;
            }
            VA.J(null);
        }
        if (K.f()) {
            K.J(b2, (int)c2, d2, (boolean)a2);
            return vRa.d != 0;
        }
        if (A.f()) {
            A.J(b2, (int)c2, d2, (boolean)a2);
            return vRa.d != 0;
        }
        if (M.f()) {
            M.J(b2, (int)c2, d2, (boolean)a2);
            return vRa.d != 0;
        }
        if (i.f() && !WF.C()) {
            i.J(b2, (int)c2, d2, (boolean)a2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static List<qF> f() {
        return b;
    }

    public static boolean f() {
        return I;
    }

    public static zD J() {
        return A;
    }

    public static void d() {
        new Thread(xd.J()).start();
    }

    public static void C() {
        a.warn(isa.t);
        L.clear();
        e.clear();
        B = null;
        G = null;
        I = uSa.E;
        D = uSa.E;
        H = uSa.E;
        k = nqa.i;
        h = uSa.E;
        m = nqa.i;
        C = F.get(uSa.E);
        E.f().clear();
        j.l(uSa.E);
        A.J();
    }

    public static void C(String a2) {
        Kpa.J().J().J((KC)new wca(new StringBuilder().insert(3 & 4, zua.ja).append(a2).toString()));
    }

    public static void l() {
        WF.i();
        WF.J().J().J();
        Dpa dpa2 = OT.i.l;
        if (dpa2 != null && !dpa2.J) {
            dpa2.J().l();
            OT.i.l = null;
        }
    }

    public static void l(String a2) {
        if (!L.containsKey(a2)) {
            L.put(a2, uSa.E != 0);
        }
    }

    public static void f(String a2) {
        Kpa.J().J().J((KC)new wca(new StringBuilder().insert(5 >> 3, yOa.Aa).append(a2).toString()));
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, List<String> list, HE hE2, int n2, List<qF> list2) {
        void a2;
        void b2;
        void d2;
        Object e2 = hE2;
        String c2 = string;
        a.warn(new StringBuilder().insert(3 & 4, dqa.S).append(c2).append(Qsa.G).append(String.join((CharSequence)TOa.n, (Iterable<? extends CharSequence>)d2)).append(jRa.M).append(e2.name()).append(xra.P).append((int)b2).append(dua.Fa).append(a2.stream().map(JF.J()).collect(Collectors.joining(TOa.n))).toString());
        I = vRa.d;
        G = e2;
        B = c2;
        D = b2;
        b = new ArrayList<qF>((Collection<qF>)a2);
        e2 = d2.iterator();
        while (e2.hasNext()) {
            if ((String)e2.next() != null) continue;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = d2;
            a.warn(hra.Z, objectArray);
            return;
        }
        if (c2 == null) {
            a.warn(wPa.w);
            return;
        }
        e.clear();
        e.addAll((Collection<String>)d2);
        e.add(c2);
        WF.e();
        A.J();
    }

    public static boolean J() {
        return H;
    }

    public static void f() {
        h = uSa.E;
        H = vRa.d;
        if (k == nqa.i) {
            k = System.currentTimeMillis();
        }
    }

    public static void J(String a2) {
        Kpa.J().J().J((KC)new wca(new StringBuilder().insert(3 & 4, cra.R).append(a2).toString()));
    }

    public static /* synthetic */ void J() {
        block3: {
            try {
                Thread.sleep(XOa.g);
                if (Kpa.J().ta instanceof Xoa) break block3;
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        WF.J().J(oua.i, xSa.ca, sB.c);
    }

    public static List<byte[]> J() {
        try {
            return x.get(vRa.d);
        }
        catch (ExecutionError | ExecutionException throwable) {
            OT.b.error(Spa.la, throwable);
            return Collections.emptyList();
        }
    }

    public static long J() {
        return k;
    }

    public static byte[] J() {
        return OT.i.B.selectedMicrophone;
    }

    public static void J(Cda cda) {
        wI[] wIArray;
        int n2;
        Cda cda2 = cda;
        wI wI2 = new wI(cda2.J());
        if (!wI2.getBoolean(EQa.u)) {
            WF.C();
            return;
        }
        wI wI3 = wI2;
        wI wI4 = wI3.getMap(iSa.W);
        wI[] a2 = wI3.getMapArray(NOa.m);
        ArrayList<String> arrayList = new ArrayList<String>();
        wI[] wIArray2 = a2;
        int n3 = a2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            wIArray = wIArray2[n2];
            arrayList.add(wIArray.getString(dua.u));
            n4 = ++n2;
        }
        wI wI5 = wI2;
        wIArray2 = HE.valueOf((String)wI5.getString(NSa.f));
        n3 = wI5.getInt(QTa.Da);
        ArrayList<qF> arrayList2 = new ArrayList<qF>();
        wIArray = a2 = wI5.getMapArray(pqa.v);
        int n5 = wIArray.length;
        int n6 = a2 = uSa.E;
        while (n6 < n5) {
            wI wI6 = wIArray[a2];
            arrayList2.add(new qF(wI6.getString(dua.u), wI6.getLong(xra.d)));
            n6 = ++a2;
        }
        WF.J(wI4.getString(dua.u), arrayList, (HE)wIArray2, n3, arrayList2);
    }
}

