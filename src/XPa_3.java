/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Dpa
 *  Fpa
 *  Fqa
 *  YOa
 *  uA
 *  uPa
 *  vRa
 */
public final class XPa_3
implements uA {
    public final /* synthetic */ Dpa I;

    public void J() {
        XPa_3 a2;
        if (Dpa.J((Dpa)a2.I)) {
            return;
        }
        Dpa.f((Dpa)a2.I, vRa.d != 0);
        Dpa.J((Dpa)a2.I).J();
    }

    public void J(String string) {
        String b2 = string;
        XPa_3 a2 = this;
        Dpa.J((Dpa)a2.I).f(b2);
    }

    public void C() {
        XPa_3 a2;
        XPa_3 xPa_3 = a2;
        Dpa.f((Dpa)xPa_3.I);
        Dpa.J((Dpa)xPa_3.I).l();
        Dpa.J((Dpa)xPa_3.I).J(YOa.TIMEOUT);
    }

    public void l() {
        XPa_3 a2;
        XPa_3 xPa_3 = a2;
        Dpa.f((Dpa)xPa_3.I);
        Dpa.J((Dpa)xPa_3.I).f();
        Dpa.f((Dpa)xPa_3.I, uSa.E != 0);
    }

    private XPa_3(Dpa object) {
        XPa_3 a2 = object;
        object = this;
        object.I = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Fqa fqa2, Fqa fqa3) {
        void b2;
        void c2;
        XPa_3 d2 = fqa3;
        XPa_3 a2 = this;
        Dpa.J((Dpa)a2.I).J((String)c2, (Fqa)b2, (Fqa)d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Fqa fqa2) {
        void b2;
        XPa_3 c2 = fqa2;
        XPa_3 a2 = this;
        Dpa.J((Dpa)a2.I).J((String)b2, (Fqa)c2);
    }

    public void f() {
        XPa_3 a2;
        XPa_3 xPa_3 = a2;
        Dpa.f((Dpa)xPa_3.I);
        Dpa.J((Dpa)xPa_3.I).l();
        Dpa.J((Dpa)xPa_3.I).J(YOa.OUTDATED_CLIENT);
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        XPa_3 a2 = this;
        Dpa.J((Dpa)a2.I, (boolean)b2);
        Dpa.J((Dpa)a2.I).J(b2);
    }

    public /* synthetic */ XPa_3(Dpa dpa2, uPa uPa2) {
        XPa_3 c2 = dpa2;
        XPa_3 b2 = this;
        b2((Dpa)c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2, long l2, byte[] byArray) {
        void a2;
        void b2;
        void c2;
        String e2 = string;
        XPa_3 d2 = this;
        Dpa.J().warn(new StringBuilder().insert(5 >> 3, APa.l).append((int)c2).append(Era.Aa).append((long)b2).append(Ata.fa).append(((void)a2).length).append(Fpa.Fa).append(e2).toString());
        String string2 = Dpa.J((String)e2);
        if (Dpa.J((Dpa)d2.I).J(string2, e2)) {
            Dpa.J((Dpa)d2.I).J(string2, OT.i.B.J(e2));
            Dpa.J((Dpa)d2.I).J(e2);
        }
        Dpa.J((Dpa)d2.I).J(string2, (byte[])a2, e2, (int)c2, (long)b2);
    }

    public void J(String string, int n2) {
        XPa_3 b2;
        String c2 = string;
        XPa_3 xPa_3 = b2 = this;
        Dpa.J((Dpa)xPa_3.I).J(Dpa.J((String)c2));
        Dpa.J((Dpa)xPa_3.I).l(c2);
    }
}

