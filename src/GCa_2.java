/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  GCa
 *  JPa
 *  PTa
 *  SRa
 *  URa
 *  WQa
 *  aQa
 *  jd
 *  lqa
 *  vRa
 *  vpa
 *  yQa
 */
import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GCa_2 {
    private boolean m;
    private final String C;
    private int i;
    private final Map<String, Object> M;
    private final long k;
    private final Map<String, Object> j;
    private final jd J;
    private final Object A;
    private final Timer I;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void f(String string, Object object) {
        GCa_2 gCa_2 = this;
        Object c2 = gCa_2.A;
        synchronized (c2) {
            void a2;
            void b2;
            gCa_2.M.put((String)b2, a2);
            return;
        }
    }

    private void d() {
        GCa_2 gCa_2 = this;
        Iterator a2 = ManagementFactory.getRuntimeMXBean().getInputArguments();
        int n2 = uSa.E;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            String string = (String)a2.next();
            if (!string.startsWith(fPa.la)) continue;
            StringBuilder stringBuilder = new StringBuilder().append(WQa.y).append(n2).append(XOa.D);
            ++n2;
            gCa_2.f(stringBuilder.toString(), string);
        }
        gCa_2.f(URa.B, n2);
    }

    /*
     * WARNING - void declaration
     */
    public GCa_2(String string, jd jd2, long l2) {
        void a2;
        GCa_2 b2;
        GCa_2 d2 = jd2;
        GCa_2 gCa_2 = b2 = this;
        b2.j = Maps.newHashMap();
        b2.M = Maps.newHashMap();
        b2.C = UUID.randomUUID().toString();
        GCa_2 gCa_22 = b2;
        b2.I = new Timer(rQa.A, vRa.d != 0);
        b2.A = new Object();
        gCa_2.J = d2;
        gCa_2.k = a2;
    }

    public void C() {
    }

    public long J() {
        GCa_2 a2;
        return a2.k;
    }

    public void l() {
        GCa_2 a2;
        GCa_2 gCa_2 = a2;
        gCa_2.J(PTa.X, Runtime.getRuntime().totalMemory());
        gCa_2.J(yQa.K, Runtime.getRuntime().maxMemory());
        gCa_2.J(lTa.c, Runtime.getRuntime().freeMemory());
        gCa_2.J(Psa.Da, Runtime.getRuntime().availableProcessors());
        gCa_2.J.f((GCa)a2);
    }

    private void f() {
        GCa_2 a2;
        GCa_2 gCa_2 = a2;
        gCa_2.d();
        GCa_2 gCa_22 = a2;
        gCa_2.f(SRa.C, gCa_22.C);
        gCa_22.J(SRa.C, a2.C);
        gCa_2.J(aQa.I, System.getProperty(JPa.G));
        gCa_2.J(fPa.B, System.getProperty(sSa.la));
        gCa_2.J(vpa.O, System.getProperty(wsa.Y));
        gCa_2.J(FTa.y, System.getProperty(lqa.Ga));
        gCa_2.f(uSa.K, nua.D);
        gCa_2.J.J((GCa)a2);
    }

    public String J() {
        GCa_2 a2;
        return a2.C;
    }

    public void J() {
        GCa_2 a2;
        a2.I.cancel();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map<String, String> J() {
        GCa_2 gCa_2 = this;
        LinkedHashMap<String, String> linkedHashMap = Maps.newLinkedHashMap();
        Object object = gCa_2.A;
        synchronized (object) {
            Map.Entry<String, Object> entry;
            Iterator<Map.Entry<String, Object>> a2;
            GCa_2 gCa_22 = gCa_2;
            gCa_22.l();
            Iterator<Map.Entry<String, Object>> iterator = a2 = gCa_22.j.entrySet().iterator();
            while (iterator.hasNext()) {
                entry = (Map.Entry<String, Object>)a2.next();
                iterator = a2;
                linkedHashMap.put((String)entry.getKey(), entry.getValue().toString());
            }
            Iterator<Map.Entry<String, Object>> iterator2 = a2 = gCa_2.M.entrySet().iterator();
            while (iterator2.hasNext()) {
                entry = a2.next();
                iterator2 = a2;
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
    }

    public boolean J() {
        GCa_2 a2;
        return a2.m;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(String string, Object object) {
        GCa_2 gCa_2 = this;
        Object c2 = gCa_2.A;
        synchronized (c2) {
            void a2;
            void b2;
            gCa_2.j.put((String)b2, a2);
            return;
        }
    }
}

