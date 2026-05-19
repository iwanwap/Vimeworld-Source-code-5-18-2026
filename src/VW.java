/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  vRa
 *  zU
 */
import com.mojang.authlib.GameProfile;

public final class VW
extends XW {
    public final /* synthetic */ zU I;

    @Override
    public boolean t() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(int n2, Mda mda2) {
        void b2;
        VW c2 = mda2;
        VW a2 = this;
        if (b2 == false) {
            a2.K.j[a2.K.J] = c2;
            return;
        }
        a2.K.A[b2 - vRa.d] = c2;
    }

    /*
     * WARNING - void declaration
     */
    public VW(zU zU2, Gg gg2, GameProfile gameProfile) {
        void b2;
        void c2;
        Object d2 = gameProfile;
        VW a2 = this;
        a2.I = c2;
        super((Gg)b2, (GameProfile)d2);
    }
}

