/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Mda
 *  Mha
 *  OCa
 *  Qc
 *  Rha
 *  WIa
 *  Xsa
 *  bFa
 *  bSa
 *  eHa
 *  oGa
 *  vRa
 *  waa
 *  wga
 */
import java.util.Collection;
import java.util.List;

public final class dIa
extends Mha {
    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        dIa a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        dIa a2 = this;
        return Fsa.W;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return dIa.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.getListOfPlayers());
        }
        if (d2.length == uqa.g) {
            return dIa.getListOfStringsMatchingLastWord((String[])d2, (Collection)wga.J());
        }
        return null;
    }

    public dIa() {
        dIa a2;
    }

    public String getCommandName() {
        return Xsa.p;
    }

    public String[] getListOfPlayers() {
        return OCa.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] waa2) throws oGa {
        wga wga2;
        int n2;
        void b2;
        waa c2 = waa2;
        waa a2 = this;
        if (((String[])c2).length < uqa.g) {
            throw new eHa(Fsa.W, new Object[uSa.E]);
        }
        void v0 = b2;
        bFa bFa2 = dIa.getPlayer((u)v0, (String)c2[uSa.E]);
        v0.J(Rha.AFFECTED_ITEMS, uSa.E);
        try {
            n2 = dIa.parseInt((String)c2[vRa.d], (int)uSa.E);
        }
        catch (WIa wIa) {
            wga2 = wga.f((String)c2[vRa.d]);
            if (wga2 == null) {
                throw wIa;
            }
            n2 = wga2.I;
        }
        int n3 = vRa.d;
        wga2 = bFa2.f();
        if (wga2 == null) {
            throw new oGa(bSa.ca, new Object[uSa.E]);
        }
        bFa2 = wga.J((int)n2);
        if (bFa2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = n2;
            throw new WIa(FPa.ja, objectArray);
        }
        if (!bFa2.J((Mda)wga2)) {
            throw new oGa(Qpa.a, new Object[uSa.E]);
        }
        if (((String[])c2).length >= yRa.d) {
            n3 = dIa.parseInt((String)c2[uqa.g], (int)bFa2.l(), (int)bFa2.f());
        }
        if (wga2.M() && (c2 = wga2.J()) != null) {
            int n4 = n2 = uSa.E;
            while (n4 < c2.J()) {
                wga wga3;
                short s = c2.J(n2).J(QTa.O);
                if (wga.J((int)s) != null && !(wga3 = wga.J((int)s)).J((wga)bFa2)) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = bFa2.J(n3);
                    objectArray[vRa.d] = wga3.J((int)c2.J(n2).J(Jra.ca));
                    throw new oGa(Xpa.M, objectArray);
                }
                n4 = ++n2;
            }
        }
        wga2.J((wga)bFa2, n3);
        dIa.notifyOperators((u)b2, (Qc)a2, (String)bSa.h, (Object[])new Object[uSa.E]);
        b2.J(Rha.AFFECTED_ITEMS, vRa.d);
    }
}

