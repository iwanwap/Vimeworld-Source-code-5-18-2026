/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  JPa
 *  KTa
 *  Mha
 *  OCa
 *  Qc
 *  Rua
 *  aSa
 *  bRa
 *  eHa
 *  fsa
 *  hTa
 *  hqa
 *  ld
 *  oGa
 *  pua
 *  vRa
 *  yQa
 */
import com.mojang.authlib.GameProfile;
import java.util.List;

public final class HIa_2
extends Mha {
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            String[] stringArray2 = new String[uua.p];
            stringArray2[uSa.E] = Psa.g;
            stringArray2[vRa.d] = kra.Ea;
            stringArray2[uqa.g] = Wqa.Y;
            stringArray2[yRa.d] = Qra.U;
            stringArray2[AQa.P] = aSa.c;
            stringArray2[tTa.h] = hTa.R;
            return HIa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == uqa.g) {
            if (d2[uSa.E].equals(aSa.c)) {
                return HIa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J().C());
            }
            if (d2[uSa.E].equals(Qra.U)) {
                return HIa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J().J());
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length < vRa.d) {
            throw new eHa(yQa.i, new Object[uSa.E]);
        }
        OCa oCa2 = OCa.J();
        if (c2[uSa.E].equals(Psa.g)) {
            oCa2.J().f(vRa.d != 0);
            HIa_2.notifyOperators((u)b2, (Qc)a2, (String)bRa.Ja, (Object[])new Object[uSa.E]);
            return;
        }
        if (c2[uSa.E].equals(kra.Ea)) {
            oCa2.J().f(uSa.E != 0);
            HIa_2.notifyOperators((u)b2, (Qc)a2, (String)pua.m, (Object[])new Object[uSa.E]);
            return;
        }
        if (c2[uSa.E].equals(Wqa.Y)) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = oCa2.J().C().length;
            objectArray[vRa.d] = oCa2.J().f().length;
            b2.J((ld)new CZ(KTa.B, objectArray));
            Object[] objectArray2 = oCa2.J().C();
            b2.J((ld)new CY(HIa_2.joinNiceString((Object[])objectArray2)));
            return;
        }
        if (c2[uSa.E].equals(Qra.U)) {
            if (c2.length < uqa.g) {
                throw new eHa(gsa.y, new Object[uSa.E]);
            }
            GameProfile gameProfile = oCa2.J().J(c2[vRa.d]);
            if (gameProfile == null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[vRa.d];
                throw new oGa(hqa.a, objectArray);
            }
            oCa2.J().J(gameProfile);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[vRa.d];
            HIa_2.notifyOperators((u)b2, (Qc)a2, (String)JPa.Ja, (Object[])objectArray);
            return;
        }
        if (c2[uSa.E].equals(aSa.c)) {
            if (c2.length < uqa.g) {
                throw new eHa(Lsa.v, new Object[uSa.E]);
            }
            GameProfile gameProfile = oCa2.J().J().J(c2[vRa.d]);
            if (gameProfile == null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[vRa.d];
                throw new oGa(nua.fa, objectArray);
            }
            oCa2.J().f(gameProfile);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[vRa.d];
            HIa_2.notifyOperators((u)b2, (Qc)a2, (String)SPa.Da, (Object[])objectArray);
            return;
        }
        if (c2[uSa.E].equals(hTa.R)) {
            oCa2.J().J();
            HIa_2.notifyOperators((u)b2, (Qc)a2, (String)Rua.x, (Object[])new Object[uSa.E]);
        }
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    public String getCommandName() {
        return fsa.T;
    }

    public HIa_2() {
        HIa_2 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        HIa_2 a2 = this;
        return yQa.i;
    }
}

