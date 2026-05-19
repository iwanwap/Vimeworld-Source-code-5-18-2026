/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ria
 *  U
 *  kga
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleResource;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class tk_1
implements U {
    private final kga J;
    private static final Logger A = LogManager.getLogger();
    public final List<IResourcePack> I;

    /*
     * WARNING - void declaration
     */
    public IResource J(ResourceLocation resourceLocation) throws IOException {
        int n2;
        void a2;
        tk_1 tk_12 = this;
        IResourcePack iResourcePack = null;
        ResourceLocation resourceLocation2 = tk_1.J((ResourceLocation)a2);
        int n3 = n2 = tk_12.I.size() - vRa.d;
        while (n3 >= 0) {
            IResourcePack b2 = tk_12.I.get(n2);
            if (iResourcePack == null && b2.J(resourceLocation2)) {
                iResourcePack = b2;
            }
            if (b2.J((ResourceLocation)a2)) {
                InputStream inputStream = null;
                if (iResourcePack != null) {
                    inputStream = tk_12.J(resourceLocation2, iResourcePack);
                }
                void v1 = a2;
                return new SimpleResource(b2.J(), (ResourceLocation)v1, tk_12.J((ResourceLocation)v1, b2), inputStream, tk_12.J);
            }
            n3 = --n2;
        }
        throw new FileNotFoundException(a2.toString());
    }

    /*
     * WARNING - void declaration
     */
    public InputStream J(ResourceLocation resourceLocation, IResourcePack iResourcePack) throws IOException {
        void b2;
        void a2;
        tk_1 tk_12 = this;
        InputStream c2 = a2.J((ResourceLocation)b2);
        if (A.isDebugEnabled()) {
            return new Ria(c2, (ResourceLocation)b2, a2.J());
        }
        return c2;
    }

    public tk_1(kga kga2) {
        tk_1 b2 = kga2;
        tk_1 a2 = this;
        a2.I = Lists.newArrayList();
        a2.J = b2;
    }

    public Set<String> J() {
        return null;
    }

    public static /* synthetic */ Logger J() {
        return A;
    }

    /*
     * WARNING - void declaration
     */
    public List<IResource> J(ResourceLocation resourceLocation) throws IOException {
        void a2;
        tk_1 tk_12 = this;
        ArrayList<IResource> arrayList = Lists.newArrayList();
        ResourceLocation resourceLocation2 = tk_1.J((ResourceLocation)a2);
        for (IResourcePack b2 : tk_12.I) {
            if (!b2.J((ResourceLocation)a2)) continue;
            InputStream inputStream = b2.J(resourceLocation2) ? tk_12.J(resourceLocation2, b2) : null;
            void v0 = a2;
            arrayList.add(new SimpleResource(b2.J(), (ResourceLocation)v0, tk_12.J((ResourceLocation)v0, b2), inputStream, tk_12.J));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(a2.toString());
        }
        return arrayList;
    }

    public static ResourceLocation J(ResourceLocation a2) {
        return new ResourceLocation(a2.f(), new StringBuilder().insert(2 & 5, a2.J()).append(Npa.L).toString());
    }

    public void J(IResourcePack iResourcePack) {
        IResourcePack b2 = iResourcePack;
        tk_1 a2 = this;
        a2.I.add(b2);
    }
}

