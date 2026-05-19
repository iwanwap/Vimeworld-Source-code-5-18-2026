/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gh
 *  JPa
 *  SQa
 *  Tpa
 *  aSa
 *  cQa
 *  cRa
 *  nka
 *  pqa
 *  uKa
 *  vRa
 */
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class th {
    private boolean M;
    private final IntBuffer k;
    private int[] j;
    private final IntBuffer J = BufferUtils.createIntBuffer(ERa.C);
    private int A;
    private Gh I;

    public void l() {
        th a2;
        a2.M = vRa.d;
        if (a2.I != null) {
            a2.I.f();
            a2.I = null;
        }
    }

    public boolean J() {
        th a2;
        if (!a2.M && nka.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public th() {
        th a2;
        a2.k = BufferUtils.createIntBuffer(ERa.C);
    }

    private void f() {
        th a2;
        uKa.G((int)WPa.s);
        uKa.D();
        uKa.G((int)SQa.ca);
        uKa.D();
        nka.l((int)nka.Q, (int)a2.A);
        if (a2.j != null) {
            uKa.f((int)a2.j[uSa.E], (int)a2.j[vRa.d], (int)a2.j[uqa.g], (int)a2.j[yRa.d]);
        }
    }

    public int f() {
        th a2;
        return a2.I.k;
    }

    private void J() {
        th a2;
        if (a2.I == null) {
            th th2 = a2;
            th2.I = new Gh(cQa.z, cQa.z, vRa.d != 0);
        }
        th th3 = a2;
        th3.J.clear();
        GL11.glGetInteger(Ura.S, a2.J);
        th th4 = a2;
        th4.A = th4.J.get(uSa.E);
        th4.k.clear();
        GL11.glGetInteger(cRa.Ia, a2.k);
        if (th3.j == null) {
            a2.j = new int[AQa.P];
        }
        th th5 = a2;
        th5.k.get(th5.j);
        a2.I.J(vRa.d != 0);
        uKa.l((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)JPa.N);
        uKa.J((double)oua.i);
        uKa.A((int)osa.x);
        uKa.G((int)WPa.s);
        uKa.e();
        uKa.y();
        uKa.J((double)aSa.V, (double)a2.I.J, (double)a2.I.k, (double)aSa.V, (double)Tpa.M, (double)Nra.V);
        uKa.G((int)SQa.ca);
        uKa.e();
        uKa.y();
        uKa.J((float)JPa.N, (float)JPa.N, (float)csa.p);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public int J(int n2, int n3, Runnable runnable) {
        th th2 = this;
        boolean bl = uKa.f();
        boolean bl2 = uKa.l();
        boolean d2 = uKa.J();
        uKa.g();
        uKa.I();
        uKa.J(vRa.d != 0);
        uKa.J();
        th2.J();
        try {
            void a2;
            void b2;
            void c2;
            uKa.l((float)((float)th2.I.J / (float)c2), (float)((float)th2.I.k / (float)b2), (float)pqa.r);
            a2.run();
        }
        finally {
            th2.f();
            if (bl) {
                uKa.d();
            }
            if (!bl2) {
                uKa.J(uSa.E != 0);
            }
            if (!d2) {
                uKa.u();
            }
            uKa.q();
        }
        return th2.I.m;
    }

    public int J() {
        th a2;
        return a2.I.J;
    }
}

