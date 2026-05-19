/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  JHa
 *  JPa
 *  Maa
 *  Rua
 *  Tpa
 *  aSa
 *  hra
 *  nQa
 *  pQa
 *  pqa
 *  qta
 *  uOa
 *  yQa
 *  zHa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public final class tGa
extends zHa<JHa> {
    public tGa() {
        tGa a2;
    }

    public JHa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        tGa c2 = this;
        d2 = ((JsonElement)d2).getAsJsonObject();
        float[] b2 = new float[hra.Ja];
        float[] a2 = new float[hra.Ja];
        float[] fArray = new float[hra.Ja];
        float f2 = pqa.r;
        float f3 = JPa.N;
        float f4 = JPa.N;
        if (((JsonObject)d2).has(TOa.i)) {
            int n2;
            if (!((JsonObject)d2).get(TOa.i).isJsonObject()) {
                throw new JsonParseException(new StringBuilder().insert(3 ^ 3, nQa.E).append(((JsonObject)d2).get(TOa.i)).toString());
            }
            if (((JsonObject)(d2 = ((JsonObject)d2).getAsJsonObject(TOa.i))).has(BQa.la)) {
                if (!((JsonObject)d2).get(BQa.la).isJsonObject()) {
                    throw new JsonParseException(new StringBuilder().insert(2 & 5, qQa.t).append(((JsonObject)d2).get(BQa.la)).toString());
                }
                JsonObject jsonObject = ((JsonObject)d2).getAsJsonObject(BQa.la);
                f2 = Maa.J((JsonObject)jsonObject, (String)oQa.R, (float)f2);
                Validate.inclusiveBetween(aSa.V, qta.Ka, f2, mPa.S);
                f3 = Maa.J((JsonObject)jsonObject, (String)PRa.k, (float)f3);
                Validate.inclusiveBetween(aSa.V, qta.Ka, f3, WOa.Ha);
                f4 = Maa.J((JsonObject)jsonObject, (String)pQa.i, (float)f3);
                Validate.inclusiveBetween(aSa.V, qta.Ka, f4, Rua.I);
            }
            int n3 = n2 = uSa.E;
            while (n3 < hra.Ja) {
                JsonElement jsonElement2 = ((JsonObject)d2).get(Integer.toString(n2));
                float f5 = f2;
                float f6 = f3;
                float f7 = f4;
                if (jsonElement2 != null) {
                    JsonObject jsonObject = Maa.J((JsonElement)jsonElement2, (String)(Tpa.q + n2 + XOa.D));
                    f5 = Maa.J((JsonObject)jsonObject, (String)oQa.R, (float)f2);
                    Validate.inclusiveBetween(aSa.V, qta.Ka, f5, Zqa.Y);
                    f6 = Maa.J((JsonObject)jsonObject, (String)PRa.k, (float)f3);
                    Validate.inclusiveBetween(aSa.V, qta.Ka, f6, uOa.m);
                    f7 = Maa.J((JsonObject)jsonObject, (String)pQa.i, (float)f4);
                    Validate.inclusiveBetween(aSa.V, qta.Ka, f7, yQa.D);
                }
                b2[n2] = f5;
                int n4 = n2++;
                a2[n4] = f6;
                fArray[n4] = f7;
                n3 = n2;
            }
        }
        return new JHa(b2, fArray, a2);
    }

    public String J() {
        return BRa.H;
    }
}

