/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hia
 *  NA
 *  NTa
 *  U
 *  Vha
 *  j
 *  kga
 *  tk
 */
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Hia_1
implements NA {
    private static final Joiner M;
    private final kga k;
    private final List<j> j;
    private static final Logger J;
    private final Set<String> A;
    public final Map<String, tk> I;

    public Hia_1(kga kga2) {
        Hia_1 a2;
        Hia_1 b2 = kga2;
        Hia_1 hia_1 = a2 = this;
        a2.I = Maps.newHashMap();
        hia_1.j = Lists.newArrayList();
        hia_1.A = Sets.newLinkedHashSet();
        hia_1.k = b2;
    }

    public Set<String> J() {
        Hia_1 a2;
        return a2.A;
    }

    public List<IResource> J(ResourceLocation resourceLocation) throws IOException {
        ResourceLocation b2 = resourceLocation;
        Hia_1 a2 = this;
        U u2 = (U)a2.I.get(b2.f());
        if (u2 != null) {
            return u2.J(b2);
        }
        throw new FileNotFoundException(b2.toString());
    }

    public void J(j j2) {
        Hia_1 b2 = j2;
        Hia_1 a2 = this;
        a2.j.add((j)b2);
        b2.J((U)a2);
    }

    public IResource J(ResourceLocation resourceLocation) throws IOException {
        ResourceLocation b2 = resourceLocation;
        Hia_1 a2 = this;
        U u2 = (U)a2.I.get(b2.f());
        if (u2 != null) {
            return u2.J(b2);
        }
        throw new FileNotFoundException(b2.toString());
    }

    private void f() {
        Hia_1 a2;
        Hia_1 hia_1 = a2;
        hia_1.I.clear();
        hia_1.A.clear();
    }

    private void J() {
        Object a2;
        Hia_1 hia_1 = this;
        Object object = a2 = hia_1.j.iterator();
        while (object.hasNext()) {
            ((j)a2.next()).J((U)hia_1);
            object = a2;
        }
    }

    public void J(List<IResourcePack> list) {
        Iterator b2 = list;
        Hia_1 a2 = this;
        a2.f();
        J.info(new StringBuilder().insert(3 ^ 3, NTa.p).append(M.join(Iterables.transform(b2, new Vha((Hia)a2)))).toString());
        Iterator iterator = b2 = b2.iterator();
        while (iterator.hasNext()) {
            IResourcePack iResourcePack = (IResourcePack)b2.next();
            iterator = b2;
            a2.J(iResourcePack);
        }
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(IResourcePack iResourcePack) {
        void a2;
        Iterator<String> iterator;
        Hia_1 hia_1 = this;
        Iterator<String> iterator2 = iterator = a2.J().iterator();
        while (iterator2.hasNext()) {
            String b2 = iterator.next();
            Hia_1 hia_12 = hia_1;
            hia_12.A.add(b2);
            tk tk2 = hia_12.I.get(b2);
            if (tk2 == null) {
                tk2 = new tk(hia_1.k);
                hia_1.I.put(b2, tk2);
            }
            tk2.J((IResourcePack)a2);
            iterator2 = iterator;
        }
    }

    static {
        J = LogManager.getLogger();
        M = Joiner.on(TOa.n);
    }
}

