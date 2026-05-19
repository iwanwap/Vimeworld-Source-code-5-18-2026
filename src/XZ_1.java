/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  XZ
 *  pua
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class XZ_1
extends Enum<XZ> {
    private static final /* synthetic */ XZ[] $VALUES;
    private final String sessionType;
    public static final /* enum */ XZ MOJANG;
    public static final /* enum */ XZ LEGACY;
    private static final Map<String, XZ> SESSION_TYPES;

    static {
        int n2;
        LEGACY = new XZ_1(pua.i);
        MOJANG = new XZ_1(Cra.N);
        XZ_1[] xZ_1Array = new XZ_1[uqa.g];
        xZ_1Array[uSa.E] = LEGACY;
        xZ_1Array[vRa.d] = MOJANG;
        $VALUES = xZ_1Array;
        SESSION_TYPES = Maps.newHashMap();
        XZ[] xZArray = XZ_1.values();
        int n3 = xZArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            XZ xZ2 = xZArray[n2];
            SESSION_TYPES.put(xZ2.sessionType, xZ2);
            n4 = ++n2;
        }
    }

    private XZ_1(String string2) {
        Object b2 = string2;
        XZ_1 a2 = this;
        a2.sessionType = b2;
    }

    public static XZ setSessionType(String a2) {
        return (XZ_1)SESSION_TYPES.get(a2.toLowerCase());
    }

    public static XZ[] values() {
        return (XZ[])$VALUES.clone();
    }

    public static XZ valueOf(String a2) {
        return Enum.valueOf(XZ_1.class, a2);
    }
}

