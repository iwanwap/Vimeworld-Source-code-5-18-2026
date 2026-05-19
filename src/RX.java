/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  uOa
 *  vRa
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;

public final class RX
extends Enum<RX>
implements Predicate<DZ>,
Pb {
    public static final /* enum */ RX X;
    private static final Map<String, RX> NAME_LOOKUP;
    private static final /* synthetic */ RX[] $VALUES;
    public static final /* enum */ RX Y;
    private final LX plane;
    public static final /* enum */ RX Z;
    private final String name;

    public static RX[] values() {
        return (RX[])$VALUES.clone();
    }

    public LX getPlane() {
        RX a2;
        return a2.plane;
    }

    public static RX valueOf(String a2) {
        return Enum.valueOf(RX.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private RX(String string2, LX lX2) {
        Enum c2;
        void b2;
        RX a2;
        RX rX = enum_;
        Enum enum_ = lX2;
        RX rX2 = a2 = rX;
        rX2.name = b2;
        rX2.plane = c2;
    }

    @Override
    public boolean apply(DZ dZ2) {
        Enum b2 = dZ2;
        RX a2 = this;
        if (b2 != null && ((DZ)b2).getAxis() == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static RX byName(String a2) {
        if (a2 == null) {
            return null;
        }
        return NAME_LOOKUP.get(a2.toLowerCase());
    }

    public String getName() {
        RX a2;
        return a2.name;
    }

    static {
        int n2;
        X = new RX(rRa.X, LX.HORIZONTAL);
        Y = new RX(uOa.Ja, LX.VERTICAL);
        Z = new RX(oua.v, LX.HORIZONTAL);
        RX[] rXArray = new RX[yRa.d];
        rXArray[uSa.E] = X;
        rXArray[vRa.d] = Y;
        rXArray[uqa.g] = Z;
        $VALUES = rXArray;
        NAME_LOOKUP = Maps.newHashMap();
        RX[] rXArray2 = RX.values();
        int n3 = rXArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            RX rX = rXArray2[n2];
            NAME_LOOKUP.put(rX.getName2().toLowerCase(), rX);
            n4 = ++n2;
        }
    }

    public boolean isHorizontal() {
        RX a2;
        if (a2.plane == LX.HORIZONTAL) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getName2() {
        RX a2;
        return a2.name;
    }

    public String toString() {
        RX a2;
        return a2.name;
    }

    public boolean isVertical() {
        RX a2;
        if (a2.plane == LX.VERTICAL) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

