/*
 * Decompiled with CFR 0.152.
 */
package shadersmod.client;

import java.io.InputStream;
import shadersmod.client.IShaderPack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ShaderPackDefault
implements IShaderPack {
    @Override
    public boolean J(String string) {
        String b2 = string;
        ShaderPackDefault a2 = this;
        return uSa.E != 0;
    }

    public ShaderPackDefault() {
        ShaderPackDefault a2;
    }

    @Override
    public void J() {
    }

    @Override
    public String J() {
        return pA.md;
    }

    @Override
    public InputStream J(String string) {
        String b2 = string;
        ShaderPackDefault a2 = this;
        return null;
    }
}

