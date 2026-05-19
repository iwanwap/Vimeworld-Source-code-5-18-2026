/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Mha
 *  OCa
 *  Qc
 *  Wsa
 *  ZOa
 *  aGa
 *  ay
 *  bFa
 *  eHa
 *  ld
 *  oGa
 *  raa
 *  vRa
 *  vpa
 */
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class uGa_2
extends Mha {
    public static final Pattern field_147211_a = Pattern.compile(yta.X);

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        uGa_2 a2 = this;
        return Wsa.y;
    }

    /*
     * WARNING - void declaration
     */
    public void func_147210_a(u u2, String string, String string2) {
        Iterator iterator;
        void c2;
        void b2;
        Object d2 = string2;
        uGa_2 a2 = this;
        d2 = new raa((String)b2, (Date)null, c2.J(), (Date)null, (String)d2);
        OCa.J().J().J().J((ay)d2);
        d2 = OCa.J().J().J((String)b2);
        Object[] objectArray = new String[d2.size()];
        int n2 = uSa.E;
        Iterator iterator2 = iterator = d2.iterator();
        while (iterator2.hasNext()) {
            bFa bFa2 = (bFa)iterator.next();
            iterator2 = iterator;
            int n3 = n2++;
            bFa2.I.f(Zra.V);
            objectArray[n3] = bFa2.J();
        }
        if (d2.isEmpty()) {
            Object[] objectArray2 = new Object[vRa.d];
            objectArray2[uSa.E] = b2;
            uGa_2.notifyOperators((u)c2, (Qc)a2, (String)BRa.j, (Object[])objectArray2);
            return;
        }
        Object[] objectArray3 = new Object[uqa.g];
        objectArray3[uSa.E] = b2;
        objectArray3[vRa.d] = uGa_2.joinNiceString((Object[])objectArray);
        uGa_2.notifyOperators((u)c2, (Qc)a2, (String)nOa.Q, (Object[])objectArray3);
    }

    public uGa_2() {
        uGa_2 a2;
    }

    public String getCommandName() {
        return ZOa.a;
    }

    public boolean canCommandSenderUseCommand(u u2) {
        Object b2 = u2;
        uGa_2 a2 = this;
        if (OCa.J().J().J().J() && super.canCommandSenderUseCommand((u)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        bFa c2 = stringArray;
        bFa a2 = this;
        if (((String[])c2).length >= vRa.d && c2[uSa.E].length() > vRa.d) {
            void b2;
            ld ld2;
            ld ld3 = ld2 = ((String[])c2).length >= uqa.g ? uGa_2.getChatComponentFromNthArg((u)b2, (String[])c2, (int)vRa.d) : null;
            if (field_147211_a.matcher(c2[uSa.E]).matches()) {
                a2.func_147210_a((u)b2, c2[uSa.E], ld2 == null ? null : ld2.f());
                return;
            }
            c2 = OCa.J().J().J(c2[uSa.E]);
            if (c2 == null) {
                throw new aGa(vpa.n, new Object[uSa.E]);
            }
            a2.func_147210_a((u)b2, c2.l(), ld2 == null ? null : ld2.f());
            return;
        }
        throw new eHa(Wsa.y, new Object[uSa.E]);
    }

    public int getRequiredPermissionLevel() {
        return yRa.d;
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return uGa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        return null;
    }
}

