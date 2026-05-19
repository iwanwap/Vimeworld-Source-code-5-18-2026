/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AS
 *  Bu
 *  Gua
 *  JPa
 *  Js
 *  MQa
 *  Oz
 *  WT
 *  XTa
 *  Zta
 *  at
 *  cQa
 *  kta
 *  vQa
 *  vRa
 *  vpa
 *  wPa
 *  zU
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import org.apache.logging.log4j.Level;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dS_2
implements xB {
    private final List<at> bones;
    private float startTime;
    private float duration;
    private final String name;
    private float nextPlay;
    private final boolean loop;

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    public static /* synthetic */ double J(vT a2) {
        return a2.time;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(at at2, WT wT, vT vT2, vT vT3, float f2) {
        void d2;
        void a2;
        void c22;
        Object e22 = vT3;
        at b2 = at2;
        void v0 = c22;
        float c22 = dS_2.J(v0.post.x.J(), e22.pre.x.J(), (float)a2);
        float f3 = dS_2.J(v0.post.y.J(), e22.pre.y.J(), (float)a2);
        float e22 = dS_2.J(v0.post.z.J(), e22.pre.z.J(), (float)a2);
        dS_2.J(b2.renderer, (WT)d2, c22, f3, e22);
    }

    public dS_2(String string, JsonObject jsonObject) {
        Map.Entry<String, JsonElement> a2;
        Iterator<Map.Entry<String, JsonElement>> b2;
        dS_2 dS_22;
        dS_2 dS_23 = dS_22 = this;
        dS_22.startTime = vqa.T;
        dS_23.name = b2;
        dS_23.loop = ((JsonObject)((Object)a2)).has(vpa.Ga) && ((JsonObject)((Object)a2)).getAsJsonPrimitive(vpa.Ga).getAsBoolean() ? vRa.d : uSa.E;
        dS_2 dS_24 = dS_22;
        dS_24.bones = new ArrayList<at>();
        Iterator<Map.Entry<String, JsonElement>> iterator = b2 = ((JsonObject)((Object)a2)).getAsJsonObject(Gua.Ha).entrySet().iterator();
        while (iterator.hasNext()) {
            a2 = b2.next();
            ArrayList<FT> arrayList = new ArrayList<FT>(yRa.d);
            Iterator<Map.Entry<String, JsonElement>> iterator2 = a2.getValue().getAsJsonObject().entrySet().iterator();
            while (iterator2.hasNext()) {
                vT vT2;
                Iterator<Map.Entry<String, JsonElement>> iterator3;
                Object object = iterator3.next();
                FT fT = new FT(WT.valueOf((String)object.getKey().toUpperCase(Locale.US)));
                arrayList.add(fT);
                object = object.getValue();
                if (((JsonElement)object).isJsonObject()) {
                    Object object2 = ((JsonElement)object).getAsJsonObject().entrySet().iterator();
                    while (object2.hasNext()) {
                        FT fT2;
                        Object object3 = (Map.Entry)vT2.next();
                        vT c2 = new vT(null);
                        new vT(null).time = Float.parseFloat((String)object3.getKey());
                        dS_22.duration = Math.max(c2.time, dS_22.duration);
                        if (((JsonElement)(object3 = (JsonElement)object3.getValue())).isJsonObject()) {
                            JsonObject jsonObject2 = ((JsonElement)object3).getAsJsonObject();
                            if (jsonObject2.has(wPa.x) && jsonObject2.get(wPa.x).getAsString().equals(KPa.P)) {
                                c2.lerp = Bu.CATMULLROM;
                            }
                            vT vT3 = c2;
                            JsonObject jsonObject3 = jsonObject2;
                            vT3.post = it.J(jsonObject3.get(lTa.t));
                            vT3.pre = jsonObject3.has(Zta.u) ? it.J(jsonObject2.get(Zta.u)) : c2.post;
                            fT2 = fT;
                        } else {
                            vT vT4 = c2;
                            vT4.pre = vT4.post = it.J((JsonElement)object3);
                            fT2 = fT;
                        }
                        fT2.frames.add(c2);
                        object2 = vT2;
                    }
                    fT.frames.sort(Comparator.comparingDouble(IS.J()));
                    iterator2 = iterator3;
                    continue;
                }
                vT2 = new vT(null);
                new vT(null).pre = new vT(null).post = it.J((JsonElement)object);
                iterator2 = iterator3;
                fT.frames.add(vT2);
            }
            dS_22.bones.add(new at(a2.getKey(), arrayList));
            iterator = b2;
        }
    }

    @Override
    public void J() {
        a.startTime = vqa.T;
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4, float f5, float f6) {
        void a2;
        void d2;
        void b2;
        void c2;
        float f7 = f2;
        float e2 = (c2 - f7) * MQa.L;
        b2 = (b2 - d2) * MQa.L;
        void v0 = a2;
        void var6_6 = v0 * v0;
        void var7_7 = a2 * var6_6;
        return (kta.v * d2 - kta.v * c2 + e2 + b2) * var7_7 + (TOa.p * d2 + vQa.q * c2 - kta.v * e2 - b2) * var6_6 + e2 * a2 + d2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xB J(MDModel mDModel) {
        dS_2 dS_22 = this;
        Iterator<at> iterator = dS_22.bones.iterator();
        block0: while (true) {
            Iterator<at> iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a2;
                dS_2 b2 = iterator.next();
                if (((at)b2).renderer != null) continue block0;
                dS_2 dS_23 = b2;
                ((at)dS_23).renderer = a2.J(((at)dS_23).name);
                if (((at)dS_23).renderer == null) {
                    zU.L.log(Level.WARN, new StringBuilder().insert(3 >> 2, XTa.Ga).append(((at)b2).name).append(tua.Fa).append(dS_22.name).append(cQa.k).append(a2).toString());
                    Iterator<at> iterator3 = iterator;
                    iterator2 = iterator3;
                    iterator3.remove();
                    continue;
                }
                ((at)b2).renderer.J(vRa.d != 0);
                continue block0;
            }
            break;
        }
        return dS_22;
    }

    @Override
    public float J() {
        dS_2 a2;
        return a2.startTime;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Js js2, WT wT, float f2, float f3, float f4) {
        void d2;
        float f5 = f4;
        Js a2 = js2;
        switch (AS.$SwitchMap$net$xtrafrancyz$mods$minidot$items$animation$BBAnimation$Channel[d2.ordinal()]) {
            case 1: {
                void e2;
                void b2;
                void c2;
                Js js3 = a2;
                while (false) {
                }
                js3.rotationPointX = js3.origRotationPointX + c2;
                js3.rotationPointY = js3.origRotationPointY - b2;
                js3.rotationPointZ = js3.origRotationPointZ + e2;
                return;
            }
            case 2: {
                void e2;
                void b2;
                void c2;
                Js js4 = a2;
                js4.rotationX = Bua.ga * c2;
                js4.rotationY = Bua.ga * b2;
                js4.rotationZ = Bua.ga * e2;
                return;
            }
            case 3: {
                void e2;
                void b2;
                void c2;
                Js js5 = a2;
                js5.scaleX = c2;
                js5.scaleY = b2;
                a2.scaleZ = e2;
            }
        }
    }

    @Override
    public void f(float f2) {
        float b2 = f2;
        dS_2 a2 = this;
        a2.startTime = b2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(at at2, WT wT, vT vT2, vT vT3, vT vT4, vT vT5, float f2) {
        void f3;
        float g2;
        void b2;
        void c2;
        void d22;
        void e22;
        float f4 = f2;
        at a2 = at2;
        int n2 = uqa.g;
        if (e22 != d22) {
            ++n2;
        }
        if (c2 != b2) {
            ++n2;
        }
        g2 = (g2 + (float)(e22 != d22 ? vRa.d : uSa.E)) / (float)(n2 - vRa.d);
        float f5 = (float)(n2 - vRa.d) * g2;
        g2 = f5 - (float)Oz.J((float)f5);
        void v1 = e22;
        float e22 = dS_2.J(v1.post.x.J(), d22.post.x.J(), c2.pre.x.J(), b2.pre.x.J(), g2);
        float f6 = dS_2.J(v1.post.y.J(), d22.post.y.J(), c2.pre.y.J(), b2.pre.y.J(), g2);
        float d22 = dS_2.J(v1.post.z.J(), d22.post.z.J(), c2.pre.z.J(), b2.pre.z.J(), g2);
        dS_2.J(a2.renderer, (WT)f3, e22, f6, d22);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3) {
        float c2 = f2;
        dS_2 b2 = this;
        if (b2.nextPlay <= c2) {
            void a2;
            b2.J();
            b2.nextPlay = c2 + (a2 + b2.duration) * eta.e;
        }
        if (!b2.J()) {
            b2.J(c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2) {
        dS_2 dS_22;
        float f3;
        dS_2 dS_23;
        block16: {
            block14: {
                block13: {
                    block15: {
                        void a2;
                        dS_23 = this;
                        a2 /= eta.e;
                        if (dS_23.startTime == vqa.T) {
                            dS_23.startTime = a2;
                        }
                        f3 = a2 - dS_23.startTime;
                        if (!dS_23.loop) break block13;
                        if (!(f3 > dS_23.duration)) break block14;
                        if (!(f3 / dS_23.duration > QTa.G)) break block15;
                        dS_22 = dS_23;
                        dS_23.startTime = a2;
                        f3 = JPa.N;
                        break block16;
                    }
                    float f4 = f3;
                    while (f4 > dS_23.duration) {
                        f4 = f3 - dS_23.duration;
                        dS_23.startTime += dS_23.duration;
                    }
                    break block14;
                }
                if (f3 > dS_23.duration || dS_23.J()) {
                    f3 = dS_23.duration;
                }
            }
            dS_22 = dS_23;
        }
        for (at at2 : dS_22.bones) {
            for (FT fT : at2.channels) {
                int n2;
                block12: {
                    int n3 = uSa.E;
                    int n4 = uSa.E;
                    while (n4 < fT.frames.size()) {
                        vT vT2;
                        int b2;
                        vT vT3 = fT.frames.get(b2);
                        if (vT2.time > f3) {
                            if (b2 == 0) {
                                dS_2.J(at2.renderer, fT.channel, vT3.pre.x.J(), vT3.pre.y.J(), vT3.pre.z.J());
                            } else {
                                vT vT4 = fT.frames.get(b2 - vRa.d);
                                if (vT4.lerp == Bu.CATMULLROM || vT3.lerp == Bu.CATMULLROM) {
                                    vT vT5 = b2 > uqa.g ? fT.frames.get(b2 - uqa.g) : vT4;
                                    vT vT6 = b2 + vRa.d < fT.frames.size() ? fT.frames.get(b2 + vRa.d) : vT3;
                                    float f5 = (f3 - vT4.time) / (vT3.time - vT4.time);
                                    dS_2.J(at2, fT.channel, vT5, vT4, vT3, vT6, f5);
                                } else {
                                    vT vT7 = vT4;
                                    dS_2.J(at2, fT.channel, vT7, vT3, (f3 - vT7.time) / (vT3.time - vT4.time));
                                }
                            }
                            n2 = n3 = vRa.d;
                            break block12;
                        }
                        n4 = ++b2;
                    }
                    n2 = n3;
                }
                if (n2 != 0) continue;
                FT fT2 = fT;
                vT b2 = fT2.frames.get(fT2.frames.size() - vRa.d);
                dS_2.J(at2.renderer, fT.channel, b2.post.x.J(), b2.post.y.J(), b2.post.z.J());
            }
        }
        if (!dS_23.loop && f3 == dS_23.duration) {
            dS_23.startTime = dua.ca;
        }
    }

    @Override
    public Collection<Js> J() {
        dS_2 dS_22 = this;
        ArrayList<Js> arrayList = new ArrayList<Js>(dS_22.bones.size());
        for (at at2 : dS_22.bones) {
            if (at2.renderer == null) continue;
            arrayList.add(at2.renderer);
        }
        return arrayList;
    }

    @Override
    public boolean J() {
        dS_2 a2;
        if (a2.startTime == dua.ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

