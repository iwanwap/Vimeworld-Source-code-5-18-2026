/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gda
 *  Qba
 *  XTa
 *  fba
 *  vRa
 */
public final class dca_2 {
    public static final /* synthetic */ int[] J;
    public static final /* synthetic */ int[] A;
    public static final /* synthetic */ int[] I;

    static {
        A = new int[Qba.values().length];
        try {
            dca_2.A[Qba.PERFORM_RESPAWN.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.A[Qba.REQUEST_STATS.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.A[Qba.OPEN_INVENTORY_ACHIEVEMENT.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        J = new int[fba.values().length];
        try {
            dca_2.J[fba.START_SNEAKING.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.J[fba.STOP_SNEAKING.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.J[fba.START_SPRINTING.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.J[fba.STOP_SPRINTING.ordinal()] = AQa.P;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.J[fba.STOP_SLEEPING.ordinal()] = tTa.h;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.J[fba.RIDING_JUMP.ordinal()] = uua.p;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.J[fba.OPEN_INVENTORY.ordinal()] = XTa.W;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        I = new int[Gda.values().length];
        try {
            dca_2.I[Gda.DROP_ITEM.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.I[Gda.DROP_ALL_ITEMS.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.I[Gda.RELEASE_USE_ITEM.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.I[Gda.START_DESTROY_BLOCK.ordinal()] = AQa.P;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.I[Gda.ABORT_DESTROY_BLOCK.ordinal()] = tTa.h;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dca_2.I[Gda.STOP_DESTROY_BLOCK.ordinal()] = uua.p;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

