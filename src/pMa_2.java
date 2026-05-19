/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;

public final class pMa_2 {
    public static final /* synthetic */ int[] I;

    static {
        I = new int[MinecraftProfileTexture.Type.values().length];
        try {
            pMa_2.I[MinecraftProfileTexture.Type.SKIN.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            pMa_2.I[MinecraftProfileTexture.Type.CAPE.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

