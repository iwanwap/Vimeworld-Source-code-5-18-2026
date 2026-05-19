/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mKa
 *  pua
 *  vRa
 */
public final class mKa_3
extends Enum<mKa> {
    public static final /* enum */ mKa UP = new mKa_3(DZ.UP, uSa.E, pua.o);
    public static final /* enum */ mKa LEFT;
    private final int field_178374_g;
    private final int field_178373_f;
    public static final /* enum */ mKa DOWN;
    private final DZ facing;
    private static final /* synthetic */ mKa[] $VALUES;
    public static final /* enum */ mKa RIGHT;

    static {
        DOWN = new mKa_3(DZ.DOWN, uSa.E, vRa.d);
        LEFT = new mKa_3(DZ.EAST, pua.o, uSa.E);
        RIGHT = new mKa_3(DZ.WEST, vRa.d, uSa.E);
        mKa_3[] mKa_3Array = new mKa_3[AQa.P];
        mKa_3Array[uSa.E] = UP;
        mKa_3Array[vRa.d] = DOWN;
        mKa_3Array[uqa.g] = LEFT;
        mKa_3Array[yRa.d] = RIGHT;
        $VALUES = mKa_3Array;
    }

    private boolean func_178369_d() {
        mKa_3 a2;
        if (a2 == DOWN || a2 == UP) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static mKa[] values() {
        return (mKa[])$VALUES.clone();
    }

    public int func_178371_c() {
        mKa_3 a2;
        return a2.field_178374_g;
    }

    public DZ getFacing() {
        mKa_3 a2;
        return a2.facing;
    }

    public static mKa valueOf(String a2) {
        return Enum.valueOf(mKa_3.class, a2);
    }

    public int func_178372_b() {
        mKa_3 a2;
        return a2.field_178373_f;
    }

    /*
     * WARNING - void declaration
     */
    private mKa_3(DZ dZ2, int n3, int n4) {
        void d2;
        void b2;
        void c2;
        mKa_3 a2;
        int n5 = n4;
        mKa_3 mKa_32 = a2 = this;
        a2.facing = c2;
        mKa_32.field_178373_f = b2;
        mKa_32.field_178374_g = d2;
    }

    public static /* synthetic */ boolean access$000(mKa a2) {
        return super.func_178369_d();
    }
}

