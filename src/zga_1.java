/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Mha
 *  OCa
 *  Qc
 *  Qsa
 *  eHa
 *  oGa
 *  uGa
 *  vRa
 */
import java.util.List;

public final class zga_1
extends Mha {
    public String getCommandUsage(u u2) {
        Object b2 = u2;
        zga_1 a2 = this;
        return yta.q;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length == vRa.d && c2[uSa.E].length() > vRa.d) {
            if (uGa.field_147211_a.matcher(c2[uSa.E]).matches()) {
                void b2;
                OCa.J().J().J().J(c2[uSa.E]);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                zga_1.notifyOperators((u)b2, (Qc)a2, (String)Upa.k, (Object[])objectArray);
                return;
            }
            throw new lha(Qsa.g, new Object[uSa.E]);
        }
        throw new eHa(yta.q, new Object[uSa.E]);
    }

    public zga_1() {
        zga_1 a2;
    }

    public boolean canCommandSenderUseCommand(u u2) {
        Object b2 = u2;
        zga_1 a2 = this;
        if (OCa.J().J().J().J() && super.canCommandSenderUseCommand((u)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    public String getCommandName() {
        return JPa.Ka;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return zga_1.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J().J().J());
        }
        return null;
    }
}

