/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Epa
 *  Mha
 *  OCa
 *  aSa
 *  ld
 *  oGa
 *  vRa
 */
public final class JIa_1
extends Mha {
    public void processCommand(u u2, String[] stringArray) throws oGa {
        u c2 = u2;
        JIa_1 b2 = this;
        Object a2 = c2 instanceof Sx ? ((Sx)((Object)c2)).j : (Object)OCa.J().J(uSa.E);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = a2.J();
        c2.J((ld)new CZ(aSa.O, objectArray));
    }

    public boolean canCommandSenderUseCommand(u u2) {
        Object b2 = u2;
        JIa_1 a2 = this;
        if (OCa.J().E() || super.canCommandSenderUseCommand((u)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public JIa_1() {
        JIa_1 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        JIa_1 a2 = this;
        return ITa.J;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return Epa.h;
    }
}

