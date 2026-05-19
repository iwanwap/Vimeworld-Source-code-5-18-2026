/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Lra
 *  Mha
 *  NOa
 *  OCa
 *  Qc
 *  Rha
 *  Usa
 *  aQa
 *  aaa
 *  asa
 *  eHa
 *  ica
 *  kpa
 *  oGa
 *  uY
 *  vRa
 *  via
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public final class lia_2
extends Mha {
    public String getCommandName() {
        return Eqa.K;
    }

    public String[] func_175776_d() {
        return OCa.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public boolean isUsernameIndex(String[] stringArray, int n2) {
        void a2;
        String[] c2 = stringArray;
        String[] b2 = this;
        if (c2.length > 0 && c2[uSa.E].equals(ERa.U) && a2 == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public lia_2() {
        lia_2 a2;
    }

    public List<String> func_175777_e() {
        lia_2 lia_22 = this;
        Object a2 = OCa.J().J(uSa.E).J().d();
        ArrayList<String> arrayList = Lists.newArrayList();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            ica ica2 = (ica)a2.next();
            if (ica2.J().J()) continue;
            arrayList.add(ica2.J());
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = ERa.U;
            stringArray2[vRa.d] = Lra.M;
            return lia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == uqa.g && d2[uSa.E].equals(ERa.U)) {
            return lia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.func_175776_d());
        }
        if (d2.length >= uqa.g && d2.length <= AQa.P && d2[uSa.E].equals(Lra.M)) {
            void a2;
            return lia_2.func_175771_a((String[])d2, (int)vRa.d, (XF)a2);
        }
        if (!(d2.length == yRa.d && d2[uSa.E].equals(ERa.U) || d2.length == tTa.h && d2[uSa.E].equals(Lra.M))) {
            if (!(d2.length == AQa.P && d2[uSa.E].equals(ERa.U) || d2.length == uua.p && d2[uSa.E].equals(Lra.M))) {
                if (!(d2.length == uua.p && d2[uSa.E].equals(ERa.U) || d2.length == Yqa.i && d2[uSa.E].equals(Lra.M))) {
                    return null;
                }
                return lia_2.getListOfStringsMatchingLastWord((String[])d2, b2.func_175777_e());
            }
            return lia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])Rha.getTypeNames());
        }
        String[] stringArray3 = new String[uqa.g];
        stringArray3[uSa.E] = pta.G;
        stringArray3[vRa.d] = cPa.i;
        return lia_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray3);
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        lia_2 a2 = this;
        return asa.p;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        int n2;
        via via2;
        uY uY2;
        Object c2;
        void b2;
        void v1;
        int n3;
        int n4;
        int n5;
        void a2;
        lia_2 lia_22 = this;
        if (((void)a2).length < vRa.d) {
            throw new eHa(asa.p, new Object[uSa.E]);
        }
        if (a2[uSa.E].equals(ERa.U)) {
            n4 = n5 = uSa.E;
        } else {
            if (!a2[uSa.E].equals(Lra.M)) {
                throw new eHa(asa.p, new Object[uSa.E]);
            }
            n4 = n5 = vRa.d;
        }
        if (n4 != 0) {
            if (((void)a2).length < tTa.h) {
                throw new eHa(UTa.W, new Object[uSa.E]);
            }
            n3 = AQa.P;
            v1 = a2;
        } else {
            if (((void)a2).length < yRa.d) {
                throw new eHa(NOa.K, new Object[uSa.E]);
            }
            n3 = uqa.g;
            v1 = a2;
        }
        void var5_6 = v1[n3];
        ++n3;
        if (pta.G.equals(var5_6)) {
            if (((void)a2).length < n3 + yRa.d) {
                if (n3 == tTa.h) {
                    throw new eHa(Jra.e, new Object[uSa.E]);
                }
                throw new eHa(yta.I, new Object[uSa.E]);
            }
        } else {
            if (!cPa.i.equals(var5_6)) {
                throw new eHa(asa.p, new Object[uSa.E]);
            }
            if (((void)a2).length < n3 + vRa.d) {
                if (n3 == tTa.h) {
                    throw new eHa(sOa.O, new Object[uSa.E]);
                }
                throw new eHa(aQa.ga, new Object[uSa.E]);
            }
        }
        Rha rha2 = Rha.getTypeByName((String)a2[n3]);
        ++n3;
        Rha rha3 = rha2;
        if (rha2 == null) {
            throw new oGa(Jsa.T, new Object[uSa.E]);
        }
        Gg gg2 = b2.J();
        if (n5 != 0) {
            c2 = lia_2.parseBlockPos((u)b2, (String[])a2, (int)vRa.d, uSa.E != 0);
            uY2 = gg2.J((XF)((Object)c2));
            if (uY2 == null) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = c2.getX();
                objectArray[vRa.d] = c2.getY();
                objectArray[uqa.g] = c2.getZ();
                throw new oGa(Usa.F, objectArray);
            }
            uY uY3 = uY2;
            if (uY2 instanceof kz) {
                via2 = ((kz)uY3).J();
            } else {
                if (!(uY3 instanceof aaa)) {
                    Object[] objectArray = new Object[yRa.d];
                    objectArray[uSa.E] = c2.getX();
                    objectArray[vRa.d] = c2.getY();
                    objectArray[uqa.g] = c2.getZ();
                    throw new oGa(Usa.F, objectArray);
                }
                via2 = ((aaa)uY2).J();
            }
        } else {
            c2 = lia_2.func_175768_b((u)b2, (String)a2[vRa.d]);
            via2 = c2.J();
        }
        if (pta.G.equals(var5_6)) {
            void v6 = a2;
            c2 = v6[n3];
            uY2 = v6[++n3];
            if (((String)c2).length() == 0 || uY2.length() == 0) {
                throw new oGa(Jsa.T, new Object[uSa.E]);
            }
            via.J((via)via2, (Rha)rha3, (String)c2, (String)uY2);
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = rha3.getTypeName();
            objectArray[vRa.d] = uY2;
            objectArray[uqa.g] = c2;
            lia_2.notifyOperators((u)b2, (Qc)lia_22, (String)opa.C, (Object[])objectArray);
            n2 = n5;
        } else {
            if (cPa.i.equals(var5_6)) {
                via.J((via)via2, (Rha)rha3, (String)null, (String)null);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = rha3.getTypeName();
                lia_2.notifyOperators((u)b2, (Qc)lia_22, (String)kpa.h, (Object[])objectArray);
            }
            n2 = n5;
        }
        if (n2 != 0) {
            c2 = lia_2.parseBlockPos((u)b2, (String[])a2, (int)vRa.d, uSa.E != 0);
            uY2 = gg2.J((XF)((Object)c2));
            uY2.f();
        }
    }
}

