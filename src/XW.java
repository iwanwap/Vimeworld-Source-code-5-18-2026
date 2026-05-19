/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ez
 *  Gg
 *  JPa
 *  Kpa
 *  Sw
 *  UIa
 *  Vna
 *  aJa
 *  bd
 *  gla
 *  isa
 *  kLa
 *  pqa
 *  vRa
 *  xOa
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class XW
extends Sx {
    private ResourceLocation j;
    private String J;
    public Vna A;
    private static final String I = "CL_00000935";

    public boolean X() {
        XW xW = this;
        XW a2 = xW.J();
        if (a2 != null && a2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean t() {
        XW xW = this;
        XW a2 = Kpa.J().J().J(xW.J().getId());
        if (a2 != null && a2.J() == Daa.SPECTATOR) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        XW a2 = this;
        a2.j = b2;
    }

    public ResourceLocation l() {
        XW xW = this;
        if (!Config.La()) {
            return null;
        }
        if (xW.j != null) {
            return xW.j;
        }
        XW a2 = xW.J();
        if (a2 == null) {
            return null;
        }
        return a2.f();
    }

    public Vna J() {
        XW a2;
        if (a2.A == null) {
            a2.A = Kpa.J().J().J(a2.J());
        }
        return a2.A;
    }

    public String A() {
        XW a2;
        return a2.J;
    }

    public boolean S() {
        XW a2;
        if (a2.J() != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static String J(String a2) {
        try {
            return URLEncoder.encode(a2, wsa.H);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return a2;
        }
    }

    public static ResourceLocation J(String a2) {
        return new ResourceLocation(new StringBuilder().insert(5 >> 3, xOa.q).append(Ez.J((String)a2)).append(KPa.C).toString());
    }

    public String l() {
        XW xW = this;
        XW a2 = xW.J();
        if (a2 == null) {
            return UIa.J((UUID)xW.J());
        }
        return a2.J();
    }

    public float j() {
        XW xW = this;
        float a2 = pqa.r;
        if (xW.h.J()) {
            a2 *= isa.W;
        }
        XW xW2 = xW;
        bA bA2 = xW2.J(Kha.j);
        a2 = (float)((double)a2 * ((bA2.f() / (double)xW.h.f() + oua.i) / KPa.y));
        if (xW2.h.f() == JPa.N || Float.isNaN(a2) || Float.isInfinite(a2)) {
            a2 = pqa.r;
        }
        if (xW.V() && xW.l().J() == Gea.cd) {
            float f2;
            float f3;
            float f4 = (float)xW.F() / eta.e;
            if (f3 > pqa.r) {
                f4 = pqa.r;
                f2 = a2;
            } else {
                float f5 = f4;
                f4 = f5 * f5;
                f2 = a2;
            }
            a2 = f2 * (pqa.r - f4 * VPa.i);
        }
        return a2;
    }

    public static kLa J(ResourceLocation resourceLocation, String string) {
        Object b2 = string;
        ResourceLocation a2 = resourceLocation;
        aJa aJa2 = Kpa.J().J();
        H h = aJa2.J(a2);
        if (h == null) {
            b2 = Ez.J((String)b2);
            Sw sw = Kpa.J().ha.J(MinecraftProfileTexture.Type.SKIN, (String)b2);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = XW.J((String)b2);
            h = new kLa(sw, String.format(UOa.Ga, objectArray), UIa.J((UUID)XW.J((String)b2)), (bd)new gla());
            aJa2.J(a2, h);
        }
        return (kLa)h;
    }

    public ResourceLocation f() {
        XW a2;
        return a2.j;
    }

    public ResourceLocation J() {
        XW xW = this;
        XW a2 = xW.J();
        if (a2 == null) {
            return UIa.J((UUID)xW.J());
        }
        return a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public XW(Gg gg2, GameProfile gameProfile) {
        void b2;
        GameProfile c2 = gameProfile;
        XW a2 = this;
        super((Gg)b2, c2);
        a2.j = null;
        a2.J = null;
        a2.J = c2.getName();
        if (a2.J != null && !a2.J.isEmpty()) {
            a2.J = Ez.J((String)a2.J);
        }
    }
}

