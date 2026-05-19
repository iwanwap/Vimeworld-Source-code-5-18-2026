/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AE
 *  CD
 *  ERa
 *  JQa
 *  NTa
 *  Qta
 *  RQa
 *  TPa
 *  Vua
 *  WQa
 *  WSa
 *  XTa
 *  Xsa
 *  Ypa
 *  ZRa
 *  bRa
 *  cQa
 *  hqa
 *  hra
 *  jsa
 *  lqa
 *  pPa
 *  pua
 *  ura
 *  vRa
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class we {
    private static final byte Y = 0;
    public static final int[] r;
    private static final byte V = 1;
    private int z;
    private int X;
    private static final int y = 1717846356;
    public static final int[] U;
    private static final int P = 1717785676;
    private byte[] u;
    private final CRC32 O;
    private static final byte t = 0;
    private static final int R = 1347179589;
    private int Q;
    private static final ThreadLocal<int[]> N;
    private final InputStream T;
    private int p;
    private static final ThreadLocal<byte[]> n;
    private static final int s = 1229209940;
    private static final int w = 1951551059;
    private static final byte W = 3;
    private byte q;
    public static final int[] x;
    private static final byte v = 2;
    private static final byte o = 6;
    private static final byte h = 0;
    private static final int K = 1229278788;
    private static final byte H = 1;
    private static final byte c = 2;
    private int B;
    private int d;
    private static final byte a = 0;
    private static final byte[] b;
    public List<CD> l;
    private byte[] e;
    private static final int G = 1633899596;
    private int D;
    private int f;
    private int F;
    private byte[] g;
    private static final byte L = 4;
    public IntBuffer E;
    private final byte[] m;
    private static final byte[] C;
    public int i;
    private CD M;
    private static final int k = 1229472850;
    private boolean j;
    public static final int[] J;
    private int A;
    private static final byte I = 1;

    private void A() throws IOException {
        we a2;
        we we2 = a2;
        we2.J(we2.m, uSa.E, Yqa.i);
        we we3 = a2;
        we3.f = we3.f(we3.m, uSa.E);
        we3.i = we3.f(we3.m, AQa.P);
        we3.j = vRa.d;
    }

    public static /* synthetic */ int[] J() {
        return new int[ura.V];
    }

    static {
        int n2;
        n = ThreadLocal.withInitial(AE.J());
        N = ThreadLocal.withInitial(tF.J());
        C = new byte[ERa.C];
        int n3 = n2 = uSa.E;
        while (n3 < C.length) {
            int n4 = n2++;
            we.C[n4] = (byte)(n4 * ERa.C);
            n3 = n2;
        }
        we.C[we.C.length - vRa.d] = pua.o;
        byte[] byArray = new byte[Yqa.i];
        byArray[uSa.E] = Fsa.S;
        byArray[vRa.d] = Fua.J;
        byArray[uqa.g] = RQa.b;
        byArray[yRa.d] = hqa.K;
        byArray[AQa.P] = uua.s;
        byArray[tTa.h] = NTa.C;
        byArray[uua.p] = ITa.E;
        byArray[XTa.W] = NTa.C;
        b = byArray;
        int[] nArray = new int[XTa.W];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = AQa.P;
        nArray[uqa.g] = uSa.E;
        nArray[yRa.d] = uqa.g;
        nArray[AQa.P] = uSa.E;
        nArray[tTa.h] = vRa.d;
        nArray[uua.p] = uSa.E;
        J = nArray;
        int[] nArray2 = new int[XTa.W];
        nArray2[uSa.E] = uSa.E;
        nArray2[vRa.d] = uSa.E;
        nArray2[uqa.g] = AQa.P;
        nArray2[yRa.d] = uSa.E;
        nArray2[AQa.P] = uqa.g;
        nArray2[tTa.h] = uSa.E;
        nArray2[uua.p] = vRa.d;
        x = nArray2;
        int[] nArray3 = new int[Yqa.i];
        nArray3[uSa.E] = Yqa.i;
        nArray3[vRa.d] = Yqa.i;
        nArray3[uqa.g] = AQa.P;
        nArray3[yRa.d] = AQa.P;
        nArray3[AQa.P] = uqa.g;
        nArray3[tTa.h] = uqa.g;
        nArray3[uua.p] = vRa.d;
        nArray3[XTa.W] = vRa.d;
        r = nArray3;
        int[] nArray4 = new int[Yqa.i];
        nArray4[uSa.E] = Yqa.i;
        nArray4[vRa.d] = Yqa.i;
        nArray4[uqa.g] = Yqa.i;
        nArray4[yRa.d] = AQa.P;
        nArray4[AQa.P] = AQa.P;
        nArray4[tTa.h] = uqa.g;
        nArray4[uua.p] = uqa.g;
        nArray4[XTa.W] = vRa.d;
        U = nArray4;
    }

    /*
     * WARNING - void declaration
     */
    private void D(byte[] byArray, byte[] byArray2) throws IOException {
        Object c2 = byArray;
        we b2 = this;
        switch (c2[uSa.E]) {
            case 0: {
                return;
            }
            case 1: {
                b2.J((byte[])c2);
                return;
            }
            case 2: {
                void a2;
                b2.f((byte[])c2, (byte[])a2);
                return;
            }
            case 3: {
                void a2;
                b2.M((byte[])c2, (byte[])a2);
                return;
            }
            case 4: {
                void a2;
                b2.l((byte[])c2, (byte[])a2);
                return;
            }
        }
        throw new IOException(new StringBuilder().insert(5 >> 3, bRa.r).append((int)c2[uSa.E]).toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void A(byte[] byArray, byte[] byArray2) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = b2[vRa.d + (c2 >> yRa.d)] & osa.Ja;
            switch (n2 - c2) {
                default: {
                    a2[c2 + XTa.W] = (byte)(n4 & vRa.d);
                }
                case 7: {
                    a2[c2 + uua.p] = (byte)(n4 >> vRa.d & vRa.d);
                }
                case 6: {
                    a2[c2 + tTa.h] = (byte)(n4 >> uqa.g & vRa.d);
                }
                case 5: {
                    a2[c2 + AQa.P] = (byte)(n4 >> yRa.d & vRa.d);
                }
                case 4: {
                    a2[c2 + yRa.d] = (byte)(n4 >> AQa.P & vRa.d);
                }
                case 3: {
                    a2[c2 + uqa.g] = (byte)(n4 >> tTa.h & vRa.d);
                }
                case 2: {
                    a2[c2 + vRa.d] = (byte)(n4 >> uua.p & vRa.d);
                    break;
                }
                case 1: {
                }
            }
            int n5 = c2;
            a2[n5] = (byte)(n4 >> XTa.W);
            n3 = c2 += 8;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Inflater inflater, int n2) throws IOException {
        void b2;
        we we2 = this;
        try {
            Object c2 = new byte[ura.V];
            while (true) {
                void v0 = b2;
                while (v0.inflate((byte[])c2, uSa.E, ((Object)c2).length) > 0) {
                    v0 = b2;
                }
                break;
            }
        }
        catch (DataFormatException c2) {
            throw new IOException(ROa.T, c2);
        }
        {
            void a2;
            block6: {
                if (!b2.finished()) break block6;
                return;
            }
            if (!b2.needsInput()) continue;
            we2.J((Inflater)b2, (int)a2);
            continue;
        }
    }

    public boolean l() {
        we a2;
        return a2.j;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i() throws IOException {
        we we2;
        we a2;
        we we3 = a2;
        we3.J(uua.s);
        we3.J(we3.m, uSa.E, uua.s);
        we we4 = a2;
        we4.A = we4.f(we4.m, uSa.E);
        we4.X = we4.f(we4.m, AQa.P);
        we4.F = we4.m[Yqa.i] & osa.Ja;
        we4.d = we4.m[WOa.fa] & osa.Ja;
        block0 : switch (we3.d) {
            case 4: {
                if (a2.F != Yqa.i) {
                    throw new IOException(new StringBuilder().insert(3 >> 2, WQa.m).append(a2.F).toString());
                }
                we2 = a2;
                a2.B = uqa.g;
                break;
            }
            case 2: {
                if (a2.F != Yqa.i) {
                    throw new IOException(new StringBuilder().insert(3 & 4, WQa.m).append(a2.F).toString());
                }
                we2 = a2;
                a2.B = yRa.d;
                break;
            }
            case 6: {
                if (a2.F != Yqa.i) {
                    throw new IOException(new StringBuilder().insert(3 >> 2, WQa.m).append(a2.F).toString());
                }
                we2 = a2;
                a2.B = AQa.P;
                break;
            }
            case 0: 
            case 3: {
                switch (a2.F) {
                    case 1: 
                    case 2: 
                    case 4: 
                    case 8: {
                        we2 = a2;
                        a2.B = vRa.d;
                        break block0;
                    }
                }
                throw new IOException(new StringBuilder().insert(3 ^ 3, WQa.m).append(a2.F).toString());
            }
            default: {
                throw new IOException(new StringBuilder().insert(3 & 4, WPa.o).append(a2.d).toString());
            }
        }
        if (we2.m[NTa.C] != 0) {
            throw new IOException(UOa.O);
        }
        if (a2.m[pPa.f] != 0) {
            throw new IOException(ATa.ja);
        }
        we we5 = a2;
        we5.q = we5.m[lqa.s];
        if (we5.q != 0 && a2.q != vRa.d) {
            throw new IOException(new StringBuilder().insert(5 >> 3, BQa.ga).append(a2.q).toString());
        }
    }

    private void M() throws IOException {
        we we2 = this;
        int a2 = we2.D / yRa.d;
        if (a2 < vRa.d || a2 > hra.Ja || we2.D % yRa.d != 0) {
            throw new IOException(TPa.c);
        }
        we we3 = we2;
        we3.e = new byte[a2 * yRa.d];
        we3.J(we3.e, uSa.E, we2.e.length);
    }

    /*
     * WARNING - void declaration
     */
    private void d(IntBuffer intBuffer, byte[] byArray) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = (a2[c2 + yRa.d] & osa.Ja) << osa.c | (a2[c2] & osa.Ja) << ERa.C | (a2[c2 + vRa.d] & osa.Ja) << Yqa.i;
            void v2 = a2[c2 + uqa.g];
            b2.put(n4 | v2 & osa.Ja);
            n3 = c2 += 4;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void i(byte[] byArray, byte[] byArray2) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = b2[vRa.d + (c2 >> uqa.g)] & osa.Ja;
            switch (n2 - c2) {
                default: {
                    a2[c2 + yRa.d] = C[AQa.P * (n4 & yRa.d)];
                }
                case 3: {
                    a2[c2 + uqa.g] = C[AQa.P * (n4 >> uqa.g & yRa.d)];
                }
                case 2: {
                    a2[c2 + vRa.d] = C[AQa.P * (n4 >> AQa.P & yRa.d)];
                    break;
                }
                case 1: {
                }
            }
            int n5 = c2;
            a2[n5] = C[AQa.P * (n4 >> uua.p)];
            n3 = c2 += 4;
        }
        return;
    }

    public boolean f() {
        we a2;
        if (a2.d == uua.p || a2.d == uqa.g || a2.d == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int J(byte[] byArray, int n2, int n3) throws IOException {
        void b2;
        void c2;
        int d2 = n3;
        we a2 = this;
        if (d2 > a2.Q) {
            d2 = a2.Q;
        }
        we we2 = a2;
        we2.J((byte[])c2, (int)b2, d2);
        we2.O.update((byte[])c2, (int)b2, d2);
        we2.Q -= d2;
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(byte[] byArray, int n2, int n3) throws IOException {
        int d2;
        we we2 = this;
        do {
            void a2;
            void b2;
            void c2;
            if ((d2 = we2.T.read((byte[])c2, (int)b2, (int)a2)) < 0) {
                throw new EOFException();
            }
            b2 += d2;
        } while ((a2 -= d2) > 0);
    }

    /*
     * WARNING - void declaration
     */
    private void C(IntBuffer intBuffer, byte[] byArray) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            void v1 = a2;
            void var5_6 = v1[c2];
            int n4 = (v1[c2 + vRa.d] & osa.Ja) << osa.c | (var5_6 & osa.Ja) << ERa.C | (var5_6 & osa.Ja) << Yqa.i;
            b2.put(n4 | var5_6 & osa.Ja);
            n3 = c2 += 2;
        }
    }

    public int f() {
        we a2;
        return a2.X;
    }

    /*
     * WARNING - void declaration
     */
    private void l(IntBuffer intBuffer, byte[] byArray) {
        void b2;
        void a2;
        we we2 = this;
        if (we2.g != null) {
            int n2 = vRa.d;
            int n3 = ((void)a2).length;
            int n4 = n2;
            while (n4 < n3) {
                int c2 = a2[n2] & osa.Ja;
                we we3 = we2;
                byte by2 = we3.e[c2 * yRa.d];
                byte by3 = we3.e[c2 * yRa.d + vRa.d];
                byte by4 = we3.e[c2 * yRa.d + uqa.g];
                b2.put((we3.g[c2] & osa.Ja) << osa.c | (by2 & osa.Ja) << ERa.C | (by3 & osa.Ja) << Yqa.i | by4 & osa.Ja);
                n4 = ++n2;
            }
        } else {
            int n5 = vRa.d;
            int n6 = ((void)a2).length;
            int n7 = n5;
            while (n7 < n6) {
                int c2 = a2[n5] & osa.Ja;
                we we4 = we2;
                byte by5 = we4.e[c2 * yRa.d];
                byte by6 = we4.e[c2 * yRa.d + vRa.d];
                byte by7 = we4.e[c2 * yRa.d + uqa.g];
                b2.put((pua.o & osa.Ja) << osa.c | (by5 & osa.Ja) << ERa.C | (by6 & osa.Ja) << Yqa.i | by7 & osa.Ja);
                n7 = ++n5;
            }
        }
    }

    public int J() {
        we a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J(Inflater inflater, byte[] byArray, int n2, int n3, int n4) throws IOException {
        we we2 = this;
        try {
            void v0;
            do {
                void b2;
                void c2;
                void d2;
                void e2;
                int f2;
                if ((f2 = e2.inflate((byte[])d2, (int)c2, (int)b2)) <= 0) {
                    if (e2.finished()) {
                        throw new EOFException();
                    }
                    if (e2.needsInput()) {
                        void a2;
                        v0 = b2;
                        we2.J((Inflater)e2, (int)a2);
                        continue;
                    }
                    throw new IOException(new StringBuilder().insert(5 >> 3, xra.i).append((int)b2).append(XTa.k).toString());
                }
                c2 += f2;
                v0 = b2 - f2;
            } while (v0 > 0);
            return;
        }
        catch (DataFormatException f2) {
            throw new IOException(ROa.T, f2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e() throws IOException {
        we a2;
        switch (a2.d) {
            case 0: {
                we we2 = a2;
                we2.J(uqa.g);
                we2.u = new byte[uqa.g];
                we2.J(we2.u, uSa.E, uqa.g);
                switch (we2.F) {
                    case 1: {
                        a2.u[vRa.d] = (byte)(a2.u[vRa.d] * osa.Ja);
                        return;
                    }
                    case 2: {
                        a2.u[vRa.d] = C[AQa.P * (a2.u[vRa.d] & yRa.d)];
                        return;
                    }
                    case 4: {
                        a2.u[vRa.d] = C[a2.u[vRa.d] & Ypa.A];
                        return;
                    }
                }
                return;
            }
            case 2: {
                we we3 = a2;
                we3.J(uua.p);
                we3.u = new byte[uua.p];
                we3.J(we3.u, uSa.E, uua.p);
                return;
            }
            case 3: {
                if (a2.e != null) break;
                throw new IOException(yRa.N);
            }
            default: {
                return;
            }
        }
        a2.g = new byte[a2.e.length / yRa.d];
        we we4 = a2;
        Arrays.fill(we4.g, (byte)pua.o);
        we we5 = a2;
        we5.J(we4.g, uSa.E, we5.g.length);
    }

    /*
     * WARNING - void declaration
     */
    private void M(byte[] byArray, byte[] byArray2) {
        void a2;
        void b2;
        int c2;
        we we2 = this;
        int n2 = we2.B;
        int n3 = c2 = vRa.d;
        while (n3 <= n2) {
            void v1 = b2;
            int n4 = c2;
            byte by2 = (byte)(v1[n4] + (byte)((a2[c2] & osa.Ja) >>> vRa.d));
            v1[n4] = by2;
            n3 = ++c2;
        }
        int n5 = ((void)b2).length;
        int n6 = c2;
        while (n6 < n5) {
            void v5 = b2;
            int n7 = c2;
            byte by3 = (byte)(v5[n7] + (byte)((a2[c2] & osa.Ja) + (b2[c2 - n2] & osa.Ja) >>> vRa.d));
            v5[n7] = by3;
            n6 = ++c2;
        }
    }

    public static /* synthetic */ byte[] J() {
        return new byte[mPa.H];
    }

    public boolean J() {
        we a2;
        if (a2.d == uua.p || a2.g != null || a2.u != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(IntBuffer intBuffer, CD cD) {
        void b2;
        int n2;
        we we2;
        we c2 = cD;
        we a2 = this;
        int[] nArray = N.get();
        if (nArray.length >= ((CD)c2).j) {
            we we3 = c2;
            we2 = we3;
            Arrays.fill(nArray, uSa.E, ((CD)we3).j, uSa.E);
        } else {
            we we4 = c2;
            we2 = we4;
            nArray = new int[((CD)we4).j];
        }
        int n3 = n2 = ((CD)we2).m;
        while (true) {
            we we5 = c2;
            if (n3 >= ((CD)we5).m + ((CD)we5).k) break;
            b2.position(n2 * a2.A + ((CD)c2).M);
            b2.put(nArray, uSa.E, ((CD)c2).j);
            n3 = ++n2;
        }
        b2.rewind();
    }

    private void l(int n2) throws IOException {
        we a2;
        int b2 = n2;
        we we2 = a2 = this;
        we2.f();
        if (we2.p != b2) {
            throw new IOException(new StringBuilder().insert(3 ^ 3, JQa.N).append(Integer.toHexString(b2)).toString());
        }
    }

    private static boolean J(byte[] byArray) {
        int a2;
        byte[] byArray2 = byArray;
        int n2 = a2 = uSa.E;
        while (n2 < b.length) {
            if (byArray2[a2] != b[a2]) {
                return uSa.E != 0;
            }
            n2 = ++a2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Inflater inflater, IntBuffer intBuffer, int n2, int n3, int n4) throws IOException {
        void b2;
        void d2;
        int c2;
        we we2 = this;
        void var6_7 = c2;
        int n5 = d2.position();
        void var8_9 = (c2 * we2.F + XTa.W) / Yqa.i * we2.B;
        Object f2 = new byte[var8_9 + vRa.d];
        Object object = new byte[var8_9 + vRa.d];
        byte[] byArray = we2.F < Yqa.i ? new byte[c2 + vRa.d] : null;
        int n6 = c2 = uSa.E;
        while (n6 < b2) {
            void a2;
            void e2;
            Object object2 = f2;
            we2.J((Inflater)e2, (byte[])object2, uSa.E, ((Object)object2).length, (int)a2);
            we2.D((byte[])f2, (byte[])object);
            d2.position(n5 + c2 * var6_7);
            Object object3 = f2;
            we2.J((IntBuffer)d2, (byte[])f2, byArray);
            f2 = object;
            object = object3;
            n6 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(IntBuffer intBuffer, byte[] byArray, byte[] byArray2) {
        Object d2 = byArray;
        we b2 = this;
        switch (b2.d) {
            case 2: {
                void c2;
                b2.f((IntBuffer)c2, (byte[])d2);
                return;
            }
            case 6: {
                void c2;
                b2.d((IntBuffer)c2, (byte[])d2);
                return;
            }
            case 0: {
                we we2;
                Object a2;
                void c2;
                switch (b2.F) {
                    case 8: {
                        a2 = d2;
                        we2 = b2;
                        break;
                    }
                    case 4: {
                        we we3 = b2;
                        we2 = we3;
                        we3.J((byte[])d2, (byte[])a2);
                        break;
                    }
                    case 2: {
                        we we4 = b2;
                        we2 = we4;
                        we4.i((byte[])d2, (byte[])a2);
                        break;
                    }
                    case 1: {
                        we we5 = b2;
                        we2 = we5;
                        we5.e((byte[])d2, (byte[])a2);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException(Vua.Y);
                    }
                }
                we2.J((IntBuffer)c2, (byte[])a2);
                return;
            }
            case 4: {
                void c2;
                b2.C((IntBuffer)c2, (byte[])d2);
                return;
            }
            case 3: {
                we we6;
                Object a2;
                void c2;
                switch (b2.F) {
                    case 8: {
                        a2 = d2;
                        we6 = b2;
                        break;
                    }
                    case 4: {
                        we we7 = b2;
                        we6 = we7;
                        we7.d((byte[])d2, (byte[])a2);
                        break;
                    }
                    case 2: {
                        we we8 = b2;
                        we6 = we8;
                        we8.C((byte[])d2, (byte[])a2);
                        break;
                    }
                    case 1: {
                        we we9 = b2;
                        we6 = we9;
                        we9.A((byte[])d2, (byte[])a2);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException(Vua.Y);
                    }
                }
                we6.l((IntBuffer)c2, (byte[])a2);
                return;
            }
        }
        throw new UnsupportedOperationException(sOa.f);
    }

    /*
     * WARNING - void declaration
     */
    private int f(byte[] byArray, int n2) {
        void b2;
        int c2 = n2;
        we a2 = this;
        return b2[c2] << osa.c | (b2[c2 + vRa.d] & osa.Ja) << ERa.C | (b2[c2 + uqa.g] & osa.Ja) << Yqa.i | b2[c2 + yRa.d] & osa.Ja;
    }

    private void J(long a2) throws IOException {
        long l2 = a2;
        while (l2 > nqa.i) {
            we b2;
            long l3 = a2;
            l2 = l3 - b2.T.skip(l3);
        }
    }

    private void d() throws IOException {
        we a2;
        we we2 = a2;
        we2.J(we2.m, uSa.E, ITa.E);
        we we3 = a2;
        we3.f(we3.f(we3.m, uSa.E));
        we we4 = a2;
        we3.M = new CD();
        we we5 = a2;
        we3.M.j = we5.f(we5.m, AQa.P);
        we we6 = a2;
        we3.M.k = we6.f(we6.m, Yqa.i);
        we we7 = a2;
        we3.M.M = we7.f(we7.m, lqa.s);
        we we8 = a2;
        we3.M.m = we8.f(we8.m, ERa.C);
        we we9 = a2;
        we3.M.C = we9.J(we9.m, kTa.j);
        we we10 = a2;
        we3.M.A = we10.J(we10.m, cQa.o);
        we3.M.i = a2.m[osa.c];
        we3.M.J = a2.m[kTa.g];
    }

    /*
     * WARNING - void declaration
     */
    private void f(IntBuffer intBuffer, byte[] byArray) {
        void b2;
        void a2;
        we we2 = this;
        if (we2.u != null) {
            we we3 = we2;
            byte c2 = we3.u[vRa.d];
            byte by2 = we3.u[yRa.d];
            byte by3 = we3.u[tTa.h];
            int n2 = vRa.d;
            int n3 = ((void)a2).length;
            int n4 = n2;
            while (n4 < n3) {
                void v2 = a2;
                void var8_11 = v2[n2];
                void var9_12 = v2[n2 + vRa.d];
                void var10_13 = v2[n2 + uqa.g];
                int n5 = pua.o;
                if (var8_11 == c2 && var9_12 == by2 && var10_13 == by3) {
                    n5 = uSa.E;
                }
                b2.put((n5 & osa.Ja) << osa.c | (var8_11 & osa.Ja) << ERa.C | (var9_12 & osa.Ja) << Yqa.i | var10_13 & osa.Ja);
                n4 = n2 += 3;
            }
        } else {
            int c2 = vRa.d;
            int n6 = ((void)a2).length;
            int n7 = c2;
            while (n7 < n6) {
                int n8 = gsa.X | (a2[c2] & osa.Ja) << ERa.C | (a2[c2 + vRa.d] & osa.Ja) << Yqa.i;
                void v5 = a2[c2 + uqa.g];
                b2.put(n8 | v5 & osa.Ja);
                n7 = c2 += 3;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(byte[] byArray) {
        void a2;
        we we2 = this;
        int n2 = we2.B;
        int b2 = n2 + vRa.d;
        int n3 = ((void)a2).length;
        int n4 = b2;
        while (n4 < n3) {
            void v1 = a2;
            int n5 = b2;
            byte by2 = (byte)(v1[n5] + a2[b2 - n2]);
            v1[n5] = by2;
            n4 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Inflater inflater, IntBuffer intBuffer, int n2, int n3, int n4) throws IOException {
        int n5;
        void c2;
        we we2 = this;
        void var6_8 = c2;
        int n6 = n5 = uSa.E;
        while (n6 < XTa.W) {
            void b2;
            int n7 = J[n5];
            int n8 = x[n5];
            int n9 = r[n5];
            int n10 = U[n5];
            int f2 = r[n5 + vRa.d] - vRa.d;
            int n11 = U[n5 + vRa.d] - vRa.d;
            f2 = (c2 + f2) / n9;
            n11 = (b2 + n11) / n10;
            if (f2 != 0 && n11 != 0) {
                void d2;
                void a2;
                void e2;
                Object object = IntBuffer.allocate(f2 * n11);
                IntBuffer intBuffer2 = object;
                we2.f((Inflater)e2, intBuffer2, f2, n11, (int)a2);
                object = intBuffer2.array();
                int[] nArray = d2.array();
                int n12 = uSa.E;
                while (n12 < n11) {
                    int n13;
                    int n14 = uSa.E;
                    while (n14 < f2) {
                        int n15;
                        int n16 = n13 * f2 + n15;
                        int n17 = n13 * n10 + n8;
                        int n18 = n15 * n9 + n7;
                        n17 = n17 * var6_8 + n18;
                        nArray[n17] = (int)object[n16];
                        n14 = ++n15;
                    }
                    n12 = ++n13;
                }
            }
            n6 = ++n5;
        }
    }

    private void f(int n2) throws IOException {
        int b2 = n2;
        we a2 = this;
        if (b2 != a2.z + vRa.d) {
            throw new IOException(Xsa.s);
        }
        a2.z = b2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void e(byte[] byArray, byte[] byArray2) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = b2[vRa.d + (c2 >> yRa.d)] & osa.Ja;
            switch (n2 - c2) {
                default: {
                    a2[c2 + XTa.W] = (byte)((n4 & vRa.d) * osa.Ja);
                }
                case 7: {
                    a2[c2 + uua.p] = (byte)((n4 >> vRa.d & vRa.d) * osa.Ja);
                }
                case 6: {
                    a2[c2 + tTa.h] = (byte)((n4 >> uqa.g & vRa.d) * osa.Ja);
                }
                case 5: {
                    a2[c2 + AQa.P] = (byte)((n4 >> yRa.d & vRa.d) * osa.Ja);
                }
                case 4: {
                    a2[c2 + yRa.d] = (byte)((n4 >> AQa.P & vRa.d) * osa.Ja);
                }
                case 3: {
                    a2[c2 + uqa.g] = (byte)((n4 >> tTa.h & vRa.d) * osa.Ja);
                }
                case 2: {
                    a2[c2 + vRa.d] = (byte)((n4 >> uua.p & vRa.d) * osa.Ja);
                    break;
                }
                case 1: {
                }
            }
            int n5 = c2;
            a2[n5] = (byte)((n4 >> XTa.W) * osa.Ja);
            n3 = c2 += 8;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void C() throws IOException {
        int n2;
        we we2;
        IntBuffer intBuffer;
        IntBuffer intBuffer2;
        we we3;
        block16: {
            we we4 = we3 = this;
            we we5 = we3;
            we4.J(we4.m, uSa.E, AQa.P);
            we we6 = we3;
            we6.f(we6.f(we6.m, uSa.E));
            intBuffer2 = IntBuffer.allocate(we6.M.j * we3.M.k);
            we5.J(intBuffer2, we3.M.j, we3.M.k, Qta.k);
            intBuffer = IntBuffer.allocate(we5.A * we3.X);
            block0 : switch (we5.M.i) {
                case 0: {
                    we we7 = we3;
                    Object a2 = we7.l.get((int)(we7.l.size() - vRa.d)).I;
                    we2 = we3;
                    intBuffer.put((IntBuffer)a2);
                    ((IntBuffer)a2).rewind();
                    break block16;
                }
                case 1: {
                    we we8 = we3;
                    Object a2 = we8.l.get((int)(we8.l.size() - vRa.d)).I;
                    intBuffer.put((IntBuffer)a2);
                    ((IntBuffer)a2).rewind();
                    if (we3.M.J == 0) break;
                    we we9 = we3;
                    we2 = we9;
                    we9.J(intBuffer, we9.M);
                    break block16;
                }
                case 2: {
                    int a2 = we3.l.size();
                    if (a2 <= vRa.d) break;
                    int n3 = n2 = a2 - uqa.g;
                    while (n3 >= 0) {
                        CD cD = we3.l.get(n2);
                        if (cD.i != uqa.g) {
                            CD cD2 = cD;
                            intBuffer.put(cD.I);
                            cD2.I.rewind();
                            if (cD2.i != vRa.d) break block0;
                            we3.J(intBuffer, cD);
                            break block0;
                        }
                        n3 = --n2;
                    }
                    break block0;
                }
            }
            we2 = we3;
        }
        switch (we2.M.J) {
            case 0: {
                int a2;
                int n4 = a2 = we3.M.m;
                while (n4 < we3.M.m + we3.M.k) {
                    intBuffer.position(a2 * we3.A + we3.M.M);
                    intBuffer2.position((a2 - we3.M.m) * we3.M.j);
                    IntBuffer intBuffer3 = intBuffer2;
                    intBuffer3.limit(intBuffer3.position() + we3.M.j);
                    intBuffer.put(intBuffer2);
                    n4 = ++a2;
                }
                break;
            }
            case 1: {
                int n5;
                int n6 = n5 = we3.M.m;
                while (n6 < we3.M.m + we3.M.k) {
                    int n7 = n5 * we3.A + we3.M.M;
                    int n8 = (n5 - we3.M.m) * we3.M.j;
                    int n9 = we3.M.M;
                    while (n9 < we3.M.M + we3.M.j) {
                        int n10;
                        int n11 = intBuffer2.get(n8);
                        int n12 = intBuffer.get(n7);
                        int a2 = n11 >> osa.c & osa.Ja;
                        n2 = n12 >> osa.c & osa.Ja;
                        if (a2 == osa.Ja || a2 == 0 && n2 == 0) {
                            intBuffer.put(n7, n11);
                        } else {
                            int n13 = a2 * osa.Ja;
                            int n14 = (osa.Ja - a2) * n2;
                            int n15 = n13 + n14;
                            intBuffer.put(n7, n15 / osa.Ja << osa.c | ((n11 >> ERa.C & osa.Ja) * n13 + (n12 >> ERa.C & osa.Ja) * n14) / n15 | ((n11 >> Yqa.i & osa.Ja) * n13 + (n12 >> Yqa.i & osa.Ja) * n14) / n15 << Yqa.i | ((n11 & osa.Ja) * n13 + (n12 & osa.Ja) * n14) / n15 << ERa.C);
                        }
                        ++n8;
                        n9 = ++n10;
                        ++n7;
                    }
                    n6 = ++n5;
                }
                break;
            }
        }
        intBuffer.clear();
        we3.M.I = intBuffer;
        we3.l.add(we3.M);
        we3.M = null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void d(byte[] byArray, byte[] byArray2) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = b2[vRa.d + (c2 >> vRa.d)] & osa.Ja;
            switch (n2 - c2) {
                default: {
                    a2[c2 + vRa.d] = (byte)(n4 & Ypa.A);
                    break;
                }
                case 1: {
                }
            }
            int n5 = c2;
            a2[n5] = (byte)(n4 >> AQa.P);
            n3 = c2 += 2;
        }
        return;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void C(byte[] byArray, byte[] byArray2) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = b2[vRa.d + (c2 >> uqa.g)] & osa.Ja;
            switch (n2 - c2) {
                default: {
                    a2[c2 + yRa.d] = (byte)(n4 & yRa.d);
                }
                case 3: {
                    a2[c2 + uqa.g] = (byte)(n4 >> uqa.g & yRa.d);
                }
                case 2: {
                    a2[c2 + vRa.d] = (byte)(n4 >> AQa.P & yRa.d);
                    break;
                }
                case 1: {
                }
            }
            int n5 = c2;
            a2[n5] = (byte)(n4 >> uua.p);
            n3 = c2 += 4;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    private void l(byte[] byArray, byte[] byArray2) {
        void a2;
        void b2;
        int c2;
        we we2 = this;
        int n2 = we2.B;
        int n3 = c2 = vRa.d;
        while (n3 <= n2) {
            void v1 = b2;
            int n4 = c2;
            byte by2 = (byte)(v1[n4] + a2[c2]);
            v1[n4] = by2;
            n3 = ++c2;
        }
        int n5 = ((void)b2).length;
        int n6 = c2;
        while (n6 < n5) {
            void v5;
            int n7;
            int n8 = b2[c2 - n2] & osa.Ja;
            int n9 = a2[c2] & osa.Ja;
            int n10 = a2[c2 - n2] & osa.Ja;
            int n11 = n8 + n9 - n10;
            int n12 = n11 - n8;
            if (n12 < 0) {
                n12 = -n12;
            }
            if ((n7 = n11 - n9) < 0) {
                n7 = -n7;
            }
            if ((n11 -= n10) < 0) {
                n11 = -n11;
            }
            if (n12 <= n7 && n12 <= n11) {
                n10 = n8;
                v5 = b2;
            } else {
                if (n7 <= n11) {
                    n10 = n9;
                }
                v5 = b2;
            }
            int n13 = c2++;
            v5[n13] = (byte)(v5[n13] + (byte)n10);
            n6 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(IntBuffer intBuffer, byte[] byArray) {
        void b2;
        void a2;
        we we2 = this;
        if (we2.u != null) {
            byte by2 = we2.u[vRa.d];
            int n2 = vRa.d;
            int c2 = ((void)a2).length;
            int n3 = n2;
            while (n3 < c2) {
                void var6_10 = a2[n2];
                int n4 = var6_10 == by2 ? uSa.E : pua.o;
                b2.put((n4 & osa.Ja) << osa.c | (var6_10 & osa.Ja) << ERa.C | (var6_10 & osa.Ja) << Yqa.i | var6_10 & osa.Ja);
                n3 = ++n2;
            }
        } else {
            int n5 = vRa.d;
            int n6 = ((void)a2).length;
            int n7 = n5;
            while (n7 < n6) {
                void c2 = a2[n5];
                b2.put(gsa.X | (c2 & osa.Ja) << ERa.C | (c2 & osa.Ja) << Yqa.i | c2 & osa.Ja);
                n7 = ++n5;
            }
        }
    }

    private void l() throws IOException {
        CD cD;
        we we2;
        we we3 = we2 = this;
        IntBuffer a2 = IntBuffer.allocate(we3.A * we2.X);
        we we4 = we2;
        we3.J(a2, we4.A, we4.X, sOa.o);
        a2.rewind();
        we2.E = a2;
        (we2.M == null ? (cD = new CD()) : (cD = we2.M)).I = a2;
        we2.l.add(cD);
        we2.M = null;
    }

    /*
     * WARNING - void declaration
     */
    private int J(byte[] byArray, int n2) {
        void b2;
        int c2 = n2;
        we a2 = this;
        return (b2[c2] & osa.Ja) << Yqa.i | b2[c2 + vRa.d] & osa.Ja;
    }

    public we(InputStream inputStream) throws IOException {
        we a2;
        InputStream b2 = inputStream;
        we we2 = a2 = this;
        we we3 = a2;
        we we4 = a2;
        a2.l = new ArrayList<CD>();
        we4.z = pua.o;
        we3.f = vRa.d;
        we2.T = b2;
        we3.O = new CRC32();
        we2.m = n.get();
        we we5 = a2;
        Arrays.fill(we5.m, (byte)uSa.E);
        we5.J(we5.m, uSa.E, b.length);
        if (!we.J(a2.m)) {
            throw new IOException(jsa.C);
        }
        we we6 = a2;
        we we7 = we6;
        we6.l(ZRa.F);
        we6.i();
        we6.J();
        block9: while (true) {
            we we8;
            we7.f();
            switch (a2.p) {
                case 1229209940: {
                    we we9 = a2;
                    while (false) {
                    }
                    we8 = we9;
                    we9.l();
                    break;
                }
                case 1347179589: {
                    we we10 = a2;
                    we8 = we10;
                    we10.M();
                    break;
                }
                case 1951551059: {
                    we we11 = a2;
                    we8 = we11;
                    we11.e();
                    break;
                }
                case 1633899596: {
                    we we12 = a2;
                    we8 = we12;
                    we12.A();
                    break;
                }
                case 1717785676: {
                    we we13 = a2;
                    we8 = we13;
                    we13.d();
                    break;
                }
                case 1717846356: {
                    we we14 = a2;
                    we8 = we14;
                    we14.C();
                    break;
                }
                case 1229278788: {
                    break block9;
                }
                default: {
                    we8 = a2;
                }
            }
            we8.J();
            we7 = a2;
        }
        if (a2.d == yRa.d && a2.e == null) {
            throw new IOException(qQa.ga);
        }
        if (a2.j && a2.l.get((int)uSa.E).j == 0) {
            a2.l.remove(uSa.E);
        }
    }

    private void J(int n2) throws IOException {
        int b2 = n2;
        we a2 = this;
        if (a2.D != b2) {
            throw new IOException(MTa.e);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(byte[] byArray, byte[] byArray2) {
        void b2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)b2).length;
        int n3 = c2;
        while (n3 < n2) {
            void a2;
            void v1 = b2;
            int n4 = c2;
            byte by2 = (byte)(v1[n4] + a2[c2]);
            v1[n4] = by2;
            n3 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Inflater inflater, int n2) throws IOException {
        void b2;
        int c2 = n2;
        we a2 = this;
        block0: while (true) {
            we we2 = a2;
            while (we2.Q == 0) {
                int n3 = c2;
                a2.J();
                a2.l(n3);
                if (n3 != Qta.k) continue block0;
                we we3 = a2;
                we we4 = a2;
                we3.J(we3.m, uSa.E, AQa.P);
                we2 = we4;
                we4.f(we4.f(a2.m, uSa.E));
            }
            break;
        }
        we we5 = a2;
        c2 = we5.J(we5.m, uSa.E, a2.m.length);
        b2.setInput(a2.m, uSa.E, c2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(byte[] byArray, byte[] byArray2) {
        void a2;
        we we2 = this;
        int c2 = vRa.d;
        int n2 = ((void)a2).length;
        int n3 = c2;
        while (n3 < n2) {
            void b2;
            int n4 = b2[vRa.d + (c2 >> vRa.d)] & osa.Ja;
            switch (n2 - c2) {
                default: {
                    a2[c2 + vRa.d] = C[n4 & Ypa.A];
                    break;
                }
                case 1: {
                }
            }
            int n5 = c2;
            a2[n5] = C[n4 >> AQa.P];
            n3 = c2 += 2;
        }
        return;
    }

    private void f() throws IOException {
        we a2;
        we we2 = a2;
        we2.J(we2.m, uSa.E, Yqa.i);
        we2.D = we2.f(we2.m, uSa.E);
        we2.p = we2.f(we2.m, AQa.P);
        we2.Q = we2.D;
        we2.O.reset();
        we2.O.update(a2.m, AQa.P, AQa.P);
    }

    private void J() throws IOException {
        we we2;
        we we3 = this;
        if (we3.Q > 0) {
            we we4 = we3;
            we2 = we4;
            we4.J((long)(we4.Q + AQa.P));
        } else {
            we we5 = we3;
            we5.J(we5.m, uSa.E, AQa.P);
            int a2 = we5.f(we5.m, uSa.E);
            if ((int)we5.O.getValue() != a2) {
                throw new IOException(WSa.O);
            }
            we2 = we3;
        }
        we2.Q = uSa.E;
        we we6 = we3;
        we6.D = uSa.E;
        we6.p = uSa.E;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private void J(IntBuffer intBuffer, int n2, int n3, int n4) throws IOException {
        we we2 = this;
        Inflater e2 = new Inflater();
        try {
            void a2;
            void b2;
            void c2;
            void d2;
            Object object;
            if (we2.q != 0) {
                Object object2 = e2;
                object = object2;
                we2.J((Inflater)object2, (IntBuffer)d2, (int)c2, (int)b2, (int)a2);
            } else {
                we2.f(e2, (IntBuffer)d2, (int)c2, (int)b2, (int)a2);
                object = e2;
            }
            if (!((Inflater)object).finished()) {
                we2.f(e2, (int)a2);
            }
            return;
        }
        finally {
            e2.end();
        }
    }
}

