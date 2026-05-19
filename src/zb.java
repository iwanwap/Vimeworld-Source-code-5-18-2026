/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class zb {
    public static final /* synthetic */ int[] I;

    static {
        I = new int[Xy.values().length];
        try {
            zb.I[Xy.WINDOWS.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zb.I[Xy.OSX.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zb.I[Xy.LINUX.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

