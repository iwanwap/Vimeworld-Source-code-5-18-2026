/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HY
 *  QFa
 *  RGa
 *  Rda
 *  Waa
 *  Yea
 *  caa
 *  ld
 *  pga
 */
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RGa_2
extends Yea {
    private int A;
    private final caa I;

    public boolean l(Sx sx2) {
        Object b2 = sx2;
        RGa_2 a2 = this;
        a2.I.J((Sx)((Object)b2));
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public RGa_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        RGa_2 e2 = gg2;
        RGa_2 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
        RGa_2 rGa_2 = d5;
        d5.I = new pga((RGa)d5);
        rGa_2.A = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        RGa_2 a2 = this;
        if (e2 != false) {
            RGa_2 rGa_2 = a2;
            if (rGa_2.g - rGa_2.A >= AQa.P) {
                RGa_2 rGa_22 = a2;
                rGa_22.J().J(a2.j);
                a2.A = rGa_22.g;
            }
        }
    }

    public IBlockState f() {
        return QFa.Ac.J();
    }

    public void d(int n2) {
        int b2 = n2;
        RGa_2 a2 = this;
        int n3 = b2;
        super.d(n3);
        if (n3 == osa.c) {
            try {
                a2.I.f(HY.J((String)a2.J().J(osa.c)));
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
        if (b2 == AQa.ba) {
            a2.I.J(a2.J().J(AQa.ba));
        }
    }

    public void J(Waa waa2) {
        RGa_2 a2;
        RGa_2 b2 = waa2;
        RGa_2 rGa_2 = a2 = this;
        super.J((Waa)b2);
        rGa_2.I.f((Waa)b2);
        rGa_2.J().J(AQa.ba, a2.J().f());
        rGa_2.J().J(osa.c, HY.J((ld)a2.J().f()));
    }

    public Rda J() {
        return Rda.COMMAND_BLOCK;
    }

    public void f(Waa waa2) {
        RGa_2 a2;
        RGa_2 b2 = waa2;
        RGa_2 rGa_2 = a2 = this;
        super.f((Waa)b2);
        rGa_2.I.J((Waa)b2);
    }

    public caa J() {
        RGa_2 a2;
        return a2.I;
    }

    public RGa_2(Gg gg2) {
        RGa_2 b2 = gg2;
        RGa_2 a2 = this;
        super((Gg)b2);
        RGa_2 rGa_2 = a2;
        a2.I = new pga((RGa)a2);
        rGa_2.A = uSa.E;
    }

    public void J() {
        RGa_2 a2;
        RGa_2 rGa_2 = a2;
        super.J();
        rGa_2.J().f(AQa.ba, Mqa.y);
        rGa_2.J().f(osa.c, Mqa.y);
    }
}

