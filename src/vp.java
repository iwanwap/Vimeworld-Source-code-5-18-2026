/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class vp
extends Enum<vp> {
    private static final /* synthetic */ vp[] $VALUES;
    public static final /* enum */ vp AND;
    public static final /* enum */ vp OR;

    private vp() {
        int a2 = n2;
        vp vp2 = this;
    }

    static {
        OR = new vp();
        AND = new vp();
        vp[] vpArray = new vp[uqa.g];
        vpArray[uSa.E] = OR;
        vpArray[vRa.d] = AND;
        $VALUES = vpArray;
    }

    public static vp valueOf(String a2) {
        return Enum.valueOf(vp.class, a2);
    }

    public static vp[] values() {
        return (vp[])$VALUES.clone();
    }
}

