/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  OCa
 *  Waa
 *  bFa
 *  nBa
 */
import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fda_2
extends Cba {
    private Waa I;

    @Override
    public Waa J() {
        Fda_2 a2;
        return a2.I;
    }

    @Override
    public void l(bFa bFa2) {
        Fda_2 b2 = bFa2;
        Fda_2 a2 = this;
        if (b2.J().equals(a2.J().e())) {
            a2.I = new Waa();
            b2.C(a2.I);
        }
        super.l((bFa)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String J(SocketAddress socketAddress, GameProfile gameProfile) {
        void b2;
        GameProfile c2 = gameProfile;
        Fda_2 a2 = this;
        if (c2.getName().equalsIgnoreCase(a2.J().e()) && a2.J(c2.getName()) != null) {
            return ySa.b;
        }
        return super.J((SocketAddress)b2, c2);
    }

    public nBa J() {
        Fda_2 a2;
        return (nBa)super.J();
    }

    public Fda_2(nBa nBa2) {
        Fda_2 a2;
        Fda_2 b2 = nBa2;
        Fda_2 fda_2 = a2 = this;
        super((OCa)b2);
        fda_2.J(NTa.C);
    }
}

