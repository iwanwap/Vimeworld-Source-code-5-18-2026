/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  MEa
 *  NTa
 *  Nx
 *  ega
 *  lEa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yU
extends RU {
    private List<AZ> spawnList;

    public List<AZ> f() {
        yU a2;
        return a2.spawnList;
    }

    @Override
    public String J() {
        return eta.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Nx J(int n2, int n3) {
        void b2;
        yU a2;
        int c2 = n3;
        yU yU2 = a2 = this;
        return new ZU(yU2.worldObj, yU2.rand, (int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3) {
        void a2;
        void b2;
        yU yU2 = this;
        void var3_5 = b2 >> AQa.P;
        void c2 = a2 >> AQa.P;
        yU yU3 = yU2;
        yU3.rand.setSeed((long)(var3_5 ^ c2 << AQa.P) ^ yU2.worldObj.J());
        yU3.rand.nextInt();
        if (yU3.rand.nextInt(yRa.d) != 0) {
            return uSa.E != 0;
        }
        if (b2 != (var3_5 << AQa.P) + AQa.P + yU2.rand.nextInt(Yqa.i)) {
            return uSa.E != 0;
        }
        if (a2 == (c2 << AQa.P) + AQa.P + yU2.rand.nextInt(Yqa.i)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public yU() {
        yU a2;
        yU yU2 = a2;
        yU2.spawnList = Lists.newArrayList();
        yU2.spawnList.add(new AZ(Zfa.class, NTa.C, uqa.g, yRa.d));
        a2.spawnList.add(new AZ(MEa.class, tTa.h, AQa.P, AQa.P));
        a2.spawnList.add(new AZ(lEa.class, NTa.C, AQa.P, AQa.P));
        a2.spawnList.add(new AZ(ega.class, yRa.d, AQa.P, AQa.P));
    }
}

