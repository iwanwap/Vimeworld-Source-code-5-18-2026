/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.properties;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.block.properties.PropertyEnum;

public final class PropertyDirection
extends PropertyEnum<DZ> {
    public static PropertyDirection J(String a2) {
        return PropertyDirection.J(a2, Predicates.alwaysTrue());
    }

    public static PropertyDirection J(String string, Predicate<DZ> predicate) {
        Predicate<DZ> b2 = predicate;
        String a2 = string;
        return PropertyDirection.J(a2, Collections2.filter(Lists.newArrayList(DZ.values()), b2));
    }

    /*
     * WARNING - void declaration
     */
    public PropertyDirection(String string, Collection<DZ> collection) {
        void b2;
        Collection<DZ> c2 = collection;
        PropertyDirection a2 = this;
        super((String)b2, DZ.class, c2);
    }

    public static PropertyDirection J(String string, Collection<DZ> collection) {
        Collection<DZ> b2 = collection;
        String a2 = string;
        return new PropertyDirection(a2, b2);
    }
}

