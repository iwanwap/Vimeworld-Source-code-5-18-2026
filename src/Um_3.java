/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BM
 *  NTa
 *  TM
 *  Um
 *  XTa
 *  pua
 *  vRa
 */
import com.google.protobuf.Internal;

public final class Um_3
extends Enum<Um>
implements Internal.EnumLite {
    public static final /* enum */ Um WEATHER;
    public static final /* enum */ Um ANIMALS;
    public static final /* enum */ Um MOBS;
    public static final /* enum */ Um MUSIC;
    public static final int RECORDS_VALUE = 2;
    public static final int ANIMALS_VALUE = 6;
    public static final /* enum */ Um PLAYERS;
    public static final /* enum */ Um MASTER;
    public static final /* enum */ Um RECORDS;
    public static final int BLOCKS_VALUE = 4;
    public static final int MASTER_VALUE = 0;
    public static final int AMBIENT_VALUE = 8;
    public static final int MOBS_VALUE = 5;
    public static final int PLAYERS_VALUE = 7;
    public static final int WEATHER_VALUE = 3;
    public static final /* enum */ Um BLOCKS;
    public static final /* enum */ Um AMBIENT;
    private static final /* synthetic */ Um[] $VALUES;
    private static final Internal.EnumLiteMap<Um> internalValueMap;
    public static final int MUSIC_VALUE = 1;
    private final int value;
    public static final /* enum */ Um UNRECOGNIZED;

    private Um_3(int n3) {
        int b2 = n3;
        Um_3 a2 = this;
        a2.value = b2;
    }

    public static Um[] values() {
        return (Um[])$VALUES.clone();
    }

    @Override
    public final int getNumber() {
        Um_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    static {
        MASTER = new Um_3(uSa.E);
        MUSIC = new Um_3(vRa.d);
        RECORDS = new Um_3(uqa.g);
        WEATHER = new Um_3(yRa.d);
        BLOCKS = new Um_3(AQa.P);
        MOBS = new Um_3(tTa.h);
        ANIMALS = new Um_3(uua.p);
        PLAYERS = new Um_3(XTa.W);
        AMBIENT = new Um_3(Yqa.i);
        UNRECOGNIZED = new Um_3(pua.o);
        Um_3[] um_3Array = new Um_3[NTa.C];
        um_3Array[uSa.E] = MASTER;
        um_3Array[vRa.d] = MUSIC;
        um_3Array[uqa.g] = RECORDS;
        um_3Array[yRa.d] = WEATHER;
        um_3Array[AQa.P] = BLOCKS;
        um_3Array[tTa.h] = MOBS;
        um_3Array[uua.p] = ANIMALS;
        um_3Array[XTa.W] = PLAYERS;
        um_3Array[Yqa.i] = AMBIENT;
        um_3Array[WOa.fa] = UNRECOGNIZED;
        $VALUES = um_3Array;
        internalValueMap = new TM();
    }

    @Deprecated
    public static Um valueOf(int a2) {
        return Um_3.forNumber(a2);
    }

    public static Internal.EnumLiteMap<Um> internalGetValueMap() {
        return internalValueMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Um forNumber(int a2) {
        switch (a2) {
            case 0: {
                return MASTER;
            }
            case 1: {
                return MUSIC;
            }
            case 2: {
                return RECORDS;
            }
            case 3: {
                return WEATHER;
            }
            case 4: {
                return BLOCKS;
            }
            case 5: {
                return MOBS;
            }
            case 6: {
                return ANIMALS;
            }
            case 7: {
                return PLAYERS;
            }
            case 8: {
                return AMBIENT;
            }
        }
        return null;
    }

    public static Um valueOf(String a2) {
        return Enum.valueOf(Um_3.class, a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return BM.INSTANCE;
    }
}

