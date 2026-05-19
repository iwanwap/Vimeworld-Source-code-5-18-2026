/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ip
 *  XM
 *  asa
 *  k
 *  vRa
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class Up_2
extends Ip {
    private long M;
    private long k;
    private final SimpleDateFormat j;
    private long J;
    private String A;
    private final boolean I;

    public boolean J(long a22) {
        Up_2 b2;
        boolean a22 = super.J(a22);
        if (a22) {
            b2.G();
        }
        return a22;
    }

    public void G() {
        Up_2 up_2 = this;
        if (up_2.I && OT.e - up_2.M < asa.fa) {
            return;
        }
        Up_2 up_22 = up_2;
        up_22.M = OT.e;
        String a2 = up_22.e[uSa.E];
        up_22.e[uSa.E] = up_2.j.format(new Date(OT.e - up_2.k));
        if (!a2.equals(up_2.e[uSa.E])) {
            up_2.D();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Up_2(k k2, XM xM2) {
        Up_2 up_2;
        void a2;
        Up_2 c2 = k2;
        Up_2 b2 = this;
        super((k)c2, (XM)a2);
        b2.J = nqa.i;
        b2.A = null;
        c2 = a2.getETextClock();
        if (c2.hasTimezone()) {
            b2.A = c2.getTimezone();
        }
        if (c2.hasStartAt()) {
            b2.J = c2.getStartAt();
        }
        if (b2.e == null || b2.e.length == 0) {
            b2.e = new String[vRa.d];
            Up_2 up_22 = b2;
            up_2 = up_22;
            up_22.e[uSa.E] = Mqa.y;
            Up_2 up_23 = b2;
            up_22.j = new SimpleDateFormat(CRa.Ja);
            up_23.I = vRa.d;
        } else {
            b2.j = new SimpleDateFormat(b2.e[uSa.E]);
            b2.I = !b2.e[uSa.E].contains(Iqa.W) ? vRa.d : uSa.E;
            up_2 = b2;
        }
        if (up_2.A != null) {
            Up_2 up_24 = b2;
            up_24.j.setTimeZone(TimeZone.getTimeZone(up_24.A));
        }
        if (b2.J != nqa.i) {
            b2.k = OT.e - b2.J;
        }
        b2.M = OT.e;
        b2.e[uSa.E] = b2.j.format(new Date(OT.e - b2.k));
    }
}

