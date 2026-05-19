/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  VQa
 *  kpa
 *  oGa
 *  pqa
 *  vRa
 */
import java.util.List;

public final class sga_1
extends Mha {
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return sga_1.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        sga_1 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        sga_1 a2 = this;
        return pqa.Da;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        sga_1 c2;
        void b2;
        void a2;
        sga_1 sga_12 = this;
        if (((void)a2).length == 0) {
            void v0 = b2;
            c2 = sga_1.getCommandSenderAsPlayer((u)v0);
            c2.F();
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = ((Sx)((Object)c2)).J();
            sga_1.notifyOperators((u)v0, (Qc)sga_12, (String)kpa.Da, (Object[])objectArray);
            return;
        }
        void v2 = b2;
        c2 = sga_1.func_175768_b((u)v2, (String)a2[uSa.E]);
        c2.F();
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = c2.J();
        sga_1.notifyOperators((u)v2, (Qc)sga_12, (String)kpa.Da, (Object[])objectArray);
    }

    public sga_1() {
        sga_1 a2;
    }

    public String getCommandName() {
        return VQa.S;
    }
}

