/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oha
 *  uOa
 *  vRa
 *  zsa
 */
package net.minecraft.client.resources;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.resources.AbstractResourcePack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FileResourcePack
extends AbstractResourcePack
implements Closeable {
    private ZipFile j;
    public static final Splitter J = Splitter.on((char)uOa.F).omitEmptyStrings().limit(yRa.d);
    private final Set<String> A;
    private final Set<String> I;

    /*
     * WARNING - void declaration
     */
    @Override
    public InputStream J(String string) throws IOException {
        void a2;
        Object object = this;
        ZipFile zipFile = ((FileResourcePack)object).J();
        ZipEntry b2 = zipFile.getEntry((String)a2);
        if (b2 == null) {
            throw new Oha((File)((Object)((FileResourcePack)object).j), (String)a2);
        }
        return zipFile.getInputStream(b2);
    }

    public void finalize() throws Throwable {
        FileResourcePack a2;
        FileResourcePack fileResourcePack = a2;
        fileResourcePack.close();
        super.finalize();
    }

    @Override
    public boolean J(String string) {
        String b2 = string;
        FileResourcePack a2 = this;
        return a2.I.contains(b2);
    }

    public FileResourcePack(File file) {
        File b2 = file;
        FileResourcePack a2 = this;
        super(b2);
        FileResourcePack fileResourcePack = a2;
        a2.A = new HashSet<String>();
        fileResourcePack.I = new HashSet<String>();
    }

    @Override
    public void close() throws IOException {
        FileResourcePack a2;
        if (a2.j != null) {
            FileResourcePack fileResourcePack = a2;
            fileResourcePack.j.close();
            a2.j = null;
            fileResourcePack.I.clear();
            a2.A.clear();
        }
    }

    @Override
    public Set<String> J() {
        FileResourcePack fileResourcePack;
        FileResourcePack a2;
        try {
            a2.J();
            fileResourcePack = a2;
        }
        catch (IOException iOException) {
            fileResourcePack = a2;
        }
        return fileResourcePack.A;
    }

    /*
     * Unable to fully structure code
     */
    private ZipFile J() throws IOException {
        block3: {
            var3_1 = this;
            if (var3_1.j != null) break block3;
            var3_1.j = new ZipFile((File)var3_1.j);
            v0 = var1_2 = var3_1.j.entries();
            while (v0.hasMoreElements()) {
                var2_3 = var1_2.nextElement().getName();
                if (!var2_3.startsWith(zsa.la) || (a = Lists.newArrayList(FileResourcePack.J.split(var2_3))).size() <= vRa.d) ** GOTO lbl17
                if (!(a = (String)a.get(vRa.d)).equals(a.toLowerCase())) {
                    v1 = var3_1;
                    v2 = v1;
                    v1.J((String)a);
                } else {
                    var3_1.A.add((String)a);
lbl17:
                    // 2 sources

                    v2 = var3_1;
                }
                v2.I.add(var2_3);
                v0 = var1_2;
            }
        }
        return var3_1.j;
    }
}

