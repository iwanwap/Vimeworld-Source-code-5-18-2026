/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fd
 *  kga
 *  vRa
 */
package net.minecraft.client.resources;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SimpleResource
implements IResource {
    private JsonObject C;
    private boolean i;
    private final kga M;
    private final String k;
    private final InputStream j;
    private final ResourceLocation J;
    private final Map<String, Fd> A;
    private final InputStream I;

    public int hashCode() {
        SimpleResource simpleResource = this;
        int a2 = simpleResource.k != null ? simpleResource.k.hashCode() : uSa.E;
        a2 = tua.U * a2 + (simpleResource.J != null ? simpleResource.J.hashCode() : uSa.E);
        return a2;
    }

    @Override
    public ResourceLocation J() {
        SimpleResource a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public SimpleResource(String string, ResourceLocation resourceLocation, InputStream inputStream, InputStream inputStream2, kga kga2) {
        SimpleResource f2;
        void b2;
        void c2;
        void d2;
        void e2;
        SimpleResource a2;
        SimpleResource simpleResource = simpleResource2;
        SimpleResource simpleResource2 = kga2;
        SimpleResource simpleResource3 = a2 = simpleResource;
        SimpleResource simpleResource4 = a2;
        a2.A = Maps.newHashMap();
        a2.k = e2;
        simpleResource4.J = d2;
        simpleResource4.I = c2;
        simpleResource3.j = b2;
        simpleResource3.M = f2;
    }

    @Override
    public boolean J() {
        SimpleResource a2;
        if (a2.j != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public InputStream J() {
        SimpleResource a2;
        return a2.I;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof SimpleResource)) {
            return uSa.E != 0;
        }
        b2 = (SimpleResource)b2;
        if (((SimpleResource)a2).J != null ? !((SimpleResource)a2).J.equals(((SimpleResource)b2).J) : ((SimpleResource)b2).J != null) {
            return uSa.E != 0;
        }
        if (((SimpleResource)a2).k != null ? !((SimpleResource)a2).k.equals(((SimpleResource)b2).k) : ((SimpleResource)b2).k != null) {
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    @Override
    public String J() {
        SimpleResource a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <T extends Fd> T J(String string) {
        void a2;
        SimpleResource simpleResource;
        Object b2;
        Object object;
        block5: {
            block4: {
                object = this;
                if (!((SimpleResource)object).J()) {
                    return (T)((Fd)null);
                }
                if (((SimpleResource)object).C != null || ((SimpleResource)object).i) break block4;
                ((SimpleResource)object).i = vRa.d;
                b2 = null;
                try {
                    b2 = new BufferedReader(new InputStreamReader(((SimpleResource)object).j));
                    SimpleResource simpleResource2 = object;
                    simpleResource2.C = new JsonParser().parse((Reader)b2).getAsJsonObject();
                    simpleResource = object;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly((Reader)b2);
                    throw throwable;
                }
                IOUtils.closeQuietly((Reader)b2);
                break block5;
            }
            simpleResource = object;
        }
        b2 = simpleResource.A.get(a2);
        if (b2 == null) {
            b2 = ((SimpleResource)object).M.J((String)a2, ((SimpleResource)object).C);
        }
        return (T)b2;
    }
}

