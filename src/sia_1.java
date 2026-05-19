/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aea
 *  NTa
 *  Oba
 *  VEa
 *  XTa
 *  eAa
 *  pPa
 *  sia
 *  vRa
 *  xea
 */
public final class sia_1
extends Enum<sia> {
    public static final /* enum */ sia WEAPON;
    public static final /* enum */ sia ALL;
    public static final /* enum */ sia ARMOR_LEGS;
    public static final /* enum */ sia FISHING_ROD;
    private static final /* synthetic */ sia[] $VALUES;
    public static final /* enum */ sia ARMOR_FEET;
    public static final /* enum */ sia DIGGER;
    public static final /* enum */ sia BREAKABLE;
    public static final /* enum */ sia BOW;
    public static final /* enum */ sia ARMOR;
    public static final /* enum */ sia ARMOR_HEAD;
    public static final /* enum */ sia ARMOR_TORSO;

    public static sia valueOf(String a2) {
        return Enum.valueOf(sia_1.class, a2);
    }

    private sia_1() {
        int a2 = n2;
        sia_1 sia_12 = this;
    }

    public boolean canEnchantItem(eAa eAa2) {
        sia_1 b2 = eAa2;
        sia_1 a2 = this;
        if (a2 == ALL) {
            return vRa.d != 0;
        }
        if (a2 == BREAKABLE && b2.C()) {
            return vRa.d != 0;
        }
        if (b2 instanceof VEa) {
            if (a2 == ARMOR) {
                return vRa.d != 0;
            }
            VEa vEa2 = (VEa)b2;
            if (vEa2.j == 0) {
                if (a2 == ARMOR_HEAD) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            if (vEa2.j == uqa.g) {
                if (a2 == ARMOR_LEGS) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            if (vEa2.j == vRa.d) {
                if (a2 == ARMOR_TORSO) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            if (vEa2.j == yRa.d) {
                if (a2 == ARMOR_FEET) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        if (b2 instanceof xCa) {
            if (a2 == WEAPON) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 instanceof Oba) {
            if (a2 == DIGGER) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 instanceof Aea) {
            if (a2 == BOW) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 instanceof xea) {
            if (a2 == FISHING_ROD) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    static {
        ALL = new sia_1();
        ARMOR = new sia_1();
        ARMOR_FEET = new sia_1();
        ARMOR_LEGS = new sia_1();
        ARMOR_TORSO = new sia_1();
        ARMOR_HEAD = new sia_1();
        WEAPON = new sia_1();
        DIGGER = new sia_1();
        FISHING_ROD = new sia_1();
        BREAKABLE = new sia_1();
        BOW = new sia_1();
        sia_1[] sia_1Array = new sia_1[pPa.f];
        sia_1Array[uSa.E] = ALL;
        sia_1Array[vRa.d] = ARMOR;
        sia_1Array[uqa.g] = ARMOR_FEET;
        sia_1Array[yRa.d] = ARMOR_LEGS;
        sia_1Array[AQa.P] = ARMOR_TORSO;
        sia_1Array[tTa.h] = ARMOR_HEAD;
        sia_1Array[uua.p] = WEAPON;
        sia_1Array[XTa.W] = DIGGER;
        sia_1Array[Yqa.i] = FISHING_ROD;
        sia_1Array[WOa.fa] = BREAKABLE;
        sia_1Array[NTa.C] = BOW;
        $VALUES = sia_1Array;
    }

    public static sia[] values() {
        return (sia[])$VALUES.clone();
    }
}

