/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  ERa
 *  GDa
 *  Jy
 *  Nx
 *  Oz
 *  vRa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sV_1
extends RU {
    private int field_175801_g;
    private int field_175800_f;
    private static final List<AZ> field_175803_h;
    public static final List<Jy> field_175802_d;

    @Override
    public String J() {
        return kua.Ka;
    }

    public sV_1() {
        sV_1 a2;
        a2.field_175800_f = fPa.i;
        a2.field_175801_g = tTa.h;
    }

    public List<AZ> f() {
        return field_175803_h;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Nx J(int n2, int n3) {
        void b2;
        sV_1 a2;
        int c2 = n3;
        sV_1 sV_12 = a2 = this;
        return new ix(sV_12.worldObj, sV_12.rand, (int)b2, c2);
    }

    static {
        Jy[] jyArray = new Jy[tTa.h];
        jyArray[uSa.E] = Jy.Ba;
        jyArray[vRa.d] = Jy.L;
        jyArray[uqa.g] = Jy.n;
        jyArray[yRa.d] = Jy.N;
        jyArray[AQa.P] = Jy.b;
        field_175802_d = Arrays.asList(jyArray);
        field_175803_h = Lists.newArrayList();
        field_175803_h.add(new AZ(GDa.class, vRa.d, uqa.g, AQa.P));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        sV_1 a2 = this;
        void var5_5 = b2;
        int n4 = c2;
        if (b2 < 0) {
            b2 -= a2.field_175800_f - vRa.d;
        }
        if (c2 < 0) {
            c2 -= a2.field_175800_f - vRa.d;
        }
        Random random = a2.worldObj.J((int)(b2 /= a2.field_175800_f), c2 /= a2.field_175800_f, Fsa.la);
        b2 *= a2.field_175800_f;
        c2 *= a2.field_175800_f;
        sV_1 sV_12 = a2;
        sV_1 sV_13 = a2;
        sV_1 sV_14 = a2;
        sV_1 sV_15 = a2;
        if (var5_5 == (b2 += (random.nextInt(sV_12.field_175800_f - sV_12.field_175801_g) + random.nextInt(sV_13.field_175800_f - sV_13.field_175801_g)) / uqa.g) && n4 == (c2 += (random.nextInt(sV_14.field_175800_f - sV_14.field_175801_g) + random.nextInt(sV_15.field_175800_f - sV_15.field_175801_g)) / uqa.g)) {
            if (a2.worldObj.J().J(new XF((int)(var5_5 * ERa.C + Yqa.i), ysa.s, n4 * ERa.C + Yqa.i), (Jy)null) != Jy.L) {
                return uSa.E != 0;
            }
            if (a2.worldObj.J().J((int)(var5_5 * ERa.C + Yqa.i), n4 * ERa.C + Yqa.i, ITa.A, field_175802_d)) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public sV_1(Map<String, String> map) {
        Iterator a2;
        sV_1 sV_12 = this;
        sV_12();
        for (Map.Entry b2 : a2.entrySet()) {
            if (((String)b2.getKey()).equals(PRa.k)) {
                sV_12.field_175800_f = Oz.J((String)((String)b2.getValue()), (int)sV_12.field_175800_f, (int)vRa.d);
                continue;
            }
            if (!((String)b2.getKey()).equals(ITa.l)) continue;
            sV_12.field_175801_g = Oz.J((String)((String)b2.getValue()), (int)sV_12.field_175801_g, (int)vRa.d);
        }
    }
}

