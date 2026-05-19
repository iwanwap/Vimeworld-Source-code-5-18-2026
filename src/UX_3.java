/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  ERa
 *  ISa
 *  Kb
 *  OCa
 *  Tz
 *  Zta
 *  aX
 *  bFa
 *  dQa
 *  gY
 *  kpa
 *  ld
 *  oAa
 *  vRa
 *  vpa
 *  wPa
 *  xz
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UX_3
extends Laa {
    private boolean M;
    private final OCa k;
    private final File j;
    private int J;
    private final Set<aX> A;
    private static final Logger I = LogManager.getLogger();

    /*
     * WARNING - void declaration
     */
    public void f(bFa bFa2) {
        void a2;
        UX_3 uX_3;
        UX_3 uX_32 = uX_3 = this;
        int b2 = uX_32.k.J();
        HashMap<aX, Integer> hashMap = Maps.newHashMap();
        if (uX_32.M || b2 - uX_3.J > vpa.Ja) {
            uX_3.J = b2;
            Iterator<aX> iterator = b2 = uX_3.J().iterator();
            while (iterator.hasNext()) {
                aX aX2 = b2.next();
                iterator = b2;
                aX aX3 = aX2;
                hashMap.put(aX3, uX_3.J(aX3));
            }
        }
        a2.I.J((KC)new oAa(hashMap));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Sx sx2, aX aX2, int n2) {
        void a2;
        void c2;
        UX_3 d2 = aX2;
        UX_3 b2 = this;
        int n3 = d2.J() ? b2.J((aX)d2) : uSa.E;
        UX_3 uX_3 = b2;
        super.f((Sx)c2, (aX)d2, (int)a2);
        UX_3 uX_32 = d2;
        uX_3.A.add((aX)uX_32);
        if (uX_32.J() && n3 == 0 && a2 > 0) {
            b2.M = vRa.d;
            if (b2.k.h()) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = c2.J();
                objectArray[vRa.d] = d2.J();
                b2.k.J().J((ld)new CZ(pta.C, objectArray));
            }
        }
        if (d2.J() && n3 > 0 && a2 == false) {
            b2.M = vRa.d;
            if (b2.k.h()) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = c2.J();
                objectArray[vRa.d] = d2.J();
                b2.k.J().J((ld)new CZ(Zqa.k, objectArray));
            }
        }
    }

    public void l() {
        Object a2;
        UX_3 uX_3 = this;
        Object object = a2 = uX_3.I.keySet().iterator();
        while (object.hasNext()) {
            aX aX2 = (aX)a2.next();
            object = a2;
            uX_3.A.add(aX2);
        }
    }

    public Set<aX> J() {
        UX_3 uX_3;
        UX_3 uX_32 = uX_3 = this;
        HashSet<aX> a2 = Sets.newHashSet(uX_32.A);
        uX_32.A.clear();
        uX_32.M = uSa.E;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public UX_3(OCa oCa2, File file) {
        void b2;
        UX_3 a2;
        File c2 = file;
        UX_3 uX_3 = a2 = this;
        a2.A = Sets.newHashSet();
        a2.J = oQa.B;
        a2.M = uSa.E;
        uX_3.k = b2;
        uX_3.j = c2;
    }

    public Map<aX, xz> J(String string) {
        Iterator<Map.Entry<String, JsonElement>> b2 = string;
        UX_3 a2 = this;
        if (!((JsonElement)((Object)(b2 = new JsonParser().parse((String)((Object)b2))))).isJsonObject()) {
            return Maps.newHashMap();
        }
        b2 = ((JsonElement)((Object)b2)).getAsJsonObject();
        HashMap<aX, xz> hashMap = Maps.newHashMap();
        for (Map.Entry<String, JsonElement> entry : ((JsonObject)((Object)b2)).entrySet()) {
            aX aX2 = Tz.J((String)entry.getKey());
            if (aX2 != null) {
                HashMap<aX, xz> hashMap2;
                xz xz2;
                block10: {
                    xz2 = new xz();
                    if (entry.getValue().isJsonPrimitive() && entry.getValue().getAsJsonPrimitive().isNumber()) {
                        xz2.J(entry.getValue().getAsInt());
                        hashMap2 = hashMap;
                    } else {
                        if (entry.getValue().isJsonObject()) {
                            JsonObject jsonObject = entry.getValue().getAsJsonObject();
                            if (jsonObject.has(wPa.O) && jsonObject.get(wPa.O).isJsonPrimitive() && jsonObject.get(wPa.O).getAsJsonPrimitive().isNumber()) {
                                xz2.J(jsonObject.getAsJsonPrimitive(wPa.O).getAsInt());
                            }
                            if (jsonObject.has(ERa.F) && aX2.J() != null) {
                                try {
                                    Kb kb2;
                                    Constructor constructor = aX2.J().getConstructor(new Class[uSa.E]);
                                    Kb kb3 = kb2 = (Kb)constructor.newInstance(new Object[uSa.E]);
                                    kb3.J(jsonObject.get(ERa.F));
                                    xz2.J(kb3);
                                    hashMap2 = hashMap;
                                    break block10;
                                }
                                catch (Throwable throwable) {
                                    I.warn(new StringBuilder().insert(2 & 5, Zta.X).append(a2.j).toString(), throwable);
                                }
                            }
                        }
                        hashMap2 = hashMap;
                    }
                }
                hashMap2.put(aX2, xz2);
                continue;
            }
            I.warn(new StringBuilder().insert(5 >> 3, KPa.Ja).append(a2.j).append(gsa.L).append(entry.getKey()).append(IPa.e).toString());
        }
        return hashMap;
    }

    public void f() {
        UX_3 uX_3 = this;
        try {
            UX_3 uX_32 = uX_3;
            FileUtils.writeStringToFile(uX_32.j, UX_3.J((Map<aX, xz>)((Object)uX_32.I)));
            return;
        }
        catch (IOException a2) {
            I.error(kpa.c, (Throwable)a2);
            return;
        }
    }

    public void J() {
        UX_3 uX_3 = this;
        if (uX_3.j.isFile()) {
            try {
                UX_3 uX_32 = uX_3;
                uX_32.I.clear();
                UX_3 uX_33 = uX_3;
                uX_32.I.putAll(uX_33.J(FileUtils.readFileToString(uX_33.j)));
                return;
            }
            catch (IOException a2) {
                I.error(new StringBuilder().insert(3 & 4, ISa.y).append(uX_3.j).toString(), (Throwable)a2);
                return;
            }
            catch (JsonParseException a2) {
                I.error(new StringBuilder().insert(2 & 5, dQa.Z).append(uX_3.j).toString(), (Throwable)a2);
            }
        }
    }

    public static String J(Map<aX, xz> map) {
        Map<aX, xz> map2 = map;
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<aX, xz> a2 : map2.entrySet()) {
            if (a2.getValue().J() != null) {
                JsonObject jsonObject2;
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty(wPa.O, ((xz)a2.getValue()).J());
                try {
                    jsonObject3.add(ERa.F, ((xz)a2.getValue()).J().J());
                    jsonObject2 = jsonObject;
                }
                catch (Throwable throwable) {
                    I.warn(new StringBuilder().insert(3 >> 2, lTa.Q).append(((aX)a2.getKey()).f()).append(CRa.R).toString(), throwable);
                    jsonObject2 = jsonObject;
                }
                jsonObject2.add(((aX)a2.getKey()).statId, jsonObject3);
                continue;
            }
            jsonObject.addProperty(((aX)a2.getKey()).statId, ((xz)a2.getValue()).J());
        }
        return jsonObject.toString();
    }

    public boolean J() {
        UX_3 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(bFa bFa2) {
        void a2;
        UX_3 uX_3 = this;
        HashMap<gY, Integer> hashMap = Maps.newHashMap();
        for (gY b2 : mY.m) {
            if (!uX_3.f(b2)) continue;
            gY gY2 = b2;
            hashMap.put(gY2, uX_3.J((aX)gY2));
            uX_3.A.remove(b2);
        }
        a2.I.J((KC)new oAa(hashMap));
    }
}

