/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Epa
 *  FTa
 *  ISa
 *  Jy
 *  LQa
 *  Maa
 *  Pqa
 *  Rua
 *  SOa
 *  Sqa
 *  TQa
 *  URa
 *  Uqa
 *  YY
 *  Yra
 *  Zpa
 *  Zua
 *  aPa
 *  bSa
 *  bpa
 *  bua
 *  cRa
 *  dpa
 *  fpa
 *  kpa
 *  lPa
 *  mra
 *  pua
 *  yQa
 *  zsa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class naa_3
implements JsonDeserializer<YY>,
JsonSerializer<YY> {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public YY deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject c2;
        Object d2 = type;
        naa_3 b2 = this;
        c2 = c2.getAsJsonObject();
        d2 = new YY();
        try {
            block5: {
                Object object;
                block4: {
                    block3: {
                        JsonObject jsonObject = c2;
                        ((YY)d2).coordinateScale = Maa.J((JsonObject)jsonObject, (String)Sqa.R, (float)((YY)d2).coordinateScale);
                        ((YY)d2).heightScale = Maa.J((JsonObject)jsonObject, (String)vua.P, (float)((YY)d2).heightScale);
                        ((YY)d2).lowerLimitScale = Maa.J((JsonObject)jsonObject, (String)SOa.K, (float)((YY)d2).lowerLimitScale);
                        ((YY)d2).upperLimitScale = Maa.J((JsonObject)jsonObject, (String)csa.x, (float)((YY)d2).upperLimitScale);
                        ((YY)d2).depthNoiseScaleX = Maa.J((JsonObject)jsonObject, (String)ISa.U, (float)((YY)d2).depthNoiseScaleX);
                        ((YY)d2).depthNoiseScaleZ = Maa.J((JsonObject)jsonObject, (String)osa.ca, (float)((YY)d2).depthNoiseScaleZ);
                        ((YY)d2).depthNoiseScaleExponent = Maa.J((JsonObject)jsonObject, (String)GPa.c, (float)((YY)d2).depthNoiseScaleExponent);
                        ((YY)d2).mainNoiseScaleX = Maa.J((JsonObject)jsonObject, (String)Ora.c, (float)((YY)d2).mainNoiseScaleX);
                        ((YY)d2).mainNoiseScaleY = Maa.J((JsonObject)jsonObject, (String)TOa.ga, (float)((YY)d2).mainNoiseScaleY);
                        ((YY)d2).mainNoiseScaleZ = Maa.J((JsonObject)jsonObject, (String)Zua.ja, (float)((YY)d2).mainNoiseScaleZ);
                        ((YY)d2).baseSize = Maa.J((JsonObject)jsonObject, (String)vua.g, (float)((YY)d2).baseSize);
                        ((YY)d2).stretchY = Maa.J((JsonObject)jsonObject, (String)Bta.M, (float)((YY)d2).stretchY);
                        ((YY)d2).biomeDepthWeight = Maa.J((JsonObject)jsonObject, (String)lQa.J, (float)((YY)d2).biomeDepthWeight);
                        ((YY)d2).biomeDepthOffset = Maa.J((JsonObject)jsonObject, (String)KPa.Ia, (float)((YY)d2).biomeDepthOffset);
                        ((YY)d2).biomeScaleWeight = Maa.J((JsonObject)jsonObject, (String)dpa.L, (float)((YY)d2).biomeScaleWeight);
                        ((YY)d2).biomeScaleOffset = Maa.J((JsonObject)jsonObject, (String)kTa.k, (float)((YY)d2).biomeScaleOffset);
                        ((YY)d2).seaLevel = Maa.J((JsonObject)jsonObject, (String)Ata.s, (int)((YY)d2).seaLevel);
                        ((YY)d2).useCaves = Maa.J((JsonObject)jsonObject, (String)xTa.Ja, (boolean)((YY)d2).useCaves);
                        ((YY)d2).useDungeons = Maa.J((JsonObject)jsonObject, (String)iSa.M, (boolean)((YY)d2).useDungeons);
                        ((YY)d2).dungeonChance = Maa.J((JsonObject)jsonObject, (String)sSa.o, (int)((YY)d2).dungeonChance);
                        ((YY)d2).useStrongholds = Maa.J((JsonObject)jsonObject, (String)lPa.a, (boolean)((YY)d2).useStrongholds);
                        ((YY)d2).useVillages = Maa.J((JsonObject)jsonObject, (String)LPa.y, (boolean)((YY)d2).useVillages);
                        ((YY)d2).useMineShafts = Maa.J((JsonObject)jsonObject, (String)bua.d, (boolean)((YY)d2).useMineShafts);
                        ((YY)d2).useTemples = Maa.J((JsonObject)jsonObject, (String)URa.T, (boolean)((YY)d2).useTemples);
                        ((YY)d2).useMonuments = Maa.J((JsonObject)jsonObject, (String)fpa.fa, (boolean)((YY)d2).useMonuments);
                        ((YY)d2).useRavines = Maa.J((JsonObject)jsonObject, (String)yRa.X, (boolean)((YY)d2).useRavines);
                        ((YY)d2).useWaterLakes = Maa.J((JsonObject)jsonObject, (String)ROa.K, (boolean)((YY)d2).useWaterLakes);
                        ((YY)d2).waterLakeChance = Maa.J((JsonObject)jsonObject, (String)ypa.P, (int)((YY)d2).waterLakeChance);
                        ((YY)d2).useLavaLakes = Maa.J((JsonObject)jsonObject, (String)Pqa.Z, (boolean)((YY)d2).useLavaLakes);
                        ((YY)d2).lavaLakeChance = Maa.J((JsonObject)jsonObject, (String)Epa.F, (int)((YY)d2).lavaLakeChance);
                        ((YY)d2).useLavaOceans = Maa.J((JsonObject)jsonObject, (String)hQa.E, (boolean)((YY)d2).useLavaOceans);
                        ((YY)d2).fixedBiome = Maa.J((JsonObject)jsonObject, (String)csa.ca, (int)((YY)d2).fixedBiome);
                        if (((YY)d2).fixedBiome >= ISa.E || ((YY)d2).fixedBiome < pua.o) break block3;
                        if (((YY)d2).fixedBiome < Jy.B.Ka) break block4;
                        Object object2 = d2;
                        object = object2;
                        ((YY)object2).fixedBiome += uqa.g;
                        break block5;
                    }
                    ((YY)d2).fixedBiome = pua.o;
                }
                object = d2;
            }
            ((YY)object).biomeSize = Maa.J((JsonObject)c2, (String)Yra.Da, (int)((YY)d2).biomeSize);
            JsonObject jsonObject = c2;
            ((YY)d2).riverSize = Maa.J((JsonObject)jsonObject, (String)FTa.c, (int)((YY)d2).riverSize);
            ((YY)d2).dirtSize = Maa.J((JsonObject)jsonObject, (String)vsa.n, (int)((YY)d2).dirtSize);
            ((YY)d2).dirtCount = Maa.J((JsonObject)jsonObject, (String)Yqa.Ka, (int)((YY)d2).dirtCount);
            ((YY)d2).dirtMinHeight = Maa.J((JsonObject)jsonObject, (String)zsa.j, (int)((YY)d2).dirtMinHeight);
            ((YY)d2).dirtMaxHeight = Maa.J((JsonObject)jsonObject, (String)tua.D, (int)((YY)d2).dirtMaxHeight);
            ((YY)d2).gravelSize = Maa.J((JsonObject)jsonObject, (String)EPa.C, (int)((YY)d2).gravelSize);
            ((YY)d2).gravelCount = Maa.J((JsonObject)jsonObject, (String)Tqa.fa, (int)((YY)d2).gravelCount);
            ((YY)d2).gravelMinHeight = Maa.J((JsonObject)jsonObject, (String)Ura.w, (int)((YY)d2).gravelMinHeight);
            ((YY)d2).gravelMaxHeight = Maa.J((JsonObject)jsonObject, (String)nua.l, (int)((YY)d2).gravelMaxHeight);
            ((YY)d2).graniteSize = Maa.J((JsonObject)jsonObject, (String)sOa.Q, (int)((YY)d2).graniteSize);
            ((YY)d2).graniteCount = Maa.J((JsonObject)jsonObject, (String)Rua.Y, (int)((YY)d2).graniteCount);
            ((YY)d2).graniteMinHeight = Maa.J((JsonObject)jsonObject, (String)Bta.y, (int)((YY)d2).graniteMinHeight);
            ((YY)d2).graniteMaxHeight = Maa.J((JsonObject)jsonObject, (String)STa.T, (int)((YY)d2).graniteMaxHeight);
            ((YY)d2).dioriteSize = Maa.J((JsonObject)jsonObject, (String)Fua.Ha, (int)((YY)d2).dioriteSize);
            ((YY)d2).dioriteCount = Maa.J((JsonObject)jsonObject, (String)cPa.l, (int)((YY)d2).dioriteCount);
            ((YY)d2).dioriteMinHeight = Maa.J((JsonObject)jsonObject, (String)vqa.v, (int)((YY)d2).dioriteMinHeight);
            ((YY)d2).dioriteMaxHeight = Maa.J((JsonObject)jsonObject, (String)bSa.w, (int)((YY)d2).dioriteMaxHeight);
            ((YY)d2).andesiteSize = Maa.J((JsonObject)jsonObject, (String)aPa.u, (int)((YY)d2).andesiteSize);
            ((YY)d2).andesiteCount = Maa.J((JsonObject)jsonObject, (String)mra.Aa, (int)((YY)d2).andesiteCount);
            ((YY)d2).andesiteMinHeight = Maa.J((JsonObject)jsonObject, (String)osa.D, (int)((YY)d2).andesiteMinHeight);
            ((YY)d2).andesiteMaxHeight = Maa.J((JsonObject)jsonObject, (String)zta.Aa, (int)((YY)d2).andesiteMaxHeight);
            ((YY)d2).coalSize = Maa.J((JsonObject)jsonObject, (String)Zpa.O, (int)((YY)d2).coalSize);
            ((YY)d2).coalCount = Maa.J((JsonObject)jsonObject, (String)TQa.x, (int)((YY)d2).coalCount);
            ((YY)d2).coalMinHeight = Maa.J((JsonObject)jsonObject, (String)Bua.k, (int)((YY)d2).coalMinHeight);
            ((YY)d2).coalMaxHeight = Maa.J((JsonObject)jsonObject, (String)nqa.x, (int)((YY)d2).coalMaxHeight);
            ((YY)d2).ironSize = Maa.J((JsonObject)jsonObject, (String)rRa.M, (int)((YY)d2).ironSize);
            ((YY)d2).ironCount = Maa.J((JsonObject)jsonObject, (String)FTa.e, (int)((YY)d2).ironCount);
            ((YY)d2).ironMinHeight = Maa.J((JsonObject)jsonObject, (String)mSa.V, (int)((YY)d2).ironMinHeight);
            ((YY)d2).ironMaxHeight = Maa.J((JsonObject)jsonObject, (String)bpa.T, (int)((YY)d2).ironMaxHeight);
            ((YY)d2).goldSize = Maa.J((JsonObject)jsonObject, (String)EPa.Aa, (int)((YY)d2).goldSize);
            ((YY)d2).goldCount = Maa.J((JsonObject)jsonObject, (String)yQa.ja, (int)((YY)d2).goldCount);
            ((YY)d2).goldMinHeight = Maa.J((JsonObject)jsonObject, (String)kpa.b, (int)((YY)d2).goldMinHeight);
            ((YY)d2).goldMaxHeight = Maa.J((JsonObject)jsonObject, (String)nOa.F, (int)((YY)d2).goldMaxHeight);
            ((YY)d2).redstoneSize = Maa.J((JsonObject)jsonObject, (String)LQa.u, (int)((YY)d2).redstoneSize);
            ((YY)d2).redstoneCount = Maa.J((JsonObject)jsonObject, (String)Uqa.Aa, (int)((YY)d2).redstoneCount);
            ((YY)d2).redstoneMinHeight = Maa.J((JsonObject)jsonObject, (String)PRa.o, (int)((YY)d2).redstoneMinHeight);
            ((YY)d2).redstoneMaxHeight = Maa.J((JsonObject)jsonObject, (String)cRa.J, (int)((YY)d2).redstoneMaxHeight);
            ((YY)d2).diamondSize = Maa.J((JsonObject)jsonObject, (String)MTa.R, (int)((YY)d2).diamondSize);
            ((YY)d2).diamondCount = Maa.J((JsonObject)jsonObject, (String)FRa.Fa, (int)((YY)d2).diamondCount);
            ((YY)d2).diamondMinHeight = Maa.J((JsonObject)jsonObject, (String)uqa.Q, (int)((YY)d2).diamondMinHeight);
            ((YY)d2).diamondMaxHeight = Maa.J((JsonObject)jsonObject, (String)Cqa.m, (int)((YY)d2).diamondMaxHeight);
            ((YY)d2).lapisSize = Maa.J((JsonObject)jsonObject, (String)UTa.u, (int)((YY)d2).lapisSize);
            ((YY)d2).lapisCount = Maa.J((JsonObject)jsonObject, (String)fpa.Ba, (int)((YY)d2).lapisCount);
            ((YY)d2).lapisCenterHeight = Maa.J((JsonObject)jsonObject, (String)sqa.M, (int)((YY)d2).lapisCenterHeight);
            ((YY)d2).lapisSpread = Maa.J((JsonObject)jsonObject, (String)MTa.j, (int)((YY)d2).lapisSpread);
            return d2;
        }
        catch (Exception exception) {
            return d2;
        }
    }

    public naa_3() {
        naa_3 a2;
    }

    @Override
    public JsonElement serialize(YY yY2, Type type, JsonSerializationContext jsonSerializationContext) {
        naa_3 d2 = yY2;
        naa_3 c2 = this;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(Sqa.R, Float.valueOf(((YY)d2).coordinateScale));
        jsonObject.addProperty(vua.P, Float.valueOf(((YY)d2).heightScale));
        jsonObject.addProperty(SOa.K, Float.valueOf(((YY)d2).lowerLimitScale));
        jsonObject.addProperty(csa.x, Float.valueOf(((YY)d2).upperLimitScale));
        jsonObject.addProperty(ISa.U, Float.valueOf(((YY)d2).depthNoiseScaleX));
        jsonObject.addProperty(osa.ca, Float.valueOf(((YY)d2).depthNoiseScaleZ));
        jsonObject.addProperty(GPa.c, Float.valueOf(((YY)d2).depthNoiseScaleExponent));
        jsonObject.addProperty(Ora.c, Float.valueOf(((YY)d2).mainNoiseScaleX));
        jsonObject.addProperty(TOa.ga, Float.valueOf(((YY)d2).mainNoiseScaleY));
        jsonObject.addProperty(Zua.ja, Float.valueOf(((YY)d2).mainNoiseScaleZ));
        jsonObject.addProperty(vua.g, Float.valueOf(((YY)d2).baseSize));
        jsonObject.addProperty(Bta.M, Float.valueOf(((YY)d2).stretchY));
        jsonObject.addProperty(lQa.J, Float.valueOf(((YY)d2).biomeDepthWeight));
        jsonObject.addProperty(KPa.Ia, Float.valueOf(((YY)d2).biomeDepthOffset));
        jsonObject.addProperty(dpa.L, Float.valueOf(((YY)d2).biomeScaleWeight));
        jsonObject.addProperty(kTa.k, Float.valueOf(((YY)d2).biomeScaleOffset));
        jsonObject.addProperty(Ata.s, ((YY)d2).seaLevel);
        jsonObject.addProperty(xTa.Ja, ((YY)d2).useCaves);
        jsonObject.addProperty(iSa.M, ((YY)d2).useDungeons);
        jsonObject.addProperty(sSa.o, ((YY)d2).dungeonChance);
        jsonObject.addProperty(lPa.a, ((YY)d2).useStrongholds);
        jsonObject.addProperty(LPa.y, ((YY)d2).useVillages);
        jsonObject.addProperty(bua.d, ((YY)d2).useMineShafts);
        jsonObject.addProperty(URa.T, ((YY)d2).useTemples);
        jsonObject.addProperty(fpa.fa, ((YY)d2).useMonuments);
        jsonObject.addProperty(yRa.X, ((YY)d2).useRavines);
        jsonObject.addProperty(ROa.K, ((YY)d2).useWaterLakes);
        jsonObject.addProperty(ypa.P, ((YY)d2).waterLakeChance);
        jsonObject.addProperty(Pqa.Z, ((YY)d2).useLavaLakes);
        jsonObject.addProperty(Epa.F, ((YY)d2).lavaLakeChance);
        jsonObject.addProperty(hQa.E, ((YY)d2).useLavaOceans);
        jsonObject.addProperty(csa.ca, ((YY)d2).fixedBiome);
        jsonObject.addProperty(Yra.Da, ((YY)d2).biomeSize);
        jsonObject.addProperty(FTa.c, ((YY)d2).riverSize);
        jsonObject.addProperty(vsa.n, ((YY)d2).dirtSize);
        jsonObject.addProperty(Yqa.Ka, ((YY)d2).dirtCount);
        jsonObject.addProperty(zsa.j, ((YY)d2).dirtMinHeight);
        jsonObject.addProperty(tua.D, ((YY)d2).dirtMaxHeight);
        jsonObject.addProperty(EPa.C, ((YY)d2).gravelSize);
        jsonObject.addProperty(Tqa.fa, ((YY)d2).gravelCount);
        jsonObject.addProperty(Ura.w, ((YY)d2).gravelMinHeight);
        jsonObject.addProperty(nua.l, ((YY)d2).gravelMaxHeight);
        jsonObject.addProperty(sOa.Q, ((YY)d2).graniteSize);
        jsonObject.addProperty(Rua.Y, ((YY)d2).graniteCount);
        jsonObject.addProperty(Bta.y, ((YY)d2).graniteMinHeight);
        jsonObject.addProperty(STa.T, ((YY)d2).graniteMaxHeight);
        jsonObject.addProperty(Fua.Ha, ((YY)d2).dioriteSize);
        jsonObject.addProperty(cPa.l, ((YY)d2).dioriteCount);
        jsonObject.addProperty(vqa.v, ((YY)d2).dioriteMinHeight);
        jsonObject.addProperty(bSa.w, ((YY)d2).dioriteMaxHeight);
        jsonObject.addProperty(aPa.u, ((YY)d2).andesiteSize);
        jsonObject.addProperty(mra.Aa, ((YY)d2).andesiteCount);
        jsonObject.addProperty(osa.D, ((YY)d2).andesiteMinHeight);
        jsonObject.addProperty(zta.Aa, ((YY)d2).andesiteMaxHeight);
        jsonObject.addProperty(Zpa.O, ((YY)d2).coalSize);
        jsonObject.addProperty(TQa.x, ((YY)d2).coalCount);
        jsonObject.addProperty(Bua.k, ((YY)d2).coalMinHeight);
        jsonObject.addProperty(nqa.x, ((YY)d2).coalMaxHeight);
        jsonObject.addProperty(rRa.M, ((YY)d2).ironSize);
        jsonObject.addProperty(FTa.e, ((YY)d2).ironCount);
        jsonObject.addProperty(mSa.V, ((YY)d2).ironMinHeight);
        jsonObject.addProperty(bpa.T, ((YY)d2).ironMaxHeight);
        jsonObject.addProperty(EPa.Aa, ((YY)d2).goldSize);
        jsonObject.addProperty(yQa.ja, ((YY)d2).goldCount);
        jsonObject.addProperty(kpa.b, ((YY)d2).goldMinHeight);
        jsonObject.addProperty(nOa.F, ((YY)d2).goldMaxHeight);
        jsonObject.addProperty(LQa.u, ((YY)d2).redstoneSize);
        jsonObject.addProperty(Uqa.Aa, ((YY)d2).redstoneCount);
        jsonObject.addProperty(PRa.o, ((YY)d2).redstoneMinHeight);
        jsonObject.addProperty(cRa.J, ((YY)d2).redstoneMaxHeight);
        jsonObject.addProperty(MTa.R, ((YY)d2).diamondSize);
        jsonObject.addProperty(FRa.Fa, ((YY)d2).diamondCount);
        jsonObject.addProperty(uqa.Q, ((YY)d2).diamondMinHeight);
        jsonObject.addProperty(Cqa.m, ((YY)d2).diamondMaxHeight);
        jsonObject.addProperty(UTa.u, ((YY)d2).lapisSize);
        jsonObject.addProperty(fpa.Ba, ((YY)d2).lapisCount);
        jsonObject.addProperty(sqa.M, ((YY)d2).lapisCenterHeight);
        jsonObject.addProperty(MTa.j, ((YY)d2).lapisSpread);
        return jsonObject;
    }
}

