/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  oGa
 */
public final class MIa_1
extends Mha {
    public String getCommandName() {
        return vsa.L;
    }

    public MIa_1() {
        MIa_1 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        MIa_1 a2 = this;
        return yOa.s;
    }

    public void processCommand(u u2, String[] stringArray) throws oGa {
        Object c2 = u2;
        MIa_1 b2 = this;
        if (OCa.J().G != null) {
            MIa_1.notifyOperators((u)c2, (Qc)b2, (String)yRa.p, (Object[])new Object[uSa.E]);
        }
        OCa.J().C();
    }
}

