/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qqa
 *  ay
 *  fz
 *  iZ
 *  uy
 *  vRa
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fz_1<K, V extends ay<K>> {
    private static final ParameterizedType M;
    private final File k;
    public final Gson j;
    public static final Logger J;
    private boolean A;
    private final Map<String, V> I;

    public void J(boolean bl) {
        boolean b2 = bl;
        fz_1 a2 = this;
        a2.A = b2;
    }

    public V J(K k2) {
        fz_1 a2;
        fz_1<K, V> b2 = k2;
        fz_1 fz_12 = a2 = this;
        fz_12.J();
        return (V)((ay)fz_12.I.get(a2.J((K)b2)));
    }

    public void J(V v2) {
        fz_1<K, V> b22 = v2;
        fz_1 a2 = this;
        a2.I.put(a2.J((K)b22.J()), b22);
        try {
            a2.f();
            return;
        }
        catch (IOException b22) {
            J.warn(EPa.M, (Throwable)b22);
            return;
        }
    }

    public void J(K k2) {
        fz_1<K, V> b22 = k2;
        fz_1 a2 = this;
        a2.I.remove(a2.J((K)b22));
        try {
            a2.f();
            return;
        }
        catch (IOException b22) {
            J.warn(Qqa.w, (Throwable)b22);
            return;
        }
    }

    public String J(K k2) {
        fz_1<K, V> b2 = k2;
        fz_1 a2 = this;
        return b2.toString();
    }

    public ay<K> J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        fz_1 a2 = this;
        return new ay(null, b2);
    }

    static {
        J = LogManager.getLogger();
        M = new uy();
    }

    public String[] J() {
        fz_1 a2;
        return a2.I.keySet().toArray(new String[a2.I.size()]);
    }

    public Map<String, V> J() {
        fz_1 a2;
        return a2.I;
    }

    public fz_1(File file) {
        fz_1 a2;
        Object b2 = file;
        fz_1 fz_12 = a2 = this;
        fz_12.I = Maps.newHashMap();
        fz_12.A = vRa.d;
        fz_12.k = b2;
        b2 = new GsonBuilder().setPrettyPrinting();
        ((GsonBuilder)b2).registerTypeHierarchyAdapter(ay.class, new iZ((fz)a2, null));
        a2.j = ((GsonBuilder)b2).create();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() throws IOException {
        fz_1 fz_12;
        fz_1 fz_13 = fz_12 = this;
        Object a22 = fz_13.I.values();
        a22 = fz_13.j.toJson(a22);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter(fz_12.k, Charsets.UTF_8);
            bufferedWriter.write((String)a22);
        }
        catch (Throwable a22) {
            IOUtils.closeQuietly(bufferedWriter);
            throw a22;
        }
        IOUtils.closeQuietly(bufferedWriter);
    }

    private void J() {
        Object object;
        fz_1 fz_12 = this;
        ArrayList<Object> arrayList = Lists.newArrayList();
        Iterator a2 = fz_12.I.values().iterator();
        while (a2.hasNext()) {
            object = (ay)a2.next();
            if (!object.J()) continue;
            arrayList.add(object.J());
        }
        Iterator iterator = a2 = arrayList.iterator();
        while (iterator.hasNext()) {
            Iterator iterator2 = a2;
            iterator = iterator2;
            object = iterator2.next();
            fz_12.I.remove(object);
        }
    }

    public boolean J(K k2) {
        fz_1<K, V> b2 = k2;
        fz_1 a2 = this;
        return a2.I.containsKey(a2.J((K)b2));
    }

    public boolean J() {
        fz_1 a2;
        return a2.A;
    }
}

