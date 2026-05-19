/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  ZRa
 *  eHa
 *  oGa
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import java.util.List;

public final class lGa_3
extends Mha {
    public lGa_3() {
        lGa_3 a2;
    }

    public String getCommandName() {
        return ZRa.x;
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length == vRa.d && c2[uSa.E].length() > 0) {
            void b2;
            OCa oCa2 = OCa.J();
            GameProfile gameProfile = oCa2.J().J().J(c2[uSa.E]);
            if (gameProfile == null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                throw new oGa(ROa.i, objectArray);
            }
            oCa2.J().l(gameProfile);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[uSa.E];
            lGa_3.notifyOperators((u)b2, (Qc)a2, (String)fPa.D, (Object[])objectArray);
            return;
        }
        throw new eHa(Fsa.ja, new Object[uSa.E]);
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return lGa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J().J());
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        lGa_3 a2 = this;
        return Fsa.ja;
    }
}

