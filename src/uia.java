/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JSa
 *  MD
 *  MQa
 *  Mha
 *  NTa
 *  QFa
 *  Qc
 *  Rha
 *  WSa
 *  Waa
 *  Xv
 *  eHa
 *  hra
 *  oGa
 *  uOa
 *  uY
 *  vQa
 *  vRa
 */
import java.util.List;
import net.minecraft.block.state.IBlockState;

public final class uia
extends Mha {
    public String getCommandUsage(u u2) {
        Object b2 = u2;
        uia a2 = this;
        return Ora.w;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        XF a2;
        uia uia2 = this;
        if (((void)a2).length < WOa.fa) {
            throw new eHa(Ora.w, new Object[uSa.E]);
        }
        void v0 = b2;
        void v1 = b2;
        v1.J(Rha.AFFECTED_BLOCKS, uSa.E);
        Object c2 = uia.parseBlockPos((u)v0, (String[])a2, (int)uSa.E, uSa.E != 0);
        XF xF = uia.parseBlockPos((u)v1, (String[])a2, (int)yRa.d, uSa.E != 0);
        XF xF2 = uia.parseBlockPos((u)v0, (String[])a2, (int)uua.p, uSa.E != 0);
        c2 = new Xv((MD)c2, (MD)xF);
        XF xF3 = xF2;
        xF = new Xv((MD)xF3, (MD)xF3.add(c2.J()));
        int n2 = c2.J() * c2.f() * c2.l();
        if (n2 > MQa.Da) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = n2;
            objectArray[vRa.d] = MQa.Da;
            throw new oGa(kTa.l, objectArray);
        }
        if (((Xv)c2).minY >= 0 && ((Xv)c2).maxY < hra.Ja && ((Xv)xF).minY >= 0 && ((Xv)xF).maxY < hra.Ja) {
            Gg gg2 = b2.J();
            if (gg2.J((Xv)c2) && gg2.J((Xv)xF)) {
                int n3;
                int n4 = uSa.E;
                if (((void)a2).length > WOa.fa && a2[WOa.fa].equals(sra.a)) {
                    n4 = vRa.d;
                }
                n2 = uSa.E;
                a2 = new XF(((Xv)xF).minX - ((Xv)c2).minX, ((Xv)xF).minY - ((Xv)c2).minY, ((Xv)xF).minZ - ((Xv)c2).minZ);
                xF = new zz();
                zz zz2 = new zz();
                int n5 = n3 = ((Xv)c2).minZ;
                while (n5 <= ((Xv)c2).maxZ) {
                    int n6 = ((Xv)c2).minY;
                    while (n6 <= ((Xv)c2).maxY) {
                        int n7;
                        int n8 = ((Xv)c2).minX;
                        while (n8 <= ((Xv)c2).maxX) {
                            int n9;
                            ((zz)xF).func_181079_c(n9, n7, n3);
                            zz2.func_181079_c(n9 + a2.getX(), n7 + a2.getY(), n3 + a2.getZ());
                            int n10 = uSa.E;
                            IBlockState iBlockState = gg2.J(xF);
                            if (n4 == 0 || iBlockState.J() != QFa.HF) {
                                if (iBlockState == gg2.J((XF)zz2)) {
                                    Gg gg3 = gg2;
                                    iBlockState = gg3.J(xF);
                                    uY uY2 = gg3.J((XF)zz2);
                                    if (iBlockState != null && uY2 != null) {
                                        Waa waa2;
                                        Waa waa3 = waa2 = new Waa();
                                        iBlockState.J(waa3);
                                        Waa waa4 = waa2;
                                        waa4.J(rRa.X);
                                        waa4.J(uOa.Ja);
                                        waa3.J(oua.v);
                                        Waa waa5 = waa2 = new Waa();
                                        uY2.J(waa5);
                                        Waa waa6 = waa2;
                                        waa6.J(rRa.X);
                                        waa6.J(uOa.Ja);
                                        waa5.J(oua.v);
                                        if (!waa3.equals((Object)waa5)) {
                                            n10 = vRa.d;
                                        }
                                    } else if (iBlockState != null) {
                                        n10 = vRa.d;
                                    }
                                } else {
                                    n10 = vRa.d;
                                }
                                ++n2;
                                if (n10 != 0) {
                                    throw new oGa(Tqa.la, new Object[uSa.E]);
                                }
                            }
                            n8 = ++n9;
                        }
                        n6 = ++n7;
                    }
                    n5 = ++n3;
                }
                b2.J(Rha.AFFECTED_BLOCKS, n2);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = n2;
                uia.notifyOperators((u)b2, (Qc)uia2, (String)WSa.c, (Object[])objectArray);
                return;
            }
            throw new oGa(Yqa.Q, new Object[uSa.E]);
        }
        throw new oGa(Yqa.Q, new Object[uSa.E]);
    }

    public String getCommandName() {
        return vQa.g;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        void a2;
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            return uia.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        if (d2.length > yRa.d && d2.length <= uua.p) {
            return uia.func_175771_a((String[])d2, (int)yRa.d, (XF)a2);
        }
        if (d2.length > uua.p && d2.length <= WOa.fa) {
            return uia.func_175771_a((String[])d2, (int)uua.p, (XF)a2);
        }
        if (d2.length == NTa.C) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = sra.a;
            stringArray2[vRa.d] = JSa.H;
            return uia.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public uia() {
        uia a2;
    }
}

