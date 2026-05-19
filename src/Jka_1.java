/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vja
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

public final class Jka_1
extends Vja {
    public Jka_1() {
        Jka_1 a2;
    }

    public ModelResourceLocation J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Jka_1 a2 = this;
        return new ModelResourceLocation((ResourceLocation)Block.blockRegistry.f(b2.J()), a2.J(b2.J()));
    }
}

