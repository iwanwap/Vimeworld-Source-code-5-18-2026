/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JTa
 *  Mha
 *  NTa
 *  OCa
 *  Qc
 *  dpa
 *  eHa
 *  oGa
 *  vRa
 *  vpa
 */
import java.util.List;
import java.util.Random;

public final class iHa
extends Mha {
    public String getCommandName() {
        return oua.h;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[yRa.d];
            stringArray2[uSa.E] = cPa.i;
            stringArray2[vRa.d] = vsa.f;
            stringArray2[uqa.g] = Upa.G;
            return iHa.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public iHa() {
        iHa a2;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void a2;
        iHa iHa2 = this;
        if (((void)a2).length >= vRa.d && ((void)a2).length <= uqa.g) {
            void b2;
            int n2 = (vpa.Ja + new Random().nextInt(Jpa.z)) * kTa.j;
            if (((void)a2).length >= uqa.g) {
                n2 = iHa.parseInt((String)a2[vRa.d], (int)vRa.d, (int)IPa.o) * kTa.j;
            }
            iHa c2 = OCa.J().G[uSa.E].J();
            if (cPa.i.equalsIgnoreCase((String)a2[uSa.E])) {
                iHa iHa3 = c2;
                iHa3.f(n2);
                iHa3.M(uSa.E);
                iHa3.d(uSa.E);
                iHa3.d(uSa.E != 0);
                iHa3.C(uSa.E != 0);
                iHa.notifyOperators((u)b2, (Qc)iHa2, (String)JTa.j, (Object[])new Object[uSa.E]);
                return;
            }
            if (vsa.f.equalsIgnoreCase((String)a2[uSa.E])) {
                iHa iHa4 = c2;
                iHa iHa5 = c2;
                c2.f(uSa.E);
                iHa5.M(n2);
                iHa4.d(n2);
                iHa5.d(vRa.d != 0);
                iHa4.C(uSa.E != 0);
                iHa.notifyOperators((u)b2, (Qc)iHa2, (String)ZSa.W, (Object[])new Object[uSa.E]);
                return;
            }
            if (!Upa.G.equalsIgnoreCase((String)a2[uSa.E])) {
                throw new eHa(dpa.R, new Object[uSa.E]);
            }
            iHa iHa6 = c2;
            iHa iHa7 = c2;
            c2.f(uSa.E);
            iHa7.M(n2);
            iHa6.d(n2);
            iHa7.d(vRa.d != 0);
            iHa6.C(vRa.d != 0);
            iHa.notifyOperators((u)b2, (Qc)iHa2, (String)NTa.q, (Object[])new Object[uSa.E]);
            return;
        }
        throw new eHa(dpa.R, new Object[uSa.E]);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        iHa a2 = this;
        return dpa.R;
    }
}

