/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dha
 *  EE
 *  ERa
 *  FE
 *  FLa
 *  I
 *  ISa
 *  JPa
 *  Kpa
 *  MD
 *  MZ
 *  NQa
 *  OE
 *  Oz
 *  PLa
 *  RA
 *  RIa
 *  WSa
 *  XE
 *  XTa
 *  Yka
 *  aKa
 *  gKa
 *  mka
 *  pKa
 *  pe
 *  pqa
 *  psa
 *  pua
 *  qta
 *  uKa
 *  uRa
 *  vRa
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

public final class Kja {
    private static float A = psa.N;
    private static final String I = "CL_00002518";

    /*
     * WARNING - void declaration
     */
    public void J(RA rA, float f2, float f3, float f4, float f5) {
        void e2;
        void a2;
        void b2;
        void c2;
        void d2;
        int f6;
        Kja kja = this;
        DZ[] dZArray = DZ.VALUES;
        int n2 = DZ.VALUES.length;
        int n3 = f6 = uSa.E;
        while (n3 < n2) {
            DZ dZ = dZArray[f6];
            kja.J((float)d2, (float)c2, (float)b2, (float)a2, e2.J(dZ));
            n3 = ++f6;
        }
        kja.J((float)d2, (float)c2, (float)b2, (float)a2, e2.J());
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(I i2, RA rA, IBlockState iBlockState, XF xF, aKa aKa2) {
        void a2;
        void d2;
        Object f2;
        void c2;
        void e2;
        Kja kja = object;
        Object object = xF;
        Kja b2 = kja;
        void v1 = e2;
        c2.J().J((I)v1, (XF)((Object)f2));
        return b2.J((I)v1, (RA)d2, (IBlockState)c2, (XF)((Object)f2), (aKa)a2, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(Block block, int[] nArray, DZ dZ, float[] fArray, BitSet bitSet) {
        void c2;
        void b2;
        float f2;
        int n2;
        void d2;
        Kja kja = this;
        float f3 = Ura.m;
        float f4 = Ura.m;
        float f5 = Ura.m;
        float f6 = NSa.c;
        float f7 = NSa.c;
        float f8 = NSa.c;
        int n3 = ((void)d2).length / AQa.P;
        int n4 = n2 = uSa.E;
        while (n4 < AQa.P) {
            void v1 = d2;
            f2 = Float.intBitsToFloat((int)v1[n2 * n3]);
            float f9 = Float.intBitsToFloat((int)v1[n2 * n3 + vRa.d]);
            float f10 = Float.intBitsToFloat((int)v1[n2 * n3 + uqa.g]);
            f3 = Math.min(f3, f2);
            f4 = Math.min(f4, f9);
            f5 = Math.min(f5, f10);
            f6 = Math.max(f6, f2);
            f7 = Math.max(f7, f9);
            f8 = Math.max(f8, f10);
            n4 = ++n2;
        }
        if (b2 != null) {
            void v2 = b2;
            v2[DZ.WEST.getIndex()] = f3;
            v2[DZ.EAST.getIndex()] = f6;
            v2[DZ.DOWN.getIndex()] = f4;
            v2[DZ.UP.getIndex()] = f7;
            v2[DZ.NORTH.getIndex()] = f5;
            v2[DZ.SOUTH.getIndex()] = f8;
            v2[DZ.WEST.getIndex() + DZ.VALUES.length] = pqa.r - f3;
            b2[DZ.EAST.getIndex() + DZ.VALUES.length] = pqa.r - f6;
            b2[DZ.DOWN.getIndex() + DZ.VALUES.length] = pqa.r - f4;
            b2[DZ.UP.getIndex() + DZ.VALUES.length] = pqa.r - f7;
            b2[DZ.NORTH.getIndex() + DZ.VALUES.length] = pqa.r - f5;
            b2[DZ.SOUTH.getIndex() + DZ.VALUES.length] = pqa.r - f8;
        }
        float f11 = WSa.B;
        f2 = oQa.S;
        switch (gKa.I[c2.ordinal()]) {
            case 1: {
                void e2;
                void a2;
                a2.set(vRa.d, (f3 >= WSa.B || f5 >= WSa.B || f6 <= oQa.S || f8 <= oQa.S ? vRa.d : uSa.E) != 0);
                a2.set(uSa.E, ((f4 < WSa.B || e2.l()) && f4 == f7 ? vRa.d : uSa.E) != 0);
                return;
            }
            case 2: {
                void e2;
                void a2;
                a2.set(vRa.d, (f3 >= WSa.B || f5 >= WSa.B || f6 <= oQa.S || f8 <= oQa.S ? vRa.d : uSa.E) != 0);
                a2.set(uSa.E, ((f7 > oQa.S || e2.l()) && f4 == f7 ? vRa.d : uSa.E) != 0);
                return;
            }
            case 3: {
                void e2;
                void a2;
                a2.set(vRa.d, (f3 >= WSa.B || f4 >= WSa.B || f6 <= oQa.S || f7 <= oQa.S ? vRa.d : uSa.E) != 0);
                a2.set(uSa.E, ((f5 < WSa.B || e2.l()) && f5 == f8 ? vRa.d : uSa.E) != 0);
                return;
            }
            case 4: {
                void e2;
                void a2;
                a2.set(vRa.d, (f3 >= WSa.B || f4 >= WSa.B || f6 <= oQa.S || f7 <= oQa.S ? vRa.d : uSa.E) != 0);
                a2.set(uSa.E, ((f8 > oQa.S || e2.l()) && f5 == f8 ? vRa.d : uSa.E) != 0);
                return;
            }
            case 5: {
                void e2;
                void a2;
                a2.set(vRa.d, (f4 >= WSa.B || f5 >= WSa.B || f7 <= oQa.S || f8 <= oQa.S ? vRa.d : uSa.E) != 0);
                a2.set(uSa.E, ((f3 < WSa.B || e2.l()) && f3 == f6 ? vRa.d : uSa.E) != 0);
                return;
            }
            case 6: {
                void e2;
                void a2;
                a2.set(vRa.d, (f4 >= WSa.B || f5 >= WSa.B || f7 <= oQa.S || f8 <= oQa.S ? vRa.d : uSa.E) != 0);
                a2.set(uSa.E, ((f6 > oQa.S || e2.l()) && f3 == f6 ? vRa.d : uSa.E) != 0);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, RA rA, Block block, IBlockState iBlockState, XF xF, aKa aKa2, boolean bl) {
        void b2;
        void d2;
        void g;
        void e2;
        void c2;
        void f2;
        int n2;
        Kja kja = this;
        int n3 = uSa.E;
        Object h = null;
        Object object = DZ.VALUES;
        int n4 = DZ.VALUES.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            DZ dZ = object[n2];
            List list = f2.J(dZ);
            if (!list.isEmpty()) {
                void a2;
                XF xF2 = c2.offset(dZ);
                if (a2 == false || e2.J((I)g, xF2, dZ)) {
                    if (h == null) {
                        h = JE.J((I)g, (IBlockState)d2, (XF)c2);
                    }
                    if (!((JE)h).J(list) && Config.ea()) {
                        list = OE.J((I)g, (Block)e2, (XF)c2, (DZ)dZ, (List)list);
                    }
                    kja.J((I)g, (Block)e2, (XF)c2, (aKa)b2, list, (JE)h);
                    n3 = vRa.d;
                }
            }
            n5 = ++n2;
        }
        object = f2.J();
        if (object.size() > 0) {
            if (h == null) {
                h = JE.J((I)g, (IBlockState)d2, (XF)c2);
            }
            kja.J((I)g, (Block)e2, (XF)c2, (aKa)b2, (List)object, (JE)h);
            n3 = vRa.d;
        }
        if (h != null && Config.aa() && !((JE)h).J() && FE.J((I)g, (Block)e2, (IBlockState)d2, (XF)c2)) {
            RA rA2 = FE.J();
            IBlockState iBlockState2 = FE.J();
            kja.f((I)g, rA2, iBlockState2.J(), iBlockState2, (XF)c2, (aKa)b2, vRa.d != 0);
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3, float f4, float f5, List list) {
        Iterator a2;
        Kja kja = this;
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            void e2;
            Kja kja2;
            Kja f6;
            Kja kja3 = f6 = (Yka)a2.next();
            aKa2.J(XTa.W, mka.L);
            aKa2.J(kja3.J());
            if (kja3.J()) {
                void b2;
                void c2;
                void d2;
                kja2 = f6;
                aKa2.J((float)(d2 * e2), (float)(c2 * e2), (float)(b2 * e2));
            } else {
                void v3 = e2;
                aKa2.J((float)v3, (float)v3, (float)v3);
                kja2 = f6;
            }
            f6 = kja2.J().getDirectionVec();
            iterator = a2;
            aKa2.l((float)f6.getX(), (float)f6.getY(), (float)f6.getZ());
            pKa2.J();
        }
    }

    public Kja() {
        Kja a2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(I i2, Block block, XF xF, aKa aKa2, List list, JE jE2) {
        int n2;
        Yka b22;
        void e2;
        void d2;
        void a2;
        Kja kja = this;
        void v0 = a2;
        float[] fArray = v0.J();
        BitSet bitSet = v0.J();
        Kja g = v0.J();
        IBlockState iBlockState = v0.J();
        void v1 = d2;
        double d3 = v1.getX();
        double d4 = v1.getY();
        double d5 = v1.getZ();
        Block$EnumOffsetType block$EnumOffsetType = e2.J();
        if (block$EnumOffsetType != Block$EnumOffsetType.NONE) {
            long l = Oz.J((MD)d2);
            d3 += ((double)((float)(l >> ERa.C & yRa.W) / qta.D) - kTa.B) * kTa.B;
            d5 += ((double)((float)(l >> osa.c & yRa.W) / qta.D) - kTa.B) * kTa.B;
            if (block$EnumOffsetType == Block$EnumOffsetType.XYZ) {
                d4 += ((double)((float)(l >> kTa.j & yRa.W) / qta.D) - oua.i) * iSa.P;
            }
        }
        ArrayList arrayList = (ArrayList)b22;
        int n3 = n2 = uSa.E;
        while (n3 < arrayList.size()) {
            void v8;
            void v4;
            void c2;
            void f2;
            b22 = (Yka)arrayList.get(n2);
            if (!a2.J(b22)) {
                block$EnumOffsetType = b22;
                if (Config.e()) {
                    b22 = rD.J((I)f2, iBlockState, (XF)d2, b22, (JE)a2);
                }
                if (b22 == block$EnumOffsetType && Config.ma()) {
                    b22 = pe.J((XF)d2, (Yka)b22);
                }
            }
            kja.J((Block)e2, b22.J(), b22.J(), fArray, bitSet);
            g.J((I)f2, (Block)e2, (XF)d2, b22.J(), fArray, bitSet);
            if (c2.f()) {
                void v3 = c2;
                v4 = v3;
                v3.J(b22.f());
                v3.J(b22.J());
            } else {
                void v5 = c2;
                v4 = v5;
                v5.J(b22.J());
            }
            v4.J(PLa.J((PLa)g)[uSa.E], PLa.J((PLa)g)[vRa.d], PLa.J((PLa)g)[uqa.g], PLa.J((PLa)g)[yRa.d]);
            Yka yka = b22;
            int n4 = XE.J((Yka)yka, (Block)e2, (I)f2, (XF)d2, (JE)a2);
            if (!yka.J() && n4 == pua.o) {
                void v7 = c2;
                v8 = v7;
                void v9 = c2;
                Kja kja2 = g;
                v9.J(PLa.J((PLa)g)[uSa.E], PLa.J((PLa)kja2)[uSa.E], PLa.J((PLa)g)[uSa.E], AQa.P);
                Kja kja3 = g;
                v9.J(PLa.J((PLa)kja2)[vRa.d], PLa.J((PLa)kja3)[vRa.d], PLa.J((PLa)g)[vRa.d], yRa.d);
                v7.J(PLa.J((PLa)kja3)[uqa.g], PLa.J((PLa)g)[uqa.g], PLa.J((PLa)g)[uqa.g], uqa.g);
                v7.J(PLa.J((PLa)g)[yRa.d], PLa.J((PLa)g)[yRa.d], PLa.J((PLa)g)[yRa.d], vRa.d);
            } else {
                int n5 = n4 != pua.o ? n4 : e2.J((I)f2, (XF)d2, b22.J());
                if (FLa.ia) {
                    n5 = gLa.J(n5);
                }
                float b22 = (float)(n5 >> ERa.C & osa.Ja) / NQa.Y;
                float f3 = (float)(n5 >> Yqa.i & osa.Ja) / NQa.Y;
                float f4 = (float)(n5 & osa.Ja) / NQa.Y;
                void v12 = c2;
                v8 = v12;
                void v13 = c2;
                Kja kja4 = g;
                v13.J(PLa.J((PLa)g)[uSa.E] * b22, PLa.J((PLa)kja4)[uSa.E] * f3, PLa.J((PLa)g)[uSa.E] * f4, AQa.P);
                Kja kja5 = g;
                v13.J(PLa.J((PLa)kja4)[vRa.d] * b22, PLa.J((PLa)kja5)[vRa.d] * f3, PLa.J((PLa)g)[vRa.d] * f4, yRa.d);
                v12.J(PLa.J((PLa)kja5)[uqa.g] * b22, PLa.J((PLa)g)[uqa.g] * f3, PLa.J((PLa)g)[uqa.g] * f4, uqa.g);
                v12.J(PLa.J((PLa)g)[yRa.d] * b22, PLa.J((PLa)g)[yRa.d] * f3, PLa.J((PLa)g)[yRa.d] * f4, vRa.d);
            }
            v8.J(d3, d4, d5);
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(I i2, RA rA, IBlockState iBlockState, XF xF, aKa aKa2, boolean bl) {
        void a2;
        void b2;
        void c2;
        RIa f2;
        Block block;
        RA e2;
        Kja d2;
        IBlockState g;
        block4: {
            g = iBlockState;
            d2 = this;
            int n2 = Kpa.k() && g.J().f() == 0 && e2.J() ? vRa.d : uSa.E;
            try {
                block = g.J();
                if (Config.E() && g.J() instanceof BlockLeavesBase) {
                    e2 = EE.J((RA)e2);
                }
                if (n2 == 0) break block4;
                return d2.f((I)f2, e2, block, g, (XF)c2, (aKa)b2, (boolean)a2);
            }
            catch (Throwable throwable) {
                f2 = RIa.J((Throwable)throwable, (String)rSa.a);
                Dha dha = f2.J(hpa.D);
                Dha.J((Dha)dha, (XF)c2, (IBlockState)g);
                dha.J(EPa.Q, (Object)(n2 != 0));
                throw new MZ(f2);
            }
        }
        return d2.J((I)f2, e2, block, g, (XF)c2, (aKa)b2, (boolean)a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(I i2, Block block, XF xF, DZ dZ, int n2, boolean bl, aKa aKa2, List list, JE jE2) {
        List j222;
        Iterator iterator;
        void h;
        void g;
        void a2;
        Kja kja = list2;
        List list2 = list;
        Kja b2 = kja;
        void v1 = a2;
        BitSet f2 = v1.J();
        IBlockState iBlockState = v1.J();
        void v2 = g;
        double d2 = v2.getX();
        double d3 = v2.getY();
        double d4 = v2.getZ();
        Block$EnumOffsetType block$EnumOffsetType = h.J();
        if (block$EnumOffsetType != Block$EnumOffsetType.NONE) {
            void v3 = g;
            int n3 = v3.getX();
            int n4 = v3.getZ();
            long l = (long)(n3 * pta.w) ^ (long)n4 * uRa.b;
            l = l * l * fta.z + l * Jsa.S;
            d2 += ((double)((float)(l >> ERa.C & yRa.W) / qta.D) - kTa.B) * kTa.B;
            d4 += ((double)((float)(l >> osa.c & yRa.W) / qta.D) - kTa.B) * kTa.B;
            if (block$EnumOffsetType == Block$EnumOffsetType.XYZ) {
                d3 += ((double)((float)(l >> kTa.j & yRa.W) / qta.D) - oua.i) * iSa.P;
            }
        }
        Iterator iterator2 = iterator = j222.iterator();
        while (iterator2.hasNext()) {
            void v7;
            void c2;
            int e2;
            void d5;
            void i3;
            Object e3 = iterator.next();
            Yka yka = (Yka)e3;
            if (!a2.J(yka)) {
                Yka yka2 = yka;
                if (Config.e()) {
                    yka = rD.J((I)i3, iBlockState, (XF)g, yka, (JE)a2);
                }
                if (yka == yka2 && Config.ma()) {
                    yka = pe.J((XF)g, (Yka)yka);
                }
            }
            if (d5 != false) {
                b2.J((Block)h, yka.J(), yka.J(), (float[])null, f2);
                int n5 = e2 = f2.get(uSa.E) ? h.f((I)i3, g.offset(yka.J())) : h.f((I)i3, (XF)g);
            }
            if (c2.f()) {
                void v6 = c2;
                v7 = v6;
                v6.J(yka.f());
                v6.J(yka.J());
            } else {
                void v8 = c2;
                v7 = v8;
                v8.J(yka.J());
            }
            void v9 = e2;
            v7.J((int)v9, (int)v9, (int)v9, (int)v9);
            Yka yka3 = yka;
            int n6 = XE.J((Yka)yka3, (Block)h, (I)i3, (XF)g, (JE)a2);
            if (yka3.J() || n6 != pua.o) {
                int j222 = n6 != pua.o ? n6 : h.J((I)i3, (XF)g, yka.J());
                if (FLa.ia) {
                    j222 = gLa.J(j222);
                }
                float f3 = (float)(j222 >> ERa.C & osa.Ja) / NQa.Y;
                float f4 = (float)(j222 >> Yqa.i & osa.Ja) / NQa.Y;
                float j222 = (float)(j222 & osa.Ja) / NQa.Y;
                void v11 = c2;
                float f5 = f3;
                c2.J(f3, f4, j222, AQa.P);
                c2.J(f5, f4, j222, yRa.d);
                v11.J(f5, f4, j222, uqa.g);
                v11.J(f3, f4, j222, vRa.d);
            }
            c2.J(d2, d3, d4);
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, RA rA, Block block, XF xF, aKa aKa2, boolean bl) {
        void a2;
        void b2;
        Object g;
        void d2;
        void e2;
        void f2;
        Kja kja = object;
        Object object = xF;
        Kja c2 = kja;
        void v1 = f2;
        return c2.J((I)v1, (RA)e2, (Block)d2, v1.J((XF)((Object)g)), (XF)((Object)g), (aKa)b2, (boolean)a2);
    }

    public static void J() {
        A = pqa.r - Config.l() * xSa.la;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(I i2, RA rA, Block block, XF xF, aKa aKa2, boolean bl) {
        void a2;
        void b2;
        Object g;
        void d2;
        void e2;
        void f2;
        Kja kja = object;
        Object object = xF;
        Kja c2 = kja;
        void v1 = f2;
        return c2.f((I)v1, (RA)e2, (Block)d2, v1.J((XF)((Object)g)), (XF)((Object)g), (aKa)b2, (boolean)a2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(I i2, RA rA, Block block, IBlockState iBlockState, XF xF, aKa aKa2, boolean bl) {
        void b2;
        void d2;
        void g;
        void e2;
        void c2;
        void f2;
        int n2;
        Kja kja = this;
        int n3 = uSa.E;
        Object h = null;
        Object object = DZ.VALUES;
        int n4 = DZ.VALUES.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            DZ dZ = object[n2];
            List list = f2.J(dZ);
            if (!list.isEmpty()) {
                void a2;
                XF xF2 = c2.offset(dZ);
                if (a2 == false || e2.J((I)g, xF2, dZ)) {
                    if (h == null) {
                        h = JE.J((I)g, (IBlockState)d2, (XF)c2);
                    }
                    if (!((JE)h).J(list) && Config.ea()) {
                        list = OE.J((I)g, (Block)e2, (XF)c2, (DZ)dZ, (List)list);
                    }
                    int n6 = e2.f((I)g, xF2);
                    kja.J((I)g, (Block)e2, (XF)c2, dZ, n6, uSa.E != 0, (aKa)b2, list, (JE)h);
                    n3 = vRa.d;
                }
            }
            n5 = ++n2;
        }
        object = f2.J();
        if (object.size() > 0) {
            if (h == null) {
                h = JE.J((I)g, (IBlockState)d2, (XF)c2);
            }
            kja.J((I)g, (Block)e2, (XF)c2, null, pua.o, vRa.d != 0, (aKa)b2, (List)object, (JE)h);
            n3 = vRa.d;
        }
        if (h != null && Config.aa() && !((JE)h).J() && FE.J((I)g, (Block)e2, (IBlockState)d2, (XF)c2) && FE.J((I)g, (Block)e2, (IBlockState)d2, (XF)c2)) {
            RA rA2 = FE.J();
            IBlockState iBlockState2 = FE.J();
            kja.J((I)g, rA2, iBlockState2.J(), iBlockState2, (XF)c2, (aKa)b2, vRa.d != 0);
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(RA rA, IBlockState iBlockState, float f2, boolean bl) {
        void d2;
        void b2;
        void a2;
        Block block;
        IBlockState e322 = iBlockState;
        Kja c2 = this;
        Block block2 = block = e322.J();
        block2.f();
        uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        int e322 = block2.J(block2.J(e322));
        if (FLa.ia) {
            e322 = gLa.J(e322);
        }
        float f3 = (float)(e322 >> ERa.C & osa.Ja) / NQa.Y;
        float f4 = (float)(e322 >> Yqa.i & osa.Ja) / NQa.Y;
        float e322 = (float)(e322 & osa.Ja) / NQa.Y;
        if (a2 == false) {
            void v1 = b2;
            uKa.f((float)v1, (float)v1, (float)v1, (float)pqa.r);
        }
        c2.J((RA)d2, (float)b2, f3, f4, e322);
    }

    public static float J(float a2) {
        if (a2 == psa.N) {
            return A;
        }
        return a2;
    }
}

