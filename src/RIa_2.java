/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CIa
 *  Dha
 *  ERa
 *  Epa
 *  FTa
 *  Gua
 *  Lra
 *  MHa
 *  MZ
 *  NTa
 *  Pqa
 *  Qqa
 *  RIa
 *  Tpa
 *  URa
 *  Uqa
 *  Uta
 *  VQa
 *  Vua
 *  WSa
 *  XTa
 *  Ypa
 *  Zia
 *  Zua
 *  aqa
 *  asa
 *  bRa
 *  cQa
 *  cra
 *  fTa
 *  fha
 *  fpa
 *  hqa
 *  kPa
 *  lqa
 *  oga
 *  pPa
 *  sD
 *  ura
 *  vRa
 *  wOa
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RIa_2 {
    private StackTraceElement[] m;
    private static final Logger C = LogManager.getLogger();
    private final Dha i;
    private final String M;
    private final List k;
    private static final String j = "CL_00000990";
    private File J;
    private boolean A;
    private final Throwable I;

    public String C() {
        RIa_2 rIa_2 = this;
        StringBuilder a2 = new StringBuilder();
        a2.append(hqa.n);
        a2.append(URa.P);
        a2.append(RIa_2.l());
        a2.append(Pqa.D);
        a2.append(kra.V);
        a2.append(new SimpleDateFormat().format(new Date()));
        a2.append(SPa.O);
        a2.append(gQa.Z);
        a2.append(rIa_2.M);
        a2.append(Pqa.D);
        a2.append(rIa_2.J());
        a2.append(bsa.t);
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < Jqa.S) {
            a2.append(Vua.m);
            n3 = ++n2;
        }
        Object object = a2;
        ((StringBuilder)object).append(Pqa.D);
        rIa_2.J(a2);
        return ((StringBuilder)object).toString();
    }

    /*
     * Unable to fully structure code
     */
    public Dha J(String var1_1, int var2_2) {
        var3_3 = this;
        b = new Dha((RIa)var3_3, (String)b);
        if (!var3_3.A) ** GOTO lbl28
        a = b.J(a);
        c = var3_3.I.getStackTrace();
        var4_4 = null;
        var5_5 = null;
        var6_6 = c.length - a;
        if (var6_6 < 0) {
            System.out.println(new StringBuilder().insert(3 ^ 3, Zua.i).append(c.length).append(WSa.f).append(a).append(hpa.b).toString());
        }
        if (c != null && uSa.E <= var6_6 && var6_6 < c.length) {
            var4_4 = c[var6_6];
            if (c.length + vRa.d - a < c.length) {
                var5_5 = c[c.length + vRa.d - a];
            }
        }
        var3_3.A = b.J(var4_4, var5_5);
        if (a > 0 && !var3_3.k.isEmpty()) {
            ((Dha)var3_3.k.get(var3_3.k.size() - vRa.d)).J(a);
            v0 = var3_3;
        } else if (c != null && c.length >= a && uSa.E <= var6_6 && var6_6 < c.length) {
            var3_3.m = new StackTraceElement[var6_6];
            System.arraycopy(c, uSa.E, var3_3.m, uSa.E, var3_3.m.length);
            v0 = var3_3;
        } else {
            var3_3.A = uSa.E;
lbl28:
            // 2 sources

            v0 = var3_3;
        }
        v0.k.add(b);
        return b;
    }

    public boolean J(File file) {
        File b2 = file;
        RIa_2 a2 = this;
        if (a2.J != null) {
            return uSa.E != 0;
        }
        if (b2.getParentFile() != null) {
            b2.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter;
            FileWriter fileWriter2 = fileWriter = new FileWriter(b2);
            fileWriter2.write(a2.C());
            fileWriter2.close();
            a2.J = b2;
            return vRa.d != 0;
        }
        catch (Throwable throwable) {
            C.error(new StringBuilder().insert(5 >> 3, NTa.n).append(b2).toString(), throwable);
            return uSa.E != 0;
        }
    }

    private void J() {
        RIa_2 a2;
        RIa_2 rIa_2 = a2;
        rIa_2.i.J(osa.z, (Callable)new Zia((RIa)a2));
        rIa_2.i.J(nOa.X, (Callable)new fha((RIa)a2));
        rIa_2.i.J(VPa.x, (Callable)new sD());
        rIa_2.i.J(kPa.J, (Callable)new QHa((RIa)a2));
        rIa_2.i.J(uqa.v, (Callable)new CIa((RIa)a2));
        rIa_2.i.J(tTa.t, (Callable)new oga((RIa)a2));
        rIa_2.i.J(uSa.fa, (Callable)new MHa((RIa)a2));
        rIa_2.i.J(Qra.i, (Callable)new iGa((RIa)a2));
    }

    private static String l() {
        String[] stringArray = new String[Tpa.z];
        stringArray[uSa.E] = Uta.x;
        stringArray[vRa.d] = AQa.H;
        stringArray[uqa.g] = Jta.E;
        stringArray[yRa.d] = eta.a;
        stringArray[AQa.P] = fpa.Ga;
        stringArray[tTa.h] = bRa.c;
        stringArray[uua.p] = Zqa.a;
        stringArray[XTa.W] = lTa.s;
        stringArray[Yqa.i] = LPa.r;
        stringArray[WOa.fa] = WOa.O;
        stringArray[NTa.C] = WRa.H;
        stringArray[pPa.f] = kua.f;
        stringArray[lqa.s] = vsa.Q;
        stringArray[uua.s] = Jqa.z;
        stringArray[hpa.Z] = nOa.l;
        stringArray[Ypa.A] = uqa.U;
        stringArray[ERa.C] = Epa.T;
        stringArray[yta.Ka] = UTa.fa;
        stringArray[yOa.B] = tTa.a;
        stringArray[wOa.t] = Iqa.I;
        stringArray[kTa.j] = fTa.ja;
        stringArray[wOa.h] = osa.X;
        stringArray[cQa.o] = tSa.S;
        stringArray[AQa.ba] = WPa.b;
        stringArray[osa.c] = VQa.c;
        stringArray[kTa.g] = rSa.R;
        stringArray[ITa.E] = asa.R;
        stringArray[Lra.e] = pta.Ja;
        stringArray[EPa.O] = Gua.u;
        stringArray[ITa.A] = FTa.l;
        stringArray[Fsa.d] = Uqa.L;
        stringArray[tua.U] = WSa.W;
        stringArray[fPa.i] = aqa.z;
        stringArray[Zqa.G] = VQa.H;
        String[] stringArray2 = stringArray;
        try {
            return stringArray2[(int)(System.nanoTime() % (long)stringArray2.length)];
        }
        catch (Throwable throwable) {
            return wsa.I;
        }
    }

    /*
     * WARNING - void declaration
     */
    public RIa_2(String string, Throwable throwable) {
        void b2;
        Throwable c2 = throwable;
        RIa_2 a2 = this;
        RIa_2 rIa_2 = a2;
        a2.i = new Dha((RIa)a2, Vra.k);
        rIa_2.k = Lists.newArrayList();
        a2.A = vRa.d;
        a2.m = new StackTraceElement[uSa.E];
        a2.M = b2;
        a2.I = c2;
        a2.J();
    }

    public Dha J(String string) {
        String b2 = string;
        RIa_2 a2 = this;
        return a2.J(b2, vRa.d);
    }

    public void J(StringBuilder stringBuilder) {
        StackTraceElement[] stackTraceElementArray;
        StringBuilder b2 = stringBuilder;
        RIa_2 a2 = this;
        if ((a2.m == null || a2.m.length <= 0) && a2.k.size() > 0) {
            a2.m = ArrayUtils.subarray(((Dha)a2.k.get(uSa.E)).J(), uSa.E, vRa.d);
        }
        if (a2.m != null && a2.m.length > 0) {
            int n2;
            b2.append(iSa.w);
            b2.append(Qqa.t);
            stackTraceElementArray = a2.m;
            int n3 = stackTraceElementArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                StackTraceElement stackTraceElement = stackTraceElementArray[n2];
                b2.append(ura.t).append(cra.D).append(stackTraceElement.toString());
                b2.append(SPa.O);
                n4 = ++n2;
            }
            b2.append(SPa.O);
        }
        StackTraceElement[] stackTraceElementArray2 = stackTraceElementArray = a2.k.iterator();
        while (stackTraceElementArray2.hasNext()) {
            Object e2 = stackTraceElementArray.next();
            ((Dha)e2).J(b2);
            stackTraceElementArray2 = stackTraceElementArray;
            b2.append(Pqa.D);
        }
        a2.i.J(b2);
    }

    public String f() {
        RIa_2 a2;
        return a2.M;
    }

    public static RIa J(Throwable throwable, String string) {
        String b2 = string;
        Throwable a2 = throwable;
        if (a2 instanceof MZ) {
            return ((MZ)a2).getCrashReport();
        }
        return new RIa_2(b2, a2);
    }

    public Throwable J() {
        RIa_2 a2;
        return a2.I;
    }

    public Dha J() {
        RIa_2 a2;
        return a2.i;
    }

    public File J() {
        RIa_2 a2;
        return a2.J;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String J() {
        RIa_2 rIa_2 = this;
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Object a22 = rIa_2.I;
        if (((Throwable)a22).getMessage() == null) {
            Object object;
            if (a22 instanceof NullPointerException) {
                object = a22 = new NullPointerException(rIa_2.M);
            } else if (a22 instanceof StackOverflowError) {
                object = a22 = new StackOverflowError(rIa_2.M);
            } else {
                if (a22 instanceof OutOfMemoryError) {
                    a22 = new OutOfMemoryError(rIa_2.M);
                }
                object = a22;
            }
            ((Throwable)object).setStackTrace(rIa_2.I.getStackTrace());
        }
        String string = ((Throwable)a22).toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            ((Throwable)a22).printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable a22) {
            IOUtils.closeQuietly(stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw a22;
        }
        IOUtils.closeQuietly(stringWriter);
        IOUtils.closeQuietly(printWriter);
        return string;
    }
}

