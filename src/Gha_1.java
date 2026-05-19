/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Mha
 *  OCa
 *  Qc
 *  eHa
 *  oGa
 *  vRa
 */
public final class Gha_1
extends Mha {
    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    public String getCommandName() {
        return DQa.o;
    }

    public Gha_1() {
        Gha_1 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Gha_1 a2 = this;
        return zpa.S;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String[] c22 = stringArray;
        String[] a2 = this;
        if (c22.length != vRa.d) {
            throw new eHa(zpa.S, new Object[uSa.E]);
        }
        int c22 = Gha_1.parseInt((String)c22[uSa.E], (int)uSa.E);
        OCa.J().J(c22);
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = c22;
        Gha_1.notifyOperators((u)b2, (Qc)a2, (String)cTa.fa, (Object[])objectArray);
    }
}

