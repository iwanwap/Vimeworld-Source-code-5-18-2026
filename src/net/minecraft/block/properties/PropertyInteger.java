/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ysa
 *  vRa
 */
package net.minecraft.block.properties;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.block.properties.PropertyHelper;

public final class PropertyInteger
extends PropertyHelper<Integer> {
    private final ImmutableSet<Integer> allowedValues;

    @Override
    public String J(Integer n2) {
        Integer b2 = n2;
        PropertyInteger a2 = this;
        return b2.toString();
    }

    @Override
    public Collection<Integer> J() {
        PropertyInteger a2;
        return a2.allowedValues;
    }

    /*
     * WARNING - void declaration
     */
    public static PropertyInteger J(String string, int n2, int n3) {
        void b2;
        int c2 = n3;
        String a2 = string;
        return new PropertyInteger(a2, (int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public PropertyInteger(String string, int n2, int n3) {
        void a2;
        HashSet<Integer> c2;
        int d2 = n2;
        PropertyInteger b2 = this;
        super((String)((Object)c2), Integer.class);
        if (d2 < 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, lQa.Ia).append((String)((Object)c2)).append(POa.S).toString());
        }
        if (a2 <= d2) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, rRa.m).append((String)((Object)c2)).append(Ysa.t).append(d2).append(hpa.b).toString());
        }
        c2 = Sets.newHashSet();
        int n4 = d2 = d2;
        while (n4 <= a2) {
            c2.add(d2++);
            n4 = d2;
        }
        b2.allowedValues = ImmutableSet.copyOf(c2);
    }

    @Override
    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            if (!super.equals(b2)) {
                return uSa.E != 0;
            }
            b2 = (PropertyInteger)b2;
            return ((PropertyInteger)a2).allowedValues.equals(((PropertyInteger)b2).allowedValues);
        }
        return uSa.E != 0;
    }

    @Override
    public int hashCode() {
        PropertyInteger propertyInteger = this;
        int a2 = super.hashCode();
        a2 = tua.U * a2 + propertyInteger.allowedValues.hashCode();
        return a2;
    }
}

