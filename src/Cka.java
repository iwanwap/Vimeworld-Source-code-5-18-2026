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

public final class Cka
extends Vja {
    public final /* synthetic */ oKa I;

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation J(IBlockState iBlockState) {
        void a2;
        Cka cka2 = this;
        void v0 = a2;
        LinkedHashMap<IProperty, Comparable> b2 = Maps.newLinkedHashMap(v0.J());
        if (v0.J(BlockStem.FACING) != DZ.UP) {
            b2.remove(BlockStem.AGE);
        }
        return new ModelResourceLocation((ResourceLocation)Block.blockRegistry.f(a2.J()), cka2.J(b2));
    }

    public Cka(oKa oKa2) {
        Cka b2 = oKa2;
        Cka a2 = this;
        a2.I = b2;
    }
}

