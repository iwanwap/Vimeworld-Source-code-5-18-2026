/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HAa
 *  HY
 *  QBa
 *  Vz
 *  aBa
 *  dy
 *  eBa
 *  jBa
 *  kCa
 *  ld
 *  pX
 *  td
 *  zba
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;

public final class eBa_1
implements KC<td> {
    private static final Gson A = new GsonBuilder().registerTypeAdapter((Type)((Object)HAa.class), new aBa()).registerTypeAdapter((Type)((Object)QBa.class), new zba()).registerTypeAdapter((Type)((Object)kCa.class), new jBa()).registerTypeHierarchyAdapter(ld.class, new HY()).registerTypeHierarchyAdapter(Vz.class, new pX()).registerTypeAdapterFactory((TypeAdapterFactory)new dy()).create();
    private kCa I;

    @Override
    public void J(td td2) {
        eBa_1 b2 = td2;
        eBa_1 a2 = this;
        b2.J((eBa)a2);
    }

    public eBa_1() {
        eBa_1 a2;
    }

    public kCa J() {
        eBa_1 a2;
        return a2.I;
    }

    public eBa_1(kCa kCa2) {
        eBa_1 b2 = kCa2;
        eBa_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        eBa_1 a2 = this;
        a2.I = A.fromJson(b2.readStringFromBuffer(BQa.h), kCa.class);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        eBa_1 a2 = this;
        b2.writeString(A.toJson(a2.I));
    }
}

