/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  ZOa
 *  vRa
 *  xq
 */
public final class xq_2
extends Enum<xq> {
    public static final /* enum */ xq OPTIFINE_JPM;
    public static final /* enum */ xq BEDROCK_OLD;
    public static final /* enum */ xq GENERIC;
    public static final /* enum */ xq OPTIFINE_JEM;
    private final String id;
    private boolean per_texture_uv_size;
    public static final /* enum */ xq OTHER;
    private static final /* synthetic */ xq[] $VALUES;

    public boolean isPerTextureUVSize() {
        xq_2 a2;
        return a2.per_texture_uv_size;
    }

    public static /* synthetic */ String access$000(xq a2) {
        return a2.id;
    }

    static {
        BEDROCK_OLD = new xq_2(Tpa.Ha);
        OPTIFINE_JPM = new xq_2(ROa.P);
        OPTIFINE_JEM = new xq_2(ZOa.o);
        GENERIC = new xq_2(IPa.O);
        OTHER = new xq_2(Ora.p);
        xq_2[] xq_2Array = new xq_2[tTa.h];
        xq_2Array[uSa.E] = BEDROCK_OLD;
        xq_2Array[vRa.d] = OPTIFINE_JPM;
        xq_2Array[uqa.g] = OPTIFINE_JEM;
        xq_2Array[yRa.d] = GENERIC;
        xq_2Array[AQa.P] = OTHER;
        $VALUES = xq_2Array;
        xq_2.GENERIC.per_texture_uv_size = vRa.d;
        xq_2.OPTIFINE_JPM.per_texture_uv_size = vRa.d;
        xq_2.OPTIFINE_JEM.per_texture_uv_size = vRa.d;
    }

    private xq_2(String string2) {
        Object b2 = string2;
        xq_2 a2 = this;
        a2.per_texture_uv_size = uSa.E;
        a2.id = b2;
    }

    public static xq valueOf(String a2) {
        return Enum.valueOf(xq_2.class, a2);
    }

    public static xq[] values() {
        return (xq[])$VALUES.clone();
    }
}

