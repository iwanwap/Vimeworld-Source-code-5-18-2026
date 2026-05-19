/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  Tf
 *  Ysa
 *  oGa
 *  vRa
 */
public final class Jha_1
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        int c2;
        Jha_1 jha_1 = this;
        OCa a2 = OCa.J();
        int n2 = uSa.E;
        int n3 = c2 = uSa.E;
        while (n3 < a2.G.length) {
            if (a2.G[c2] != null) {
                Tf tf = a2.G[c2];
                if (tf.i) {
                    tf.i = uSa.E;
                    n2 = vRa.d;
                }
            }
            n3 = ++c2;
        }
        if (n2 != 0) {
            void b2;
            Jha_1.notifyOperators((u)b2, (Qc)jha_1, (String)Qra.X, (Object[])new Object[uSa.E]);
            return;
        }
        throw new oGa(Ysa.i, new Object[uSa.E]);
    }

    public Jha_1() {
        Jha_1 a2;
    }

    public String getCommandName() {
        return Gta.T;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Jha_1 a2 = this;
        return BPa.Aa;
    }
}

