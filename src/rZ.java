/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

public final class rZ
implements ProfileLookupCallback {
    public final /* synthetic */ GameProfile[] I;

    @Override
    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        rZ a2 = this;
        a2.I[uSa.E] = b2;
    }

    @Override
    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        Exception c2 = exception;
        rZ a2 = this;
        a2.I[uSa.E] = null;
    }

    public rZ(GameProfile[] gameProfileArray) {
        GameProfile[] a2 = gameProfileArray;
        gameProfileArray = this;
        gameProfileArray.I = a2;
    }
}

