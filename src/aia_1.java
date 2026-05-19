/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Mha
 *  OCa
 *  Rha
 *  iPa
 *  ld
 *  oGa
 *  vRa
 */
public final class aia_1
extends Mha {
    public aia_1() {
        aia_1 a2;
    }

    public String getCommandName() {
        return Wqa.Y;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        aia_1 a2 = this;
        return iPa.N;
    }

    public int getRequiredPermissionLevel() {
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void a2;
        void b2;
        aia_1 aia_12 = this;
        int c2 = OCa.J().M();
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = c2;
        objectArray[vRa.d] = OCa.J().l();
        b2.J((ld)new CZ(hQa.H, objectArray));
        b2.J((ld)new CY(OCa.J().J().J((((void)a2).length > 0 && uua.Da.equalsIgnoreCase((String)a2[uSa.E]) ? vRa.d : uSa.E) != 0)));
        b2.J(Rha.QUERY_RESULT, c2);
    }
}

