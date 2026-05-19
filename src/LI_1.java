/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  CG
 *  Cra
 *  DEa
 *  DI
 *  DQa
 *  FG
 *  ISa
 *  JPa
 *  LH
 *  LQa
 *  NTa
 *  QSa
 *  RPa
 *  Spa
 *  Ssa
 *  Vua
 *  WH
 *  WI
 *  XG
 *  XH
 *  XTa
 *  Xsa
 *  Zta
 *  cQa
 *  eh
 *  fG
 *  fi
 *  hi
 *  ih
 *  ki
 *  lI
 *  mH
 *  oh
 *  pPa
 *  pqa
 *  pua
 *  tI
 *  uOa
 *  ura
 *  vRa
 *  vh
 *  wra
 *  yQa
 *  zI
 *  zTa
 *  zsa
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LI_1 {
    private String str;
    private List<DEa<String, b>> debugList;
    private final Map<String, Function<String, b>> functionsString;
    private int pos = pua.o;
    private final Map<String, Function<b[], b>> functions;
    private char ch;
    private Supplier<b> percent;
    private static final char EOF = '\u0000';
    private final Map<String, Supplier<b>> variables;

    public static /* synthetic */ float k(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2.J() != JPa.N && b4.J() != JPa.N) {
            return pqa.r;
        }
        return JPa.N;
    }

    private void J() {
        int n2;
        LI_1 a2;
        if ((a2.pos += vRa.d) < a2.str.length()) {
            LI_1 lI_1 = a2;
            n2 = lI_1.str.charAt(lI_1.pos);
        } else {
            n2 = uSa.E;
        }
        a2.ch = (char)n2;
    }

    public void J(Supplier<b> supplier) {
        Supplier<b> b2 = supplier;
        LI_1 a2 = this;
        a2.percent = b2;
    }

    public static /* synthetic */ float G(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2.J() < b4.J()) {
            return pqa.r;
        }
        return JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public void f(String string, Function<b[], b> function) {
        void b2;
        Function<b[], b> c2 = function;
        LI_1 a2 = this;
        a2.functions.put((String)b2, c2);
    }

    public static /* synthetic */ float D(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return a2.J() / b4.J();
    }

    public static void main(String[] stringArray) {
        String[] stringArray2 = stringArray;
        LI_1 lI_1 = new LI_1();
        lI_1.J(DQa.F, tI.J());
        lI_1.f(Bua.r, FG.J());
        b a2 = lI_1.J(uua.J);
        System.out.println(a2.J());
    }

    public static /* synthetic */ float f(b a2) {
        return -a2.J();
    }

    public static /* synthetic */ b J(b[] a2) {
        return WI.J((b[])a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b J(String string) {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        synchronized (lI_12) {
            void a2;
            LI_1 lI_13 = lI_1;
            lI_13.str = a2;
            lI_13.pos = pua.o;
            try {
                LI_1 lI_14 = lI_1;
                lI_14.J();
                b b2 = lI_14.i();
                if (lI_14.pos < lI_1.str.length()) {
                    throw new ParseException(new StringBuilder().insert(3 & 4, RPa.t).append(lI_1.ch).toString(), lI_1.pos);
                }
                return b2;
            }
            catch (ParseException b2) {
                throw new RuntimeException(new StringBuilder().insert(3 >> 2, SPa.U).append((String)a2).append(Xsa.R).append(b2.getErrorOffset()).toString(), b2);
            }
            catch (Exception b2) {
                throw new RuntimeException(new StringBuilder().insert(2 & 5, SPa.U).append((String)a2).append(XTa.Z).toString(), b2);
            }
        }
    }

    public static /* synthetic */ float A(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2.J() >= b4.J()) {
            return pqa.r;
        }
        return JPa.N;
    }

    public LI_1() {
        LI_1 a2;
        LI_1 lI_1 = a2;
        lI_1.functionsString = new HashMap<String, Function<String, b>>();
        a2.functions = new HashMap<String, Function<b[], b>>();
        a2.variables = new HashMap<String, Supplier<b>>();
    }

    public static b C(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2 instanceof fi || b4 instanceof fi) {
            float f2;
            b b5;
            b b6;
            if (a2 instanceof fi && b4 instanceof fi) {
                return fi.J((float)(a2.J() + b4.J()));
            }
            if (a2 instanceof fi) {
                b5 = b6 = b4;
                f2 = a2.J();
            } else {
                b5 = b6 = a2;
                f2 = b4.J();
            }
            if (b5 instanceof mH) {
                mH mH2 = (mH)b6;
                float f3 = mH.J((mH)mH2) + f2;
                if (f3 == JPa.N) {
                    return mH.J((mH)mH2);
                }
                return new mH(mH.J((mH)mH2), f3);
            }
            return new mH(b6, f2);
        }
        return DI.J((b)a2, (b)b4);
    }

    public static /* synthetic */ float i(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2.J() != JPa.N || b4.J() != JPa.N) {
            return pqa.r;
        }
        return JPa.N;
    }

    private static b l(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2 instanceof fi && b4 instanceof fi) {
            return fi.J((float)(a2.J() / b4.J()));
        }
        return Fj.J(a2, b4);
    }

    private b D() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        LI_1 lI_13 = lI_12;
        Object a2 = lI_12.f();
        while (lI_13.J(cPa.Ea) && lI_1.J(cPa.Ea)) {
            Object object = a2;
            LI_1 lI_14 = lI_1;
            lI_13 = lI_14;
            b b2 = lI_14.f();
            a2 = XG.J((b)object, (b)b2);
        }
        return a2;
    }

    private static b f(b a2) {
        if (a2 instanceof fi) {
            return fi.J((float)(a2.J() == JPa.N ? pqa.r : JPa.N));
        }
        return ih.J((b)a2);
    }

    public List<DEa<String, b>> J(String string) {
        List<DEa<String, b>> b2 = string;
        LI_1 a2 = this;
        try {
            a2.debugList = new ArrayList<DEa<String, b>>();
            a2.J((String)((Object)b2));
            b2 = a2.debugList;
            return b2;
        }
        finally {
            a2.debugList = null;
        }
    }

    public static /* synthetic */ float M(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return a2.J() + b4.J();
    }

    public static /* synthetic */ float e(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return a2.J() * b4.J();
    }

    public static /* synthetic */ float d(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return a2.J() - b4.J();
    }

    public static /* synthetic */ float J(b a2) {
        if (a2.J() == JPa.N) {
            return pqa.r;
        }
        return JPa.N;
    }

    private b A() throws ParseException {
        Object a2;
        Object object = this;
        if (((LI_1)object).J(iSa.x)) {
            return ((LI_1)object).A();
        }
        if (((LI_1)object).J(wra.e)) {
            b b2 = ((LI_1)object).A();
            return LI_1.J(b2);
        }
        if (((LI_1)object).J(Zqa.G)) {
            b b3 = ((LI_1)object).A();
            return LI_1.f(b3);
        }
        LI_1 lI_1 = object;
        int n2 = lI_1.pos;
        if (lI_1.J(wra.P)) {
            LI_1 lI_12 = object;
            a2 = lI_12.i();
            if (!lI_12.J(kra.U)) {
                throw new ParseException(ura.e, ((LI_1)object).pos);
            }
            return a2;
        }
        if (((LI_1)object).ch >= QSa.p && ((LI_1)object).ch <= KSa.x || ((LI_1)object).ch == Bpa.Ha) {
            LI_1 lI_13 = object;
            while (lI_13.ch >= QSa.p && ((LI_1)object).ch <= KSa.x || ((LI_1)object).ch == Bpa.Ha) {
                LI_1 lI_14 = object;
                lI_13 = lI_14;
                lI_14.J();
            }
            if (((LI_1)object).ch == zTa.C || ((LI_1)object).ch == Cra.S) {
                LI_1 lI_15 = object;
                lI_15.J();
                if (lI_15.ch == wra.e) {
                    ((LI_1)object).J();
                }
                LI_1 lI_16 = object;
                while (lI_16.ch >= QSa.p && ((LI_1)object).ch <= KSa.x) {
                    LI_1 lI_17 = object;
                    lI_16 = lI_17;
                    lI_17.J();
                }
            }
            LI_1 lI_18 = object;
            a2 = lI_18.str.substring(n2, ((LI_1)object).pos);
            float f2 = (float)Double.parseDouble((String)a2);
            if (lI_18.J(LQa.c) && ((LI_1)object).percent != null) {
                float f3 = f2 / QTa.G;
                b b4 = ((LI_1)object).percent.get();
                b b5 = ki.J((float)f3, (b)b4);
                if (((LI_1)object).debugList != null) {
                    ((LI_1)object).debugList.add((DEa<String, b>)new DEa((Object)new StringBuilder().insert(5 >> 3, (String)a2).append(Wqa.fa).toString(), (Object)b5));
                }
                return b5;
            }
            return fi.J((float)f2);
        }
        if (((LI_1)object).ch >= Hta.k && ((LI_1)object).ch <= Zta.Ma || ((LI_1)object).ch >= fPa.ga && ((LI_1)object).ch <= Jsa.ha || ((LI_1)object).ch == pqa.ga) {
            LI_1 lI_19 = object;
            while (lI_19.ch >= Hta.k && ((LI_1)object).ch <= Zta.Ma || ((LI_1)object).ch >= fPa.ga && ((LI_1)object).ch <= Jsa.ha || ((LI_1)object).ch >= QSa.p && ((LI_1)object).ch <= KSa.x || ((LI_1)object).ch == pqa.ga || ((LI_1)object).ch == Bpa.Ha) {
                LI_1 lI_110 = object;
                lI_19 = lI_110;
                lI_110.J();
            }
            LI_1 lI_111 = object;
            a2 = lI_111.str.substring(n2, ((LI_1)object).pos);
            if (!lI_111.J(wra.P)) {
                Supplier<b> supplier = ((LI_1)object).variables.get(a2);
                if (supplier == null) {
                    throw new ParseException(new StringBuilder().insert(3 & 4, Vua.w).append((String)a2).toString(), ((LI_1)object).pos);
                }
                b b6 = supplier.get();
                if (((LI_1)object).debugList != null) {
                    ((LI_1)object).debugList.add((DEa<String, b>)new DEa(a2, (Object)b6));
                }
                return b6;
            }
            if (((LI_1)object).functionsString.containsKey(a2)) {
                int n3 = ((LI_1)object).pos;
                int n4 = uSa.E;
                block5: while (true) {
                    int n5 = n4;
                    while (n5 >= 0 && ((LI_1)object).ch != '\u0000') {
                        LI_1 lI_112 = object;
                        lI_112.J();
                        if (lI_112.ch == wra.P) {
                            n5 = ++n4;
                            continue;
                        }
                        if (((LI_1)object).ch != kra.U) continue block5;
                        n5 = --n4;
                    }
                    break;
                }
                LI_1 lI_113 = object;
                String string = lI_113.str.substring(n3, ((LI_1)object).pos);
                if (!lI_113.J(kra.U)) {
                    throw new ParseException(new StringBuilder().insert(3 ^ 3, zsa.U).append((String)a2).toString(), n3);
                }
                b b7 = ((LI_1)object).functionsString.get(a2).apply(string);
                if (((LI_1)object).debugList != null) {
                    ((LI_1)object).debugList.add((DEa<String, b>)new DEa((Object)new StringBuilder().insert(3 >> 2, (String)a2).append(pPa.k).append(string).append(hpa.b).toString(), (Object)b7));
                }
                return b7;
            }
            if (((LI_1)object).functions.containsKey(a2)) {
                ArrayList<b> arrayList = new ArrayList<b>();
                LI_1 lI_114 = object;
                int n6 = lI_114.pos;
                if (!lI_114.J(kra.U)) {
                    do {
                        arrayList.add(((LI_1)object).i());
                    } while (((LI_1)object).J(Yqa.D));
                    if (!((LI_1)object).J(kra.U)) {
                        throw new ParseException(new StringBuilder().insert(3 & 4, uSa.s).append(arrayList.size()).append(bsa.O).append((String)a2).toString(), ((LI_1)object).pos);
                    }
                }
                try {
                    b b8 = ((LI_1)object).functions.get(a2).apply(arrayList.toArray(new b[uSa.E]));
                    if (((LI_1)object).debugList != null) {
                        LI_1 lI_115 = object;
                        String string = ((LI_1)object).str.substring(n6, lI_115.pos);
                        lI_115.debugList.add((DEa<String, b>)new DEa((Object)new StringBuilder().insert(5 >> 3, (String)a2).append(pPa.k).append(string).toString(), (Object)b8));
                    }
                    return b8;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw new ParseException(new StringBuilder().insert(5 >> 3, osa.Ga).append((String)a2).toString(), ((LI_1)object).pos);
                }
            }
            throw new ParseException(new StringBuilder().insert(5 >> 3, yQa.S).append((String)a2).toString(), ((LI_1)object).pos);
        }
        throw new ParseException(new StringBuilder().insert(5 >> 3, RPa.t).append(((LI_1)object).ch).toString(), ((LI_1)object).pos);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Supplier<b> supplier) {
        void b2;
        Supplier<b> c2 = supplier;
        LI_1 a2 = this;
        a2.variables.put((String)b2, c2);
    }

    private b i() throws ParseException {
        LI_1 a2;
        return a2.J();
    }

    public static /* synthetic */ b M() {
        return new fi(pua.j);
    }

    private boolean J(int n2) {
        LI_1 a2;
        int b2 = n2;
        LI_1 lI_1 = a2 = this;
        while (lI_1.ch == fPa.i || a2.ch == WOa.fa || a2.ch == NTa.C) {
            LI_1 lI_12 = a2;
            lI_1 = lI_12;
            lI_12.J();
        }
        if (a2.ch == b2) {
            a2.J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Function<String, b> function) {
        void b2;
        Function<String, b> c2 = function;
        LI_1 a2 = this;
        a2.functionsString.put((String)b2, c2);
    }

    public static b f(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (b4 instanceof fi) {
            if (a2 instanceof fi) {
                return fi.J((float)(a2.J() - b4.J()));
            }
            return LI_1.C(a2, LI_1.J(b4));
        }
        return zI.J((b)a2, (b)b4);
    }

    private static b J(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2 instanceof fi && b4 instanceof fi) {
            return fi.J((float)(a2.J() * b4.J()));
        }
        return vh.J((b)a2, (b)b4);
    }

    public static /* synthetic */ float J(float f2, b b2) {
        b b3 = b2;
        float a2 = f2;
        return a2 * b3.J();
    }

    private b e() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        LI_1 lI_13 = lI_12;
        Object a2 = lI_12.A();
        while (true) {
            b b2;
            Object object;
            if (lI_13.J(cQa.i)) {
                object = a2;
                LI_1 lI_14 = lI_1;
                lI_13 = lI_14;
                b2 = lI_14.A();
                a2 = LI_1.J((b)object, b2);
                continue;
            }
            if (!lI_1.J(uOa.F)) break;
            object = a2;
            LI_1 lI_15 = lI_1;
            lI_13 = lI_15;
            b2 = lI_15.A();
            a2 = LI_1.l((b)object, b2);
        }
        return a2;
    }

    private static b J(b a2) {
        if (a2 instanceof fi) {
            return fi.J((float)(-a2.J()));
        }
        return fG.J((b)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ float J(b b2, b b3, b b4) {
        b c2 = b4;
        b a2 = b2;
        if (a2.J() != JPa.N) {
            void b5;
            return b5.J();
        }
        return c2.J();
    }

    public static /* synthetic */ float C(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if ((double)Math.abs(a2.J() - b4.J()) < Spa.y) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ float J(b[] bArray) {
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

    private b d() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        LI_1 lI_13 = lI_12;
        Object a2 = lI_12.C();
        while (true) {
            b b2;
            Object object;
            if (lI_13.J(Psa.M)) {
                if (lI_1.J(tua.w)) {
                    object = a2;
                    LI_1 lI_14 = lI_1;
                    lI_13 = lI_14;
                    b2 = lI_14.C();
                    a2 = oh.J((b)object, (b)b2);
                    continue;
                }
                object = a2;
                LI_1 lI_15 = lI_1;
                lI_13 = lI_15;
                b2 = lI_15.C();
                a2 = eh.J((b)object, (b)b2);
                continue;
            }
            if (!lI_1.J(ITa.V)) break;
            if (lI_1.J(tua.w)) {
                object = a2;
                LI_1 lI_16 = lI_1;
                lI_13 = lI_16;
                b2 = lI_16.C();
                a2 = XH.J((b)object, (b)b2);
                continue;
            }
            object = a2;
            LI_1 lI_17 = lI_1;
            lI_13 = lI_17;
            b2 = lI_17.C();
            a2 = lI.J((b)object, (b)b2);
        }
        return a2;
    }

    public static /* synthetic */ float l(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2.J() <= b4.J()) {
            return pqa.r;
        }
        return JPa.N;
    }

    public static /* synthetic */ float f(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if ((double)Math.abs(a2.J() - b4.J()) > Spa.y) {
            return pqa.r;
        }
        return JPa.N;
    }

    private b C() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        LI_1 lI_13 = lI_12;
        Object a2 = lI_12.e();
        while (true) {
            b b2;
            Object object;
            if (lI_13.J(iSa.x)) {
                object = a2;
                LI_1 lI_14 = lI_1;
                lI_13 = lI_14;
                b2 = lI_14.e();
                a2 = LI_1.C((b)object, b2);
                continue;
            }
            if (!lI_1.J(wra.e)) break;
            object = a2;
            LI_1 lI_15 = lI_1;
            lI_13 = lI_15;
            b2 = lI_15.e();
            a2 = LI_1.f((b)object, b2);
        }
        return a2;
    }

    private b l() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        LI_1 lI_13 = lI_12;
        Object a2 = lI_12.d();
        while (true) {
            b b2;
            Object object;
            if (lI_13.J(tua.w) && lI_1.J(tua.w)) {
                object = a2;
                LI_1 lI_14 = lI_1;
                lI_13 = lI_14;
                b2 = lI_14.d();
                a2 = LH.J((b)object, (b)b2);
                continue;
            }
            if (!lI_1.J(Zqa.G) || !lI_1.J(tua.w)) break;
            object = a2;
            LI_1 lI_15 = lI_1;
            lI_13 = lI_15;
            b2 = lI_15.d();
            a2 = hi.J((b)object, (b)b2);
        }
        return a2;
    }

    public static /* synthetic */ float J(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        if (a2.J() > b4.J()) {
            return pqa.r;
        }
        return JPa.N;
    }

    private b f() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        LI_1 lI_13 = lI_12;
        Object a2 = lI_12.l();
        while (lI_13.J(ISa.E) && lI_1.J(ISa.E)) {
            Object object = a2;
            LI_1 lI_14 = lI_1;
            lI_13 = lI_14;
            b b2 = lI_14.l();
            a2 = WH.J((b)object, (b)b2);
        }
        return a2;
    }

    private b J() throws ParseException {
        LI_1 lI_1;
        LI_1 lI_12 = lI_1 = this;
        b a2 = lI_12.D();
        if (lI_12.J(Ssa.u)) {
            LI_1 lI_13 = lI_1;
            b b2 = lI_13.i();
            if (!lI_13.J(lQa.R)) {
                throw new ParseException(Lsa.b, lI_1.pos);
            }
            b b3 = lI_1.i();
            return CG.J((b)a2, (b)b2, (b)b3);
        }
        return a2;
    }
}

