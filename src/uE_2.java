/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A
 *  Bc
 *  Dpa
 *  EF
 *  FD
 *  GF
 *  Kd
 *  Kpa
 *  M
 *  Oqa
 *  Rf
 *  Tpa
 *  Ve
 *  Wd
 *  Yf
 *  ad
 *  cD
 *  cE
 *  cQa
 *  gD
 *  gra
 *  if
 *  ob
 *  pua
 *  uE
 *  vRa
 *  xD
 */
import java.awt.Color;
import java.io.IOException;
import paulscode.sound.SoundSystem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uE_2
extends jb
implements A {
    private final Bd m;
    private final jb C;
    private final Bd i;
    private final Wd M;
    private final cD k;
    private final Bd j;
    private final Bd J;
    private final Ve A;
    private final cE I;

    public static /* synthetic */ void f(Float a2) {
        OT.i.B.f(a2.floatValue());
    }

    @Override
    public void e() {
        uE_2 a2;
        uE_2 uE_22 = a2;
        uE_22.i.J(uE_22.k.J());
        if.d((double)(a2.I + oua.i), (double)a2.J, (double)a2.k, (double)(a2.j - oua.i), (Color)Bc.Ea.transparent(WF.J()), (Kd)Kd.S);
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        uE_2 uE_22 = this;
    }

    public static /* synthetic */ void J(uE uE2, Boolean bl) {
        Boolean b2 = bl;
        uE a2 = uE2;
        if (OT.i.l == null) {
            try {
                OT.i.l = new Dpa((M)new Yf(a2), (SoundSystem)Kpa.J().J().J().J(), Mqa.y, Mqa.y, vRa.d, new byte[uSa.E], new byte[uSa.E]);
                OT.i.l.J = vRa.d;
            }
            catch (IOException iOException) {
                return;
            }
        }
        OT.i.l.f(b2.booleanValue());
        if (!b2.booleanValue() && OT.i.l.J) {
            OT.i.l.C();
            OT.i.l = null;
        }
    }

    public static /* synthetic */ Float f() {
        return Float.valueOf(OT.i.B.micVoiceChatVolume);
    }

    public void J() {
        uE_2 a2;
        uE_2 uE_22 = a2;
        uE_22.f().clear();
        uE_22.A.J();
        uE_22.f(uE_22.i);
        uE_22.f(uE_22.J);
        uE_22.f(uE_22.j);
        uE_22.f(uE_22.m);
        uE_22.f(uE_22.C);
        if (WF.f()) {
            uE_2 uE_23 = a2;
            uE_23.f((ad)uE_23.I);
        }
    }

    public uE_2() {
        uE_2 uE_22;
        uE_2 uE_23 = uE_22 = this;
        super(Oqa.ROW, tTa.h, tTa.h);
        uE_2 uE_24 = uE_22;
        uE_23.A = new Ve();
        uE_24.M = new Wd();
        uE_23.i = new Bd(STa.ja);
        uE_23.j = new Bd(uqa.f);
        uE_23.J = new Bd(uSa.e);
        uE_23.m = new Bd(cQa.U);
        uE_23.C = new jb(Oqa.ROW, uSa.E, pua.o);
        uE_23.I = new cE();
        uE_23.k = new cD();
        uE_23.J();
        uE_23.j.f((ad)uE_22.A);
        uE_23.J.f((ad)uE_22.M);
        uE_23.j.f((ad)new ob());
        uE_23.j.f((ad)new ee());
        uE_23.i.f((ad)uE_22.k);
        uE_23.m.f((ad)new EF(null, FD.J(), gD.J(), Ira.d));
        jb a2 = new jb(Oqa.COLUMN, uSa.E, uSa.E);
        Bd bd2 = new Bd(Tpa.s);
        bd2.f(vRa.d);
        jb jb2 = a2;
        jb jb3 = a2;
        jb3.f(bd2);
        jb3.f((ad)new pE(Wb.SOUND, jf.J(), Rf.J((uE)uE_22)));
        jb2.J(gra.SPACE_BETWEEN);
        jb2.J(zta.n);
        a2.i(AQa.P);
        jb2.f(vRa.d);
        uE_23.C.f(a2);
        uE_23.C.f((ad)new EF(null, GF.J(), xD.J(), Ira.d));
        uE_23.J(Color.WHITE);
    }

    public static /* synthetic */ void J(Float a2) {
        OT.i.B.J(a2.floatValue());
    }

    public static /* synthetic */ Float J() {
        return Float.valueOf(OT.i.B.voiceChatVolume);
    }

    public static /* synthetic */ Boolean J() {
        return (OT.i.l != null && OT.i.l.e() ? vRa.d : uSa.E) != 0;
    }
}

