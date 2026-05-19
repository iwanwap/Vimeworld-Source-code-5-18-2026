/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  Vja
 *  mra
 *  oKa
 */
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockStoneSlabNew$EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class lLa
extends Vja {
    public final /* synthetic */ oKa I;

    public lLa(oKa oKa2) {
        lLa b2 = oKa2;
        lLa a2 = this;
        a2.I = b2;
    }

    public ModelResourceLocation J(IBlockState iBlockState) {
        Object b2 = iBlockState;
        lLa a2 = this;
        LinkedHashMap<IProperty, Comparable> linkedHashMap = Maps.newLinkedHashMap(b2.J());
        String string = BlockStoneSlabNew.VARIANT.J((BlockStoneSlabNew$EnumType)((Object)linkedHashMap.remove(BlockStoneSlabNew.VARIANT)));
        linkedHashMap.remove(BlockStoneSlab.SEAMLESS);
        b2 = b2.J(BlockStoneSlabNew.SEAMLESS) != false ? JSa.H : AQa.t;
        return new ModelResourceLocation(new StringBuilder().insert(5 >> 3, string).append(mra.k).toString(), (String)b2);
    }
}

