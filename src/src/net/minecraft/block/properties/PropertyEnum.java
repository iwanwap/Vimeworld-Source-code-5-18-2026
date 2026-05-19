/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  XTa
 */
package net.minecraft.block.properties;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.properties.PropertyHelper;

public class PropertyEnum<T extends Enum<T>>
extends PropertyHelper<T> {
    private final Map<String, T> nameToValue;
    private final ImmutableSet<T> allowedValues;

    public PropertyEnum(String string, Class<T> clazz, Collection<T> collection) {
        Enum b2;
        Iterator c2;
        Object d2 = collection;
        PropertyEnum a2 = this;
        Object object = d2;
        super((String)((Object)c2), b2);
        a2.nameToValue = Maps.newHashMap();
        a2.allowedValues = ImmutableSet.copyOf(object);
        Iterator iterator = c2 = object.iterator();
        while (iterator.hasNext()) {
            b2 = (Enum)c2.next();
            d2 = ((Pb)b2).getName();
            if (a2.nameToValue.containsKey(d2)) {
                throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, sSa.Ja).append((String)d2).append(XTa.Z).toString());
            }
            a2.nameToValue.put((String)d2, b2);
            iterator = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Enum<T>> PropertyEnum<T> J(String string, Class<T> clazz, Predicate<T> predicate) {
        void b2;
        Predicate<T> c2 = predicate;
        String a2 = string;
        void v0 = b2;
        return PropertyEnum.J(a2, v0, Collections2.filter(Lists.newArrayList(v0.getEnumConstants()), c2));
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Enum<T>> PropertyEnum<T> J(String string, Class<T> clazz, Collection<T> collection) {
        void b2;
        Collection<T> c2 = collection;
        String a2 = string;
        return new PropertyEnum<T>(a2, b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Enum<T>> PropertyEnum<T> J(String string, Class<T> clazz, T ... TArray) {
        void b2;
        T[] c2 = TArray;
        String a2 = string;
        return PropertyEnum.J(a2, b2, Lists.newArrayList(c2));
    }

    @Override
    public String J(T t2) {
        PropertyEnum<T> b2 = t2;
        PropertyEnum a2 = this;
        return ((Pb)b2).getName();
    }

    @Override
    public Collection<T> J() {
        PropertyEnum a2;
        return a2.allowedValues;
    }

    public static <T extends Enum<T>> PropertyEnum<T> J(String string, Class<T> clazz) {
        Class<T> b2 = clazz;
        String a2 = string;
        return PropertyEnum.J(a2, b2, Predicates.alwaysTrue());
    }
}

