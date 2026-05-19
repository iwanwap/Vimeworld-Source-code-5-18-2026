/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mha
 *  NTa
 *  Nb
 *  OCa
 *  XTa
 *  Ypa
 *  Zua
 *  eHa
 *  iia
 *  oGa
 *  pua
 *  uRa
 *  vL
 *  vRa
 */
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class Sga
extends Mha {
    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        String string;
        void b2;
        String[] c2 = stringArray;
        String[] a2 = this;
        if (c2.length < tTa.h) {
            throw new eHa(kua.v, new Object[uSa.E]);
        }
        vL vL2 = Sga.getEntity((u)b2, (String)c2[uSa.E], vL.class);
        double d2 = Sga.parseDouble((double)vL2.la, (String)c2[vRa.d], uSa.E != 0);
        double d3 = Sga.parseDouble((double)vL2.Z, (String)c2[uqa.g], uSa.E != 0);
        double d4 = Sga.parseDouble((double)vL2.A, (String)c2[yRa.d], uSa.E != 0);
        XF xF = new XF(d2, d3, d4);
        int n2 = AQa.P;
        if (wsa.Ga.equals(c2[AQa.P]) && c2.length > NTa.C) {
            string = vL2.J();
            double d5 = Sga.parseDouble((double)d2, (String)c2[tTa.h], uSa.E != 0);
            double d6 = Sga.parseDouble((double)d3, (String)c2[uua.p], uSa.E != 0);
            double d7 = Sga.parseDouble((double)d4, (String)c2[XTa.W], uSa.E != 0);
            Block block = Sga.getBlockByText((u)b2, (String)c2[Yqa.i]);
            int n3 = Sga.parseInt((String)c2[WOa.fa], (int)pua.o, (int)Ypa.A);
            XF xF2 = new XF(d5, d6, d7);
            IBlockState iBlockState = string.J(xF2);
            if (iBlockState.J() != block || n3 >= 0 && iBlockState.J().f(iBlockState) != n3) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = wsa.Ga;
                objectArray[vRa.d] = vL2.J();
                throw new oGa(Zua.L, objectArray);
            }
            n2 = NTa.C;
        }
        string = Sga.buildString((String[])c2, (int)n2);
        iia iia2 = new iia((Sga)a2, vL2, (u)b2, xF, d2, d3, d4);
        Nb nb = OCa.J().J();
        try {
            int n4 = nb.J((u)iia2, string);
            if (n4 < vRa.d) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = string;
                throw new oGa(uRa.E, objectArray);
            }
        }
        catch (Throwable throwable) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = string;
            objectArray[vRa.d] = vL2.J();
            throw new oGa(Zua.L, objectArray);
        }
    }

    public Sga() {
        Sga a2;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        void a2;
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length == vRa.d) {
            return Sga.getListOfStringsMatchingLastWord((String[])d2, (String[])OCa.J().J());
        }
        if (d2.length > vRa.d && d2.length <= AQa.P) {
            return Sga.func_175771_a((String[])d2, (int)vRa.d, (XF)a2);
        }
        if (d2.length > tTa.h && d2.length <= Yqa.i && wsa.Ga.equals(d2[AQa.P])) {
            return Sga.func_175771_a((String[])d2, (int)tTa.h, (XF)a2);
        }
        if (d2.length == WOa.fa && wsa.Ga.equals(d2[AQa.P])) {
            return Sga.getListOfStringsMatchingLastWord((String[])d2, (Collection)Block.blockRegistry.J());
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Sga a2 = this;
        return kua.v;
    }

    public boolean isUsernameIndex(String[] stringArray, int n2) {
        int c2 = n2;
        Sga a2 = this;
        if (c2 == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getCommandName() {
        return zpa.f;
    }
}

