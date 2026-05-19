/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  OCa
 *  Qc
 *  Zua
 *  aQa
 *  bRa
 *  eHa
 *  oGa
 *  vRa
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.List;

public final class hHa_1
extends Mha {
    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length == vRa.d && c2[uSa.E].length() > 0) {
            void b2;
            OCa oCa2 = OCa.J();
            GameProfile gameProfile = oCa2.J().J(c2[uSa.E]);
            if (gameProfile == null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = c2[uSa.E];
                throw new oGa(aQa.fa, objectArray);
            }
            oCa2.J().C(gameProfile);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2[uSa.E];
            hHa_1.notifyOperators((u)b2, (Qc)a2, (String)xqa.Y, (Object[])objectArray);
            return;
        }
        throw new eHa(Zua.ca, new Object[uSa.E]);
    }

    public String getCommandName() {
        return bRa.p;
    }

    public hHa_1() {
        hHa_1 a2;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        Object d2 = stringArray;
        String[] b2 = this;
        if (((String[])d2).length == vRa.d) {
            int n2;
            String c2 = d2[((String[])d2).length - vRa.d];
            d2 = Lists.newArrayList();
            GameProfile[] a2 = OCa.J().J();
            int n3 = a2.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                GameProfile gameProfile = a2[n2];
                if (!OCa.J().J().f(gameProfile) && hHa_1.doesStringStartWith((String)c2, (String)gameProfile.getName())) {
                    d2.add(gameProfile.getName());
                }
                n4 = ++n2;
            }
            return d2;
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        hHa_1 a2 = this;
        return Zua.ca;
    }
}

