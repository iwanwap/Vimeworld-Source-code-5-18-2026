/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  WSa
 *  XSa
 *  oGa
 *  vRa
 */
public final class PHa_2
extends Mha {
    public String getCommandUsage(u u2) {
        Object b2 = u2;
        PHa_2 a2 = this;
        return Yqa.B;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        Object c2 = stringArray;
        String[] a2 = this;
        c2 = OCa.J().J(Daa.SURVIVAL, uSa.E != 0);
        if (c2 != null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2;
            PHa_2.notifyOperators((u)b2, (Qc)a2, (String)WSa.la, (Object[])objectArray);
            return;
        }
        PHa_2.notifyOperators((u)b2, (Qc)a2, (String)XSa.K, (Object[])new Object[uSa.E]);
    }

    public String getCommandName() {
        return Upa.E;
    }

    public PHa_2() {
        PHa_2 a2;
    }
}

