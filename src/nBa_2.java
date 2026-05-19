/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Fda
 *  GCa
 *  IY
 *  JTa
 *  Kpa
 *  Lra
 *  OCa
 *  RIa
 *  Tf
 *  Vb
 *  XB
 *  Yy
 *  ZRa
 *  aOa
 *  hra
 *  kca
 *  mZ
 *  nBa
 *  nY
 *  pPa
 *  pua
 *  saa
 *  vE
 *  vRa
 *  vU
 */
import com.google.common.util.concurrent.Futures;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nBa_2
extends OCa {
    private static final String i = "CL_00001129";
    private final mZ M;
    private final Kpa k;
    private boolean j;
    private boolean J;
    private aOa A;
    private static final Logger I = LogManager.getLogger();

    public nBa_2(Kpa kpa2) {
        nBa_2 a2;
        nBa_2 b2 = kpa2;
        nBa_2 nBa_22 = a2 = this;
        nBa_2 nBa_23 = b2;
        super(nBa_23.J(), new File(((Kpa)b2).p, b.getName()));
        nBa_22.k = nBa_23;
        nBa_22.M = null;
    }

    public int f() {
        return AQa.P;
    }

    public boolean D() {
        return vRa.d != 0;
    }

    public void J(String string, String string2, long l2, Fy fy2, String string3) {
        XB e2;
        nBa_2 d2;
        Object f2 = string2;
        nBa_2 nBa_22 = d2 = this;
        nBa_22.l((String)e2);
        e2 = nBa_22.J().J((String)e2, vRa.d != 0);
        nBa_22.J(nBa_22.A(), e2);
        vU c2 = e2.J();
        nBa_22.G = new Tf[yRa.d];
        d2.U = new long[d2.G.length][ySa.T];
        nBa_2 nBa_23 = d2;
        nBa_23.J(nBa_23.A(), e2);
        if (c2 == null) {
            c2 = new vU(d2.M, (String)f2);
        } else {
            c2.J((String)f2);
        }
        int n2 = f2 = uSa.E;
        while (n2 < d2.G.length) {
            nBa_2 nBa_24;
            int n3 = uSa.E;
            if (f2 == vRa.d) {
                n3 = pua.o;
            }
            if (f2 == uqa.g) {
                n3 = vRa.d;
            }
            if (f2 == 0) {
                nBa_2 nBa_25;
                if (d2.d()) {
                    d2.G[f2] = (Tf)new IY((OCa)d2, e2, c2, n3, d2.K).J();
                    nBa_25 = d2;
                } else {
                    d2.G[f2] = (Tf)new vE((OCa)d2, e2, c2, n3, d2.K).J();
                    nBa_25 = d2;
                }
                nBa_25.G[f2].J(d2.M);
                nBa_24 = d2;
            } else {
                nBa_2 nBa_26 = d2;
                d2.G[f2] = (Tf)new Yy((OCa)nBa_26, e2, n3, nBa_26.G[uSa.E], d2.K).J();
                nBa_24 = d2;
            }
            nBa_2 nBa_27 = d2;
            nBa_24.G[f2].f((Vb)new wy(nBa_27, nBa_27.G[f2++]));
            n2 = f2;
        }
        nBa_2 nBa_28 = d2;
        nBa_28.J().J(d2.G);
        if (nBa_28.G[uSa.E].J().J() == null) {
            nBa_2 nBa_29 = d2;
            nBa_29.J(nBa_29.k.z.Ma);
        }
        d2.i();
    }

    /*
     * Unable to fully structure code
     */
    public String J(Daa var1_3, boolean var2_4) {
        var3_5 = this;
        c = pua.o;
        try {
            v0 = c = mz.J();
            ** GOTO lbl10
        }
        catch (IOException v1) {
            try {
                v0 = c;
lbl10:
                // 2 sources

                if (v0 <= 0) {
                    c = Ata.X;
                }
                var3_5.J().J((InetAddress)null, c);
                nBa_2.I.info(new StringBuilder().insert(3 ^ 3, Bua.Ka).append(c).toString());
                v2 = var3_5;
                v2.j = vRa.d;
                v2.A = new aOa(var3_5.i(), c + Mqa.y);
                var3_5.A.start();
                v2.J().J((Daa)b);
                v2.J().J((boolean)a);
                return c + Mqa.y;
            }
            catch (IOException c) {
                return null;
            }
        }
    }

    public void J(sZ sZ2) {
        nBa_2 a2;
        Object b2 = sZ2;
        nBa_2 nBa_22 = a2 = this;
        super.J((sZ)((Object)b2));
        if (nBa_22.k.Ta != null) {
            a2.k.Ta.J().J((sZ)((Object)b2));
        }
    }

    public boolean K() {
        return uSa.E != 0;
    }

    public saa J() {
        return new nY();
    }

    public boolean i() throws IOException {
        nBa_2 a2;
        I.info(hra.f);
        nBa_2 nBa_22 = a2;
        nBa_22.l(vRa.d != 0);
        nBa_22.J(vRa.d != 0);
        nBa_22.i(vRa.d != 0);
        nBa_22.e(vRa.d != 0);
        nBa_22.d(vRa.d != 0);
        I.info(Qpa.O);
        nBa_22.J(az.J());
        nBa_22.J(nBa_22.A(), a2.l(), a2.M.J(), a2.M.J(), a2.M.J());
        nBa_2 nBa_23 = a2;
        nBa_22.C(a2.e() + pPa.I + a2.G[uSa.E].J().f());
        return vRa.d != 0;
    }

    public sZ J() {
        nBa_2 a2;
        if (a2.k.Ta == null) {
            return a2.k.z.Ma;
        }
        return a2.k.Ta.J().J();
    }

    public boolean C() {
        return vRa.d != 0;
    }

    public boolean j() {
        return vRa.d != 0;
    }

    public void F() {
        nBa_2 a2;
        a2.l();
    }

    public File J() {
        nBa_2 a2;
        return a2.k.p;
    }

    public boolean z() {
        nBa_2 a2;
        return a2.j;
    }

    public void C() {
        nBa_2 a2;
        nBa_2 nBa_22 = a2;
        Futures.getUnchecked(nBa_22.J(new hBa((nBa)a2)));
        super.C();
        if (nBa_22.A != null) {
            a2.A.interrupt();
            a2.A = null;
        }
    }

    public void J(Daa daa2) {
        Object b2 = daa2;
        nBa_2 a2 = this;
        a2.J().J((Daa)((Object)b2));
    }

    public boolean M() {
        return uSa.E != 0;
    }

    public boolean B() {
        nBa_2 a2;
        return a2.M.C();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void k() {
        Object a2;
        nBa_2 nBa_22 = this;
        boolean bl2 = nBa_22.J;
        nBa_22.J = Kpa.J().J() != null && Kpa.J().I() ? vRa.d : uSa.E;
        int n2 = nBa_22.J ? 1 : 0;
        if (!bl2 && nBa_22.J) {
            I.info(hpa.l);
            nBa_2 nBa_23 = nBa_22;
            nBa_23.J().f();
            nBa_23.M(uSa.E != 0);
        }
        if (nBa_22.J) {
            nBa_2 nBa_24 = nBa_22;
            Queue queue = nBa_24.e;
            a2 = nBa_24.e;
            synchronized (a2) {
                nBa_2 nBa_25 = nBa_22;
                while (!nBa_25.e.isEmpty()) {
                    maa.J((FutureTask)nBa_22.e.poll(), I);
                    nBa_25 = nBa_22;
                }
                return;
            }
        }
        nBa_2 nBa_26 = nBa_22;
        super.k();
        if (nBa_26.k.z.kc != nBa_22.J().J()) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = nBa_22.k.z.kc;
            objectArray[vRa.d] = nBa_22.J().J();
            I.info(Lra.Ga, objectArray);
            nBa_22.J().J(nBa_22.k.z.kc);
        }
        if (nBa_22.k.Ta != null) {
            nBa_2 nBa_27 = nBa_22;
            vU vU2 = nBa_27.G[uSa.E].J();
            a2 = nBa_27.k.Ta.J();
            if (!vU2.C() && a2.J() != vU2.J()) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = a2.J();
                objectArray[vRa.d] = vU2.J();
                I.info(qsa.c, objectArray);
                nBa_22.J(a2.J());
                return;
            }
            if (a2.C() && !vU2.C()) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2.J();
                I.info(yta.O, objectArray);
                Tf[] tfArray = nBa_22.G;
                int n3 = nBa_22.G.length;
                int n4 = a2 = uSa.E;
                while (n4 < n3) {
                    Tf tf2 = tfArray[a2];
                    if (tf2 != null) {
                        tf2.J().f(vRa.d != 0);
                    }
                    n4 = ++a2;
                }
            }
        }
    }

    public boolean a() {
        return uSa.E != 0;
    }

    public void J(RIa rIa2) {
        nBa_2 b2 = rIa2;
        nBa_2 a2 = this;
        a2.k.J((RIa)b2);
    }

    public void A() {
        nBa_2 a2;
        nBa_2 nBa_22 = a2;
        super.A();
        if (nBa_22.A != null) {
            a2.A.interrupt();
            a2.A = null;
        }
    }

    public RIa J(RIa rIa2) {
        nBa_2 b2 = rIa2;
        nBa_2 a2 = this;
        b2 = super.J((RIa)b2);
        b2.J().J(JTa.Ga, (Callable)new Hca((nBa)a2));
        b2.J().J(wua.K, (Callable)new kca((nBa)a2));
        return b2;
    }

    public boolean l() {
        return Kpa.J().l();
    }

    public Daa J() {
        nBa_2 a2;
        return a2.M.J();
    }

    public void f(GCa gCa2) {
        nBa_2 b2 = gCa2;
        nBa_2 a2 = this;
        nBa_2 nBa_22 = b2;
        super.f((GCa)nBa_22);
        nBa_22.f(Nta.ja, a2.k.J().J());
    }

    /*
     * WARNING - void declaration
     */
    public nBa_2(Kpa kpa2, String string, String string2, mZ mZ2) {
        void a2;
        void b2;
        void c2;
        nBa_2 d2;
        nBa_2 e2 = kpa2;
        nBa_2 nBa_22 = d2 = this;
        nBa_2 nBa_23 = d2;
        nBa_2 nBa_24 = d2;
        nBa_2 nBa_25 = d2;
        nBa_2 nBa_26 = d2;
        nBa_2 nBa_27 = d2;
        super(new File(((Kpa)e2).p, ZRa.p), e2.J(), new File(((Kpa)e2).p, b.getName()));
        nBa_26.J(e2.J().J());
        nBa_25.f((String)c2);
        nBa_25.e((String)b2);
        nBa_24.f(e2.A());
        nBa_24.C(a2.J());
        nBa_24.f(hra.Ja);
        nBa_23.J((Cba)new Fda((nBa)d2));
        nBa_22.k = e2;
        nBa_22.M = nBa_23.d() ? IY.A : a2;
    }
}

