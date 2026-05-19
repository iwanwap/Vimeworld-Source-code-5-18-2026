/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  Ysa
 *  fTa
 *  oGa
 *  vRa
 *  vU
 */
public final class pGa_3
extends Mha {
    public void toggleDownfall() {
        vU vU2 = OCa.J().G[uSa.E].J();
        vU2.d((!vU2.f() ? vRa.d : uSa.E) != 0);
    }

    public String getCommandName() {
        return WOa.C;
    }

    public pGa_3() {
        pGa_3 a2;
    }

    public void processCommand(u u2, String[] stringArray) throws oGa {
        pGa_3 b2;
        Object c2 = u2;
        pGa_3 pGa_32 = b2 = this;
        pGa_32.toggleDownfall();
        pGa_3.notifyOperators((u)c2, (Qc)pGa_32, (String)fTa.L, (Object[])new Object[uSa.E]);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        pGa_3 a2 = this;
        return Ysa.b;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }
}

