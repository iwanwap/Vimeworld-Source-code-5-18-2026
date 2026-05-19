/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pqa
 *  vRa
 */
package net.minecraft.block.properties;

import com.google.common.base.Objects;
import net.minecraft.block.properties.IProperty;

public abstract class PropertyHelper<T extends Comparable<T>>
implements IProperty<T> {
    private final String name;
    private final Class<T> valueClass;

    public String toString() {
        PropertyHelper a2;
        return Objects.toStringHelper(a2).add(dua.T, a2.name).add(Fua.e, a2.valueClass).add(Pqa.F, a2.J()).toString();
    }

    @Override
    public String J() {
        PropertyHelper a2;
        return a2.name;
    }

    @Override
    public Class<T> J() {
        PropertyHelper a2;
        return a2.valueClass;
    }

    /*
     * WARNING - void declaration
     */
    public PropertyHelper(String string, Class<T> clazz) {
        void b2;
        PropertyHelper a2;
        Class<T> c2 = clazz;
        PropertyHelper propertyHelper = a2 = this;
        propertyHelper.valueClass = c2;
        propertyHelper.name = b2;
    }

    public int hashCode() {
        PropertyHelper a2;
        return tua.U * a2.valueClass.hashCode() + a2.name.hashCode();
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (PropertyHelper)b2;
            if (((PropertyHelper)a2).valueClass.equals(((PropertyHelper)b2).valueClass) && ((PropertyHelper)a2).name.equals(((PropertyHelper)b2).name)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

