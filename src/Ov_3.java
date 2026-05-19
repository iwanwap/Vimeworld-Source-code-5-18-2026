/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Gg
 *  JPa
 *  MQa
 *  Oz
 *  QFa
 *  SQa
 *  XTa
 *  Zpa
 *  bpa
 *  kta
 *  lqa
 *  pua
 *  vQa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockLog$EnumAxis;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ov_3
extends bV {
    public double F;
    public int g;
    public int L;
    public List<Mw> E;
    public double m;
    public int C;
    private XF i;
    private Random M;
    public int k;
    private Gg j;
    public double J;
    public int A;
    public double I;

    public float f(int n2) {
        float f2;
        int b22 = n2;
        Ov_3 a2 = this;
        if ((float)b22 < (float)a2.C * bpa.K) {
            return vqa.T;
        }
        float f3 = (float)a2.C / kta.v;
        float b22 = f3 - (float)b22;
        float f4 = f3;
        float f5 = b22;
        float f6 = Oz.J((float)(f4 * f4 - f5 * f5));
        if (b22 == JPa.N) {
            f2 = f6 = f3;
        } else {
            if (Math.abs(b22) >= f3) {
                return JPa.N;
            }
            f2 = f6;
        }
        return f2 * MQa.L;
    }

    public boolean J(int n2) {
        int b2 = n2;
        Ov_3 a2 = this;
        if ((double)b2 >= (double)a2.C * iSa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J(int n2) {
        int b2 = n2;
        Ov_3 a2 = this;
        if (b2 >= 0 && b2 < a2.A) {
            if (b2 != 0 && b2 != a2.A - vRa.d) {
                return vQa.q;
            }
            return kta.v;
        }
        return vqa.T;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, XF xF3) {
        int c2;
        void b2;
        XF a22;
        Ov_3 ov_3 = this;
        a22 = a22.add(-b2.getX(), -b2.getY(), -b2.getZ());
        int n2 = ov_3.J(a22);
        XF xF4 = a22;
        float a22 = (float)xF4.getX() / (float)n2;
        float f2 = (float)xF4.getY() / (float)n2;
        float f3 = (float)xF4.getZ() / (float)n2;
        if (n2 == 0) {
            return pua.o;
        }
        int n3 = c2 = uSa.E;
        while (n3 <= n2) {
            XF xF5 = b2.add(MQa.L + (float)c2 * a22, MQa.L + (float)c2 * f2, MQa.L + (float)c2 * f3);
            Ov_3 ov_32 = ov_3;
            if (!ov_32.J(ov_32.j.J(xF5).J())) {
                return c2;
            }
            n3 = ++c2;
        }
        return pua.o;
    }

    private boolean J() {
        Ov_3 ov_3;
        Ov_3 ov_32 = ov_3 = this;
        Object a22 = ov_32.j.J(ov_32.i.down()).J();
        if (a22 != QFa.Bc && a22 != QFa.lf && a22 != QFa.rd) {
            return uSa.E != 0;
        }
        Ov_3 ov_33 = ov_3;
        int a22 = ov_33.J(ov_33.i, ov_33.i.up(ov_3.C - vRa.d));
        if (a22 == pua.o) {
            return vRa.d != 0;
        }
        if (a22 < uua.p) {
            return uSa.E != 0;
        }
        ov_3.C = a22;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private BlockLog$EnumAxis J(XF xF2, XF xF3) {
        void a22;
        Object c2 = xF2;
        Ov_3 b2 = this;
        BlockLog$EnumAxis blockLog$EnumAxis = BlockLog$EnumAxis.Y;
        void v0 = a22;
        int a22 = Math.abs(v0.getX() - c2.getX());
        int n2 = Math.max(a22, c2 = Math.abs(v0.getZ() - c2.getZ()));
        if (n2 > 0) {
            if (a22 == n2) {
                blockLog$EnumAxis = BlockLog$EnumAxis.X;
                return blockLog$EnumAxis;
            }
            if (c2 == n2) {
                blockLog$EnumAxis = BlockLog$EnumAxis.Z;
            }
        }
        return blockLog$EnumAxis;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void b2;
        void c2;
        Ov_3 a2;
        Object d2 = xF2;
        Ov_3 ov_3 = a2 = this;
        ov_3.j = c2;
        ov_3.i = d2;
        ov_3.M = new Random(b2.nextLong());
        if (a2.C == 0) {
            a2.C = tTa.h + a2.M.nextInt(a2.g);
        }
        if (!a2.J()) {
            return uSa.E != 0;
        }
        Ov_3 ov_32 = a2;
        ov_32.f();
        ov_32.C();
        ov_32.l();
        ov_32.d();
        return vRa.d != 0;
    }

    private int J(XF xF2) {
        Object b22 = xF2;
        Ov_3 a2 = this;
        Object object = b22;
        int b22 = Oz.f((int)object.getX());
        int n2 = Oz.f((int)object.getY());
        int n3 = Oz.f((int)object.getZ());
        if (n3 > b22 && n3 > n2) {
            return n3;
        }
        if (n2 > b22) {
            return n2;
        }
        return b22;
    }

    public Ov_3(boolean bl2) {
        boolean b2 = bl2;
        Ov_3 a2 = this;
        super(b2);
        a2.i = XF.ORIGIN;
        a2.F = Zpa.P;
        a2.m = kua.V;
        a2.J = oua.i;
        a2.I = oua.i;
        a2.L = vRa.d;
        a2.g = lqa.s;
        a2.A = AQa.P;
    }

    public void d() {
        Ov_3 ov_3 = this;
        for (Mw mw2 : ov_3.E) {
            int a2 = mw2.func_177999_q();
            XF xF2 = new XF(ov_3.i.getX(), a2, ov_3.i.getZ());
            if (xF2.equals((Object)mw2)) continue;
            Ov_3 ov_32 = ov_3;
            if (!ov_32.J(a2 - ov_32.i.getY())) continue;
            ov_3.J(xF2, mw2, QFa.UA);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, XF xF3, Block block) {
        int n2;
        void c2;
        Object d22 = xF3;
        Ov_3 b2 = this;
        d22 = ((XF)((Object)d22)).add(-c2.getX(), -c2.getY(), -c2.getZ());
        int n3 = b2.J((XF)((Object)d22));
        Object object = d22;
        float d22 = (float)object.getX() / (float)n3;
        float f2 = (float)object.getY() / (float)n3;
        float f3 = (float)object.getZ() / (float)n3;
        int n4 = n2 = uSa.E;
        while (n4 <= n3) {
            void a2;
            XF xF4 = c2.add(MQa.L + (float)n2 * d22, MQa.L + (float)n2 * f2, MQa.L + (float)n2 * f3);
            Ov_3 ov_3 = b2;
            BlockLog$EnumAxis blockLog$EnumAxis = ov_3.J((XF)c2, xF4);
            ov_3.J(ov_3.j, xF4, a2.J().J(BlockLog.LOG_AXIS, blockLog$EnumAxis));
            n4 = ++n2;
        }
    }

    public void J() {
        a.A = tTa.h;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2) {
        int b2;
        Ov_3 ov_3 = this;
        int n2 = b2 = uSa.E;
        while (n2 < ov_3.A) {
            void a2;
            Ov_3 ov_32 = ov_3;
            ov_32.J(a2.up(++b2), ov_32.J(b2), QFa.vd.J().J(BlockLeaves.CHECK_DECAY, uSa.E != 0));
            n2 = b2;
        }
    }

    public void C() {
        Ov_3 ov_3 = this;
        Iterator<Mw> a2 = ov_3.E.iterator();
        Object object = a2;
        while (object.hasNext()) {
            Mw mw2 = (Mw)((Object)a2.next());
            object = a2;
            ov_3.J(mw2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, float f2, IBlockState iBlockState) {
        int n2;
        void b2;
        Ov_3 ov_3 = this;
        int n3 = (int)((double)b2 + Zpa.P);
        int n4 = n2 = -n3;
        while (n4 <= n3) {
            int n5 = -n3;
            while (n5 <= n3) {
                void c2;
                XF xF3;
                Material material;
                int d2;
                void v2 = b2;
                if (Math.pow((double)Math.abs(n2) + kTa.B, KPa.y) + Math.pow((double)Math.abs(d2) + kTa.B, KPa.y) <= (double)(v2 * v2) && ((material = ov_3.j.J(xF3 = c2.add(n2, uSa.E, d2)).J().J()) == Material.air || material == Material.leaves)) {
                    void a2;
                    Ov_3 ov_32 = ov_3;
                    ov_32.J(ov_32.j, xF3, (IBlockState)a2);
                }
                n5 = ++d2;
            }
            n4 = ++n2;
        }
    }

    public void l() {
        Ov_3 ov_3;
        Ov_3 ov_32 = ov_3 = this;
        XF xF2 = ov_32.i;
        Ov_3 ov_33 = ov_3;
        XF xF3 = ov_32.i.up(ov_33.k);
        Object a2 = QFa.UA;
        ov_33.J(xF2, xF3, (Block)a2);
        if (ov_32.L == uqa.g) {
            Ov_3 ov_34 = ov_3;
            XF xF4 = xF2;
            ov_3.J(xF4.east(), xF3.east(), (Block)a2);
            ov_34.J(xF4.east().south(), xF3.east().south(), (Block)a2);
            ov_34.J(xF2.south(), xF3.south(), (Block)a2);
        }
    }

    public void f() {
        int n2;
        Ov_3 ov_3;
        Ov_3 ov_32 = ov_3 = this;
        ov_3.k = (int)((double)ov_32.C * ov_3.F);
        if (ov_32.k >= ov_3.C) {
            ov_3.k = ov_3.C - vRa.d;
        }
        if ((n2 = (int)(BRa.D + Math.pow(ov_3.I * (double)ov_3.C / SQa.t, KPa.y))) < vRa.d) {
            n2 = vRa.d;
        }
        Ov_3 ov_33 = ov_3;
        int n3 = ov_33.i.getY() + ov_3.k;
        int n4 = ov_33.C - ov_3.A;
        ov_3.E = Lists.newArrayList();
        ov_33.E.add(new Mw(ov_3.i.up(n4), n3));
        int n5 = n4;
        while (n5 >= 0) {
            float f2;
            float f3 = ov_3.f(n4);
            if (f2 >= JPa.N) {
                int n6 = uSa.E;
                while (n6 < n2) {
                    int n7;
                    Ov_3 ov_34 = ov_3;
                    Ov_3 ov_35 = ov_3;
                    double d2 = ov_34.J * (double)f3 * ((double)ov_35.M.nextFloat() + XTa.ja);
                    double d3 = (double)(ov_35.M.nextFloat() * kta.v) * lQa.f;
                    double d4 = d2 * Math.sin(d3) + kTa.B;
                    XF xF2 = ov_34.i.add(d4, (double)(n4 - vRa.d), d2 = d2 * Math.cos(d3) + kTa.B);
                    if (ov_34.J(xF2, xF2.up(ov_3.A)) == pua.o) {
                        double d5;
                        Ov_3 ov_36 = ov_3;
                        XF xF3 = xF2;
                        int a22 = ov_36.i.getX() - xF3.getX();
                        int n8 = ov_36.i.getZ() - xF2.getZ();
                        int n9 = a22;
                        int n10 = n8;
                        d2 = (double)xF3.getY() - Math.sqrt(n9 * n9 + n10 * n10) * ov_3.m;
                        a22 = d5 > (double)n3 ? n3 : (int)d2;
                        Object a22 = new XF(ov_3.i.getX(), a22, ov_3.i.getZ());
                        if (ov_3.J((XF)((Object)a22), xF2) == pua.o) {
                            ov_3.E.add(new Mw(xF2, a22.getY()));
                        }
                    }
                    n6 = ++n7;
                }
            }
            n5 = --n4;
        }
    }
}

