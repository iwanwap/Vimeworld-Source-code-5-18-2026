/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  eAa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoor$EnumDoorHalf;
import net.minecraft.block.BlockDoor$EnumHingePosition;
import net.minecraft.block.state.IBlockState;

public final class Efa_3
extends eAa {
    private Block I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void h2;
        void g2;
        Object i2;
        void f5;
        void d2;
        Efa_3 efa_3 = object;
        Object object = xF2;
        Efa_3 e2 = efa_3;
        if (d2 != DZ.UP) {
            return uSa.E != 0;
        }
        if (!f5.J((XF)((Object)i2)).J().f((Gg)f5, (XF)((Object)i2))) {
            i2 = ((XF)((Object)i2)).offset((DZ)d2);
        }
        if (!g2.J((XF)((Object)i2), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        if (!e2.I.J((Gg)f5, (XF)((Object)i2))) {
            return uSa.E != 0;
        }
        Efa_3.J((Gg)f5, (XF)((Object)i2), DZ.fromAngle(g2.X), e2.I);
        h2.E -= vRa.d;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, XF xF2, DZ dZ2, Block block) {
        void a2;
        Gg gg3;
        int n2;
        Gg gg4;
        int n3;
        IBlockState b2;
        void c2;
        Gg gg5 = gg2;
        void v0 = c2;
        XF xF3 = v0.offset(((DZ)((Object)b2)).rotateY());
        Object d322 = v0.offset(((DZ)((Object)b2)).rotateYCCW());
        if (gg5.J((XF)((Object)d322)).J().A()) {
            n3 = vRa.d;
            gg4 = gg5;
        } else {
            n3 = uSa.E;
            gg4 = gg5;
        }
        int n4 = n3 + (gg4.J(d322.up()).J().A() ? vRa.d : uSa.E);
        if (gg5.J(xF3).J().A()) {
            n2 = vRa.d;
            gg3 = gg5;
        } else {
            n2 = uSa.E;
            gg3 = gg5;
        }
        int n5 = n2 + (gg3.J(xF3.up()).J().A() ? vRa.d : uSa.E);
        int n6 = gg5.J((XF)((Object)d322)).J() == a2 || gg5.J(d322.up()).J() == a2 ? vRa.d : uSa.E;
        int d322 = gg5.J(xF3).J() == a2 || gg5.J(xF3.up()).J() == a2 ? vRa.d : uSa.E;
        int n7 = uSa.E;
        if (n6 != 0 && d322 == 0 || n5 > n4) {
            n7 = vRa.d;
        }
        XF d322 = c2.up();
        b2 = a2.J().J(BlockDoor.FACING, b2).J(BlockDoor.HINGE, n7 != 0 ? BlockDoor$EnumHingePosition.RIGHT : BlockDoor$EnumHingePosition.LEFT);
        gg5.J((XF)c2, b2.J(BlockDoor.HALF, BlockDoor$EnumDoorHalf.LOWER), uqa.g);
        gg5.J(d322, b2.J(BlockDoor.HALF, BlockDoor$EnumDoorHalf.UPPER), uqa.g);
        Gg gg6 = gg5;
        gg6.f((XF)c2, (Block)a2);
        gg6.f(d322, (Block)a2);
    }

    public Efa_3(Block block) {
        Efa_3 a2;
        Object b2 = block;
        Efa_3 efa_3 = a2 = this;
        efa_3.I = b2;
        efa_3.J(yGa.I);
    }
}

