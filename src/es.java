/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class es
extends Enum<es> {
    private static final /* synthetic */ es[] $VALUES;
    public static final /* enum */ es SPIN = new es();
    public static final /* enum */ es FRONT = new es();

    static {
        es[] esArray = new es[uqa.g];
        esArray[uSa.E] = SPIN;
        esArray[vRa.d] = FRONT;
        $VALUES = esArray;
    }

    public static es[] values() {
        return (es[])$VALUES.clone();
    }

    private es() {
        int a2 = n2;
        es es2 = this;
    }

    public static es valueOf(String a2) {
        return Enum.valueOf(es.class, a2);
    }
}

