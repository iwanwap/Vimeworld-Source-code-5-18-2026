/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Qsa
 *  Xc
 */
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public final class jAa
implements KC<Xc> {
    private GameProfile I;

    public jAa() {
        jAa a2;
    }

    @Override
    public void J(Xc xc) {
        jAa b2 = xc;
        jAa a2 = this;
        b2.J(a2);
    }

    public GameProfile J() {
        jAa a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        void a2;
        jAa jAa2 = this;
        UUID b2 = jAa2.I.getId();
        a2.writeString(b2 == null ? Mqa.y : b2.toString());
        a2.writeString(jAa2.I.getName());
    }

    @Override
    public void J(Lca lca) throws IOException {
        Object b2 = lca;
        jAa a2 = this;
        Object object = b2;
        b2 = ((Lca)object).readStringFromBuffer(Qsa.Ha);
        String string = ((Lca)object).readStringFromBuffer(ERa.C);
        b2 = UUID.fromString((String)b2);
        jAa jAa2 = a2;
        jAa2.I = new GameProfile((UUID)b2, string);
    }

    public jAa(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        jAa a2 = this;
        a2.I = b2;
    }
}

