/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  ERa
 *  Gg
 *  HA
 *  Ica
 *  Lra
 *  Mda
 *  Mha
 *  OCa
 *  QFa
 *  Qc
 *  Rha
 *  Tpa
 *  WIa
 *  Wsa
 *  YSa
 *  Ypa
 *  Yra
 *  ZOa
 *  bqa
 *  bua
 *  eAa
 *  eHa
 *  hra
 *  jRa
 *  oGa
 *  pPa
 *  pQa
 *  uQa
 *  uY
 *  vL
 *  vRa
 *  vpa
 *  yca
 *  ysa
 *  zTa
 *  zsa
 */
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;

public final class Wia_1
extends Mha {
    private static final Map<String, Integer> SHORTCUTS;

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        eAa eAa2;
        int n2;
        int n3;
        int n4;
        eAa eAa3;
        void b2;
        String[] stringArray2;
        int n5;
        int n6;
        int n7;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length < vRa.d) {
            throw new eHa(gua.q, new Object[uSa.E]);
        }
        if (c2[uSa.E].equals(ERa.U)) {
            n6 = n7 = uSa.E;
        } else {
            if (!c2[uSa.E].equals(Lra.M)) {
                throw new eHa(gua.q, new Object[uSa.E]);
            }
            n6 = n7 = vRa.d;
        }
        if (n6 != 0) {
            if (c2.length < uua.p) {
                throw new eHa(YSa.ha, new Object[uSa.E]);
            }
            n5 = AQa.P;
            stringArray2 = a2;
        } else {
            if (c2.length < AQa.P) {
                throw new eHa(vqa.O, new Object[uSa.E]);
            }
            n5 = uqa.g;
            stringArray2 = a2;
        }
        int n8 = super.getSlotForShortcut(c2[n5]);
        ++n5;
        try {
            eAa3 = Wia_1.getItemByText((u)b2, (String)c2[n5]);
        }
        catch (WIa wIa) {
            if (Block.J(c2[n5]) != QFa.HF) {
                throw wIa;
            }
            eAa3 = null;
        }
        if (c2.length > ++n5) {
            String string = c2[n5];
            ++n5;
            n4 = Wia_1.parseInt((String)string, (int)vRa.d, (int)ysa.s);
        } else {
            n4 = n3 = vRa.d;
        }
        if (c2.length > n5) {
            n2 = Wia_1.parseInt((String)c2[n5]);
            ++n5;
        } else {
            n2 = uSa.E;
        }
        int n9 = n2;
        eAa3 = new Mda(eAa3, n3, n9);
        if (c2.length > n5) {
            String string = Wia_1.getChatComponentFromNthArg((u)b2, (String[])c2, (int)n5).f();
            try {
                eAa3.J(Ica.J((String)string));
                eAa2 = eAa3;
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(Yra.a, objectArray);
            }
        } else {
            eAa2 = eAa3;
        }
        if (eAa2.J() == null) {
            eAa3 = null;
        }
        if (n7 != 0) {
            void v7 = b2;
            v7.J(Rha.AFFECTED_ITEMS, uSa.E);
            XF xF2 = Wia_1.parseBlockPos((u)v7, (String[])c2, (int)vRa.d, uSa.E != 0);
            Gg gg2 = v7.J();
            uY uY2 = gg2.J(xF2);
            if (uY2 == null || !(uY2 instanceof HA)) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = xF2.getX();
                objectArray[vRa.d] = xF2.getY();
                objectArray[uqa.g] = xF2.getZ();
                throw new oGa(Zra.ja, objectArray);
            }
            uY2 = (HA)uY2;
            if (n8 >= 0 && n8 < uY2.f()) {
                uY2.J(n8, (Mda)eAa3);
            }
        } else {
            void v9 = b2;
            vL vL2 = Wia_1.func_175768_b((u)v9, (String)c2[vRa.d]);
            v9.J(Rha.AFFECTED_ITEMS, uSa.E);
            if (vL2 instanceof Sx) {
                ((Sx)vL2).x.J();
            }
            if (!vL2.f(n8, (Mda)eAa3)) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = n8;
                objectArray[vRa.d] = n3;
                objectArray[uqa.g] = eAa3 == null ? pQa.l : eAa3.J();
                throw new oGa(Jqa.X, objectArray);
            }
            if (vL2 instanceof Sx) {
                ((Sx)vL2).x.J();
            }
        }
        b2.J(Rha.AFFECTED_ITEMS, n3);
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = n8;
        objectArray[vRa.d] = n3;
        objectArray[uqa.g] = eAa3 == null ? pQa.l : eAa3.J();
        Wia_1.notifyOperators((u)b2, (Qc)a2, (String)vsa.C, (Object[])objectArray);
    }

    static {
        int n2;
        SHORTCUTS = Maps.newHashMap();
        int n3 = n2 = uSa.E;
        while (n3 < GPa.C) {
            SHORTCUTS.put(new StringBuilder().insert(3 >> 2, nua.m).append(n2).toString(), n2++);
            n3 = n2;
        }
        int n4 = n2 = uSa.E;
        while (n4 < WOa.fa) {
            SHORTCUTS.put(new StringBuilder().insert(3 & 4, DPa.h).append(n2).toString(), n2++);
            n4 = n2;
        }
        int n5 = n2 = uSa.E;
        while (n5 < Lra.e) {
            SHORTCUTS.put(new StringBuilder().insert(5 >> 3, fta.N).append(n2).toString(), WOa.fa + n2++);
            n5 = n2;
        }
        int n6 = n2 = uSa.E;
        while (n6 < Lra.e) {
            SHORTCUTS.put(new StringBuilder().insert(2 & 5, bqa.T).append(n2).toString(), ZOa.x + n2++);
            n6 = n2;
        }
        int n7 = n2 = uSa.E;
        while (n7 < Yqa.i) {
            SHORTCUTS.put(new StringBuilder().insert(5 >> 3, zta.p).append(n2).toString(), vpa.Ja + n2++);
            n7 = n2;
        }
        int n8 = n2 = uSa.E;
        while (n8 < Ypa.A) {
            SHORTCUTS.put(new StringBuilder().insert(3 >> 2, Wsa.Z).append(n2).toString(), dsa.f + n2++);
            n8 = n2;
        }
        SHORTCUTS.put(Tpa.T, zOa.v);
        SHORTCUTS.put(POa.i, Bsa.E);
        SHORTCUTS.put(Qra.K, jRa.v);
        SHORTCUTS.put(Lsa.q, zTa.C);
        SHORTCUTS.put(Pua.Z, ySa.T);
        SHORTCUTS.put(uQa.s, hra.i);
        SHORTCUTS.put(xSa.J, GPa.T);
        SHORTCUTS.put(bua.G, zsa.S);
    }

    public Wia_1() {
        Wia_1 a2;
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
            return Wia_1.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == uqa.g && d2[uSa.E].equals(ERa.U)) {
            return Wia_1.getListOfStringsMatchingLastWord((String[])d2, (String[])b2.getUsernames());
        }
        if (d2.length >= uqa.g && d2.length <= AQa.P && d2[uSa.E].equals(Lra.M)) {
            void a2;
            return Wia_1.func_175771_a((String[])d2, (int)vRa.d, (XF)a2);
        }
        if (!(d2.length == yRa.d && d2[uSa.E].equals(ERa.U) || d2.length == tTa.h && d2[uSa.E].equals(Lra.M))) {
            if (!(d2.length == AQa.P && d2[uSa.E].equals(ERa.U) || d2.length == uua.p && d2[uSa.E].equals(Lra.M))) {
                return null;
            }
            return Wia_1.getListOfStringsMatchingLastWord((String[])d2, (Collection)eAa.C.J());
        }
        return Wia_1.getListOfStringsMatchingLastWord((String[])d2, SHORTCUTS.keySet());
    }

    public String[] getUsernames() {
        return OCa.J().J();
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Wia_1 a2 = this;
        return gua.q;
    }

    private int getSlotForShortcut(String string) throws oGa {
        Object b2 = string;
        Wia_1 a2 = this;
        if (!SHORTCUTS.containsKey(b2)) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            throw new oGa(pPa.t, objectArray);
        }
        return SHORTCUTS.get(b2);
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

    public String getCommandName() {
        return Wqa.la;
    }
}

