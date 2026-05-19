/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  MQa
 *  NF
 *  NTa
 *  XTa
 *  ZRa
 *  cQa
 *  hra
 *  pPa
 *  pua
 *  vRa
 *  ysa
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AD {
    public ArrayList<NF> p;
    public int n;
    public int[] s;
    public int w;
    public int W;
    private static final int q = 3;
    public byte[] x;
    public int v;
    public int o;
    public boolean h;
    public static final int K = 1;
    public int H;
    public BufferedImage c;
    public int[] B;
    private static final int d = 0;
    public short[] a;
    private static final int b = 2;
    public int l;
    public int e;
    public byte[] G;
    public byte[] D;
    public static final int f = 4096;
    public static final int F = 2;
    public byte[] g;
    public int L;
    public BufferedImage E;
    public int m;
    public BufferedImage C;
    private static final int i = 1;
    public static final int M = 0;
    public ByteBuffer k;
    public boolean j;
    public int J = vRa.d;
    public NF A;
    public int I;

    public boolean J() {
        AD a2;
        if (a2.W != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int A() {
        AD aD2 = this;
        int a2 = uSa.E;
        try {
            a2 = aD2.k.get() & osa.Ja;
            return a2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            aD2.W = vRa.d;
            return a2;
        }
    }

    public void A() {
        AD a2;
        AD aD2;
        do {
            aD2 = a2;
            aD2.M();
        } while (aD2.H > 0 && !a2.J());
    }

    public int i() {
        AD a2;
        return a2.l;
    }

    public int M() {
        int a2;
        AD aD2;
        AD aD3 = aD2 = this;
        aD3.H = aD3.A();
        if (aD3.H > 0) {
            try {
                int n2;
                for (a2 = uSa.E; a2 < aD2.H; a2 += n2) {
                    AD aD4 = aD2;
                    n2 = aD4.H - a2;
                    aD4.k.get(aD2.x, a2, n2);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                aD2.W = vRa.d;
            }
        }
        return a2;
    }

    public void i() {
        int n2;
        AD aD2 = this;
        StringBuilder a2 = new StringBuilder(uua.p);
        int n3 = n2 = uSa.E;
        while (n3 < uua.p) {
            a2.append((char)aD2.A());
            n3 = ++n2;
        }
        if (!a2.toString().startsWith(ZRa.i)) {
            aD2.W = vRa.d;
            return;
        }
        AD aD3 = aD2;
        aD3.d();
        if (aD3.j && !aD2.J()) {
            AD aD4 = aD2;
            aD4.B = aD4.J(aD4.o);
            aD4.n = aD4.B[aD2.m];
        }
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2) {
        void a2;
        AD aD2 = this;
        int n3 = yRa.d * a2;
        int[] nArray = null;
        byte[] byArray = new byte[n3];
        try {
            aD2.k.get(byArray);
            nArray = new int[hra.Ja];
            int b2 = uSa.E;
            int n4 = uSa.E;
            while (b2 < a2) {
                int n5 = byArray[n4] & osa.Ja;
                int n6 = n5;
                int n7 = byArray[++n4] & osa.Ja;
                int n8 = n7;
                int n9 = byArray[++n4] & osa.Ja;
                ++n4;
                int n10 = n9;
                nArray[b2++] = gsa.X | n6 << ERa.C | n8 << Yqa.i | n10;
            }
        }
        catch (BufferUnderflowException b2) {
            b2.printStackTrace();
            aD2.W = vRa.d;
        }
        return nArray;
    }

    public int e() {
        AD a2;
        return a2.J;
    }

    public void M() {
        AD aD2;
        AD aD3 = aD2 = this;
        aD2.A();
        int a2 = aD3.A();
        aD3.A.k = (a2 & EPa.O) >> uqa.g;
        if (aD3.A.k == 0) {
            aD2.A.k = vRa.d;
        }
        aD2.A.M = (a2 & vRa.d) != 0 ? vRa.d : uSa.E;
        AD aD4 = aD2;
        AD aD5 = aD2;
        aD4.A.I = aD5.C() * NTa.C;
        aD4.A.i = aD2.A();
        aD5.A();
    }

    public int d() {
        AD a2;
        return a2.L;
    }

    public int J(byte[] byArray) {
        AD aD2;
        block2: {
            AD a2;
            block1: {
                block0: {
                    Object b2 = byArray;
                    a2 = this;
                    a2.f();
                    if (b2 == null) break block0;
                    a2.k = ByteBuffer.wrap((byte[])b2);
                    Buffer buffer = a2.k.rewind();
                    AD aD3 = a2;
                    a2.k.order(ByteOrder.LITTLE_ENDIAN);
                    aD3.i();
                    if (aD3.J()) break block1;
                    AD aD4 = a2;
                    aD4.C();
                    if (aD4.L >= 0) break block1;
                    aD2 = a2;
                    a2.W = vRa.d;
                    break block2;
                }
                a2.W = uqa.g;
            }
            aD2 = a2;
        }
        return aD2.W;
    }

    public void e() {
        AD aD2 = this;
        do {
            AD aD3 = aD2;
            aD3.M();
            if (aD3.x[uSa.E] != vRa.d) continue;
            AD aD4 = aD2;
            int a2 = aD4.x[vRa.d] & osa.Ja;
            aD4.J = (aD4.x[uqa.g] & osa.Ja) << Yqa.i | a2;
        } while (aD2.H > 0 && !aD2.J());
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2) {
        void a2;
        AD aD2 = this;
        int b2 = pua.o;
        if (a2 >= 0 && a2 < aD2.L) {
            b2 = aD2.p.get((int)a2).I;
        }
        return b2;
    }

    public BufferedImage J() {
        AD aD2 = this;
        if (aD2.L <= 0 || aD2.w < 0 || aD2.C == null) {
            return null;
        }
        if (aD2.c != null) {
            return aD2.c;
        }
        AD aD3 = aD2;
        AD a2 = aD3.p.get(aD3.w);
        AD aD4 = aD2;
        if (((NF)a2).j == null) {
            aD4.s = aD2.B;
        } else {
            aD4.s = ((NF)a2).j;
            if (aD2.m == ((NF)a2).i) {
                aD2.n = uSa.E;
            }
        }
        int n2 = uSa.E;
        if (((NF)a2).M) {
            AD aD5 = aD2;
            n2 = aD5.s[((NF)a2).i];
            aD5.s[((NF)a2).i] = uSa.E;
        }
        if (aD2.s == null) {
            aD2.W = vRa.d;
            return null;
        }
        AD aD6 = aD2;
        aD6.J(aD6.w);
        if (((NF)a2).M) {
            aD2.s[((NF)a2).i] = n2;
        }
        aD2.c = aD2.C;
        return aD2.c;
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_2) {
        block18: {
            block19: {
                block16: {
                    block17: {
                        var3_4 = this;
                        var6_5 = var3_4.p.get((int)a);
                        b = null;
                        if ((a -= vRa.d) >= 0) {
                            b = var3_4.p.get((int)a);
                        }
                        a = ((DataBufferInt)var3_4.C.getRaster().getDataBuffer()).getData();
                        if (b == null || b.k <= 0) break block16;
                        if (b.k != yRa.d) break block17;
                        System.arraycopy(((DataBufferInt)var3_4.E.getRaster().getDataBuffer()).getData(), uSa.E, a, uSa.E, a.length);
                        v0 = var3_4;
                        break block18;
                    }
                    System.arraycopy(a, uSa.E, ((DataBufferInt)var3_4.E.getRaster().getDataBuffer()).getData(), uSa.E, a.length);
                    if (b.k == uqa.g) {
                        var4_6 = uSa.E;
                        if (!var6_5.M) {
                            var4_6 = var3_4.n;
                        }
                        v1 = var5_7 = uSa.E;
                        while (v1 < b.E && b.J + var5_7 < var3_4.I) {
                            var2_8 = (b.J + var5_7) * var3_4.l + b.L;
                            var7_9 = var2_8 + Math.min(var3_4.l - b.L, b.A);
                            v2 = var2_8;
                            while (v2 < var7_9) {
                                a[var8_10++] = var4_6;
                                v2 = var8_10;
                            }
                            v1 = ++var5_7;
                        }
                    }
                    break block19;
                }
                Arrays.fill(a, var6_5.M != false ? uSa.E : var3_4.n);
            }
            v0 = var3_4;
        }
        v0.J(var6_5, var3_4.G);
        var4_6 = vRa.d;
        var5_7 = Yqa.i;
        var2_8 = uSa.E;
        v3 = var7_9 = uSa.E;
        while (v3 < var6_5.E) {
            block20: {
                var8_10 = var7_9;
                if (!var6_5.C) break block20;
                if (var2_8 < var6_5.E) ** GOTO lbl-1000
                switch (++var4_6) {
                    case 2: {
                        while (false) {
                        }
                        v4 = var2_8 = AQa.P;
                        break;
                    }
                    case 3: {
                        var2_8 = uqa.g;
                        var5_7 = AQa.P;
                        v4 = var2_8;
                        break;
                    }
                    case 4: {
                        var2_8 = vRa.d;
                        var5_7 = uqa.g;
                        v4 = var2_8;
                        break;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 = var2_8;
                    }
                }
                var8_10 = v4;
                var2_8 += var5_7;
            }
            if ((var8_10 += var6_5.J) < var3_4.I) {
                b = var8_10 * var3_4.l;
                var9_11 = b + var6_5.L;
                var10_12 = var9_11 + var6_5.A;
                if (b + var3_4.l < var10_12) {
                    var10_12 = b + var3_4.l;
                }
                b = var7_9 * var6_5.A;
                v5 = var9_11;
                while (v5 < var10_12) {
                    v6 = var3_4;
                    v7 = v6.G[b] & osa.Ja;
                    ++b;
                    var11_13 = v7;
                    if ((var11_13 = v6.s[var11_13]) != 0) {
                        a[var9_11] = var11_13;
                    }
                    v5 = ++var9_11;
                }
            }
            v3 = ++var7_9;
        }
        System.arraycopy(a, uSa.E, ((DataBufferInt)var3_4.C.getRaster().getDataBuffer()).getData(), uSa.E, a.length);
    }

    /*
     * WARNING - void declaration
     */
    public void J(NF nF2, byte[] byArray) {
        int n2;
        int n3;
        int b22;
        block18: {
            int n4;
            int c2;
            byte[] a2;
            void b22;
            AD aD2 = this;
            aD2.k.position(b22.m);
            int n5 = pua.o;
            void v0 = b22;
            b22 = v0.A * v0.E;
            if (a2 == null || a2.length < b22) {
                a2 = new byte[b22];
            }
            if (aD2.a == null) {
                aD2.a = new short[mPa.H];
            }
            if (aD2.D == null) {
                aD2.D = new byte[mPa.H];
            }
            if (aD2.g == null) {
                aD2.g = new byte[MQa.X];
            }
            int n6 = aD2.A();
            int n7 = vRa.d << n6;
            int n8 = n7 + vRa.d;
            int n9 = n7 + uqa.g;
            int n10 = n5;
            int n11 = n6 + vRa.d;
            int n12 = (vRa.d << n11) - vRa.d;
            int n13 = c2 = uSa.E;
            while (n13 < n7) {
                AD aD3 = aD2;
                aD3.a[c2] = uSa.E;
                int n14 = c2++;
                aD3.D[n14] = (byte)n14;
                n13 = c2;
            }
            int n15 = n4 = uSa.E;
            int n16 = n4;
            int n17 = n4;
            int n18 = n4;
            int n19 = n4;
            int n20 = n4;
            int n21 = n3 = uSa.E;
            while (n21 < b22) {
                if (n16 == 0) {
                    if (n19 < n11) {
                        if (n18 == 0) {
                            n18 = aD2.M();
                            if (n18 <= 0) {
                                n2 = n15;
                                break block18;
                            }
                            n4 = uSa.E;
                        }
                        int n22 = n19;
                        n19 += 8;
                        --n18;
                        n20 += (aD2.x[n4] & osa.Ja) << n22;
                        ++n4;
                        n21 = n3;
                        continue;
                    }
                    c2 = n20 & n12;
                    n20 >>= n11;
                    n19 -= n11;
                    if (c2 > n9) break;
                    if (c2 == n8) {
                        n2 = n15;
                        break block18;
                    }
                    if (c2 == n7) {
                        n11 = n6 + vRa.d;
                        n12 = (vRa.d << n11) - vRa.d;
                        n9 = n7 + uqa.g;
                        n10 = n5;
                        n21 = n3;
                        continue;
                    }
                    if (n10 == n5) {
                        aD2.g[n16++] = aD2.D[c2];
                        n10 = c2;
                        n17 = c2;
                        n21 = n3;
                        continue;
                    }
                    int n23 = c2;
                    if (c2 == n9) {
                        aD2.g[n16++] = (byte)n17;
                        c2 = n10;
                    }
                    int n24 = c2;
                    while (n24 > n7) {
                        AD aD4 = aD2;
                        aD2.g[++n16] = aD4.D[c2];
                        n24 = aD4.a[c2];
                    }
                    n17 = aD2.D[c2] & osa.Ja;
                    if (n9 >= mPa.H) {
                        aD2.g[n16++] = (byte)n17;
                        n21 = n3;
                        continue;
                    }
                    AD aD5 = aD2;
                    aD5.g[n16++] = (byte)n17;
                    aD5.a[n9] = (short)n10;
                    aD5.D[n9++] = (byte)n17;
                    if ((n9 & n12) == 0 && n9 < mPa.H) {
                        ++n11;
                        n12 += n9;
                    }
                    n10 = n23;
                }
                a2[n15++] = aD2.g[--n16];
                n21 = ++n3;
            }
            n2 = n15;
        }
        int n25 = n3 = n2;
        while (n25 < b22) {
            a2[n3++] = uSa.E;
            n25 = n3;
        }
    }

    public void d() {
        AD aD2;
        AD aD3 = aD2 = this;
        aD3.l = aD3.C();
        aD3.I = aD3.C();
        int a2 = aD3.A();
        aD3.j = (a2 & XOa.h) != 0 ? vRa.d : uSa.E;
        AD aD4 = aD2;
        aD4.o = uqa.g << (a2 & XTa.W);
        aD4.m = aD4.A();
        aD4.v = aD4.A();
        aD4.G = new byte[aD4.l * aD2.I];
        AD aD5 = aD2;
        AD aD6 = aD2;
        aD4.E = new BufferedImage(aD6.l, aD6.I, uqa.g);
        AD aD7 = aD2;
        aD4.C = new BufferedImage(aD7.l, aD7.I, uqa.g);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int J(InputStream var1_4, int var2_5) {
        block9: {
            var3_7 = this;
            if (b == null) {
                v0 = var3_7;
                var3_7.W = uqa.g;
                return v0.W;
            }
            try {
                v1 = a > 0 ? a + mPa.H : mPa.H;
            }
            catch (IOException c) {
                c.printStackTrace();
                try {
                    v2 = b;
lbl12:
                    // 2 sources

                    while (true) {
                        v2.close();
                        break block9;
                        break;
                    }
                }
                catch (Exception c) {
                    v0 = var3_7;
                    c.printStackTrace();
                    return v0.W;
                }
            }
            {
                c = v1;
                a = new ByteArrayOutputStream(c);
                var5_8 = new byte[qQa.O];
                v3 = b;
                while ((var4_9 = v3.read(var5_8, uSa.E, var5_8.length)) != pua.o) {
                    v3 = b;
                    a.write(var5_8, uSa.E, var4_9);
                }
            }
            {
                a.flush();
                var3_7.J(a.toByteArray());
                v2 = b;
                ** continue;
            }
        }
        v0 = var3_7;
        return v0.W;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void C() {
        AD aD2 = this;
        int n2 = uSa.E;
        block9: while (n2 == 0 && !aD2.J()) {
            switch (aD2.A()) {
                case 44: {
                    aD2.l();
                    continue block9;
                }
                case 33: {
                    switch (aD2.A()) {
                        case 249: {
                            aD2.A = new NF(null);
                            aD2.M();
                            continue block9;
                        }
                        case 255: {
                            aD2.M();
                            StringBuilder stringBuilder = new StringBuilder(pPa.f);
                            int a2 = uSa.E;
                            int n3 = a2;
                            while (n3 < pPa.f) {
                                stringBuilder.append((char)aD2.x[a2++]);
                                n3 = a2;
                            }
                            AD aD3 = aD2;
                            if (stringBuilder.toString().equals(cQa.h)) {
                                aD3.e();
                                continue block9;
                            }
                            aD3.A();
                            continue block9;
                        }
                    }
                    aD2.A();
                    continue block9;
                }
                case 59: {
                    n2 = vRa.d;
                    continue block9;
                }
            }
            aD2.W = vRa.d;
        }
    }

    public int C() {
        AD a2;
        return a2.k.getShort();
    }

    public AD() {
        AD a2;
        a2.x = new byte[hra.Ja];
        a2.H = uSa.E;
    }

    public int l() {
        AD a2;
        if (a2.L <= 0 || a2.w < 0) {
            return pua.o;
        }
        AD aD2 = a2;
        return aD2.J(aD2.w);
    }

    public int f() {
        AD a2;
        return a2.w;
    }

    public int J() {
        AD a2;
        return a2.I;
    }

    public void l() {
        AD aD2;
        AD aD3 = this;
        if (aD3.A == null || aD3.A.m != 0) {
            aD3.A = new NF(null);
        }
        aD3.A.L = aD3.C();
        aD3.A.J = aD3.C();
        aD3.A.A = aD3.C();
        aD3.A.E = aD3.C();
        int a2 = aD3.A();
        aD3.h = (a2 & XOa.h) != 0 ? vRa.d : uSa.E;
        aD3.e = (int)Math.pow(KPa.y, (a2 & XTa.W) + vRa.d);
        aD3.A.C = (a2 & ysa.s) != 0 ? vRa.d : uSa.E;
        AD aD4 = aD3;
        if (aD3.h) {
            AD aD5 = aD3;
            aD4.A.j = aD5.J(aD5.e);
            aD2 = aD3;
        } else {
            aD4.A.j = null;
            aD2 = aD3;
        }
        aD2.A.m = aD3.k.position();
        AD aD6 = aD3;
        aD3.A();
        aD6.A();
        if (aD6.J()) {
            return;
        }
        AD aD7 = aD3;
        aD7.L += vRa.d;
        aD7.p.add(aD3.A);
    }

    public void f() {
        AD a2;
        AD aD2 = a2;
        AD aD3 = a2;
        aD3.W = uSa.E;
        aD3.L = uSa.E;
        aD2.w = pua.o;
        AD aD4 = a2;
        aD2.p = new ArrayList();
        aD2.B = null;
    }

    public void J() {
        AD a2;
        a2.w = (a2.w + vRa.d) % a2.L;
        a2.c = null;
    }
}

