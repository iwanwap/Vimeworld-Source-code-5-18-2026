/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Jy
 *  LE
 *  NTa
 *  Qta
 *  RQa
 *  Rua
 *  WE
 *  Xsa
 *  Yfa
 *  hra
 *  pua
 *  qD
 *  vPa
 *  vRa
 *  zd
 */
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class bD_3 {
    public zd[] j;
    public ResourceLocation[] J;
    public String A;
    public String I;

    /*
     * WARNING - void declaration
     */
    private zd[] J(Properties properties, ResourceLocation resourceLocation, LE lE2) {
        int n2;
        void c2;
        bD_3 bD_32 = this;
        ArrayList<zd> arrayList = new ArrayList<zd>();
        int n3 = c2.size();
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            int d22 = n2 + vRa.d;
            Object object = c2.getProperty(WPa.G + d22);
            if (object != null) {
                void b2;
                void a2;
                void v1 = a2;
                object = v1.J((String)object);
                int[] nArray = v1.J(c2.getProperty(new StringBuilder().insert(3 >> 2, KPa.u).append(d22).toString()));
                Jy[] jyArray = v1.J(c2.getProperty(new StringBuilder().insert(2 & 5, EQa.l).append(d22).toString()));
                qD qD2 = v1.J(c2.getProperty(new StringBuilder().insert(3 & 4, RQa.K).append(d22).toString()));
                if (qD2 == null) {
                    qD2 = bD_32.J((Properties)c2, d22);
                }
                zd d22 = new zd((ResourceLocation)b2, (int[])object, nArray, jyArray, qD2);
                arrayList.add(d22);
            }
            n4 = ++n2;
        }
        ArrayList<zd> arrayList2 = arrayList;
        zd[] zdArray = arrayList2.toArray(new zd[arrayList2.size()]);
        return zdArray;
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation J(ResourceLocation resourceLocation, Yfa yfa2) {
        void b2;
        void a2;
        int n2;
        bD_3 bD_32 = this;
        if (bD_32.j != null) {
            int n3 = n2 = uSa.E;
            while (n3 < bD_32.j.length) {
                bD_3 c2 = bD_32.j[n2];
                if (c2.J((Yfa)a2)) {
                    return c2.J((ResourceLocation)b2, a2.j);
                }
                n3 = ++n2;
            }
        }
        if (bD_32.J != null) {
            n2 = a2.j;
            int c2 = n2 % bD_32.J.length;
            return bD_32.J[c2];
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public bD_3(String string, ResourceLocation[] resourceLocationArray) {
        void a2;
        void b2;
        bD_3 bD_32;
        bD_3 bD_33 = bD_32 = this;
        bD_3 bD_34 = bD_32;
        bD_3 bD_35 = bD_32;
        bD_35.A = null;
        bD_35.I = null;
        bD_34.J = null;
        bD_33.j = null;
        bD_3 c2 = new LE(rQa.c);
        bD_34.A = c2.f((String)b2);
        bD_33.I = c2.J((String)b2);
        bD_33.J = a2;
    }

    private qD J(Properties properties, int n2) {
        String b2;
        int c22 = n2;
        bD_3 a2 = this;
        void v0 = b2;
        b2 = v0.getProperty(Rua.y + c22);
        String c22 = v0.getProperty(new StringBuilder().insert(3 & 4, NTa.s).append(c22).toString());
        if (b2 == null && c22 == null) {
            return null;
        }
        int n3 = uSa.E;
        if (b2 != null && (n3 = Config.J(b2, pua.o)) < 0) {
            Config.J(new StringBuilder().insert(2 & 5, Xsa.Ga).append(b2).toString());
            return null;
        }
        int n4 = hra.Ja;
        if (c22 != null && (n4 = Config.J(c22, pua.o)) < 0) {
            Config.J(new StringBuilder().insert(2 & 5, tTa.K).append(c22).toString());
            return null;
        }
        if (n4 < 0) {
            Config.J(new StringBuilder().insert(3 & 4, Xpa.k).append(b2).append(TOa.n).append(c22).toString());
            return null;
        }
        qD qD2 = new qD();
        qD2.J(new WE(n3, n4));
        return qD2;
    }

    /*
     * WARNING - void declaration
     */
    public bD_3(Properties properties, String string, ResourceLocation resourceLocation) {
        void a2;
        void c2;
        void b2;
        bD_3 bD_32;
        bD_3 bD_33 = bD_32 = this;
        bD_3 bD_34 = bD_32;
        bD_34.A = null;
        bD_34.I = null;
        bD_33.J = null;
        bD_32.j = null;
        bD_3 d2 = new LE(rQa.c);
        bD_33.A = d2.f((String)b2);
        bD_32.I = d2.J((String)b2);
        bD_32.j = bD_32.J((Properties)c2, (ResourceLocation)a2, (LE)d2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string) {
        Object object;
        void a2;
        bD_3 bD_32 = this;
        if (bD_32.J == null && bD_32.j == null) {
            Config.J(new StringBuilder().insert(3 ^ 3, vPa.q).append((String)a2).toString());
            return uSa.E != 0;
        }
        if (bD_32.j != null) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < bD_32.j.length) {
                object = bD_32.j[b2];
                if (!object.J((String)a2)) {
                    return uSa.E != 0;
                }
                n2 = ++b2;
            }
        }
        if (bD_32.J != null) {
            int b2;
            int n3 = b2 = uSa.E;
            while (n3 < bD_32.J.length) {
                object = bD_32.J[b2];
                if (!Config.f((ResourceLocation)object)) {
                    Config.J(new StringBuilder().insert(3 >> 2, Qta.I).append(((ResourceLocation)object).J()).toString());
                    return uSa.E != 0;
                }
                n3 = ++b2;
            }
        }
        return vRa.d != 0;
    }
}

