/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public final class WAa
extends Enum<WAa> {
    public static final /* enum */ WAa Y;
    public static final /* enum */ WAa X;
    public static final /* enum */ WAa Z;
    private int field_180058_f;
    public static final /* enum */ WAa X_ROT;
    public static final /* enum */ WAa Y_ROT;
    private static final /* synthetic */ WAa[] $VALUES;

    public static WAa[] values() {
        return (WAa[])$VALUES.clone();
    }

    public static WAa valueOf(String a2) {
        return Enum.valueOf(WAa.class, a2);
    }

    private int func_180055_a() {
        WAa a2;
        return vRa.d << a2.field_180058_f;
    }

    public static Set<WAa> func_180053_a(int n2) {
        int a2;
        int n3 = n2;
        EnumSet<WAa> enumSet = EnumSet.noneOf(WAa.class);
        WAa[] wAaArray = WAa.values();
        int n4 = wAaArray.length;
        int n5 = a2 = uSa.E;
        while (n5 < n4) {
            WAa wAa2 = wAaArray[a2];
            if (wAa2.func_180054_b(n3)) {
                enumSet.add(wAa2);
            }
            n5 = ++a2;
        }
        return enumSet;
    }

    public static int func_180056_a(Set<WAa> set) {
        Iterator<WAa> iterator;
        Set<WAa> set2 = set;
        int a2 = uSa.E;
        Iterator<WAa> iterator2 = iterator = set2.iterator();
        while (iterator2.hasNext()) {
            WAa wAa2 = iterator.next();
            a2 |= wAa2.func_180055_a();
            iterator2 = iterator;
        }
        return a2;
    }

    private WAa(int n3) {
        int b2 = n3;
        WAa a2 = this;
        a2.field_180058_f = b2;
    }

    private boolean func_180054_b(int n2) {
        int b2 = n2;
        WAa a2 = this;
        if ((b2 & a2.func_180055_a()) == a2.func_180055_a()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        X = new WAa(uSa.E);
        Y = new WAa(vRa.d);
        Z = new WAa(uqa.g);
        Y_ROT = new WAa(yRa.d);
        X_ROT = new WAa(AQa.P);
        WAa[] wAaArray = new WAa[tTa.h];
        wAaArray[uSa.E] = X;
        wAaArray[vRa.d] = Y;
        wAaArray[uqa.g] = Z;
        wAaArray[yRa.d] = Y_ROT;
        wAaArray[AQa.P] = X_ROT;
        $VALUES = wAaArray;
    }
}

