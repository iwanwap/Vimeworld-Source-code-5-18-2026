/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rda
 *  vRa
 */
import net.minecraft.block.BlockRailBase$EnumRailDirection;

public final class Uea_1 {
    public static final /* synthetic */ int[] A;
    public static final /* synthetic */ int[] I;

    static {
        I = new int[BlockRailBase$EnumRailDirection.values().length];
        try {
            Uea_1.I[BlockRailBase$EnumRailDirection.ASCENDING_EAST.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.I[BlockRailBase$EnumRailDirection.ASCENDING_WEST.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.I[BlockRailBase$EnumRailDirection.ASCENDING_NORTH.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.I[BlockRailBase$EnumRailDirection.ASCENDING_SOUTH.ordinal()] = AQa.P;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        A = new int[Rda.values().length];
        try {
            Uea_1.A[Rda.CHEST.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.A[Rda.FURNACE.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.A[Rda.TNT.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.A[Rda.SPAWNER.ordinal()] = AQa.P;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.A[Rda.HOPPER.ordinal()] = tTa.h;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Uea_1.A[Rda.COMMAND_BLOCK.ordinal()] = uua.p;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

