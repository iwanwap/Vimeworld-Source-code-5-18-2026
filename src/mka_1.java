/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CC
 *  Yha
 *  ZIa
 *  vRa
 */
import optifine.Config;

public final class mka_1 {
    public static final gC d;
    public static final hKa a;
    public static final gC b;
    private static final hKa l;
    public static final gC e;
    public static final gC G;
    public static final hKa D;
    private static final String f = "CL_00002403";
    public static final hKa F;
    public static final hKa g;
    public static hKa L;
    public static final hKa E;
    public static final hKa m;
    public static final gC C;
    private static final hKa i;
    public static final hKa M;
    public static final gC k;
    public static hKa j;
    public static final hKa J;
    public static final hKa A;
    public static final hKa I;

    static {
        j = new hKa();
        L = new hKa();
        i = j;
        l = L;
        m = new hKa();
        F = new hKa();
        M = new hKa();
        I = new hKa();
        A = new hKa();
        J = new hKa();
        a = new hKa();
        g = new hKa();
        E = new hKa();
        D = new hKa();
        C = new gC(uSa.E, Yha.FLOAT, ZIa.POSITION, yRa.d);
        d = new gC(uSa.E, Yha.UBYTE, ZIa.COLOR, AQa.P);
        b = new gC(uSa.E, Yha.FLOAT, ZIa.UV, uqa.g);
        e = new gC(vRa.d, Yha.SHORT, ZIa.UV, uqa.g);
        k = new gC(uSa.E, Yha.BYTE, ZIa.NORMAL, yRa.d);
        G = new gC(uSa.E, Yha.BYTE, ZIa.PADDING, vRa.d);
        j.J(C);
        j.J(d);
        j.J(b);
        j.J(e);
        L.J(C);
        L.J(d);
        L.J(b);
        L.J(k);
        L.J(G);
        m.J(C);
        m.J(b);
        m.J(k);
        m.J(G);
        F.J(C);
        F.J(b);
        F.J(d);
        F.J(e);
        M.J(C);
        I.J(C);
        I.J(d);
        A.J(C);
        A.J(b);
        J.J(C);
        J.J(k);
        J.J(G);
        a.J(C);
        a.J(b);
        a.J(d);
        g.J(C);
        g.J(b);
        g.J(k);
        g.J(G);
        E.J(C);
        E.J(b);
        E.J(e);
        E.J(d);
        D.J(C);
        D.J(b);
        D.J(d);
        D.J(k);
        D.J(G);
    }

    public static void J() {
        if (Config.h()) {
            j = CC.f();
            L = CC.l();
            return;
        }
        j = i;
        L = l;
    }

    public mka_1() {
        mka_1 a2;
    }
}

