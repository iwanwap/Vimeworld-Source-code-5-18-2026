/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ABa
 *  Lz
 *  Mha
 *  OCa
 *  Qc
 *  Zta
 *  Zua
 *  aSa
 *  bFa
 *  eHa
 *  oGa
 *  qta
 *  vRa
 */
import java.util.List;

public final class pia_3
extends Mha {
    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public pia_3() {
        pia_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        double d2;
        void b2;
        void a2;
        pia_3 pia_32 = this;
        if (((void)a2).length < uqa.g) {
            throw new eHa(pia_32.getCommandUsage((u)b2), new Object[uSa.E]);
        }
        int c2 = uSa.E;
        void var4_5 = a2[c2];
        void v0 = b2;
        void v1 = a2;
        bFa bFa2 = pia_3.getPlayer((u)v0, (String)v1[++c2]);
        Lz lz2 = v0.J();
        double d3 = lz2.A;
        if (((void)v1).length > ++c2) {
            double d4 = pia_3.parseDouble((double)d3, (String)a2[c2], vRa.d != 0);
            ++c2;
            d3 = d4;
        }
        double d5 = lz2.j;
        if (((void)a2).length > c2) {
            void v3 = a2[c2];
            ++c2;
            d5 = pia_3.parseDouble((double)d5, (String)v3, (int)uSa.E, (int)uSa.E, uSa.E != 0);
        }
        double d6 = lz2.J;
        if (((void)a2).length > c2) {
            double d7 = pia_3.parseDouble((double)d6, (String)a2[c2], vRa.d != 0);
            ++c2;
            d6 = d7;
        }
        double d8 = oua.i;
        if (((void)a2).length > c2) {
            void v5 = a2[c2];
            ++c2;
            d8 = pia_3.parseDouble((String)v5, (double)aSa.V, (double)qta.Ka);
        }
        double d9 = oua.i;
        if (((void)a2).length > c2) {
            void v6 = a2[c2];
            ++c2;
            d9 = pia_3.parseDouble((String)v6, (double)aSa.V, (double)KPa.y);
        }
        double d10 = aSa.V;
        if (((void)a2).length > c2) {
            d10 = pia_3.parseDouble((String)a2[c2], (double)aSa.V, (double)oua.i);
        }
        double d11 = d2 = d8 > oua.i ? d8 * Zta.ba : Zta.ba;
        if (bFa2.J(d3, d5, d6) > d2) {
            double d12;
            if (d10 <= aSa.V) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = bFa2.J();
                throw new oGa(Upa.s, objectArray);
            }
            d2 = d3 - bFa2.la;
            double d13 = d5 - bFa2.Z;
            double d14 = d6 - bFa2.A;
            double d15 = d2;
            double d16 = d13;
            double d17 = d14;
            double d18 = Math.sqrt(d15 * d15 + d16 * d16 + d17 * d17);
            if (d12 > aSa.V) {
                bFa bFa3 = bFa2;
                d3 = bFa3.la + d2 / d18 * KPa.y;
                d5 = bFa3.Z + d13 / d18 * KPa.y;
                d6 = bFa3.A + d14 / d18 * KPa.y;
            }
            d8 = d10;
        }
        bFa2.I.J((KC)new ABa((String)var4_5, d3, d5, d6, (float)d8, (float)d9));
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = var4_5;
        objectArray[vRa.d] = bFa2.J();
        pia_3.notifyOperators((u)b2, (Qc)pia_32, (String)Zua.S, (Object[])objectArray);
    }

    public String getCommandName() {
        return opa.y;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        pia_3 a2 = this;
        return NSa.Ja;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == uqa.g) {
            return pia_3.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        if (d2.length > uqa.g && d2.length <= tTa.h) {
            void a2;
            return pia_3.func_175771_a((String[])d2, (int)uqa.g, (XF)a2);
        }
        return null;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        pia_3 a2 = this;
        if (c2 == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

