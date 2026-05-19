/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  Gg
 *  I
 *  Kpa
 *  MQa
 *  QJa
 *  RA
 *  XTa
 *  aKa
 *  aSa
 *  aga
 *  hy
 *  mka
 *  pKa
 *  uKa
 *  vL
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

public final class Vka_2
extends GC<aga> {
    public ResourceLocation J(aga aga2) {
        Vka_2 b2 = aga2;
        Vka_2 a2 = this;
        return WKa.C;
    }

    public Vka_2(oLa oLa2) {
        Object b2 = oLa2;
        Vka_2 a2 = this;
        super((oLa)b2);
        a2.I = MQa.L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(aga aga2, double d2, double d3, double d4, float f2, float f3) {
        void f4;
        Vka_2 vka_2 = this;
        if (f4.J() != null) {
            vka_2.J(WKa.C);
            IBlockState iBlockState = f4.J();
            Block block = iBlockState.J();
            void v0 = f4;
            Object g2 = new XF((vL)v0);
            Gg gg2 = v0.f();
            if (iBlockState != gg2.J((XF)((Object)g2)) && block.J() != hy.INVISIBLE && block.J() == hy.MODEL) {
                void a2;
                void b2;
                void c2;
                void d5;
                void e2;
                uKa.e();
                uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
                uKa.L();
                block = pKa.J();
                aKa aKa2 = block.J();
                Object object = g2;
                aKa aKa3 = aKa2;
                aKa3.J(XTa.W, mka.j);
                int n2 = g2.getX();
                int n3 = object.getY();
                int n4 = object.getZ();
                aKa3.f((double)((float)(-n2) - MQa.L), (double)(-n3), (double)((float)(-n4) - MQa.L));
                QJa qJa2 = Kpa.J().J();
                RA rA2 = qJa2.J(iBlockState, (I)gg2, (XF)null);
                qJa2.J().J((I)gg2, rA2, iBlockState, (XF)((Object)g2), aKa2, uSa.E != 0);
                aKa2.f(aSa.V, aSa.V, aSa.V);
                block.J();
                uKa.P();
                uKa.D();
                super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
            }
        }
    }
}

