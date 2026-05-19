/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  cQa
 *  eHa
 *  oGa
 *  vRa
 */
import java.util.List;

public final class Xga_3
extends Mha {
    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Xga_3 a2 = this;
        return xqa.n;
    }

    public String getCommandName() {
        return rpa.p;
    }

    public Xga_3() {
        Xga_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            void a2;
            return Xga_3.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        Object c2;
        void v1;
        void b2;
        void a2;
        Xga_3 xga_3 = this;
        if (((void)a2).length == 0) {
            void v0 = b2;
            v1 = v0;
            c2 = Xga_3.getCommandSenderAsPlayer((u)v0).J();
        } else {
            if (((void)a2).length != yRa.d || b2.J() == null) {
                throw new eHa(xqa.n, new Object[uSa.E]);
            }
            void v2 = b2;
            v1 = v2;
            c2 = Xga_3.parseBlockPos((u)v2, (String[])a2, (int)uSa.E, vRa.d != 0);
        }
        v1.J().J((XF)((Object)c2));
        OCa.J().J().J(new nba((XF)((Object)c2)));
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = c2.getX();
        objectArray[vRa.d] = c2.getY();
        objectArray[uqa.g] = c2.getZ();
        Xga_3.notifyOperators((u)b2, (Qc)xga_3, (String)cQa.l, (Object[])objectArray);
    }
}

