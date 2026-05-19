/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vja
 *  iea
 *  oKa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class OJa_1
extends Vja {
    public final /* synthetic */ oKa I;

    public ModelResourceLocation J(IBlockState iBlockState) {
        Object object;
        iea iea2;
        IProperty iProperty;
        OJa_1 a2;
        Object b2;
        block1: {
            b2 = iBlockState;
            a2 = this;
            b2 = Maps.newLinkedHashMap(b2.J());
            iProperty = null;
            iea2 = null;
            for (Map.Entry entry : b2.entrySet()) {
                if (!(entry.getValue() instanceof iea)) continue;
                iProperty = (IProperty)entry.getKey();
                iea2 = (iea)entry.getValue();
                object = b2;
                break block1;
            }
            object = b2;
        }
        object.remove(iProperty);
        return new ModelResourceLocation(new StringBuilder().insert(5 >> 3, iea2.getName()).append(KSa.v).toString(), a2.J((Map)b2));
    }

    public OJa_1(oKa oKa2) {
        OJa_1 b2 = oKa2;
        OJa_1 a2 = this;
        a2.I = b2;
    }
}

