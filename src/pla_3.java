/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  MQa
 *  Maa
 *  NPa
 *  Yra
 *  ZRa
 *  bpa
 *  iJa
 *  kta
 *  lqa
 *  pqa
 *  psa
 *  pua
 *  ura
 *  vQa
 *  vRa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import org.lwjgl.util.vector.Vector3f;

public final class pla_3
implements JsonDeserializer<ItemCameraTransforms> {
    /*
     * WARNING - void declaration
     */
    @Override
    public ItemCameraTransforms deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        Object d22 = jsonElement;
        pla_3 c2 = this;
        d22 = ((JsonElement)d22).getAsJsonObject();
        pla_3 pla_32 = c2;
        iJa b2 = pla_32.J((JsonDeserializationContext)a2, (JsonObject)d22, bpa.t);
        iJa iJa2 = pla_32.J((JsonDeserializationContext)a2, (JsonObject)d22, zpa.R);
        iJa iJa3 = pla_32.J((JsonDeserializationContext)a2, (JsonObject)d22, WRa.q);
        iJa iJa4 = pla_32.J((JsonDeserializationContext)a2, (JsonObject)d22, UTa.C);
        iJa iJa5 = pla_32.J((JsonDeserializationContext)a2, (JsonObject)d22, rta.p);
        iJa iJa6 = pla_32.J((JsonDeserializationContext)a2, (JsonObject)d22, Ura.p);
        int n2 = uSa.E;
        if (b2 == iJa.DEFAULT && ((JsonObject)d22).has(psa.m)) {
            n2 = vRa.d;
            b2 = c2.J((JsonDeserializationContext)a2, (JsonObject)d22, psa.m);
            b2.rotation.y += Hra.Ga;
            b2.rotation.z += ISa.a;
            b2.translation.y -= nOa.v;
            b2.translation.z -= NPa.E;
        }
        if (iJa2 == iJa.DEFAULT && ((JsonObject)d22).has(PQa.p)) {
            n2 = vRa.d;
            iJa2 = c2.J((JsonDeserializationContext)a2, (JsonObject)d22, PQa.p);
            iJa2.rotation.y -= ZRa.l;
            iJa2.translation.scale(Yra.i);
            iJa2.translation.translate(POa.Da, WRa.m, POa.Da);
            iJa2.translation.scale(MQa.L);
            iJa2.translation.translate(JPa.N, lqa.ga, vQa.q);
            iJa2.translation.scale(rRa.T);
            iJa2.scale.scale(kta.v);
        }
        if (n2 != 0) {
            if (iJa5 == iJa.DEFAULT) {
                iJa5 = new iJa(new Vector3f(), new Vector3f(), new Vector3f(pqa.r, pqa.r, pqa.r));
            }
            iJa iJa7 = iJa5;
            iJa7.translation.y += Mqa.N;
            iJa7.scale.scale(pua.Ia);
            if (iJa4 == iJa.DEFAULT) {
                iJa4 = new iJa(new Vector3f(), new Vector3f(), new Vector3f(pqa.r, pqa.r, pqa.r));
            }
            iJa iJa8 = iJa4;
            iJa8.rotation.y -= BQa.p;
            iJa8.scale.scale(ySa.Da);
        }
        boolean d22 = Maa.J((JsonObject)d22, (String)ura.Y, uSa.E != 0);
        return new ItemCameraTransforms(b2, iJa2, iJa3, iJa4, iJa5, iJa6, d22);
    }

    public pla_3() {
        pla_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    private iJa J(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        void b2;
        String d2 = string;
        pla_3 a2 = this;
        if (b2.has(d2)) {
            void c2;
            return (iJa)c2.deserialize(b2.get(d2), (Type)((Object)iJa.class));
        }
        return iJa.DEFAULT;
    }
}

