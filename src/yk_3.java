/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BL
 *  CJ
 *  Cta
 *  ERa
 *  Fk
 *  Gua
 *  Ij
 *  JSa
 *  KK
 *  Ml
 *  NQa
 *  NTa
 *  PTa
 *  QSa
 *  Qta
 *  Ssa
 *  Vua
 *  WSa
 *  XSa
 *  XTa
 *  YJ
 *  Ypa
 *  ZOa
 *  ZRa
 *  aL
 *  aSa
 *  asa
 *  cL
 *  dpa
 *  eL
 *  jl
 *  lqa
 *  pPa
 *  pua
 *  qJ
 *  rk
 *  vQa
 *  vRa
 *  wOa
 *  wj
 *  yk
 */
import java.util.HashSet;
import java.util.Set;

public abstract class yk_3
extends Enum<yk> {
    public static final /* enum */ yk MUL;
    public static final /* enum */ yk EQUALS;
    public final String sign;
    public static final /* enum */ yk SHIFT_LEFT;
    public static final /* enum */ yk SHIFT_RIGHT;
    public static final /* enum */ yk GREATER_THAN;
    public static final /* enum */ yk LESS_THAN;
    public final int value;
    public static final /* enum */ yk LESS;
    public static final /* enum */ yk BIT_AND;
    public static final /* enum */ yk BIT_XOR;
    public static final /* enum */ yk ADD;
    public static final /* enum */ yk MOD;
    public static final /* enum */ yk GREATER;
    public static final /* enum */ yk OR;
    public static final /* enum */ yk SUB;
    public static final /* enum */ yk BIT_OR;
    public static final /* enum */ yk NOT_EQUALS;
    private static final /* synthetic */ yk[] $VALUES;
    public static final Set<String> OPERATORS;
    public static final /* enum */ yk POW;
    public static final /* enum */ yk AND;
    public static final /* enum */ yk DIV;

    /*
     * WARNING - void declaration
     */
    private yk_3(String string2, int n3) {
        void c2;
        void b2;
        yk_3 a2;
        int n4 = n3;
        yk_3 yk_32 = a2 = this;
        yk_32.sign = b2;
        yk_32.value = c2;
    }

    public abstract double calculate(double var1, double var3);

    public static yk[] values() {
        return (yk[])$VALUES.clone();
    }

    public static boolean equals(double b2, double a2) {
        if (Math.abs(b2 - a2) < qQa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        int n2;
        ADD = new cL(wOa.g, uSa.E, NQa.C, vRa.d);
        SUB = new tL(Vua.m, vRa.d);
        MUL = new BL(aSa.a, uqa.g, JSa.a, uqa.g);
        DIV = new VK(WSa.f, uqa.g);
        MOD = new Ml(PTa.A, AQa.P, Wqa.fa, uqa.g);
        POW = new Nl(CRa.D, yRa.d);
        AND = new wj(Vra.K, uua.p, dpa.Ha, ERa.Ka);
        OR = new CJ(FRa.ia, XTa.W, vQa.z, ERa.Ka);
        SHIFT_LEFT = new Fk(Cta.c, Yqa.i, Cta.Y, uSa.E);
        SHIFT_RIGHT = new eL(Ira.f, WOa.fa, Gua.la, uSa.E);
        BIT_AND = new jl(ZRa.v, NTa.C, Psa.d, pua.o);
        BIT_OR = new qJ(WOa.P, pPa.f, MTa.a, pua.o);
        BIT_XOR = new aL(asa.H, lqa.s, vua.Ka, pua.o);
        LESS = new KK(zua.n, uua.s, tpa.ca, rQa.p);
        LESS_THAN = new LL(Ssa.Ka, rQa.p);
        GREATER_THAN = new YJ(Npa.I, Ypa.A, Qta.p, rQa.p);
        GREATER = new Ij(XSa.b, ERa.C, ZOa.j, rQa.p);
        EQUALS = new rk(ERa.c, yta.Ka, eua.I, rQa.p);
        NOT_EQUALS = new xl(QSa.g, rQa.p);
        yk_3[] yk_3Array = new yk_3[wOa.t];
        yk_3Array[uSa.E] = ADD;
        yk_3Array[vRa.d] = SUB;
        yk_3Array[uqa.g] = MUL;
        yk_3Array[yRa.d] = DIV;
        yk_3Array[AQa.P] = MOD;
        yk_3Array[tTa.h] = POW;
        yk_3Array[uua.p] = AND;
        yk_3Array[XTa.W] = OR;
        yk_3Array[Yqa.i] = SHIFT_LEFT;
        yk_3Array[WOa.fa] = SHIFT_RIGHT;
        yk_3Array[NTa.C] = BIT_AND;
        yk_3Array[pPa.f] = BIT_OR;
        yk_3Array[lqa.s] = BIT_XOR;
        yk_3Array[uua.s] = LESS;
        yk_3Array[hpa.Z] = LESS_THAN;
        yk_3Array[Ypa.A] = GREATER_THAN;
        yk_3Array[ERa.C] = GREATER;
        yk_3Array[yta.Ka] = EQUALS;
        yk_3Array[yOa.B] = NOT_EQUALS;
        $VALUES = yk_3Array;
        OPERATORS = new HashSet<String>();
        yk[] ykArray = yk_3.values();
        int n3 = ykArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            yk yk2 = ykArray[n2];
            OPERATORS.add(yk2.sign);
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ yk_3(String string, int n2, String string2, int n3, cL cL2) {
        void f2;
        void c2;
        void d2;
        void e2;
        int n4 = n3;
        yk_3 b2 = this;
        b2((String)c2, (int)f2);
    }

    public static boolean isTrue(double a2) {
        if (!yk_3.equals(a2, aSa.V)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static yk valueOf(String a2) {
        return Enum.valueOf(yk_3.class, a2);
    }
}

