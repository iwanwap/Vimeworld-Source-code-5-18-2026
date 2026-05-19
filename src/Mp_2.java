/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DE
 *  Dpa
 *  Fqa
 *  M
 *  NPa
 *  OS
 *  Qta
 *  YOa
 *  bRa
 *  vRa
 */
public final class Mp_2
implements M {
    public void J(String string, Fqa fqa2) {
        String c2 = string;
        Mp_2 b2 = this;
        WF.l(c2);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = c2;
        OS.J().warn(APa.E, objectArray);
    }

    public void f(String string) {
        String b2 = string;
        Mp_2 a2 = this;
        WF.M(b2);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2;
        OS.J().warn(vRa.Z, objectArray);
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        Mp_2 a2 = this;
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2;
        OS.J().warn(ROa.g, objectArray);
    }

    public Mp_2() {
        Mp_2 a2;
    }

    public void f() {
        Mp_2 mp_2 = this;
        WF.i();
        Mp_2 a2 = OT.i.l;
        if (a2 != null && !((Dpa)a2).J) {
            OT.i.l = null;
        }
        OS.J().warn(Jsa.F);
    }

    public void l(String string) {
        String b2 = string;
        Mp_2 a2 = this;
        WF.J(b2, uSa.E != 0);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2;
        OS.J().warn(Qta.v, objectArray);
    }

    public void J(String string) {
        String b2 = string;
        Mp_2 a2 = this;
        WF.J(b2, vRa.d != 0);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2;
        OS.J().warn(Jra.Ha, objectArray);
    }

    public void J(String string, Fqa fqa2, Fqa fqa3) {
        String d2 = string;
        Mp_2 c2 = this;
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = d2;
        OS.J().warn(NPa.Ha, objectArray);
    }

    public void J() {
        WF.f();
        OS.J().warn(vTa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(YOa yOa2) {
        void a2;
        Mp_2 mp_2 = this;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = a2.name();
        objectArray[vRa.d] = a2.ordinal();
        OS.J().warn(MRa.Ga, objectArray);
        WF.i();
        Mp_2 b2 = WF.J().J();
        if (a2 == YOa.OUTDATED_CLIENT) {
            b2.J(DE.OLD_CLIENT, uSa.E);
            return;
        }
        if (a2 == YOa.TIMEOUT) {
            if (OT.i.l != null) {
                if (!OT.i.l.J()) {
                    b2.J(DE.COULD_NOT_CONNECT, vRa.d);
                    return;
                }
                b2.J(DE.CONNECTION_TROUBLE, uqa.g);
                return;
            }
        } else {
            OS.J().warn(bRa.x);
        }
    }
}

