/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vja
 *  oKa
 */
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStem;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

public final class Wla_3
extends Vja {
    public final /* synthetic */ oKa I;

    public Wla_3(oKa oKa2) {
        Wla_3 b2 = oKa2;
        Wla_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation J(IBlockState iBlockState) {
        void a2;
        Wla_3 wla_3 = this;
        void v0 = a2;
        LinkedHashMap<IProperty, Comparable> b2 = Maps.newLinkedHashMap(v0.J());
        if (v0.J(BlockStem.FACING) != DZ.UP) {
            b2.remove(BlockStem.AGE);
        }
        return new ModelResourceLocation((ResourceLocation)Block.blockRegistry.f(a2.J()), wla_3.J(b2));
    }
}

