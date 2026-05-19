/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bia
 *  Dha
 *  GIa
 *  NTa
 *  Oia
 *  RIa
 *  Rua
 *  VQa
 *  XTa
 *  Ypa
 *  Zha
 *  bqa
 *  hIa
 *  jpa
 *  qta
 *  vRa
 *  yra
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dha_3 {
    private final List<Oia> j;
    private final RIa J;
    private final String A;
    private StackTraceElement[] I;

    /*
     * WARNING - void declaration
     */
    public static void J(Dha dha2, XF xF2, Block block, int n2) {
        void c2;
        void a2;
        void b2;
        Dha dha3 = dha2;
        int d2 = Block.J((Block)b2);
        Dha dha4 = dha3;
        dha4.J(zOa.K, (Callable<String>)new Zha(d2, (Block)b2));
        dha4.J(bqa.Da, new lIa((int)a2));
        dha4.J(kra.da, (Callable<String>)new hIa((XF)c2));
    }

    public void J(StringBuilder stringBuilder) {
        StringBuilder b2 = stringBuilder;
        Dha_3 a2 = this;
        b2.append(Era.n).append(a2.A).append(mSa.J);
        b2.append(yra.Ja);
        StackTraceElement[] stackTraceElementArray = a2.j.iterator();
        StackTraceElement[] stackTraceElementArray2 = stackTraceElementArray;
        while (stackTraceElementArray2.hasNext()) {
            Oia oia2 = stackTraceElementArray.next();
            stackTraceElementArray2 = stackTraceElementArray;
            b2.append(gua.Ha);
            b2.append(oia2.J());
            b2.append(Xpa.E);
            b2.append(oia2.f());
        }
        if (a2.I != null && a2.I.length > 0) {
            int n2;
            b2.append(Rua.P);
            stackTraceElementArray = a2.I;
            int n3 = stackTraceElementArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                StackTraceElement stackTraceElement = stackTraceElementArray[n2];
                b2.append(csa.w);
                b2.append(stackTraceElement.toString());
                n4 = ++n2;
            }
        }
    }

    public static String J(XF xF2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        StringBuilder stringBuilder3;
        XF xF3;
        XF xF4 = xF3 = xF2;
        int n9 = xF4.getX();
        int n10 = xF4.getY();
        int n11 = xF4.getZ();
        StringBuilder stringBuilder4 = new StringBuilder();
        try {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = n9;
            objectArray[vRa.d] = n10;
            objectArray[uqa.g] = n11;
            stringBuilder4.append(String.format(VQa.P, objectArray));
            stringBuilder3 = stringBuilder4;
        }
        catch (Throwable a2) {
            StringBuilder stringBuilder5 = stringBuilder4;
            stringBuilder3 = stringBuilder5;
            stringBuilder5.append(jpa.Ga);
        }
        stringBuilder3.append(TOa.n);
        try {
            int a2 = n9 >> AQa.P;
            n8 = n11 >> AQa.P;
            n7 = n9 & Ypa.A;
            n10 >>= AQa.P;
            n6 = n11 & Ypa.A;
            n5 = a2 << AQa.P;
            n4 = n8 << AQa.P;
            n3 = (a2 + vRa.d << AQa.P) - vRa.d;
            n2 = (n8 + vRa.d << AQa.P) - vRa.d;
            Object[] objectArray = new Object[WOa.fa];
            objectArray[uSa.E] = n7;
            objectArray[vRa.d] = n10;
            objectArray[uqa.g] = n6;
            objectArray[yRa.d] = a2;
            objectArray[AQa.P] = n8;
            objectArray[tTa.h] = n5;
            objectArray[uua.p] = n4;
            objectArray[XTa.W] = n3;
            objectArray[Yqa.i] = n2;
            stringBuilder4.append(String.format(qta.g, objectArray));
            stringBuilder2 = stringBuilder4;
        }
        catch (Throwable a2) {
            StringBuilder stringBuilder6 = stringBuilder4;
            stringBuilder2 = stringBuilder6;
            stringBuilder6.append(lQa.a);
        }
        stringBuilder2.append(TOa.n);
        try {
            int a2 = n9 >> WOa.fa;
            n8 = n11 >> WOa.fa;
            n7 = a2 << tTa.h;
            n10 = n8 << tTa.h;
            n6 = (a2 + vRa.d << tTa.h) - vRa.d;
            n5 = (n8 + vRa.d << tTa.h) - vRa.d;
            n4 = a2 << WOa.fa;
            n3 = n8 << WOa.fa;
            n2 = (a2 + vRa.d << WOa.fa) - vRa.d;
            n9 = (n8 + vRa.d << WOa.fa) - vRa.d;
            Object[] objectArray = new Object[NTa.C];
            objectArray[uSa.E] = a2;
            objectArray[vRa.d] = n8;
            objectArray[uqa.g] = n7;
            objectArray[yRa.d] = n10;
            objectArray[AQa.P] = n6;
            objectArray[tTa.h] = n5;
            objectArray[uua.p] = n4;
            objectArray[XTa.W] = n3;
            objectArray[Yqa.i] = n2;
            objectArray[WOa.fa] = n9;
            stringBuilder4.append(String.format(Xpa.J, objectArray));
            stringBuilder = stringBuilder4;
        }
        catch (Throwable a2) {
            StringBuilder stringBuilder7 = stringBuilder4;
            stringBuilder = stringBuilder7;
            stringBuilder7.append(jpa.Ga);
        }
        return stringBuilder.toString();
    }

    public static String J(double c2, double b2, double a2) {
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = c2;
        objectArray[vRa.d] = b2;
        objectArray[uqa.g] = a2;
        objectArray[yRa.d] = Dha_3.J(new XF(c2, b2, a2));
        return String.format(kTa.W, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2) {
        void a2;
        StackTraceElement[] stackTraceElementArray = this;
        StackTraceElement[] b2 = Thread.currentThread().getStackTrace();
        if (b2.length <= 0) {
            return uSa.E;
        }
        stackTraceElementArray.I = new StackTraceElement[b2.length - yRa.d - a2];
        System.arraycopy(b2, yRa.d + a2, stackTraceElementArray.I, uSa.E, stackTraceElementArray.I.length);
        return stackTraceElementArray.I.length;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Dha dha2, XF xF2, IBlockState iBlockState) {
        void b2;
        Dha a2;
        Object c2 = iBlockState;
        Dha dha3 = a2 = dha2;
        dha3.J(Iqa.F, (Callable<String>)new Bia((IBlockState)c2));
        dha3.J(kra.da, (Callable<String>)new GIa((XF)b2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Object object) {
        void b2;
        Object c2 = object;
        Dha_3 a2 = this;
        a2.j.add(new Oia((String)b2, c2));
    }

    public StackTraceElement[] J() {
        Dha_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        StackTraceElement c2 = stackTraceElement;
        Dha_3 b2 = this;
        if (b2.I.length != 0 && c2 != null) {
            StackTraceElement stackTraceElement3 = b2.I[uSa.E];
            if (stackTraceElement3.isNativeMethod() == c2.isNativeMethod() && stackTraceElement3.getClassName().equals(c2.getClassName()) && stackTraceElement3.getFileName().equals(c2.getFileName()) && stackTraceElement3.getMethodName().equals(c2.getMethodName())) {
                Dha_3 dha_3;
                int n2;
                void a2;
                if (a2 != null) {
                    n2 = vRa.d;
                    dha_3 = b2;
                } else {
                    n2 = uSa.E;
                    dha_3 = b2;
                }
                if (n2 != (dha_3.I.length > vRa.d ? vRa.d : uSa.E)) {
                    return uSa.E != 0;
                }
                if (a2 != null && !b2.I[vRa.d].equals(a2)) {
                    return uSa.E != 0;
                }
                b2.I[uSa.E] = c2;
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Throwable throwable) {
        void b2;
        Throwable c2 = throwable;
        Dha_3 a2 = this;
        a2.J((String)b2, (Object)c2);
    }

    /*
     * WARNING - void declaration
     */
    public Dha_3(RIa rIa2, String string) {
        void b2;
        String c2 = string;
        Dha_3 a2 = this;
        a2.j = Lists.newArrayList();
        a2.I = new StackTraceElement[uSa.E];
        Dha_3 dha_3 = a2;
        dha_3.J = b2;
        dha_3.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Callable<String> callable) {
        void b2;
        Callable<String> c22 = callable;
        Dha_3 a2 = this;
        try {
            a2.J((String)b2, c22.call());
            return;
        }
        catch (Throwable c22) {
            a2.J((String)b2, c22);
            return;
        }
    }

    public void J(int n2) {
        int b22 = n2;
        Dha_3 a2 = this;
        StackTraceElement[] b22 = new StackTraceElement[a2.I.length - b22];
        System.arraycopy(a2.I, uSa.E, b22, uSa.E, b22.length);
        a2.I = b22;
    }
}

