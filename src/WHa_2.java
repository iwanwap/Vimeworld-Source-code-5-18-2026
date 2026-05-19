/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  ay
 *  eHa
 *  oGa
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import java.util.List;

public final class WHa_2
extends Mha {
    public WHa_2() {
        WHa_2 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        WHa_2 a2 = this;
        return lQa.h;
    }

    public boolean canCommandSenderUseCommand(u u2) {
        Object b2 = u2;
        WHa_2 a2 = this;
        if (OCa.J().J().J().J() && super.canCommandSenderUseCommand((u)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length >= vRa.d && c2[uSa.E].length() > 0) {
            void b2;
            OCa oCa2 = OCa.J();
            Object object = oCa2.J().J(c2[uSa.E]);
            if (object == null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                throw new oGa(tua.Ia, objectArray);
            }
            String string = null;
            if (c2.length >= uqa.g) {
                string = WHa_2.getChatComponentFromNthArg((u)b2, (String[])c2, (int)vRa.d).f();
            }
            object = new Vy((GameProfile)object, null, b2.J(), null, string);
            OCa oCa3 = oCa2;
            oCa3.J().J().J((ay)object);
            oCa2 = oCa3.J().J(c2[uSa.E]);
            if (oCa2 != null) {
                oCa2.I.f(vqa.l);
            }
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[uSa.E];
            WHa_2.notifyOperators((u)b2, (Qc)a2, (String)dqa.q, (Object[])objectArray);
            return;
        }
        throw new eHa(lQa.h, new Object[uSa.E]);
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length >= vRa.d) {
            return WHa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }

    public String getCommandName() {
        return yRa.la;
    }
}

