/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  ERa
 *  Mha
 *  OCa
 *  TQa
 *  ld
 *  oGa
 *  vRa
 */
import java.util.List;

public final class Yia_1
extends Mha {
    public Yia_1() {
        Yia_1 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Yia_1 a2 = this;
        return ERa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void a2;
        u c2 = u2;
        Yia_1 b2 = this;
        if (((void)a2).length >= vRa.d && a2[uSa.E].equalsIgnoreCase(gua.Ga)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = OCa.J().J().J().J().length;
            c2.J((ld)new CZ(BQa.k, objectArray));
            c2.J((ld)new CY(Yia_1.joinNiceString((Object[])OCa.J().J().J().J())));
            return;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = OCa.J().J().J().J().length;
        c2.J((ld)new CZ(Ura.e, objectArray));
        c2.J((ld)new CY(Yia_1.joinNiceString((Object[])OCa.J().J().J().J())));
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = TQa.Ka;
            stringArray2[vRa.d] = gua.Ga;
            return Yia_1.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public String getCommandName() {
        return kra.x;
    }

    public boolean canCommandSenderUseCommand(u u2) {
        Object b2 = u2;
        Yia_1 a2 = this;
        if ((OCa.J().J().J().J() || OCa.J().J().J().J()) && super.canCommandSenderUseCommand((u)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }
}

