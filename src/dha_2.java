/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  NTa
 *  OCa
 *  Qc
 *  bFa
 *  bua
 *  eHa
 *  ica
 *  isa
 *  oGa
 *  vL
 *  vPa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public final class dha_2
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        vL vL2;
        bFa bFa2;
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length < yRa.d) {
            throw new eHa(Nta.v, new Object[uSa.E]);
        }
        if (b2 instanceof bFa) {
            bFa2 = (bFa)b2;
        } else {
            vL2 = b2.J();
            if (!(vL2 instanceof bFa)) {
                throw new oGa(isa.ja, new Object[uSa.E]);
            }
            bFa2 = (bFa)vL2;
        }
        vL2 = OCa.J().J(uSa.E).J();
        ica ica2 = vL2.J(c2[uSa.E]);
        if (ica2 != null && ica2.J() == lb.C) {
            vL vL3;
            int n2 = dha_2.parseInt((String)c2[uqa.g]);
            if (!vL2.J(bFa2.J(), ica2)) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                throw new oGa(vPa.l, objectArray);
            }
            if ((vL2 = vL2.J(bFa2.J(), ica2)).J()) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                throw new oGa(bua.Da, objectArray);
            }
            if (pta.G.equals(c2[vRa.d])) {
                vL vL4 = vL2;
                vL3 = vL4;
                vL4.J(n2);
            } else {
                if (!Qra.U.equals(c2[vRa.d])) {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = c2[vRa.d];
                    throw new oGa(hQa.U, objectArray);
                }
                vL vL5 = vL2;
                vL3 = vL5;
                vL5.f(n2);
            }
            vL3.J(vRa.d != 0);
            if (bFa2.s.f()) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                objectArray[vRa.d] = c2[vRa.d];
                objectArray[uqa.g] = c2[uqa.g];
                dha_2.notifyOperators((u)b2, (Qc)a2, (String)NTa.Ia, (Object[])objectArray);
                return;
            }
        } else {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[uSa.E];
            throw new oGa(vPa.l, objectArray);
        }
    }

    public String getCommandName() {
        return Ira.M;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        dha_2 a2 = this;
        return Nta.v;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        void b2;
        Object d2 = u2;
        dha_2 c2 = this;
        if (((void)b2).length == vRa.d) {
            d2 = OCa.J().J(uSa.E).J();
            ArrayList<String> a2 = Lists.newArrayList();
            for (ica ica2 : d2.d()) {
                if (ica2.J() != lb.C) continue;
                a2.add(ica2.J());
            }
            ArrayList<String> arrayList = a2;
            return dha_2.getListOfStringsMatchingLastWord((String[])b2, (String[])arrayList.toArray(new String[arrayList.size()]));
        }
        if (((void)b2).length == uqa.g) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = Qra.U;
            stringArray2[vRa.d] = pta.G;
            return dha_2.getListOfStringsMatchingLastWord((String[])b2, (String[])stringArray2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uSa.E;
    }

    public dha_2() {
        dha_2 a2;
    }
}

