/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qta
 *  vRa
 */
import java.util.UUID;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UIa_3 {
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    private static boolean J(UUID a2) {
        if ((a2.hashCode() & vRa.d) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ResourceLocation J(UUID a2) {
        if (UIa_3.J(a2)) {
            return A;
        }
        return I;
    }

    public UIa_3() {
        UIa_3 a2;
    }

    static {
        I = new ResourceLocation(lQa.N);
        A = new ResourceLocation(Jta.k);
    }

    public static ResourceLocation J() {
        return I;
    }

    public static String J(UUID a2) {
        if (UIa_3.J(a2)) {
            return qta.K;
        }
        return BQa.la;
    }
}

