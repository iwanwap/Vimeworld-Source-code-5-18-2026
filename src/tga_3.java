/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class tga_3
implements Predicate<vL> {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean I;

    public tga_3(String string, boolean bl) {
        boolean a2 = bl;
        tga_3 tga_32 = this;
        tga_32.A = string;
        tga_32.I = a2;
    }

    public boolean J(vL vL2) {
        String string;
        tga_3 b2 = vL2;
        tga_3 a2 = this;
        if (!(b2 instanceof Gl)) {
            return uSa.E != 0;
        }
        String string2 = string = (b2 = ((Gl)b2).J()) == null ? Mqa.y : b2.J();
        if (string.equals(a2.A) != a2.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

