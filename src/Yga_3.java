/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  Ica
 *  JTa
 *  KTa
 *  Mha
 *  Pqa
 *  QFa
 *  Qc
 *  Rha
 *  Uta
 *  Waa
 *  XTa
 *  Ypa
 *  aSa
 *  cQa
 *  eHa
 *  oGa
 *  uOa
 *  uY
 *  vRa
 *  yca
 */
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class Yga_3
extends Mha {
    public String getCommandName() {
        return Vra.A;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        IBlockState iBlockState;
        uY uY2;
        String string;
        Gg gg2;
        void b2;
        uY c2 = stringArray;
        uY a2 = this;
        if (((String[])c2).length < AQa.P) {
            throw new eHa(NSa.l, new Object[uSa.E]);
        }
        void v0 = b2;
        v0.J(Rha.AFFECTED_BLOCKS, uSa.E);
        XF xF2 = Yga_3.parseBlockPos((u)v0, (String[])c2, (int)uSa.E, uSa.E != 0);
        Block block = Mha.getBlockByText((u)b2, (String)c2[yRa.d]);
        int n2 = uSa.E;
        if (((String[])c2).length >= tTa.h) {
            n2 = Yga_3.parseInt((String)c2[AQa.P], (int)uSa.E, (int)Ypa.A);
        }
        if (!(gg2 = b2.J()).F(xF2)) {
            throw new oGa(Uta.g, new Object[uSa.E]);
        }
        Waa waa2 = new Waa();
        int n3 = uSa.E;
        if (((String[])c2).length >= XTa.W && block.a()) {
            string = Yga_3.getChatComponentFromNthArg((u)b2, (String[])c2, (int)uua.p).f();
            try {
                waa2 = Ica.J((String)string);
                n3 = vRa.d;
                uY2 = c2;
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(cQa.F, objectArray);
            }
        } else {
            uY2 = c2;
        }
        if (((String[])uY2).length >= uua.p) {
            if (c2[tTa.h].equals(aSa.Ia)) {
                gg2.f(xF2, vRa.d != 0);
                if (block == QFa.HF) {
                    Yga_3.notifyOperators((u)b2, (Qc)a2, (String)KTa.p, (Object[])new Object[uSa.E]);
                    return;
                }
            } else if (c2[tTa.h].equals(Pqa.d) && !gg2.J(xF2)) {
                throw new oGa(JTa.Ka, new Object[uSa.E]);
            }
        }
        if ((string = gg2.J(xF2)) != null) {
            if (string instanceof HA) {
                ((HA)string).l();
            }
            gg2.J(xF2, QFa.HF.J(), block == QFa.HF ? uqa.g : AQa.P);
        }
        if (!gg2.J(xF2, iBlockState = block.J(n2), uqa.g)) {
            throw new oGa(JTa.Ka, new Object[uSa.E]);
        }
        if (n3 != 0 && (c2 = gg2.J(xF2)) != null) {
            Waa waa3 = waa2;
            waa3.J(rRa.X, xF2.getX());
            waa3.J(uOa.Ja, xF2.getY());
            waa3.J(oua.v, xF2.getZ());
            c2.f(waa3);
        }
        gg2.d(xF2, iBlockState.J());
        void v4 = b2;
        v4.J(Rha.AFFECTED_BLOCKS, vRa.d);
        Yga_3.notifyOperators((u)v4, (Qc)a2, (String)KTa.p, (Object[])new Object[uSa.E]);
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            void a2;
            return Yga_3.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        if (d2.length == AQa.P) {
            return Yga_3.getListOfStringsMatchingLastWord((String[])d2, (Collection)Block.blockRegistry.J());
        }
        if (d2.length == uua.p) {
            String[] stringArray2 = new String[yRa.d];
            stringArray2[uSa.E] = sOa.G;
            stringArray2[vRa.d] = aSa.Ia;
            stringArray2[uqa.g] = Pqa.d;
            return Yga_3.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Yga_3 a2 = this;
        return NSa.l;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public Yga_3() {
        Yga_3 a2;
    }
}

