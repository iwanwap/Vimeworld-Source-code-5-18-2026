/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  dpa
 *  eHa
 *  oGa
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import java.util.List;

public final class LHa_3
extends Mha {
    public boolean canCommandSenderUseCommand(u u2) {
        Object b2 = u2;
        LHa_3 a2 = this;
        if (OCa.J().J().J().J() && super.canCommandSenderUseCommand((u)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getCommandName() {
        return Hra.Ma;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return LHa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J().J().J());
        }
        return null;
    }

    public LHa_3() {
        LHa_3 a2;
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
                throw new oGa(tua.L, objectArray);
            }
            oCa2.J().J().J((Object)gameProfile);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[uSa.E];
            LHa_3.notifyOperators((u)b2, (Qc)a2, (String)zua.Z, (Object[])objectArray);
            return;
        }
        throw new eHa(dpa.P, new Object[uSa.E]);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        LHa_3 a2 = this;
        return dpa.P;
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }
}

