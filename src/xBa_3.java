/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  RPa
 *  ZOa
 *  vRa
 *  xBa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class xBa_3
extends Enum<xBa> {
    public static final /* enum */ xBa ALWAYS;
    public final int field_178827_f;
    private static final /* synthetic */ xBa[] $VALUES;
    public static final /* enum */ xBa NEVER;
    public final String field_178830_e;
    public static final /* enum */ xBa HIDE_FOR_OWN_TEAM;
    public static final /* enum */ xBa HIDE_FOR_OTHER_TEAMS;
    private static Map<String, xBa> field_178828_g;

    static {
        int n2;
        ALWAYS = new xBa_3(Bta.Da, uSa.E);
        NEVER = new xBa_3(FPa.Ga, vRa.d);
        HIDE_FOR_OTHER_TEAMS = new xBa_3(RPa.K, uqa.g);
        HIDE_FOR_OWN_TEAM = new xBa_3(ZOa.G, yRa.d);
        xBa_3[] xBa_3Array = new xBa_3[AQa.P];
        xBa_3Array[uSa.E] = ALWAYS;
        xBa_3Array[vRa.d] = NEVER;
        xBa_3Array[uqa.g] = HIDE_FOR_OTHER_TEAMS;
        xBa_3Array[yRa.d] = HIDE_FOR_OWN_TEAM;
        $VALUES = xBa_3Array;
        field_178828_g = Maps.newHashMap();
        xBa[] xBaArray = xBa_3.values();
        int n3 = xBaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            xBa xBa2 = xBaArray[n2];
            field_178828_g.put(xBa2.field_178830_e, xBa2);
            n4 = ++n2;
        }
    }

    public static xBa valueOf(String a2) {
        return Enum.valueOf(xBa_3.class, a2);
    }

    public static xBa func_178824_a(String a2) {
        return (xBa_3)field_178828_g.get(a2);
    }

    public static xBa[] values() {
        return (xBa[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private xBa_3(String string2, int n3) {
        void c2;
        void b2;
        xBa_3 a2;
        int n4 = n3;
        xBa_3 xBa_32 = a2 = this;
        xBa_32.field_178830_e = b2;
        xBa_32.field_178827_f = c2;
    }

    public static String[] func_178825_a() {
        return field_178828_g.keySet().toArray(new String[field_178828_g.size()]);
    }
}

