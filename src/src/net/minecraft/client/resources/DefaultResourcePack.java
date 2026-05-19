/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Fd
 *  WSa
 *  kga
 *  vRa
 */
package net.minecraft.client.resources;

import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DefaultResourcePack
implements IResourcePack {
    public static final Set j = ImmutableSet.of(APa.m, sra.O, Cra.V, zua.fa, wua.A);
    private static final String J = "CL_00001073";
    private final Map A;
    private final Map<String, Boolean> I;

    public InputStream l(ResourceLocation resourceLocation) throws IOException, FileNotFoundException {
        Object b2 = resourceLocation;
        DefaultResourcePack a2 = this;
        if ((b2 = (File)a2.A.get(((ResourceLocation)b2).toString())) != null && ((File)b2).isFile()) {
            return new FileInputStream((File)b2);
        }
        return null;
    }

    @Override
    public String J() {
        return xqa.A;
    }

    /*
     * WARNING - void declaration
     */
    public Fd J(kga kga2, String string) throws IOException {
        DefaultResourcePack defaultResourcePack = this;
        try {
            void a2;
            void b2;
            FileInputStream c2 = new FileInputStream((File)defaultResourcePack.A.get(tpa.C));
            return AbstractResourcePack.J((kga)b2, c2, (String)a2);
        }
        catch (RuntimeException c2) {
            return null;
        }
        catch (FileNotFoundException c2) {
            return null;
        }
    }

    @Override
    public BufferedImage J() throws IOException {
        return gLa.J(DefaultResourcePack.class.getResourceAsStream(new StringBuilder().insert(3 >> 2, WSa.f).append(new ResourceLocation(kua.L).J()).toString()));
    }

    @Override
    public boolean J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        DefaultResourcePack a2 = this;
        String string = ((ResourceLocation)b2).toString();
        if (a2.A.containsKey(string)) {
            return vRa.d != 0;
        }
        Boolean bl = a2.I.get(string);
        if (bl != null) {
            return bl;
        }
        DefaultResourcePack defaultResourcePack = a2;
        b2 = defaultResourcePack.f((ResourceLocation)b2);
        defaultResourcePack.I.put(string, (b2 != null ? vRa.d : uSa.E) != 0);
        if (b2 != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public InputStream J(ResourceLocation resourceLocation) throws IOException {
        void a2;
        Object object = this;
        Object b2 = ((DefaultResourcePack)object).f((ResourceLocation)a2);
        if (b2 != null) {
            return b2;
        }
        b2 = ((DefaultResourcePack)object).l((ResourceLocation)a2);
        if (b2 != null) {
            return b2;
        }
        throw new FileNotFoundException(a2.J());
    }

    public DefaultResourcePack(Map map) {
        Map b2 = map;
        DefaultResourcePack a2 = this;
        DefaultResourcePack defaultResourcePack = a2;
        a2.I = new HashMap<String, Boolean>();
        a2.A = b2;
    }

    public Set J() {
        return j;
    }

    private InputStream f(ResourceLocation resourceLocation) {
        KeepClassName b2 = resourceLocation;
        DefaultResourcePack a2 = this;
        return DefaultResourcePack.class.getResourceAsStream(new StringBuilder().insert(3 ^ 3, LPa.d).append(((ResourceLocation)b2).f()).append(WSa.f).append(((ResourceLocation)b2).J()).toString());
    }
}

