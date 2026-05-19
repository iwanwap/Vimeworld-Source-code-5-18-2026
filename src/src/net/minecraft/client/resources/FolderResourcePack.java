/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  zsa
 */
package net.minecraft.client.resources;

import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.resources.AbstractResourcePack;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FolderResourcePack
extends AbstractResourcePack {
    @Override
    public Set<String> J() {
        FolderResourcePack folderResourcePack = this;
        HashSet<String> hashSet = Sets.newHashSet();
        File file = new File(folderResourcePack.j, zsa.la);
        if (file.isDirectory()) {
            int n2;
            File[] fileArray = file.listFiles(DirectoryFileFilter.DIRECTORY);
            int n3 = fileArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                Object a2 = fileArray[n2];
                if (!((String)(a2 = FolderResourcePack.J(file, (File)a2))).equals(((String)a2).toLowerCase())) {
                    folderResourcePack.J((String)a2);
                } else {
                    Object object = a2;
                    hashSet.add(((String)object).substring(uSa.E, ((String)object).length() - vRa.d));
                }
                n4 = ++n2;
            }
        }
        return hashSet;
    }

    public FolderResourcePack(File file) {
        File b2 = file;
        FolderResourcePack a2 = this;
        super(b2);
    }

    @Override
    public boolean J(String string) {
        String b2 = string;
        FolderResourcePack a2 = this;
        return new File(a2.j, b2).isFile();
    }

    @Override
    public InputStream J(String string) throws IOException {
        String b2 = string;
        FolderResourcePack a2 = this;
        return new BufferedInputStream(new FileInputStream(new File(a2.j, b2)));
    }
}

