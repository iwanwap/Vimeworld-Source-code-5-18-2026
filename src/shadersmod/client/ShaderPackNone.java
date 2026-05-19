/*
 * Decompiled with CFR 0.152.
 */
package shadersmod.client;

import java.io.InputStream;
import shadersmod.client.IShaderPack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ShaderPackNone
implements IShaderPack {
    @Override
    public void J() {
    }

    @Override
    public boolean J(String string) {
        String b2 = string;
        ShaderPackNone a2 = this;
        return uSa.E != 0;
    }

    @Override
    public String J() {
        return pA.Zb;
    }

    public ShaderPackNone() {
        ShaderPackNone a2;
    }

    @Override
    public InputStream J(String string) {
        String b2 = string;
        ShaderPackNone a2 = this;
        return null;
    }
}

