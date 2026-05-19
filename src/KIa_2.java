/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  KIa
 *  ZOa
 *  aSa
 *  nka
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class KIa_2
extends Enum<KIa> {
    public static final /* enum */ KIa FRAGMENT;
    private static final /* synthetic */ KIa[] $VALUES;
    public static final /* enum */ KIa VERTEX;
    private final String shaderName;
    private final Map<String, VGa> loadedShaders;
    private final String shaderExtension;
    private final int shaderMode;

    public int getShaderMode() {
        KIa_2 a2;
        return a2.shaderMode;
    }

    public String getShaderExtension() {
        KIa_2 a2;
        return a2.shaderExtension;
    }

    static {
        VERTEX = new KIa_2(ZOa.X, Cra.F, nka.p);
        FRAGMENT = new KIa_2(aSa.J, gsa.j, nka.y);
        KIa_2[] kIa_2Array = new KIa_2[uqa.g];
        kIa_2Array[uSa.E] = VERTEX;
        kIa_2Array[vRa.d] = FRAGMENT;
        $VALUES = kIa_2Array;
    }

    public Map<String, VGa> getLoadedShaders() {
        KIa_2 a2;
        return a2.loadedShaders;
    }

    /*
     * WARNING - void declaration
     */
    private KIa_2(String string2, String string3, int n3) {
        void d2;
        void b2;
        void c2;
        KIa_2 a2;
        int n4 = n3;
        KIa_2 kIa_2 = a2 = this;
        a2.loadedShaders = Maps.newHashMap();
        a2.shaderName = c2;
        kIa_2.shaderExtension = b2;
        kIa_2.shaderMode = d2;
    }

    public static KIa valueOf(String a2) {
        return Enum.valueOf(KIa_2.class, a2);
    }

    public String getShaderName() {
        KIa_2 a2;
        return a2.shaderName;
    }

    public static KIa[] values() {
        return (KIa[])$VALUES.clone();
    }
}

