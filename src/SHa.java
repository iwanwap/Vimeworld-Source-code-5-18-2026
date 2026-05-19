/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  HA
 *  Ica
 *  Mha
 *  NTa
 *  Pqa
 *  QFa
 *  Qc
 *  Rha
 *  Waa
 *  XTa
 *  Ypa
 *  aSa
 *  eHa
 *  hra
 *  oGa
 *  uOa
 *  vRa
 *  xOa
 *  yca
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;

public final class SHa
extends Mha {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void processCommand(u var1_1, String[] var2_2) throws oGa {
        block20: {
            var3_3 = this /* !! */ ;
            if (((void)a).length < XTa.W) {
                throw new eHa(WPa.N, new Object[uSa.E]);
            }
            v0 = b;
            v1 = b;
            v1.J(Rha.AFFECTED_BLOCKS, uSa.E);
            c /* !! */  = SHa.parseBlockPos((u)v0, (String[])a, (int)uSa.E, (boolean)uSa.E);
            var4_4 = SHa.parseBlockPos((u)v1, (String[])a, (int)yRa.d, (boolean)uSa.E);
            var5_6 = Mha.getBlockByText((u)v0, (String)a[uua.p]);
            var6_7 = uSa.E;
            if (((void)a).length >= Yqa.i) {
                var6_7 = SHa.parseInt((String)a[XTa.W], (int)uSa.E, (int)Ypa.A);
            }
            var7_8 = new XF(Math.min(c /* !! */ .getX(), var4_4.getX()), Math.min(c /* !! */ .getY(), var4_4.getY()), Math.min(c /* !! */ .getZ(), var4_4.getZ()));
            var4_5 = ((c /* !! */  = new XF(Math.max(c /* !! */ .getX(), var4_4.getX()), Math.max(c /* !! */ .getY(), var4_4.getY()), Math.max(c /* !! */ .getZ(), var4_4.getZ()))).getX() - var7_8.getX() + vRa.d) * (c /* !! */ .getY() - var7_8.getY() + vRa.d) * (c /* !! */ .getZ() - var7_8.getZ() + vRa.d);
            if (var4_5 > CRa.Y) {
                v2 = new Object[uqa.g];
                v2[uSa.E] = var4_5;
                v2[vRa.d] = CRa.Y;
                throw new oGa(Jqa.W, v2);
            }
            if (var7_8.getY() < 0 || c /* !! */ .getY() >= hra.Ja) break block20;
            var8_9 = b.J();
            v3 = var9_10 = var7_8.getZ();
            while (v3 < c /* !! */ .getZ() + ERa.C) {
                v4 = var7_8.getX();
                while (v4 < c /* !! */ .getX() + ERa.C) {
                    if (!var8_9.F(new XF(var10_12, c /* !! */ .getY() - var7_8.getY(), var9_10))) {
                        throw new oGa(tSa.H, new Object[uSa.E]);
                    }
                    v4 = var10_12 += 16;
                }
                v3 = var9_10 += 16;
            }
            var9_11 = new Waa();
            var10_12 = uSa.E;
            if (((void)a).length >= NTa.C && var5_6.a()) {
                var11_13 = SHa.getChatComponentFromNthArg((u)b, (String[])a, (int)WOa.fa).f();
                try {
                    var9_11 = Ica.J((String)var11_13);
                    var10_12 = vRa.d;
                }
                catch (yca var12_14) {
                    v5 = new Object[vRa.d];
                    v5[uSa.E] = var12_14.getMessage();
                    throw new oGa(oua.k, v5);
                }
            }
            var11_13 = Lists.newArrayList();
            var4_5 = uSa.E;
            v6 = var12_15 = var7_8.getZ();
            while (v6 <= c /* !! */ .getZ()) {
                v7 = var7_8.getY();
                while (v7 <= c /* !! */ .getY()) {
                    v8 = var7_8.getX();
                    while (v8 <= c /* !! */ .getX()) {
                        block26: {
                            block24: {
                                block21: {
                                    block22: {
                                        block27: {
                                            block25: {
                                                block23: {
                                                    var15_23 = new XF(var14_20, var13_17, var12_15);
                                                    if (((void)a).length < WOa.fa) break block21;
                                                    if (a[Yqa.i].equals(xSa.g) || a[Yqa.i].equals(xOa.e)) break block22;
                                                    if (!a[Yqa.i].equals(aSa.Ia)) break block23;
                                                    v9 = var8_9;
                                                    v10 = v9;
                                                    v9.f(var15_23, (boolean)vRa.d);
                                                    break block24;
                                                }
                                                if (!a[Yqa.i].equals(Pqa.d)) break block25;
                                                if (var8_9.J(var15_23)) break block21;
                                                break block26;
                                            }
                                            if (!a[Yqa.i].equals(sOa.G) || var5_6.a()) break block21;
                                            if (((void)a).length <= WOa.fa) break block27;
                                            var16_24 /* !! */  = Mha.getBlockByText((u)b, (String)a[WOa.fa]);
                                            if (var8_9.J(var15_23).J() != var16_24 /* !! */ ) break block26;
                                        }
                                        if (((void)a).length <= NTa.C) break block21;
                                        var16_25 = Mha.parseInt((String)a[NTa.C]);
                                        var17_26 = var8_9.J(var15_23);
                                        if (var17_26.J().f(var17_26) == var16_25) break block21;
                                        break block26;
                                    }
                                    if (var14_20 != var7_8.getX() && var14_20 != c /* !! */ .getX() && var13_17 != var7_8.getY() && var13_17 != c /* !! */ .getY() && var12_15 != var7_8.getZ() && var12_15 != c /* !! */ .getZ()) {
                                        if (a[Yqa.i].equals(xOa.e)) {
                                            var8_9.J(var15_23, QFa.HF.J(), uqa.g);
                                            var11_13.add(var15_23);
                                            ** GOTO lbl115
                                        } else {
                                            ** GOTO lbl95
                                        }
                                    }
                                    break block21;
lbl95:
                                    // 2 sources

                                    break block26;
                                }
                                v10 = var8_9;
                            }
                            var16_24 /* !! */  = v10.J(var15_23);
                            if (var16_24 /* !! */  != null) {
                                if (var16_24 /* !! */  instanceof HA) {
                                    ((HA)var16_24 /* !! */ ).l();
                                }
                                var8_9.J(var15_23, QFa.fE.J(), var5_6 == QFa.fE ? uqa.g : AQa.P);
                            }
                            if (var8_9.J(var15_23, var17_26 = var5_6.J(var6_7), uqa.g)) {
                                ++var4_5;
                                var11_13.add(var15_23);
                                if (var10_12 != 0 && (var16_24 /* !! */  = var8_9.J(var15_23)) != null) {
                                    v11 = var9_11;
                                    v11.J(rRa.X, var15_23.getX());
                                    v11.J(uOa.Ja, var15_23.getY());
                                    v11.J(oua.v, var15_23.getZ());
                                    var16_24 /* !! */ .f(v11);
                                }
                            }
                        }
                        v8 = ++var14_20;
                    }
                    v7 = ++var13_17;
                }
                v6 = ++var12_15;
            }
            v12 = var12_16 = var11_13.iterator();
            while (v12.hasNext()) {
                var13_19 = (XF)var12_16.next();
                v13 = var8_9;
                var14_22 = v13.J(var13_19).J();
                v13.d(var13_19, var14_22);
                v12 = var12_16;
            }
            if (var4_5 <= 0) {
                throw new oGa(xOa.u, new Object[uSa.E]);
            }
            b.J(Rha.AFFECTED_BLOCKS, var4_5);
            v14 = new Object[vRa.d];
            v14[uSa.E] = var4_5;
            SHa.notifyOperators((u)b, (Qc)var3_3, (String)Pqa.A, (Object[])v14);
            return;
        }
        throw new oGa(tSa.H, new Object[uSa.E]);
    }

    public SHa() {
        SHa a2;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        SHa a2 = this;
        return WPa.N;
    }

    public String getCommandName() {
        return vua.Ia;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF) {
        void a2;
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length > 0 && d2.length <= yRa.d) {
            return SHa.func_175771_a((String[])d2, (int)uSa.E, (XF)a2);
        }
        if (d2.length > yRa.d && d2.length <= uua.p) {
            return SHa.func_175771_a((String[])d2, (int)yRa.d, (XF)a2);
        }
        if (d2.length == XTa.W) {
            return SHa.getListOfStringsMatchingLastWord((String[])d2, (Collection)Block.blockRegistry.J());
        }
        if (d2.length == WOa.fa) {
            String[] stringArray2 = new String[tTa.h];
            stringArray2[uSa.E] = sOa.G;
            stringArray2[vRa.d] = aSa.Ia;
            stringArray2[uqa.g] = Pqa.d;
            stringArray2[yRa.d] = xOa.e;
            stringArray2[AQa.P] = xSa.g;
            return SHa.getListOfStringsMatchingLastWord((String[])d2, (String[])stringArray2);
        }
        if (d2.length == NTa.C && sOa.G.equals(d2[Yqa.i])) {
            return SHa.getListOfStringsMatchingLastWord((String[])d2, (Collection)Block.blockRegistry.J());
        }
        return null;
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }
}

