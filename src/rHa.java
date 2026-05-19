/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 */
import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

public final class rHa
extends CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> {
    public final /* synthetic */ yHa I;

    public rHa(yHa yHa2) {
        yHa b2 = yHa2;
        rHa a2 = this;
        a2.I = b2;
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> J(GameProfile gameProfile) throws Exception {
        GameProfile b2 = gameProfile;
        rHa a2 = this;
        return Kpa.J().J().getTextures(b2, uSa.E != 0);
    }
}

