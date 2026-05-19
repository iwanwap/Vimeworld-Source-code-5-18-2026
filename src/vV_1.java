/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 *  zU
 */
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class vV_1
implements Consumer {
    private final zU g;
    private final String L;
    private final double E;
    private final Map m;
    private final int C;
    private final double i;
    private final List M;
    private final double k;
    private final GameProfile j;
    private final MiniDotItem J;
    private final String[] A;
    private final float I;

    public void accept(Object object) {
        vV_1 a2;
        Object b2 = object;
        vV_1 vV_12 = a2 = this;
        vV_1 vV_13 = a2;
        vV_1 vV_14 = a2;
        vV_1 vV_15 = a2;
        zU.J((zU)vV_12.g, (List)vV_12.M, (String[])vV_13.A, (MiniDotItem)vV_13.J, (String)vV_14.L, (GameProfile)vV_14.j, (double)a2.k, (double)a2.i, (double)a2.E, (float)vV_15.I, (Map)vV_15.m, (int)a2.C, (YQ)((YQ)b2));
    }

    /*
     * WARNING - void declaration
     */
    private vV_1(zU zU2, List list, String[] stringArray, MiniDotItem miniDotItem, String string, GameProfile gameProfile, double d2, double d3, double d4, float f2, Map map, int n2) {
        void m2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        void g2;
        void h2;
        void i2;
        void j2;
        void k2;
        void l2;
        vV_1 a2;
        int n3 = n2;
        vV_1 vV_12 = a2 = this;
        vV_1 vV_13 = a2;
        vV_1 vV_14 = a2;
        vV_1 vV_15 = a2;
        vV_1 vV_16 = a2;
        vV_1 vV_17 = a2;
        vV_17.g = l2;
        vV_17.M = k2;
        vV_16.A = j2;
        vV_16.J = i2;
        vV_15.L = h2;
        vV_15.j = g2;
        vV_14.k = f3;
        vV_14.i = e2;
        vV_13.E = d5;
        vV_13.I = c2;
        vV_12.m = b2;
        vV_12.C = m2;
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(zU zU2, List list, String[] stringArray, MiniDotItem miniDotItem, String string, GameProfile gameProfile, double d2, double d3, double d4, float f2, Map map, int n2) {
        void l2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        void g2;
        void h2;
        void i2;
        void j2;
        void k2;
        int n3 = n2;
        zU a2 = zU2;
        return new vV_1(a2, (List)k2, (String[])j2, (MiniDotItem)i2, (String)h2, (GameProfile)g2, (double)f3, (double)e2, (double)d5, (float)c2, (Map)b2, (int)l2);
    }
}

