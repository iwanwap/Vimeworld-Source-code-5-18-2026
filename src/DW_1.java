/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  RV
 *  TPa
 *  WSa
 *  aw
 *  jRa
 *  pqa
 *  q
 *  qx
 *  uKa
 *  vRa
 *  xJa
 */
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;

public final class DW_1 {
    private static final Cache<qx, aw> j;
    private static final qx J;
    public static boolean A;
    public static boolean I;

    public DW_1() {
        DW_1 a2;
    }

    public static void J() {
        j.invalidateAll();
    }

    /*
     * WARNING - void declaration
     */
    public static int J(String string, float f2, float f3, int n2, boolean bl, q q2, Object object) {
        int n3;
        void a2;
        void c2;
        void d2;
        void e22;
        void f4;
        void b2;
        String string2 = string;
        if (A || !DW_1.J(string2)) {
            return b2.J(string2, (float)f4, (float)e22, (int)d2, (boolean)c2);
        }
        String g2 = j.getIfPresent(J.J((Object)a2, (int)d2, (boolean)c2, string2));
        if (g2 == null) {
            I = uSa.E;
            n3 = b2.J(string2, (float)f4, (float)e22, (int)d2, (boolean)c2);
            if (I) {
                I = uSa.E;
                return n3;
            }
        }
        uKa.K();
        uKa.H();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.e();
        uKa.J((float)f4, (float)e22, (float)JPa.N);
        if (g2 == null) {
            uKa.C((int)uSa.E);
            n3 = xJa.J((int)vRa.d);
            GL11.glNewList(n3, Wqa.O);
            int e22 = b2.J(string2, JPa.N, JPa.N, (int)d2, (boolean)c2);
            GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
            GL11.glEndList();
            g2 = new aw(n3, e22, null);
            aw.J((aw)g2, (int)uKa.f());
            uKa.f();
            j.put(new qx((Object)a2, (int)d2, (boolean)c2, string2), (aw)g2);
        } else {
            String string3 = g2;
            uKa.l((int)aw.f((aw)string3));
            uKa.k((int)aw.l((aw)string3));
        }
        uKa.D();
        return (int)f4 + aw.J((aw)g2);
    }

    public static /* synthetic */ void J(RemovalNotification a2) {
        GL11.glDeleteLists(aw.f((aw)((aw)a2.getValue())), vRa.d);
    }

    static {
        A = Boolean.getBoolean(WPa.C);
        I = uSa.E;
        LogManager.getLogger(Xpa.S).info(new StringBuilder().insert(3 & 4, tua.la).append((!A ? vRa.d : uSa.E) != 0).toString());
        j = CacheBuilder.newBuilder().expireAfterAccess(kra.G, TimeUnit.SECONDS).removalListener(RV.J()).build();
        J = new qx(null, uSa.E, uSa.E != 0, null);
    }

    private static boolean J(String string) {
        int n2;
        String string2 = string;
        int n3 = string2.length();
        if (n3 <= uqa.g) {
            return uSa.E != 0;
        }
        int n4 = n2 = uSa.E;
        while (n4 < n3 - vRa.d) {
            if (string2.charAt(n2) == TPa.Aa) {
                int n5;
                char a2 = string2.charAt(n2 + vRa.d);
                int n6 = n5 = a2 >= Hta.k && a2 <= jRa.v || a2 == Jra.o || a2 == rSa.i || a2 == Iqa.M || a2 == fPa.z || a2 == WSa.o ? vRa.d : uSa.E;
                if (n5 == 0) {
                    return uSa.E != 0;
                }
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }
}

