/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  JPa
 *  OCa
 *  Qc
 *  Qsa
 *  aPa
 *  bFa
 *  eHa
 *  oGa
 *  qHa
 *  vRa
 */
import java.util.Iterator;

public final class iga_1
extends qHa {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        Object c2 = stringArray;
        String[] a2 = this;
        if (((String[])c2).length <= 0) {
            throw new eHa(BQa.O, new Object[uSa.E]);
        }
        c2 = a2.getGameModeFromCommand((u)b2, c2[uSa.E]);
        a2.setGameType((Daa)((Object)c2));
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = new CZ(new StringBuilder().insert(3 & 4, kra.r).append(((Daa)((Object)c2)).getName()).toString(), new Object[uSa.E]);
        iga_1.notifyOperators((u)b2, (Qc)a2, (String)Qsa.L, (Object[])objectArray);
    }

    public String getCommandName() {
        return aPa.Z;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        iga_1 a2 = this;
        return BQa.O;
    }

    /*
     * WARNING - void declaration
     */
    public void setGameType(Daa daa2) {
        void a2;
        iga_1 iga_12 = this;
        OCa oCa2 = OCa.J();
        oCa2.J((Daa)a2);
        if (oCa2.c()) {
            Iterator<bFa> b2 = OCa.J().J().J().iterator();
            Object object = b2;
            while (object.hasNext()) {
                bFa bFa2 = (bFa)b2.next();
                object = b2;
                bFa2.J((Daa)a2);
                bFa2.O = JPa.N;
            }
        }
    }

    public iga_1() {
        iga_1 a2;
    }
}

