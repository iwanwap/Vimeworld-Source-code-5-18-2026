/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WSa
 *  cg
 *  vRa
 */
package shadersmod.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import shadersmod.client.IShaderPack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ShaderPackFolder
implements IShaderPack {
    public File packFile;

    @Override
    public boolean J(String string) {
        Object b2 = string;
        ShaderPackFolder a2 = this;
        if (!((File)(b2 = new File(a2.packFile, ((String)b2).substring(vRa.d)))).exists()) {
            return uSa.E != 0;
        }
        return ((File)b2).isDirectory();
    }

    @Override
    public String J() {
        ShaderPackFolder a2;
        return a2.packFile.getName();
    }

    @Override
    public void J() {
    }

    @Override
    public InputStream J(String string) {
        File file;
        block3: {
            Object b22 = string;
            ShaderPackFolder a2 = this;
            try {
                b22 = cg.l((String)b22, (String)WSa.f, (String)WSa.f);
                file = new File(a2.packFile, (String)b22);
                if (file.exists()) break block3;
                return null;
            }
            catch (Exception b22) {
                return null;
            }
        }
        return new BufferedInputStream(new FileInputStream(file));
    }

    public ShaderPackFolder(String string, File file) {
        File c2 = file;
        ShaderPackFolder a2 = this;
        a2.packFile = c2;
    }
}

