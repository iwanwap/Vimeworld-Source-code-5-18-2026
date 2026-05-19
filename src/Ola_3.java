/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  ISa
 *  Kna
 *  NOa
 *  NTa
 *  XTa
 *  psa
 *  uY
 *  vPa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Ola_3<T extends uY> {
    public static final ResourceLocation[] A;
    public RKa I;

    /*
     * WARNING - void declaration
     */
    public void J(ResourceLocation resourceLocation) {
        Ola_3 ola_3 = this;
        Ola_3 b2 = ola_3.I.m;
        if (b2 != null) {
            void a2;
            b2.J((ResourceLocation)a2);
        }
    }

    public Gg J() {
        Ola_3 a2;
        return a2.I.L;
    }

    public void J(RKa rKa2) {
        RKa b2 = rKa2;
        Ola_3 a2 = this;
        a2.I = b2;
    }

    static {
        ResourceLocation[] resourceLocationArray = new ResourceLocation[NTa.C];
        resourceLocationArray[uSa.E] = new ResourceLocation(Mqa.Y);
        resourceLocationArray[vRa.d] = new ResourceLocation(NOa.S);
        resourceLocationArray[uqa.g] = new ResourceLocation(vPa.c);
        resourceLocationArray[yRa.d] = new ResourceLocation(ERa.Ia);
        resourceLocationArray[AQa.P] = new ResourceLocation(ISa.la);
        resourceLocationArray[tTa.h] = new ResourceLocation(Jta.n);
        resourceLocationArray[uua.p] = new ResourceLocation(ZSa.I);
        resourceLocationArray[XTa.W] = new ResourceLocation(tSa.y);
        resourceLocationArray[Yqa.i] = new ResourceLocation(psa.d);
        resourceLocationArray[WOa.fa] = new ResourceLocation(ISa.c);
        A = resourceLocationArray;
    }

    public Kna J() {
        Ola_3 a2;
        return a2.I.J();
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public Ola_3() {
        Ola_3 a2;
    }

    public abstract void J(T var1, double var2, double var4, double var6, float var8, int var9);
}

