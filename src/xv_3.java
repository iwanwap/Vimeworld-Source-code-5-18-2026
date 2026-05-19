/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  BV
 *  ERa
 *  GW
 *  Jy
 *  Nx
 *  Oz
 *  ZRa
 *  nFa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xv_3
extends RU {
    private int minDistanceBetweenScatteredFeatures;
    private int maxDistanceBetweenScatteredFeatures;
    private static final List<Jy> biomelist;
    private List<AZ> scatteredFeatureSpawnList;

    /*
     * WARNING - void declaration
     */
    @Override
    public Nx J(int n2, int n3) {
        void b2;
        xv_3 a2;
        int c2 = n3;
        xv_3 xv_32 = a2 = this;
        return new GW(xv_32.worldObj, xv_32.rand, (int)b2, c2);
    }

    public List<AZ> f() {
        xv_3 a2;
        return a2.scatteredFeatureSpawnList;
    }

    static {
        Jy[] jyArray = new Jy[tTa.h];
        jyArray[uSa.E] = Jy.ea;
        jyArray[vRa.d] = Jy.Ga;
        jyArray[uqa.g] = Jy.Fa;
        jyArray[yRa.d] = Jy.y;
        jyArray[AQa.P] = Jy.g;
        biomelist = Arrays.asList(jyArray);
    }

    public boolean f(XF xF2) {
        Object b2 = xF2;
        xv_3 a2 = this;
        if ((b2 = a2.J((XF)((Object)b2))) != null && b2 instanceof GW && !((Nx)b2).components.isEmpty()) {
            return (uU)((Nx)b2).components.getFirst() instanceof BV;
        }
        return uSa.E != 0;
    }

    public xv_3(Map<String, String> map) {
        Map<String, String> b2 = map;
        xv_3 a2 = this;
        a2();
        for (Map.Entry entry : b2.entrySet()) {
            if (!((String)entry.getKey()).equals(tua.v)) continue;
            xv_3 xv_32 = a2;
            a2.maxDistanceBetweenScatteredFeatures = Oz.J((String)((String)entry.getValue()), (int)xv_32.maxDistanceBetweenScatteredFeatures, (int)(xv_32.minDistanceBetweenScatteredFeatures + vRa.d));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3) {
        void b22;
        int c2 = n3;
        xv_3 a2 = this;
        void var3_7 = b22;
        int n4 = c2;
        if (b22 < 0) {
            b22 -= a2.maxDistanceBetweenScatteredFeatures - vRa.d;
        }
        if (c2 < 0) {
            c2 -= a2.maxDistanceBetweenScatteredFeatures - vRa.d;
        }
        Random random = a2.worldObj.J((int)(b22 /= a2.maxDistanceBetweenScatteredFeatures), c2 /= a2.maxDistanceBetweenScatteredFeatures, wsa.d);
        b22 *= a2.maxDistanceBetweenScatteredFeatures;
        c2 *= a2.maxDistanceBetweenScatteredFeatures;
        xv_3 xv_32 = a2;
        xv_3 xv_33 = a2;
        if (var3_7 == (b22 += random.nextInt(xv_32.maxDistanceBetweenScatteredFeatures - xv_32.minDistanceBetweenScatteredFeatures)) && n4 == (c2 += random.nextInt(xv_33.maxDistanceBetweenScatteredFeatures - xv_33.minDistanceBetweenScatteredFeatures))) {
            Jy b22 = a2.worldObj.J().J(new XF((int)(var3_7 * ERa.C + Yqa.i), uSa.E, n4 * ERa.C + Yqa.i));
            if (b22 == null) {
                return uSa.E != 0;
            }
            for (Jy jy2 : biomelist) {
                if (b22 != jy2) continue;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    @Override
    public String J() {
        return ZRa.V;
    }

    public xv_3() {
        xv_3 a2;
        xv_3 xv_32 = a2;
        xv_32.scatteredFeatureSpawnList = Lists.newArrayList();
        xv_32.maxDistanceBetweenScatteredFeatures = fPa.i;
        xv_32.minDistanceBetweenScatteredFeatures = Yqa.i;
        xv_32.scatteredFeatureSpawnList.add(new AZ(nFa.class, vRa.d, vRa.d, vRa.d));
    }
}

