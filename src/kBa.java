/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  zTa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class kBa
extends Enum<kBa> {
    public static final /* enum */ kBa INTEGER;
    private static final /* synthetic */ kBa[] $VALUES;
    private final String field_178798_d;
    private static final Map<String, kBa> field_178801_c;
    public static final /* enum */ kBa HEARTS;

    public static kBa[] values() {
        return (kBa[])$VALUES.clone();
    }

    static {
        int n2;
        INTEGER = new kBa(eua.d);
        HEARTS = new kBa(zTa.d);
        kBa[] kBaArray = new kBa[uqa.g];
        kBaArray[uSa.E] = INTEGER;
        kBaArray[vRa.d] = HEARTS;
        $VALUES = kBaArray;
        field_178801_c = Maps.newHashMap();
        kBa[] kBaArray2 = kBa.values();
        int n3 = kBaArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            kBa kBa2 = kBaArray2[n2];
            field_178801_c.put(kBa2.func_178796_a(), kBa2);
            n4 = ++n2;
        }
    }

    public static kBa valueOf(String a2) {
        return Enum.valueOf(kBa.class, a2);
    }

    private kBa(String string2) {
        Object b2 = string2;
        kBa a2 = this;
        a2.field_178798_d = b2;
    }

    public String func_178796_a() {
        kBa a2;
        return a2.field_178798_d;
    }

    public static kBa func_178795_a(String string) {
        String string2 = string;
        Object a2 = field_178801_c.get(string2);
        if (a2 == null) {
            return INTEGER;
        }
        return a2;
    }
}

