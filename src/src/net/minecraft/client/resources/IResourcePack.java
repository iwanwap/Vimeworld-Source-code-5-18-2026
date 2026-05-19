/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fd
 *  kga
 */
package net.minecraft.client.resources;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import net.minecraft.util.ResourceLocation;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface IResourcePack
extends KeepClassName {
    public <T extends Fd> T J(kga var1, String var2) throws IOException;

    public boolean J(ResourceLocation var1);

    public Set<String> J();

    public InputStream J(ResourceLocation var1) throws IOException;

    public BufferedImage J() throws IOException;

    public String J();
}

