/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EDa
 *  Gg
 *  HA
 *  MD
 *  MQa
 *  Nw
 *  QFa
 *  Waa
 *  Xv
 *  lx
 *  pua
 *  vL
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class Dw_2
extends uU {
    private boolean hasSpiders;
    private boolean spawnerPlaced;
    private int sectionCount;
    private boolean hasRails;

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(uU var1_2, List<uU> var2_3, Random var3_4) {
        block25: {
            v0 = var4_5 = this;
            d = v0.J();
            var5_6 = a.nextInt(AQa.P);
            if (v0.coordBaseMode == null) ** GOTO lbl-1000
            switch (lx.$SwitchMap$net$minecraft$util$EnumFacing[var4_5.coordBaseMode.ordinal()]) lbl-1000:
            // 2 sources

            {
                case 1: {
                    if (false) ** GOTO lbl-1000
                    if (var5_6 <= vRa.d) {
                        v1 = d;
                        v2 = a;
                        Nw.f((uU)c, (List)b, (Random)v2, (int)var4_5.boundingBox.minX, (int)(var4_5.boundingBox.minY - vRa.d + v2.nextInt(yRa.d)), (int)(var4_5.boundingBox.minZ - vRa.d), (DZ)var4_5.coordBaseMode, (int)d);
                        break;
                    }
                    if (var5_6 == uqa.g) {
                        v1 = d;
                        v3 = a;
                        Nw.f((uU)c, (List)b, (Random)v3, (int)(var4_5.boundingBox.minX - vRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v3.nextInt(yRa.d)), (int)var4_5.boundingBox.minZ, (DZ)DZ.WEST, (int)d);
                        break;
                    }
                    v4 = a;
                    Nw.f((uU)c, (List)b, (Random)v4, (int)(var4_5.boundingBox.maxX + vRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v4.nextInt(yRa.d)), (int)var4_5.boundingBox.minZ, (DZ)DZ.EAST, (int)d);
                    v1 = d;
                    break;
                }
                case 2: {
                    if (var5_6 <= vRa.d) {
                        v1 = d;
                        v5 = a;
                        Nw.f((uU)c, (List)b, (Random)v5, (int)var4_5.boundingBox.minX, (int)(var4_5.boundingBox.minY - vRa.d + v5.nextInt(yRa.d)), (int)(var4_5.boundingBox.maxZ + vRa.d), (DZ)var4_5.coordBaseMode, (int)d);
                        break;
                    }
                    if (var5_6 == uqa.g) {
                        v1 = d;
                        v6 = a;
                        Nw.f((uU)c, (List)b, (Random)v6, (int)(var4_5.boundingBox.minX - vRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v6.nextInt(yRa.d)), (int)(var4_5.boundingBox.maxZ - yRa.d), (DZ)DZ.WEST, (int)d);
                        break;
                    }
                    v7 = a;
                    Nw.f((uU)c, (List)b, (Random)v7, (int)(var4_5.boundingBox.maxX + vRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v7.nextInt(yRa.d)), (int)(var4_5.boundingBox.maxZ - yRa.d), (DZ)DZ.EAST, (int)d);
                    v1 = d;
                    break;
                }
                case 3: {
                    if (var5_6 <= vRa.d) {
                        v1 = d;
                        v8 = a;
                        Nw.f((uU)c, (List)b, (Random)v8, (int)(var4_5.boundingBox.minX - vRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v8.nextInt(yRa.d)), (int)var4_5.boundingBox.minZ, (DZ)var4_5.coordBaseMode, (int)d);
                        break;
                    }
                    if (var5_6 == uqa.g) {
                        v1 = d;
                        v9 = a;
                        Nw.f((uU)c, (List)b, (Random)v9, (int)var4_5.boundingBox.minX, (int)(var4_5.boundingBox.minY - vRa.d + v9.nextInt(yRa.d)), (int)(var4_5.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)d);
                        break;
                    }
                    v10 = a;
                    Nw.f((uU)c, (List)b, (Random)v10, (int)var4_5.boundingBox.minX, (int)(var4_5.boundingBox.minY - vRa.d + v10.nextInt(yRa.d)), (int)(var4_5.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)d);
                    v1 = d;
                    break;
                }
                case 4: {
                    if (var5_6 <= vRa.d) {
                        v1 = d;
                        v11 = a;
                        Nw.f((uU)c, (List)b, (Random)v11, (int)(var4_5.boundingBox.maxX + vRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v11.nextInt(yRa.d)), (int)var4_5.boundingBox.minZ, (DZ)var4_5.coordBaseMode, (int)d);
                        break;
                    }
                    if (var5_6 == uqa.g) {
                        v1 = d;
                        v12 = a;
                        Nw.f((uU)c, (List)b, (Random)v12, (int)(var4_5.boundingBox.maxX - yRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v12.nextInt(yRa.d)), (int)(var4_5.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)d);
                        break;
                    }
                    v13 = a;
                    Nw.f((uU)c, (List)b, (Random)v13, (int)(var4_5.boundingBox.maxX - yRa.d), (int)(var4_5.boundingBox.minY - vRa.d + v13.nextInt(yRa.d)), (int)(var4_5.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)d);
                }
                default: lbl-1000:
                // 2 sources

                {
                    v1 = d;
                }
            }
            if (v1 >= Yqa.i) break block25;
            if (var4_5.coordBaseMode != DZ.NORTH && var4_5.coordBaseMode != DZ.SOUTH) {
                v14 = var5_6 = var4_5.boundingBox.minX + yRa.d;
                while (v14 + yRa.d <= var4_5.boundingBox.maxX) {
                    var6_7 = a.nextInt(tTa.h);
                    if (var6_7 == 0) {
                        Nw.f((uU)c, (List)b, (Random)a, (int)var5_6, (int)var4_5.boundingBox.minY, (int)(var4_5.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)(d + vRa.d));
                    } else if (var6_7 == vRa.d) {
                        Nw.f((uU)c, (List)b, (Random)a, (int)var5_6, (int)var4_5.boundingBox.minY, (int)(var4_5.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)(d + vRa.d));
                    }
                    v14 = var5_6 += 5;
                }
            } else {
                v15 = var5_6 = var4_5.boundingBox.minZ + yRa.d;
                while (v15 + yRa.d <= var4_5.boundingBox.maxZ) {
                    var6_8 = a.nextInt(tTa.h);
                    if (var6_8 == 0) {
                        Nw.f((uU)c, (List)b, (Random)a, (int)(var4_5.boundingBox.minX - vRa.d), (int)var4_5.boundingBox.minY, (int)var5_6, (DZ)DZ.WEST, (int)(d + vRa.d));
                    } else if (var6_8 == vRa.d) {
                        Nw.f((uU)c, (List)b, (Random)a, (int)(var4_5.boundingBox.maxX + vRa.d), (int)var4_5.boundingBox.minY, (int)var5_6, (DZ)DZ.EAST, (int)(d + vRa.d));
                    }
                    v15 = var5_6 += 5;
                }
            }
        }
    }

    @Override
    public void J(Waa waa2) {
        Dw_2 a2;
        Dw_2 b2 = waa2;
        Dw_2 dw_2 = a2 = this;
        Dw_2 dw_22 = b2;
        a2.hasRails = b2.f(mPa.ba);
        a2.hasSpiders = dw_22.f(vsa.H);
        dw_2.spawnerPlaced = dw_22.f(Yqa.f);
        dw_2.sectionCount = b2.J(VPa.t);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Xv J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2) {
        int n5;
        Xv f22;
        block9: {
            int e2;
            void b2;
            void d2;
            int f22 = n3;
            List<uU> c2 = list;
            void v0 = d2;
            f22 = new Xv((int)v0, f22, (int)b2, (int)v0, f22 + uqa.g, (int)b2);
            int n6 = e2 = e2.nextInt(yRa.d) + uqa.g;
            while (n6 > 0) {
                List<uU> list2;
                void a2;
                int n7 = e2 * tTa.h;
                switch (lx.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
                    case 1: {
                        f22.maxX = d2 + uqa.g;
                        f22.minZ = b2 - (n7 - vRa.d);
                        list2 = c2;
                        break;
                    }
                    case 2: {
                        f22.maxX = d2 + uqa.g;
                        f22.maxZ = b2 + (n7 - vRa.d);
                        list2 = c2;
                        break;
                    }
                    case 3: {
                        f22.minX = d2 - (n7 - vRa.d);
                        f22.maxZ = b2 + uqa.g;
                        list2 = c2;
                        break;
                    }
                    case 4: {
                        f22.maxX = d2 + (n7 - vRa.d);
                        f22.maxZ = b2 + uqa.g;
                    }
                    default: {
                        list2 = c2;
                    }
                }
                if (uU.J(list2, f22) == null) {
                    n5 = e2;
                    break block9;
                }
                n6 = --e2;
            }
            n5 = e2;
        }
        if (n5 > 0) {
            return f22;
        }
        return null;
    }

    public Dw_2() {
        Dw_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        int n3;
        int n4;
        void b2;
        void a2;
        void c2;
        Object object = this;
        if (((uU)object).J((Gg)c2, (Xv)a2)) {
            return uSa.E != 0;
        }
        Dw_2 dw_2 = object;
        int n5 = ((Dw_2)object).sectionCount * tTa.h - vRa.d;
        dw_2.J((Gg)c2, (Xv)a2, uSa.E, uSa.E, uSa.E, uqa.g, vRa.d, n5, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        dw_2.J((Gg)c2, (Xv)a2, (Random)b2, xSa.la, uSa.E, uqa.g, uSa.E, uqa.g, uqa.g, n5, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        if (dw_2.hasSpiders) {
            ((uU)object).J((Gg)c2, (Xv)a2, (Random)b2, Ora.D, uSa.E, uSa.E, uSa.E, uqa.g, vRa.d, n5, QFa.A.J(), QFa.HF.J(), uSa.E != 0);
        }
        int n6 = n4 = uSa.E;
        while (n6 < ((Dw_2)object).sectionCount) {
            Dw_2 dw_22;
            int d2 = uqa.g + n4 * tTa.h;
            Dw_2 dw_23 = object;
            int n7 = d2;
            dw_23.J((Gg)c2, (Xv)a2, uSa.E, uSa.E, n7, uSa.E, vRa.d, n7, QFa.U.J(), QFa.HF.J(), uSa.E != 0);
            int n8 = d2;
            dw_23.J((Gg)c2, (Xv)a2, uqa.g, uSa.E, n8, uqa.g, vRa.d, n8, QFa.U.J(), QFa.HF.J(), uSa.E != 0);
            if (b2.nextInt(AQa.P) == 0) {
                Dw_2 dw_24 = object;
                dw_22 = dw_24;
                int n9 = d2;
                dw_24.J((Gg)c2, (Xv)a2, uSa.E, uqa.g, n9, uSa.E, uqa.g, n9, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
                int n10 = d2;
                dw_24.J((Gg)c2, (Xv)a2, uqa.g, uqa.g, n10, uqa.g, uqa.g, n10, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
            } else {
                Dw_2 dw_25 = object;
                dw_22 = dw_25;
                int n11 = d2;
                dw_25.J((Gg)c2, (Xv)a2, uSa.E, uqa.g, n11, uqa.g, uqa.g, n11, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
            }
            dw_22.J((Gg)c2, (Xv)a2, (Random)b2, Nra.e, uSa.E, uqa.g, d2 - vRa.d, QFa.A.J());
            Dw_2 dw_26 = object;
            void v12 = c2;
            void v13 = a2;
            Dw_2 dw_27 = object;
            void v15 = c2;
            void v16 = a2;
            ((uU)object).J((Gg)c2, (Xv)a2, (Random)b2, Nra.e, uqa.g, uqa.g, d2 - vRa.d, QFa.A.J());
            ((uU)object).J((Gg)c2, (Xv)v16, (Random)b2, Nra.e, uSa.E, uqa.g, d2 + vRa.d, QFa.A.J());
            ((uU)object).J((Gg)v15, (Xv)v16, (Random)b2, Nra.e, uqa.g, uqa.g, d2 + vRa.d, QFa.A.J());
            dw_27.J((Gg)v15, (Xv)a2, (Random)b2, Yqa.C, uSa.E, uqa.g, d2 - uqa.g, QFa.A.J());
            dw_27.J((Gg)c2, (Xv)a2, (Random)b2, Yqa.C, uqa.g, uqa.g, d2 - uqa.g, QFa.A.J());
            ((uU)object).J((Gg)c2, (Xv)v13, (Random)b2, Yqa.C, uSa.E, uqa.g, d2 + uqa.g, QFa.A.J());
            ((uU)object).J((Gg)v12, (Xv)v13, (Random)b2, Yqa.C, uqa.g, uqa.g, d2 + uqa.g, QFa.A.J());
            dw_26.J((Gg)v12, (Xv)a2, (Random)b2, Yqa.C, vRa.d, uqa.g, d2 - vRa.d, QFa.FB.J(DZ.UP.getIndex()));
            dw_26.J((Gg)c2, (Xv)a2, (Random)b2, Yqa.C, vRa.d, uqa.g, d2 + vRa.d, QFa.FB.J(DZ.UP.getIndex()));
            if (b2.nextInt(ySa.T) == 0) {
                baa[] baaArray = new baa[vRa.d];
                baaArray[uSa.E] = Gea.ha.J((Random)b2);
                ((Dw_2)object).J((Gg)c2, (Xv)a2, (Random)b2, uqa.g, uSa.E, d2 - vRa.d, baa.J(Nw.J(), baaArray), yRa.d + b2.nextInt(AQa.P));
            }
            if (b2.nextInt(ySa.T) == 0) {
                baa[] baaArray = new baa[vRa.d];
                baaArray[uSa.E] = Gea.ha.J((Random)b2);
                ((Dw_2)object).J((Gg)c2, (Xv)a2, (Random)b2, uSa.E, uSa.E, d2 + vRa.d, baa.J(Nw.J(), baaArray), yRa.d + b2.nextInt(AQa.P));
            }
            if (((Dw_2)object).hasSpiders && !((Dw_2)object).spawnerPlaced) {
                Dw_2 dw_28 = object;
                n3 = dw_28.J(uSa.E);
                int n12 = d2 - vRa.d + b2.nextInt(yRa.d);
                n2 = dw_28.J(vRa.d, n12);
                XF xF2 = new XF(n2, n3, n12 = dw_28.f(vRa.d, n12));
                if (a2.J((MD)xF2)) {
                    ((Dw_2)object).spawnerPlaced = vRa.d;
                    c2.J(xF2, QFa.P.J(), uqa.g);
                    xF2 = c2.J(xF2);
                    if (xF2 instanceof Caa) {
                        ((Caa)((Object)xF2)).J().J(gua.K);
                    }
                }
            }
            n6 = ++n4;
        }
        int n13 = n4 = uSa.E;
        while (n13 <= uqa.g) {
            int n14 = uSa.E;
            while (n14 <= n5) {
                int d2;
                n3 = pua.o;
                IBlockState iBlockState = ((uU)object).J((Gg)c2, n4, n3, d2, (Xv)a2);
                if (iBlockState.J().J() == Material.air) {
                    n2 = pua.o;
                    ((uU)object).f((Gg)c2, QFa.L.J(), n4, n2, d2, (Xv)a2);
                }
                n14 = ++d2;
            }
            n13 = ++n4;
        }
        if (((Dw_2)object).hasRails) {
            int n15 = n4 = uSa.E;
            while (n15 <= n5) {
                IBlockState d2 = ((uU)object).J((Gg)c2, vRa.d, pua.o, n4, (Xv)a2);
                if (d2.J().J() != Material.air && d2.J().J()) {
                    ((uU)object).J((Gg)c2, (Xv)a2, (Random)b2, ZSa.q, vRa.d, uSa.E, n4, QFa.SA.J(((uU)object).J(QFa.SA, uSa.E)));
                }
                n15 = ++n4;
            }
        }
        return vRa.d != 0;
    }

    @Override
    public void f(Waa waa2) {
        Dw_2 b2 = waa2;
        Dw_2 a2 = this;
        Dw_2 dw_2 = b2;
        dw_2.J(mPa.ba, a2.hasRails);
        dw_2.J(vsa.H, a2.hasSpiders);
        dw_2.J(Yqa.f, a2.spawnerPlaced);
        dw_2.J(VPa.t, a2.sectionCount);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, Xv xv2, Random random, int n2, int n3, int n4, List<baa> list, int n5) {
        void h2;
        void g22;
        void d2;
        void c2;
        void i22;
        int n6 = n2;
        Dw_2 e2 = this;
        XF i22 = new XF(e2.J((int)i22, (int)c2), e2.J((int)d2), e2.f((int)i22, (int)c2));
        if (g22.J((MD)i22) && h2.J(i22).J().J() == Material.air) {
            void a2;
            void b2;
            void f2;
            int g22 = f2.nextBoolean() ? vRa.d : uSa.E;
            h2.J(i22, QFa.SA.J(e2.J(QFa.SA, g22)), uqa.g);
            EDa eDa = g22 = new EDa((Gg)h2, (double)((float)i22.getX() + MQa.L), (double)((float)i22.getY() + MQa.L), (double)((float)i22.getZ() + MQa.L));
            baa.J((Random)f2, (List<baa>)b2, (HA)eDa, (int)a2);
            h2.f((vL)eDa);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Dw_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void c2;
        void a2;
        void d2;
        Dw_2 b2;
        Dw_2 e2 = xv2;
        Dw_2 dw_2 = b2 = this;
        super((int)d2);
        b2.coordBaseMode = a2;
        dw_2.boundingBox = e2;
        dw_2.hasRails = c2.nextInt(yRa.d) == 0 ? vRa.d : uSa.E;
        b2.hasSpiders = !b2.hasRails && c2.nextInt(AQa.ba) == 0 ? vRa.d : uSa.E;
        int n3 = b2.hasSpiders ? 1 : 0;
        if (b2.coordBaseMode != DZ.NORTH && b2.coordBaseMode != DZ.SOUTH) {
            b2.sectionCount = e2.J() / tTa.h;
            return;
        }
        b2.sectionCount = e2.l() / tTa.h;
    }
}

