/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dia
 *  Kpa
 *  xHa
 *  yb
 */
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import java.util.HashMap;
import java.util.Map;

public final class xHa_3
implements Runnable {
    public final /* synthetic */ yb j;
    public final /* synthetic */ GameProfile J;
    public final /* synthetic */ yHa A;
    public final /* synthetic */ boolean I;

    @Override
    public void run() {
        HashMap hashMap;
        xHa_3 xHa_32 = this;
        HashMap a2 = Maps.newHashMap();
        try {
            xHa_3 xHa_33 = xHa_32;
            a2.putAll(yHa.J(xHa_32.A).getTextures(xHa_33.J, xHa_33.I));
            hashMap = a2;
        }
        catch (InsecureTextureException insecureTextureException) {
            hashMap = a2;
        }
        if (hashMap.isEmpty() && xHa_32.J.getId().equals(Kpa.J().J().J().getId())) {
            xHa_3 xHa_34 = xHa_32;
            xHa_34.J.getProperties().clear();
            xHa_34.J.getProperties().putAll(Kpa.J().f());
            a2.putAll(yHa.J(xHa_32.A).getTextures(xHa_32.J, uSa.E != 0));
        }
        Kpa.J().J((Runnable)new Dia((xHa)xHa_32, (Map)a2));
    }

    /*
     * WARNING - void declaration
     */
    public xHa_3(yHa yHa2, GameProfile gameProfile, boolean bl, yb object) {
        xHa_3 b2;
        void a2;
        xHa_3 xHa_32 = xHa_33;
        xHa_3 xHa_33 = object;
        Object object2 = object = xHa_32;
        object2.A = a2;
        object2.J = gameProfile;
        object.I = bl;
        object.j = b2;
    }
}

