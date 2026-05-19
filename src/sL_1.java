/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  NTa
 *  XTa
 *  Ypa
 *  lqa
 *  pPa
 *  pua
 *  sL
 *  vRa
 *  yL
 */
import com.google.protobuf.Internal;

public final class sL_1
extends Enum<sL>
implements Internal.EnumLite {
    public static final /* enum */ sL BOOK;
    public static final /* enum */ sL ENCHANTMENT;
    public static final /* enum */ sL INVENTORY;
    public static final /* enum */ sL FURNACE;
    private final int value;
    public static final int CRAFTING_VALUE = 7;
    private static final Internal.EnumLiteMap<sL> internalValueMap;
    public static final int SIGN_VALUE = 13;
    public static final int BEACON_VALUE = 4;
    public static final /* enum */ sL HOPPER;
    public static final int HOPPER_VALUE = 1;
    public static final int FURNACE_VALUE = 9;
    public static final /* enum */ sL UNRECOGNIZED;
    public static final /* enum */ sL HORSE;
    public static final int MERCHANT_VALUE = 2;
    public static final int ANVIL_VALUE = 3;
    public static final /* enum */ sL CHAT;
    public static final int ENCHANTMENT_VALUE = 0;
    public static final /* enum */ sL BEACON;
    public static final /* enum */ sL COMMAND_BLOCK;
    public static final int COMMAND_BLOCK_VALUE = 12;
    public static final int DISPENSER_VALUE = 8;
    public static final /* enum */ sL DISPENSER;
    public static final int INVENTORY_VALUE = 14;
    public static final int CHEST_VALUE = 6;
    public static final int CHAT_VALUE = 15;
    public static final int HORSE_VALUE = 10;
    public static final /* enum */ sL CHEST;
    public static final /* enum */ sL MERCHANT;
    public static final /* enum */ sL ANVIL;
    private static final /* synthetic */ sL[] $VALUES;
    public static final /* enum */ sL BREWING_STAND;
    public static final int BREWING_STAND_VALUE = 5;
    public static final /* enum */ sL CRAFTING;
    public static final /* enum */ sL SIGN;
    public static final int BOOK_VALUE = 11;

    static {
        ENCHANTMENT = new sL_1(uSa.E);
        HOPPER = new sL_1(vRa.d);
        MERCHANT = new sL_1(uqa.g);
        ANVIL = new sL_1(yRa.d);
        BEACON = new sL_1(AQa.P);
        BREWING_STAND = new sL_1(tTa.h);
        CHEST = new sL_1(uua.p);
        CRAFTING = new sL_1(XTa.W);
        DISPENSER = new sL_1(Yqa.i);
        FURNACE = new sL_1(WOa.fa);
        HORSE = new sL_1(NTa.C);
        BOOK = new sL_1(pPa.f);
        COMMAND_BLOCK = new sL_1(lqa.s);
        SIGN = new sL_1(uua.s);
        INVENTORY = new sL_1(hpa.Z);
        CHAT = new sL_1(Ypa.A);
        UNRECOGNIZED = new sL_1(pua.o);
        sL_1[] sL_1Array = new sL_1[yta.Ka];
        sL_1Array[uSa.E] = ENCHANTMENT;
        sL_1Array[vRa.d] = HOPPER;
        sL_1Array[uqa.g] = MERCHANT;
        sL_1Array[yRa.d] = ANVIL;
        sL_1Array[AQa.P] = BEACON;
        sL_1Array[tTa.h] = BREWING_STAND;
        sL_1Array[uua.p] = CHEST;
        sL_1Array[XTa.W] = CRAFTING;
        sL_1Array[Yqa.i] = DISPENSER;
        sL_1Array[WOa.fa] = FURNACE;
        sL_1Array[NTa.C] = HORSE;
        sL_1Array[pPa.f] = BOOK;
        sL_1Array[lqa.s] = COMMAND_BLOCK;
        sL_1Array[uua.s] = SIGN;
        sL_1Array[hpa.Z] = INVENTORY;
        sL_1Array[Ypa.A] = CHAT;
        sL_1Array[ERa.C] = UNRECOGNIZED;
        $VALUES = sL_1Array;
        internalValueMap = new yL();
    }

    public static Internal.EnumLiteMap<sL> internalGetValueMap() {
        return internalValueMap;
    }

    @Override
    public final int getNumber() {
        sL_1 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return IL.INSTANCE;
    }

    public static sL valueOf(String a2) {
        return Enum.valueOf(sL_1.class, a2);
    }

    private sL_1(int n3) {
        int b2 = n3;
        sL_1 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sL forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ENCHANTMENT;
            }
            case 1: {
                return HOPPER;
            }
            case 2: {
                return MERCHANT;
            }
            case 3: {
                return ANVIL;
            }
            case 4: {
                return BEACON;
            }
            case 5: {
                return BREWING_STAND;
            }
            case 6: {
                return CHEST;
            }
            case 7: {
                return CRAFTING;
            }
            case 8: {
                return DISPENSER;
            }
            case 9: {
                return FURNACE;
            }
            case 10: {
                return HORSE;
            }
            case 11: {
                return BOOK;
            }
            case 12: {
                return COMMAND_BLOCK;
            }
            case 13: {
                return SIGN;
            }
            case 14: {
                return INVENTORY;
            }
            case 15: {
                return CHAT;
            }
        }
        return null;
    }

    public static sL[] values() {
        return (sL[])$VALUES.clone();
    }

    @Deprecated
    public static sL valueOf(int a2) {
        return sL_1.forNumber(a2);
    }
}

