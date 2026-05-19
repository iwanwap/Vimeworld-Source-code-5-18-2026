/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TQa
 *  vRa
 */
package net.minecraft.client.resources.model;

import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.StringUtils;

public final class ModelResourceLocation
extends ResourceLocation {
    private final String variant;

    @Override
    public String toString() {
        ModelResourceLocation a2;
        return new StringBuilder().insert(5 >> 3, super.toString()).append((char)TQa.ca).append(a2.variant).toString();
    }

    @Override
    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 instanceof ModelResourceLocation && super.equals(b2)) {
            b2 = (ModelResourceLocation)b2;
            return ((ModelResourceLocation)a2).variant.equals(((ModelResourceLocation)b2).variant);
        }
        return uSa.E != 0;
    }

    public static String[] f(String string) {
        String string2 = string;
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = null;
        stringArray[vRa.d] = string2;
        stringArray[uqa.g] = null;
        String[] stringArray2 = stringArray;
        String string3 = string2;
        int a2 = string3.indexOf(TQa.ca);
        String string4 = string3;
        if (a2 >= 0) {
            int n2 = a2;
            String string5 = string2;
            stringArray2[uqa.g] = string5.substring(n2 + vRa.d, string5.length());
            if (n2 > vRa.d) {
                string4 = string2.substring(uSa.E, a2);
            }
        }
        System.arraycopy(ResourceLocation.J(string4), uSa.E, stringArray2, uSa.E, uqa.g);
        return stringArray2;
    }

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation(String string, String string2, String string3) {
        void b2;
        void c2;
        String d2 = string3;
        ModelResourceLocation a2 = this;
        super((String)c2, (String)b2);
        a2.variant = d2;
    }

    public ModelResourceLocation(int n2, String ... stringArray) {
        String[] c2 = stringArray;
        String[] a2 = this;
        String[] stringArray2 = new String[uqa.g];
        stringArray2[uSa.E] = c2[uSa.E];
        stringArray2[vRa.d] = c2[vRa.d];
        super(uSa.E, stringArray2);
        a2.variant = StringUtils.isEmpty(c2[uqa.g]) ? AQa.t : c2[uqa.g].toLowerCase();
    }

    public ModelResourceLocation(String string) {
        String b2 = string;
        ModelResourceLocation a2 = this;
        a2(uSa.E, ModelResourceLocation.f(b2));
    }

    @Override
    public int hashCode() {
        ModelResourceLocation a2;
        return tua.U * super.hashCode() + a2.variant.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation(ResourceLocation resourceLocation, String string) {
        void b2;
        String c2 = string;
        ModelResourceLocation a2 = this;
        a2(b2.toString(), c2);
    }

    public String l() {
        ModelResourceLocation a2;
        return a2.variant;
    }

    /*
     * WARNING - void declaration
     */
    public ModelResourceLocation(String string, String string2) {
        void b2;
        String c2 = string2;
        ModelResourceLocation a2 = this;
        a2(uSa.E, ModelResourceLocation.f(new StringBuilder().insert(3 & 4, (String)b2).append((char)TQa.ca).append((String)(c2 == null ? AQa.t : c2)).toString()));
    }
}

