/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  LQa
 *  MQa
 *  Spa
 *  Xsa
 *  Ypa
 *  Zp
 *  fpa
 *  hTa
 *  pqa
 *  pua
 *  vRa
 *  xOa
 *  ysa
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mp_3 {
    public static final int T = 61457;
    public static final int p = 61455;
    public static final int n = 61442;
    public static final int s = 61446;
    public static final int w = 61460;
    public static final int W = 61468;
    public static final int q = 61470;
    public static final int x = 61451;
    public static final int v = 61466;
    public static final int o = 61469;
    public static final int h = 61465;
    public static final int K = -100;
    public static final int H = 61441;
    public static final int c = 61453;
    private static final Map<Integer, mIa> B = new HashMap<Integer, mIa>();
    private static final Map<mIa, Integer> d = new HashMap<mIa, Integer>();
    public static final int a = -98;
    public static final int b = 61459;
    public static final int l = 61450;
    public static final int e = 61456;
    public static final int G = 61458;
    public static final int D = 61445;
    public static final int f = 61443;
    public static final int F = 61444;
    public static final int g = 61461;
    public static final int L = 61454;
    public static final int E = 61449;
    public static final int m = 61462;
    public static final int C = 61471;
    public static final int i = 61447;
    public static final int M = 61464;
    public static final int k = 61448;
    public static final int j = -99;
    public static final int J = 61463;
    public static final int A = 61452;
    public static final int I = 61467;

    public static int J(int n2) {
        int n3 = n2;
        mIa a2 = mIa.hash.J(n3);
        if (a2 == null) {
            return pua.o;
        }
        return d.getOrDefault(a2, pua.o);
    }

    public static /* synthetic */ void J(Integer n2, mIa mIa2) {
        Comparable<Integer> b2 = mIa2;
        Integer a2 = n2;
        d.put((mIa)b2, a2);
    }

    public mp_3() {
        mp_3 a2;
    }

    public static mIa J(int a2) {
        return B.get(a2);
    }

    public static void J(Kpa kpa2) {
        Kpa kpa3 = kpa2;
        Kpa a2 = kpa3.z;
        B.put(fpa.n, a2.jb);
        B.put(EPa.Y, a2.L);
        B.put(ysa.h, a2.JA);
        B.put(pqa.b, a2.gd);
        B.put(hTa.P, a2.ta);
        B.put(Ura.a, a2.ia);
        B.put(Spa.H, a2.CB);
        B.put(aua.Z, a2.xc);
        B.put(Ypa.X, a2.pA);
        B.put(MQa.g, a2.ub);
        B.put(Fsa.fa, a2.H);
        B.put(vRa.ba, a2.I);
        B.put(aua.Aa, a2.q);
        B.put(sOa.y, a2.Wc);
        B.put(LQa.R, a2.v);
        B.put(NSa.v, a2.Sb);
        B.put(Asa.fa, a2.Gb);
        B.put(sOa.i, a2.m);
        B.put(kTa.b, a2.kd);
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < WOa.fa) {
            B.put(rpa.m + n2, a2.Ga[n2++]);
            n3 = n2;
        }
        B.put(Qra.Q, a2.Ja);
        B.put(Xsa.D, a2.yb);
        B.put(xOa.x, a2.WB);
        B.forEach(Zp.J());
    }
}

