/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Jy
 *  Lra
 *  Nx
 *  Oz
 *  iv
 *  jpa
 *  vRa
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xW_1
extends RU {
    private int field_82666_h;
    private int field_82665_g;
    public static final List<Jy> villageSpawnBiomes;
    private int terrainType;

    @Override
    public String J() {
        return jpa.D;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        xW_1 a2 = this;
        void var3_5 = b2;
        int n4 = c2;
        if (b2 < 0) {
            b2 -= a2.field_82665_g - vRa.d;
        }
        if (c2 < 0) {
            c2 -= a2.field_82665_g - vRa.d;
        }
        Random random = a2.worldObj.J((int)(b2 /= a2.field_82665_g), c2 /= a2.field_82665_g, Lra.b);
        b2 *= a2.field_82665_g;
        c2 *= a2.field_82665_g;
        xW_1 xW_12 = a2;
        xW_1 xW_13 = a2;
        if (var3_5 == (b2 += random.nextInt(xW_12.field_82665_g - xW_12.field_82666_h)) && n4 == (c2 += random.nextInt(xW_13.field_82665_g - xW_13.field_82666_h)) && a2.worldObj.J().J((int)(var3_5 * ERa.C + Yqa.i), n4 * ERa.C + Yqa.i, uSa.E, villageSpawnBiomes)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public xW_1(Map<String, String> map) {
        Iterator a2;
        xW_1 xW_12 = this;
        xW_12();
        for (Map.Entry b2 : a2.entrySet()) {
            if (((String)b2.getKey()).equals(sqa.b)) {
                xW_12.terrainType = Oz.J((String)((String)b2.getValue()), (int)xW_12.terrainType, (int)uSa.E);
                continue;
            }
            if (!((String)b2.getKey()).equals(tua.v)) continue;
            xW_1 xW_13 = xW_12;
            xW_12.field_82665_g = Oz.J((String)((String)b2.getValue()), (int)xW_13.field_82665_g, (int)(xW_13.field_82666_h + vRa.d));
        }
    }

    public xW_1() {
        xW_1 a2;
        a2.field_82665_g = fPa.i;
        a2.field_82666_h = Yqa.i;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Nx J(int n2, int n3) {
        void b2;
        xW_1 a2;
        int c2 = n3;
        xW_1 xW_12 = a2 = this;
        return new iv(xW_12.worldObj, xW_12.rand, (int)b2, c2, a2.terrainType);
    }

    static {
        Jy[] jyArray = new Jy[yRa.d];
        jyArray[uSa.E] = Jy.Z;
        jyArray[vRa.d] = Jy.ea;
        jyArray[uqa.g] = Jy.r;
        villageSpawnBiomes = Arrays.asList(jyArray);
    }
}

