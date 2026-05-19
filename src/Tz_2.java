/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  CZ
 *  Cta
 *  EQa
 *  JPa
 *  Lqa
 *  MQa
 *  Mda
 *  NQa
 *  NTa
 *  PIa
 *  PTa
 *  QFa
 *  Qsa
 *  Rua
 *  TPa
 *  Taa
 *  Usa
 *  WSa
 *  Wsa
 *  Wy
 *  XTa
 *  ZRa
 *  aX
 *  bAa
 *  bRa
 *  bSa
 *  cQa
 *  cra
 *  dQa
 *  dpa
 *  eAa
 *  kPa
 *  lX
 *  ld
 *  vRa
 *  vpa
 *  wOa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public final class Tz_2 {
    public static aX Ha;
    public static aX Ga;
    public static aX fa;
    public static List<lX> Ka;
    public static List<aX> Aa;
    public static aX S;
    public static aX Z;
    public static aX Y;
    public static aX r;
    public static List<aX> V;
    public static aX z;
    public static aX X;
    public static aX y;
    public static aX U;
    public static aX P;
    public static aX u;
    public static aX O;
    public static aX t;
    public static aX R;
    public static aX Q;
    public static aX N;
    public static aX T;
    public static aX p;
    public static aX n;
    public static aX s;
    public static aX w;
    public static aX W;
    public static aX q;
    public static aX x;
    public static List<lX> v;
    public static Map<String, aX> o;
    public static aX h;
    public static aX K;
    public static final aX[] H;
    public static final aX[] c;
    public static aX B;
    public static aX d;
    public static final aX[] a;
    public static aX b;
    public static final aX[] l;
    public static aX e;
    public static aX G;
    public static aX D;
    public static aX f;
    public static aX F;
    public static aX g;
    public static aX L;
    public static aX E;
    public static aX m;
    public static aX C;
    public static aX i;
    public static aX M;
    public static aX k;
    public static aX j;
    public static aX J;
    public static aX A;
    public static aX I;

    private static void d() {
        Iterator iterator = Block.blockRegistry.iterator();
        while (iterator.hasNext()) {
            Block block = (Block)iterator.next();
            eAa eAa2 = eAa.J((Block)block);
            if (eAa2 == null) continue;
            int n2 = Block.J(block);
            String string = Tz_2.J(eAa2);
            if (string == null || !block.I()) continue;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new Mda(block).J();
            Tz_2.a[n2] = new lX(XTa.L, string, (ld)new CZ(Jta.h, objectArray), eAa2).J();
            Ka.add((lX)a[n2]);
        }
        Tz_2.J(a);
    }

    public Tz_2() {
        Tz_2 a2;
    }

    private static void C() {
        for (eAa eAa2 : eAa.C) {
            if (eAa2 == null) continue;
            eAa eAa3 = eAa2;
            int n2 = eAa.J((eAa)eAa3);
            String string = Tz_2.J(eAa3);
            if (string == null || !eAa2.C()) continue;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new Mda(eAa2).J();
            Tz_2.l[n2] = new lX(dpa.d, string, (ld)new CZ(sOa.a, objectArray), eAa2).J();
        }
        Tz_2.J(l);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(aX[] aXArray, Block block, Block block2) {
        void a22;
        Object c22 = block;
        aX[] b2 = aXArray;
        int c22 = Block.J((Block)c22);
        int a22 = Block.J((Block)a22);
        if (b2[c22] != null && b2[a22] == null) {
            b2[a22] = b2[c22];
            return;
        }
        Aa.remove(b2[c22]);
        Ka.remove(b2[c22]);
        V.remove(b2[c22]);
        b2[c22] = b2[a22];
    }

    public static aX f(oia oia2) {
        oia oia3 = oia2;
        String a2 = PIa.J((int)oia3.j);
        if (a2 == null) {
            return null;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = new CZ(new StringBuilder().insert(3 ^ 3, Lqa.H).append(a2).append(tpa.N).toString(), new Object[uSa.E]);
        return new aX(new StringBuilder().insert(3 >> 2, TOa.K).append(a2).toString(), (ld)new CZ(Cta.E, objectArray)).J();
    }

    public static aX J(oia oia2) {
        oia oia3 = oia2;
        String a2 = PIa.J((int)oia3.j);
        if (a2 == null) {
            return null;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = new CZ(new StringBuilder().insert(5 >> 3, Lqa.H).append(a2).append(tpa.N).toString(), new Object[uSa.E]);
        return new aX(new StringBuilder().insert(3 & 4, cra.Ka).append(a2).toString(), (ld)new CZ(aua.Y, objectArray)).J();
    }

    public static void l() {
        Tz_2.d();
        Tz_2.f();
        Tz_2.C();
        Tz_2.J();
        mY.J();
        PIa.J();
    }

    private static void f() {
        for (eAa eAa2 : eAa.C) {
            if (eAa2 == null) continue;
            eAa eAa3 = eAa2;
            int n2 = eAa.J((eAa)eAa3);
            String string = Tz_2.J(eAa3);
            if (string == null) continue;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new Mda(eAa2).J();
            Tz_2.H[n2] = new lX(Nta.U, string, (ld)new CZ(APa.s, objectArray), eAa2).J();
            if (eAa2 instanceof kda) continue;
            v.add((lX)H[n2]);
        }
        Tz_2.J(H);
    }

    private static String J(eAa eAa2) {
        eAa eAa3 = eAa2;
        ResourceLocation a2 = (ResourceLocation)eAa.C.f((Object)eAa3);
        if (a2 != null) {
            return a2.toString().replace((char)lQa.R, (char)Bpa.Ha);
        }
        return null;
    }

    private static void J() {
        HashSet<eAa> hashSet = Sets.newHashSet();
        for (UB uB : bAa.J().J()) {
            if (uB.J() == null) continue;
            hashSet.add(uB.J().J());
        }
        Iterator<Object> iterator = Taa.J().J().values().iterator();
        Iterator<Object> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Mda mda2 = (Mda)iterator.next();
            iterator2 = iterator;
            hashSet.add(mda2.J());
        }
        for (eAa eAa2 : hashSet) {
            if (eAa2 == null) continue;
            eAa eAa3 = eAa2;
            int n2 = eAa.J((eAa)eAa3);
            String string = Tz_2.J(eAa3);
            if (string == null) continue;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new Mda(eAa2).J();
            Tz_2.c[n2] = new lX(qsa.Aa, string, (ld)new CZ(dQa.q, objectArray), eAa2).J();
        }
        Tz_2.J(c);
    }

    static {
        o = Maps.newHashMap();
        Aa = Lists.newArrayList();
        V = Lists.newArrayList();
        v = Lists.newArrayList();
        Ka = Lists.newArrayList();
        C = new Wy(bRa.H, (ld)new CZ(bRa.H, new Object[uSa.E])).f().J();
        h = new Wy(WSa.F, (ld)new CZ(WSa.F, new Object[uSa.E]), aX.timeStatType).f().J();
        Y = new Wy(Lsa.Fa, (ld)new CZ(Lsa.Fa, new Object[uSa.E]), aX.timeStatType).f().J();
        e = new Wy(rua.d, (ld)new CZ(rua.d, new Object[uSa.E]), aX.distanceStatType).f().J();
        I = new Wy(POa.la, (ld)new CZ(POa.la, new Object[uSa.E]), aX.distanceStatType).f().J();
        Z = new Wy(wOa.O, (ld)new CZ(wOa.O, new Object[uSa.E]), aX.distanceStatType).f().J();
        y = new Wy(ATa.c, (ld)new CZ(ATa.c, new Object[uSa.E]), aX.distanceStatType).f().J();
        L = new Wy(NQa.G, (ld)new CZ(NQa.G, new Object[uSa.E]), aX.distanceStatType).f().J();
        m = new Wy(qQa.v, (ld)new CZ(qQa.v, new Object[uSa.E]), aX.distanceStatType).f().J();
        A = new Wy(dsa.Ia, (ld)new CZ(dsa.Ia, new Object[uSa.E]), aX.distanceStatType).f().J();
        i = new Wy(Bra.j, (ld)new CZ(Bra.j, new Object[uSa.E]), aX.distanceStatType).f().J();
        R = new Wy(TPa.T, (ld)new CZ(TPa.T, new Object[uSa.E]), aX.distanceStatType).f().J();
        S = new Wy(Upa.c, (ld)new CZ(Upa.c, new Object[uSa.E]), aX.distanceStatType).f().J();
        k = new Wy(Xpa.O, (ld)new CZ(Xpa.O, new Object[uSa.E]), aX.distanceStatType).f().J();
        U = new Wy(FRa.la, (ld)new CZ(FRa.la, new Object[uSa.E]), aX.distanceStatType).f().J();
        j = new Wy(Tqa.Da, (ld)new CZ(Tqa.Da, new Object[uSa.E])).f().J();
        P = new Wy(Gta.x, (ld)new CZ(Gta.x, new Object[uSa.E])).f().J();
        Ga = new Wy(SPa.Ga, (ld)new CZ(SPa.Ga, new Object[uSa.E]), aX.field_111202_k).J();
        w = new Wy(TOa.q, (ld)new CZ(TOa.q, new Object[uSa.E]), aX.field_111202_k).J();
        K = new Wy(oQa.I, (ld)new CZ(oQa.I, new Object[uSa.E])).J();
        N = new Wy(PTa.Z, (ld)new CZ(PTa.Z, new Object[uSa.E])).J();
        T = new Wy(Rua.d, (ld)new CZ(Rua.d, new Object[uSa.E])).J();
        p = new Wy(cQa.ga, (ld)new CZ(cQa.ga, new Object[uSa.E])).J();
        x = new Wy(uSa.p, (ld)new CZ(uSa.p, new Object[uSa.E])).J();
        O = new Wy(Wsa.ja, (ld)new CZ(Wsa.ja, new Object[uSa.E])).J();
        z = new Wy(uqa.n, (ld)new CZ(uqa.n, new Object[uSa.E])).J();
        J = new Wy(NTa.K, (ld)new CZ(NTa.K, new Object[uSa.E])).J();
        t = new Wy(Upa.j, (ld)new CZ(Upa.j, new Object[uSa.E])).J();
        f = new Wy(JPa.o, (ld)new CZ(JPa.o, new Object[uSa.E])).J();
        E = new Wy(EQa.L, (ld)new CZ(EQa.L, new Object[uSa.E])).J();
        F = new Wy(mPa.Ha, (ld)new CZ(mPa.Ha, new Object[uSa.E])).J();
        b = new Wy(Upa.Y, (ld)new CZ(Upa.Y, new Object[uSa.E])).J();
        D = new Wy(kua.la, (ld)new CZ(kua.la, new Object[uSa.E])).J();
        n = new Wy(cra.J, (ld)new CZ(cra.J, new Object[uSa.E])).J();
        Ha = new Wy(ITa.ga, (ld)new CZ(ITa.ga, new Object[uSa.E])).J();
        G = new Wy(Qsa.ba, (ld)new CZ(Qsa.ba, new Object[uSa.E])).J();
        B = new Wy(sSa.k, (ld)new CZ(sSa.k, new Object[uSa.E])).J();
        Q = new Wy(vpa.Da, (ld)new CZ(vpa.Da, new Object[uSa.E])).J();
        r = new Wy(MQa.N, (ld)new CZ(MQa.N, new Object[uSa.E])).J();
        X = new Wy(vsa.A, (ld)new CZ(vsa.A, new Object[uSa.E])).J();
        M = new Wy(Hra.b, (ld)new CZ(Hra.b, new Object[uSa.E])).J();
        q = new Wy(Usa.h, (ld)new CZ(Usa.h, new Object[uSa.E])).J();
        u = new Wy(GPa.r, (ld)new CZ(GPa.r, new Object[uSa.E])).J();
        g = new Wy(EPa.n, (ld)new CZ(EPa.n, new Object[uSa.E])).J();
        fa = new Wy(Cta.C, (ld)new CZ(Cta.C, new Object[uSa.E])).J();
        d = new Wy(ZRa.R, (ld)new CZ(ZRa.R, new Object[uSa.E])).J();
        s = new Wy(bSa.r, (ld)new CZ(kPa.L, new Object[uSa.E])).J();
        W = new Wy(nOa.M, (ld)new CZ(nOa.M, new Object[uSa.E])).J();
        a = new aX[mPa.H];
        c = new aX[rua.c];
        H = new aX[rua.c];
        l = new aX[rua.c];
    }

    public static aX J(String a2) {
        return o.get(a2);
    }

    private static void J(aX[] a2) {
        aX[] aXArray = a2;
        aX[] aXArray2 = a2;
        Tz_2.J(aXArray, QFa.sc, QFa.jd);
        Tz_2.J(aXArray2, QFa.bb, QFa.fA);
        Tz_2.J(aXArray, QFa.NC, QFa.s);
        Tz_2.J(aXArray2, QFa.CB, QFa.Xb);
        Tz_2.J(aXArray, QFa.Oc, QFa.M);
        Tz_2.J(aXArray2, QFa.cB, QFa.t);
        Tz_2.J(aXArray, QFa.gd, QFa.kc);
        Tz_2.J(aXArray2, QFa.Ja, QFa.AC);
        Tz_2.J(aXArray, QFa.jA, QFa.nA);
        Tz_2.J(aXArray2, QFa.Rd, QFa.Ib);
        Tz_2.J(aXArray, QFa.EC, QFa.eb);
        Tz_2.J(aXArray2, QFa.wC, QFa.F);
        Tz_2.J(aXArray, QFa.bc, QFa.Wf);
        Tz_2.J(aXArray2, QFa.lf, QFa.Bc);
        Tz_2.J(aXArray, QFa.rd, QFa.Bc);
    }
}

