/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AQ
 *  JPa
 *  YQ
 *  oc
 *  pqa
 *  uKa
 *  vRa
 *  xJa
 *  zp
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.joml.Quaternionf;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zp_1 {
    public float v;
    public float o;
    public float h;
    public List<oc> K;
    public List<zp> H;
    public float c;
    public float B;
    public float d;
    private boolean a;
    public float b;
    public float l;
    public float e;
    public float G;
    public float D;
    public float f;
    public float F;
    public float g;
    public float L;
    public boolean E;
    public float m;
    public float C;
    private int i;
    public zp M;
    public float k;
    private boolean j;
    public float J;
    public float A;
    public String I;

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4) {
        void b2;
        void c2;
        zp_1 a2;
        float d2 = f4;
        zp_1 zp_12 = a2 = this;
        zp_12.e = zp_12.g = c2;
        zp_1 zp_13 = a2;
        zp_13.l = zp_13.D = b2;
        zp_1 zp_14 = a2;
        zp_14.v = zp_14.A = d2;
    }

    public int J() {
        zp_1 a2;
        return a2.i;
    }

    public void f() {
        Object a2;
        zp_1 zp_12 = this;
        if (zp_12.j) {
            zp_12.j = uSa.E;
            GL11.glDeleteLists(zp_12.i, vRa.d);
            zp_12.i = uSa.E;
        }
        Object object = a2 = zp_12.H.iterator();
        while (object.hasNext()) {
            ((zp_1)a2.next()).f();
            object = a2;
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        zp_1 a2 = this;
        a2.a = b2;
    }

    public boolean l() {
        zp_1 a2;
        return a2.a;
    }

    /*
     * WARNING - void declaration
     */
    private void f(float f2) {
        Object object;
        Iterator<zp> b2;
        void a22;
        zp_1 zp_12 = this;
        if (zp_12.i == 0) {
            zp_12.i = xJa.J((int)vRa.d);
        }
        zp_1 zp_13 = zp_12;
        GL11.glNewList(zp_13.i, Wqa.O);
        mr mr2 = new mr();
        void v1 = a22;
        mr2.f((float)v1, (float)v1, (float)v1);
        if (!zp_13.a && !zp_12.E) {
            if (zp_12.f != JPa.N || zp_12.C != JPa.N || zp_12.k != JPa.N) {
                zp_1 zp_14 = zp_12;
                mr2.J(zp_14.f, zp_14.C, zp_12.k);
            }
            if (zp_12.g != JPa.N || zp_12.D != JPa.N || zp_12.A != JPa.N) {
                zp_1 zp_15 = zp_12;
                mr2.J(new Quaternionf().rotationZYX(zp_15.A, zp_15.D, zp_12.g));
            }
            if (zp_12.F != pqa.r || zp_12.d != pqa.r || zp_12.L != pqa.r) {
                zp_1 zp_16 = zp_12;
                mr2.f(zp_16.F, zp_16.d, zp_12.L);
            }
        }
        AQ a22 = new AQ();
        Iterator<zp> iterator = b2 = zp_12.K.iterator();
        while (iterator.hasNext()) {
            object = (oc)b2.next();
            iterator = b2;
            object.J(mr2, a22);
        }
        if (!zp_12.E) {
            Iterator<zp> iterator2 = b2 = zp_12.H.iterator();
            while (iterator2.hasNext()) {
                object = (zp_1)b2.next();
                iterator2 = b2;
                ((zp_1)object).J(mr2, a22);
            }
        }
        a22.J();
        GL11.glEndList();
        zp_12.j = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(mr mr2, AQ aQ2) {
        void a2;
        Object object;
        Iterator<oc> iterator;
        mr c2 = mr2;
        zp_1 b2 = this;
        c2.C();
        if (b2.f != JPa.N || b2.C != JPa.N || b2.k != JPa.N) {
            zp_1 zp_12 = b2;
            c2.J(zp_12.f, zp_12.C, b2.k);
        }
        if (b2.g != JPa.N || b2.D != JPa.N || b2.A != JPa.N) {
            zp_1 zp_13 = b2;
            c2.J(new Quaternionf().rotationZYX(zp_13.A, zp_13.D, b2.g));
        }
        if (b2.F != pqa.r || b2.d != pqa.r || b2.L != pqa.r) {
            zp_1 zp_14 = b2;
            c2.f(zp_14.F, zp_14.d, b2.L);
        }
        Iterator<oc> iterator2 = iterator = b2.K.iterator();
        while (iterator2.hasNext()) {
            object = iterator.next();
            iterator2 = iterator;
            object.J(c2, (AQ)a2);
        }
        iterator = b2.H.iterator();
        Iterator<zp> iterator3 = iterator;
        while (iterator3.hasNext()) {
            object = (zp_1)iterator.next();
            iterator3 = iterator;
            ((zp_1)object).J(c2, (AQ)a2);
        }
        c2.f();
    }

    public void J(zp zp2) {
        zp_1 b2 = zp2;
        zp_1 a2 = this;
        if (a2.H.isEmpty()) {
            zp_1 zp_12 = a2;
            zp_12.H = new ArrayList<zp>();
        }
        b2.M = a2;
        a2.H.add((zp)b2);
    }

    public boolean f() {
        zp_1 a2;
        if (a2.M != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        zp_1 a2;
        zp_1 zp_12 = a2;
        zp_12.f = zp_12.h;
        zp_12.C = zp_12.b;
        zp_12.k = zp_12.c;
        zp_12.F = zp_12.J;
        zp_12.d = zp_12.B;
        zp_12.L = zp_12.G;
        zp_12.g = zp_12.e;
        zp_12.D = zp_12.l;
        zp_12.A = zp_12.v;
    }

    public boolean J() {
        zp_1 a2;
        return a2.j;
    }

    public zp_1(YQ yQ2) {
        zp_1 a2;
        zp_1 b2 = yQ2;
        zp_1 zp_12 = a2 = this;
        zp_1 zp_13 = a2;
        zp_1 zp_14 = a2;
        zp_14.h = JPa.N;
        zp_14.b = JPa.N;
        zp_14.c = JPa.N;
        zp_14.f = zp_14.h;
        zp_14.C = zp_14.b;
        zp_14.k = zp_14.c;
        zp_14.e = JPa.N;
        zp_14.l = JPa.N;
        zp_14.v = JPa.N;
        zp_14.g = zp_14.e;
        zp_14.D = zp_14.l;
        zp_14.A = zp_14.v;
        zp_14.J = pqa.r;
        zp_14.B = pqa.r;
        zp_14.G = pqa.r;
        zp_14.F = zp_14.J;
        zp_14.d = zp_14.B;
        zp_13.L = zp_14.G;
        zp_12.M = null;
        zp_13.a = uSa.E;
        zp_12.E = uSa.E;
        zp_12.K = Collections.emptyList();
        zp_12.H = Collections.emptyList();
        ((YQ)b2).I.add(a2);
        zp_1 zp_15 = a2;
        zp_15.o = ((YQ)b2).E;
        zp_15.m = ((YQ)b2).L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void b2;
        void c2;
        zp_1 a2;
        float d2 = f4;
        zp_1 zp_12 = a2 = this;
        zp_12.h = zp_12.f = c2;
        zp_1 zp_13 = a2;
        zp_13.b = zp_13.C = b2;
        zp_1 zp_14 = a2;
        zp_14.c = zp_14.k = d2;
    }

    public void J(float f2) {
        float b2 = f2;
        zp_1 a2 = this;
        if (!a2.j) {
            a2.f(b2);
        }
        if (!a2.E && !a2.a) {
            uKa.l((int)a2.i);
            return;
        }
        if (a2.g == JPa.N && a2.D == JPa.N && a2.A == JPa.N && a2.F == pqa.r && a2.d == pqa.r && a2.L == pqa.r) {
            int n2;
            int n3 = n2 = a2.f != JPa.N || a2.C != JPa.N || a2.k != JPa.N ? vRa.d : uSa.E;
            if (n2 != 0) {
                uKa.J((float)(a2.f * b2), (float)(a2.C * b2), (float)(a2.k * b2));
            }
            zp_1 zp_12 = a2;
            uKa.l((int)zp_12.i);
            if (zp_12.E) {
                Iterator<zp> iterator;
                Iterator<zp> iterator2 = iterator = a2.H.iterator();
                while (iterator2.hasNext()) {
                    ((zp_1)iterator.next()).J(b2);
                    iterator2 = iterator;
                }
            }
            if (n2 != 0) {
                uKa.J((float)(-a2.f * b2), (float)(-a2.C * b2), (float)(-a2.k * b2));
                return;
            }
        } else {
            uKa.e();
            zp_1 zp_13 = a2;
            uKa.J((float)(a2.f * b2), (float)(a2.C * b2), (float)(zp_13.k * b2));
            if (zp_13.A != JPa.N) {
                uKa.J((float)(a2.A * zpa.Z), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            }
            if (a2.D != JPa.N) {
                uKa.J((float)(a2.D * zpa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            }
            if (a2.g != JPa.N) {
                uKa.J((float)(a2.g * zpa.Z), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            }
            if (a2.F != pqa.r || a2.d != pqa.r || a2.L != pqa.r) {
                zp_1 zp_14 = a2;
                uKa.l((float)zp_14.F, (float)zp_14.d, (float)a2.L);
            }
            zp_1 zp_15 = a2;
            uKa.l((int)zp_15.i);
            if (zp_15.E) {
                Iterator<zp> iterator;
                Iterator<zp> iterator3 = iterator = a2.H.iterator();
                while (iterator3.hasNext()) {
                    zp_1 zp_16 = (zp_1)iterator.next();
                    iterator3 = iterator;
                    zp_16.J(b2);
                }
            }
            uKa.D();
        }
    }
}

