/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ica
 *  LQa
 *  Mha
 *  NTa
 *  Qc
 *  Uta
 *  Waa
 *  XSa
 *  eHa
 *  oGa
 *  pPa
 *  vL
 *  vRa
 *  yca
 */
public final class VHa_3
extends Mha {
    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        VHa_3 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public VHa_3() {
        VHa_3 a2;
    }

    public String getCommandName() {
        return LQa.H;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        Waa waa2;
        void b2;
        Waa c2 = stringArray;
        Waa a2 = this;
        if (((String[])c2).length < uqa.g) {
            throw new eHa(PRa.P, new Object[uSa.E]);
        }
        vL vL2 = VHa_3.func_175768_b((u)b2, (String)c2[uSa.E]);
        if (vL2 instanceof Sx) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = vL2.J();
            throw new oGa(XSa.h, objectArray);
        }
        Waa waa3 = waa2 = new Waa();
        vL2.C(waa3);
        Waa waa4 = (Waa)waa3.J();
        try {
            c2 = Ica.J((String)VHa_3.getChatComponentFromNthArg((u)b2, (String[])c2, (int)vRa.d).f());
        }
        catch (yca yca2) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = yca2.getMessage();
            throw new oGa(yta.a, objectArray);
        }
        c2.J(NTa.j);
        c2.J(csa.R);
        Waa waa5 = waa2;
        waa5.J(c2);
        if (waa5.equals((Object)waa4)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = waa2.toString();
            throw new oGa(pPa.Ha, objectArray);
        }
        vL2.l(waa2);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = waa2.toString();
        VHa_3.notifyOperators((u)b2, (Qc)a2, (String)Uta.f, (Object[])objectArray);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        VHa_3 a2 = this;
        return PRa.P;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }
}

