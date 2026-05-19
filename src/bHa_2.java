/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  Wsa
 *  aGa
 *  aQa
 *  bFa
 *  eHa
 *  jsa
 *  oGa
 *  vRa
 */
import java.util.List;

public final class bHa_2
extends Mha {
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length >= vRa.d) {
            return bHa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void a2;
        bHa_2 bHa_22 = this;
        if (((void)a2).length > 0 && a2[uSa.E].length() > vRa.d) {
            void b2;
            bHa_2 c2 = OCa.J().J().J((String)a2[uSa.E]);
            String string = ITa.p;
            int n2 = uSa.E;
            if (c2 == null) {
                throw new aGa();
            }
            if (((void)a2).length >= uqa.g) {
                string = bHa_2.getChatComponentFromNthArg((u)b2, (String[])a2, (int)vRa.d).f();
                n2 = vRa.d;
            }
            ((bFa)c2).I.f(string);
            if (n2 != 0) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = c2.J();
                objectArray[vRa.d] = string;
                bHa_2.notifyOperators((u)b2, (Qc)bHa_22, (String)jsa.S, (Object[])objectArray);
                return;
            }
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2.J();
            bHa_2.notifyOperators((u)b2, (Qc)bHa_22, (String)Wsa.r, (Object[])objectArray);
            return;
        }
        throw new eHa(aQa.i, new Object[uSa.E]);
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    public String getCommandName() {
        return xra.w;
    }

    public bHa_2() {
        bHa_2 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        bHa_2 a2 = this;
        return aQa.i;
    }
}

