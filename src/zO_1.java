/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  zO
 */
public final class zO_1
extends Enum<zO> {
    public static final /* enum */ zO STEP = new zO_1();
    public static final /* enum */ zO LINEAR = new zO_1();
    private static final /* synthetic */ zO[] $VALUES;
    public static final /* enum */ zO CATMULLROM = new zO_1();
    public static final /* enum */ zO BEZIER = new zO_1();

    private zO_1() {
        int a2 = n2;
        zO_1 zO_12 = this;
    }

    static {
        zO_1[] zO_1Array = new zO_1[AQa.P];
        zO_1Array[uSa.E] = STEP;
        zO_1Array[vRa.d] = LINEAR;
        zO_1Array[uqa.g] = CATMULLROM;
        zO_1Array[yRa.d] = BEZIER;
        $VALUES = zO_1Array;
    }

    public static zO[] values() {
        return (zO[])$VALUES.clone();
    }

    public static zO valueOf(String a2) {
        return Enum.valueOf(zO_1.class, a2);
    }
}

