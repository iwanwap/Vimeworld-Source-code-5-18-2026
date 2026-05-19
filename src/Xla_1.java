/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vja
 *  oKa
 */
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class Xla_1
extends Vja {
    public final /* synthetic */ oKa I;

    public Xla_1(oKa oKa2) {
        Xla_1 b2 = oKa2;
        Xla_1 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation J(IBlockState iBlockState) {
        void a2;
        Xla_1 xla_1 = this;
        LinkedHashMap<IProperty, Comparable> b2 = Maps.newLinkedHashMap(a2.J());
        String string = BlockDirt.VARIANT.J((BlockDirt$DirtType)((Object)b2.remove(BlockDirt.VARIANT)));
        if (BlockDirt$DirtType.PODZOL != a2.J(BlockDirt.VARIANT)) {
            b2.remove(BlockDirt.SNOWY);
        }
        return new ModelResourceLocation(string, xla_1.J(b2));
    }
}

