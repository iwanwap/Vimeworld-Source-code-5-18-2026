/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  CY
 *  DQa
 *  EQa
 *  Mha
 *  OCa
 *  Qc
 *  Rha
 *  XTa
 *  bFa
 *  bz
 *  cQa
 *  ld
 *  oGa
 *  vL
 *  vRa
 */
import java.util.Iterator;
import java.util.List;

public final class DIa_2
extends Mha {
    public DIa_2() {
        DIa_2 a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        DIa_2 a2 = this;
        return Bpa.N;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        String a2;
        DIa_2 dIa_2 = this;
        KX kX2 = dIa_2.getGameRules();
        Object c2 = ((void)a2).length > 0 ? a2[uSa.E] : Mqa.y;
        String string = ((void)a2).length > vRa.d ? DIa_2.buildString((String[])a2, (int)vRa.d) : Mqa.y;
        switch (((void)a2).length) {
            case 0: {
                while (false) {
                }
                b2.J((ld)new CY(DIa_2.joinNiceString((Object[])kX2.J())));
                return;
            }
            case 1: {
                if (!kX2.J((String)c2)) {
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = c2;
                    throw new oGa(hpa.v, objectArray);
                }
                a2 = kX2.J((String)c2);
                void v1 = b2;
                v1.J(new CY((String)c2).J(XTa.d).J(a2));
                v1.J(Rha.QUERY_RESULT, kX2.J((String)c2));
                return;
            }
        }
        if (kX2.J((String)c2, bz.BOOLEAN_VALUE) && !oQa.l.equals(string) && !MRa.E.equals(string)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = string;
            throw new oGa(EQa.fa, objectArray);
        }
        KX kX3 = kX2;
        Object object = c2;
        kX3.J((String)object, string);
        DIa_2.func_175773_a(kX3, (String)object);
        DIa_2.notifyOperators((u)b2, (Qc)dIa_2, (String)Npa.Ja, (Object[])new Object[uSa.E]);
    }

    public static void func_175773_a(KX kX2, String string) {
        String b22 = string;
        KX a2 = kX2;
        if (oQa.Aa.equals(b22)) {
            Iterator<bFa> iterator;
            byte b22 = (byte)(a2.f(b22) ? cQa.o : AQa.ba);
            Iterator<bFa> iterator2 = iterator = OCa.J().J().J().iterator();
            while (iterator2.hasNext()) {
                bFa bFa2 = iterator.next();
                iterator2 = iterator;
                bFa2.I.J(new tAa((vL)bFa2, b22));
            }
        }
    }

    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return DIa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])super.getGameRules().J());
        }
        if (d2.length == uqa.g && super.getGameRules().J(d2[uSa.E], bz.BOOLEAN_VALUE)) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = oQa.l;
            stringArray2[vRa.d] = MRa.E;
            return DIa_2.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return DQa.fa;
    }

    private KX getGameRules() {
        return OCa.J().J(uSa.E).J();
    }
}

