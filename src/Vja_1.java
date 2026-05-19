/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vc
 *  yra
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public abstract class Vja_1
implements Vc {
    public Map<IBlockState, ModelResourceLocation> I = Maps.newLinkedHashMap();

    public abstract ModelResourceLocation J(IBlockState var1);

    public String J(Map<IProperty, Comparable> map) {
        Iterator a2;
        Vja_1 vja_1 = this;
        StringBuilder b2 = new StringBuilder();
        Iterator iterator = a2 = a2.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object = a2.next();
            if (b2.length() != 0) {
                b2.append(yra.t);
            }
            IProperty iProperty = (IProperty)object.getKey();
            object = (Comparable)object.getValue();
            iterator = a2;
            b2.append(iProperty.J());
            b2.append(vTa.S);
            b2.append(iProperty.J(object));
        }
        if (b2.length() == 0) {
            b2.append(AQa.t);
        }
        return b2.toString();
    }

    public Vja_1() {
        Vja_1 a2;
    }

    public Map<IBlockState, ModelResourceLocation> J(Block block) {
        Object b2 = block;
        Vja_1 a2 = this;
        Object object = b2 = ((Block)b2).f().J().iterator();
        while (object.hasNext()) {
            IBlockState iBlockState = (IBlockState)b2.next();
            object = b2;
            IBlockState iBlockState2 = iBlockState;
            a2.I.put(iBlockState2, a2.J(iBlockState2));
        }
        return a2.I;
    }
}

