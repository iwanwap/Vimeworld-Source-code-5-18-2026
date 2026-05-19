/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  Dha
 *  ERa
 *  Gua
 *  JPa
 *  MZ
 *  NPa
 *  PTa
 *  Pqa
 *  RIa
 *  Spa
 *  U
 *  Uqa
 *  YSa
 *  Yra
 *  ZRa
 *  bja
 *  bqa
 *  dQa
 *  fIa
 *  hTa
 *  iIa
 *  jRa
 *  lPa
 *  pua
 *  vRa
 *  yQa
 *  yra
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KLa {
    public List q;
    private static String x = lPa.Q;
    public int v;
    private float o;
    public KLa h;
    public int K;
    private static String H = NPa.p;
    public int c;
    public float B;
    public int d;
    public boolean a;
    public boolean b;
    private int l;
    public KLa e;
    public int G;
    private float D;
    public int f;
    private fIa F;
    public KLa g;
    public int L;
    private static final String E = "CL_00001062";
    private float m;
    private float C;
    private final String i;
    public int[][] M;
    public int k;
    public boolean j;
    public int J;
    public int A;
    public float I;

    public float C() {
        KLa a2;
        return a2.m;
    }

    public int e() {
        KLa a2;
        return a2.q.size();
    }

    public int d() {
        KLa a2;
        return a2.A;
    }

    public fIa J() {
        KLa a2;
        return a2.F;
    }

    /*
     * WARNING - void declaration
     */
    public void J(BufferedImage[] bufferedImageArray, fIa fIa2) throws IOException {
        Object object;
        int n2;
        KLa kLa2;
        void a2;
        int c2;
        void b2;
        KLa kLa3;
        KLa kLa4 = kLa3 = this;
        void v1 = b2;
        kLa3.C();
        int n3 = b2[uSa.E].getWidth();
        int n4 = v1[uSa.E].getHeight();
        kLa4.d = n3;
        kLa4.G = n4;
        int[][] nArrayArray = new int[((void)v1).length][];
        int n5 = c2 = uSa.E;
        while (n5 < ((void)b2).length) {
            void var7_8 = b2[c2];
            if (var7_8 != null) {
                if (c2 > 0 && (var7_8.getWidth() != n3 >> c2 || var7_8.getHeight() != n4 >> c2)) {
                    Object[] objectArray = new Object[tTa.h];
                    objectArray[uSa.E] = c2;
                    objectArray[vRa.d] = var7_8.getWidth();
                    objectArray[uqa.g] = var7_8.getHeight();
                    objectArray[yRa.d] = n3 >> c2;
                    objectArray[AQa.P] = n4 >> c2;
                    throw new RuntimeException(String.format(Ora.s, objectArray));
                }
                nArrayArray[c2] = new int[var7_8.getWidth() * var7_8.getHeight()];
                void v4 = var7_8;
                v4.getRGB(uSa.E, uSa.E, v4.getWidth(), var7_8.getHeight(), nArrayArray[c2], uSa.E, var7_8.getWidth());
            }
            n5 = ++c2;
        }
        if (a2 == null) {
            if (n4 != n3) {
                throw new RuntimeException(hTa.F);
            }
            KLa kLa5 = kLa3;
            kLa2 = kLa5;
            kLa5.q.add(nArrayArray);
        } else {
            c2 = n4 / n3;
            int n6 = n3;
            n2 = n3;
            kLa3.G = kLa3.d;
            if (a2.l() > 0) {
                Object object2 = object = a2.J().iterator();
                while (object2.hasNext()) {
                    n3 = (Integer)object.next();
                    if (n3 >= c2) {
                        throw new RuntimeException(new StringBuilder().insert(3 & 4, bqa.V).append(n3).toString());
                    }
                    KLa kLa6 = kLa3;
                    kLa6.f(n3);
                    kLa6.q.set(n3, KLa.J(nArrayArray, n6, n2, n3));
                    object2 = object;
                }
                kLa2 = kLa3;
                kLa3.F = a2;
            } else {
                object = Lists.newArrayList();
                int n7 = n3 = uSa.E;
                while (n7 < c2) {
                    kLa3.q.add(KLa.J(nArrayArray, n6, n2, n3));
                    ((ArrayList)object).add(new iIa(n3++, pua.o));
                    n7 = n3;
                }
                kLa2 = kLa3;
                KLa kLa7 = kLa3;
                kLa3.F = new fIa((List)object, kLa7.d, kLa7.G, a2.C(), a2.J());
            }
        }
        if (!kLa2.j) {
            if (Config.h()) {
                kLa3.M();
            }
            int n8 = c2 = uSa.E;
            while (n8 < kLa3.q.size()) {
                int[][] nArray = (int[][])kLa3.q.get(c2);
                if (nArray != null && !kLa3.i.startsWith(uua.ga)) {
                    int n9 = uSa.E;
                    while (n9 < nArray.length) {
                        object = nArray[n2];
                        kLa3.J((int[])object);
                        n9 = ++n2;
                    }
                }
                n8 = ++c2;
            }
            if (kLa3.h != null) {
                kLa3.h.J((BufferedImage[])b2, (fIa)a2);
            }
        }
    }

    private void M() {
        KLa a22;
        ResourceLocation resourceLocation;
        String string;
        KLa kLa2 = this;
        kLa2.f = Config.J().C();
        if (pA.DA) {
            string = new StringBuilder().insert(5 >> 3, kLa2.i).append(ZRa.e).toString();
            resourceLocation = new ResourceLocation(string);
            resourceLocation = Config.J().J(resourceLocation, uSa.E);
            if (Config.f(resourceLocation)) {
                try {
                    KLa kLa3 = a22 = new KLa(string);
                    a22.j = vRa.d;
                    kLa3.J(kLa2);
                    kLa3.J(resourceLocation, kLa2.f + vRa.d);
                    a22.d(kLa2.f);
                    kLa2.g = a22;
                }
                catch (IOException a22) {
                    Config.J(new StringBuilder().insert(5 >> 3, Gua.t).append(string).toString());
                    Config.J(new StringBuilder().insert(2 & 5, a22.getClass().getName()).append(Xpa.E).append(a22.getMessage()).toString());
                }
            }
        }
        if (pA.hA) {
            string = new StringBuilder().insert(3 >> 2, kLa2.i).append(jRa.G).toString();
            resourceLocation = new ResourceLocation(string);
            resourceLocation = Config.J().J(resourceLocation, uSa.E);
            if (Config.f(resourceLocation)) {
                try {
                    KLa kLa4 = a22 = new KLa(string);
                    a22.j = vRa.d;
                    kLa4.J(kLa2);
                    kLa4.J(resourceLocation, kLa2.f + vRa.d);
                    a22.d(kLa2.f);
                    kLa2.e = a22;
                    return;
                }
                catch (IOException a22) {
                    Config.J(new StringBuilder().insert(3 & 4, Hra.p).append(string).toString());
                    Config.J(new StringBuilder().insert(3 ^ 3, a22.getClass().getName()).append(Xpa.E).append(a22.getMessage()).toString());
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void d(int n2) {
        void a2;
        int b2;
        KLa kLa2 = this;
        ArrayList<int[][]> arrayList = Lists.newArrayList();
        int n3 = b2 = uSa.E;
        while (n3 < kLa2.q.size()) {
            int[][] nArray = (int[][])kLa2.q.get(b2);
            if (nArray != null) {
                try {
                    arrayList.add(gLa.J((int)a2, kLa2.d, nArray));
                }
                catch (Throwable throwable) {
                    RIa rIa2 = RIa.J((Throwable)throwable, (String)JPa.a);
                    Dha dha = rIa2.J(BPa.ja);
                    dha.J(yQa.a, (Object)b2);
                    dha.J(Spa.u, (Callable)new OKa(kLa2, nArray));
                    throw new MZ(rIa2);
                }
            }
            n3 = ++b2;
        }
        KLa kLa3 = kLa2;
        kLa3.J(arrayList);
        if (kLa3.h != null) {
            kLa2.h.d((int)a2);
        }
    }

    public void e() {
        KLa a2;
        if (a2.J < 0) {
            a2.J = gLa.J();
            KLa kLa2 = a2;
            gLa.J(a2.J, kLa2.f, kLa2.d, a2.G);
            Cg.J();
        }
        Cg.J((int)a2.J);
    }

    public void C(int n2) {
        int b2 = n2;
        KLa a2 = this;
        a2.d = b2;
        if (a2.h != null) {
            KLa kLa2 = a2;
            kLa2.h.C(kLa2.d);
        }
    }

    public int[][] J(int n2) {
        int b2 = n2;
        KLa a2 = this;
        return (int[][])a2.q.get(b2);
    }

    public String toString() {
        KLa a2;
        return new StringBuilder().insert(3 >> 2, rua.ba).append(a2.i).append((char)CRa.L).append(lPa.e).append(a2.q.size()).append(PTa.Ha).append(a2.b).append(Xpa.Aa).append(a2.A).append(vua.S).append(a2.L).append(KQa.S).append(a2.G).append(Pqa.m).append(a2.d).append(nOa.Y).append(a2.C).append(LPa.Z).append(a2.m).append(Ura.ca).append(a2.o).append(YSa.K).append(a2.D).append((char)ySa.Z).toString();
    }

    public void d() {
        KLa a2;
        KLa kLa2 = a2;
        kLa2.q.clear();
        if (kLa2.h != null) {
            a2.h.d();
        }
    }

    /*
     * WARNING - void declaration
     */
    public float f(double d2) {
        void a2;
        KLa kLa2;
        KLa kLa3 = kLa2 = this;
        float b2 = kLa2.D - kLa3.o;
        return kLa3.o + b2 * ((float)a2 / Yra.i);
    }

    private void C() {
        KLa a2;
        KLa kLa2 = a2;
        kLa2.F = null;
        kLa2.J(Lists.newArrayList());
        kLa2.v = uSa.E;
        kLa2.K = uSa.E;
        if (kLa2.h != null) {
            a2.h.C();
        }
    }

    /*
     * WARNING - void declaration
     */
    public float J(double d2) {
        void a2;
        KLa kLa2;
        KLa kLa3 = kLa2 = this;
        float b2 = kLa2.m - kLa3.C;
        return kLa3.C + b2 * (float)a2 / Yra.i;
    }

    /*
     * WARNING - void declaration
     */
    private static int[][] J(int[][] nArray, int n2, int n3, int n4) {
        int d2;
        int[][] nArray2 = nArray;
        int[][] nArrayArray = new int[nArray2.length][];
        int n5 = d2 = uSa.E;
        while (n5 < nArray2.length) {
            int[] nArray3 = nArray2[d2];
            if (nArray3 != null) {
                void a2;
                void b2;
                void c2;
                int n6 = d2;
                nArrayArray[n6] = new int[(c2 >> d2) * (b2 >> n6)];
                System.arraycopy(nArray3, (int)(a2 * nArrayArray[d2].length), nArrayArray[d2], uSa.E, nArrayArray[d2].length);
            }
            n5 = ++d2;
        }
        return nArrayArray;
    }

    public String J() {
        KLa a2;
        return a2.i;
    }

    public void l(int n2) {
        int b2 = n2;
        KLa a2 = this;
        a2.G = b2;
        if (a2.h != null) {
            KLa kLa2 = a2;
            kLa2.h.l(kLa2.G);
        }
    }

    private void f(int n2) {
        int b2 = n2;
        KLa a2 = this;
        if (a2.q.size() <= b2) {
            int n3;
            int n4 = n3 = a2.q.size();
            while (n4 <= b2) {
                a2.q.add(null);
                n4 = ++n3;
            }
        }
        if (a2.h != null) {
            a2.h.f(b2);
        }
    }

    public void J(List list) {
        List b2 = list;
        KLa a2 = this;
        a2.q = b2;
        if (a2.h != null) {
            a2.h.J(b2);
        }
    }

    public List<int[][]> J() {
        KLa a2;
        ArrayList<int[][]> arrayList = new ArrayList<int[][]>();
        arrayList.addAll(a2.q);
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public double f(float f2) {
        void a2;
        KLa kLa2;
        KLa kLa3 = kLa2 = this;
        float b2 = kLa3.D - kLa3.o;
        return (double)((a2 - kLa2.o) / b2 * Yra.i);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ResourceLocation resourceLocation, int n2) throws IOException {
        int n3;
        void a22;
        IResource b2;
        KLa kLa2 = this;
        Object c22 = gLa.J((b2 = Config.J((ResourceLocation)((Object)b2))).J());
        if (kLa2.d != ((BufferedImage)c22).getWidth()) {
            c22 = Cg.J((BufferedImage)c22, (int)kLa2.d);
        }
        b2 = (fIa)b2.J(Spa.e);
        int[][] a22 = new int[a22][];
        Object object = c22;
        a22[uSa.E] = new int[((BufferedImage)object).getWidth() * ((BufferedImage)c22).getHeight()];
        ((BufferedImage)object).getRGB(uSa.E, uSa.E, ((BufferedImage)c22).getWidth(), ((BufferedImage)c22).getHeight(), a22[uSa.E], uSa.E, ((BufferedImage)c22).getWidth());
        if (b2 == null) {
            kLa2.q.add(a22);
            return;
        }
        int c22 = ((BufferedImage)c22).getHeight() / kLa2.d;
        if (b2.l() > 0) {
            Iterator iterator;
            Iterator iterator2 = iterator = b2.J().iterator();
            while (iterator2.hasNext()) {
                int n4 = (Integer)iterator.next();
                if (n4 >= c22) {
                    throw new RuntimeException(new StringBuilder().insert(2 & 5, bqa.V).append(n4).toString());
                }
                KLa kLa3 = kLa2;
                kLa3.f(n4);
                KLa kLa4 = kLa2;
                kLa3.q.set(n4, KLa.J(a22, kLa4.d, kLa4.d, n4));
                iterator2 = iterator;
            }
            kLa2.F = b2;
            return;
        }
        ArrayList<iIa> arrayList = Lists.newArrayList();
        int n5 = n3 = uSa.E;
        while (n5 < c22) {
            KLa kLa5 = kLa2;
            kLa2.q.add(KLa.J(a22, kLa5.d, kLa5.d, n3));
            arrayList.add(new iIa(n3++, pua.o));
            n5 = n3;
        }
        KLa kLa6 = kLa2;
        kLa2.F = new fIa(arrayList, kLa6.d, kLa6.G, b2.C(), b2.J());
    }

    public static void f(String a2) {
        H = a2;
    }

    public float l() {
        KLa a2;
        return a2.C;
    }

    public int C() {
        KLa a2;
        return a2.l;
    }

    public boolean J() {
        KLa a2;
        if (a2.F != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f(U u2, ResourceLocation resourceLocation) {
        ResourceLocation c2 = resourceLocation;
        KLa a2 = this;
        return vRa.d != 0;
    }

    public int l() {
        KLa a2;
        return a2.L;
    }

    public void l() {
        KLa a2;
        if (a2.J >= 0) {
            gLa.J(a2.J);
            a2.J = pua.o;
        }
    }

    public KLa(String string) {
        KLa a2;
        String b2 = string;
        KLa kLa2 = a2 = this;
        KLa kLa3 = a2;
        KLa kLa4 = a2;
        a2.q = Lists.newArrayList();
        kLa4.l = pua.o;
        kLa4.J = pua.o;
        kLa4.h = null;
        kLa3.a = uSa.E;
        kLa3.f = uSa.E;
        kLa3.g = null;
        kLa2.e = null;
        kLa2.j = uSa.E;
        kLa2.i = b2;
        if (Config.y()) {
            KLa kLa5 = a2;
            a2.h = new KLa(a2);
        }
    }

    public void f() {
        KLa kLa2 = this;
        if (kLa2.F != null) {
            KLa kLa3 = kLa2;
            kLa3.K += vRa.d;
            KLa kLa4 = kLa2;
            if (kLa3.K >= kLa4.F.f(kLa4.v)) {
                KLa kLa5 = kLa2;
                int n2 = kLa2.F.J(kLa5.v);
                int a2 = kLa5.F.l() == 0 ? kLa2.q.size() : kLa2.F.l();
                KLa kLa6 = kLa2;
                kLa6.v = (kLa6.v + vRa.d) % a2;
                kLa6.K = uSa.E;
                a2 = kLa6.F.J(kLa2.v);
                boolean bl = uSa.E;
                boolean bl2 = kLa6.a;
                if (n2 != a2 && a2 >= 0 && a2 < kLa2.q.size()) {
                    KLa kLa7 = kLa2;
                    KLa kLa8 = kLa2;
                    gLa.J((int[][])kLa2.q.get(a2), kLa7.d, kLa7.G, kLa8.A, kLa8.L, bl, bl2);
                    return;
                }
            } else if (kLa2.F.J()) {
                kLa2.J();
            }
        }
    }

    public void J(int n2) {
        int b2 = n2;
        KLa a2 = this;
        a2.l = b2;
    }

    public int f() {
        KLa a2;
        return a2.G;
    }

    public float f(float f2) {
        float b2 = f2;
        KLa a2 = this;
        b2 -= a2.B;
        float f3 = (float)a2.k / (float)a2.G;
        return b2 *= f3;
    }

    private KLa(KLa kLa2) {
        KLa a2;
        KLa b2 = kLa2;
        KLa kLa3 = a2 = this;
        KLa kLa4 = a2;
        KLa kLa5 = a2;
        KLa kLa6 = a2;
        a2.q = Lists.newArrayList();
        a2.l = pua.o;
        kLa6.J = pua.o;
        kLa5.h = null;
        kLa6.a = uSa.E;
        kLa5.f = uSa.E;
        kLa4.g = null;
        kLa4.e = null;
        kLa3.j = uSa.E;
        kLa3.i = b2.i;
        kLa3.a = vRa.d;
    }

    public void J(KLa kLa2) {
        KLa b2 = kLa2;
        KLa a2 = this;
        KLa kLa3 = b2;
        KLa kLa4 = a2;
        KLa kLa5 = b2;
        KLa kLa6 = a2;
        KLa kLa7 = b2;
        a2.A = kLa7.A;
        kLa6.L = kLa7.L;
        kLa6.d = b2.d;
        a2.G = kLa5.G;
        kLa4.b = kLa5.b;
        kLa4.C = b2.C;
        a2.m = kLa3.m;
        a2.o = kLa3.o;
        a2.D = b2.D;
        if (a2.h != null) {
            KLa kLa8 = a2;
            kLa8.h.J(kLa8.d, a2.G, uSa.E, uSa.E, uSa.E != 0);
        }
    }

    public float f() {
        KLa a2;
        return a2.D;
    }

    public void J(fIa fIa2) {
        KLa b2 = fIa2;
        KLa a2 = this;
        a2.F = b2;
    }

    public static void J(String a2) {
        x = a2;
    }

    public float J(float f2) {
        float b2 = f2;
        KLa a2 = this;
        b2 -= a2.I;
        float f3 = (float)a2.c / (float)a2.d;
        return b2 *= f3;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray) {
        void a2;
        KLa kLa2 = this;
        if (a2 != null) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            long l2 = nqa.i;
            long l3 = nqa.i;
            long l4 = nqa.i;
            long l5 = nqa.i;
            int n7 = n6 = uSa.E;
            while (n7 < ((void)a2).length) {
                n5 = a2[n6];
                n4 = n5 >> osa.c & osa.Ja;
                if (n4 >= ERa.C) {
                    n3 = n5 >> ERa.C & osa.Ja;
                    int b2 = n5 >> Yqa.i & osa.Ja;
                    n2 = n5 & osa.Ja;
                    l2 += (long)n3;
                    l3 += (long)b2;
                    l4 += (long)n2;
                    l5 += dQa.Ga;
                }
                n7 = ++n6;
            }
            if (l5 > nqa.i) {
                int b2;
                n6 = (int)(l2 / l5);
                n5 = (int)(l3 / l5);
                n4 = (int)(l4 / l5);
                n3 = n6 << ERa.C | n5 << Yqa.i | n4;
                int n8 = b2 = uSa.E;
                while (n8 < ((void)a2).length) {
                    n2 = a2[b2];
                    if ((n2 >> osa.c & osa.Ja) <= ERa.C) {
                        a2[b2] = n3;
                    }
                    n8 = ++b2;
                }
            }
        }
    }

    public static KLa J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        String a2 = resourceLocation2.toString();
        if (x.equals(a2)) {
            return new bja(a2);
        }
        if (H.equals(a2)) {
            return new rja(a2);
        }
        return new KLa(a2);
    }

    private void J() {
        KLa kLa2;
        KLa kLa3 = kLa2 = this;
        double d2 = oua.i - (double)kLa2.K / (double)kLa3.F.f(kLa3.v);
        KLa kLa4 = kLa2;
        int n2 = kLa2.F.J(kLa4.v);
        int n3 = kLa4.F.l() == 0 ? kLa2.q.size() : kLa2.F.l();
        KLa kLa5 = kLa2;
        if (n2 != (n3 = kLa5.F.J((kLa5.v + vRa.d) % n3)) && n3 >= 0 && n3 < kLa2.q.size()) {
            int a2;
            int[][] nArray = (int[][])kLa2.q.get(n2);
            int[][] nArray2 = (int[][])kLa2.q.get(n3);
            if (kLa2.M == null || kLa2.M.length != nArray.length) {
                kLa2.M = new int[nArray.length][];
            }
            int n4 = a2 = uSa.E;
            while (n4 < nArray.length) {
                if (kLa2.M[a2] == null) {
                    int n5 = a2;
                    kLa2.M[n5] = new int[nArray[n5].length];
                }
                if (a2 < nArray2.length && nArray2[a2].length == nArray[a2].length) {
                    int n6 = uSa.E;
                    while (n6 < nArray[a2].length) {
                        int n7;
                        int n8 = nArray[a2][n7];
                        int n9 = nArray2[a2][n7];
                        int n10 = (int)((double)((n8 & Zqa.E) >> ERa.C) * d2 + (double)((n9 & Zqa.E) >> ERa.C) * (oua.i - d2));
                        int n11 = (int)((double)((n8 & Uqa.Q) >> Yqa.i) * d2 + (double)((n9 & Uqa.Q) >> Yqa.i) * (oua.i - d2));
                        n9 = (int)((double)(n8 & osa.Ja) * d2 + (double)(n9 & osa.Ja) * (oua.i - d2));
                        kLa2.M[a2][n7++] = n8 & gsa.X | n10 << ERa.C | n11 << Yqa.i | n9;
                        n6 = n7;
                    }
                }
                n4 = ++a2;
            }
            KLa kLa6 = kLa2;
            KLa kLa7 = kLa2;
            gLa.J(kLa6.M, kLa6.d, kLa7.G, kLa7.A, kLa2.L, uSa.E != 0, uSa.E != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public double J(float f2) {
        void a2;
        KLa kLa2;
        KLa kLa3 = kLa2 = this;
        float b2 = kLa3.m - kLa3.C;
        return (double)((a2 - kLa2.C) / b2 * Yra.i);
    }

    public int J() {
        KLa a2;
        return a2.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, boolean bl) {
        void d2;
        void e2;
        void a2;
        void f2;
        void c2;
        KLa b2;
        int n6 = n5;
        KLa kLa2 = b2 = this;
        KLa kLa3 = b2;
        b2.A = c2;
        kLa3.L = f2;
        kLa3.b = a2;
        float f3 = (float)(yra.d / (double)e2);
        float f4 = (float)(yra.d / (double)d2);
        kLa2.C = (float)c2 / (float)e2 + f3;
        b2.m = (float)(c2 + b2.d) / (float)e2 - f3;
        kLa2.o = (float)f2 / (float)d2 + f4;
        kLa2.D = (float)(f2 + b2.G) / (float)d2 - f4;
        kLa2.I = Math.min(kLa2.C, b2.m);
        kLa2.B = Math.min(kLa2.o, b2.D);
        if (kLa2.h != null) {
            KLa kLa4 = b2;
            kLa4.h.J(kLa4.d, b2.G, uSa.E, uSa.E, uSa.E != 0);
        }
        if (b2.g != null) {
            b2.g.J((int)e2, (int)d2, (int)c2, (int)f2, (boolean)a2);
        }
        if (b2.e != null) {
            b2.e.J((int)e2, (int)d2, (int)c2, (int)f2, (boolean)a2);
        }
    }

    public float J() {
        KLa a2;
        return a2.o;
    }

    public boolean J(U u2, ResourceLocation resourceLocation) {
        ResourceLocation c2 = resourceLocation;
        KLa a2 = this;
        return uSa.E != 0;
    }
}

