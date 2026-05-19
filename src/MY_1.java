/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OCa
 *  jsa
 *  tY
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

public final class MY_1
implements ProfileLookupCallback {
    public final /* synthetic */ OCa A;
    public final /* synthetic */ List I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        void b2;
        Exception c2 = exception;
        MY_1 a2 = this;
        tY.J().warn(new StringBuilder().insert(5 >> 3, jsa.Z).append(b2.getName()).toString(), (Throwable)c2);
    }

    @Override
    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        MY_1 a2;
        GameProfile b2 = gameProfile;
        MY_1 mY_1 = a2 = this;
        mY_1.A.J().J(b2);
        mY_1.I.add(b2);
    }

    public MY_1(OCa oCa2, List object) {
        Object a2 = object;
        object = this;
        ((MY_1)object).A = oCa2;
        ((MY_1)object).I = a2;
        object();
    }
}

