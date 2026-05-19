/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Ay
 *  DQa
 *  ERa
 *  Faa
 *  I
 *  KA
 *  KZ
 *  Kna
 *  Kpa
 *  MQa
 *  Mz
 *  NTa
 *  Oz
 *  Pqa
 *  Qqa
 *  Qta
 *  Rua
 *  VQa
 *  Vua
 *  WSa
 *  XTa
 *  YSa
 *  Ypa
 *  Zua
 *  bFa
 *  cQa
 *  ema
 *  hTa
 *  jsa
 *  lqa
 *  nQa
 *  nka
 *  pQa
 *  pY
 *  pua
 *  qta
 *  sMa
 *  uKa
 *  uQa
 *  uw
 *  vL
 *  vRa
 *  wi
 *  ysa
 *  zsa
 */
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Hma_3
extends KA {
    private final Kpa J;
    private final Kna A;
    private static final String I = "CL_00001956";

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, int n4, int n5) {
        void a2;
        void d2;
        int e2 = n4;
        Hma_3 b2 = this;
        if (d2 < e2) {
            return b2.J(Ura.I, DQa.ja, (float)d2 / (float)e2);
        }
        return b2.J(DQa.ja, jsa.U, (float)(d2 - e2) / (float)(a2 - e2));
    }

    private static long J(long a2) {
        return a2 / yRa.H / yRa.H;
    }

    /*
     * WARNING - void declaration
     */
    public void f(sMa sMa2) {
        int n2;
        Hma_3 hma_3 = this;
        List<String> list = hma_3.f();
        int n3 = n2 = uSa.E;
        while (n3 < list.size()) {
            String string = list.get(n2);
            if (!Strings.isNullOrEmpty(string)) {
                void a2;
                Hma_3 hma_32 = hma_3;
                int n4 = hma_32.A.u;
                int n5 = hma_32.A.J(string);
                int b2 = a2.f() - uqa.g - n5;
                int n6 = uqa.g + n4 * n2;
                Hma_3.J((int)(b2 - vRa.d), (int)(n6 - vRa.d), (int)(b2 + n5 + vRa.d), (int)(n6 + n4 - vRa.d), (int)kra.Ka);
                hma_32.A.J(string, b2, n6, pQa.P);
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, float f2) {
        void a2;
        int b2;
        int d2 = n2;
        Hma_3 c2 = this;
        int n4 = d2 >> osa.c & osa.Ja;
        int n5 = d2 >> ERa.C & osa.Ja;
        int n6 = d2 >> Yqa.i & osa.Ja;
        d2 &= osa.Ja;
        int n7 = b2 >> osa.c & osa.Ja;
        int n8 = b2 >> ERa.C & osa.Ja;
        int n9 = b2 >> Yqa.i & osa.Ja;
        n4 = Oz.f((int)((int)((float)n4 + (float)(n7 - n4) * a2)), (int)uSa.E, (int)osa.Ja);
        n5 = Oz.f((int)((int)((float)n5 + (float)(n8 - n5) * a2)), (int)uSa.E, (int)osa.Ja);
        n6 = Oz.f((int)((int)((float)n6 + (float)(n9 - n6) * a2)), (int)uSa.E, (int)osa.Ja);
        d2 = Oz.f((int)((int)((float)d2 + (float)((b2 &= osa.Ja) - d2) * a2)), (int)uSa.E, (int)osa.Ja);
        return n4 << osa.c | n5 << ERa.C | n6 << Yqa.i | d2;
    }

    public void J(sMa sMa2) {
        Hma_3 a2;
        Hma_3 b2 = sMa2;
        Hma_3 hma_3 = a2 = this;
        a2.J.U.J(nua.U);
        uKa.e();
        hma_3.J();
        hma_3.f((sMa)b2);
        uKa.D();
        hma_3.J.U.f();
    }

    private boolean J() {
        Hma_3 a2;
        if (a2.J.c.W() || a2.J.z.Na) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f() {
        Hma_3 hma_3 = this;
        uKa.u();
        pZ pZ2 = hma_3.J.J();
        int n2 = pZ2.f();
        int n3 = pZ2.J();
        long[] lArray = pZ2.J();
        Hma_3 a2 = new sMa(hma_3.J);
        int n4 = uSa.E;
        Hma_3.J((int)uSa.E, (int)(a2.J() - Psa.M), (int)YSa.c, (int)a2.J(), (int)kra.Ka);
        int n5 = n2;
        while (n5 != n3) {
            pZ pZ3 = pZ2;
            int n6 = pZ3.J(lArray[n2], Fsa.d);
            int n7 = hma_3.J(Oz.f((int)n6, (int)uSa.E, (int)Psa.M), uSa.E, Fsa.d, Psa.M);
            hma_3.f(n4++, a2.J(), a2.J() - n6, n7);
            n5 = pZ3.J(n2 + vRa.d);
        }
        Hma_3.J((int)vRa.d, (int)(a2.J() - Fsa.d + vRa.d), (int)hpa.Z, (int)(a2.J() - Fsa.d + NTa.C), (int)kra.Ka);
        Hma_3 hma_32 = hma_3;
        hma_3.A.J(qta.C, uqa.g, a2.J() - Fsa.d + uqa.g, pQa.P);
        hma_32.l(uSa.E, fPa.b, a2.J() - Fsa.d, pua.o);
        Hma_3.J((int)vRa.d, (int)(a2.J() - Psa.M + vRa.d), (int)hpa.Z, (int)(a2.J() - Psa.M + NTa.C), (int)kra.Ka);
        hma_32.A.J(Qta.W, uqa.g, a2.J() - Psa.M + uqa.g, pQa.P);
        Hma_3 hma_33 = hma_3;
        hma_33.l(uSa.E, fPa.b, a2.J() - Psa.M, pua.o);
        hma_33.l(uSa.E, fPa.b, a2.J() - vRa.d, pua.o);
        hma_33.f(uSa.E, a2.J() - Psa.M, a2.J(), pua.o);
        hma_33.f(fPa.b, a2.J() - Psa.M, a2.J(), pua.o);
        if (hma_32.J.z.HB <= sOa.D) {
            hma_3.l(uSa.E, fPa.b, a2.J() - Psa.M + hma_3.J.z.HB / uqa.g, Zua.w);
        }
        uKa.J();
    }

    public void J() {
        int a2;
        Hma_3 hma_3 = this;
        List<String> list = hma_3.J();
        int n2 = a2 = uSa.E;
        while (n2 < list.size()) {
            String string = list.get(a2);
            if (!Strings.isNullOrEmpty(string)) {
                Hma_3 hma_32 = hma_3;
                int n3 = hma_32.A.u;
                int n4 = hma_32.A.J(string);
                int n5 = uqa.g + n3 * a2;
                Hma_3.J((int)vRa.d, (int)(n5 - vRa.d), (int)(uqa.g + n4 + vRa.d), (int)(n5 + n3 - vRa.d), (int)kra.Ka);
                hma_32.A.J(string, uqa.g, n5, pQa.P);
            }
            n2 = ++a2;
        }
    }

    public List<String> f() {
        Hma_3 hma_3 = this;
        long l2 = Runtime.getRuntime().maxMemory();
        long l3 = Runtime.getRuntime().totalMemory();
        long l4 = Runtime.getRuntime().freeMemory();
        l4 = l3 - l4;
        String[] stringArray = new String[WOa.fa];
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = System.getProperty(lqa.Ga);
        objectArray[vRa.d] = hma_3.J.e() ? ysa.s : fPa.i;
        stringArray[uSa.E] = String.format(uQa.w, objectArray);
        Object[] objectArray2 = new Object[yRa.d];
        objectArray2[uSa.E] = l4 * WSa.Ia / l2;
        objectArray2[vRa.d] = Hma_3.J(l4);
        objectArray2[uqa.g] = Hma_3.J(l2);
        stringArray[vRa.d] = String.format(Rua.R, objectArray2);
        Object[] objectArray3 = new Object[uqa.g];
        objectArray3[uSa.E] = l3 * WSa.Ia / l2;
        objectArray3[vRa.d] = Hma_3.J(l3);
        stringArray[uqa.g] = String.format(VQa.Q, objectArray3);
        stringArray[yRa.d] = Mqa.y;
        Object[] objectArray4 = new Object[vRa.d];
        objectArray4[uSa.E] = nka.f();
        stringArray[AQa.P] = String.format(XOa.B, objectArray4);
        stringArray[tTa.h] = Mqa.y;
        Object[] objectArray5 = new Object[yRa.d];
        objectArray5[uSa.E] = Display.getWidth();
        objectArray5[vRa.d] = Display.getHeight();
        objectArray5[uqa.g] = GL11.glGetString(PRa.m);
        stringArray[uua.p] = String.format(Qra.s, objectArray5);
        stringArray[XTa.W] = GL11.glGetString(Ora.J);
        stringArray[Yqa.i] = GL11.glGetString(zsa.ca);
        ArrayList<String> arrayList = Lists.newArrayList(stringArray);
        if (hma_3.J()) {
            return arrayList;
        }
        if (!uw.u && hma_3.J.Oa != null && hma_3.J.Oa.A == AY.BLOCK && hma_3.J.Oa.J() != null) {
            Hma_3 hma_32 = hma_3;
            XF xF2 = hma_32.J.Oa.J();
            IBlockState iBlockState = hma_32.J.Ta.J(xF2);
            if (hma_32.J.Ta.J() != Fy.A) {
                iBlockState = iBlockState.J().J(iBlockState, (I)hma_3.J.Ta, xF2);
            }
            arrayList.add(Mqa.y);
            arrayList.add(String.valueOf(Block.blockRegistry.f(iBlockState.J())));
            Iterator iterator = ((ImmutableSet)iBlockState.J().entrySet()).iterator();
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                ArrayList<String> arrayList2;
                Map.Entry entry = (Map.Entry)iterator.next();
                Object a2 = entry.getValue().toString();
                if (entry.getValue() == Boolean.TRUE) {
                    a2 = pY.GREEN + (String)a2;
                    arrayList2 = arrayList;
                } else {
                    if (entry.getValue() == Boolean.FALSE) {
                        a2 = pY.RED + (String)a2;
                    }
                    arrayList2 = arrayList;
                }
                arrayList2.add(((IProperty)entry.getKey()).J() + Xpa.E + (String)a2);
                iterator2 = iterator;
            }
        }
        return arrayList;
    }

    public Hma_3(Kpa kpa2) {
        Hma_3 a2;
        Hma_3 b2 = kpa2;
        Hma_3 hma_3 = a2 = this;
        hma_3.J = b2;
        hma_3.A = ((Kpa)b2).Ea;
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> J() {
        String string;
        Hma_3 hma_3 = this;
        XF a22 = new XF(hma_3.J.J().la, hma_3.J.J().J().j, hma_3.J.J().A);
        if (hma_3.J()) {
            String[] stringArray = new String[XTa.W];
            stringArray[uSa.E] = new StringBuilder().insert(3 & 4, Pqa.S).append(hma_3.J.J().J()).append(hpa.b).toString();
            stringArray[vRa.d] = hma_3.J.e;
            stringArray[uqa.g] = hma_3.J.Aa.J();
            stringArray[yRa.d] = new StringBuilder().insert(3 & 4, QTa.M).append(hma_3.J.f.J()).append(WRa.l).append(hma_3.J.Ta.J()).toString();
            stringArray[AQa.P] = hma_3.J.Ta.f();
            stringArray[tTa.h] = Mqa.y;
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a22.getX() & Ypa.A;
            objectArray[vRa.d] = a22.getY() & Ypa.A;
            objectArray[uqa.g] = a22.getZ() & Ypa.A;
            stringArray[uua.p] = String.format(Bta.b, objectArray);
            return Lists.newArrayList(stringArray);
        }
        Object object = hma_3.J.J();
        DZ dZ2 = object.J();
        String string2 = rua.P;
        switch (ema.I[dZ2.ordinal()]) {
            case 1: {
                string2 = Qta.j;
                break;
            }
            case 2: {
                string2 = nQa.A;
                break;
            }
            case 3: {
                string2 = hTa.Q;
                break;
            }
            case 4: {
                string2 = MQa.z;
                break;
            }
        }
        String string3 = OT.f(Mqa.y);
        if (!string3.equals(Mqa.y)) {
            string3 = new StringBuilder().insert(2 & 5, TOa.n).append(string3).toString();
        }
        if (OT.J()) {
            string3 = new StringBuilder().insert(3 >> 2, string3).append(Eqa.c).toString();
        }
        if (!(string = OT.J(Mqa.y)).equals(Mqa.y)) {
            string = new StringBuilder().insert(3 ^ 3, TOa.n).append(string).toString();
        }
        wi wi2 = OT.i.H;
        String[] stringArray = new String[NTa.C];
        stringArray[uSa.E] = new StringBuilder().insert(3 & 4, Pqa.S).append(hma_3.J.J().J()).append(string3).append(string).append(hpa.b).toString();
        stringArray[vRa.d] = hma_3.J.e;
        stringArray[uqa.g] = hma_3.J.Aa.J();
        stringArray[yRa.d] = new StringBuilder().insert(5 >> 3, Psa.U).append(hma_3.J.f.J()).toString();
        stringArray[AQa.P] = new StringBuilder().insert(5 >> 3, xqa.L).append(wi2.m).append(WSa.f).append(wi2.i.J().size()).append(Qqa.P).append(OT.i.F.J).append(WSa.f).append(OT.i.F.k.size()).append(ERa.Ja).append(wi2.M.l()).append(Ira.c).append(wi2.M.J()).append(uqa.L).append(wi2.M.f()).append(FRa.Q).append(wi2.k).append(WSa.f).append(wi2.J.J()).append(vua.Da).toString();
        stringArray[tTa.h] = Mqa.y;
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = hma_3.J.J().la;
        objectArray[vRa.d] = hma_3.J.J().J().j;
        objectArray[uqa.g] = hma_3.J.J().A;
        stringArray[uua.p] = String.format(cQa.X, objectArray);
        Object[] objectArray2 = new Object[yRa.d];
        objectArray2[uSa.E] = a22.getX();
        objectArray2[vRa.d] = a22.getY();
        objectArray2[uqa.g] = a22.getZ();
        stringArray[XTa.W] = String.format(WSa.z, objectArray2);
        Object[] objectArray3 = new Object[uua.p];
        objectArray3[uSa.E] = a22.getX() & Ypa.A;
        objectArray3[vRa.d] = a22.getY() & Ypa.A;
        objectArray3[uqa.g] = a22.getZ() & Ypa.A;
        objectArray3[yRa.d] = a22.getX() >> AQa.P;
        objectArray3[AQa.P] = a22.getY() >> AQa.P;
        objectArray3[tTa.h] = a22.getZ() >> AQa.P;
        stringArray[Yqa.i] = String.format(zOa.ca, objectArray3);
        Object[] objectArray4 = new Object[AQa.P];
        objectArray4[uSa.E] = dZ2;
        objectArray4[vRa.d] = string2;
        objectArray4[uqa.g] = Float.valueOf(Oz.f((float)((vL)object).X));
        objectArray4[yRa.d] = Float.valueOf(Oz.f((float)((vL)object).d));
        stringArray[WOa.fa] = String.format(Jsa.m, objectArray4);
        object = Lists.newArrayList(stringArray);
        if (hma_3.J.Ta != null && hma_3.J.Ta.F(a22)) {
            Faa faa2 = hma_3.J.Ta.J(a22);
            boolean bl2 = ((ArrayList)object).add(xra.Ja + faa2.J((XF)a22, (Ay)hma_3.J.Ta.J()).Ma);
            Hma_3 hma_32 = hma_3;
            ((ArrayList)object).add(new StringBuilder().insert(5 >> 3, tpa.u).append(faa2.J(a22, uSa.E)).append(nQa.T).append(faa2.J(Mz.SKY, a22)).append(qQa.B).append(faa2.J(Mz.BLOCK, a22)).append(csa.y).toString());
            KZ a22 = hma_32.J.Ta.J(a22);
            if (hma_32.J.d() && hma_3.J.J() != null && (string2 = hma_3.J.J().J().J(hma_3.J.c.J())) != null) {
                a22 = ((bFa)string2).j.J(new XF((vL)string2));
            }
            Object[] objectArray5 = new Object[uqa.g];
            objectArray5[uSa.E] = Float.valueOf(a22.J());
            objectArray5[vRa.d] = hma_3.J.Ta.f() / dua.Aa;
            ((ArrayList)object).add(String.format(tTa.F, objectArray5));
        }
        if (hma_3.J.R != null && hma_3.J.R.J()) {
            ((ArrayList)object).add(new StringBuilder().insert(0, Vua.y).append(hma_3.J.R.J().J()).toString());
        }
        if (!uw.u && hma_3.J.Oa != null && hma_3.J.Oa.A == AY.BLOCK && hma_3.J.Oa.J() != null) {
            XF xF2 = hma_3.J.Oa.J();
            Object[] objectArray6 = new Object[yRa.d];
            objectArray6[uSa.E] = xF2.getX();
            objectArray6[vRa.d] = xF2.getY();
            objectArray6[uqa.g] = xF2.getZ();
            ((ArrayList)object).add(String.format(ySa.z, objectArray6));
        }
        return object;
    }
}

