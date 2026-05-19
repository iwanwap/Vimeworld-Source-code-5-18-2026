/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Gua
 *  MQa
 *  Mha
 *  OCa
 *  Qc
 *  Rha
 *  Tf
 *  Yra
 *  cRa
 *  eHa
 *  jpa
 *  oGa
 *  vRa
 */
import java.util.List;

public final class Aia_2
extends Mha {
    public String getCommandName() {
        return vsa.G;
    }

    public Aia_2() {
        Aia_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void a2;
        Aia_2 aia_2 = this;
        if (((void)a2).length > vRa.d) {
            void b2;
            if (a2[uSa.E].equals(pta.G)) {
                Aia_2 aia_22;
                int c2;
                if (a2[vRa.d].equals(Jsa.q)) {
                    c2 = PRa.U;
                    aia_22 = aia_2;
                } else if (a2[vRa.d].equals(Fpa.c)) {
                    c2 = MTa.Ha;
                    aia_22 = aia_2;
                } else {
                    c2 = Aia_2.parseInt((String)a2[vRa.d], (int)uSa.E);
                    aia_22 = aia_2;
                }
                aia_22.setTime((u)b2, c2);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2;
                Aia_2.notifyOperators((u)b2, (Qc)aia_2, (String)kua.M, (Object[])objectArray);
                return;
            }
            if (a2[uSa.E].equals(Qra.U)) {
                int c2 = Aia_2.parseInt((String)a2[vRa.d], (int)uSa.E);
                void v2 = b2;
                aia_2.addTime((u)v2, c2);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2;
                Aia_2.notifyOperators((u)v2, (Qc)aia_2, (String)jpa.n, (Object[])objectArray);
                return;
            }
            if (a2[uSa.E].equals(tSa.O)) {
                if (a2[vRa.d].equals(Yra.E)) {
                    void v4 = b2;
                    int c2 = (int)(v4.J().f() % Gua.R);
                    v4.J(Rha.QUERY_RESULT, c2);
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = c2;
                    Aia_2.notifyOperators((u)v4, (Qc)aia_2, (String)Jpa.L, (Object[])objectArray);
                    return;
                }
                if (a2[vRa.d].equals(cRa.ha)) {
                    void v6 = b2;
                    int c2 = (int)(v6.J().l() % Gua.R);
                    v6.J(Rha.QUERY_RESULT, c2);
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = c2;
                    Aia_2.notifyOperators((u)v6, (Qc)aia_2, (String)Jpa.L, (Object[])objectArray);
                    return;
                }
            }
        }
        throw new eHa(MQa.V, new Object[uSa.E]);
    }

    /*
     * WARNING - void declaration
     */
    public void setTime(u u2, int n2) {
        Object c2 = u2;
        Aia_2 b2 = this;
        int n3 = c2 = uSa.E;
        while (n3 < OCa.J().G.length) {
            void a2;
            Tf tf = OCa.J().G[c2];
            tf.f((long)a2);
            n3 = ++c2;
        }
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Aia_2 a2 = this;
        return MQa.V;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[yRa.d];
            stringArray2[uSa.E] = pta.G;
            stringArray2[vRa.d] = Qra.U;
            stringArray2[uqa.g] = tSa.O;
            return Aia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == uqa.g && d2[uSa.E].equals(pta.G)) {
            String[] stringArray3 = new String[uqa.g];
            stringArray3[uSa.E] = Jsa.q;
            stringArray3[vRa.d] = Fpa.c;
            return Aia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray3);
        }
        if (d2.length == uqa.g && d2[uSa.E].equals(tSa.O)) {
            String[] stringArray4 = new String[uqa.g];
            stringArray4[uSa.E] = Yra.E;
            stringArray4[vRa.d] = cRa.ha;
            return Aia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray4);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void addTime(u u2, int n2) {
        Object c2 = u2;
        Aia_2 b2 = this;
        int n3 = c2 = uSa.E;
        while (n3 < OCa.J().G.length) {
            void a2;
            Tf tf = OCa.J().G[c2];
            tf.f(tf.f() + (long)a2);
            n3 = ++c2;
        }
    }
}

