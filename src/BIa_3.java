/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  Rha
 *  bFa
 *  bua
 *  eHa
 *  oGa
 *  pua
 *  vRa
 */
import java.util.List;

public final class BIa_3
extends Mha {
    public String getCommandUsage(u u2) {
        Object b2 = u2;
        BIa_3 a2 = this;
        return Zra.Aa;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        BIa_3 a2 = this;
        if (c2 == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String[] getAllUsernames() {
        return OCa.J().J();
    }

    public String getCommandName() {
        return qsa.E;
    }

    public BIa_3() {
        BIa_3 a2;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == uqa.g) {
            return BIa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.getAllUsernames());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        bFa bFa2;
        int n2;
        int n3;
        void a2;
        BIa_3 bIa_3 = this;
        if (((void)a2).length <= 0) {
            throw new eHa(Zra.Aa, new Object[uSa.E]);
        }
        Object c2 = a2[uSa.E];
        int n4 = n3 = ((String)c2).endsWith(iSa.W) || ((String)c2).endsWith(GPa.V) ? vRa.d : uSa.E;
        if (n3 != 0 && ((String)c2).length() > vRa.d) {
            BIa_3 bIa_32 = c2;
            c2 = ((String)((Object)bIa_32)).substring(uSa.E, ((String)((Object)bIa_32)).length() - vRa.d);
        }
        int n5 = n2 = (c2 = BIa_3.parseInt((String)c2)) < 0 ? vRa.d : uSa.E;
        if (n2 != 0) {
            c2 *= pua.o;
        }
        bFa bFa3 = bFa2 = ((void)a2).length > vRa.d ? BIa_3.getPlayer((u)b2, (String)a2[vRa.d]) : BIa_3.getCommandSenderAsPlayer((u)b2);
        if (n3 != 0) {
            b2.J(Rha.QUERY_RESULT, bFa2.j);
            bFa bFa4 = bFa2;
            if (n2 != 0) {
                bFa4.k(-c2);
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = c2;
                objectArray[vRa.d] = bFa2.J();
                BIa_3.notifyOperators((u)b2, (Qc)bIa_3, (String)rta.I, (Object[])objectArray);
                return;
            }
            bFa4.k(c2);
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = c2;
            objectArray[vRa.d] = bFa2.J();
            BIa_3.notifyOperators((u)b2, (Qc)bIa_3, (String)bua.O, (Object[])objectArray);
            return;
        }
        b2.J(Rha.QUERY_RESULT, bFa2.Aa);
        if (n2 != 0) {
            throw new oGa(Bta.e, new Object[uSa.E]);
        }
        bFa2.F(c2);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = c2;
        objectArray[vRa.d] = bFa2.J();
        BIa_3.notifyOperators((u)b2, (Qc)bIa_3, (String)Psa.Ga, (Object[])objectArray);
    }
}

