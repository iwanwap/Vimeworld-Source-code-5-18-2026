/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ppa
 *  Pqa
 *  WQa
 *  XKa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xla_3 {
    private XKa i;
    private List M;
    private final int k;
    private final int j;
    private final int J;
    private static final String A = "CL_00001056";
    private final int I;

    public XKa J() {
        xla_3 a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public void J(List list) {
        void a2;
        xla_3 xla_32 = this;
        if (xla_32.i != null) {
            a2.add(xla_32);
            return;
        }
        if (xla_32.M != null) {
            Object b2;
            Object object = b2 = xla_32.M.iterator();
            while (object.hasNext()) {
                ((xla_3)b2.next()).J((List)a2);
                object = b2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public xla_3(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        xla_3 a2;
        int n6 = n5;
        xla_3 xla_32 = a2 = this;
        xla_3 xla_33 = a2;
        xla_33.J = d2;
        xla_33.j = c2;
        xla_32.k = b2;
        xla_32.I = e2;
    }

    public String toString() {
        xla_3 a2;
        return new StringBuilder().insert(3 >> 2, MRa.t).append(a2.J).append(WQa.l).append(a2.j).append(Pqa.m).append(a2.k).append(KQa.S).append(a2.I).append(ITa.Y).append(a2.i).append(Ppa.E).append(a2.M).append((char)ySa.Z).toString();
    }

    public int f() {
        xla_3 a2;
        return a2.J;
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(XKa var1_3) {
        block8: {
            block9: {
                var4_4 = this;
                if (var4_4.i != null) {
                    return (boolean)uSa.E;
                }
                v0 = a;
                var2_5 = v0.getWidth();
                var3_6 = v0.getHeight();
                if (var2_5 > var4_4.k || var3_6 > var4_4.I) break block8;
                if (var2_5 == var4_4.k && var3_6 == var4_4.I) {
                    var4_4.i = a;
                    return (boolean)vRa.d;
                }
                if (var4_4.M != null) ** GOTO lbl46
                var4_4.M = Lists.newArrayListWithCapacity(vRa.d);
                v1 = var4_4;
                var4_4.M.add(new xla_3(v1.J, v1.j, var2_5, var3_6));
                v2 = var4_4;
                b = v2.k - var2_5;
                var5_7 = v2.I - var3_6;
                if (var5_7 <= 0 || b <= 0) break block9;
                v3 = var4_4;
                var6_9 = Math.max(v3.I, b);
                if (var6_9 >= (var7_10 = Math.max(v3.k, var5_7))) {
                    v4 = var4_4;
                    var4_4.M.add(new xla_3(v4.J, v4.j + var3_6, var2_5, var5_7));
                    var4_4.M.add(new xla_3(var4_4.J + var2_5, var4_4.j, b, var4_4.I));
                } else {
                    var4_4.M.add(new xla_3(var4_4.J + var2_5, var4_4.j, b, var3_6));
                    v5 = var4_4;
                    var4_4.M.add(new xla_3(v5.J, v5.j + var3_6, var4_4.k, var5_7));
                }
                ** GOTO lbl46
            }
            if (b == 0) {
                v6 = var4_4;
                v7 = v6;
                v8 = var4_4;
                v6.M.add(new xla_3(v8.J, v8.j + var3_6, var2_5, var5_7));
            } else {
                if (var5_7 == 0) {
                    var4_4.M.add(new xla_3(var4_4.J + var2_5, var4_4.j, b, var3_6));
                }
lbl46:
                // 6 sources

                v7 = var4_4;
            }
            for (E var5_8 : v7.M) {
                if (!((xla_3)var5_8).J((XKa)a)) continue;
                return (boolean)vRa.d;
            }
            return (boolean)uSa.E;
        }
        return (boolean)uSa.E;
    }

    public int J() {
        xla_3 a2;
        return a2.j;
    }
}

