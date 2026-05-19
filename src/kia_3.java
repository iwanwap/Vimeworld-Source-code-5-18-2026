/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Mha
 *  OCa
 *  eHa
 *  fTa
 *  ld
 *  oGa
 *  vRa
 *  yQa
 */
import java.util.List;

public final class kia_3
extends Mha {
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length >= vRa.d) {
            return kia_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }

    public kia_3() {
        kia_3 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        kia_3 a2 = this;
        return yQa.v;
    }

    public int getRequiredPermissionLevel() {
        return vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        ld c2 = stringArray;
        ld a2 = this;
        if (((String[])c2).length > 0 && c2[uSa.E].length() > 0) {
            void b2;
            c2 = kia_3.getChatComponentFromNthArg((u)b2, (String[])c2, (int)uSa.E, vRa.d != 0);
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = b2.J();
            objectArray[vRa.d] = c2;
            OCa.J().J().J((ld)new CZ(zOa.G, objectArray));
            return;
        }
        throw new eHa(yQa.v, new Object[uSa.E]);
    }

    public String getCommandName() {
        return fTa.W;
    }
}

