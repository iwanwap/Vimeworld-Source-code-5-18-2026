/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GDa
 *  Gg
 *  JPa
 *  QFa
 *  Waa
 *  Xv
 *  fv
 *  iU
 *  oA
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public abstract class KV_3
extends uU {
    public fv field_175830_k;
    public static final IBlockState field_175824_d;
    public static final IBlockState field_175825_e;
    public static final IBlockState field_175826_b;
    public static final int field_175823_g;
    public static final IBlockState field_175822_f;
    public static final int field_175829_j;
    public static final IBlockState field_175827_c;
    public static final int field_175832_i;
    public static final int field_175831_h;
    public static final IBlockState field_175828_a;

    @Override
    public void J(Waa object) {
        KV_3 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Xv xv, int n2, int n3, int n4) {
        int b2;
        void a2;
        int c2;
        KV_3 d2;
        KV_3 f2 = xv;
        KV_3 kV_3 = d2 = this;
        int n5 = kV_3.J(c2, (int)a2);
        b2 = kV_3.J(b2);
        c2 = kV_3.f(c2, (int)a2);
        if (f2.J(new XF(n5, b2, c2))) {
            void e2;
            KV_3 kV_32 = f2 = new GDa((Gg)e2);
            KV_3 kV_33 = f2;
            kV_33.k(vRa.d != 0);
            kV_33.e(kV_33.J());
            kV_32.f((double)n5 + kTa.B, b2, (double)c2 + kTa.B, JPa.N, JPa.N);
            kV_32.J(e2.J(new XF((vL)f2)), (oA)null);
            e2.f((vL)f2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void f(Waa object) {
        KV_3 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Xv xv, int n2, int n3, int n4, int n5) {
        void a2;
        int f2;
        int c2;
        int d2;
        KV_3 b2;
        int n6 = n4;
        KV_3 kV_3 = b2 = this;
        int e2 = kV_3.J(d2, c2);
        d2 = kV_3.f(d2, c2);
        c2 = kV_3.J(f2, (int)a2);
        f2 = kV_3.f(f2, (int)a2);
        return e2.J(Math.min(e2, c2), Math.min(d2, f2), Math.max(e2, c2), Math.max(d2, f2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        void c2;
        void j2;
        int n8 = n3;
        KV_3 f2 = this;
        void v0 = j2 = j2;
        while (v0 <= c2) {
            void d2;
            void g2;
            void v1 = g2;
            while (v1 <= d2) {
                void var10_12;
                void b2;
                void e2;
                void v2 = e2;
                while (v2 <= b2) {
                    void h;
                    void var11_13;
                    void i2;
                    void a2;
                    if (a2 == false || f2.J((Gg)i2, (int)var10_12, (int)j2, (int)var11_13, (Xv)h).J().J() != Material.air) {
                        if (f2.J((int)j2) >= i2.M()) {
                            f2.f((Gg)i2, QFa.HF.J(), (int)var10_12, (int)j2, (int)var11_13, (Xv)h);
                        } else {
                            f2.f((Gg)i2, field_175822_f, (int)var10_12, (int)j2, (int)var11_13, (Xv)h);
                        }
                    }
                    v2 = ++var11_13;
                }
                v1 = ++var10_12;
            }
            v0 = ++j2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final int J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        return (int)(b2 * kTa.g + c2 * tTa.h + a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv, int n2, int n3, boolean bl) {
        void f2;
        void c2;
        void d2;
        void e2;
        void a2;
        int n4 = n3;
        KV_3 b2 = this;
        if (a2 != false) {
            KV_3 kV_3 = b2;
            void v1 = e2;
            void v2 = d2;
            KV_3 kV_32 = b2;
            void v4 = e2;
            void v5 = d2;
            b2.J((Gg)e2, (Xv)v5, (int)(c2 + uSa.E), uSa.E, (int)(f2 + uSa.E), (int)(c2 + uqa.g), uSa.E, (int)(f2 + Yqa.i - vRa.d), field_175828_a, field_175828_a, uSa.E != 0);
            b2.J((Gg)v4, (Xv)v5, (int)(c2 + tTa.h), uSa.E, (int)(f2 + uSa.E), (int)(c2 + Yqa.i - vRa.d), uSa.E, (int)(f2 + Yqa.i - vRa.d), field_175828_a, field_175828_a, uSa.E != 0);
            kV_32.J((Gg)v4, (Xv)d2, (int)(c2 + yRa.d), uSa.E, (int)(f2 + uSa.E), (int)(c2 + AQa.P), uSa.E, (int)(f2 + uqa.g), field_175828_a, field_175828_a, uSa.E != 0);
            kV_32.J((Gg)e2, (Xv)d2, (int)(c2 + yRa.d), uSa.E, (int)(f2 + tTa.h), (int)(c2 + AQa.P), uSa.E, (int)(f2 + Yqa.i - vRa.d), field_175828_a, field_175828_a, uSa.E != 0);
            b2.J((Gg)e2, (Xv)v2, (int)(c2 + yRa.d), uSa.E, (int)(f2 + uqa.g), (int)(c2 + AQa.P), uSa.E, (int)(f2 + uqa.g), field_175826_b, field_175826_b, uSa.E != 0);
            b2.J((Gg)v1, (Xv)v2, (int)(c2 + yRa.d), uSa.E, (int)(f2 + tTa.h), (int)(c2 + AQa.P), uSa.E, (int)(f2 + tTa.h), field_175826_b, field_175826_b, uSa.E != 0);
            kV_3.J((Gg)v1, (Xv)d2, (int)(c2 + uqa.g), uSa.E, (int)(f2 + yRa.d), (int)(c2 + uqa.g), uSa.E, (int)(f2 + AQa.P), field_175826_b, field_175826_b, uSa.E != 0);
            kV_3.J((Gg)e2, (Xv)d2, (int)(c2 + tTa.h), uSa.E, (int)(f2 + yRa.d), (int)(c2 + tTa.h), uSa.E, (int)(f2 + AQa.P), field_175826_b, field_175826_b, uSa.E != 0);
            return;
        }
        b2.J((Gg)e2, (Xv)d2, (int)(c2 + uSa.E), uSa.E, (int)(f2 + uSa.E), (int)(c2 + Yqa.i - vRa.d), uSa.E, (int)(f2 + Yqa.i - vRa.d), field_175828_a, field_175828_a, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public KV_3(int n2, DZ dZ2, fv fv2, int n3, int n4, int n5) {
        void c2;
        void b2;
        void a2;
        void d22;
        void e2;
        int g2 = n2;
        KV_3 f2 = this;
        super(g2);
        f2.coordBaseMode = e2;
        f2.field_175830_k = d22;
        g2 = f2.field_175830_k.field_175967_a;
        int d22 = g2 % tTa.h;
        int n6 = g2 / tTa.h % tTa.h;
        g2 /= kTa.g;
        if (e2 != DZ.NORTH && e2 != DZ.SOUTH) {
            KV_3 kV_3 = f2;
            kV_3.boundingBox = new Xv(uSa.E, uSa.E, uSa.E, (int)(a2 * Yqa.i - vRa.d), (int)(b2 * AQa.P - vRa.d), (int)(c2 * Yqa.i - vRa.d));
        } else {
            f2.boundingBox = new Xv(uSa.E, uSa.E, uSa.E, (int)(c2 * Yqa.i - vRa.d), (int)(b2 * AQa.P - vRa.d), (int)(a2 * Yqa.i - vRa.d));
        }
        switch (iU.$SwitchMap$net$minecraft$util$EnumFacing[e2.ordinal()]) {
            case 1: {
                f2.boundingBox.J(d22 * Yqa.i, g2 * AQa.P, -(n6 + a2) * Yqa.i + vRa.d);
                return;
            }
            case 2: {
                f2.boundingBox.J(d22 * Yqa.i, g2 * AQa.P, n6 * Yqa.i);
                return;
            }
            case 3: {
                f2.boundingBox.J(-(n6 + a2) * Yqa.i + vRa.d, g2 * AQa.P, d22 * Yqa.i);
                return;
            }
        }
        f2.boundingBox.J(n6 * Yqa.i, g2 * AQa.P, d22 * Yqa.i);
    }

    public KV_3() {
        super(uSa.E);
        KV_3 a2;
    }

    public KV_3(int n2) {
        int b2 = n2;
        KV_3 a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    public KV_3(DZ dZ2, Xv xv) {
        void b2;
        KV_3 a2;
        KV_3 c2 = xv;
        KV_3 kV_3 = a2 = this;
        super(vRa.d);
        kV_3.coordBaseMode = b2;
        kV_3.boundingBox = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState) {
        void c2;
        void j2;
        int n8 = n3;
        KV_3 f2 = this;
        void v0 = j2 = j2;
        while (v0 <= c2) {
            void d2;
            void g2;
            void v1 = g2;
            while (v1 <= d2) {
                void var10_12;
                void b2;
                void e2;
                void v2 = e2;
                while (v2 <= b2) {
                    void h;
                    void var11_13;
                    void i2;
                    if (f2.J((Gg)i2, (int)var10_12, (int)j2, (int)var11_13, (Xv)h) == field_175822_f) {
                        void a2;
                        f2.f((Gg)i2, (IBlockState)a2, (int)var10_12, (int)j2, (int)var11_13, (Xv)h);
                    }
                    v2 = ++var11_13;
                }
                v1 = ++var10_12;
            }
            v0 = ++j2;
        }
    }

    static {
        field_175828_a = QFa.xd.J(BlockPrismarine.ROUGH_META);
        field_175826_b = QFa.xd.J(BlockPrismarine.BRICKS_META);
        field_175827_c = QFa.xd.J(BlockPrismarine.DARK_META);
        field_175824_d = field_175826_b;
        field_175825_e = QFa.NA.J();
        field_175822_f = QFa.sc.J();
        field_175823_g = KV_3.J(uqa.g, uSa.E, uSa.E);
        field_175831_h = KV_3.J(uqa.g, uqa.g, uSa.E);
        field_175832_i = KV_3.J(uSa.E, vRa.d, uSa.E);
        field_175829_j = KV_3.J(AQa.P, vRa.d, uSa.E);
    }
}

