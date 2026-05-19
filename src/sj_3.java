/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ol
 *  pua
 *  tk
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleResource;
import net.minecraft.util.ResourceLocation;

public final class sj_3
extends tk {
    private Ol I;

    /*
     * WARNING - void declaration
     */
    public List<IResource> J(ResourceLocation resourceLocation) throws IOException {
        void a2;
        sj_3 sj_32 = this;
        Object b2 = sj_32.J((ResourceLocation)a2);
        if (b2 == null) {
            throw new FileNotFoundException(a2.toString());
        }
        IResource[] iResourceArray = new IResource[vRa.d];
        iResourceArray[uSa.E] = b2;
        return Lists.newArrayList(iResourceArray);
    }

    public IResource J(ResourceLocation resourceLocation) throws IOException {
        ResourceLocation b2;
        block3: {
            b2 = resourceLocation;
            sj_3 a2 = this;
            try {
                String string = b2.J();
                if (!string.startsWith(pua.v)) break block3;
                return a2.J(b2, new FileInputStream(a2.I.J(b2)));
            }
            catch (IOException iOException) {
                OT.b.error(sqa.u, (Throwable)iOException);
                return null;
            }
        }
        throw new FileNotFoundException(b2.toString());
    }

    public sj_3(Ol ol2) {
        sj_3 b2 = ol2;
        sj_3 a2 = this;
        super(null);
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    private IResource J(ResourceLocation resourceLocation, InputStream inputStream) {
        void b2;
        Object c2 = inputStream;
        sj_3 a2 = this;
        return new SimpleResource(Jqa.fa, (ResourceLocation)b2, (InputStream)c2, null, null);
    }

    public InputStream J(ResourceLocation resourceLocation, IResourcePack iResourcePack) throws IOException {
        Object c2 = iResourcePack;
        sj_3 a2 = this;
        throw new IllegalStateException(ppa.Z);
    }
}

