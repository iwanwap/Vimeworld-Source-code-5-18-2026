/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  U
 */
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.SimpleResource;
import net.minecraft.util.ResourceLocation;

public final class GK_1
implements U {
    private final Map<String, byte[]> I;

    public IResource J(ResourceLocation resourceLocation) throws IOException {
        ResourceLocation b2 = resourceLocation;
        GK_1 a2 = this;
        byte[] byArray = a2.I.get(b2.J());
        byte[] byArray2 = a2.I.get(new StringBuilder().insert(3 >> 2, b2.J()).append(Npa.L).toString());
        if (byArray == null) {
            throw new FileNotFoundException(b2.toString());
        }
        return new SimpleResource(ypa.K, b2, new ByteArrayInputStream(byArray), byArray2 == null ? null : new ByteArrayInputStream(byArray2), Kpa.J().E);
    }

    public Set<String> J() {
        return Collections.singleton(APa.m);
    }

    public GK_1(Map<String, byte[]> map) {
        Map<String, byte[]> b2 = map;
        GK_1 a2 = this;
        a2.I = b2;
    }

    public List<IResource> J(ResourceLocation resourceLocation) throws IOException {
        ResourceLocation b2 = resourceLocation;
        GK_1 a2 = this;
        return Collections.singletonList(a2.J(b2));
    }
}

