/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ez
 *  NCa
 *  NTa
 *  OCa
 *  Waa
 *  Yra
 *  dQa
 *  fda
 *  rba
 *  uY
 *  vRa
 */
import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fy_3
extends uY {
    private GameProfile J = null;
    private int A;
    private int I;

    public void J(GameProfile gameProfile) {
        Object b2 = gameProfile;
        fy_3 a2 = this;
        a2.I = yRa.d;
        a2.J = b2;
        a2.J();
    }

    public void f(int n2) {
        fy_3 a2;
        int b2 = n2;
        fy_3 fy_32 = a2 = this;
        fy_32.I = b2;
        fy_32.J = null;
    }

    public fy_3() {
        fy_3 a2;
    }

    public int f() {
        fy_3 a2;
        return a2.I;
    }

    public void J(Waa waa2) {
        fy_3 b2 = waa2;
        fy_3 a2 = this;
        fy_3 fy_32 = b2;
        fy_3 fy_33 = a2;
        super.J((Waa)b2);
        fy_32.J(nqa.T, (byte)(a2.I & osa.Ja));
        fy_32.J(vua.H, (byte)(a2.A & osa.Ja));
        if (fy_33.J != null) {
            Waa waa3 = new Waa();
            rba.J((Waa)waa3, (GameProfile)a2.J);
            b2.J(dQa.l, (NCa)waa3);
        }
    }

    public GameProfile J() {
        fy_3 a2;
        return a2.J;
    }

    private void J() {
        fy_3 a2;
        fy_3 fy_32 = a2;
        fy_32.J = fy_3.J(fy_32.J);
        fy_32.f();
    }

    public KC J() {
        fy_3 fy_32 = this;
        fy_3 a2 = new Waa();
        fy_32.J((Waa)a2);
        return new fda(fy_32.pos, AQa.P, (Waa)a2);
    }

    public int J() {
        fy_3 a2;
        return a2.A;
    }

    public void f(Waa waa2) {
        Object b2 = waa2;
        fy_3 a2 = this;
        fy_3 fy_32 = b2;
        super.f((Waa)fy_32);
        a2.I = fy_32.J(nqa.T);
        a2.A = b2.J(vua.H);
        if (a2.I == yRa.d) {
            if (b2.J(dQa.l, NTa.C)) {
                a2.J = rba.J((Waa)b2.J(dQa.l));
                return;
            }
            if (b2.J(Yra.w, Yqa.i) && !Ez.J((String)(b2 = b2.J(Yra.w)))) {
                fy_3 fy_33 = a2;
                fy_33.J = new GameProfile(null, (String)b2);
                a2.J();
            }
        }
    }

    public void J(int n2) {
        int b2 = n2;
        fy_3 a2 = this;
        a2.A = b2;
    }

    public static GameProfile J(GameProfile gameProfile) {
        GameProfile gameProfile2 = gameProfile;
        if (gameProfile2 != null && !Ez.J((String)gameProfile2.getName())) {
            if (gameProfile2.isComplete() && gameProfile2.getProperties().containsKey(oua.D)) {
                return gameProfile2;
            }
            if (OCa.J() == null) {
                return gameProfile2;
            }
            GameProfile a2 = OCa.J().J().J(gameProfile2.getName());
            if (a2 == null) {
                return gameProfile2;
            }
            if ((Property)Iterables.getFirst(a2.getProperties().get(oua.D), null) == null) {
                a2 = OCa.J().J().fillProfileProperties(a2, vRa.d != 0);
            }
            return a2;
        }
        return gameProfile2;
    }
}

