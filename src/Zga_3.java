/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Epa
 *  Mha
 *  OCa
 *  Qc
 *  Tf
 *  Wsa
 *  Ypa
 *  ZOa
 *  bpa
 *  gc
 *  ld
 *  oGa
 *  oZ
 *  vPa
 *  vRa
 */
public final class Zga_3
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        Zga_3 zga_3;
        block9: {
            boolean bl;
            Tf tf2;
            int c22;
            zga_3 = this;
            OCa oCa2 = OCa.J();
            b2.J((ld)new CZ(Ypa.b, new Object[uSa.E]));
            if (oCa2.J() != null) {
                oCa2.J().f();
            }
            int n2 = c22 = uSa.E;
            while (n2 < oCa2.G.length) {
                if (oCa2.G[c22] != null) {
                    tf2 = oCa2.G[c22];
                    bl = tf2.i;
                    tf2.i = uSa.E;
                    tf2.J(vRa.d != 0, (gc)null);
                    tf2.i = bl;
                }
                n2 = ++c22;
            }
            try {
                void a2;
                if (((void)a2).length <= 0 || !Wsa.T.equals(a2[uSa.E])) break block9;
                b2.J((ld)new CZ(Eqa.d, new Object[uSa.E]));
                int n3 = c22 = uSa.E;
                while (n3 < oCa2.G.length) {
                    if (oCa2.G[c22] != null) {
                        tf2 = oCa2.G[c22];
                        bl = tf2.i;
                        tf2.i = uSa.E;
                        tf2.k();
                        tf2.i = bl;
                    }
                    n3 = ++c22;
                }
            }
            catch (oZ c22) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c22.getMessage();
                Zga_3.notifyOperators((u)b2, (Qc)zga_3, (String)vPa.i, (Object[])objectArray);
                return;
            }
            b2.J((ld)new CZ(bpa.L, new Object[uSa.E]));
        }
        Zga_3.notifyOperators((u)b2, (Qc)zga_3, (String)STa.p, (Object[])new Object[uSa.E]);
    }

    public Zga_3() {
        Zga_3 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Zga_3 a2 = this;
        return ZOa.h;
    }

    public String getCommandName() {
        return Epa.N;
    }
}

