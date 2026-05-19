/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  ISa
 *  LJ
 *  RPa
 *  UG
 *  UL
 *  Uk
 *  WK
 *  Ypa
 *  Zpa
 *  aSa
 *  aqa
 *  cK
 *  jpa
 *  kqa
 *  nQa
 *  tJ
 *  vRa
 *  wPa
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentBase;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterInitialize;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterUpdate;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleMorphRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;
import net.xtrafrancyz.mods.texteria.snowstorm.components.motion.BedrockComponentInitialSpeed;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class JJ
implements D {
    public Uk parser;
    public UG texture;
    public List<IComponentParticleRender> particleRender;
    public static final Gson JSON_PARSER;
    private boolean factory;
    public List<IComponentParticleUpdate> particleUpdates;
    public List<IComponentEmitterUpdate> emitterUpdates;
    public List<IComponentParticleInitialize> particleInitializes;
    public UL material;
    public Map<String, cK> curves;
    public List<IComponentEmitterInitialize> emitterInitializes;
    public String identifier;
    public List<tJ> components;
    public static final ResourceLocation DEFAULT_TEXTURE;
    public String textureId;
    public List<IComponentParticleMorphRender> particleMorphRender;
    public Map<String, UG> textures;

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T l(Class<T> clazz, Class clazz2) {
        Object c2 = clazz;
        Object b2 = this;
        if ((c2 = ((JJ)b2).d((Class<T>)c2)) == null) {
            void a2;
            c2 = ((JJ)b2).e((Class<T>)a2);
        }
        return (T)c2;
    }

    public void f() {
        JJ jJ = this;
        jJ.l(BedrockComponentInitialSpeed.class);
        JJ jJ2 = jJ;
        JJ jJ3 = jJ;
        JJ jJ4 = jJ;
        JJ jJ5 = jJ;
        jJ5.emitterInitializes = jJ5.J(IComponentEmitterInitialize.class);
        jJ.emitterUpdates = jJ5.J(IComponentEmitterUpdate.class);
        jJ.particleInitializes = jJ.J(IComponentParticleInitialize.class);
        jJ4.particleUpdates = jJ4.J(IComponentParticleUpdate.class);
        jJ3.particleRender = jJ4.J(IComponentParticleRender.class);
        jJ3.particleMorphRender = jJ2.J(IComponentParticleMorphRender.class);
        Iterator<Map.Entry<String, cK>> a2 = jJ2.curves.entrySet().iterator();
        Iterator<Map.Entry<String, cK>> iterator = a2;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)a2.next();
            ((cK)((Map.Entry)a2.next()).getValue()).j = jJ.parser.I.get(entry.getKey());
            iterator = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T e(Class<T> clazz) {
        JJ jJ = this;
        JJ b2 = null;
        try {
            void a2;
            b2 = (tJ)a2.getConstructor(new Class[uSa.E]).newInstance(new Object[uSa.E]);
            JJ jJ2 = jJ;
            jJ2.components.add((tJ)b2);
            jJ2.f();
        }
        catch (Exception exception) {
            return (T)b2;
        }
        return (T)b2;
    }

    public boolean J() {
        JJ a2;
        return a2.factory;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T f(Class<T> clazz, Class clazz2) {
        void b2;
        JJ a2;
        Class c2 = clazz2;
        JJ jJ = a2 = this;
        jJ.J((Class<T>)b2);
        return jJ.e(c2);
    }

    /*
     * WARNING - void declaration
     */
    public <T extends IComponentBase> List<T> J(Class<T> clazz) {
        JJ jJ = this;
        ArrayList b2 = new ArrayList();
        for (tJ tJ2 : jJ.components) {
            void a2;
            if (!a2.isAssignableFrom(tJ2.getClass())) continue;
            b2.add((IComponentBase)tJ2);
        }
        if (b2.size() > vRa.d) {
            Collections.sort(b2, Comparator.comparingInt(LJ.J()));
        }
        return b2;
    }

    static {
        DEFAULT_TEXTURE = new ResourceLocation(zua.fa, aqa.Q);
        JSON_PARSER = new GsonBuilder().registerTypeAdapter((Type)((Object)JJ.class), new oK()).create();
    }

    public static JJ J(JJ a2) {
        return JJ.J(JJ.J(a2));
    }

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T J(Class<T> clazz, Class clazz2) {
        Object c2 = clazz;
        Object b2 = this;
        if ((c2 = ((JJ)b2).C((Class<T>)c2)) == null) {
            void a2;
            c2 = ((JJ)b2).e((Class<T>)a2);
        }
        return (T)c2;
    }

    public static JsonElement J(JJ a2) {
        return JSON_PARSER.toJsonTree(a2);
    }

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T d(Class<T> clazz) {
        JJ jJ = this;
        for (tJ b2 : jJ.components) {
            void a2;
            if (!a2.equals(b2.getClass())) continue;
            return (T)b2;
        }
        return null;
    }

    public JJ J(boolean bl) {
        boolean b2 = bl;
        JJ a2 = this;
        a2.factory = b2;
        return a2;
    }

    public static JJ J(String a2) {
        return JSON_PARSER.fromJson(a2, JJ.class);
    }

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T C(Class<T> clazz) {
        JJ jJ = this;
        for (tJ b2 : jJ.components) {
            void a2;
            if (!a2.isAssignableFrom(b2.getClass())) continue;
            return (T)b2;
        }
        return null;
    }

    public static JJ J(JsonElement a2) {
        return JSON_PARSER.fromJson(a2, JJ.class);
    }

    public <T extends tJ> T l(Class<T> clazz) {
        Class<T> b2 = clazz;
        JJ a2 = this;
        Object object = b2;
        return a2.J((Class<T>)object, (Class)object);
    }

    public <T extends tJ> T f(Class<T> clazz) {
        Class<T> b2 = clazz;
        JJ a2 = this;
        Object object = b2;
        return a2.l((Class<T>)object, (Class)object);
    }

    /*
     * WARNING - void declaration
     */
    public <T extends tJ> T J(Class<T> clazz) {
        JJ jJ = this;
        Iterator<tJ> b2 = jJ.components.iterator();
        while (b2.hasNext()) {
            void a2;
            tJ tJ2 = (tJ)b2.next();
            if (!a2.isAssignableFrom(tJ2.getClass())) continue;
            b2.remove();
            return (T)tJ2;
        }
        return null;
    }

    public void J() {
        JJ jJ = this;
        for (cK a2 : jJ.curves.values()) {
            if (a2.j == null) continue;
            a2.j.J(a2.J());
        }
    }

    public JJ() {
        JJ a2;
        JJ jJ = a2;
        jJ.identifier = Mqa.y;
        jJ.material = UL.OPAQUE;
        JJ jJ2 = a2;
        jJ.textures = new HashMap<String, UG>();
        jJ.textureId = Pua.Da;
        jJ.curves = new HashMap<String, cK>();
        jJ.components = new ArrayList<tJ>();
        jJ.parser = new Uk();
        jJ.parser.J(new WK(jpa.V, aSa.V));
        jJ.parser.J(new WK(Zpa.J, aSa.V));
        jJ.parser.J(new WK(kqa.j, aSa.V));
        jJ.parser.J(new WK(ySa.X, aSa.V));
        jJ.parser.J(new WK(rpa.s, aSa.V));
        jJ.parser.J(new WK(wPa.o, aSa.V));
        jJ.parser.J(new WK(nQa.Aa, aSa.V));
        jJ.parser.J(new WK(KQa.t, aSa.V));
        jJ.parser.J(new WK(wsa.m, aSa.V));
        jJ.parser.J(new WK(mPa.K, aSa.V));
        jJ.parser.J(new WK(mPa.k, aSa.V));
        jJ.parser.J(new WK(Wqa.C, aSa.V));
        jJ.parser.J(new WK(zpa.I, aSa.V));
        jJ.parser.J(new WK(Mqa.S, aSa.V));
        jJ.parser.J(new WK(FRa.M, aSa.V));
        jJ.parser.J(new WK(Ypa.fa, aSa.V));
        jJ.parser.J(new WK(RPa.m, aSa.V));
        jJ.parser.J(new WK(ISa.J, aSa.V));
        jJ.parser.J(new WK(Jra.F, aSa.V));
        jJ.parser.J(new WK(uSa.M, aSa.V));
        jJ.parser.J(new WK(xSa.w, aSa.V));
    }
}

