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
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class xja
extends Vja {
    public final /* synthetic */ oKa I;

    public xja(oKa oKa2) {
        xja b2 = oKa2;
        xja a2 = this;
        a2.I = b2;
    }

    public ModelResourceLocation J(IBlockState iBlockState) {
        Object b2 = iBlockState;
        xja a2 = this;
        LinkedHashMap<IProperty, Comparable> linkedHashMap = Maps.newLinkedHashMap(b2.J());
        String string = BlockStoneSlab.VARIANT.J((BlockStoneSlab$EnumType)((Object)linkedHashMap.remove(BlockStoneSlab.VARIANT)));
        linkedHashMap.remove(BlockStoneSlab.SEAMLESS);
        b2 = b2.J(BlockStoneSlab.SEAMLESS) != false ? JSa.H : AQa.t;
        return new ModelResourceLocation(new StringBuilder().insert(3 >> 2, string).append(mra.k).toString(), (String)b2);
    }
}

