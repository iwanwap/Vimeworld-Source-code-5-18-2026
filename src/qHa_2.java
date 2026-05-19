/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  FPa
 *  JPa
 *  Mha
 *  OCa
 *  Qc
 *  WIa
 *  aSa
 *  bFa
 *  eHa
 *  ld
 *  mZ
 *  oGa
 *  uRa
 *  vRa
 *  ysa
 */
import java.util.List;

public class qHa_2
extends Mha {
    public qHa_2() {
        qHa_2 a2;
    }

    public String getCommandName() {
        return vqa.U;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        qHa_2 a2 = this;
        if (c2 == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String[] getListOfPlayerUsernames() {
        return OCa.J().J();
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        qHa_2 a2 = this;
        return sSa.t;
    }

    public Daa getGameModeFromCommand(u u2, String string) throws oGa, WIa {
        String c2 = string;
        qHa_2 a2 = this;
        if (!c2.equalsIgnoreCase(Daa.SURVIVAL.getName()) && !c2.equalsIgnoreCase(wsa.Q)) {
            if (!c2.equalsIgnoreCase(Daa.CREATIVE.getName()) && !c2.equalsIgnoreCase(eua.ca)) {
                if (!c2.equalsIgnoreCase(Daa.ADVENTURE.getName()) && !c2.equalsIgnoreCase(ysa.M)) {
                    if (!c2.equalsIgnoreCase(Daa.SPECTATOR.getName()) && !c2.equalsIgnoreCase(Asa.G)) {
                        return mZ.J((int)qHa_2.parseInt((String)c2, (int)uSa.E, (int)(Daa.values().length - uqa.g)));
                    }
                    return Daa.SPECTATOR;
                }
                return Daa.ADVENTURE;
            }
            return Daa.CREATIVE;
        }
        return Daa.SURVIVAL;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[AQa.P];
            stringArray2[uSa.E] = APa.k;
            stringArray2[vRa.d] = mPa.P;
            stringArray2[uqa.g] = tSa.G;
            stringArray2[yRa.d] = aSa.N;
            return qHa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == uqa.g) {
            return qHa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.getListOfPlayerUsernames());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] cZ2) throws oGa {
        void b2;
        CZ c2 = cZ2;
        CZ a2 = this;
        if (((String[])c2).length <= 0) {
            throw new eHa(sSa.t, new Object[uSa.E]);
        }
        Daa daa = a2.getGameModeFromCommand((u)b2, c2[uSa.E]);
        bFa bFa2 = ((String[])c2).length >= uqa.g ? qHa_2.getPlayer((u)b2, (String)c2[vRa.d]) : qHa_2.getCommandSenderAsPlayer((u)b2);
        bFa2.J(daa);
        bFa2.O = JPa.N;
        if (b2.J().J().f(Ura.Q)) {
            bFa2.J((ld)new CZ(rRa.K, new Object[uSa.E]));
        }
        c2 = new CZ(new StringBuilder().insert(3 ^ 3, kra.r).append(daa.getName()).toString(), new Object[uSa.E]);
        if (bFa2 != b2) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = bFa2.J();
            objectArray[vRa.d] = c2;
            qHa_2.notifyOperators((u)b2, (Qc)a2, (int)vRa.d, (String)FPa.A, (Object[])objectArray);
            return;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = c2;
        qHa_2.notifyOperators((u)b2, (Qc)a2, (int)vRa.d, (String)uRa.D, (Object[])objectArray);
    }
}

