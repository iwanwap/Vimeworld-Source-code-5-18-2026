/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 */
import com.google.gson.JsonObject;

public class ay_3<T>
implements D {
    private final T value;

    public T J() {
        ay_3 a2;
        return a2.value;
    }

    public ay_3(T t2) {
        ay_3<T> b2 = t2;
        ay_3 a2 = this;
        a2.value = b2;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public ay_3(T t2, JsonObject jsonObject) {
        ay_3<T> c2 = t2;
        ay_3 b2 = this;
        b2.value = c2;
    }

    public void J(JsonObject object) {
        Object b2 = object;
        object = this;
    }
}

