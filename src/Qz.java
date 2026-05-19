/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Baa
 *  ERa
 *  Gg
 *  I
 *  JPa
 *  Jy
 *  MQa
 *  Oz
 *  QFa
 *  Tf
 *  Yfa
 *  Zta
 *  dZ
 *  oA
 *  vL
 *  vRa
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;

public final class Qz {
    private final Set<Baa> A = Sets.newHashSet();
    private static final int I = (int)Math.pow(xua.z, KPa.y);

    /*
     * WARNING - void declaration
     */
    public static XF J(Gg gg2, int n2, int n3) {
        void a2;
        void b2;
        Gg gg3 = gg2;
        Gg c22 = gg3.J((int)b2, (int)a2);
        b2 = b2 * ERa.C + gg3.v.nextInt(ERa.C);
        Gg gg4 = gg3;
        a2 = a2 * ERa.C + gg4.v.nextInt(ERa.C);
        int n4 = Oz.f((int)(c22.f(new XF((int)b2, uSa.E, (int)a2)) + vRa.d), (int)ERa.C);
        int c22 = gg4.v.nextInt(n4 > 0 ? n4 : c22.f() + ERa.C - vRa.d);
        return new XF((int)b2, c22, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(eIa eIa2, Gg gg2, XF xF) {
        int n2;
        void a2;
        eIa c2 = gg2;
        eIa b2 = eIa2;
        if (!c2.J().J((XF)a2)) {
            return uSa.E != 0;
        }
        Block block = c2.J((XF)a2).J();
        if (b2 == eIa.IN_WATER) {
            if (block.J().l() && c2.J(a2.down()).J().J().l() && !c2.J(a2.up()).J().A()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        Object object = a2.down();
        if (!Gg.J((I)c2, (XF)((Object)object))) {
            return uSa.E != 0;
        }
        int n3 = n2 = (object = c2.J((XF)((Object)object)).J()) != QFa.bg && object != QFa.fE ? vRa.d : uSa.E;
        if (!(n2 == 0 || block.A() || block.J().l() || c2.J(a2.up()).J().A())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Gg object, Jy jy, int n2, int n3, int n4, int n5, Random random) {
        void f2;
        Gg gg2 = object;
        object = random;
        Gg a2 = gg2;
        List list = f2.J(VIa.CREATURE);
        if (!list.isEmpty()) {
            Gg g2;
            while (g2.nextFloat() < f2.J()) {
                void b2;
                void d2;
                void c2;
                void e2;
                AZ aZ2 = (AZ)dZ.J((Random)a2.v, (Collection)list);
                int n6 = aZ2.J + g2.nextInt(vRa.d + aZ2.A - aZ2.J);
                oA oA2 = null;
                void var11_11 = e2 + g2.nextInt((int)c2);
                void var12_12 = d2 + g2.nextInt((int)b2);
                void var13_13 = var11_11;
                void var14_14 = var12_12;
                int n7 = uSa.E;
                while (n7 < n6) {
                    int n8;
                    int n9 = uSa.E;
                    int n10 = n9;
                    for (int i2 = uSa.E; n10 == 0 && i2 < AQa.P; ++i2) {
                        block8: {
                            XF xF = a2.f(new XF((int)var11_11, uSa.E, (int)var12_12));
                            if (Qz.J(eIa.ON_GROUND, a2, xF)) {
                                Yfa yfa;
                                try {
                                    Class[] classArray = new Class[vRa.d];
                                    classArray[uSa.E] = Gg.class;
                                    Object[] objectArray = new Object[vRa.d];
                                    objectArray[uSa.E] = a2;
                                    yfa = (Yfa)aZ2.I.getConstructor(classArray).newInstance(objectArray);
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                    break block8;
                                }
                                yfa.f((double)((float)var11_11 + MQa.L), (double)xF.getY(), (double)((float)var12_12 + MQa.L), g2.nextFloat() * CRa.ja, JPa.N);
                                a2.f((vL)yfa);
                                oA2 = yfa.J(a2.J(new XF((vL)yfa)), oA2);
                                n9 = vRa.d;
                            }
                            var12_12 += g2.nextInt(tTa.h) - g2.nextInt(tTa.h);
                            void v5 = var11_11 += g2.nextInt(tTa.h) - g2.nextInt(tTa.h);
                            while (v5 < e2 || var11_11 >= e2 + c2 || var12_12 < d2 || var12_12 >= d2 + c2) {
                                var11_11 = var13_13 + g2.nextInt(tTa.h) - g2.nextInt(tTa.h);
                                var12_12 = var14_14 + g2.nextInt(tTa.h) - g2.nextInt(tTa.h);
                                v5 = var11_11;
                            }
                        }
                        n10 = n9;
                    }
                    n7 = ++n8;
                }
            }
        }
    }

    public Qz() {
        Qz a2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int J(Tf var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        e = var1_1;
        d = this;
        if (c == false && b == false) {
            return uSa.E;
        }
        d.A.clear();
        var5_5 = uSa.E;
        for (Sx var7_8 : e.w) {
            if (var7_8 /* !! */ .t()) continue;
            v0 /* !! */  = var7_8 /* !! */ ;
            var8_9 = Oz.f((double)(v0 /* !! */ .la / Zta.ba));
            var9_11 = Oz.f((double)(v0 /* !! */ .A / Zta.ba));
            var10_12 = Yqa.i;
            v1 = -var10_12;
            while (v1 <= var10_12) {
                v2 = -var10_12;
                while (v2 <= var10_12) {
                    var13_17 = var11_13 == -var10_12 || var11_13 == var10_12 || var12_16 == -var10_12 || var12_16 == var10_12 ? vRa.d : uSa.E;
                    var14_18 = new Baa(var11_13 + var8_9, var12_16 + var9_11);
                    if (!d.A.contains(var14_18)) {
                        ++var5_5;
                        if (var13_17 == 0 && e.J().J(var14_18)) {
                            d.A.add(var14_18);
                        }
                    }
                    v2 = ++var12_16;
                }
                v1 = ++var11_13;
            }
        }
        var6_7 = uSa.E;
        var7_8 /* !! */  = e.J();
        var8_10 = VIa.values();
        var9_11 = var8_10.length;
        v3 = var10_12 = uSa.E;
        while (v3 < var9_11) {
            var11_15 = var8_10[var10_12];
            if (!(var11_15.getPeacefulCreature() && b == false || !var11_15.getPeacefulCreature() && c == false || var11_15.getAnimal() && a == false || (var12_16 = e.J(var11_15.getCreatureClass())) > (var13_17 = var11_15.getMaxNumberOfCreature() * var5_5 / Qz.I))) {
                var14_18 = d.A.iterator();
                block6: while (true) {
                    v4 = var14_18;
                    block7: while (v4.hasNext()) {
                        var15_20 = (Baa)var14_18.next();
                        v5 = e;
                        v6 = var15_20;
                        v7 = Qz.J((Gg)v5, v6.j, v6.A);
                        var15_19 = v7.getX();
                        var16_21 = v7.getY();
                        var17_22 = v7.getZ();
                        if (v5.J(v7).J().A()) continue block6;
                        var18_23 = uSa.E;
                        v8 = uSa.E;
                        while (true) {
                            if (v8 < yRa.d) ** break;
                            continue block6;
                            var20_25 = var15_19;
                            var21_26 = var16_21;
                            var22_27 = var17_22;
                            var23_28 = uua.p;
                            var24_29 = null;
                            var25_30 = null;
                            v9 = uSa.E;
                            while (v9 < AQa.P) {
                                var27_32 = new XF(var20_25 += e.v.nextInt(var23_28) - e.v.nextInt(var23_28), var21_26 += e.v.nextInt(vRa.d) - e.v.nextInt(vRa.d), var22_27 += e.v.nextInt(var23_28) - e.v.nextInt(var23_28));
                                var28_33 = (float)var20_25 + MQa.L;
                                var29_34 = (float)var22_27 + MQa.L;
                                if (!e.J(var28_33, var21_26, var29_34, zOa.y) && var7_8 /* !! */ .distanceSq(var28_33, var21_26, var29_34) >= eta.la) {
                                    if (var24_29 == null && (var24_29 = e.J(var11_15, var27_32)) == null) break;
                                    if (e.J(var11_15, var24_29, var27_32) && Qz.J(XIa.J(var24_29.I), (Gg)e, var27_32)) {
                                        try {
                                            v10 = new Class[vRa.d];
                                            v10[uSa.E] = Gg.class;
                                            v11 = new Object[vRa.d];
                                            v11[uSa.E] = e;
                                            var27_32 = (Yfa)var24_29.I.getConstructor(v10).newInstance(v11);
                                        }
                                        catch (Exception var30_35) {
                                            var30_35.printStackTrace();
                                            return var6_7;
                                        }
                                        var27_32.f(var28_33, var21_26, var29_34, e.v.nextFloat() * CRa.ja, JPa.N);
                                        if (var27_32.w() && var27_32.N()) {
                                            v12 = var27_32;
                                            var25_30 = v12.J(e.J(new XF((vL)var27_32)), var25_30);
                                            if (v12.N()) {
                                                e.f((vL)var27_32);
                                                ++var18_23;
                                            }
                                            if (var18_23 >= var27_32.D()) {
                                                v4 = var14_18;
                                                continue block7;
                                            }
                                        }
                                        var6_7 += var18_23;
                                    }
                                }
                                v9 = ++var26_31;
                            }
                            v8 = ++var19_24;
                        }
                    }
                    break;
                }
            }
            v3 = ++var10_12;
        }
        return var6_7;
    }
}

