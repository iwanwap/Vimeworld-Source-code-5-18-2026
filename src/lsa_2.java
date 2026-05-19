/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  JPa
 *  Kpa
 *  Lz
 *  SRa
 *  WTa
 *  YRa
 *  YTa
 *  ata
 *  lsa
 *  mTa
 *  pqa
 *  uTa
 *  vL
 *  vRa
 */
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class lsa_2 {
    public static HashMap<String, lsa> L = new HashMap();
    public ArrayList<YTa> E;
    public double m;
    public Object C;
    public long i;
    public static Kpa M = Kpa.J();
    public boolean k;
    public double j;
    public long J;
    public boolean A;
    public uTa I;

    public void l() {
        lsa_2 a2;
        lsa_2.M.z.ba = a2.A;
        WTa.m = UOa.d;
        lsa_2.M.z.LA = WTa.M;
        mTa.j = JPa.N;
    }

    public void f() {
    }

    /*
     * Unable to fully structure code
     */
    public YTa J(YTa var1_1, YTa var2_2, double var3_3, double var5_5, float var7_6) {
        block4: {
            block6: {
                block5: {
                    f = var2_2;
                    v0 = d = this;
                    e = v0.I.J(e, (YTa)f, (double)c, (double)b);
                    if (v0.C == null) break block4;
                    v1 = e;
                    v1.rotationPitch = d.j;
                    v1.rotationYaw = d.m;
                    f = null;
                    if (!(d.C instanceof Gl)) break block5;
                    f = lsa_2.J((vL)d.C, (float)a);
                    if (!(d.C instanceof Sx)) ** GOTO lbl20
                    v2 = f = new Lz(f.A, f.j - ((vL)d.C).C(), f.J);
                    break block6;
                }
                if (d.C instanceof vL) {
                    v2 = f = new Lz(((vL)d.C).la, ((vL)d.C).Z + (double)((vL)d.C).u / KPa.y, ((vL)d.C).A);
                } else {
                    if (d.C instanceof ata) {
                        f = new Lz((double)((ata)d.C).posX, (double)((ata)d.C).posY, (double)((ata)d.C).posZ);
                    }
lbl20:
                    // 4 sources

                    v2 = f;
                }
            }
            if (v2 != null) {
                c = System.nanoTime() - WTa.I;
                e.J((Lz)f, SRa.K, SRa.K, (double)c / mSa.m * mTa.i);
            }
            v3 = d;
            v4 = e;
            v3.j = v4.rotationPitch;
            v3.m = v4.rotationYaw;
        }
        return e;
    }

    public static lsa J(String a2) {
        return (lsa_2)L.get(a2);
    }

    /*
     * WARNING - void declaration
     */
    public lsa_2(ArrayList<YTa> arrayList, long l2, uTa uTa2, Object object) {
        void a2;
        void b2;
        void c2;
        lsa_2 d2;
        ArrayList<YTa> e2 = arrayList;
        lsa_2 lsa_22 = d2 = this;
        lsa_2 lsa_23 = d2;
        lsa_23.i = System.currentTimeMillis();
        lsa_23.k = vRa.d;
        lsa_23.E = e2;
        lsa_22.J = c2;
        lsa_22.I = b2;
        if (e2 != null) {
            lsa_2 lsa_24 = d2;
            lsa_24.A = lsa_2.M.z.ba;
            lsa_24.j = ((YTa)e2.get((int)uSa.E)).rotationPitch;
            d2.m = ((YTa)e2.get((int)uSa.E)).rotationYaw;
        }
        d2.C = a2;
    }

    public abstract String J();

    public static void J() {
        lsa_2.J(BQa.la, (lsa)new YRa(null, nqa.i, null, null));
        lsa_2.J(xqa.q, new hsa(null, nqa.i, null, null));
    }

    public abstract lsa J(ArrayList<YTa> var1, long var2, uTa var4, Object var5);

    public Gl J() {
        return lsa_2.M.c;
    }

    private static Lz J(vL vL2, float f2) {
        float b2 = f2;
        vL a2 = vL2;
        if (b2 == pqa.r) {
            return new Lz(a2.la, a2.Z, a2.A);
        }
        vL vL3 = a2;
        vL vL4 = a2;
        double d2 = vL3.c + (vL4.la - a2.c) * (double)b2;
        double d3 = vL4.ba + (a2.Z - a2.ba) * (double)b2;
        double d4 = vL3.r + (a2.A - a2.r) * (double)b2;
        return new Lz(d2, d3, d4);
    }

    public static void J(String string, lsa lsa2) {
        String b2 = lsa2;
        String a2 = string;
        L.put(a2, (lsa)b2);
    }

    public void J(YTa yTa) {
        lsa_2 b2 = yTa;
        lsa_2 a2 = this;
        lsa_2.M.z.ba = vRa.d;
        mTa.j = (float)((YTa)b2).roll;
        lsa_2.M.z.LA = (float)((YTa)b2).zoom;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        void a22;
        double d2;
        long l2;
        lsa_2 lsa_22 = this;
        if (lsa_22.k) {
            lsa_22.f();
            lsa_22.k = uSa.E;
        }
        if ((l2 = System.currentTimeMillis() - lsa_22.i) >= lsa_22.J) {
            mTa.E = null;
            lsa_22.l();
            return;
        }
        lsa_2 lsa_23 = lsa_22;
        long l3 = lsa_23.J / (long)(lsa_22.E.size() - vRa.d);
        int b2 = Math.min((int)(l2 / l3), lsa_22.E.size() - uqa.g);
        YTa yTa = lsa_23.E.get(b2);
        YTa a22 = lsa_22.J(yTa, b2 = lsa_22.E.get(b2 + vRa.d), d2 = (double)(l2 % l3) / (double)l3, (double)l2 / (double)lsa_22.J, (float)a22);
        if (a22 != null) {
            lsa_22.J(a22);
        }
    }
}

