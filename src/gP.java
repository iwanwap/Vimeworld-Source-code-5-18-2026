/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CQ
 *  Gq
 *  WQa
 *  Yra
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalNotification;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class gP {
    private static final LoadingCache<String, Bp> A = CacheBuilder.newBuilder().expireAfterAccess(Yra.t, TimeUnit.SECONDS).removalListener(Gq.J()).build(new CQ());
    public static Map<Integer, Bp> I = new HashMap<Integer, Bp>();

    public static /* synthetic */ void J(RemovalNotification a2) {
        if (a2.getValue() != null) {
            ((Bp)a2.getValue()).J();
        }
    }

    public gP() {
        gP a2;
    }

    public static Bp J(String string) {
        String string2 = string;
        if (string2.startsWith(WQa.K) || string2.startsWith(IPa.m) || string2.startsWith(LPa.J)) {
            try {
                return A.get(string2);
            }
            catch (Exception a2) {
                OT.b.error(BQa.a, (Throwable)a2);
            }
        }
        return null;
    }

    public static void J() {
        A.invalidateAll();
        A.cleanUp();
    }
}

