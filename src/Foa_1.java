/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MMa
 *  Maa
 *  Ppa
 *  URa
 *  Zpa
 *  asa
 *  mOa
 *  mra
 *  oqa
 *  pqa
 *  rna
 *  vPa
 *  vRa
 *  woa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public final class Foa_1
implements JsonDeserializer<mOa> {
    @Override
    public mOa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        mOa b2;
        JsonElement c2;
        Foa_1 foa_1 = this;
        c2 = Maa.J((JsonElement)c2, (String)Xpa.i);
        mOa mOa2 = b2 = new mOa();
        mOa2.J(Maa.J((JsonObject)c2, (String)sOa.G, uSa.E != 0));
        rna a2 = rna.getCategory((String)Maa.J((JsonObject)c2, (String)AQa.g, (String)rna.MASTER.getCategoryName()));
        mOa2.J(a2);
        Validate.notNull(a2, pqa.Z, new Object[uSa.E]);
        if (((JsonObject)c2).has(IPa.k)) {
            c2 = Maa.J((JsonObject)c2, (String)IPa.k);
            int n2 = a2 = uSa.E;
            while (n2 < ((JsonArray)c2).size()) {
                mOa mOa3;
                Object d2 = ((JsonArray)c2).get(a2);
                woa woa2 = new woa();
                if (Maa.J((JsonElement)d2)) {
                    mOa3 = b2;
                    woa2.J(Maa.J((JsonElement)d2, (String)gua.n));
                } else {
                    Object object = d2 = Maa.J((JsonElement)d2, (String)gua.n);
                    woa2.J(Maa.J((JsonObject)object, (String)dua.T));
                    if (((JsonObject)object).has(Zpa.x)) {
                        MMa mMa2 = MMa.getType((String)Maa.J((JsonObject)d2, (String)Zpa.x));
                        Validate.notNull(mMa2, URa.t, new Object[uSa.E]);
                        woa2.J(mMa2);
                    }
                    if (((JsonObject)d2).has(vPa.s)) {
                        float f2;
                        float f3 = Maa.J((JsonObject)d2, (String)vPa.s);
                        Validate.isTrue((f2 > JPa.N ? vRa.d : uSa.E) != 0, CRa.Fa, new Object[uSa.E]);
                        woa2.J(f3);
                    }
                    if (((JsonObject)d2).has(mra.F)) {
                        float f4;
                        float f5 = Maa.J((JsonObject)d2, (String)mra.F);
                        Validate.isTrue((f4 > JPa.N ? vRa.d : uSa.E) != 0, Ppa.C, new Object[uSa.E]);
                        woa2.f(f5);
                    }
                    if (((JsonObject)d2).has(Pua.v)) {
                        int n3 = Maa.J((JsonObject)d2, (String)Pua.v);
                        Validate.isTrue((n3 > 0 ? vRa.d : uSa.E) != 0, oqa.b, new Object[uSa.E]);
                        woa2.J(n3);
                    }
                    if (((JsonObject)d2).has(asa.D)) {
                        woa2.J(Maa.d((JsonObject)d2, (String)asa.D));
                    }
                    mOa3 = b2;
                }
                mOa3.J().add(woa2);
                n2 = ++a2;
            }
        }
        return b2;
    }

    public Foa_1() {
        Foa_1 a2;
    }
}

