/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DS
 *  Gt
 *  Gua
 *  JPa
 *  JS
 *  Js
 *  XTa
 *  Zu
 *  cQa
 *  dt
 *  pqa
 *  sG
 *  uOa
 *  vRa
 *  vpa
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
public final class us
implements xB {
    private final String name;
    private float nextPlay;
    private float startTime;
    private float duration;
    private final List<BT> bones;
    private final boolean loop;

    /*
     * WARNING - void declaration
     */
    @Override
    public xB J(MDModel mDModel) {
        us us2 = this;
        Iterator<BT> iterator = us2.bones.iterator();
        block0: while (true) {
            Iterator<BT> iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a2;
                BT b2 = iterator.next();
                if (b2.renderer != null) continue block0;
                Object object = b2;
                ((BT)object).renderer = a2.J(((BT)object).name);
                if (((BT)object).renderer == null) {
                    zU.L.log(Level.WARN, new StringBuilder().insert(3 >> 2, XTa.Ga).append(b2.name).append(tua.Fa).append(us2.name).append(cQa.k).append(a2).toString());
                    Iterator<BT> iterator3 = iterator;
                    iterator2 = iterator3;
                    iterator3.remove();
                    continue;
                }
                b2.renderer.J(vRa.d != 0);
                continue block0;
            }
            break;
        }
        return us2;
    }

    @Override
    public void f(float f2) {
        float b2 = f2;
        us a2 = this;
        a2.startTime = b2;
    }

    public static /* synthetic */ double J(dt a2) {
        return a2.time;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2) {
        us us2;
        float b2;
        us us3;
        block15: {
            block13: {
                block12: {
                    block14: {
                        void a2;
                        us3 = this;
                        a2 /= eta.e;
                        if (us3.startTime == vqa.T) {
                            us3.startTime = a2;
                        }
                        b2 = a2 - us3.startTime;
                        if (!us3.loop) break block12;
                        if (!(b2 > us3.duration)) break block13;
                        if (!(b2 / us3.duration > QTa.G)) break block14;
                        us2 = us3;
                        us3.startTime = a2;
                        b2 = JPa.N;
                        break block15;
                    }
                    float f3 = b2;
                    while (f3 > us3.duration) {
                        f3 = b2 - us3.duration;
                        us3.startTime += us3.duration;
                    }
                    break block13;
                }
                if (us3.J()) {
                    return;
                }
                if (b2 > us3.duration) {
                    b2 = us3.duration;
                }
            }
            us2 = us3;
        }
        for (BT bT2 : us2.bones) {
            for (Gt gt2 : bT2.channels) {
                int n2;
                block11: {
                    int n3 = uSa.E;
                    int n4 = uSa.E;
                    while (n4 < gt2.frames.size()) {
                        dt dt2;
                        int n5;
                        dt dt3 = (dt)gt2.frames.get(n5);
                        if (dt2.time > b2) {
                            if (n5 == 0) {
                                us.J(bT2, gt2.channel, null, dt3, pqa.r);
                            } else {
                                dt dt4;
                                dt dt5 = dt4 = (dt)gt2.frames.get(n5 - vRa.d);
                                us.J(bT2, gt2.channel, dt5, dt3, (b2 - dt5.time) / (dt3.time - dt4.time));
                            }
                            n2 = n3 = vRa.d;
                            break block11;
                        }
                        n4 = ++n5;
                    }
                    n2 = n3;
                }
                if (n2 != 0) continue;
                Gt gt3 = gt2;
                dt dt6 = (dt)gt3.frames.get(gt3.frames.size() - vRa.d);
                us.J(bT2, gt2.channel, dt6, null, JPa.N);
            }
        }
        if (!us3.loop && b2 == us3.duration) {
            us3.startTime = dua.ca;
        }
    }

    @Override
    public void J() {
        a.startTime = vqa.T;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3) {
        float c2 = f2;
        us b2 = this;
        if (b2.nextPlay <= c2) {
            void a2;
            b2.J();
            b2.nextPlay = c2 + (a2 + b2.duration) * eta.e;
        }
        if (!b2.J()) {
            b2.J(c2);
        }
    }

    @Override
    public float J() {
        us a2;
        return a2.startTime;
    }

    @Override
    public boolean J() {
        us a2;
        if (a2.startTime == dua.ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public us(String string, JsonObject jsonObject) {
        Map.Entry<String, JsonElement> a2;
        Iterator<Map.Entry<String, JsonElement>> b2;
        us us2;
        us us3 = us2 = this;
        us2.startTime = vqa.T;
        us3.name = b2;
        us3.loop = ((JsonObject)((Object)a2)).has(vpa.Ga) && ((JsonObject)((Object)a2)).getAsJsonPrimitive(vpa.Ga).getAsBoolean() ? vRa.d : uSa.E;
        us us4 = us2;
        us4.bones = new ArrayList<BT>();
        Iterator<Map.Entry<String, JsonElement>> iterator = b2 = ((JsonObject)((Object)a2)).getAsJsonObject(Gua.Ha).entrySet().iterator();
        while (iterator.hasNext()) {
            a2 = b2.next();
            ArrayList<Gt> arrayList = new ArrayList<Gt>();
            Iterator<Map.Entry<String, JsonElement>> iterator2 = a2.getValue().getAsJsonObject().entrySet().iterator();
            while (iterator2.hasNext()) {
                Iterator<Map.Entry<String, JsonElement>> iterator3;
                Iterator<Map.Entry<String, JsonElement>> c2 = iterator3.next();
                Gt gt2 = new Gt(DS.valueOf((String)((String)c2.getKey()).toUpperCase(Locale.US)));
                Iterator<Map.Entry<String, JsonElement>> iterator4 = c2 = ((JsonElement)c2.getValue()).getAsJsonObject().entrySet().iterator();
                while (iterator4.hasNext()) {
                    Object object = c2.next();
                    dt dt2 = new dt(null);
                    new dt(null).time = Float.parseFloat(object.getKey());
                    us2.duration = Math.max(dt2.time, us2.duration);
                    object = object.getValue().getAsJsonObject();
                    dt dt3 = dt2;
                    Object object2 = object;
                    dt2.x = ((JsonObject)object2).getAsJsonPrimitive(rRa.X).getAsFloat();
                    dt3.y = ((JsonObject)object2).getAsJsonPrimitive(uOa.Ja).getAsFloat();
                    dt3.z = ((JsonObject)object).getAsJsonPrimitive(oua.v).getAsFloat();
                    dt3.easing = sG.I.getOrDefault(((JsonObject)object).getAsJsonPrimitive(nqa.J).getAsString(), rS.J());
                    iterator4 = c2;
                    gt2.frames.add(dt2);
                }
                gt2.frames.sort(Comparator.comparingDouble(Zu.J()));
                iterator2 = iterator3;
                arrayList.add(gt2);
            }
            us2.bones.add(new BT(a2.getKey(), arrayList));
            iterator = b2;
        }
    }

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

    /*
     * WARNING - void declaration
     */
    private static void J(BT bT2, DS dS2, dt dt2, dt dt3, float f2) {
        void d2;
        void c2;
        BT bT3;
        void b2;
        float a2;
        BT bT4 = bT2;
        BT e2 = null;
        if (a2 == pqa.r) {
            bT3 = e2 = b2;
        } else {
            if (a2 == JPa.N) {
                e2 = c2;
            }
            bT3 = e2;
        }
        if (bT3 != null) {
            switch (JS.$SwitchMap$net$xtrafrancyz$mods$minidot$items$animation$BBVimeAnimation$Channel[d2.ordinal()]) {
                case 1: {
                    BT bT5 = bT4;
                    while (false) {
                    }
                    bT5.renderer.rotationPointX = bT4.renderer.origRotationPointX + ((dt)e2).x;
                    bT4.renderer.rotationPointY = bT4.renderer.origRotationPointY - ((dt)e2).y;
                    bT5.renderer.rotationPointZ = bT4.renderer.origRotationPointZ + ((dt)e2).z;
                    return;
                }
                case 2: {
                    BT bT6 = bT4;
                    bT6.renderer.rotationX = Bua.ga * ((dt)e2).x;
                    bT6.renderer.rotationY = Bua.ga * ((dt)e2).y;
                    bT6.renderer.rotationZ = Bua.ga * ((dt)e2).z;
                    return;
                }
                case 3: {
                    BT bT7 = bT4;
                    bT7.renderer.scaleX = ((dt)e2).x;
                    bT7.renderer.scaleY = ((dt)e2).y;
                    bT7.renderer.scaleZ = ((dt)e2).z;
                }
            }
            return;
        }
        a2 = c2.easing.J(a2);
        switch (JS.$SwitchMap$net$xtrafrancyz$mods$minidot$items$animation$BBVimeAnimation$Channel[d2.ordinal()]) {
            case 1: {
                BT bT8 = bT4;
                while (false) {
                }
                bT8.renderer.rotationPointX = bT4.renderer.origRotationPointX + us.J(c2.x, b2.x, a2);
                bT4.renderer.rotationPointY = bT4.renderer.origRotationPointY - us.J(c2.y, b2.y, a2);
                bT8.renderer.rotationPointZ = bT4.renderer.origRotationPointZ + us.J(c2.z, b2.z, a2);
                return;
            }
            case 2: {
                BT bT9 = bT4;
                bT9.renderer.rotationX = Bua.ga * us.J(c2.x, b2.x, a2);
                bT9.renderer.rotationY = Bua.ga * us.J(c2.y, b2.y, a2);
                bT9.renderer.rotationZ = Bua.ga * us.J(c2.z, b2.z, a2);
                return;
            }
            case 3: {
                BT bT10 = bT4;
                bT10.renderer.scaleX = us.J(c2.x, b2.x, a2);
                bT10.renderer.scaleY = us.J(c2.y, b2.y, a2);
                bT10.renderer.scaleZ = us.J(c2.z, b2.z, a2);
            }
        }
    }

    @Override
    public Collection<Js> J() {
        us us2 = this;
        ArrayList<Js> arrayList = new ArrayList<Js>(us2.bones.size());
        for (BT bT2 : us2.bones) {
            if (bT2.renderer == null) continue;
            arrayList.add(bT2.renderer);
        }
        return arrayList;
    }
}

