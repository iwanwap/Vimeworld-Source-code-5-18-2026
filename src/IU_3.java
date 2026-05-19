/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MD
 *  Oz
 *  QFa
 *  Uw
 *  Waa
 *  XTa
 *  Xv
 *  pW
 *  vRa
 *  ysa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public final class IU_3
extends pW {
    private int length;

    /*
     * WARNING - void declaration
     */
    public IU_3(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        IU_3 f2;
        void a2;
        void d2;
        void e2;
        IU_3 b2;
        IU_3 iU_3 = iU_32;
        IU_3 iU_32 = xv2;
        IU_3 iU_33 = b2 = iU_3;
        super((Uw)e2, (int)d2);
        b2.coordBaseMode = a2;
        iU_33.boundingBox = f2;
        iU_33.length = Math.max(f2.J(), f2.l());
    }

    /*
     * Unable to fully structure code
     */
    public void J(uU var1_1, List<uU> var2_2, Random var3_3) {
        block18: {
            d = var3_3;
            a = this;
            var4_4 = uSa.E;
            v0 = var5_5 = d.nextInt(tTa.h);
            while (v0 < a.length - Yqa.i) {
                var6_6 = a.f((Uw)c, (List)b, d, uSa.E, var5_5);
                if (var6_6 != null) {
                    var5_5 += Math.max(var6_6.boundingBox.J(), var6_6.boundingBox.l());
                    var4_4 = vRa.d;
                }
                v0 = var5_5 + (uqa.g + d.nextInt(tTa.h));
            }
            v1 = var5_5 = d.nextInt(tTa.h);
            while (v1 < a.length - Yqa.i) {
                var6_6 = a.J((Uw)c, (List)b, d, uSa.E, var5_5);
                if (var6_6 != null) {
                    var5_5 += Math.max(var6_6.boundingBox.J(), var6_6.boundingBox.l());
                    var4_4 = vRa.d;
                }
                v1 = var5_5 + (uqa.g + d.nextInt(tTa.h));
            }
            if (var4_4 == 0 || d.nextInt(yRa.d) <= 0 || a.coordBaseMode == null) ** GOTO lbl-1000
            switch (zw.$SwitchMap$net$minecraft$util$EnumFacing[a.coordBaseMode.ordinal()]) lbl-1000:
            // 2 sources

            {
                case 1: {
                    if (false) ** GOTO lbl-1000
                    pw.f((Uw)c, (List)b, d, a.boundingBox.minX - vRa.d, a.boundingBox.minY, a.boundingBox.minZ, DZ.WEST, a.J());
                    v2 = var4_4;
                    break;
                }
                case 2: {
                    pw.f((Uw)c, (List)b, d, a.boundingBox.minX - vRa.d, a.boundingBox.minY, a.boundingBox.maxZ - uqa.g, DZ.WEST, a.J());
                    v2 = var4_4;
                    break;
                }
                case 3: {
                    pw.f((Uw)c, (List)b, d, a.boundingBox.minX, a.boundingBox.minY, a.boundingBox.minZ - vRa.d, DZ.NORTH, a.J());
                    v2 = var4_4;
                    break;
                }
                case 4: {
                    pw.f((Uw)c, (List)b, d, a.boundingBox.maxX - uqa.g, a.boundingBox.minY, a.boundingBox.minZ - vRa.d, DZ.NORTH, a.J());
                }
                default: lbl-1000:
                // 2 sources

                {
                    v2 = var4_4;
                }
            }
            if (v2 == 0 || d.nextInt(yRa.d) <= 0 || a.coordBaseMode == null) break block18;
            switch (zw.$SwitchMap$net$minecraft$util$EnumFacing[a.coordBaseMode.ordinal()]) lbl-1000:
            // 2 sources

            {
                case 1: {
                    if (false) ** GOTO lbl-1000
                    pw.f((Uw)c, (List)b, d, a.boundingBox.maxX + vRa.d, a.boundingBox.minY, a.boundingBox.minZ, DZ.EAST, a.J());
                    return;
                }
                case 2: {
                    pw.f((Uw)c, (List)b, d, a.boundingBox.maxX + vRa.d, a.boundingBox.minY, a.boundingBox.maxZ - uqa.g, DZ.EAST, a.J());
                    return;
                }
                case 3: {
                    pw.f((Uw)c, (List)b, d, a.boundingBox.minX, a.boundingBox.minY, a.boundingBox.maxZ + vRa.d, DZ.SOUTH, a.J());
                    return;
                }
                case 4: {
                    pw.f((Uw)c, (List)b, d, a.boundingBox.maxX - uqa.g, a.boundingBox.minY, a.boundingBox.maxZ + vRa.d, DZ.SOUTH, a.J());
                }
            }
        }
    }

    public void f(Waa waa2) {
        IU_3 b2 = waa2;
        IU_3 a2 = this;
        IU_3 iU_3 = b2;
        super.f((Waa)iU_3);
        iU_3.J(tpa.R, a2.length);
    }

    /*
     * WARNING - void declaration
     */
    public static Xv J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2) {
        Object g2 = random;
        Uw e2 = uw2;
        int n5 = g2 = XTa.W * Oz.J((Random)g2, (int)yRa.d, (int)tTa.h);
        while (n5 >= XTa.W) {
            void f2;
            void a2;
            void b2;
            void c2;
            void d2;
            Xv xv2 = Xv.J((int)d2, (int)c2, (int)b2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)yRa.d, (int)yRa.d, (int)g2, (DZ)a2);
            if (uU.J((List<uU>)f2, xv2) == null) {
                return xv2;
            }
            n5 = g2 -= 7;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        IU_3 iU_3;
        IU_3 iU_32 = iU_3 = this;
        IBlockState b2 = iU_32.J(QFa.Q.J());
        IBlockState iBlockState = iU_32.J(QFa.yB.J());
        int n3 = n2 = iU_32.boundingBox.minX;
        while (n3 <= iU_3.boundingBox.maxX) {
            int n4 = iU_3.boundingBox.minZ;
            while (n4 <= iU_3.boundingBox.maxZ) {
                void a2;
                int n5;
                Object d2 = new XF(n2, ysa.s, n5);
                if (a2.J((MD)d2)) {
                    void c2;
                    void v3 = c2;
                    d2 = v3.f((XF)((Object)d2)).down();
                    v3.J((XF)((Object)d2), b2, uqa.g);
                    c2.J(((XF)((Object)d2)).down(), iBlockState, uqa.g);
                }
                n4 = ++n5;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public void J(Waa waa2) {
        IU_3 b2 = waa2;
        IU_3 a2 = this;
        super.J((Waa)b2);
        a2.length = b2.J(tpa.R);
    }

    public IU_3() {
        IU_3 a2;
    }
}

