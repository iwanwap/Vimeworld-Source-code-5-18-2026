/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  C
 *  Cra
 *  D
 *  Gua
 *  Hs
 *  JPa
 *  JQa
 *  Js
 *  KT
 *  Kpa
 *  Ks
 *  Lra
 *  NQa
 *  Oz
 *  Rua
 *  Ssa
 *  URa
 *  Vua
 *  ZR
 *  aJa
 *  bSa
 *  bpa
 *  bs
 *  bt
 *  cT
 *  cra
 *  dT
 *  dpa
 *  du
 *  fTa
 *  hqa
 *  iPa
 *  ju
 *  kpa
 *  nS
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  vRa
 *  vpa
 *  xJa
 *  zU
 */
package net.xtrafrancyz.mods.minidot.items.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel$1;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockModel
implements MDModel {
    private Map<String, Js> boneById;
    private ResourceLocation animationLocation;
    private final List<Js> topLevelBones;
    private du transformGui;
    private js loadState;
    private String defaultAnimationName;
    private es guiAnimation;
    private xB defaultAnimation;
    private final Map<String, xB> animations;
    private final List<Js> dynamicBones;
    private static final Gson DEV_GSON = new GsonBuilder().setPrettyPrinting().create();
    private boolean alpha;
    private du transformOutfit;
    private final ResourceLocation model;
    private Hs hook;
    private ResourceLocation texture;
    private final ModelBase modelBase;

    private void C() {
        BedrockModel bedrockModel = this;
        aJa aJa2 = Kpa.J().J();
        Object a2 = aJa2.J(bedrockModel.texture);
        if (a2 == null) {
            Ks ks2 = new Ks(bedrockModel.texture);
            a2 = ks2;
            aJa2.J(bedrockModel.texture, (H)a2);
            if (ks2.J()) {
                aJa2.J((C)ks2);
            }
        }
        uKa.C((int)a2.J());
    }

    public void J(ResourceLocation resourceLocation) {
        D b2 = resourceLocation;
        BedrockModel a2 = this;
        a2.texture = b2;
    }

    public boolean f() {
        BedrockModel a2;
        if (zU.E && a2.model.f().equals(Cra.V)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l() throws IOException {
        BufferedWriter a22;
        block23: {
            JsonObject jsonObject;
            JsonObject jsonObject2;
            Object object;
            Object object2;
            Path path;
            bt bt2;
            block24: {
                block21: {
                    block22: {
                        Object object3 = this;
                        if (!((BedrockModel)object3).f()) {
                            throw new IOException(new StringBuilder().insert(3 & 4, URa.r).append(((BedrockModel)object3).model).toString());
                        }
                        bt2 = ((BedrockModel)object3).J();
                        String[] stringArray = new String[tTa.h];
                        stringArray[uSa.E] = mSa.d;
                        stringArray[vRa.d] = APa.m;
                        stringArray[uqa.g] = vpa.r;
                        stringArray[yRa.d] = ((BedrockModel)object3).model.f();
                        stringArray[AQa.P] = ((BedrockModel)object3).model.J();
                        path = Paths.get(xTa.O, stringArray);
                        object2 = new InputStreamReader(Files.newInputStream(path, new OpenOption[uSa.E]), StandardCharsets.UTF_8);
                        object = null;
                        try {
                            jsonObject2 = DEV_GSON.fromJson((Reader)object2, JsonObject.class);
                            if (object2 == null) break block21;
                            if (object == null) break block22;
                        }
                        catch (Throwable a22) {
                            try {
                                object = a22;
                                throw object;
                            }
                            catch (Throwable throwable) {
                                Throwable throwable2;
                                if (object2 != null) {
                                    if (object != null) {
                                        try {
                                            ((Reader)object2).close();
                                            throwable2 = throwable;
                                            throw throwable2;
                                        }
                                        catch (Throwable throwable3) {
                                            throwable2 = throwable;
                                            ((Throwable)object).addSuppressed(throwable3);
                                            throw throwable2;
                                        }
                                    }
                                    ((Reader)object2).close();
                                }
                                throwable2 = throwable;
                                throw throwable2;
                            }
                        }
                        try {
                            ((Reader)object2).close();
                            jsonObject = jsonObject2;
                        }
                        catch (Throwable a22) {
                            jsonObject = jsonObject2;
                            ((Throwable)object).addSuppressed(a22);
                        }
                        break block24;
                    }
                    ((Reader)object2).close();
                    jsonObject = jsonObject2;
                    break block24;
                }
                jsonObject = jsonObject2;
            }
            object2 = jsonObject.has(rpa.C) ? jsonObject2.getAsJsonObject(rpa.C) : new JsonObject();
            Object object4 = object = new JsonObject();
            ((JsonObject)object4).add(Gua.x, BedrockModel.J(bt2.translate));
            ((JsonObject)object4).add(Rua.C, BedrockModel.J(bt2.scale));
            ((JsonObject)object4).add(Zqa.n, BedrockModel.J(bt2.rotate));
            ((JsonObject)object2).add(FRa.r, (JsonElement)object);
            jsonObject2.add(rpa.C, (JsonElement)object2);
            a22 = Files.newBufferedWriter(path, StandardCharsets.UTF_8, new OpenOption[uSa.E]);
            Throwable throwable = null;
            try {
                DEV_GSON.toJson((JsonElement)jsonObject2, (Appendable)a22);
                a22.write(System.lineSeparator());
                if (a22 == null) return;
                if (throwable == null) break block23;
            }
            catch (Throwable throwable4) {
                try {
                    throwable = throwable4;
                    throw throwable;
                }
                catch (Throwable throwable5) {
                    Throwable throwable6;
                    if (a22 != null) {
                        if (throwable != null) {
                            try {
                                ((Writer)a22).close();
                                throwable6 = throwable5;
                                throw throwable6;
                            }
                            catch (Throwable throwable7) {
                                throwable6 = throwable5;
                                throwable.addSuppressed(throwable7);
                                throw throwable6;
                            }
                        }
                        ((Writer)a22).close();
                    }
                    throwable6 = throwable5;
                    throw throwable6;
                }
            }
            try {
                ((Writer)a22).close();
                return;
            }
            catch (Throwable throwable8) {
                throwable.addSuppressed(throwable8);
                return;
            }
        }
        ((Writer)a22).close();
    }

    public void f() throws Exception {
        BedrockModel bedrockModel;
        BedrockModel bedrockModel2 = bedrockModel = this;
        bedrockModel2.J(KT.J((ResourceLocation)bedrockModel2.model).getAsJsonObject());
        if (bedrockModel2.animationLocation != null) {
            Iterator a2;
            ju ju2 = new ju(bedrockModel.animationLocation);
            Iterator iterator = a2 = ju2.J().iterator();
            while (iterator.hasNext()) {
                String string = (String)a2.next();
                iterator = a2;
                String string2 = string;
                bedrockModel.animations.put(string2, ju2.J(string2, (MDModel)bedrockModel));
            }
            if (bedrockModel.animations.size() == vRa.d && bedrockModel.defaultAnimationName == null) {
                bedrockModel.defaultAnimationName = bedrockModel.animations.keySet().iterator().next();
            }
            if (bedrockModel.defaultAnimationName != null) {
                bedrockModel.defaultAnimation = bedrockModel.animations.get(bedrockModel.defaultAnimationName);
            }
        }
        if (bedrockModel.hook != null) {
            bedrockModel.hook.J();
        }
        BedrockModel bedrockModel3 = bedrockModel;
        bedrockModel3.dynamicBones.clear();
        for (Js a2 : bedrockModel3.J()) {
            if (!a2.l()) continue;
            bedrockModel.dynamicBones.add(a2);
        }
        bedrockModel.boneById = Collections.emptyMap();
    }

    private static float J(float a2) {
        return (float)Math.round(a2 * Jpa.r) / Jpa.r;
    }

    @Override
    public Js J(String string) {
        String b2 = string;
        BedrockModel a2 = this;
        return a2.boneById.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public BedrockModel(String string, String string2) {
        void b2;
        String c2 = string2;
        BedrockModel a2 = this;
        BedrockModel bedrockModel = a2;
        a2.dynamicBones = new ArrayList<Js>();
        bedrockModel.modelBase = new BedrockModel$1(a2);
        a2.topLevelBones = new ArrayList<Js>();
        a2.boneById = Collections.emptyMap();
        a2.animations = new HashMap<String, xB>();
        a2.guiAnimation = es.SPIN;
        a2.loadState = js.NOT_LOADED;
        a2.model = new ResourceLocation(Cra.V, (String)b2);
        a2.texture = new ResourceLocation(Cra.V, c2);
    }

    public boolean J() {
        BedrockModel a2;
        return a2.alpha;
    }

    public void J() {
        BedrockModel bedrockModel = this;
        if (bedrockModel.loadState == js.NOT_LOADED) {
            return;
        }
        Iterator<cT> a2 = bedrockModel.modelBase.boxList.iterator();
        while (a2.hasNext()) {
            int n2 = ((cT)a2.next()).J();
            if (n2 == 0) continue;
            xJa.J((int)n2, (int)vRa.d);
        }
        BedrockModel bedrockModel2 = bedrockModel;
        BedrockModel bedrockModel3 = bedrockModel;
        bedrockModel.loadState = js.NOT_LOADED;
        bedrockModel.boneById = Collections.emptyMap();
        bedrockModel.topLevelBones.clear();
        bedrockModel3.modelBase.boxList.clear();
        bedrockModel3.animations.clear();
        bedrockModel3.defaultAnimation = null;
        bedrockModel2.transformOutfit = null;
        bedrockModel.transformGui = null;
        bedrockModel2.guiAnimation = es.SPIN;
        if (bedrockModel.hook != null) {
            bedrockModel.hook.f();
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        BedrockModel a2 = this;
        a2.alpha = b2;
    }

    private void J(JsonObject jsonObject) {
        HashMap<Js, Vector3f> hashMap;
        Map.Entry<String, JsonElement> a22;
        BedrockModel bedrockModel = this;
        Object b22 = ((JsonObject)((Object)a22)).get(Iqa.U).getAsString();
        if (!((String)b22).equals(yRa.k) && !((String)b22).equals(UTa.Ja)) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, sOa.T).append(a22).toString());
        }
        if (((JsonObject)((Object)a22)).has(rpa.C)) {
            b22 = ((JsonObject)((Object)a22)).getAsJsonObject(rpa.C);
            if (((JsonObject)b22).has(FRa.r)) {
                BedrockModel bedrockModel2 = bedrockModel;
                bedrockModel2.transformOutfit = new du(((JsonObject)b22).getAsJsonObject(FRa.r));
            }
            if (((JsonObject)b22).has(fTa.d)) {
                bedrockModel.transformGui = new du(((JsonObject)b22).getAsJsonObject(fTa.d));
            }
            if (((JsonObject)b22).has(Vua.q)) {
                hashMap = ((JsonObject)b22).get(Vua.q).getAsString();
                bedrockModel.guiAnimation = es.valueOf(((String)((Object)hashMap)).toUpperCase());
            }
        }
        b22 = null;
        for (Map.Entry<String, JsonElement> a22 : ((JsonObject)((Object)a22)).entrySet()) {
            if (!a22.getKey().startsWith(dpa.K)) continue;
            if (b22 != null) {
                throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, dua.j).append(bedrockModel.model).toString());
            }
            b22 = a22.getValue().getAsJsonObject();
        }
        if (b22 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, Ura.q).append(bedrockModel.model).toString());
        }
        BedrockModel bedrockModel3 = bedrockModel;
        bedrockModel3.boneById = new HashMap<String, Js>();
        bedrockModel3.modelBase.textureWidth = ((JsonObject)b22).get(KSa.T).getAsInt();
        bedrockModel3.modelBase.textureHeight = ((JsonObject)b22).get(xSa.I).getAsInt();
        hashMap = new HashMap<Js, Vector3f>();
        Object object = a22 = ((JsonObject)b22).getAsJsonArray(Gua.Ha).iterator();
        while (object.hasNext()) {
            Object object2;
            Vector3f vector3f;
            Object object3;
            HashMap<Js, Vector3f> hashMap2;
            Vector3f vector3f2;
            b22 = ((JsonElement)a22.next()).getAsJsonObject();
            String string = ((JsonObject)b22).get(dua.T).getAsString();
            Js js2 = new Js(bedrockModel.modelBase, string);
            Object object4 = ((JsonObject)b22).getAsJsonArray(iSa.h);
            if (object4 != null) {
                js2.J(((JsonArray)object4).get(uSa.E).getAsFloat(), -((JsonArray)object4).get(vRa.d).getAsFloat(), ((JsonArray)object4).get(uqa.g).getAsFloat());
                Js js3 = js2;
                vector3f2 = new Vector3f(js3.origRotationPointX, js3.origRotationPointY, js2.origRotationPointZ);
                hashMap2 = hashMap;
            } else {
                vector3f2 = new Vector3f(JPa.N, JPa.N, JPa.N);
                hashMap2 = hashMap;
            }
            hashMap2.put(js2, vector3f2);
            object4 = ((JsonObject)b22).getAsJsonArray(NQa.ja);
            if (object4 != null) {
                Js js4 = js2;
                JsonArray jsonArray = object4;
                js2.origRotationX = jsonArray.get(uSa.E).getAsFloat() / Hra.Ga * pua.j;
                js4.origRotationY = jsonArray.get(vRa.d).getAsFloat() / Hra.Ga * pua.j;
                js4.origRotationZ = ((JsonArray)object4).get(uqa.g).getAsFloat() / Hra.Ga * pua.j;
            }
            if (((JsonObject)b22).has(hqa.L)) {
                object4 = ((JsonObject)b22).get(hqa.L).getAsString();
                object3 = bedrockModel.boneById.get(object4);
                if (object3 == null) {
                    throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, bSa.t).append((String)object4).append(Gua.k).append(string).append(bpa.Ga).append(bedrockModel.model).toString());
                }
                vector3f = (Vector3f)hashMap.get(object3);
                object2 = b22;
                Js js5 = js2;
                Js js6 = js2;
                js5.J(js5.origRotationPointX - vector3f.x, js6.origRotationPointY - vector3f.y, js2.origRotationPointZ - vector3f.z);
                object3.J((cT)js6);
            } else {
                bedrockModel.topLevelBones.add(js2);
                object2 = b22;
            }
            int n2 = ((JsonObject)object2).has(JQa.E) && ((JsonObject)b22).get(JQa.E).getAsBoolean() ? vRa.d : uSa.E;
            object3 = ((JsonObject)b22).getAsJsonArray(VPa.r);
            if (object3 != null) {
                Object object5 = ((JsonArray)object3).iterator();
                while (object5.hasNext()) {
                    b22 = ((JsonElement)vector3f.next()).getAsJsonObject();
                    object3 = ((JsonObject)b22).getAsJsonArray(hQa.i);
                    JsonArray jsonArray = ((JsonObject)b22).getAsJsonArray(sqa.b);
                    JsonArray jsonArray2 = ((JsonObject)b22).getAsJsonArray(Upa.T);
                    float f2 = ((JsonObject)b22).has(UOa.H) ? ((JsonObject)b22).get(UOa.H).getAsFloat() : JPa.N;
                    int n3 = ((JsonObject)b22).has(JQa.E) ? (int)(((JsonObject)b22).get(JQa.E).getAsBoolean() ? 1 : 0) : n2;
                    object5 = vector3f;
                    int b22 = jsonArray.get(vRa.d).getAsInt();
                    js2.cubeList.add(new AMa((cT)js2, jsonArray2.get(uSa.E).getAsInt(), jsonArray2.get(vRa.d).getAsInt(), ((JsonArray)object3).get(uSa.E).getAsFloat() - vector3f2.x, -(((JsonArray)object3).get(vRa.d).getAsFloat() + (float)b22) - vector3f2.y, ((JsonArray)object3).get(uqa.g).getAsFloat() - vector3f2.z, jsonArray.get(uSa.E).getAsInt(), b22, jsonArray.get(uqa.g).getAsInt(), f2, n3 != 0));
                }
            }
            bedrockModel.boneById.put(string, js2);
            object = a22;
        }
    }

    public Map<String, xB> J() {
        BedrockModel a2;
        return a2.animations;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void J(dT dT2) {
        BedrockModel bedrockModel;
        Object object;
        BedrockModel a2;
        BedrockModel b2;
        block21: {
            b2 = dT2;
            a2 = this;
            switch (bs.$SwitchMap$net$xtrafrancyz$mods$minidot$items$impl$BedrockModel$LoadState[a2.loadState.ordinal()]) {
                case 1: {
                    try {
                        a2.f();
                        a2.loadState = js.LOADED;
                        break;
                    }
                    catch (Exception exception) {
                        a2.loadState = js.FAILED;
                        zU.L.error(new StringBuilder().insert(3 >> 2, Gta.e).append(a2.model).toString(), (Throwable)exception);
                        return;
                    }
                }
                case 2: {
                    return;
                }
            }
            St.INSTANCE.context = b2;
            object = null;
            if (!a2.animations.isEmpty()) {
                BedrockModel bedrockModel2 = b2;
                ZR.entity = ((dT)bedrockModel2).player;
                object = a2.J((dT)bedrockModel2);
                ZR.animationController = object;
            }
            switch (bs.$SwitchMap$net$xtrafrancyz$mods$minidot$items$RenderContext$View[((dT)b2).view.ordinal()]) {
                case 1: {
                    if (a2.transformOutfit == null) break;
                    BedrockModel bedrockModel = a2;
                    bedrockModel = bedrockModel;
                    bedrockModel3.transformOutfit.J();
                    break block21;
                }
                case 2: {
                    BedrockModel bedrockModel4;
                    switch (bs.$SwitchMap$net$xtrafrancyz$mods$minidot$items$impl$BedrockModel$GuiAnimation[a2.guiAnimation.ordinal()]) {
                        case 1: {
                            uKa.J((float)(-((dT)b2).time * Ssa.la), (float)JPa.N, (float)psa.N, (float)JPa.N);
                            bedrockModel4 = a2;
                            break;
                        }
                        case 2: {
                            uKa.l((float)ATa.r, (float)ATa.r, (float)ATa.r);
                            uKa.J((float)(Hra.Ga + Oz.d((float)(((dT)b2).time * cra.S + (float)((dT)b2).numberInList)) * eta.e), (float)JPa.N, (float)psa.N, (float)JPa.N);
                            uKa.J((float)JPa.N, (float)Qra.j, (float)bpa.K);
                        }
                        default: {
                            bedrockModel4 = a2;
                        }
                    }
                    if (bedrockModel4.transformGui == null) break;
                    a2.transformGui.J();
                }
            }
            bedrockModel = a2;
        }
        bedrockModel.C();
        if (a2.hook != null) {
            a2.hook.f((dT)b2);
        }
        if (object != null) {
            a2.J((dT)b2).f(((dT)b2).time);
        }
        if (a2.alpha) {
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            uKa.c();
            uKa.J(uSa.E != 0);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        }
        object = a2.topLevelBones.iterator();
        Iterator<Object> iterator = object;
        while (iterator.hasNext()) {
            ((cT)object.next()).C(rRa.T);
            iterator = object;
        }
        if (a2.alpha) {
            uKa.J(vRa.d != 0);
            uKa.K();
            uKa.k();
        }
        if (a2.hook != null) {
            a2.hook.J((dT)b2);
        }
        St.INSTANCE.context = null;
    }

    public xB J() {
        BedrockModel a2;
        return a2.defaultAnimation;
    }

    public List<Js> J() {
        BedrockModel a2;
        return a2.modelBase.boxList;
    }

    private du J() {
        BedrockModel a2;
        if (a2.transformOutfit == null) {
            BedrockModel bedrockModel = a2;
            bedrockModel.transformOutfit = new du();
        }
        return a2.transformOutfit;
    }

    public void f(String string) {
        String b2 = string;
        BedrockModel a2 = this;
        a2.defaultAnimationName = b2;
    }

    public String toString() {
        BedrockModel a2;
        return new StringBuilder().insert(3 & 4, iPa.Ja).append(a2.model).append(Iqa.f).toString();
    }

    /*
     * WARNING - void declaration
     */
    public nS J(dT dT2) {
        void a2;
        BedrockModel bedrockModel = this;
        BedrockModel b2 = a2.pi.J.get(bedrockModel);
        if (b2 == null) {
            BedrockModel bedrockModel2 = bedrockModel;
            BedrockModel bedrockModel3 = bedrockModel;
            b2 = new nS(bedrockModel3.dynamicBones, bedrockModel.animations);
            a2.pi.J.put(bedrockModel3, (nS)b2);
            if (bedrockModel.defaultAnimation != null) {
                b2.J(bedrockModel.defaultAnimation);
            }
        }
        return b2;
    }

    public void J(String string) {
        BedrockModel a2;
        String b2 = string;
        BedrockModel bedrockModel = a2 = this;
        bedrockModel.animationLocation = new ResourceLocation(Cra.V, b2);
    }

    public void J(Hs hs) {
        BedrockModel b2 = hs;
        BedrockModel a2 = this;
        a2.hook = b2;
        ((Hs)b2).model = a2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(String string, int n2, float f2) {
        int n3;
        du du2;
        block10: {
            String d2 = string;
            BedrockModel c2 = this;
            du2 = c2.J();
            int n4 = pua.o;
            switch (d2.hashCode()) {
                case 1052832078: {
                    if (!d2.equals(Gua.x)) break;
                    n3 = n4 = uSa.E;
                    break block10;
                }
                case 109250890: {
                    if (!d2.equals(Rua.C)) break;
                    n3 = n4 = vRa.d;
                    break block10;
                }
                case -925180581: {
                    if (!d2.equals(Zqa.n)) break;
                    n4 = uqa.g;
                }
            }
            n3 = n4;
        }
        switch (n3) {
            case 0: {
                void a2;
                void b2;
                du du3 = du2;
                du3.translate = du3.J(du3.translate, (int)b2, (float)a2, JPa.N);
                return;
            }
            case 1: {
                void a2;
                void b2;
                du du4 = du2;
                du4.scale = du4.J(du4.scale, (int)b2, (float)a2, pqa.r);
                return;
            }
            case 2: {
                void a2;
                void b2;
                du du5 = du2;
                du5.rotate = du5.J(du5.rotate, (int)b2, (float)a2, JPa.N);
                return;
            }
        }
    }

    public ResourceLocation J() {
        BedrockModel a2;
        return a2.texture;
    }

    private static JsonArray J(float[] fArray) {
        int a2;
        float[] fArray2 = fArray;
        JsonArray jsonArray = new JsonArray();
        float[] fArray3 = fArray2;
        int n2 = fArray2.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            float f2 = fArray3[a2];
            jsonArray.add(new JsonPrimitive(Float.valueOf(BedrockModel.J(f2))));
            n3 = ++a2;
        }
        return jsonArray;
    }

    public bt J() {
        BedrockModel a2;
        return a2.J().J();
    }
}

