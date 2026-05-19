/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dy
 */
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

public final class Ly_1
extends TypeAdapter<T> {
    public final /* synthetic */ Map val$map;
    public final /* synthetic */ dy this$0;

    @Override
    public T read(JsonReader jsonReader) throws IOException {
        JsonReader b2 = jsonReader;
        Ly_1 a2 = this;
        if (b2.peek() == JsonToken.NULL) {
            b2.nextNull();
            return null;
        }
        return a2.val$map.get(b2.nextString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void write(JsonWriter jsonWriter, T t2) throws IOException {
        void b2;
        Ly_1 c2 = t2;
        Ly_1 a2 = this;
        if (c2 == null) {
            b2.nullValue();
            return;
        }
        b2.value(dy.J((dy)a2.this$0, (Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public Ly_1(dy dy2, Map typeAdapter) {
        void a2;
        TypeAdapter b2 = typeAdapter;
        typeAdapter = this;
        ((Ly_1)typeAdapter).this$0 = a2;
        ((Ly_1)typeAdapter).val$map = b2;
        typeAdapter();
    }
}

