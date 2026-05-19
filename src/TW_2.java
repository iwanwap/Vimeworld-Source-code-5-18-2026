/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hx
 *  vRa
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class TW_2 {
    private static final Gson A = new GsonBuilder().create();
    private static final Set<String> I = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void J(File a2) {
        if (!I.add(a2.getAbsolutePath())) {
            return;
        }
        Thread thread = new Thread((Runnable)new Hx(a2), wua.R);
        thread.setDaemon(vRa.d != 0);
        thread.start();
    }

    public static /* synthetic */ Gson J() {
        return A;
    }

    public TW_2() {
        TW_2 a2;
    }
}

