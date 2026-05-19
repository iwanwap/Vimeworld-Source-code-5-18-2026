/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  kb
 */
import com.mojang.authlib.GameProfile;
import java.io.IOException;

public final class VBa
implements KC<kb> {
    private GameProfile I;

    public VBa() {
        VBa a2;
    }

    public VBa(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        VBa a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(kb kb2) {
        VBa b2 = kb2;
        VBa a2 = this;
        b2.J(a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        VBa a2 = this;
        b2.writeString(a2.I.getName());
    }

    @Override
    public void J(Lca lca) throws IOException {
        VBa a2;
        Lca b2 = lca;
        VBa vBa = a2 = this;
        vBa.I = new GameProfile(null, b2.readStringFromBuffer(ERa.C));
    }

    public GameProfile J() {
        VBa a2;
        return a2.I;
    }
}

