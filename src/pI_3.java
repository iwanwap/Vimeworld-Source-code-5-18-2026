/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ura
 */
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class pI_3 {
    public static Map<String, byte[]> J(ZipInputStream zipInputStream) throws IOException {
        ZipInputStream zipInputStream2 = zipInputStream;
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        byte[] byArray = new byte[ura.V];
        Closeable a2 = new ByteArrayOutputStream();
        ZipInputStream zipInputStream3 = zipInputStream2;
        ZipEntry zipEntry;
        while ((zipEntry = zipInputStream3.getNextEntry()) != null) {
            int n2;
            if (zipEntry.isDirectory()) {
                zipInputStream3 = zipInputStream2;
                continue;
            }
            ((ByteArrayOutputStream)a2).reset();
            ZipInputStream zipInputStream4 = zipInputStream2;
            while ((n2 = zipInputStream4.read(byArray)) > 0) {
                zipInputStream4 = zipInputStream2;
                ((ByteArrayOutputStream)a2).write(byArray, uSa.E, n2);
            }
            hashMap.put(zipEntry.getName(), ((ByteArrayOutputStream)a2).toByteArray());
            zipInputStream3 = zipInputStream2;
        }
        return hashMap;
    }

    public pI_3() {
        pI_3 a2;
    }
}

