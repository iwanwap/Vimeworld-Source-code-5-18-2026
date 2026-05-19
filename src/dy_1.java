/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Ly
 *  dy
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

public final class dy_1
implements TypeAdapterFactory,
D {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        int n2;
        HashMap c2 = typeToken;
        dy_1 a2 = this;
        T[] b2 = ((TypeToken)((Object)c2)).getRawType();
        if (!b2.isEnum()) {
            return null;
        }
        c2 = Maps.newHashMap();
        b2 = b2.getEnumConstants();
        int n3 = b2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object t2 = b2[n2];
            c2.put(a2.J(t2), t2);
            n4 = ++n2;
        }
        return new Ly((dy)a2, c2);
    }

    private String J(Object object) {
        Object b2 = object;
        dy_1 a2 = this;
        if (b2 instanceof Enum) {
            return ((Enum)b2).name().toLowerCase(Locale.US);
        }
        return b2.toString().toLowerCase(Locale.US);
    }

    public static /* synthetic */ String J(dy dy2, Object object) {
        Object b2 = object;
        dy a2 = dy2;
        return super.J(b2);
    }

    public dy_1() {
        dy_1 a2;
    }
}

