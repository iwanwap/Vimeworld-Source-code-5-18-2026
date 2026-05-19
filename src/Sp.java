/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BMa
 *  EC
 *  ERa
 *  HOa
 *  Joa
 *  Kma
 *  NTa
 *  UNa
 *  XTa
 *  Xoa
 *  YMa
 *  Ypa
 *  Zna
 *  hna
 *  lqa
 *  pPa
 *  sL
 *  vRa
 *  yma
 *  zoa
 */
import java.util.EnumMap;

public final class Sp
extends Enum<Sp> {
    public static final /* enum */ Sp UNKNOWN;
    private static final /* synthetic */ Sp[] $VALUES;
    public final sL proto;
    public static final /* enum */ Sp SIGN;
    public static final /* enum */ Sp CHEST;
    public static final /* enum */ Sp INVENTORY;
    public static final /* enum */ Sp COMMAND_BLOCK;
    public static final /* enum */ Sp FURNACE;
    public static final /* enum */ Sp CRAFTING;
    public static final /* enum */ Sp CHAT;
    public static final /* enum */ Sp MERCHANT;
    public static final /* enum */ Sp BEACON;
    private static final EnumMap<sL, Sp> reverse;
    public static final /* enum */ Sp DISPENSER;
    public static final /* enum */ Sp HOPPER;
    public static final /* enum */ Sp BREWING_STAND;
    public final Class<? extends EC> clazz;
    public static final /* enum */ Sp BOOK;
    public static final /* enum */ Sp HORSE;
    public static final /* enum */ Sp ANVIL;
    public static final /* enum */ Sp ENCHANTMENT;

    public static Sp fromProto(sL a2) {
        return reverse.getOrDefault(a2, UNKNOWN);
    }

    /*
     * WARNING - void declaration
     */
    private Sp(Class<? extends EC> clazz, sL sL2) {
        Sp c2;
        void b2;
        Sp a2;
        Sp sp = sp2;
        Sp sp2 = sL2;
        Sp sp3 = a2 = sp;
        sp3.clazz = b2;
        sp3.proto = c2;
    }

    public static Sp valueOf(String a2) {
        return Enum.valueOf(Sp.class, a2);
    }

    public static Sp[] values() {
        return (Sp[])$VALUES.clone();
    }

    static {
        int n2;
        UNKNOWN = new Sp(null, sL.UNRECOGNIZED);
        ENCHANTMENT = new Sp(fma.class, sL.ENCHANTMENT);
        HOPPER = new Sp(BMa.class, sL.HOPPER);
        MERCHANT = new Sp(UNa.class, sL.MERCHANT);
        ANVIL = new Sp(yma.class, sL.ANVIL);
        BEACON = new Sp(rma.class, sL.BEACON);
        BREWING_STAND = new Sp(kOa.class, sL.BREWING_STAND);
        CHEST = new Sp(hna.class, sL.CHEST);
        CRAFTING = new Sp(Zna.class, sL.CRAFTING);
        DISPENSER = new Sp(YMa.class, sL.DISPENSER);
        FURNACE = new Sp(Kma.class, sL.FURNACE);
        HORSE = new Sp(zoa.class, sL.HORSE);
        BOOK = new Sp(HOa.class, sL.BOOK);
        COMMAND_BLOCK = new Sp(bOa.class, sL.COMMAND_BLOCK);
        SIGN = new Sp(sNa.class, sL.SIGN);
        INVENTORY = new Sp(Joa.class, sL.INVENTORY);
        CHAT = new Sp(Xoa.class, sL.CHAT);
        Sp[] spArray = new Sp[yta.Ka];
        spArray[uSa.E] = UNKNOWN;
        spArray[vRa.d] = ENCHANTMENT;
        spArray[uqa.g] = HOPPER;
        spArray[yRa.d] = MERCHANT;
        spArray[AQa.P] = ANVIL;
        spArray[tTa.h] = BEACON;
        spArray[uua.p] = BREWING_STAND;
        spArray[XTa.W] = CHEST;
        spArray[Yqa.i] = CRAFTING;
        spArray[WOa.fa] = DISPENSER;
        spArray[NTa.C] = FURNACE;
        spArray[pPa.f] = HORSE;
        spArray[lqa.s] = BOOK;
        spArray[uua.s] = COMMAND_BLOCK;
        spArray[hpa.Z] = SIGN;
        spArray[Ypa.A] = INVENTORY;
        spArray[ERa.C] = CHAT;
        $VALUES = spArray;
        reverse = new EnumMap(sL.class);
        Sp[] spArray2 = Sp.values();
        int n3 = spArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Sp sp = spArray2[n2];
            reverse.put(sp.proto, sp);
            n4 = ++n2;
        }
    }
}

