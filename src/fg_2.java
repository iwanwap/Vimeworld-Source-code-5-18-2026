/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WSa
 *  YSa
 *  cg
 *  vRa
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class fg_2 {
    /*
     * WARNING - void declaration
     */
    public static String[] J(IResourcePack iResourcePack, String[] stringArray, String[] stringArray2) {
        void b2;
        String[] c2 = stringArray2;
        IResourcePack a2 = iResourcePack;
        return fg_2.J(a2, (String[])b2, c2, (String[])null);
    }

    /*
     * WARNING - void declaration
     */
    public static String[] J(IResourcePack iResourcePack, String string, String string2, String[] stringArray) {
        void b2;
        void c2;
        String[] d2 = stringArray;
        IResourcePack a2 = iResourcePack;
        String[] stringArray2 = new String[vRa.d];
        stringArray2[uSa.E] = c2;
        String[] stringArray3 = new String[vRa.d];
        stringArray3[uSa.E] = b2;
        return fg_2.J(a2, stringArray2, stringArray3, d2);
    }

    public fg_2() {
        fg_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static String[] J(File file, String[] stringArray, String[] stringArray2) {
        String[] stringArray3;
        ZipFile zipFile;
        File file2 = file;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string = YSa.y;
        try {
            zipFile = new ZipFile(file2);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                void a2;
                void b2;
                stringArray3 = enumeration.nextElement();
                Object c2 = stringArray3.getName();
                if (!((String)c2).startsWith(string) || !cg.f((String)(c2 = ((String)c2).substring(string.length())), (String[])b2) || !cg.J((String)c2, (String[])a2)) continue;
                arrayList.add(c2);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[uSa.E];
        }
        zipFile.close();
        ArrayList<Object> arrayList2 = arrayList;
        stringArray3 = arrayList2.toArray(new String[arrayList2.size()]);
        return stringArray3;
    }

    /*
     * WARNING - void declaration
     */
    private static String[] J(IResourcePack iResourcePack, String[] stringArray) {
        int b22;
        void a2;
        IResourcePack iResourcePack2 = iResourcePack;
        if (a2 == null) {
            return new String[uSa.E];
        }
        ArrayList<void> arrayList = new ArrayList<void>();
        int n2 = b22 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var4_6 = a2[b22];
            ResourceLocation resourceLocation = new ResourceLocation((String)var4_6);
            if (iResourcePack2.J(resourceLocation)) {
                arrayList.add(var4_6);
            }
            n2 = ++b22;
        }
        ArrayList<void> arrayList2 = arrayList;
        String[] b22 = arrayList2.toArray(new String[arrayList2.size()]);
        return b22;
    }

    public static String[] J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = a2;
        String[] stringArray2 = new String[vRa.d];
        stringArray2[uSa.E] = b2;
        return fg_2.J(stringArray, stringArray2);
    }

    /*
     * WARNING - void declaration
     */
    public static String[] J(IResourcePack iResourcePack, String[] stringArray, String[] stringArray2, String[] stringArray3) {
        void b2;
        void c2;
        Object d2 = stringArray3;
        IResourcePack a2 = iResourcePack;
        if (a2 instanceof DefaultResourcePack) {
            return fg_2.J(a2, (String[])d2);
        }
        if (!(a2 instanceof AbstractResourcePack)) {
            return new String[uSa.E];
        }
        d2 = ((AbstractResourcePack)a2).j;
        if (d2 == null) {
            return new String[uSa.E];
        }
        Object object = d2;
        if (((File)d2).isDirectory()) {
            return fg_2.J((File)object, Mqa.y, (String[])c2, (String[])b2);
        }
        if (((File)object).isFile()) {
            return fg_2.J((File)d2, (String[])c2, (String[])b2);
        }
        return new String[uSa.E];
    }

    /*
     * WARNING - void declaration
     */
    public static String[] J(String[] stringArray, String[] stringArray2) {
        int b22;
        String[] stringArray3 = stringArray;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        IResourcePack[] iResourcePackArray = Config.J();
        int n2 = b22 = uSa.E;
        while (n2 < iResourcePackArray.length) {
            void a2;
            String[] stringArray4 = fg_2.J(iResourcePackArray[b22], stringArray3, (String[])a2, (String[])null);
            linkedHashSet.addAll(Arrays.asList(stringArray4));
            n2 = ++b22;
        }
        LinkedHashSet<String> linkedHashSet2 = linkedHashSet;
        String[] b22 = linkedHashSet2.toArray(new String[linkedHashSet2.size()]);
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    private static String[] J(File file, String string, String[] stringArray, String[] stringArray2) {
        int n2;
        File file2 = file;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string2 = YSa.y;
        File[] fileArray = file2.listFiles();
        if (fileArray == null) {
            return new String[uSa.E];
        }
        int n3 = n2 = uSa.E;
        while (n3 < fileArray.length) {
            void a2;
            void b2;
            Object d2;
            void c2;
            String[] stringArray3 = fileArray[n2];
            if (stringArray3.isFile()) {
                d2 = new StringBuilder().insert(3 ^ 3, (String)c2).append(stringArray3.getName()).toString();
                if (((String)d2).startsWith(string2) && cg.f((String)(d2 = ((String)d2).substring(string2.length())), (String[])b2) && cg.J((String)d2, (String[])a2)) {
                    arrayList.add(d2);
                }
            } else if (stringArray3.isDirectory()) {
                d2 = new StringBuilder().insert(3 ^ 3, (String)c2).append(stringArray3.getName()).append(WSa.f).toString();
                stringArray3 = fg_2.J((File)stringArray3, (String)d2, (String[])b2, (String[])a2);
                int n4 = uSa.E;
                while (n4 < stringArray3.length) {
                    String string3 = stringArray3[d2];
                    arrayList.add(string3);
                    n4 = ++d2;
                }
            }
            n3 = ++n2;
        }
        ArrayList<Object> arrayList2 = arrayList;
        String[] stringArray4 = arrayList2.toArray(new String[arrayList2.size()]);
        return stringArray4;
    }
}

