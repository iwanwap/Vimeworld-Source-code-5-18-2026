/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fd
 *  HY
 *  N
 *  Vz
 *  XTa
 *  dQa
 *  dy
 *  kga
 *  ld
 *  pX
 *  psa
 *  sA
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;

public final class kga_1 {
    private Gson J;
    private final N<String, mHa<? extends Fd>> A;
    private final GsonBuilder I;

    /*
     * WARNING - void declaration
     */
    public <T extends Fd> void J(sA<T> sA2, Class<T> clazz) {
        void a2;
        sA<T> b2;
        sA<T> c2 = sA2;
        sA<T> sA3 = b2 = this;
        sA3.A.J((Object)c2.J(), new mHa((kga)b2, (sA)c2, (Class)a2, null));
        sA3.I.registerTypeAdapter((Type)a2, c2);
        b2.J = null;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends Fd> T J(String string, JsonObject jsonObject) {
        void a2;
        String c2 = string;
        kga_1 b2 = this;
        if (c2 == null) {
            throw new IllegalArgumentException(Hra.a);
        }
        if (!a2.has(c2)) {
            return (T)((Fd)null);
        }
        if (!a2.get(c2).isJsonObject()) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, rta.ga).append(c2).append(psa.w).append(a2.get(c2)).toString());
        }
        mHa mHa2 = (mHa)b2.A.J((Object)c2);
        if (mHa2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, dQa.ca).append(c2).append(XTa.Z).toString());
        }
        return (T)((Fd)b2.J().fromJson((JsonElement)a2.getAsJsonObject(c2), mHa2.I));
    }

    public kga_1() {
        kga_1 a2;
        kga_1 kga_12 = a2;
        kga_1 kga_13 = a2;
        kga_12.A = new Ky<String, mHa<? extends Fd>>();
        kga_13.I = new GsonBuilder();
        kga_12.I.registerTypeHierarchyAdapter(ld.class, new HY());
        a2.I.registerTypeHierarchyAdapter(Vz.class, new pX());
        a2.I.registerTypeAdapterFactory((TypeAdapterFactory)new dy());
    }

    private Gson J() {
        kga_1 a2;
        if (a2.J == null) {
            a2.J = a2.I.create();
        }
        return a2.J;
    }
}

