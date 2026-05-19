/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block.properties;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.minecraft.block.properties.PropertyHelper;

public final class PropertyBool
extends PropertyHelper<Boolean> {
    private final ImmutableSet<Boolean> allowedValues;

    @Override
    public Collection<Boolean> J() {
        PropertyBool a2;
        return a2.allowedValues;
    }

    public static PropertyBool J(String a2) {
        return new PropertyBool(a2);
    }

    public PropertyBool(String string) {
        String b2 = string;
        PropertyBool a2 = this;
        super(b2, Boolean.class);
        a2.allowedValues = ImmutableSet.of(Boolean.valueOf(vRa.d != 0), Boolean.valueOf(uSa.E != 0));
    }

    @Override
    public String J(Boolean bl) {
        Boolean b2 = bl;
        PropertyBool a2 = this;
        return b2.toString();
    }
}

