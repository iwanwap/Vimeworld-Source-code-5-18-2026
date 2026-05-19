/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DLa
 *  Vja
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

public final class zJa_1
extends Vja {
    private final IProperty<?> J;
    private final List<IProperty<?>> A;
    private final String I;

    /*
     * WARNING - void declaration
     */
    private zJa_1(IProperty<?> iProperty, String string, List<IProperty<?>> list) {
        void b2;
        void c2;
        zJa_1 a2;
        Object d2 = list;
        zJa_1 zJa_12 = a2 = this;
        a2.J = c2;
        zJa_12.I = b2;
        zJa_12.A = d2;
    }

    public ModelResourceLocation J(IBlockState iBlockState) {
        zJa_1 zJa_12;
        Object b2;
        Iterator<IProperty<?>> a2;
        zJa_1 zJa_13 = this;
        LinkedHashMap<IProperty, Comparable> linkedHashMap = Maps.newLinkedHashMap(a2.J());
        if (zJa_13.J == null) {
            b2 = ((ResourceLocation)Block.blockRegistry.f(a2.J())).toString();
            zJa_12 = zJa_13;
        } else {
            b2 = zJa_13.J.J((Comparable)linkedHashMap.remove(zJa_13.J));
            zJa_12 = zJa_13;
        }
        if (zJa_12.I != null) {
            b2 = new StringBuilder().insert(2 & 5, (String)b2).append(zJa_13.I).toString();
        }
        Iterator<IProperty<?>> iterator = a2 = zJa_13.A.iterator();
        while (iterator.hasNext()) {
            IProperty<?> iProperty = a2.next();
            iterator = a2;
            linkedHashMap.remove(iProperty);
        }
        return new ModelResourceLocation((String)b2, zJa_13.J(linkedHashMap));
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ zJa_1(IProperty iProperty, String string, List list, DLa dLa) {
        void c2;
        void d2;
        Object e2 = list;
        zJa_1 b2 = this;
        b2((IProperty<?>)d2, (String)c2, (List<IProperty<?>>)e2);
    }
}

