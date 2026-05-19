/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Id
 *  VB
 *  sB
 */
import com.google.common.collect.HashBiMap;
import java.util.Map;

public final class Id_2 {
    private final Map<String, vC> I = HashBiMap.create();

    /*
     * WARNING - void declaration
     */
    public Id J(String string, double d2, double d3) {
        void a2;
        void b2;
        String d4 = string;
        Id_2 c2 = this;
        return c2.J(d4, (double)b2, (double)a2, sB.G);
    }

    public Id_2() {
        Id_2 a2;
    }

    public Map<String, vC> J() {
        Id_2 a2;
        return a2.I;
    }

    public vC f(String string) {
        String b2 = string;
        Id_2 a2 = this;
        return a2.I.computeIfAbsent(b2, pd.J());
    }

    public static /* synthetic */ vC J(String a2) {
        return new vC();
    }

    public boolean J() {
        Id_2 a2;
        return a2.I.values().stream().anyMatch(VB.J());
    }

    /*
     * WARNING - void declaration
     */
    private Id J(String string, double d2, double d3, d d4) {
        d e2;
        void b2;
        void c2;
        void d5;
        Id_2 a2;
        Id_2 id_2 = d6;
        d d6 = d4;
        Id_2 id_22 = a2 = id_2;
        id_22.f((String)d5).f((double)c2, (double)b2, e2);
        return id_22;
    }
}

