/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Epa
 *  Gua
 *  JPa
 *  JQa
 *  Js
 *  NQa
 *  NTa
 *  Rx
 *  XTa
 *  ZS
 *  dpa
 *  hqa
 *  iPa
 *  ura
 *  vRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.xtrafrancyz.mods.minidot.items.BaseItem;
import org.lwjgl.util.vector.Vector3f;

public final class HS {
    public HS() {
        HS a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(BaseItem baseItem, File file) {
        int n2;
        void a2;
        BaseItem baseItem2 = baseItem;
        a2.getParentFile().mkdirs();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(Iqa.U, yRa.k);
        JsonElement jsonElement = new JsonObject();
        jsonObject.add(iPa.u, jsonElement);
        JsonObject jsonObject2 = jsonElement;
        jsonObject2.addProperty(KSa.T, baseItem2.textureWidth);
        jsonObject2.addProperty(xSa.I, baseItem2.textureHeight);
        jsonElement = new JsonArray();
        jsonObject2.add(Gua.Ha, jsonElement);
        Object b22 = baseItem2.l();
        int n3 = ((Js[])b22).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            HS.J(b22[n2++], (JsonArray)jsonElement);
            n4 = n2;
        }
        try {
            ZS zS2;
            b22 = new StringWriter();
            ZS zS3 = zS2 = new ZS((Writer)b22);
            zS3.setIndent(ura.t);
            Streams.write(jsonObject, (JsonWriter)zS3);
            String string = ((StringWriter)b22).toString();
            OpenOption[] openOptionArray = new OpenOption[uqa.g];
            openOptionArray[uSa.E] = StandardOpenOption.CREATE;
            openOptionArray[vRa.d] = StandardOpenOption.TRUNCATE_EXISTING;
            Files.write(a2.toPath(), string.getBytes(StandardCharsets.UTF_8), openOptionArray);
            return;
        }
        catch (Exception b22) {
            throw new RuntimeException(new StringBuilder().insert(5 >> 3, XTa.r).append(baseItem2).append(Zra.Q).toString(), b22);
        }
    }

    public static void main(String[] a2) throws Exception {
        HS.J(new File(JPa.ba));
        HS.J(new File(EPa.L));
        HS.J(new File(NTa.A));
        HS.J(new File(Jra.l));
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Js js2, JsonArray jsonArray) {
        void a2;
        Iterator iterator;
        Object b2;
        Js js3 = js2;
        JsonObject jsonObject = new JsonObject();
        Js js4 = js3;
        jsonObject.addProperty(dua.T, js4.name);
        if (js4.parent != null) {
            jsonObject.addProperty(hqa.L, js3.parent.name);
        }
        if (js3.rotationPointX != JPa.N || js3.rotationPointY != JPa.N || js3.rotationPointZ != JPa.N) {
            Object object = b2 = new JsonArray();
            ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(js3.rotationPointX)));
            ((JsonArray)b2).add(new JsonPrimitive(Float.valueOf(js3.rotationPointY)));
            ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(js3.rotationPointZ)));
            jsonObject.add(iSa.h, (JsonElement)b2);
        }
        if (js3.origRotationX != JPa.N || js3.origRotationY != JPa.N || js3.origRotationZ != JPa.N) {
            Object object = b2 = new JsonArray();
            ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(js3.origRotationX)));
            ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(js3.origRotationY)));
            ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(js3.origRotationZ)));
            jsonObject.add(NQa.ja, (JsonElement)b2);
        }
        if (js3.mirror) {
            jsonObject.addProperty(JQa.E, vRa.d != 0);
        }
        if (!js3.cubeList.isEmpty()) {
            b2 = new JsonArray();
            Iterator iterator2 = iterator = js3.cubeList.iterator();
            while (iterator2.hasNext()) {
                Object object = (AMa)iterator.next();
                JsonElement jsonElement = new JsonObject();
                ((JsonArray)b2).add(jsonElement);
                JsonArray jsonArray2 = new JsonArray();
                JsonObject jsonObject2 = jsonElement;
                jsonObject2.add(hQa.i, jsonArray2);
                jsonArray2.add(new JsonPrimitive(Float.valueOf(object.C)));
                jsonArray2.add(new JsonPrimitive(Float.valueOf(object.M)));
                jsonArray2.add(new JsonPrimitive(Float.valueOf(object.i)));
                jsonElement = new JsonArray();
                jsonObject2.add(sqa.b, jsonElement);
                JsonElement jsonElement2 = jsonElement;
                AMa aMa = object;
                ((JsonArray)jsonElement2).add(new JsonPrimitive(Float.valueOf(aMa.j - aMa.C)));
                AMa aMa2 = object;
                ((JsonArray)jsonElement2).add(new JsonPrimitive(Float.valueOf(aMa2.J - aMa2.M)));
                AMa aMa3 = object;
                ((JsonArray)jsonElement2).add(new JsonPrimitive(Float.valueOf(aMa3.m - aMa3.i)));
                object = new JsonArray();
                jsonObject2.add(Upa.T, (JsonElement)object);
                iterator2 = iterator;
            }
            jsonObject.add(VPa.r, (JsonElement)b2);
        }
        a2.add(jsonObject);
        if (js3.childModels != null) {
            Object object = b2 = js3.childModels.iterator();
            while (object.hasNext()) {
                iterator = b2.next();
                HS.J((Js)iterator, (JsonArray)a2);
                object = b2;
            }
        }
    }

    public static void J(File file) throws Exception {
        int n2;
        File file2 = file;
        File[] fileArray = file2.listFiles();
        int n3 = fileArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            File file3 = fileArray[n2];
            if (file3.getName().endsWith(Epa.k)) {
                List list;
                Object object;
                JsonArray jsonArray;
                Object a2;
                Object object2;
                JsonElement jsonElement2;
                Map.Entry<String, JsonElement> entry2;
                int n5 = uSa.E;
                JsonObject jsonObject = new JsonParser().parse(new FileReader(file3)).getAsJsonObject();
                Object object3 = null;
                for (Map.Entry<String, JsonElement> entry2 : jsonObject.entrySet()) {
                    if (!entry2.getKey().startsWith(dpa.K)) continue;
                    if (object3 != null) {
                        throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, dua.j).append(file3).toString());
                    }
                    object3 = ((JsonElement)entry2.getValue()).getAsJsonObject();
                }
                Object object4 = new HashMap();
                for (JsonElement jsonElement2 : ((JsonObject)object3).getAsJsonArray(Gua.Ha)) {
                    object2 = jsonElement2.getAsJsonObject();
                    object4.put(((JsonObject)object2).get(dua.T).getAsString(), object2);
                    a2 = ((JsonObject)object2).getAsJsonArray(iSa.h);
                    if (((JsonObject)object2).has(hqa.L) && (jsonArray = ((JsonObject)(object = (JsonObject)object4.get(((JsonObject)object2).get(hqa.L).getAsString()))).getAsJsonArray(iSa.h)) != null) {
                        if (a2 == null) {
                            Object object5 = a2 = new JsonArray();
                            ((JsonArray)a2).add(new JsonPrimitive(Float.valueOf(JPa.N)));
                            ((JsonArray)object5).add(new JsonPrimitive(Float.valueOf(JPa.N)));
                            ((JsonArray)a2).add(new JsonPrimitive(Float.valueOf(JPa.N)));
                        }
                        list = (List)Rx.J((Object)a2, (String)Zra.l);
                        list.set(uSa.E, new JsonPrimitive(Float.valueOf(jsonArray.get(uSa.E).getAsFloat() + ((JsonArray)a2).get(uSa.E).getAsFloat())));
                        list.set(vRa.d, new JsonPrimitive(Float.valueOf(jsonArray.get(vRa.d).getAsFloat() + ((JsonArray)a2).get(vRa.d).getAsFloat())));
                        list.set(uqa.g, new JsonPrimitive(Float.valueOf(jsonArray.get(uqa.g).getAsFloat() + ((JsonArray)a2).get(uqa.g).getAsFloat())));
                    }
                    if (a2 == null) continue;
                    ((JsonObject)object2).add(iSa.h, (JsonElement)a2);
                }
                for (JsonElement jsonElement2 : ((JsonObject)object3).getAsJsonArray(Gua.Ha)) {
                    object2 = jsonElement2.getAsJsonObject();
                    a2 = ((JsonObject)object2).getAsJsonArray(iSa.h);
                    if (a2 == null) continue;
                    object = (List)Rx.J((Object)a2, (String)Zra.l);
                    object.set(vRa.d, new JsonPrimitive(Float.valueOf(-((JsonElement)object.get(vRa.d)).getAsFloat())));
                }
                for (JsonElement jsonElement2 : ((JsonObject)object3).getAsJsonArray(Gua.Ha)) {
                    Object object6;
                    Vector3f vector3f;
                    object2 = jsonElement2.getAsJsonObject();
                    a2 = ((JsonObject)object2).getAsJsonArray(iSa.h);
                    if (a2 != null) {
                        vector3f = new Vector3f(((JsonArray)a2).get(uSa.E).getAsFloat(), ((JsonArray)a2).get(vRa.d).getAsFloat(), ((JsonArray)a2).get(uqa.g).getAsFloat());
                        object = vector3f;
                        object6 = object2;
                    } else {
                        vector3f = new Vector3f(JPa.N, JPa.N, JPa.N);
                        object = vector3f;
                        object6 = object2;
                    }
                    if ((jsonArray = ((JsonObject)object6).getAsJsonArray(VPa.r)) == null) continue;
                    Object object7 = jsonArray.iterator();
                    while (object7.hasNext()) {
                        JsonObject jsonObject2 = ((JsonElement)list.next()).getAsJsonObject();
                        object3 = jsonObject2.getAsJsonArray(hQa.i);
                        object4 = jsonObject2.getAsJsonArray(sqa.b);
                        object3 = (List)Rx.J((Object)object3, (String)Zra.l);
                        object3.set(uSa.E, new JsonPrimitive(Float.valueOf(((JsonElement)object3.get(uSa.E)).getAsFloat() + ((Vector3f)object).x)));
                        object3.set(vRa.d, new JsonPrimitive(Float.valueOf(((Vector3f)object).y - ((JsonElement)object3.get(vRa.d)).getAsFloat() - (float)((JsonArray)object4).get(vRa.d).getAsInt())));
                        object3.set(uqa.g, new JsonPrimitive(Float.valueOf(((JsonElement)object3.get(uqa.g)).getAsFloat() + ((Vector3f)object).z)));
                        object7 = list;
                    }
                }
                if (n5 == 0) {
                    // empty if block
                }
                entry2 = new StringWriter();
                JsonElement jsonElement3 = jsonElement2 = new ZS((Writer)((Object)entry2));
                ((JsonWriter)((Object)jsonElement3)).setIndent(ura.t);
                Streams.write(jsonObject, (JsonWriter)((Object)jsonElement3));
                object2 = ((StringWriter)((Object)entry2)).toString();
                OpenOption[] openOptionArray = new OpenOption[uqa.g];
                openOptionArray[uSa.E] = StandardOpenOption.CREATE;
                openOptionArray[vRa.d] = StandardOpenOption.TRUNCATE_EXISTING;
                Files.write(file3.toPath(), ((String)object2).getBytes(StandardCharsets.UTF_8), openOptionArray);
            }
            n4 = ++n2;
        }
    }
}

