/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Mha
 *  OCa
 *  YSa
 *  eHa
 *  ld
 *  oGa
 *  vRa
 *  wra
 */
import java.util.List;

public final class kHa_3
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        ld c2 = stringArray;
        ld a2 = this;
        if (((String[])c2).length <= 0) {
            throw new eHa(XOa.n, new Object[uSa.E]);
        }
        c2 = kHa_3.getChatComponentFromNthArg((u)b2, (String[])c2, (int)uSa.E, (!(b2 instanceof Sx) ? vRa.d : uSa.E) != 0);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2.J();
        objectArray[vRa.d] = c2;
        OCa.J().J().J((ld)new CZ(YSa.x, objectArray));
    }

    public String getCommandName() {
        return wra.Da;
    }

    public int getRequiredPermissionLevel() {
        return uSa.E;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        return kHa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
    }

    public kHa_3() {
        kHa_3 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        kHa_3 a2 = this;
        return XOa.n;
    }
}

