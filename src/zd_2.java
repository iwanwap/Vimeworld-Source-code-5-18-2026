/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  Lra
 *  Qta
 *  Se
 *  Yfa
 *  hqa
 *  qD
 *  vRa
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class zd_2 {
    public int[] C;
    private qD i;
    private Jy[] M;
    private ResourceLocation[] k;
    private int[] j;
    private ResourceLocation J;
    private int[] A;
    public int I;

    /*
     * WARNING - void declaration
     */
    public zd_2(ResourceLocation resourceLocation, int[] nArray, int[] nArray2, Jy[] jyArray, qD qD2) {
        zd_2 f2;
        void b2;
        void c2;
        void d2;
        void e2;
        zd_2 a2;
        zd_2 zd_22 = zd_23;
        zd_2 zd_23 = qD2;
        zd_2 zd_24 = a2 = zd_22;
        zd_2 zd_25 = a2;
        zd_2 zd_26 = a2;
        zd_2 zd_27 = a2;
        zd_2 zd_28 = a2;
        zd_2 zd_29 = a2;
        zd_29.J = null;
        zd_29.j = null;
        zd_28.k = null;
        zd_28.A = null;
        zd_27.M = null;
        zd_27.i = null;
        zd_26.C = null;
        zd_26.I = vRa.d;
        zd_26.J = e2;
        zd_25.j = d2;
        zd_25.A = c2;
        zd_24.M = b2;
        zd_24.i = f2;
    }

    public boolean J(Yfa yfa) {
        zd_2 b2 = yfa;
        zd_2 a2 = this;
        if (!Nf.J(((Yfa)b2).i, a2.M)) {
            return uSa.E != 0;
        }
        if (a2.i != null && ((Yfa)b2).k != null) {
            return a2.i.J(((Yfa)b2).k.getY());
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string) {
        int n2;
        int b22;
        zd_2 zd_22 = this;
        zd_22.k = new ResourceLocation[zd_22.j.length];
        ResourceLocation resourceLocation = Se.l((ResourceLocation)zd_22.J);
        if (resourceLocation == null) {
            Config.J(new StringBuilder().insert(3 >> 2, hQa.V).append(zd_22.J.J()).toString());
            return uSa.E != 0;
        }
        int n3 = b22 = uSa.E;
        while (n3 < zd_22.k.length) {
            n2 = zd_22.j[b22];
            if (n2 <= vRa.d) {
                zd_22.k[b22] = zd_22.J;
            } else {
                ResourceLocation resourceLocation2 = Se.J((ResourceLocation)resourceLocation, (int)n2);
                if (resourceLocation2 == null) {
                    Config.J(new StringBuilder().insert(2 & 5, hQa.V).append(zd_22.J.J()).toString());
                    return uSa.E != 0;
                }
                if (!Config.f(resourceLocation2)) {
                    Config.J(new StringBuilder().insert(3 >> 2, Qta.I).append(resourceLocation2.J()).toString());
                    return uSa.E != 0;
                }
                zd_22.k[b22] = resourceLocation2;
            }
            n3 = ++b22;
        }
        if (zd_22.A != null) {
            void a2;
            if (zd_22.A.length > zd_22.k.length) {
                Config.J(new StringBuilder().insert(3 & 4, fta.ca).append((String)a2).toString());
                int[] b22 = new int[zd_22.k.length];
                System.arraycopy(zd_22.A, uSa.E, b22, uSa.E, b22.length);
                zd_22.A = b22;
            }
            if (zd_22.A.length < zd_22.k.length) {
                int n4;
                Config.J(new StringBuilder().insert(3 ^ 3, Lra.G).append((String)a2).toString());
                int[] b22 = new int[zd_22.k.length];
                System.arraycopy(zd_22.A, uSa.E, b22, uSa.E, zd_22.A.length);
                zd_2 zd_23 = zd_22;
                n2 = ff.J(zd_23.A);
                int n5 = n4 = zd_23.A.length;
                while (n5 < b22.length) {
                    b22[n4++] = n2;
                    n5 = n4;
                }
                zd_22.A = b22;
            }
            zd_22.C = new int[zd_22.A.length];
            int b22 = uSa.E;
            int n6 = n2 = uSa.E;
            while (n6 < zd_22.A.length) {
                if (zd_22.A[n2] < 0) {
                    Config.J(new StringBuilder().insert(5 >> 3, gsa.b).append(zd_22.A[n2]).toString());
                    return uSa.E != 0;
                }
                zd_22.C[n2++] = b22 += zd_22.A[n2];
                n6 = n2;
            }
            zd_22.I = b22;
            if (zd_22.I <= 0) {
                Config.J(new StringBuilder().insert(3 & 4, hqa.M).append(b22).toString());
                zd_22.I = vRa.d;
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation J(ResourceLocation resourceLocation, int n2) {
        zd_2 zd_22;
        int b2;
        block4: {
            void a2;
            zd_2 zd_23 = this;
            b2 = uSa.E;
            if (zd_23.A == null) {
                b2 = a2 % zd_23.k.length;
                zd_22 = zd_23;
            } else {
                int c2;
                a2 %= zd_23.I;
                int n3 = c2 = uSa.E;
                while (n3 < zd_23.C.length) {
                    if (zd_23.C[c2] > a2) {
                        b2 = c2;
                        zd_22 = zd_23;
                        break block4;
                    }
                    n3 = ++c2;
                }
                zd_22 = zd_23;
            }
        }
        return zd_22.k[b2];
    }
}

