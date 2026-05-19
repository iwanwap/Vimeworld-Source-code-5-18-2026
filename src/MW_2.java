/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  MW
 *  NTa
 *  QFa
 *  SW
 *  Waa
 *  XTa
 *  Xv
 *  Ypa
 *  cW
 *  eAa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  vv
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;

public abstract class MW_2
extends uU {
    public static final List<baa> field_111019_a;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU l(cW cW2, List<uU> list, Random random, int n2, int n3, boolean bl) {
        boolean bl2 = bl;
        MW_2 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (gW.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 1: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX + c2, a2.boundingBox.minY + b2, a2.boundingBox.minZ - vRa.d, a2.coordBaseMode, a2.J(), (boolean)g2);
                }
                case 2: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX + c2, a2.boundingBox.minY + b2, a2.boundingBox.maxZ + vRa.d, a2.coordBaseMode, a2.J(), (boolean)g2);
                }
                case 3: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + c2, a2.coordBaseMode, a2.J(), (boolean)g2);
                }
                case 4: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + c2, a2.coordBaseMode, a2.J(), (boolean)g2);
                }
            }
        }
        return null;
    }

    private int J(List<vv> list) {
        Iterator a2;
        MW_2 mW_2 = this;
        int n2 = uSa.E;
        int b2 = uSa.E;
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            vv vv2 = (vv)a2.next();
            if (vv2.field_78824_d > 0) {
                vv vv3 = vv2;
                if (vv3.field_78827_c < vv3.field_78824_d) {
                    n2 = vRa.d;
                }
            }
            b2 += vv2.field_78826_b;
            iterator = a2;
        }
        if (n2 != 0) {
            return b2;
        }
        return pua.o;
    }

    public static boolean J(Xv a2) {
        if (a2 != null && a2.minY > NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void f(Waa object) {
        MW_2 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    private MW J(cW cW2, List<vv> list, List<uU> list2, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void f2;
        void a2;
        void h2;
        MW_2 mW_2 = this;
        int n6 = mW_2.J((List<vv>)h2);
        int n7 = n6 > 0 && a2 <= Fsa.d ? vRa.d : uSa.E;
        int n8 = uSa.E;
        block0: while (n8 < tTa.h && n7 != 0) {
            ++n8;
            int n9 = f2.nextInt(n6);
            for (MW_2 j2 : h2) {
                void i2;
                if ((n9 -= ((vv)j2).field_78826_b) >= 0) continue;
                if (!j2.J((int)a2) || j2 == i2.theNetherBridgePieceWeight && !((vv)j2).field_78825_e) continue block0;
                MW mW = SW.J((vv)j2, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
                if (mW == null) continue;
                MW_2 mW_22 = j2;
                ((vv)mW_22).field_78827_c += vRa.d;
                i2.theNetherBridgePieceWeight = mW_22;
                if (!mW_22.J()) {
                    h2.remove(j2);
                }
                return mW;
            }
        }
        return wW.J((List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
    }

    public MW_2(int n2) {
        int b2 = n2;
        MW_2 a2 = this;
        super(b2);
    }

    @Override
    public void J(Waa object) {
        MW_2 b2 = object;
        object = this;
    }

    static {
        baa[] baaArray = new baa[lqa.s];
        baaArray[uSa.E] = new baa(Gea.b, uSa.E, vRa.d, yRa.d, tTa.h);
        baaArray[vRa.d] = new baa(Gea.GA, uSa.E, vRa.d, tTa.h, tTa.h);
        baaArray[uqa.g] = new baa(Gea.Bb, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[yRa.d] = new baa(Gea.sa, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[AQa.P] = new baa((eAa)Gea.K, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[tTa.h] = new baa(Gea.S, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[uua.p] = new baa(Gea.qA, uSa.E, yRa.d, XTa.W, tTa.h);
        baaArray[XTa.W] = new baa(Gea.NA, uSa.E, vRa.d, vRa.d, NTa.C);
        baaArray[Yqa.i] = new baa(Gea.Yc, uSa.E, vRa.d, vRa.d, Yqa.i);
        baaArray[WOa.fa] = new baa(Gea.La, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[NTa.C] = new baa(Gea.sd, uSa.E, vRa.d, vRa.d, yRa.d);
        baaArray[pPa.f] = new baa(eAa.J((Block)QFa.X), uSa.E, uqa.g, AQa.P, uqa.g);
        field_111019_a = Lists.newArrayList(baaArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU f(cW cW2, List<uU> list, Random random, int n2, int n3, boolean bl) {
        boolean bl2 = bl;
        MW_2 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (gW.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 1: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + c2, a2.boundingBox.minZ + b2, DZ.WEST, a2.J(), (boolean)g2);
                }
                case 2: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + c2, a2.boundingBox.minZ + b2, DZ.WEST, a2.J(), (boolean)g2);
                }
                case 3: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX + b2, a2.boundingBox.minY + c2, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J(), (boolean)g2);
                }
                case 4: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX + b2, a2.boundingBox.minY + c2, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J(), (boolean)g2);
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU J(cW cW2, List<uU> list, Random random, int n2, int n3, boolean bl) {
        boolean bl2 = bl;
        MW_2 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (gW.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 1: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + c2, a2.boundingBox.minZ + b2, DZ.EAST, a2.J(), (boolean)g2);
                }
                case 2: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + c2, a2.boundingBox.minZ + b2, DZ.EAST, a2.J(), (boolean)g2);
                }
                case 3: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX + b2, a2.boundingBox.minY + c2, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J(), (boolean)g2);
                }
                case 4: {
                    void g2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    void f2;
                    return a2.J((cW)f2, (List<uU>)e2, (Random)d2, a2.boundingBox.minX + b2, a2.boundingBox.minY + c2, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J(), (boolean)g2);
                }
            }
        }
        return null;
    }

    public MW_2() {
        MW_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private uU J(cW cW2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5, boolean bl) {
        void b2;
        void c2;
        void e2;
        void g2;
        void h2;
        void d2;
        void f2;
        MW_2 j2 = cW2;
        MW_2 i2 = this;
        if (Math.abs((int)(f2 - j2.J().minX)) <= BRa.E && Math.abs((int)(d2 - j2.J().minZ)) <= BRa.E) {
            void a2;
            List list2 = ((cW)j2).primaryWeights;
            if (a2 != false) {
                list2 = ((cW)j2).secondaryWeights;
            }
            if ((a2 = i2.J((cW)j2, list2, (List<uU>)h2, (Random)g2, (int)f2, (int)e2, (int)d2, (DZ)c2, (int)(b2 + vRa.d))) != null) {
                h2.add(a2);
                ((cW)j2).field_74967_d.add(a2);
            }
            return a2;
        }
        return wW.J((List<uU>)h2, (Random)g2, (int)f2, (int)e2, (int)d2, (DZ)c2, (int)b2);
    }
}

