/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class gt
extends Enum<gt> {
    private static final /* synthetic */ gt[] $VALUES;
    public static final /* enum */ gt GUI;
    public static final /* enum */ gt OUTFIT;

    public static gt[] values() {
        return (gt[])$VALUES.clone();
    }

    static {
        OUTFIT = new gt();
        GUI = new gt();
        gt[] gtArray = new gt[uqa.g];
        gtArray[uSa.E] = OUTFIT;
        gtArray[vRa.d] = GUI;
        $VALUES = gtArray;
    }

    public static gt valueOf(String a2) {
        return Enum.valueOf(gt.class, a2);
    }

    private gt() {
        int a2 = n2;
        gt gt2 = this;
    }
}

