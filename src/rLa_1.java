/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Kpa
 *  Lra
 *  MQa
 *  Ola
 *  QFa
 *  QJa
 *  XTa
 *  aKa
 *  aSa
 *  kpa
 *  mka
 *  nLa
 *  nZ
 *  pKa
 *  pqa
 *  uKa
 *  vRa
 */
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class rLa_1
extends Ola<nZ> {
    private final QJa I = Kpa.J().J();

    /*
     * WARNING - void declaration
     */
    public void J(nZ nZ2, double d2, double d3, double d4, float f2, int n2) {
        void b2;
        void f3;
        int n3 = n2;
        rLa_1 a2 = this;
        void v0 = f3;
        XF g2 = v0.J();
        IBlockState iBlockState = v0.J();
        Object object = iBlockState.J();
        if (object.J() != Material.air && f3.f((float)b2) < pqa.r) {
            aKa aKa2;
            void c2;
            void d5;
            void e2;
            aKa aKa3;
            pKa pKa2 = pKa.J();
            aKa aKa4 = pKa2.J();
            a2.J(WKa.C);
            nLa.C();
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.B();
            uKa.m();
            if (Kpa.k()) {
                uKa.F((int)gua.X);
                aKa3 = aKa4;
            } else {
                uKa.F((int)Zra.f);
                aKa3 = aKa4;
            }
            aKa3.J(XTa.W, mka.j);
            aKa4.f((double)((float)e2 - (float)g2.getX() + f3.J((float)b2)), (double)((float)d5 - (float)g2.getY() + f3.C((float)b2)), (double)((float)c2 - (float)g2.getZ() + f3.l((float)b2)));
            Gg gg2 = a2.J();
            if (object == QFa.OD && f3.f((float)b2) < MQa.L) {
                iBlockState = iBlockState.J(BlockPistonExtension.SHORT, vRa.d != 0);
                aKa2 = aKa4;
                Gg gg3 = gg2;
                a2.I.J().J((I)gg3, a2.I.J(iBlockState, (I)gg3, g2), iBlockState, g2, aKa4, vRa.d != 0);
            } else if (f3.l() && !f3.J()) {
                object = object == QFa.bF ? BlockPistonExtension$EnumPistonType.STICKY : BlockPistonExtension$EnumPistonType.DEFAULT;
                object = QFa.OD.J().J(BlockPistonExtension.TYPE, object).J(BlockPistonExtension.FACING, iBlockState.J(BlockPistonBase.FACING));
                object = object.J(BlockPistonExtension.SHORT, (f3.f((float)b2) >= MQa.L ? vRa.d : uSa.E) != 0);
                Gg gg4 = gg2;
                aKa aKa5 = aKa4;
                a2.I.J().J((I)gg4, a2.I.J((IBlockState)object, (I)gg4, g2), (IBlockState)object, g2, aKa4, vRa.d != 0);
                aKa2 = aKa5;
                aKa5.f((double)((float)e2 - (float)g2.getX()), (double)((float)d5 - (float)g2.getY()), (double)((float)c2 - (float)g2.getZ()));
                iBlockState.J(BlockPistonBase.EXTENDED, vRa.d != 0);
                Gg gg5 = gg2;
                a2.I.J().J((I)gg5, a2.I.J(iBlockState, (I)gg5, g2), iBlockState, g2, aKa4, vRa.d != 0);
            } else {
                Gg gg6 = gg2;
                a2.I.J().J((I)gg6, a2.I.J(iBlockState, (I)gg6, g2), iBlockState, g2, aKa4, uSa.E != 0);
                aKa2 = aKa4;
            }
            aKa2.f(aSa.V, aSa.V, aSa.V);
            pKa2.J();
            nLa.f();
        }
    }

    public rLa_1() {
        rLa_1 a2;
    }
}

