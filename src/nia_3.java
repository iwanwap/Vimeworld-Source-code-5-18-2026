/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  Tf
 *  oGa
 *  vRa
 */
public final class nia_3
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        int c2;
        nia_3 nia_32 = this;
        OCa a2 = OCa.J();
        int n2 = uSa.E;
        int n3 = c2 = uSa.E;
        while (n3 < a2.G.length) {
            if (a2.G[c2] != null) {
                Tf tf2 = a2.G[c2];
                if (!tf2.i) {
                    tf2.i = vRa.d;
                    n2 = vRa.d;
                }
            }
            n3 = ++c2;
        }
        if (n2 != 0) {
            void b2;
            nia_3.notifyOperators((u)b2, (Qc)nia_32, (String)VPa.B, (Object[])new Object[uSa.E]);
            return;
        }
        throw new oGa(ROa.R, new Object[uSa.E]);
    }

    public nia_3() {
        nia_3 a2;
    }

    public String getCommandName() {
        return vRa.la;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        nia_3 a2 = this;
        return EPa.Ja;
    }
}

