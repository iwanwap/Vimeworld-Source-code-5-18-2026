/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Lra
 *  SOa
 *  XTa
 *  bRa
 *  rna
 *  uRa
 *  vRa
 *  xOa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class rna_1
extends Enum<rna>
implements D {
    public static final /* enum */ rna RECORDS;
    public static final /* enum */ rna ANIMALS;
    private static final /* synthetic */ rna[] $VALUES;
    public static final /* enum */ rna AMBIENT;
    public static final /* enum */ rna WEATHER;
    public static final /* enum */ rna MOBS;
    private final String categoryName;
    private static final Map<Integer, rna> ID_CATEGORY_MAP;
    private final int categoryId;
    public static final /* enum */ rna BLOCKS;
    private static final Map<String, rna> NAME_CATEGORY_MAP;
    public static final /* enum */ rna MASTER;
    public static final /* enum */ rna PLAYERS;
    public static final /* enum */ rna MUSIC;

    static {
        int n2;
        MASTER = new rna_1(Ira.Ga, uSa.E);
        MUSIC = new rna_1(Bua.z, vRa.d);
        RECORDS = new rna_1(bRa.Aa, uqa.g);
        WEATHER = new rna_1(oua.h, yRa.d);
        BLOCKS = new rna_1(Lra.M, AQa.P);
        MOBS = new rna_1(wua.F, tTa.h);
        ANIMALS = new rna_1(SOa.W, uua.p);
        PLAYERS = new rna_1(xOa.l, XTa.W);
        AMBIENT = new rna_1(eua.L, Yqa.i);
        rna_1[] rna_1Array = new rna_1[WOa.fa];
        rna_1Array[uSa.E] = MASTER;
        rna_1Array[vRa.d] = MUSIC;
        rna_1Array[uqa.g] = RECORDS;
        rna_1Array[yRa.d] = WEATHER;
        rna_1Array[AQa.P] = BLOCKS;
        rna_1Array[tTa.h] = MOBS;
        rna_1Array[uua.p] = ANIMALS;
        rna_1Array[XTa.W] = PLAYERS;
        rna_1Array[Yqa.i] = AMBIENT;
        $VALUES = rna_1Array;
        NAME_CATEGORY_MAP = Maps.newHashMap();
        ID_CATEGORY_MAP = Maps.newHashMap();
        rna[] rnaArray = rna_1.values();
        int n3 = rnaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            rna rna2 = rnaArray[n2];
            if (NAME_CATEGORY_MAP.containsKey(rna2.getCategoryName()) || ID_CATEGORY_MAP.containsKey(rna2.getCategoryId())) {
                throw new Error(new StringBuilder().insert(3 & 4, uRa.f).append(rna2).toString());
            }
            NAME_CATEGORY_MAP.put(rna2.getCategoryName(), rna2);
            ID_CATEGORY_MAP.put(rna2.getCategoryId(), rna2);
            n4 = ++n2;
        }
    }

    public static rna getCategory(String a2) {
        return (rna_1)NAME_CATEGORY_MAP.get(a2);
    }

    public static rna[] values() {
        return (rna[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private rna_1(String string2, int n3) {
        void c2;
        void b2;
        rna_1 a2;
        int n4 = n3;
        rna_1 rna_12 = a2 = this;
        rna_12.categoryName = b2;
        rna_12.categoryId = c2;
    }

    public int getCategoryId() {
        rna_1 a2;
        return a2.categoryId;
    }

    public static rna valueOf(String a2) {
        return Enum.valueOf(rna_1.class, a2);
    }

    public String getCategoryName() {
        rna_1 a2;
        return a2.categoryName;
    }
}

