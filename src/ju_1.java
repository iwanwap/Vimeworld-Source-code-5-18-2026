/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  KT
 *  NQa
 *  dS
 *  hTa
 *  vRa
 *  yra
 *  zU
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import org.apache.logging.log4j.Level;

public final class ju_1 {
    private final Map<String, xB> animations;
    public final ResourceLocation location;

    /*
     * WARNING - void declaration
     */
    private void J(JsonObject jsonObject) {
        Map.Entry<String, JsonElement> b2;
        void a2;
        ju_1 ju_12 = this;
        JsonPrimitive jsonPrimitive = a2.getAsJsonPrimitive(Iqa.U);
        if (jsonPrimitive.isNumber() && jsonPrimitive.getAsInt() == vRa.d) {
            Iterator<Map.Entry<String, JsonElement>> iterator;
            Iterator<Map.Entry<String, JsonElement>> iterator2 = iterator = a2.getAsJsonObject(NQa.O).entrySet().iterator();
            while (iterator2.hasNext()) {
                b2 = iterator.next();
                ju_12.animations.put((String)b2.getKey(), new us(b2.getKey(), b2.getValue().getAsJsonObject()));
                iterator2 = iterator;
            }
            return;
        }
        if (jsonPrimitive.isString() && jsonPrimitive.getAsString().equals(UTa.Ja)) {
            Iterator<Map.Entry<String, JsonElement>> iterator;
            Iterator<Map.Entry<String, JsonElement>> iterator3 = iterator = a2.getAsJsonObject(NQa.O).entrySet().iterator();
            while (iterator3.hasNext()) {
                b2 = iterator.next();
                ju_12.animations.put(b2.getKey(), (xB)new dS(b2.getKey(), b2.getValue().getAsJsonObject()));
                iterator3 = iterator;
            }
            return;
        }
        throw new IllegalArgumentException(hTa.J);
    }

    /*
     * WARNING - void declaration
     */
    public xB J(String string, MDModel mDModel) {
        void a2;
        void b2;
        ju_1 ju_12 = this;
        xB c2 = ju_12.animations.get(b2);
        if (c2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, kTa.Ia).append((String)b2).append(yra.F).toString());
        }
        return c2.J((MDModel)a2);
    }

    public Collection<String> J() {
        ju_1 a2;
        return a2.animations.keySet();
    }

    public ju_1(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        ju_1 a2 = this;
        ju_1 ju_12 = a2;
        a2.animations = new HashMap<String, xB>();
        a2.location = b2;
        try {
            a2.J(KT.J((ResourceLocation)b2).getAsJsonObject());
            return;
        }
        catch (Exception exception) {
            zU.L.log(Level.WARN, new StringBuilder().insert(3 >> 2, Bpa.P).append(b2).toString(), (Throwable)exception);
            return;
        }
    }
}

