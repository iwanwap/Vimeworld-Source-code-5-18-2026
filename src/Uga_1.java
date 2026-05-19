/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  FTa
 *  MBa
 *  Mha
 *  NQa
 *  NTa
 *  OCa
 *  Pqa
 *  Qc
 *  Qsa
 *  Sqa
 *  Tpa
 *  URa
 *  Usa
 *  VQa
 *  XTa
 *  Ysa
 *  asa
 *  cQa
 *  cra
 *  dQa
 *  eHa
 *  fpa
 *  kqa
 *  lqa
 *  oGa
 *  pPa
 *  psa
 *  vRa
 *  zsa
 */
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Uga_1
extends Mha {
    private static final Logger logger = LogManager.getLogger();
    private long field_147206_b;
    private int field_147207_c;

    /*
     * WARNING - void declaration
     */
    private void func_147202_a(int n2, String string, StringBuilder stringBuilder) {
        void b2;
        Uga_1 uga_1 = this;
        List list = OCa.J().K.J((String)b2);
        if (list != null && list.size() >= yRa.d) {
            int n3;
            int n4 = n3 = vRa.d;
            while (n4 < list.size()) {
                void a2;
                void c2;
                Uga_1 d2 = (MBa)list.get(n3);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = (int)c2;
                a2.append(String.format(NQa.ha, objectArray));
                int n5 = uSa.E;
                int n6 = n5;
                while (n6 < c2) {
                    a2.append(Tpa.E);
                    n6 = ++n5;
                }
                Object[] objectArray2 = new Object[vRa.d];
                objectArray2[uSa.E] = ((MBa)d2).field_76332_a;
                Object[] objectArray3 = new Object[vRa.d];
                objectArray3[uSa.E] = ((MBa)d2).field_76330_b;
                a2.append(((MBa)d2).field_76331_c).append(pPa.I).append(String.format(zsa.fa, objectArray2)).append(mPa.D).append(String.format(zsa.fa, objectArray3)).append(zOa.n);
                if (!((MBa)d2).field_76331_c.equals(Qsa.h)) {
                    try {
                        uga_1.func_147202_a((int)(c2 + vRa.d), new StringBuilder().insert(2 & 5, (String)b2).append(VQa.ja).append(((MBa)d2).field_76331_c).toString(), (StringBuilder)a2);
                    }
                    catch (Exception exception) {
                        a2.append(gua.w).append(exception).append(rpa.I);
                    }
                }
                n4 = ++n3;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void func_147205_a(long l2, int n2) {
        Uga_1 uga_1 = this;
        File file = new File(OCa.J().J(nua.U), new StringBuilder().insert(3 ^ 3, Hra.B).append(new SimpleDateFormat(fpa.P).format(new Date())).append(dQa.S).toString());
        file.getParentFile().mkdirs();
        try {
            void a2;
            void b2;
            Object c2 = new FileWriter(file);
            ((Writer)c2).write(uga_1.func_147204_b((long)b2, (int)a2));
            ((OutputStreamWriter)c2).close();
            return;
        }
        catch (Throwable c2) {
            logger.error(new StringBuilder().insert(3 ^ 3, pPa.o).append(file).toString(), c2);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String[] c22 = stringArray;
        String[] a2 = this;
        if (c22.length < vRa.d) {
            throw new eHa(LPa.s, new Object[uSa.E]);
        }
        if (c22[uSa.E].equals(FTa.G)) {
            if (c22.length != vRa.d) {
                throw new eHa(LPa.s, new Object[uSa.E]);
            }
            Uga_1.notifyOperators((u)b2, (Qc)a2, (String)Ysa.G, (Object[])new Object[uSa.E]);
            OCa.J().f();
            a2.field_147206_b = OCa.J();
            a2.field_147207_c = OCa.J().J();
            return;
        }
        if (!c22[uSa.E].equals(vsa.L)) {
            throw new eHa(LPa.s, new Object[uSa.E]);
        }
        if (c22.length != vRa.d) {
            throw new eHa(LPa.s, new Object[uSa.E]);
        }
        if (!OCa.J().K.e) {
            throw new oGa(xSa.m, new Object[uSa.E]);
        }
        long l2 = OCa.J();
        int c22 = OCa.J().J();
        super.func_147205_a(l2 -= a2.field_147206_b, c22 -= a2.field_147207_c);
        OCa.J().K.e = uSa.E;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = Float.valueOf((float)l2 / Jpa.r);
        objectArray[vRa.d] = c22;
        Uga_1.notifyOperators((u)b2, (Qc)a2, (String)kqa.H, (Object[])objectArray);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Uga_1 a2 = this;
        return LPa.s;
    }

    private static String func_147203_d() {
        String[] stringArray = new String[hpa.Z];
        stringArray[uSa.E] = sqa.y;
        stringArray[vRa.d] = Sqa.T;
        stringArray[uqa.g] = psa.I;
        stringArray[yRa.d] = dQa.W;
        stringArray[AQa.P] = Usa.W;
        stringArray[tTa.h] = xTa.H;
        stringArray[uua.p] = Lsa.i;
        stringArray[XTa.W] = uSa.u;
        stringArray[Yqa.i] = pPa.K;
        stringArray[WOa.fa] = asa.Ka;
        stringArray[NTa.C] = cra.ja;
        stringArray[pPa.f] = zua.x;
        stringArray[lqa.s] = POa.Ga;
        stringArray[uua.s] = Era.w;
        String[] stringArray2 = stringArray;
        try {
            return stringArray2[(int)(System.nanoTime() % (long)stringArray2.length)];
        }
        catch (Throwable throwable) {
            return wsa.I;
        }
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = FTa.G;
            stringArray2[vRa.d] = vsa.L;
            return Uga_1.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private String func_147204_b(long l2, int n2) {
        void a2;
        void b2;
        Uga_1 uga_1 = this;
        StringBuilder c2 = new StringBuilder();
        StringBuilder stringBuilder = c2.append(Cta.L);
        StringBuilder stringBuilder2 = c2;
        c2.append(URa.P);
        stringBuilder2.append(Uga_1.func_147203_d());
        c2.append(Pqa.D);
        c2.append(Pua.s).append((long)b2).append(cQa.G);
        c2.append(BPa.N).append((int)a2).append(nua.o);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = Float.valueOf((float)a2 / ((float)b2 / Jpa.r));
        stringBuilder2.append(Zqa.h).append(String.format(zsa.fa, objectArray)).append(cTa.H).append(kTa.j).append(dqa.F);
        c2.append(SPa.a);
        uga_1.func_147202_a(uSa.E, gua.u, c2);
        c2.append(NSa.N);
        return c2.toString();
    }

    public String getCommandName() {
        return nua.U;
    }

    public Uga_1() {
        Uga_1 a2;
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }
}

