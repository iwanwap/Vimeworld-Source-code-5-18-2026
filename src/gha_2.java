/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  FPa
 *  Mha
 *  NOa
 *  OCa
 *  Qc
 *  WIa
 *  eHa
 *  kpa
 *  kqa
 *  oGa
 *  uQa
 *  vRa
 */
import java.util.List;

public final class gha_2
extends Mha {
    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[AQa.P];
            stringArray2[uSa.E] = ITa.y;
            stringArray2[vRa.d] = xua.P;
            stringArray2[uqa.g] = AQa.t;
            stringArray2[yRa.d] = eta.X;
            return gha_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        gha_2 a2 = this;
        return FPa.w;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        Object c2 = stringArray;
        String[] a2 = this;
        if (((String[])c2).length <= 0) {
            throw new eHa(FPa.w, new Object[uSa.E]);
        }
        c2 = a2.getDifficultyFromCommand(c2[uSa.E]);
        OCa.J().J((sZ)((Object)c2));
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = new CZ(((sZ)((Object)c2)).getDifficultyResourceKey(), new Object[uSa.E]);
        gha_2.notifyOperators((u)b2, (Qc)a2, (String)kpa.j, (Object[])objectArray);
    }

    public gha_2() {
        gha_2 a2;
    }

    public String getCommandName() {
        return uQa.o;
    }

    public sZ getDifficultyFromCommand(String string) throws oGa, WIa {
        String b2 = string;
        gha_2 a2 = this;
        if (!b2.equalsIgnoreCase(ITa.y) && !b2.equalsIgnoreCase(NOa.m)) {
            if (!b2.equalsIgnoreCase(xua.P) && !b2.equalsIgnoreCase(dsa.w)) {
                if (!b2.equalsIgnoreCase(AQa.t) && !b2.equalsIgnoreCase(kqa.U)) {
                    if (!b2.equalsIgnoreCase(eta.X) && !b2.equalsIgnoreCase(opa.h)) {
                        return sZ.getDifficultyEnum(gha_2.parseInt((String)b2, (int)uSa.E, (int)yRa.d));
                    }
                    return sZ.HARD;
                }
                return sZ.NORMAL;
            }
            return sZ.EASY;
        }
        return sZ.PEACEFUL;
    }
}

