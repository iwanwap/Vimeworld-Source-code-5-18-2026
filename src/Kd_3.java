/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Kd
 *  NTa
 *  XTa
 *  cQa
 *  fsa
 *  hqa
 *  kpa
 *  lqa
 *  pPa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class Kd_3
extends Enum<Kd> {
    public static final /* enum */ Kd XXS_X2;
    public static final /* enum */ Kd XS_X2;
    public static final /* enum */ Kd S_X2;
    public static final /* enum */ Kd L;
    public static final /* enum */ Kd S;
    public static final /* enum */ Kd XS;
    public static final /* enum */ Kd XL;
    private final ResourceLocation border;
    private final ResourceLocation fillNoBorder;
    private final int borderWidth;
    private static final /* synthetic */ Kd[] $VALUES;
    private final ResourceLocation fill;
    public static final /* enum */ Kd L_X2;
    private final int size;
    public static final /* enum */ Kd XL_X2;
    public static final /* enum */ Kd XXL_X2;
    public static final /* enum */ Kd XXS;
    public static final /* enum */ Kd XXL;

    public ResourceLocation getFill() {
        Kd_3 a2;
        return a2.fill;
    }

    public int getBorderWidth() {
        Kd_3 a2;
        return a2.borderWidth;
    }

    public ResourceLocation getFillNoBorder() {
        Kd_3 a2;
        return a2.fillNoBorder;
    }

    public int getSize() {
        Kd_3 a2;
        return a2.size;
    }

    static {
        XXS = new Kd_3(yRa.d, vRa.d);
        XS = new Kd_3(AQa.P, vRa.d);
        S = new Kd_3(tTa.h, vRa.d);
        L = new Kd_3(tTa.h, vRa.d);
        XL = new Kd_3(XTa.W, vRa.d);
        XXL = new Kd_3(pPa.f, vRa.d);
        XXS_X2 = new Kd_3(uua.p, uqa.g);
        XS_X2 = new Kd_3(Yqa.i, uqa.g);
        S_X2 = new Kd_3(NTa.C, uqa.g);
        L_X2 = new Kd_3(NTa.C, uqa.g);
        XL_X2 = new Kd_3(hpa.Z, uqa.g);
        XXL_X2 = new Kd_3(cQa.o, uqa.g);
        Kd_3[] kd_3Array = new Kd_3[lqa.s];
        kd_3Array[uSa.E] = XXS;
        kd_3Array[vRa.d] = XS;
        kd_3Array[uqa.g] = S;
        kd_3Array[yRa.d] = L;
        kd_3Array[AQa.P] = XL;
        kd_3Array[tTa.h] = XXL;
        kd_3Array[uua.p] = XXS_X2;
        kd_3Array[XTa.W] = XS_X2;
        kd_3Array[Yqa.i] = S_X2;
        kd_3Array[WOa.fa] = L_X2;
        kd_3Array[NTa.C] = XL_X2;
        kd_3Array[pPa.f] = XXL_X2;
        $VALUES = kd_3Array;
    }

    public ResourceLocation getBorder() {
        Kd_3 a2;
        return a2.border;
    }

    public static Kd valueOf(String a2) {
        return Enum.valueOf(Kd_3.class, a2);
    }

    public static Kd[] values() {
        return (Kd[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private Kd_3(int n3, int n4) {
        void c2;
        void b2;
        int n5 = n4;
        Kd_3 a2 = this;
        Kd_3 kd_3 = a2;
        kd_3.border = new ResourceLocation(Cra.V, new StringBuilder().insert(3 ^ 3, kpa.Z).append((a2.name().endsWith(fsa.m) ? a2.ordinal() - uua.p : a2.ordinal()) + vRa.d).append(KPa.C).toString());
        a2.fill = new ResourceLocation(Cra.V, new StringBuilder().insert(3 >> 2, hqa.ca).append((a2.name().endsWith(fsa.m) ? a2.ordinal() - uua.p : a2.ordinal()) + vRa.d).append(KPa.C).toString());
        Kd_3 kd_32 = a2;
        a2.fillNoBorder = new ResourceLocation(Cra.V, new StringBuilder().insert(3 ^ 3, Jta.c).append((a2.name().endsWith(fsa.m) ? kd_32.ordinal() - uua.p : kd_32.ordinal()) + vRa.d).append(KPa.C).toString());
        Kd_3 kd_33 = a2;
        kd_33.size = b2;
        kd_33.borderWidth = c2;
    }
}

