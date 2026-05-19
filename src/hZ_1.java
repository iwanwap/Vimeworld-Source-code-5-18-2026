/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OCa
 *  Qta
 *  RZ
 *  asa
 *  hZ
 *  hra
 *  pua
 *  uOa
 *  ura
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hZ_1 {
    private List<Boolean> C;
    private final File i;
    private int M;
    private RandomAccessFile k;
    private static final byte[] j = new byte[mPa.H];
    private long J;
    private final int[] A;
    private final int[] I;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public hZ_1(File file) {
        hZ_1 a2;
        File b22 = file;
        hZ_1 hZ_12 = a2 = this;
        a2.I = new int[ura.V];
        hZ_12.A = new int[ura.V];
        hZ_12.i = b22;
        hZ_12.M = uSa.E;
        try {
            int n2;
            int n3;
            if (b22.exists()) {
                a2.J = b22.lastModified();
            }
            a2.k = new RandomAccessFile(b22, Yua.Z);
            if (a2.k.length() < TOa.ja) {
                int n4 = b22 = uSa.E;
                while (n4 < ura.V) {
                    a2.k.writeInt(uSa.E);
                    n4 = ++b22;
                }
                int n5 = b22 = uSa.E;
                while (n5 < ura.V) {
                    a2.k.writeInt(uSa.E);
                    n5 = ++b22;
                }
                a2.M += uOa.M;
            }
            if ((a2.k.length() & Qta.ca) != nqa.i) {
                int n6 = b22 = uSa.E;
                while ((long)n6 < (a2.k.length() & Qta.ca)) {
                    a2.k.write(uSa.E);
                    n6 = ++b22;
                }
            }
            int b22 = (int)a2.k.length() / mPa.H;
            a2.C = Lists.newArrayListWithCapacity(b22);
            int n7 = n3 = uSa.E;
            while (n7 < b22) {
                a2.C.add(vRa.d != 0);
                n7 = ++n3;
            }
            a2.C.set(uSa.E, uSa.E != 0);
            a2.C.set(vRa.d, uSa.E != 0);
            a2.k.seek(nqa.i);
            n3 = uSa.E;
            int n8 = n3;
            while (n8 < ura.V) {
                hZ_1 hZ_13 = a2;
                hZ_13.I[n3] = n2 = hZ_13.k.readInt();
                if (n2 != 0 && (n2 >> Yqa.i) + (n2 & osa.Ja) <= a2.C.size()) {
                    int n9 = uSa.E;
                    while (n9 < (n2 & osa.Ja)) {
                        int n10;
                        int n11 = (n2 >> Yqa.i) + n10;
                        a2.C.set(n11, uSa.E != 0);
                        n9 = ++n10;
                    }
                }
                n8 = ++n3;
            }
            n3 = uSa.E;
            while (n3 < ura.V) {
                hZ_1 hZ_14 = a2;
                n2 = hZ_14.k.readInt();
                hZ_14.A[n3++] = n2;
            }
            return;
        }
        catch (IOException b22) {
            b22.printStackTrace();
        }
    }

    public synchronized DataInputStream J(int n2, int n3) {
        int b22;
        int c2;
        hZ_1 a2;
        block9: {
            a2 = this;
            c2 = n3;
            if (a2.J(b22, c2)) {
                return null;
            }
            try {
                b22 = a2.J(b22, c2);
                if (b22 != 0) break block9;
                return null;
            }
            catch (IOException b22) {
                return null;
            }
        }
        c2 = b22 >> Yqa.i;
        int n4 = b22 & osa.Ja;
        if (c2 + n4 > a2.C.size()) {
            return null;
        }
        hZ_1 hZ_12 = a2;
        hZ_12.k.seek(c2 * mPa.H);
        c2 = hZ_12.k.readInt();
        if (c2 > mPa.H * n4) {
            return null;
        }
        if (c2 <= 0) {
            return null;
        }
        byte by2 = a2.k.readByte();
        n4 = by2;
        if (by2 == vRa.d) {
            byte[] byArray = new byte[c2 - vRa.d];
            a2.k.read(byArray);
            return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray))));
        }
        if (n4 == uqa.g) {
            byte[] byArray = new byte[c2 - vRa.d];
            a2.k.read(byArray);
            return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(byArray))));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        hZ_1 a2;
        int d2 = n4;
        hZ_1 hZ_12 = a2 = this;
        hZ_12.A[c2 + b2 * fPa.i] = d2;
        hZ_12.k.seek(mPa.H + (c2 + b2 * fPa.i) * AQa.P);
        hZ_12.k.writeInt(d2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized void J(int n2, int n3, byte[] byArray, int n4) {
        hZ_1 hZ_12 = this;
        try {
            void b2;
            hZ_1 hZ_13;
            void a2;
            void c2;
            void d2;
            int n5 = hZ_12.J((int)d2, (int)c2);
            int n6 = n5 >> Yqa.i;
            int e2 = n5 & osa.Ja;
            void var8_10 = (a2 + tTa.h) / mPa.H + vRa.d;
            if (var8_10 >= hra.Ja) {
                return;
            }
            if (n6 != 0 && e2 == var8_10) {
                hZ_1 hZ_14 = hZ_12;
                hZ_13 = hZ_14;
                hZ_14.J(n6, (byte[])b2, (int)a2);
            } else {
                int n7;
                int n8;
                int n9;
                block18: {
                    int n10 = n9 = uSa.E;
                    while (n10 < e2) {
                        int n11 = n6 + n9;
                        hZ_12.C.set(n11, vRa.d != 0);
                        n10 = ++n9;
                    }
                    n9 = hZ_12.C.indexOf(vRa.d != 0);
                    e2 = uSa.E;
                    if (n9 != pua.o) {
                        int n12 = n8 = n9;
                        while (n12 < hZ_12.C.size()) {
                            int n13;
                            if (e2 != 0) {
                                n13 = hZ_12.C.get(n8).booleanValue() ? ++e2 : uSa.E;
                            } else {
                                if (hZ_12.C.get(n8).booleanValue()) {
                                    n9 = n8;
                                    e2 = vRa.d;
                                }
                                n13 = e2;
                            }
                            if (n13 >= var8_10) {
                                n7 = e2;
                                break block18;
                            }
                            n12 = ++n8;
                        }
                    }
                    n7 = e2;
                }
                if (n7 >= var8_10) {
                    n6 = n9;
                    hZ_12.J((int)d2, (int)c2, n9 << Yqa.i | var8_10);
                    int n14 = n8 = uSa.E;
                    while (n14 < var8_10) {
                        int n15 = n6 + n8;
                        hZ_12.C.set(n15, uSa.E != 0);
                        n14 = ++n8;
                    }
                    hZ_1 hZ_15 = hZ_12;
                    hZ_13 = hZ_15;
                    hZ_15.J(n6, (byte[])b2, (int)a2);
                } else {
                    hZ_1 hZ_16 = hZ_12;
                    hZ_16.k.seek(hZ_16.k.length());
                    n6 = hZ_16.C.size();
                    int n16 = n8 = uSa.E;
                    while (n16 < var8_10) {
                        hZ_1 hZ_17 = hZ_12;
                        hZ_17.k.write(j);
                        hZ_17.C.add(uSa.E != 0);
                        n16 = ++n8;
                    }
                    hZ_13 = hZ_12;
                    hZ_1 hZ_18 = hZ_12;
                    hZ_12.M += mPa.H * var8_10;
                    hZ_18.J(n6, (byte[])b2, (int)a2);
                    hZ_18.J((int)d2, (int)c2, n6 << Yqa.i | var8_10);
                }
            }
            hZ_13.f((int)d2, (int)c2, (int)(OCa.J() / asa.fa));
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3) {
        void b2;
        int c2 = n3;
        hZ_1 a2 = this;
        return a2.I[b2 + c2 * fPa.i];
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        hZ_1 a2;
        int d2 = n4;
        hZ_1 hZ_12 = a2 = this;
        hZ_12.I[c2 + b2 * fPa.i] = d2;
        hZ_12.k.seek((long)((c2 + b2 * fPa.i) * AQa.P));
        hZ_12.k.writeInt(d2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, int n3) {
        void b2;
        hZ_1 a2 = this;
        int c2 = n3;
        if (a2.J((int)b2, c2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() throws IOException {
        hZ_1 a2;
        if (a2.k != null) {
            a2.k.close();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, byte[] byArray, int n3) throws IOException {
        void b2;
        void c2;
        hZ_1 a2;
        int d2 = n3;
        hZ_1 hZ_12 = a2 = this;
        hZ_12.k.seek((long)(c2 * mPa.H));
        hZ_12.k.writeInt(d2 + vRa.d);
        hZ_12.k.writeByte(uqa.g);
        hZ_12.k.write((byte[])b2, uSa.E, d2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        hZ_1 a2 = this;
        if (b2 < 0 || b2 >= fPa.i || c2 < 0 || c2 >= fPa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public DataOutputStream J(int n2, int n3) {
        void b2;
        hZ_1 a2 = this;
        int c2 = n3;
        if (a2.J((int)b2, c2)) {
            return null;
        }
        return new DataOutputStream(new DeflaterOutputStream((OutputStream)new RZ((hZ)a2, (int)b2, c2)));
    }
}

