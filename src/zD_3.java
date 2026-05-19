/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AB
 *  Bc
 *  CF
 *  EA
 *  Kd
 *  Oqa
 *  Zd
 *  ad
 *  bc
 *  cA
 *  cI
 *  if
 *  sC
 *  yd
 *  zD
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zD_3
extends jb {
    private Zd j;
    private jb J;
    private bc A;
    private EA I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl3 = bl2;
        zD_3 a2 = this;
        if (a2.I.f()) {
            a2.I.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        super.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    public Zd J() {
        zD_3 a2;
        return a2.j;
    }

    @Override
    public jb J() {
        zD_3 a2;
        return a2.J;
    }

    public void J(bc bc2) {
        zD_3 b2 = bc2;
        zD_3 a2 = this;
        if (a2.A == b2) {
            return;
        }
        a2.f().remove((Object)a2.J);
        a2.A = b2;
        a2.J = (jb)((Object)a2.A.getElement().get());
        zD_3 zD_32 = a2;
        zD_32.f(zD_32.J);
    }

    public bc J() {
        zD_3 a2;
        return a2.A;
    }

    public static /* synthetic */ void J(zD a2) {
        if.C((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ba, (Kd)Kd.S);
    }

    public void J() {
        zD_3 zD_32;
        zD_3 a2;
        if (!WF.f() && a2.A == bc.REQUESTS) {
            a2.J(bc.PARTY);
        }
        if (a2.J instanceof cA) {
            ((cA)a2.J).J();
            zD_32 = a2;
        } else if (a2.J instanceof sC) {
            ((sC)a2.J).J();
            zD_32 = a2;
        } else {
            if (a2.J instanceof AB) {
                ((AB)a2.J).J();
            }
            zD_32 = a2;
        }
        zD_32.J.l();
        a2.l();
    }

    public zD_3() {
        zD_3 a2;
        zD_3 zD_32 = a2;
        super(Oqa.ROW, uSa.E, uSa.E);
        zD_32.I = (EA)KSa.F;
        zD_32.J = (jb)zOa.y;
        zD_32.J(cPa.x);
        zD_3 zD_33 = a2;
        zD_32.f((ad)new CF());
        zD_32.j = new Zd();
        zD_32.f((ad)zD_32.j);
        a2.I = new EA();
        a2.f((ad)a2.I);
        a2.J(bc.PARTY);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        zD_3 a2;
        int c2 = n3;
        zD_3 zD_32 = a2 = this;
        super.l();
        if.C((double)zD_32.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ea.transparent(ATa.r * WF.J()), (Color)Bc.Ea.transparent(WF.J()));
        cI.J((Runnable)yd.J((zD)zD_32));
        super.J((int)b2, c2);
        cI.J();
    }
}

