/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  DQa
 *  Dha
 *  Gg
 *  HY
 *  JTa
 *  MZ
 *  OCa
 *  RIa
 *  Rha
 *  Waa
 *  cRa
 *  caa
 *  cha
 *  kqa
 *  lPa
 *  ld
 *  pqa
 *  vRa
 *  via
 *  wHa
 */
import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class caa_2
implements u {
    private ld i;
    private int M;
    private boolean k;
    private String j;
    private final via J;
    private static final SimpleDateFormat A = new SimpleDateFormat(JTa.Y);
    private String I;

    public abstract void J(ByteBuf var1);

    public caa_2() {
        caa_2 a2;
        caa_2 caa_22 = a2;
        caa_2 caa_23 = a2;
        caa_23.k = vRa.d;
        caa_22.i = null;
        caa_23.I = Mqa.y;
        caa_22.j = eua.Y;
        caa_2 caa_24 = a2;
        caa_22.J = new via();
    }

    public boolean J(Sx sx2) {
        Sx b2 = sx2;
        caa_2 a2 = this;
        if (!b2.h.f()) {
            return uSa.E != 0;
        }
        if (b2.J().e) {
            b2.J((caa)a2);
        }
        return vRa.d != 0;
    }

    public void f(ld ld2) {
        caa_2 b2 = ld2;
        caa_2 a2 = this;
        a2.i = b2;
    }

    public via J() {
        caa_2 a2;
        return a2.J;
    }

    @Override
    public void J(ld ld2) {
        caa_2 b2 = ld2;
        caa_2 a2 = this;
        if (a2.k && a2.J() != null && !a2.J().e) {
            a2.i = new CY(new StringBuilder().insert(3 >> 2, dqa.X).append(A.format(new Date())).append(mPa.Z).toString()).J((ld)b2);
            a2.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Rha rha2, int n2) {
        void b2;
        int c2 = n2;
        caa_2 a2 = this;
        a2.J.J((u)a2, (Rha)b2, c2);
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        caa_2 a2 = this;
        a2.k = b2;
    }

    public int f() {
        caa_2 a2;
        return a2.M;
    }

    public boolean J() {
        caa_2 a2;
        return a2.k;
    }

    @Override
    public boolean f() {
        caa_2 caa_22 = this;
        caa_2 a2 = OCa.J();
        if (a2 == null || !a2.k() || ((OCa)a2).G[uSa.E].J().f(lPa.L)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract int J();

    public void J(Gg gg2) {
        caa_2 b222 = gg2;
        caa_2 a2 = this;
        if (((Gg)b222).e) {
            a2.M = uSa.E;
        }
        if ((b222 = OCa.J()) != null && b222.k() && b222.j()) {
            b222 = b222.J();
            try {
                a2.i = null;
                a2.M = b222.J(a2, a2.I);
                return;
            }
            catch (Throwable b222) {
                RIa b222 = RIa.J((Throwable)b222, (String)Yqa.n);
                Dha dha = b222.J(iSa.y);
                dha.J(Nra.m, (Callable)new cha((caa)a2));
                dha.J(DQa.N, (Callable)new wHa((caa)a2));
                throw new MZ(b222);
            }
        }
        a2.M = uSa.E;
    }

    public ld f() {
        caa_2 a2;
        return a2.i;
    }

    @Override
    public boolean J(int n2, String string) {
        int c2 = n2;
        caa_2 b2 = this;
        if (c2 <= uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String f() {
        caa_2 a2;
        return a2.I;
    }

    @Override
    public ld J() {
        caa_2 a2;
        return new CY(a2.J());
    }

    public void f(Waa waa2) {
        caa_2 b2 = waa2;
        caa_2 a2 = this;
        caa_2 caa_22 = b2;
        a2.I = b2.J(Nra.m);
        a2.M = caa_22.J(kqa.J);
        if (caa_22.J(cRa.k, Yqa.i)) {
            a2.j = b2.J(cRa.k);
        }
        if (b2.J(uua.u, vRa.d)) {
            a2.k = b2.f(uua.u);
        }
        if (b2.J(pqa.H, Yqa.i) && a2.k) {
            a2.i = HY.J((String)b2.J(pqa.H));
        }
        a2.J.J((Waa)b2);
    }

    public void f(String string) {
        String b2 = string;
        caa_2 a2 = this;
        a2.j = b2;
    }

    @Override
    public String J() {
        caa_2 a2;
        return a2.j;
    }

    public abstract void J();

    public void J(String string) {
        caa_2 a2;
        String b2 = string;
        caa_2 caa_22 = a2 = this;
        caa_22.I = b2;
        caa_22.M = uSa.E;
    }

    public void J(Waa waa2) {
        caa_2 b2 = waa2;
        caa_2 a2 = this;
        caa_2 caa_22 = b2;
        caa_22.J(Nra.m, a2.I);
        caa_22.J(kqa.J, a2.M);
        caa_22.J(cRa.k, a2.j);
        caa_2 caa_23 = a2;
        caa_22.J(uua.u, caa_23.k);
        if (caa_23.i != null && a2.k) {
            b2.J(pqa.H, HY.J((ld)a2.i));
        }
        a2.J.f((Waa)b2);
    }
}

