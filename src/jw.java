/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MQa
 *  Oz
 *  QFa
 *  YSa
 *  kta
 *  mw
 *  pua
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.BlockVine;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;

public final class jw
extends mw {
    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        void a2;
        void b2;
        jw c2;
        jw d2 = gg2;
        jw jw2 = c2 = this;
        int n3 = jw2.J((Random)b2);
        if (!jw2.J((Gg)d2, (Random)b2, (XF)a2, n3)) {
            return uSa.E != 0;
        }
        c2.l((Gg)d2, a2.up(n3), uqa.g);
        int n4 = n2 = a2.getY() + n3 - uqa.g - b2.nextInt(AQa.P);
        while (n4 > a2.getY() + n3 / uqa.g) {
            int n5;
            float f2 = b2.nextFloat() * pua.j * kta.v;
            int n6 = a2.getX() + (int)(MQa.L + Oz.C((float)f2) * YSa.G);
            int n7 = a2.getZ() + (int)(MQa.L + Oz.d((float)f2) * YSa.G);
            int n8 = n5 = uSa.E;
            while (n8 < tTa.h) {
                void v3 = a2;
                n6 = v3.getX() + (int)(Ira.d + Oz.C((float)f2) * (float)n5);
                n7 = v3.getZ() + (int)(Ira.d + Oz.d((float)f2) * (float)n5);
                XF xF2 = new XF(n6, n2 - yRa.d + n5 / uqa.g, n7);
                jw jw3 = c2;
                jw3.J((Gg)d2, xF2, jw3.I);
                n8 = ++n5;
            }
            n5 = vRa.d + b2.nextInt(uqa.g);
            int n9 = n2;
            int n10 = n2 - n5;
            while (n10 <= n9) {
                int n11;
                int n12 = n11 - n9;
                XF xF3 = new XF(n6, n11, n7);
                c2.J((Gg)d2, xF3, vRa.d - n12);
                n10 = ++n11;
            }
            n4 = n2 - (uqa.g + b2.nextInt(AQa.P));
        }
        int n13 = n2 = uSa.E;
        while (n13 < n3) {
            XF xF4 = a2.up(n2);
            if (c2.J(d2.J(xF4).J())) {
                jw jw4 = c2;
                jw4.J((Gg)d2, xF4, jw4.I);
                if (n2 > 0) {
                    jw jw5 = c2;
                    jw5.J((Gg)d2, (Random)b2, xF4.west(), BlockVine.EAST);
                    jw5.J((Gg)d2, (Random)b2, xF4.north(), BlockVine.SOUTH);
                }
            }
            if (n2 < n3 - vRa.d) {
                XF xF5;
                XF xF6;
                XF xF7 = xF4.east();
                if (c2.J(d2.J(xF7).J())) {
                    jw jw6 = c2;
                    jw6.J((Gg)d2, xF7, jw6.I);
                    if (n2 > 0) {
                        jw jw7 = c2;
                        jw7.J((Gg)d2, (Random)b2, xF7.east(), BlockVine.WEST);
                        jw7.J((Gg)d2, (Random)b2, xF7.north(), BlockVine.SOUTH);
                    }
                }
                if (c2.J(d2.J(xF6 = xF4.south().east()).J())) {
                    jw jw8 = c2;
                    jw8.J((Gg)d2, xF6, jw8.I);
                    if (n2 > 0) {
                        jw jw9 = c2;
                        jw9.J((Gg)d2, (Random)b2, xF6.east(), BlockVine.WEST);
                        jw9.J((Gg)d2, (Random)b2, xF6.south(), BlockVine.NORTH);
                    }
                }
                if (c2.J(d2.J(xF5 = xF4.south()).J())) {
                    jw jw10 = c2;
                    jw10.J((Gg)d2, xF5, jw10.I);
                    if (n2 > 0) {
                        jw jw11 = c2;
                        jw11.J((Gg)d2, (Random)b2, xF5.west(), BlockVine.EAST);
                        jw11.J((Gg)d2, (Random)b2, xF5.south(), BlockVine.NORTH);
                    }
                }
            }
            n13 = ++n2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public jw(boolean bl, int n2, int n3, IBlockState iBlockState, IBlockState iBlockState2) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        jw jw2 = object;
        Object object = iBlockState2;
        jw a2 = jw2;
        super((boolean)e2, (int)d2, (int)c2, (IBlockState)b2, (IBlockState)f2);
    }

    /*
     * WARNING - void declaration
     */
    private void l(Gg gg2, XF xF, int n2) {
        int d2;
        jw jw2 = this;
        int n3 = d2 = -uqa.g;
        while (n3 <= 0) {
            void a2;
            void b2;
            void c2;
            jw2.f((Gg)c2, b2.up(d2), (int)(a2 + vRa.d - d2++));
            n3 = d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, Random random, XF xF, PropertyBool propertyBool) {
        void d2;
        void c2;
        Object e2 = xF;
        jw b2 = this;
        if (c2.nextInt(yRa.d) > 0 && d2.J((XF)((Object)e2))) {
            void a2;
            b2.J((Gg)d2, (XF)((Object)e2), QFa.vC.J().J(a2, vRa.d != 0));
        }
    }
}

