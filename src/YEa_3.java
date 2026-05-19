/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  LA
 *  Yfa
 *  gZ
 *  kta
 *  vL
 *  vRa
 *  vpa
 */
public abstract class YEa_3
extends Yfa
implements LA {
    public void L() {
        YEa_3 yEa_3;
        YEa_3 yEa_32 = yEa_3 = this;
        int a2 = yEa_32.i();
        super.L();
        if (yEa_32.K() && !yEa_3.L()) {
            YEa_3 yEa_33 = yEa_3;
            yEa_33.e(--a2);
            if (yEa_33.i() == yRa.Y) {
                YEa_3 yEa_34 = yEa_3;
                yEa_34.e(uSa.E);
                yEa_34.J(gZ.f, kta.v);
                return;
            }
        } else {
            yEa_3.e(vpa.Ja);
        }
    }

    public boolean n() {
        return vRa.d != 0;
    }

    public YEa_3(Gg gg2) {
        YEa_3 b2 = gg2;
        YEa_3 a2 = this;
        super((Gg)b2);
    }

    public boolean N() {
        YEa_3 a2;
        return a2.j.J(a2.J(), (vL)a2);
    }

    public boolean R() {
        return vRa.d != 0;
    }

    public boolean b() {
        return uSa.E != 0;
    }

    public int J(Sx sx2) {
        Object b2 = sx2;
        YEa_3 a2 = this;
        return vRa.d + a2.j.v.nextInt(yRa.d);
    }

    public int j() {
        return sOa.D;
    }

    public boolean w() {
        return vRa.d != 0;
    }
}

