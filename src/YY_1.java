/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  ERa
 *  JPa
 *  MQa
 *  NTa
 *  Naa
 *  Qsa
 *  Ssa
 *  XTa
 *  YY
 *  hra
 *  jpa
 *  naa
 *  pQa
 *  pqa
 *  pua
 *  vRa
 *  ysa
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YY_1
implements D {
    public int gravelMinHeight;
    public int lavaLakeChance;
    public boolean useRavines;
    public boolean useStrongholds;
    public float mainNoiseScaleY;
    public int lapisCount;
    public int gravelSize;
    public int redstoneMinHeight;
    public int graniteSize;
    public int ironCount;
    public int ironMaxHeight;
    public int coalSize;
    public int lapisCenterHeight;
    public int dirtSize;
    public float mainNoiseScaleZ;
    public int waterLakeChance;
    public boolean useMineShafts;
    public boolean useVillages;
    public int andesiteSize;
    public boolean useCaves;
    public int goldSize;
    public int andesiteMinHeight;
    public int ironSize;
    public float stretchY;
    public int dirtCount;
    public static final Gson JSON_ADAPTER = new GsonBuilder().registerTypeAdapter((Type)((Object)YY_1.class), new naa()).create();
    public float depthNoiseScaleZ;
    public boolean useLavaOceans;
    public int redstoneMaxHeight;
    public int graniteMinHeight;
    public boolean useDungeons;
    public int dioriteMinHeight;
    public float heightScale;
    public float coordinateScale;
    public float biomeScaleOffset;
    public int lapisSize;
    public int dioriteMaxHeight;
    public float depthNoiseScaleExponent;
    public int biomeSize;
    public float biomeDepthOffset;
    public int graniteCount;
    public int graniteMaxHeight;
    public int goldCount;
    public boolean useWaterLakes;
    public int goldMaxHeight;
    public int goldMinHeight;
    public int riverSize;
    public int coalCount;
    public int coalMaxHeight;
    public int dioriteSize;
    public boolean useTemples;
    public int gravelMaxHeight;
    public int andesiteMaxHeight;
    public float upperLimitScale;
    public boolean useMonuments;
    public boolean useLavaLakes;
    public int coalMinHeight;
    public int andesiteCount;
    public int seaLevel;
    public int dungeonChance;
    public int redstoneCount;
    public float mainNoiseScaleX;
    public int dirtMaxHeight;
    public float depthNoiseScaleX;
    public float biomeDepthWeight;
    public int dioriteCount;
    public int dirtMinHeight;
    public int fixedBiome;
    public int diamondSize;
    public int redstoneSize;
    public int diamondMinHeight;
    public int gravelCount;
    public int lapisSpread;
    public float baseSize;
    public int diamondMaxHeight;
    public int diamondCount;
    public int ironMinHeight;
    public float biomeScaleWeight;
    public float lowerLimitScale;

    public String toString() {
        YY_1 a2;
        return JSON_ADAPTER.toJson(a2);
    }

    public void J() {
        YY_1 a2;
        YY_1 yY_1 = a2;
        yY_1.coordinateScale = jpa.v;
        yY_1.heightScale = jpa.v;
        yY_1.upperLimitScale = pQa.fa;
        yY_1.lowerLimitScale = pQa.fa;
        yY_1.depthNoiseScaleX = Qsa.U;
        yY_1.depthNoiseScaleZ = Qsa.U;
        yY_1.depthNoiseScaleExponent = MQa.L;
        yY_1.mainNoiseScaleX = KSa.z;
        yY_1.mainNoiseScaleY = aua.a;
        yY_1.mainNoiseScaleZ = KSa.z;
        yY_1.baseSize = sSa.m;
        yY_1.stretchY = Fua.Y;
        yY_1.biomeDepthWeight = pqa.r;
        yY_1.biomeDepthOffset = JPa.N;
        yY_1.biomeScaleWeight = pqa.r;
        yY_1.biomeScaleOffset = JPa.N;
        yY_1.seaLevel = Ssa.u;
        yY_1.useCaves = vRa.d;
        yY_1.useDungeons = vRa.d;
        yY_1.dungeonChance = Yqa.i;
        yY_1.useStrongholds = vRa.d;
        yY_1.useVillages = vRa.d;
        yY_1.useMineShafts = vRa.d;
        yY_1.useTemples = vRa.d;
        yY_1.useMonuments = vRa.d;
        yY_1.useRavines = vRa.d;
        yY_1.useWaterLakes = vRa.d;
        yY_1.waterLakeChance = AQa.P;
        yY_1.useLavaLakes = vRa.d;
        yY_1.lavaLakeChance = Fua.J;
        yY_1.useLavaOceans = uSa.E;
        yY_1.fixedBiome = pua.o;
        yY_1.biomeSize = AQa.P;
        yY_1.riverSize = AQa.P;
        yY_1.dirtSize = Zqa.G;
        yY_1.dirtCount = NTa.C;
        yY_1.dirtMinHeight = uSa.E;
        yY_1.dirtMaxHeight = hra.Ja;
        yY_1.gravelSize = Zqa.G;
        yY_1.gravelCount = Yqa.i;
        yY_1.gravelMinHeight = uSa.E;
        yY_1.gravelMaxHeight = hra.Ja;
        yY_1.graniteSize = Zqa.G;
        yY_1.graniteCount = NTa.C;
        yY_1.graniteMinHeight = uSa.E;
        yY_1.graniteMaxHeight = Fua.J;
        yY_1.dioriteSize = Zqa.G;
        yY_1.dioriteCount = NTa.C;
        yY_1.dioriteMinHeight = uSa.E;
        yY_1.dioriteMaxHeight = Fua.J;
        yY_1.andesiteSize = Zqa.G;
        yY_1.andesiteCount = NTa.C;
        yY_1.andesiteMinHeight = uSa.E;
        yY_1.andesiteMaxHeight = Fua.J;
        yY_1.coalSize = yta.Ka;
        yY_1.coalCount = kTa.j;
        yY_1.coalMinHeight = uSa.E;
        yY_1.coalMaxHeight = XOa.h;
        yY_1.ironSize = WOa.fa;
        yY_1.ironCount = kTa.j;
        yY_1.ironMinHeight = uSa.E;
        yY_1.ironMaxHeight = ysa.s;
        yY_1.goldSize = WOa.fa;
        yY_1.goldCount = uqa.g;
        yY_1.goldMinHeight = uSa.E;
        yY_1.goldMaxHeight = fPa.i;
        yY_1.redstoneSize = Yqa.i;
        yY_1.redstoneCount = Yqa.i;
        yY_1.redstoneMinHeight = uSa.E;
        yY_1.redstoneMaxHeight = ERa.C;
        yY_1.diamondSize = Yqa.i;
        yY_1.diamondCount = vRa.d;
        yY_1.diamondMinHeight = uSa.E;
        yY_1.diamondMaxHeight = ERa.C;
        yY_1.lapisSize = XTa.W;
        yY_1.lapisCount = vRa.d;
        yY_1.lapisCenterHeight = ERa.C;
        yY_1.lapisSpread = ERa.C;
    }

    public YY_1() {
        YY_1 a2;
        YY_1 yY_1 = a2;
        yY_1.coordinateScale = jpa.v;
        yY_1.heightScale = jpa.v;
        yY_1.upperLimitScale = pQa.fa;
        yY_1.lowerLimitScale = pQa.fa;
        yY_1.depthNoiseScaleX = Qsa.U;
        yY_1.depthNoiseScaleZ = Qsa.U;
        yY_1.depthNoiseScaleExponent = MQa.L;
        yY_1.mainNoiseScaleX = KSa.z;
        yY_1.mainNoiseScaleY = aua.a;
        yY_1.mainNoiseScaleZ = KSa.z;
        yY_1.baseSize = sSa.m;
        yY_1.stretchY = Fua.Y;
        yY_1.biomeDepthWeight = pqa.r;
        yY_1.biomeDepthOffset = JPa.N;
        yY_1.biomeScaleWeight = pqa.r;
        yY_1.biomeScaleOffset = JPa.N;
        yY_1.seaLevel = Ssa.u;
        yY_1.useCaves = vRa.d;
        yY_1.useDungeons = vRa.d;
        yY_1.dungeonChance = Yqa.i;
        yY_1.useStrongholds = vRa.d;
        yY_1.useVillages = vRa.d;
        yY_1.useMineShafts = vRa.d;
        yY_1.useTemples = vRa.d;
        yY_1.useMonuments = vRa.d;
        yY_1.useRavines = vRa.d;
        yY_1.useWaterLakes = vRa.d;
        yY_1.waterLakeChance = AQa.P;
        yY_1.useLavaLakes = vRa.d;
        yY_1.lavaLakeChance = Fua.J;
        yY_1.useLavaOceans = uSa.E;
        yY_1.fixedBiome = pua.o;
        yY_1.biomeSize = AQa.P;
        yY_1.riverSize = AQa.P;
        yY_1.dirtSize = Zqa.G;
        yY_1.dirtCount = NTa.C;
        yY_1.dirtMinHeight = uSa.E;
        yY_1.dirtMaxHeight = hra.Ja;
        yY_1.gravelSize = Zqa.G;
        yY_1.gravelCount = Yqa.i;
        yY_1.gravelMinHeight = uSa.E;
        yY_1.gravelMaxHeight = hra.Ja;
        yY_1.graniteSize = Zqa.G;
        yY_1.graniteCount = NTa.C;
        yY_1.graniteMinHeight = uSa.E;
        yY_1.graniteMaxHeight = Fua.J;
        yY_1.dioriteSize = Zqa.G;
        yY_1.dioriteCount = NTa.C;
        yY_1.dioriteMinHeight = uSa.E;
        yY_1.dioriteMaxHeight = Fua.J;
        yY_1.andesiteSize = Zqa.G;
        yY_1.andesiteCount = NTa.C;
        yY_1.andesiteMinHeight = uSa.E;
        yY_1.andesiteMaxHeight = Fua.J;
        yY_1.coalSize = yta.Ka;
        yY_1.coalCount = kTa.j;
        yY_1.coalMinHeight = uSa.E;
        yY_1.coalMaxHeight = XOa.h;
        yY_1.ironSize = WOa.fa;
        yY_1.ironCount = kTa.j;
        yY_1.ironMinHeight = uSa.E;
        yY_1.ironMaxHeight = ysa.s;
        yY_1.goldSize = WOa.fa;
        yY_1.goldCount = uqa.g;
        yY_1.goldMinHeight = uSa.E;
        yY_1.goldMaxHeight = fPa.i;
        yY_1.redstoneSize = Yqa.i;
        yY_1.redstoneCount = Yqa.i;
        yY_1.redstoneMinHeight = uSa.E;
        yY_1.redstoneMaxHeight = ERa.C;
        yY_1.diamondSize = Yqa.i;
        yY_1.diamondCount = vRa.d;
        yY_1.diamondMinHeight = uSa.E;
        yY_1.diamondMaxHeight = ERa.C;
        yY_1.lapisSize = XTa.W;
        yY_1.lapisCount = vRa.d;
        yY_1.lapisCenterHeight = ERa.C;
        yY_1.lapisSpread = ERa.C;
        yY_1.J();
    }

    public Naa J() {
        YY_1 a2;
        return new Naa((YY)a2, null);
    }

    public static YY J(String a2) {
        if (a2.length() == 0) {
            return new YY_1();
        }
        try {
            return JSON_ADAPTER.fromJson(a2, YY_1.class);
        }
        catch (Exception exception) {
            return new YY_1();
        }
    }

    public int hashCode() {
        YY_1 yY_1 = this;
        int a2 = yY_1.coordinateScale != JPa.N ? Float.floatToIntBits(yY_1.coordinateScale) : uSa.E;
        a2 = tua.U * a2 + (yY_1.heightScale != JPa.N ? Float.floatToIntBits(yY_1.heightScale) : uSa.E);
        a2 = tua.U * a2 + (yY_1.upperLimitScale != JPa.N ? Float.floatToIntBits(yY_1.upperLimitScale) : uSa.E);
        a2 = tua.U * a2 + (yY_1.lowerLimitScale != JPa.N ? Float.floatToIntBits(yY_1.lowerLimitScale) : uSa.E);
        a2 = tua.U * a2 + (yY_1.depthNoiseScaleX != JPa.N ? Float.floatToIntBits(yY_1.depthNoiseScaleX) : uSa.E);
        a2 = tua.U * a2 + (yY_1.depthNoiseScaleZ != JPa.N ? Float.floatToIntBits(yY_1.depthNoiseScaleZ) : uSa.E);
        a2 = tua.U * a2 + (yY_1.depthNoiseScaleExponent != JPa.N ? Float.floatToIntBits(yY_1.depthNoiseScaleExponent) : uSa.E);
        a2 = tua.U * a2 + (yY_1.mainNoiseScaleX != JPa.N ? Float.floatToIntBits(yY_1.mainNoiseScaleX) : uSa.E);
        a2 = tua.U * a2 + (yY_1.mainNoiseScaleY != JPa.N ? Float.floatToIntBits(yY_1.mainNoiseScaleY) : uSa.E);
        a2 = tua.U * a2 + (yY_1.mainNoiseScaleZ != JPa.N ? Float.floatToIntBits(yY_1.mainNoiseScaleZ) : uSa.E);
        a2 = tua.U * a2 + (yY_1.baseSize != JPa.N ? Float.floatToIntBits(yY_1.baseSize) : uSa.E);
        a2 = tua.U * a2 + (yY_1.stretchY != JPa.N ? Float.floatToIntBits(yY_1.stretchY) : uSa.E);
        a2 = tua.U * a2 + (yY_1.biomeDepthWeight != JPa.N ? Float.floatToIntBits(yY_1.biomeDepthWeight) : uSa.E);
        a2 = tua.U * a2 + (yY_1.biomeDepthOffset != JPa.N ? Float.floatToIntBits(yY_1.biomeDepthOffset) : uSa.E);
        a2 = tua.U * a2 + (yY_1.biomeScaleWeight != JPa.N ? Float.floatToIntBits(yY_1.biomeScaleWeight) : uSa.E);
        a2 = tua.U * a2 + (yY_1.biomeScaleOffset != JPa.N ? Float.floatToIntBits(yY_1.biomeScaleOffset) : uSa.E);
        a2 = tua.U * a2 + yY_1.seaLevel;
        a2 = tua.U * a2 + (yY_1.useCaves ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useDungeons ? vRa.d : uSa.E);
        a2 = tua.U * a2 + yY_1.dungeonChance;
        a2 = tua.U * a2 + (yY_1.useStrongholds ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useVillages ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useMineShafts ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useTemples ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useMonuments ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useRavines ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (yY_1.useWaterLakes ? vRa.d : uSa.E);
        a2 = tua.U * a2 + yY_1.waterLakeChance;
        a2 = tua.U * a2 + (yY_1.useLavaLakes ? vRa.d : uSa.E);
        a2 = tua.U * a2 + yY_1.lavaLakeChance;
        a2 = tua.U * a2 + (yY_1.useLavaOceans ? vRa.d : uSa.E);
        a2 = tua.U * a2 + yY_1.fixedBiome;
        a2 = tua.U * a2 + yY_1.biomeSize;
        a2 = tua.U * a2 + yY_1.riverSize;
        a2 = tua.U * a2 + yY_1.dirtSize;
        a2 = tua.U * a2 + yY_1.dirtCount;
        a2 = tua.U * a2 + yY_1.dirtMinHeight;
        a2 = tua.U * a2 + yY_1.dirtMaxHeight;
        a2 = tua.U * a2 + yY_1.gravelSize;
        a2 = tua.U * a2 + yY_1.gravelCount;
        a2 = tua.U * a2 + yY_1.gravelMinHeight;
        a2 = tua.U * a2 + yY_1.gravelMaxHeight;
        a2 = tua.U * a2 + yY_1.graniteSize;
        a2 = tua.U * a2 + yY_1.graniteCount;
        a2 = tua.U * a2 + yY_1.graniteMinHeight;
        a2 = tua.U * a2 + yY_1.graniteMaxHeight;
        a2 = tua.U * a2 + yY_1.dioriteSize;
        a2 = tua.U * a2 + yY_1.dioriteCount;
        a2 = tua.U * a2 + yY_1.dioriteMinHeight;
        a2 = tua.U * a2 + yY_1.dioriteMaxHeight;
        a2 = tua.U * a2 + yY_1.andesiteSize;
        a2 = tua.U * a2 + yY_1.andesiteCount;
        a2 = tua.U * a2 + yY_1.andesiteMinHeight;
        a2 = tua.U * a2 + yY_1.andesiteMaxHeight;
        a2 = tua.U * a2 + yY_1.coalSize;
        a2 = tua.U * a2 + yY_1.coalCount;
        a2 = tua.U * a2 + yY_1.coalMinHeight;
        a2 = tua.U * a2 + yY_1.coalMaxHeight;
        a2 = tua.U * a2 + yY_1.ironSize;
        a2 = tua.U * a2 + yY_1.ironCount;
        a2 = tua.U * a2 + yY_1.ironMinHeight;
        a2 = tua.U * a2 + yY_1.ironMaxHeight;
        a2 = tua.U * a2 + yY_1.goldSize;
        a2 = tua.U * a2 + yY_1.goldCount;
        a2 = tua.U * a2 + yY_1.goldMinHeight;
        a2 = tua.U * a2 + yY_1.goldMaxHeight;
        a2 = tua.U * a2 + yY_1.redstoneSize;
        a2 = tua.U * a2 + yY_1.redstoneCount;
        a2 = tua.U * a2 + yY_1.redstoneMinHeight;
        a2 = tua.U * a2 + yY_1.redstoneMaxHeight;
        a2 = tua.U * a2 + yY_1.diamondSize;
        a2 = tua.U * a2 + yY_1.diamondCount;
        a2 = tua.U * a2 + yY_1.diamondMinHeight;
        a2 = tua.U * a2 + yY_1.diamondMaxHeight;
        a2 = tua.U * a2 + yY_1.lapisSize;
        a2 = tua.U * a2 + yY_1.lapisCount;
        a2 = tua.U * a2 + yY_1.lapisCenterHeight;
        a2 = tua.U * a2 + yY_1.lapisSpread;
        return a2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (YY_1)b2;
            if (((YY_1)a2).andesiteCount != ((YY_1)b2).andesiteCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).andesiteMaxHeight != ((YY_1)b2).andesiteMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).andesiteMinHeight != ((YY_1)b2).andesiteMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).andesiteSize != ((YY_1)b2).andesiteSize) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).baseSize, ((YY_1)a2).baseSize) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).biomeDepthOffset, ((YY_1)a2).biomeDepthOffset) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).biomeDepthWeight, ((YY_1)a2).biomeDepthWeight) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).biomeScaleOffset, ((YY_1)a2).biomeScaleOffset) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).biomeScaleWeight, ((YY_1)a2).biomeScaleWeight) != 0) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).biomeSize != ((YY_1)b2).biomeSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).coalCount != ((YY_1)b2).coalCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).coalMaxHeight != ((YY_1)b2).coalMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).coalMinHeight != ((YY_1)b2).coalMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).coalSize != ((YY_1)b2).coalSize) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).coordinateScale, ((YY_1)a2).coordinateScale) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).depthNoiseScaleExponent, ((YY_1)a2).depthNoiseScaleExponent) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).depthNoiseScaleX, ((YY_1)a2).depthNoiseScaleX) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).depthNoiseScaleZ, ((YY_1)a2).depthNoiseScaleZ) != 0) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).diamondCount != ((YY_1)b2).diamondCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).diamondMaxHeight != ((YY_1)b2).diamondMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).diamondMinHeight != ((YY_1)b2).diamondMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).diamondSize != ((YY_1)b2).diamondSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dioriteCount != ((YY_1)b2).dioriteCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dioriteMaxHeight != ((YY_1)b2).dioriteMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dioriteMinHeight != ((YY_1)b2).dioriteMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dioriteSize != ((YY_1)b2).dioriteSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dirtCount != ((YY_1)b2).dirtCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dirtMaxHeight != ((YY_1)b2).dirtMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dirtMinHeight != ((YY_1)b2).dirtMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dirtSize != ((YY_1)b2).dirtSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).dungeonChance != ((YY_1)b2).dungeonChance) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).fixedBiome != ((YY_1)b2).fixedBiome) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).goldCount != ((YY_1)b2).goldCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).goldMaxHeight != ((YY_1)b2).goldMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).goldMinHeight != ((YY_1)b2).goldMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).goldSize != ((YY_1)b2).goldSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).graniteCount != ((YY_1)b2).graniteCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).graniteMaxHeight != ((YY_1)b2).graniteMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).graniteMinHeight != ((YY_1)b2).graniteMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).graniteSize != ((YY_1)b2).graniteSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).gravelCount != ((YY_1)b2).gravelCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).gravelMaxHeight != ((YY_1)b2).gravelMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).gravelMinHeight != ((YY_1)b2).gravelMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).gravelSize != ((YY_1)b2).gravelSize) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).heightScale, ((YY_1)a2).heightScale) != 0) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).ironCount != ((YY_1)b2).ironCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).ironMaxHeight != ((YY_1)b2).ironMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).ironMinHeight != ((YY_1)b2).ironMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).ironSize != ((YY_1)b2).ironSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).lapisCenterHeight != ((YY_1)b2).lapisCenterHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).lapisCount != ((YY_1)b2).lapisCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).lapisSize != ((YY_1)b2).lapisSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).lapisSpread != ((YY_1)b2).lapisSpread) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).lavaLakeChance != ((YY_1)b2).lavaLakeChance) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).lowerLimitScale, ((YY_1)a2).lowerLimitScale) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).mainNoiseScaleX, ((YY_1)a2).mainNoiseScaleX) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).mainNoiseScaleY, ((YY_1)a2).mainNoiseScaleY) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).mainNoiseScaleZ, ((YY_1)a2).mainNoiseScaleZ) != 0) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).redstoneCount != ((YY_1)b2).redstoneCount) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).redstoneMaxHeight != ((YY_1)b2).redstoneMaxHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).redstoneMinHeight != ((YY_1)b2).redstoneMinHeight) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).redstoneSize != ((YY_1)b2).redstoneSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).riverSize != ((YY_1)b2).riverSize) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).seaLevel != ((YY_1)b2).seaLevel) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).stretchY, ((YY_1)a2).stretchY) != 0) {
                return uSa.E != 0;
            }
            if (Float.compare(((YY_1)b2).upperLimitScale, ((YY_1)a2).upperLimitScale) != 0) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useCaves != ((YY_1)b2).useCaves) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useDungeons != ((YY_1)b2).useDungeons) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useLavaLakes != ((YY_1)b2).useLavaLakes) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useLavaOceans != ((YY_1)b2).useLavaOceans) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useMineShafts != ((YY_1)b2).useMineShafts) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useRavines != ((YY_1)b2).useRavines) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useStrongholds != ((YY_1)b2).useStrongholds) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useTemples != ((YY_1)b2).useTemples) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useMonuments != ((YY_1)b2).useMonuments) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useVillages != ((YY_1)b2).useVillages) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).useWaterLakes != ((YY_1)b2).useWaterLakes) {
                return uSa.E != 0;
            }
            if (((YY_1)a2).waterLakeChance == ((YY_1)b2).waterLakeChance) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

