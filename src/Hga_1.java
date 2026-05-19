/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Ica
 *  JSa
 *  MQa
 *  Mha
 *  OCa
 *  Qc
 *  Rha
 *  Uqa
 *  Waa
 *  bFa
 *  eAa
 *  iPa
 *  ld
 *  oGa
 *  pua
 *  vRa
 *  yca
 */
import java.util.Collection;
import java.util.List;

public final class Hga_1
extends Mha {
    public Hga_1() {
        Hga_1 a2;
    }

    public String getCommandName() {
        return cPa.i;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Hga_1 a2 = this;
        return MQa.D;
    }

    public String[] func_147209_d() {
        return OCa.J().J();
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        String[] stringArray2;
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        bFa bFa2 = c2.length == 0 ? Hga_1.getCommandSenderAsPlayer((u)b2) : Hga_1.getPlayer((u)b2, (String)c2[uSa.E]);
        eAa eAa2 = c2.length >= uqa.g ? Hga_1.getItemByText((u)b2, (String)c2[vRa.d]) : null;
        int n2 = c2.length >= yRa.d ? Hga_1.parseInt((String)c2[uqa.g], (int)pua.o) : pua.o;
        int n3 = c2.length >= AQa.P ? Hga_1.parseInt((String)c2[yRa.d], (int)pua.o) : pua.o;
        Waa waa2 = null;
        if (c2.length >= tTa.h) {
            try {
                waa2 = Ica.J((String)Hga_1.buildString((String[])c2, (int)AQa.P));
                stringArray2 = c2;
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(JSa.A, objectArray);
            }
        } else {
            stringArray2 = c2;
        }
        if (stringArray2.length >= uqa.g && eAa2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = bFa2.J();
            throw new oGa(Uqa.T, objectArray);
        }
        bFa bFa3 = bFa2;
        int n4 = bFa3.K.J(eAa2, n2, n3, waa2);
        bFa3.x.J();
        if (!bFa3.h.f()) {
            bFa2.W();
        }
        b2.J(Rha.AFFECTED_ITEMS, n4);
        if (n4 == 0) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = bFa2.J();
            throw new oGa(Uqa.T, objectArray);
        }
        void v5 = b2;
        if (n3 == 0) {
            void v6 = b2;
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = bFa2.J();
            objectArray[vRa.d] = n4;
            v5.J((ld)new CZ(iPa.r, objectArray));
            return;
        }
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = bFa2.J();
        objectArray[vRa.d] = n4;
        Hga_1.notifyOperators((u)v5, (Qc)a2, (String)EPa.t, (Object[])objectArray);
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        Hga_1 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return Hga_1.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.func_147209_d());
        }
        if (d2.length == uqa.g) {
            return Hga_1.getListOfStringsMatchingLastWord((String[])d2, (Collection)eAa.C.J());
        }
        return null;
    }
}

