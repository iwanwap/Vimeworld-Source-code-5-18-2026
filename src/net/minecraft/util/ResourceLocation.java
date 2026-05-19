/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  vRa
 */
package net.minecraft.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import ru.obfuscator.KeepClassName;

public class ResourceLocation
implements D,
KeepClassName {
    public final String resourcePath;
    public final String resourceDomain;

    public ResourceLocation(int n2, String ... stringArray) {
        String[] c2 = stringArray;
        String[] a2 = this;
        a2.resourceDomain = StringUtils.isEmpty(c2[uSa.E]) ? APa.m : c2[uSa.E].toLowerCase();
        a2.resourcePath = c2[vRa.d];
        Validate.notNull(a2.resourcePath);
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation(String string, String string2) {
        void b2;
        String c2 = string2;
        ResourceLocation a2 = this;
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = b2;
        stringArray[vRa.d] = c2;
        a2(uSa.E, stringArray);
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof ResourceLocation)) {
            return uSa.E != 0;
        }
        b2 = (ResourceLocation)b2;
        if (((ResourceLocation)a2).resourceDomain.equals(((ResourceLocation)b2).resourceDomain) && ((ResourceLocation)a2).resourcePath.equals(((ResourceLocation)b2).resourcePath)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ResourceLocation(String string) {
        String b2 = string;
        ResourceLocation a2 = this;
        a2(uSa.E, ResourceLocation.J(b2));
    }

    public String f() {
        ResourceLocation a2;
        return a2.resourceDomain;
    }

    public int hashCode() {
        ResourceLocation a2;
        return tua.U * a2.resourceDomain.hashCode() + a2.resourcePath.hashCode();
    }

    public String J() {
        ResourceLocation a2;
        return a2.resourcePath;
    }

    public static String[] J(String string) {
        String string2 = string;
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = null;
        stringArray[vRa.d] = string2;
        String[] a2 = stringArray;
        int n2 = string2.indexOf(lQa.R);
        if (n2 >= 0) {
            int n3 = n2;
            String string3 = string2;
            a2[vRa.d] = string3.substring(n3 + vRa.d, string3.length());
            if (n3 > vRa.d) {
                a2[uSa.E] = string2.substring(uSa.E, n2);
            }
        }
        return a2;
    }

    public String toString() {
        ResourceLocation a2;
        return new StringBuilder().insert(3 ^ 3, a2.resourceDomain).append((char)lQa.R).append(a2.resourcePath).toString();
    }
}

