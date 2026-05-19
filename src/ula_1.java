/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  SLa
 *  XKa
 *  XTa
 *  hra
 *  vRa
 *  xla
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ula_1 {
    private final boolean E;
    private final List m;
    private int C;
    private final int i;
    private final int M;
    private final Set k;
    private final int j;
    private static final String J = "CL_00001054";
    private final int A;
    private int I;

    public List J() {
        Object object;
        ArrayList<KLa> a2;
        ula_1 ula_12 = this;
        xla xla2 = Lists.newArrayList();
        ArrayList<KLa> arrayList = a2 = ula_12.m.iterator();
        while (arrayList.hasNext()) {
            object = a2.next();
            ((xla)object).J(xla2);
            arrayList = a2;
        }
        a2 = Lists.newArrayList();
        object = xla2.iterator();
        Iterator iterator = object;
        while (iterator.hasNext()) {
            xla2 = (xla)object.next();
            XKa xKa2 = xla2.J();
            KLa kLa2 = xKa2.getAtlasSprite();
            iterator = object;
            KLa kLa3 = kLa2;
            ula_1 ula_13 = ula_12;
            kLa3.J(ula_13.I, ula_13.C, xla2.f(), xla2.J(), xKa2.isRotated());
            a2.add(kLa3);
        }
        return a2;
    }

    /*
     * Unable to fully structure code
     */
    private boolean f(XKa var1_1) {
        block12: {
            block11: {
                b = var1_1;
                a = this;
                var5_2 = Math.min(b.getWidth(), b.getHeight());
                v0 = var6_3 = a.I == 0 && a.C == 0 ? vRa.d : uSa.E;
                if (!a.E) break block11;
                v1 = a;
                var2_4 = Oz.C((int)v1.I);
                var3_5 = Oz.C((int)v1.C);
                var7_7 = Oz.C((int)(v1.I + var5_2));
                var8_8 = Oz.C((int)(v1.C + var5_2));
                var9_9 = var7_7 <= a.A ? vRa.d : uSa.E;
                v2 = var10_10 = var8_8 <= a.j ? vRa.d : uSa.E;
                if (var9_9 == 0 && var10_10 == 0) {
                    return (boolean)uSa.E;
                }
                var7_7 = var2_4 != var7_7 ? vRa.d : uSa.E;
                v3 = var8_8 = var3_5 != var8_8 ? vRa.d : uSa.E;
                var4_11 = (var7_7 ^ var8_8) != 0 ? (var7_7 == 0 ? vRa.d : uSa.E) : (var9_9 != 0 && var2_4 <= var3_5 ? vRa.d : uSa.E);
                break block12;
            }
            var2_4 = a.I + var5_2 <= a.A ? vRa.d : uSa.E;
            v4 = var3_5 = a.C + var5_2 <= a.j ? vRa.d : uSa.E;
            if (var2_4 == 0 && var3_5 == 0) {
                return (boolean)uSa.E;
            }
            if (var2_4 == 0) ** GOTO lbl-1000
            if (var6_3 != 0) ** GOTO lbl-1000
            v5 = a;
            if (v5.I <= v5.C) lbl-1000:
            // 2 sources

            {
                v6 = vRa.d;
            } else lbl-1000:
            // 2 sources

            {
                v6 = uSa.E;
            }
            var4_11 = v6;
        }
        var2_4 = Math.max(b.getWidth(), b.getHeight());
        v7 = a;
        if (var4_11 == 0) {
            v8 = v7.C;
            v9 = var2_4;
        } else {
            v8 = v7.I;
            v9 = var2_4;
        }
        v10 = a;
        if (Oz.C((int)(v8 + v9)) > (var4_11 == 0 ? v10.j : v10.A)) {
            return (boolean)uSa.E;
        }
        if (var4_11 != 0) {
            if (b.getWidth() > b.getHeight()) {
                b.rotate();
            }
            if (a.C == 0) {
                a.C = b.getHeight();
            }
            v11 = var3_6 = new xla(a.I, uSa.E, b.getWidth(), a.C);
            a.I += b.getWidth();
        } else {
            v12 = a;
            v11 = var3_6 = new xla(uSa.E, v12.C, v12.I, b.getHeight());
            a.C += b.getHeight();
        }
        v11.J((XKa)b);
        a.m.add(var3_6);
        return (boolean)vRa.d;
    }

    public void J() {
        int n2;
        ula_1 ula_12;
        ula_1 ula_13 = ula_12 = this;
        XKa[] xKaArray = ula_13.k.toArray(new XKa[ula_13.k.size()]);
        Arrays.sort(xKaArray);
        int n3 = xKaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            ula_1 a2 = xKaArray[n2];
            if (!ula_12.J((XKa)a2)) {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = a2.getAtlasSprite().J();
                objectArray[vRa.d] = a2.getAtlasSprite().J();
                objectArray[uqa.g] = a2.getAtlasSprite().f();
                objectArray[yRa.d] = ula_12.I;
                objectArray[AQa.P] = ula_12.C;
                objectArray[tTa.h] = ula_12.A;
                objectArray[uua.p] = ula_12.j;
                String string = String.format(xSa.C, objectArray);
                throw new SLa((XKa)a2, string);
            }
            n4 = ++n2;
        }
        if (ula_12.E) {
            ula_1 ula_14 = ula_12;
            ula_14.I = Oz.C((int)ula_14.I);
            ula_14.C = Oz.C((int)ula_14.C);
        }
    }

    public void J(KLa kLa2) {
        Object b2 = kLa2;
        ula_1 a2 = this;
        b2 = new XKa((KLa)b2, a2.M);
        if (a2.i > 0) {
            b2.setNewDimension(a2.i);
        }
        a2.k.add(b2);
    }

    public int f() {
        ula_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public ula_1(int n2, int n3, boolean bl, int n4, int n5) {
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        ula_1 a2;
        int n6 = n5;
        ula_1 ula_12 = a2 = this;
        ula_1 ula_13 = a2;
        ula_1 ula_14 = a2;
        ula_14.k = Sets.newHashSetWithExpectedSize(hra.Ja);
        ula_14.m = Lists.newArrayListWithCapacity(hra.Ja);
        ula_14.M = f2;
        ula_13.A = e2;
        ula_13.j = d2;
        ula_12.E = c2;
        ula_12.i = b2;
    }

    public int J() {
        ula_1 a2;
        return a2.C;
    }

    private static int f(int n2, int n3) {
        int b2;
        int a2;
        return (a2 >> b2) + (((a2 = n2) & (vRa.d << (b2 = n3)) - vRa.d) == 0 ? uSa.E : vRa.d) << b2;
    }

    public static /* synthetic */ int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return ula_1.f(a2, b2);
    }

    private boolean J(XKa xKa2) {
        int n2;
        ula_1 b2 = xKa2;
        ula_1 a2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.m.size()) {
            if (((xla)a2.m.get(n2)).J((XKa)b2)) {
                return vRa.d != 0;
            }
            b2.rotate();
            if (((xla)a2.m.get(n2)).J((XKa)b2)) {
                return vRa.d != 0;
            }
            b2.rotate();
            n3 = ++n2;
        }
        return a2.f((XKa)b2);
    }
}

