/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  ERa
 *  pua
 *  vRa
 *  xJa
 */
import java.awt.Dimension;
import java.nio.IntBuffer;
import java.util.ArrayList;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class HF_2 {
    private final int C;
    private final int[] i;
    private int[][] M;
    private IntBuffer[] k;
    private final int j;
    private final String J;
    private final boolean A;
    private Dimension[] I;

    /*
     * WARNING - void declaration
     */
    public static Dimension[] J(int n2, int n3, String string) {
        void a2;
        void b2;
        int n4 = n2;
        int c2 = Cg.l((int)n4);
        int n5 = Cg.l((int)b2);
        if (c2 == n4 && n5 == b2) {
            ArrayList<Dimension> arrayList = new ArrayList<Dimension>();
            int n6 = c2;
            while (true) {
                if ((c2 = n6 / uqa.g) <= 0 && (n5 /= uqa.g) <= 0) {
                    ArrayList<Dimension> arrayList2 = arrayList;
                    return arrayList2.toArray(new Dimension[arrayList2.size()]);
                }
                if (c2 <= 0) {
                    c2 = vRa.d;
                }
                if (n5 <= 0) {
                    n5 = vRa.d;
                }
                int cfr_ignored_0 = c2 * n5 * AQa.P;
                Dimension dimension = new Dimension(c2, n5);
                n6 = c2;
                arrayList.add(dimension);
            }
        }
        Config.J(new StringBuilder().insert(3 & 4, Jpa.P).append((String)a2).append(pua.s).append(n4).append(rRa.X).append((int)b2).toString());
        return new Dimension[uSa.E];
    }

    /*
     * WARNING - void declaration
     */
    public static IntBuffer[] J(Dimension[] dimensionArray, int[][] nArray) {
        int b2;
        Dimension[] dimensionArray2 = dimensionArray;
        if (dimensionArray2 == null) {
            return null;
        }
        IntBuffer[] intBufferArray = new IntBuffer[dimensionArray2.length];
        int n2 = b2 = uSa.E;
        while (n2 < dimensionArray2.length) {
            void a2;
            Dimension dimension = dimensionArray2[b2];
            IntBuffer intBuffer = xJa.J((int)(dimension.width * dimension.height));
            void var5_6 = a2[b2];
            intBuffer.clear();
            intBuffer.put((int[])var5_6);
            intBuffer.clear();
            intBufferArray[b2++] = intBuffer;
            n2 = b2;
        }
        return intBufferArray;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4, int n5) {
        void a2;
        int c2;
        int d2 = n4;
        int b2 = n2;
        c2 = HF_2.f(b2, c2);
        d2 = HF_2.f(d2, (int)a2);
        return HF_2.f(c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, String string) {
        void b22;
        String c2 = string;
        int a2 = n2;
        Dimension[] b22 = HF_2.J(a2, (int)b22, c2);
        int n4 = c2 = uSa.E;
        while (n4 < b22.length) {
            Dimension dimension = b22[c2];
            int n5 = dimension.width;
            int n6 = dimension.height;
            int n7 = c2 + vRa.d;
            GL11.glTexImage2D(BQa.Z, n7, rSa.Ka, n5, n6, uSa.E, NSa.U, aua.N, (IntBuffer)null);
            n4 = ++c2;
        }
    }

    private static int f(int n2, int n3) {
        int n4;
        int a2;
        int n5 = n2;
        int n6 = (n5 & gsa.X) >> osa.c & osa.Ja;
        int b2 = (a2 & gsa.X) >> osa.c & osa.Ja;
        int n7 = (n6 + b2) / uqa.g;
        if (n6 == 0 && b2 == 0) {
            n6 = vRa.d;
            b2 = vRa.d;
            n4 = n5;
        } else {
            if (n6 == 0) {
                n5 = a2;
                n7 /= uqa.g;
            }
            if (b2 == 0) {
                a2 = n5;
                n7 /= uqa.g;
            }
            n4 = n5;
        }
        int n8 = (n4 >> ERa.C & osa.Ja) * n6;
        int n9 = (n5 >> Yqa.i & osa.Ja) * n6;
        int n10 = (n5 & osa.Ja) * n6;
        int n11 = (a2 >> ERa.C & osa.Ja) * b2;
        int n12 = (a2 >> Yqa.i & osa.Ja) * b2;
        a2 = (a2 & osa.Ja) * b2;
        n8 = (n8 + n11) / (n6 + b2);
        n9 = (n9 + n12) / (n6 + b2);
        a2 = (n10 + a2) / (n6 + b2);
        return n7 << osa.c | n8 << ERa.C | n9 << Yqa.i | a2;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] J(int[] nArray, int n2, int n3, Dimension[] dimensionArray) {
        int n4;
        void a2;
        int[] nArray2;
        int[] b2 = nArray2 = nArray;
        int n5 = vRa.d;
        int[][] nArrayArray = new int[((void)a2).length][];
        int n6 = n4 = uSa.E;
        while (n6 < ((void)a2).length) {
            int c2;
            void v1 = a2[n4];
            int n7 = v1.width;
            int n8 = v1.height;
            int[] nArray3 = new int[n7 * n8];
            int n9 = n4;
            nArrayArray[n9] = nArray3;
            int cfr_ignored_0 = n9 + vRa.d;
            if (n5 != 0) {
                int n10 = uSa.E;
                while (n10 < n7) {
                    int n11;
                    int n12 = uSa.E;
                    while (n12 < n8) {
                        int d2;
                        int n13 = b2[n11 * uqa.g + uSa.E + (d2 * uqa.g + uSa.E) * c2];
                        int n14 = b2[n11 * uqa.g + vRa.d + (d2 * uqa.g + uSa.E) * c2];
                        int n15 = b2[n11 * uqa.g + vRa.d + (d2 * uqa.g + vRa.d) * c2];
                        int n16 = b2[n11 * uqa.g + uSa.E + (d2 * uqa.g + vRa.d) * c2];
                        n13 = HF_2.J(n13, n14, n15, n16);
                        int n17 = n11 + d2 * n7;
                        nArray3[n17] = n13;
                        n12 = ++d2;
                    }
                    n10 = ++n11;
                }
            }
            b2 = nArray3;
            c2 = n7;
            if (n7 <= vRa.d || n8 <= vRa.d) {
                n5 = uSa.E;
            }
            n6 = ++n4;
        }
        return nArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3) {
        void a2;
        void b2;
        HF_2 hF_2 = this;
        int n4 = (b2 & gsa.X) >> osa.c & osa.Ja;
        int c2 = (a2 & gsa.X) >> osa.c & osa.Ja;
        return (n4 + c2 >> vRa.d << osa.c) + ((b2 & Psa.P) + (a2 & Psa.P) >> vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public HF_2(String string, int n2, int n3, int[] nArray, boolean bl) {
        void a2;
        void b2;
        void d2;
        void e2;
        HF_2 c2;
        int f2 = n3;
        HF_2 hF_2 = c2 = this;
        HF_2 hF_22 = c2;
        HF_2 hF_23 = c2;
        c2.J = e2;
        hF_23.C = d2;
        hF_23.j = f2;
        hF_22.i = b2;
        hF_22.A = a2;
        hF_2.I = HF_2.J((int)d2, f2, (String)e2);
        hF_2.M = HF_2.J((int[])b2, (int)d2, f2, c2.I);
        if (a2 != false) {
            c2.k = HF_2.J(c2.I, c2.M);
        }
    }
}

