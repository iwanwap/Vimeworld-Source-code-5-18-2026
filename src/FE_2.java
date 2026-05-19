/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  QFa
 *  RA
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLever$EnumOrientation;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FE_2 {
    private static RA I = null;

    public FE_2() {
        FE_2 a2;
    }

    public static RA J() {
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(I i2, Block block, IBlockState iBlockState, XF xF2) {
        void b2;
        void c2;
        Object d2 = xF2;
        I a2 = i2;
        if (!FE_2.J((Block)c2, (IBlockState)b2)) {
            return uSa.E != 0;
        }
        return FE_2.J(a2, (XF)((Object)d2));
    }

    public static void J() {
        I = Config.J().J().J().J(QFa.gC.J());
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(I i2, XF xF2) {
        void a2;
        I i3 = i2;
        Object b2 = QFa.gC;
        if (i3.J(a2.north()).J() != b2 && i3.J(a2.south()).J() != b2 && i3.J(a2.west()).J() != b2 && i3.J(a2.east()).J() != b2) {
            return uSa.E != 0;
        }
        return i3.J(a2.down()).J().g();
    }

    private static boolean J(Block block, IBlockState iBlockState) {
        Object b2 = iBlockState;
        Block a2 = block;
        if (a2.l()) {
            return uSa.E != 0;
        }
        if (a2.g()) {
            return uSa.E != 0;
        }
        if (a2 instanceof BlockSnow) {
            return uSa.E != 0;
        }
        if (!(a2 instanceof BlockBush && (a2 instanceof BlockDoublePlant || a2 instanceof BlockFlower || a2 instanceof BlockMushroom || a2 instanceof BlockSapling || a2 instanceof BlockTallGrass))) {
            if (!(a2 instanceof BlockFence || a2 instanceof BlockFenceGate || a2 instanceof BlockFlowerPot || a2 instanceof BlockPane || a2 instanceof BlockReed || a2 instanceof BlockWall || a2 instanceof BlockCustomWall)) {
                if (a2 instanceof BlockRedstoneTorch && b2.J(BlockTorch.FACING) == DZ.UP) {
                    return vRa.d != 0;
                }
                if (a2 instanceof BlockLever && ((b2 = b2.J(BlockLever.FACING)) == BlockLever$EnumOrientation.UP_X || b2 == BlockLever$EnumOrientation.UP_Z)) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        return vRa.d != 0;
    }

    public static IBlockState J() {
        return QFa.gC.J();
    }
}

