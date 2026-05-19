/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WSa
 *  cg
 *  vRa
 */
package shadersmod.client;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import shadersmod.client.IShaderPack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ShaderPackZip
implements IShaderPack {
    public ZipFile packZipFile;
    public File packFile;

    @Override
    public InputStream J(String string) {
        ZipEntry zipEntry;
        ShaderPackZip a2;
        block3: {
            Object b22 = string;
            a2 = this;
            try {
                b22 = cg.l((String)b22, (String)WSa.f);
                zipEntry = a2.packZipFile.getEntry((String)b22);
                if (zipEntry != null) break block3;
                return null;
            }
            catch (Exception b22) {
                return null;
            }
        }
        return a2.packZipFile.getInputStream(zipEntry);
    }

    @Override
    public boolean J(String string) {
        block3: {
            Object b22 = string;
            ShaderPackZip a2 = this;
            try {
                b22 = cg.l((String)b22, (String)WSa.f);
                if (a2.packZipFile.getEntry((String)b22) == null) break block3;
                return vRa.d != 0;
            }
            catch (Exception b22) {
                return uSa.E != 0;
            }
        }
        return uSa.E != 0;
    }

    @Override
    public String J() {
        ShaderPackZip a2;
        return a2.packFile.getName();
    }

    public ShaderPackZip(String string, File file) throws IOException {
        File c2 = file;
        ShaderPackZip a2 = this;
        a2.packFile = c2;
        ShaderPackZip shaderPackZip = a2;
        a2.packZipFile = new ZipFile(a2.packFile);
    }

    @Override
    public void J() {
        ShaderPackZip a2;
        if (a2.packZipFile != null) {
            ShaderPackZip shaderPackZip;
            try {
                a2.packZipFile.close();
                shaderPackZip = a2;
            }
            catch (Exception exception) {
                shaderPackZip = a2;
            }
            shaderPackZip.packZipFile = null;
        }
    }
}

