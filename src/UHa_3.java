/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Lz
 *  Mha
 *  NTa
 *  Qc
 *  SRa
 *  Tf
 *  UZ
 *  XTa
 *  asa
 *  eHa
 *  oGa
 *  vPa
 *  vRa
 *  zTa
 */
import java.util.List;

public final class UHa_3
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        Gg gg2;
        boolean bl2;
        void b2;
        int n2;
        Object object;
        UZ uZ2;
        int n3;
        String[] a2;
        String[] c2;
        block14: {
            int d2;
            c2 = stringArray;
            a2 = this;
            if (c2.length < Yqa.i) {
                throw new eHa(zTa.W, new Object[uSa.E]);
            }
            n3 = uSa.E;
            uZ2 = null;
            object = UZ.values();
            int n5 = ((UZ[])object).length;
            int n4 = d2 = uSa.E;
            while (n4 < n5) {
                UZ uZ3 = object[d2];
                if (uZ3.hasArguments()) {
                    if (c2[uSa.E].startsWith(uZ3.getParticleName())) {
                        n3 = vRa.d;
                        uZ2 = uZ3;
                        n2 = n3;
                        break block14;
                    }
                } else if (c2[uSa.E].equals(uZ3.getParticleName())) {
                    n3 = vRa.d;
                    uZ2 = uZ3;
                    n2 = n3;
                    break block14;
                }
                n4 = ++d2;
            }
            n2 = n3;
        }
        if (n2 == 0) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[uSa.E];
            throw new oGa(wsa.f, objectArray);
        }
        object = c2[uSa.E];
        Lz lz2 = b2.J();
        double d2 = (float)UHa_3.parseDouble((double)lz2.A, (String)c2[vRa.d], vRa.d != 0);
        double d3 = (float)UHa_3.parseDouble((double)lz2.j, (String)c2[uqa.g], vRa.d != 0);
        double d4 = (float)UHa_3.parseDouble((double)lz2.J, (String)c2[yRa.d], vRa.d != 0);
        double d5 = (float)UHa_3.parseDouble((String)c2[AQa.P]);
        double d6 = (float)UHa_3.parseDouble((String)c2[tTa.h]);
        double d7 = (float)UHa_3.parseDouble((String)c2[uua.p]);
        double d8 = (float)UHa_3.parseDouble((String)c2[XTa.W]);
        n3 = uSa.E;
        if (c2.length > Yqa.i) {
            n3 = UHa_3.parseInt((String)c2[Yqa.i], (int)uSa.E);
        }
        int bl22 = uSa.E;
        if (c2.length > WOa.fa && vPa.m.equals(c2[WOa.fa])) {
            bl2 = vRa.d;
        }
        if ((gg2 = b2.J()) instanceof Tf) {
            gg2 = (Tf)gg2;
            UZ uZ4 = uZ2;
            int[] nArray = new int[uZ4.getArgumentCount()];
            if (uZ4.hasArguments()) {
                int n5;
                String[] stringArray2 = c2[uSa.E].split(IPa.W, yRa.d);
                int n6 = n5 = vRa.d;
                while (n6 < stringArray2.length) {
                    try {
                        nArray[n5 - vRa.d] = Integer.parseInt(stringArray2[n5]);
                    }
                    catch (NumberFormatException numberFormatException) {
                        Object[] objectArray = new Object[vRa.d];
                        objectArray[uSa.E] = c2[uSa.E];
                        throw new oGa(wsa.f, objectArray);
                    }
                    n6 = ++n5;
                }
            }
            gg2.J(uZ2, bl2, d2, d3, d4, n3, d5, d6, d7, d8, nArray);
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = object;
            objectArray[vRa.d] = Math.max(n3, vRa.d);
            UHa_3.notifyOperators((u)b2, (Qc)a2, (String)asa.f, (Object[])objectArray);
        }
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return SRa.l;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return UHa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])UZ.getParticleNames());
        }
        if (d2.length > vRa.d && d2.length <= AQa.P) {
            void a2;
            return UHa_3.func_175771_a((String[])d2, (int)vRa.d, (XF)a2);
        }
        if (d2.length == NTa.C) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = AQa.t;
            stringArray2[vRa.d] = vPa.m;
            return UHa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        UHa_3 a2 = this;
        return zTa.W;
    }

    public UHa_3() {
        UHa_3 a2;
    }
}

