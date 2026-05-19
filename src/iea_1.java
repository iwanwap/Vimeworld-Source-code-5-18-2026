/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  ERa
 *  JPa
 *  NTa
 *  Pb
 *  XTa
 *  Ypa
 *  bSa
 *  cRa
 *  iea
 *  lqa
 *  pPa
 *  pY
 *  vRa
 *  zsa
 */
import net.minecraft.block.material.MapColor;

public final class iea_1
extends Enum<iea>
implements Pb {
    public static final /* enum */ iea PINK;
    private final String name;
    private static final iea[] DYE_DMG_LOOKUP;
    private final String unlocalizedName;
    public static final /* enum */ iea ORANGE;
    private final MapColor mapColor;
    public static final /* enum */ iea LIGHT_BLUE;
    public static final /* enum */ iea PURPLE;
    public static final /* enum */ iea BLUE;
    private final pY chatColor;
    public static final /* enum */ iea SILVER;
    public static final /* enum */ iea GRAY;
    public static final /* enum */ iea YELLOW;
    public static final /* enum */ iea WHITE;
    private final int dyeDamage;
    public static final /* enum */ iea CYAN;
    public static final /* enum */ iea LIME;
    private static final iea[] META_LOOKUP;
    private static final /* synthetic */ iea[] $VALUES;
    public static final /* enum */ iea BLACK;
    public static final /* enum */ iea BROWN;
    public static final /* enum */ iea RED;
    private final int meta;
    public static final /* enum */ iea GREEN;
    public static final /* enum */ iea MAGENTA;

    /*
     * WARNING - void declaration
     */
    private iea_1(int n3, int n4, String string2, String string3, MapColor mapColor, pY pY2) {
        iea_1 g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        iea_1 a2;
        iea_1 iea_12 = iea_13;
        iea_1 iea_13 = pY2;
        iea_1 iea_14 = a2 = iea_12;
        iea_1 iea_15 = a2;
        iea_1 iea_16 = a2;
        iea_16.meta = f2;
        iea_16.dyeDamage = e2;
        iea_15.name = d2;
        iea_15.unlocalizedName = c2;
        iea_14.mapColor = b2;
        iea_14.chatColor = g2;
    }

    public static iea[] values() {
        return (iea[])$VALUES.clone();
    }

    public String toString() {
        iea_1 a2;
        return a2.unlocalizedName;
    }

    public int getDyeDamage() {
        iea_1 a2;
        return a2.dyeDamage;
    }

    public int getMetadata() {
        iea_1 a2;
        return a2.meta;
    }

    static {
        int n2;
        WHITE = new iea_1(uSa.E, Ypa.A, gQa.r, gQa.r, MapColor.snowColor, pY.WHITE);
        ORANGE = new iea_1(vRa.d, hpa.Z, Cta.W, Cta.W, MapColor.adobeColor, pY.GOLD);
        MAGENTA = new iea_1(uqa.g, uua.s, mSa.N, mSa.N, MapColor.magentaColor, pY.AQUA);
        LIGHT_BLUE = new iea_1(yRa.d, lqa.s, Ira.r, rpa.f, MapColor.lightBlueColor, pY.BLUE);
        YELLOW = new iea_1(AQa.P, pPa.f, QTa.v, QTa.v, MapColor.yellowColor, pY.YELLOW);
        LIME = new iea_1(tTa.h, NTa.C, xua.e, xua.e, MapColor.limeColor, pY.GREEN);
        PINK = new iea_1(uua.p, WOa.fa, bSa.q, bSa.q, MapColor.pinkColor, pY.LIGHT_PURPLE);
        GRAY = new iea_1(XTa.W, Yqa.i, zsa.ba, zsa.ba, MapColor.grayColor, pY.DARK_GRAY);
        SILVER = new iea_1(Yqa.i, XTa.W, opa.Aa, opa.Aa, MapColor.silverColor, pY.GRAY);
        CYAN = new iea_1(WOa.fa, uua.p, cRa.v, cRa.v, MapColor.cyanColor, pY.DARK_AQUA);
        PURPLE = new iea_1(NTa.C, tTa.h, yRa.J, yRa.J, MapColor.purpleColor, pY.DARK_PURPLE);
        BLUE = new iea_1(pPa.f, AQa.P, rQa.a, rQa.a, MapColor.blueColor, pY.DARK_BLUE);
        BROWN = new iea_1(lqa.s, yRa.d, JPa.y, JPa.y, MapColor.brownColor, pY.GOLD);
        GREEN = new iea_1(uua.s, uqa.g, NSa.A, NSa.A, MapColor.greenColor, pY.DARK_GREEN);
        RED = new iea_1(hpa.Z, vRa.d, rQa.Y, rQa.Y, MapColor.redColor, pY.DARK_RED);
        BLACK = new iea_1(Ypa.A, uSa.E, GPa.i, GPa.i, MapColor.blackColor, pY.BLACK);
        iea_1[] iea_1Array = new iea_1[ERa.C];
        iea_1Array[uSa.E] = WHITE;
        iea_1Array[vRa.d] = ORANGE;
        iea_1Array[uqa.g] = MAGENTA;
        iea_1Array[yRa.d] = LIGHT_BLUE;
        iea_1Array[AQa.P] = YELLOW;
        iea_1Array[tTa.h] = LIME;
        iea_1Array[uua.p] = PINK;
        iea_1Array[XTa.W] = GRAY;
        iea_1Array[Yqa.i] = SILVER;
        iea_1Array[WOa.fa] = CYAN;
        iea_1Array[NTa.C] = PURPLE;
        iea_1Array[pPa.f] = BLUE;
        iea_1Array[lqa.s] = BROWN;
        iea_1Array[uua.s] = GREEN;
        iea_1Array[hpa.Z] = RED;
        iea_1Array[Ypa.A] = BLACK;
        $VALUES = iea_1Array;
        META_LOOKUP = new iea_1[iea_1.values().length];
        DYE_DMG_LOOKUP = new iea_1[iea_1.values().length];
        iea[] ieaArray = iea_1.values();
        int n3 = ieaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            iea iea2;
            iea_1.META_LOOKUP[iea2.getMetadata()] = iea2 = ieaArray[n2];
            iea_1.DYE_DMG_LOOKUP[iea2.getDyeDamage()] = iea2;
            n4 = ++n2;
        }
    }

    public String getName() {
        iea_1 a2;
        return a2.name;
    }

    public static iea byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String getUnlocalizedName() {
        iea_1 a2;
        return a2.unlocalizedName;
    }

    public static iea byDyeDamage(int a2) {
        if (a2 < 0 || a2 >= DYE_DMG_LOOKUP.length) {
            a2 = uSa.E;
        }
        return DYE_DMG_LOOKUP[a2];
    }

    public static iea valueOf(String a2) {
        return Enum.valueOf(iea_1.class, a2);
    }

    public MapColor getMapColor() {
        iea_1 a2;
        return a2.mapColor;
    }
}

