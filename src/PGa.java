/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Mha
 *  OCa
 *  TQa
 *  aGa
 *  asa
 *  bFa
 *  cQa
 *  eHa
 *  ld
 *  oGa
 *  pY
 *  vRa
 */
import java.util.Arrays;
import java.util.List;

public final class PGa
extends Mha {
    public int getRequiredPermissionLevel() {
        return uSa.E;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        PGa a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        ld c2 = stringArray;
        ld a2 = this;
        if (((String[])c2).length < uqa.g) {
            throw new eHa(dsa.r, new Object[uSa.E]);
        }
        bFa bFa2 = PGa.getPlayer((u)b2, (String)c2[uSa.E]);
        if (bFa2 == b2) {
            throw new aGa(Qpa.J, new Object[uSa.E]);
        }
        c2 = PGa.getChatComponentFromNthArg((u)b2, (String[])c2, (int)vRa.d, (!(b2 instanceof Sx) ? vRa.d : uSa.E) != 0);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2.J();
        objectArray[vRa.d] = c2.J();
        CZ cZ2 = new CZ(TQa.V, objectArray);
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = bFa2.J();
        objectArray2[vRa.d] = c2.J();
        c2 = new CZ(cQa.y, objectArray2);
        cZ2.J().J(pY.GRAY).i(Boolean.valueOf(vRa.d != 0));
        c2.J().J(pY.GRAY).i(Boolean.valueOf(vRa.d != 0));
        bFa2.J((ld)cZ2);
        b2.J(c2);
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        return PGa.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
    }

    public String getCommandName() {
        return DPa.Da;
    }

    public List<String> getCommandAliases() {
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = Zqa.q;
        stringArray[vRa.d] = asa.e;
        return Arrays.asList(stringArray);
    }

    public PGa() {
        PGa a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        PGa a2 = this;
        return dsa.r;
    }
}

