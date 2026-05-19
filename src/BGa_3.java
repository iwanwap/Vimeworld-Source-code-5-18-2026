/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  RPa
 *  bFa
 *  bua
 *  eHa
 *  oGa
 *  vRa
 */
import java.util.List;

public final class BGa_3
extends Mha {
    public BGa_3() {
        BGa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return BGa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        if (d2.length > vRa.d && d2.length <= AQa.P) {
            void a2;
            return BGa_3.func_175771_a((String[])d2, (int)vRa.d, (XF)a2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return bua.Ja;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        BGa_3 a2 = this;
        return RPa.H;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        XF xF2;
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length > vRa.d && c2.length < AQa.P) {
            throw new eHa(RPa.H, new Object[uSa.E]);
        }
        bFa bFa2 = c2.length > 0 ? BGa_3.getPlayer((u)b2, (String)c2[uSa.E]) : BGa_3.getCommandSenderAsPlayer((u)b2);
        XF xF3 = xF2 = c2.length > yRa.d ? BGa_3.parseBlockPos((u)b2, (String[])c2, (int)vRa.d, vRa.d != 0) : bFa2.J();
        if (bFa2.j != null) {
            bFa2.J(xF2, vRa.d != 0);
            Object[] objectArray = new Object[AQa.P];
            objectArray[uSa.E] = bFa2.J();
            objectArray[vRa.d] = xF2.getX();
            objectArray[uqa.g] = xF2.getY();
            objectArray[yRa.d] = xF2.getZ();
            BGa_3.notifyOperators((u)b2, (Qc)a2, (String)NSa.Q, (Object[])objectArray);
        }
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        BGa_3 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

