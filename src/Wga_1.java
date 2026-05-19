/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ica
 *  Mha
 *  NCa
 *  Qc
 *  Rha
 *  WIa
 *  Waa
 *  Ypa
 *  cQa
 *  eHa
 *  oGa
 *  pua
 *  rba
 *  uY
 *  vRa
 *  yca
 */
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class Wga_1
extends Mha {
    public Wga_1() {
        Wga_1 a2;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandName() {
        return fta.la;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        Wga_1 a2 = this;
        return wta.B;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        Gg gg2;
        Object object;
        Gg gg3;
        void b2;
        uY a2;
        Wga_1 wga_1 = this;
        if (((void)a2).length < AQa.P) {
            throw new eHa(wta.B, new Object[uSa.E]);
        }
        b2.J(Rha.AFFECTED_BLOCKS, uSa.E);
        Object c2 = Wga_1.parseBlockPos((u)b2, (String[])a2, (int)uSa.E, uSa.E != 0);
        Block block = Block.J((String)a2[yRa.d]);
        if (block == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2[yRa.d];
            throw new WIa(IPa.d, objectArray);
        }
        int n2 = pua.o;
        if (((void)a2).length >= tTa.h) {
            n2 = Wga_1.parseInt((String)a2[AQa.P], (int)pua.o, (int)Ypa.A);
        }
        if (!(gg3 = b2.J()).F((XF)((Object)c2))) {
            throw new oGa(ySa.M, new Object[uSa.E]);
        }
        Waa waa2 = new Waa();
        int n3 = uSa.E;
        if (((void)a2).length >= uua.p && block.a()) {
            object = Wga_1.getChatComponentFromNthArg((u)b2, (String[])a2, (int)tTa.h).f();
            try {
                waa2 = Ica.J((String)object);
                n3 = vRa.d;
                gg2 = gg3;
            }
            catch (yca yca2) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = yca2.getMessage();
                throw new oGa(cQa.F, objectArray);
            }
        } else {
            gg2 = gg3;
        }
        object = gg2.J((XF)((Object)c2));
        Block block2 = object.J();
        if (block2 != block) {
            Object[] objectArray = new Object[tTa.h];
            objectArray[uSa.E] = c2.getX();
            objectArray[vRa.d] = c2.getY();
            objectArray[uqa.g] = c2.getZ();
            objectArray[yRa.d] = block2.f();
            objectArray[AQa.P] = block.f();
            throw new oGa(zta.s, objectArray);
        }
        if (n2 > pua.o && (a2 = object.J().f((IBlockState)object)) != n2) {
            Object[] objectArray = new Object[tTa.h];
            objectArray[uSa.E] = c2.getX();
            objectArray[vRa.d] = c2.getY();
            objectArray[uqa.g] = c2.getZ();
            objectArray[yRa.d] = a2;
            objectArray[AQa.P] = n2;
            throw new oGa(ZSa.x, objectArray);
        }
        if (n3 != 0) {
            a2 = gg3.J((XF)((Object)c2));
            if (a2 == null) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = c2.getX();
                objectArray[vRa.d] = c2.getY();
                objectArray[uqa.g] = c2.getZ();
                throw new oGa(xTa.s, objectArray);
            }
            Block block3 = block = new Waa();
            a2.J((Waa)block3);
            if (!rba.J((NCa)waa2, (NCa)block3, vRa.d != 0)) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = c2.getX();
                objectArray[vRa.d] = c2.getY();
                objectArray[uqa.g] = c2.getZ();
                throw new oGa(iSa.A, objectArray);
            }
        }
        b2.J(Rha.AFFECTED_BLOCKS, vRa.d);
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = c2.getX();
        objectArray[vRa.d] = c2.getY();
        objectArray[uqa.g] = c2.getZ();
        Wga_1.notifyOperators((u)b2, (Qc)wga_1, (String)rpa.ca, (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            void a2;
            return Wga_1.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        if (d2.length == AQa.P) {
            return Wga_1.getListOfStringsMatchingLastWord((String[])d2, (Collection)Block.blockRegistry.J());
        }
        return null;
    }
}

