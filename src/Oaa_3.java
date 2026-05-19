/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TPa
 *  XZ
 */
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Oaa_3 {
    private final String j;
    private final XZ J;
    private final String A;
    private final String I;

    public String C() {
        Oaa_3 a2;
        return a2.I;
    }

    public XZ J() {
        Oaa_3 a2;
        return a2.J;
    }

    public GameProfile J() {
        Oaa_3 oaa_3 = this;
        try {
            UUID a2 = UUIDTypeAdapter.fromString(oaa_3.C());
            return new GameProfile(a2, oaa_3.J());
        }
        catch (IllegalArgumentException a2) {
            return new GameProfile(null, oaa_3.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public Oaa_3(String string, String string2, String string3, String string4) {
        String e2;
        void b2;
        void c2;
        void d2;
        Oaa_3 a2;
        Oaa_3 oaa_3 = string5;
        String string5 = string4;
        Oaa_3 oaa_32 = a2 = oaa_3;
        Oaa_3 oaa_33 = a2;
        oaa_33.j = d2;
        oaa_33.I = c2;
        oaa_32.A = b2;
        oaa_32.J = XZ.setSessionType((String)e2);
    }

    public String l() {
        Oaa_3 a2;
        return a2.A;
    }

    public String f() {
        Oaa_3 a2;
        return new StringBuilder().insert(5 >> 3, TPa.m).append(a2.A).append(Era.Aa).append(a2.I).toString();
    }

    public String J() {
        Oaa_3 a2;
        return a2.j;
    }
}

