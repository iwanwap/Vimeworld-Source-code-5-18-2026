/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ica
 *  MQa
 *  Mha
 *  NCa
 *  OCa
 *  Qc
 *  Usa
 *  Waa
 *  eHa
 *  hra
 *  oGa
 *  rba
 *  vL
 *  vRa
 *  yca
 */
import java.util.List;

public final class aHa
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        aHa aHa2;
        void b2;
        void a2;
        aHa aHa3 = this;
        if (((void)a2).length < vRa.d) {
            throw new eHa(MQa.la, new Object[uSa.E]);
        }
        vL vL2 = aHa.func_175768_b((u)b2, (String)a2[uSa.E]);
        aHa c2 = null;
        if (((void)a2).length >= uqa.g) {
            try {
                aHa2 = c2 = Ica.J((String)aHa.buildString((String[])a2, (int)vRa.d));
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(csa.n, objectArray);
            }
        } else {
            aHa2 = c2;
        }
        if (aHa2 != null) {
            Waa waa2;
            Waa waa3 = waa2 = new Waa();
            vL2.C(waa3);
            if (!rba.J((NCa)c2, (NCa)waa3, vRa.d != 0)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = vL2.J();
                throw new oGa(mSa.X, objectArray);
            }
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = vL2.J();
        aHa.notifyOperators((u)b2, (Qc)aHa3, (String)hra.j, (Object[])objectArray);
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        aHa a2 = this;
        return MQa.la;
    }

    public String getCommandName() {
        return Usa.r;
    }

    public aHa() {
        aHa a2;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return aHa.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        aHa a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

