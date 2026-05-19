/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Jh
 *  Kh
 *  Kpa
 *  Mda
 *  RA
 *  UG
 *  XTa
 *  Yka
 *  qH
 *  rh
 *  rr
 *  uKa
 *  ui
 *  vRa
 */
import java.util.Locale;

public final class Qg_3
extends UG {
    private String J;
    private DZ A;
    private Mda I;

    public Qg_3(String string) {
        Qg_3 qg_3;
        Object b2 = string;
        Qg_3 a2 = this;
        if (((String)b2).startsWith(UTa.Ga) || ((String)b2).startsWith(ITa.w)) {
            qg_3 = a2;
            a2.J = new StringBuilder().insert(3 ^ 3, XOa.Z).append((String)b2).toString();
        } else {
            Jh jh2 = qH.J((String)b2);
            if (jh2 == null) {
                a2.I = rh.ERROR;
                return;
            }
            a2.I = jh2.j;
            if (((String)b2).contains(Wqa.fa)) {
                Object object = b2;
                b2 = ((String)object).substring(((String)object).indexOf(Wqa.fa) + vRa.d).toLowerCase(Locale.US);
                a2.A = DZ.byName((String)b2);
                if (a2.A == null) {
                    OT.b.info(new StringBuilder().insert(2 & 5, SPa.r).append((String)b2).append(XTa.Z).toString());
                }
            }
            qg_3 = a2;
        }
        qg_3.I = rh.READY;
    }

    public ui J(PG pG2) {
        Qg_3 qg_3 = this;
        WKa a2 = Kpa.J().J();
        KLa kLa2 = qg_3.J(a2);
        Qg_3 b2 = new ui();
        KLa kLa3 = kLa2;
        Qg_3 qg_32 = b2;
        ((ui)qg_32).I = a2.J();
        ((ui)qg_32).A = kLa2.l();
        ((ui)b2).j = kLa3.J();
        ((ui)b2).k = kLa3.C();
        ((ui)b2).J = kLa2.f();
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public KLa J(WKa wKa2) {
        Object b2;
        void a2;
        Qg_3 qg_3 = this;
        if (qg_3.J != null) {
            return a2.J(qg_3.J);
        }
        RA rA2 = Kpa.J().J().J().J(qg_3.I);
        Object object = b2 = qg_3.A == null ? rA2.J() : rA2.J(qg_3.A);
        if (!b2.isEmpty()) {
            return ((Yka)b2.get(uSa.E)).J();
        }
        return a2.J();
    }

    public int f() {
        return ERa.C;
    }

    public void J(rr rr2) {
        Qg_3 b2 = rr2;
        Qg_3 a2 = this;
        ui ui2 = a2.J(((rr)b2).k);
        uKa.C((int)ui2.I);
        ui ui3 = ui2;
        ui ui4 = ui2;
        Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)ui3.A, (float)ui3.j, (float)ui4.k, (float)ui4.J, (float)((rr)b2).I.f());
    }

    public int J() {
        return ERa.C;
    }
}

