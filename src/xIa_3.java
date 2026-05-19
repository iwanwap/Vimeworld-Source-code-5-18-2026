/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Gl
 *  Hda
 *  Mha
 *  OCa
 *  Qc
 *  Qsa
 *  WIa
 *  bpa
 *  bqa
 *  cra
 *  eHa
 *  kba
 *  oGa
 *  pQa
 *  uRa
 *  vRa
 *  yQa
 */
import java.util.Collection;
import java.util.List;

public final class xIa_3
extends Mha {
    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        xIa_3 a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getCommandName() {
        return uRa.H;
    }

    public xIa_3() {
        xIa_3 a2;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return xIa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.getAllUsernames());
        }
        if (d2.length == uqa.g) {
            return xIa_3.getListOfStringsMatchingLastWord((String[])d2, (Collection)Hda.J());
        }
        if (d2.length == tTa.h) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = oQa.l;
            stringArray2[vRa.d] = MRa.E;
            return xIa_3.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        xIa_3 a2 = this;
        return cra.o;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] kba2) throws oGa {
        int n2;
        void b2;
        xIa_3 c2 = kba2;
        xIa_3 a2 = this;
        if (((xIa_3)c2).length < uqa.g) {
            throw new eHa(cra.o, new Object[uSa.E]);
        }
        Gl gl2 = (Gl)xIa_3.getEntity((u)b2, (String)((Object)c2[uSa.E]), Gl.class);
        if (((String)((Object)c2[vRa.d])).equals(cPa.i)) {
            if (gl2.J().isEmpty()) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = gl2.J();
                throw new oGa(bpa.Z, objectArray);
            }
            gl2.U();
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = gl2.J();
            xIa_3.notifyOperators((u)b2, (Qc)a2, (String)Qsa.l, (Object[])objectArray);
            return;
        }
        try {
            n2 = xIa_3.parseInt((String)((Object)c2[vRa.d]), (int)vRa.d);
        }
        catch (WIa wIa2) {
            Hda hda2 = Hda.J((String)((Object)c2[vRa.d]));
            if (hda2 == null) {
                throw wIa2;
            }
            n2 = hda2.O;
        }
        int n3 = Jpa.z;
        int n4 = Fsa.d;
        int n5 = uSa.E;
        if (n2 >= 0 && n2 < Hda.A.length && Hda.A[n2] != null) {
            boolean bl;
            xIa_3 xIa_32;
            Hda hda3 = Hda.A[n2];
            if (((xIa_3)c2).length >= yRa.d) {
                int n6 = n4 = xIa_3.parseInt((String)((Object)c2[uqa.g]), (int)uSa.E, (int)IPa.o);
                if (hda3.l()) {
                    n3 = n6;
                    xIa_32 = c2;
                } else {
                    n3 = n6 * kTa.j;
                    xIa_32 = c2;
                }
            } else {
                if (hda3.l()) {
                    n3 = vRa.d;
                }
                xIa_32 = c2;
            }
            if (((xIa_3)xIa_32).length >= AQa.P) {
                n5 = xIa_3.parseInt((String)((Object)c2[yRa.d]), (int)uSa.E, (int)osa.Ja);
            }
            int bl2 = vRa.d;
            if (((xIa_3)c2).length >= tTa.h && oQa.l.equalsIgnoreCase((String)((Object)c2[AQa.P]))) {
                bl = uSa.E;
            }
            if (n4 > 0) {
                c2 = new kba(n2, n3, n5, uSa.E != 0, bl);
                gl2.J((kba)c2);
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = new CZ(c2.J(), new Object[uSa.E]);
                objectArray[vRa.d] = n2;
                objectArray[uqa.g] = n5;
                objectArray[yRa.d] = gl2.J();
                objectArray[AQa.P] = n4;
                xIa_3.notifyOperators((u)b2, (Qc)a2, (String)pQa.M, (Object[])objectArray);
                return;
            }
            if (gl2.f(n2)) {
                gl2.A(n2);
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = new CZ(hda3.J(), new Object[uSa.E]);
                objectArray[vRa.d] = gl2.J();
                xIa_3.notifyOperators((u)b2, (Qc)a2, (String)wsa.S, (Object[])objectArray);
                return;
            }
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = new CZ(hda3.J(), new Object[uSa.E]);
            objectArray[vRa.d] = gl2.J();
            throw new oGa(bqa.e, objectArray);
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = n2;
        throw new WIa(yQa.E, objectArray);
    }

    public String[] getAllUsernames() {
        return OCa.J().J();
    }
}

