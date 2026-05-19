/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ica
 *  Mha
 *  Qc
 *  Rha
 *  Waa
 *  Zpa
 *  bqa
 *  eHa
 *  oGa
 *  uOa
 *  uQa
 *  uY
 *  vRa
 *  yca
 */
import java.util.List;

public final class nha
extends Mha {
    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            void a2;
            return nha.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        nha c2;
        void b2;
        Waa a2;
        nha nha2 = this;
        if (((void)a2).length < AQa.P) {
            throw new eHa(uqa.o, new Object[uSa.E]);
        }
        void v0 = b2;
        v0.J(Rha.AFFECTED_BLOCKS, uSa.E);
        XF xF2 = nha.parseBlockPos((u)v0, (String[])a2, (int)uSa.E, uSa.E != 0);
        Gg gg2 = b2.J();
        if (!gg2.F(xF2)) {
            throw new oGa(uQa.C, new Object[uSa.E]);
        }
        uY uY2 = gg2.J(xF2);
        if (uY2 == null) {
            throw new oGa(cPa.Ja, new Object[uSa.E]);
        }
        nha nha3 = c2 = new Waa();
        uY2.J((Waa)nha3);
        Waa waa2 = (Waa)nha3.J();
        try {
            a2 = Ica.J((String)nha.getChatComponentFromNthArg((u)b2, (String[])a2, (int)yRa.d).f());
        }
        catch (yca yca2) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = yca2.getMessage();
            throw new oGa(bqa.ca, objectArray);
        }
        c2.J(a2);
        nha nha4 = c2;
        c2.J(rRa.X, xF2.getX());
        nha4.J(uOa.Ja, xF2.getY());
        nha4.J(oua.v, xF2.getZ());
        if (nha4.equals(waa2)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2.toString();
            throw new oGa(XOa.y, objectArray);
        }
        uY uY3 = uY2;
        uY3.f((Waa)c2);
        uY3.f();
        gg2.C(xF2);
        void v6 = b2;
        v6.J(Rha.AFFECTED_BLOCKS, vRa.d);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = c2.toString();
        nha.notifyOperators((u)v6, (Qc)nha2, (String)Zpa.Z, (Object[])objectArray);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        nha a2 = this;
        return uqa.o;
    }

    public String getCommandName() {
        return PQa.fa;
    }

    public nha() {
        nha a2;
    }
}

