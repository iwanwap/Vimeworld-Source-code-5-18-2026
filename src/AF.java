/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  MQa
 *  NTa
 *  XTa
 *  ZRa
 *  bE
 *  cQa
 *  hra
 *  pPa
 *  pua
 *  vRa
 *  ysa
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AF {
    public int O = vRa.d;
    public int t;
    public int R;
    public int Q;
    public int N;
    public Rectangle T;
    public boolean p;
    public int n;
    public int s;
    public boolean w;
    public boolean W;
    public byte[] q;
    public int x;
    public int v;
    public int[] o;
    public byte[] h = new byte[hra.Ja];
    public byte[] K;
    public int H;
    public int c;
    public int B;
    public int d;
    public int a;
    public int b;
    public byte[] l;
    public BufferedImage e;
    public int[] G;
    public short[] D;
    public int[] f;
    public BufferedImage F;
    public int g;
    public static final int L = 0;
    public int E;
    public BufferedInputStream m;
    public static final int C = 4096;
    public boolean i;
    public static final int M = 1;
    public int k;
    public int j = uSa.E;
    public static final int J = 2;
    public ArrayList<bE> A;
    public int I;

    public void G() {
        AF aF = this;
        do {
            AF aF2 = aF;
            aF2.l();
            if (aF2.h[uSa.E] != vRa.d) continue;
            AF aF3 = aF;
            int a2 = aF3.h[vRa.d] & osa.Ja;
            aF3.O = (aF3.h[uqa.g] & osa.Ja) << Yqa.i | a2;
        } while (aF.j > 0 && !aF.J());
    }

    public int d() {
        AF a2;
        return a2.O;
    }

    public boolean J() {
        AF a2;
        if (a2.H != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int C() {
        AF aF = this;
        int a2 = uSa.E;
        try {
            a2 = aF.m.read();
            return a2;
        }
        catch (IOException iOException) {
            aF.H = vRa.d;
            return a2;
        }
    }

    public Dimension J() {
        AF a2;
        AF aF = a2;
        return new Dimension(aF.v, aF.k);
    }

    public void D() {
        AF a2;
        AF aF;
        do {
            aF = a2;
            aF.l();
        } while (aF.j > 0 && !a2.J());
    }

    public void A() {
        AF a2;
        AF aF = a2;
        AF aF2 = a2;
        aF2.s = aF2.c;
        AF aF3 = a2;
        AF aF4 = a2;
        a2.T = new Rectangle(a2.Q, aF4.R, aF4.g, a2.I);
        aF2.e = aF2.F;
        aF2.b = aF2.a;
        aF2.c = uSa.E;
        aF.i = uSa.E;
        aF.N = uSa.E;
        aF.o = null;
    }

    public void i() {
        AF aF;
        AF aF2 = aF = this;
        aF2.Q = aF2.f();
        aF2.R = aF2.f();
        aF2.g = aF2.f();
        aF2.I = aF2.f();
        int a2 = aF2.C();
        aF2.w = (a2 & XOa.h) != 0 ? vRa.d : uSa.E;
        aF.W = (a2 & ysa.s) != 0 ? vRa.d : uSa.E;
        aF.d = uqa.g << (a2 & XTa.W);
        AF aF3 = aF;
        if (aF.w) {
            AF aF4 = aF;
            aF3.o = aF4.J(aF4.d);
            aF.f = aF.o;
        } else {
            aF3.f = aF.G;
            AF aF5 = aF;
            if (aF5.x == aF5.t) {
                aF.a = uSa.E;
            }
        }
        a2 = uSa.E;
        if (aF.i) {
            AF aF6 = aF;
            a2 = aF.f[aF6.t];
            aF6.f[aF.t] = uSa.E;
        }
        if (aF.f == null) {
            aF.H = vRa.d;
        }
        if (aF.J()) {
            return;
        }
        AF aF7 = aF;
        aF7.C();
        aF7.D();
        if (aF7.J()) {
            return;
        }
        AF aF8 = aF;
        aF8.n += vRa.d;
        AF aF9 = aF;
        aF8.F = new BufferedImage(aF9.v, aF9.k, uqa.g);
        aF.J();
        AF aF10 = aF;
        aF8.A.add(new bE(aF10.F, aF10.N));
        if (aF8.i) {
            AF aF11 = aF;
            aF11.f[aF11.t] = a2;
        }
        aF.A();
    }

    public void M() {
        int n2;
        AF aF = this;
        StringBuilder a2 = new StringBuilder(uua.p);
        int n3 = n2 = uSa.E;
        while (n3 < uua.p) {
            a2.append((char)aF.C());
            n3 = ++n2;
        }
        if (!a2.toString().startsWith(ZRa.i)) {
            aF.H = vRa.d;
            return;
        }
        AF aF2 = aF;
        aF2.l();
        if (aF2.p && !aF.J()) {
            AF aF3 = aF;
            aF3.G = aF3.J(aF3.B);
            aF3.a = aF3.G[aF.x];
        }
    }

    public void e() {
        AF aF;
        AF aF2 = aF = this;
        aF.C();
        int a2 = aF2.C();
        aF2.c = (a2 & EPa.O) >> uqa.g;
        if (aF2.c == 0) {
            aF.c = vRa.d;
        }
        aF.i = (a2 & vRa.d) != 0 ? vRa.d : uSa.E;
        AF aF3 = aF;
        aF3.N = aF3.f() * NTa.C;
        aF3.t = aF3.C();
        aF3.C();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d() {
        AF aF = this;
        int n2 = uSa.E;
        block10: while (n2 == 0 && !aF.J()) {
            switch (aF.C()) {
                case 44: {
                    aF.i();
                    continue block10;
                }
                case 33: {
                    switch (aF.C()) {
                        case 249: {
                            aF.e();
                            continue block10;
                        }
                        case 255: {
                            aF.l();
                            StringBuilder stringBuilder = new StringBuilder(pPa.f);
                            int a2 = uSa.E;
                            int n3 = a2;
                            while (n3 < pPa.f) {
                                stringBuilder.append((char)aF.h[a2++]);
                                n3 = a2;
                            }
                            AF aF2 = aF;
                            if (stringBuilder.toString().equals(cQa.h)) {
                                aF2.G();
                                continue block10;
                            }
                            aF2.D();
                            continue block10;
                        }
                    }
                    aF.D();
                    continue block10;
                }
                case 59: {
                    n2 = vRa.d;
                    continue block10;
                }
                case 0: {
                    continue block10;
                }
            }
            aF.H = vRa.d;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int l() {
        int a2;
        AF aF;
        AF aF2 = aF = this;
        aF2.j = aF2.C();
        if (aF2.j > 0) {
            try {
                int n3;
                for (a2 = uSa.E; a2 < aF.j; a2 += n3) {
                    AF aF3 = aF;
                    int n2 = a2;
                    n3 = aF3.m.read(aF3.h, n2, aF.j - n2);
                    if (n3 != pua.o) {
                        continue;
                    }
                    break;
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (a2 < aF.j) {
                aF.H = vRa.d;
            }
        }
        return a2;
    }

    public void C() {
        int n2;
        int n3;
        int n4;
        block18: {
            int n5;
            int a2;
            AF aF = this;
            int n6 = pua.o;
            AF aF2 = aF;
            n4 = aF.g * aF2.I;
            if (aF2.l == null || aF.l.length < n4) {
                aF.l = new byte[n4];
            }
            if (aF.D == null) {
                aF.D = new short[mPa.H];
            }
            if (aF.q == null) {
                aF.q = new byte[mPa.H];
            }
            if (aF.K == null) {
                aF.K = new byte[MQa.X];
            }
            int n7 = aF.C();
            int n8 = vRa.d << n7;
            int n9 = n8 + vRa.d;
            int n10 = n8 + uqa.g;
            int n11 = n6;
            int n12 = n7 + vRa.d;
            int n13 = (vRa.d << n12) - vRa.d;
            int n14 = a2 = uSa.E;
            while (n14 < n8) {
                AF aF3 = aF;
                aF3.D[a2] = uSa.E;
                int n15 = a2++;
                aF3.q[n15] = (byte)n15;
                n14 = a2;
            }
            int n16 = n5 = uSa.E;
            int n17 = n5;
            int n18 = n5;
            int n19 = n5;
            int n20 = n5;
            int n21 = n5;
            int n22 = n3 = uSa.E;
            while (n22 < n4) {
                if (n17 == 0) {
                    if (n20 < n12) {
                        if (n19 == 0) {
                            n19 = aF.l();
                            if (n19 <= 0) {
                                n2 = n16;
                                break block18;
                            }
                            n5 = uSa.E;
                        }
                        int n23 = n20;
                        n20 += 8;
                        --n19;
                        n21 += (aF.h[n5] & osa.Ja) << n23;
                        ++n5;
                        n22 = n3;
                        continue;
                    }
                    a2 = n21 & n13;
                    n21 >>= n12;
                    n20 -= n12;
                    if (a2 > n10) break;
                    if (a2 == n9) {
                        n2 = n16;
                        break block18;
                    }
                    if (a2 == n8) {
                        n12 = n7 + vRa.d;
                        n13 = (vRa.d << n12) - vRa.d;
                        n10 = n8 + uqa.g;
                        n11 = n6;
                        n22 = n3;
                        continue;
                    }
                    if (n11 == n6) {
                        aF.K[n17++] = aF.q[a2];
                        n11 = a2;
                        n18 = a2;
                        n22 = n3;
                        continue;
                    }
                    int n24 = a2;
                    if (a2 == n10) {
                        aF.K[n17++] = (byte)n18;
                        a2 = n11;
                    }
                    int n25 = a2;
                    while (n25 > n8) {
                        AF aF4 = aF;
                        aF.K[++n17] = aF4.q[a2];
                        n25 = aF4.D[a2];
                    }
                    n18 = aF.q[a2] & osa.Ja;
                    if (n10 >= mPa.H) {
                        aF.K[n17++] = (byte)n18;
                        n22 = n3;
                        continue;
                    }
                    AF aF5 = aF;
                    aF5.K[n17++] = (byte)n18;
                    aF5.D[n10] = (short)n11;
                    aF5.q[n10++] = (byte)n18;
                    if ((n10 & n13) == 0 && n10 < mPa.H) {
                        ++n12;
                        n13 += n10;
                    }
                    n11 = n24;
                }
                aF.l[n16++] = aF.K[--n17];
                n22 = ++n3;
            }
            n2 = n16;
        }
        int n26 = n3 = n2;
        while (n26 < n4) {
            aF.l[n3++] = uSa.E;
            n26 = n3;
        }
    }

    public void l() {
        AF aF;
        AF aF2 = aF = this;
        aF2.v = aF2.f();
        aF2.k = aF2.f();
        int a2 = aF2.C();
        aF2.p = (a2 & XOa.h) != 0 ? vRa.d : uSa.E;
        AF aF3 = aF;
        aF3.B = uqa.g << (a2 & XTa.W);
        aF3.x = aF3.C();
        aF3.E = aF3.C();
    }

    public void f() {
        AF a2;
        AF aF = a2;
        AF aF2 = a2;
        aF2.H = uSa.E;
        aF2.n = uSa.E;
        AF aF3 = a2;
        aF3.A = new ArrayList();
        aF.G = null;
        aF.o = null;
    }

    public int J(int n2) {
        int b2 = n2;
        AF a2 = this;
        a2.N = pua.o;
        if (b2 >= 0 && b2 < a2.n) {
            a2.N = a2.A.get((int)b2).I;
        }
        return a2.N;
    }

    public int f() {
        AF a2;
        return a2.C() | a2.C() << Yqa.i;
    }

    public int J() {
        AF a2;
        return a2.n;
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage J(int n2) {
        void a2;
        AF aF = this;
        Object b2 = null;
        if (a2 >= 0 && a2 < aF.n) {
            b2 = aF.A.get((int)a2).A;
        }
        return b2;
    }

    public int J(InputStream inputStream) {
        AF aF;
        Object b22 = inputStream;
        AF a2 = this;
        a2.f();
        if (b22 != null) {
            if (!(b22 instanceof BufferedInputStream)) {
                b22 = new BufferedInputStream((InputStream)b22);
            }
            a2.m = (BufferedInputStream)b22;
            AF aF2 = a2;
            aF2.M();
            if (!aF2.J()) {
                AF aF3 = a2;
                aF3.d();
                if (aF3.n < 0) {
                    a2.H = vRa.d;
                }
            }
            try {
                ((InputStream)b22).close();
                aF = a2;
            }
            catch (IOException b22) {
                aF = a2;
                b22.printStackTrace();
            }
        } else {
            aF = a2;
            a2.H = uqa.g;
        }
        return aF.H;
    }

    /*
     * Unable to fully structure code
     */
    public void J() {
        block17: {
            var1_2 = this;
            var4_3 = ((DataBufferInt)var1_2.F.getRaster().getDataBuffer()).getData();
            if (var1_2.s <= 0) break block17;
            if (var1_2.s != yRa.d) ** GOTO lbl12
            var6_4 = var1_2.n - uqa.g;
            if (var6_4 > 0) {
                v0 = var1_2;
                v1 = v0;
                v0.e = v0.J(var6_4 - vRa.d);
            } else {
                var1_2.e = null;
lbl12:
                // 2 sources

                v1 = var1_2;
            }
            if (v1.e != null) {
                var6_5 = ((DataBufferInt)var1_2.e.getRaster().getDataBuffer()).getData();
                v2 = var1_2;
                System.arraycopy(var6_5, uSa.E, var4_3, uSa.E, v2.v * v2.k);
                if (var1_2.s == uqa.g) {
                    v3 = var1_2;
                    var3_6 = v3.F.createGraphics();
                    if (v3.i) {
                        a = new Color(uSa.E, uSa.E, uSa.E, uSa.E);
                        v4 = var3_6;
                    } else {
                        a = new Color(var1_2.b);
                        v4 = var3_6;
                    }
                    v4.setColor((Color)a);
                    v5 = var3_6;
                    v5.setComposite(AlphaComposite.Src);
                    v5.fill(var1_2.T);
                    v5.dispose();
                }
            }
        }
        var6_4 = vRa.d;
        var3_7 = Yqa.i;
        a = uSa.E;
        v6 = var5_8 = uSa.E;
        while (v6 < var1_2.I) {
            block18: {
                var2_9 = var5_8;
                if (!var1_2.W) break block18;
                if (a < var1_2.I) ** GOTO lbl-1000
                switch (++var6_4) {
                    case 2: {
                        while (false) {
                        }
                        v7 = a = AQa.P;
                        break;
                    }
                    case 3: {
                        a = uqa.g;
                        var3_7 = AQa.P;
                        v7 = a;
                        break;
                    }
                    case 4: {
                        a = vRa.d;
                        var3_7 = uqa.g;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        v7 = a;
                    }
                }
                var2_9 = v7;
                a += var3_7;
            }
            if ((var2_9 += var1_2.R) < var1_2.k) {
                if ((var2_9 *= var1_2.v) + var1_2.v < (var8_11 = (var7_10 = var2_9 + var1_2.Q) + var1_2.g)) {
                    var8_11 = var2_9 + var1_2.v;
                }
                var2_9 = var5_8 * var1_2.g;
                v8 = var7_10;
                while (v8 < var8_11) {
                    v9 = var1_2;
                    v10 = v9.l[var2_9] & osa.Ja;
                    ++var2_9;
                    var9_12 = v10;
                    if ((var9_12 = v9.f[var9_12]) != 0) {
                        var4_3[var7_10] = var9_12;
                    }
                    v8 = ++var7_10;
                }
            }
            v6 = ++var5_8;
        }
    }

    public AF() {
        AF a2;
        a2.c = uSa.E;
        a2.s = uSa.E;
        a2.i = uSa.E;
        a2.N = uSa.E;
    }

    public int J(BufferedInputStream bufferedInputStream) {
        AF aF;
        BufferedInputStream b22 = bufferedInputStream;
        AF a2 = this;
        a2.f();
        if (b22 != null) {
            AF aF2 = a2;
            aF2.m = b22;
            aF2.M();
            if (!aF2.J()) {
                AF aF3 = a2;
                aF3.d();
                if (aF3.n < 0) {
                    a2.H = vRa.d;
                }
            }
            try {
                b22.close();
                aF = a2;
            }
            catch (IOException b22) {
                aF = a2;
                b22.printStackTrace();
            }
        } else {
            aF = a2;
            a2.H = uqa.g;
        }
        return aF.H;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2) {
        int n3;
        void a2;
        AF aF = this;
        int b2 = yRa.d * a2;
        int[] nArray = null;
        byte[] byArray = new byte[b2];
        int n4 = uSa.E;
        try {
            n3 = n4 = aF.m.read(byArray);
        }
        catch (IOException iOException) {
            n3 = n4;
            iOException.printStackTrace();
        }
        if (n3 < b2) {
            aF.H = vRa.d;
            return nArray;
        }
        nArray = new int[hra.Ja];
        int n5 = uSa.E;
        b2 = uSa.E;
        int n6 = n5;
        while (n6 < a2) {
            int n7 = byArray[b2] & osa.Ja;
            n4 = n7;
            int n8 = byArray[++b2] & osa.Ja;
            int n9 = n8;
            int n10 = byArray[++b2] & osa.Ja;
            ++b2;
            int n11 = n10;
            nArray[n5++] = gsa.X | n4 << ERa.C | n9 << Yqa.i | n11;
            n6 = n5;
        }
        return nArray;
    }

    public BufferedImage J() {
        AF a2;
        return a2.J(uSa.E);
    }
}

