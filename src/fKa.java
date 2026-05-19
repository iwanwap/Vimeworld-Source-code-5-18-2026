/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aja
 *  D
 *  Dja
 *  FKa
 *  Gka
 *  JPa
 *  Rja
 *  SJa
 *  TQa
 *  Xja
 *  ZRa
 *  hJa
 *  iJa
 *  kJa
 *  pla
 *  uOa
 *  vRa
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fKa
implements D {
    public String name;
    private ItemCameraTransforms cameraTransforms;
    public final Map<String, String> textures;
    private static final Logger LOGGER = LogManager.getLogger();
    public fKa parent;
    private final boolean ambientOcclusion;
    private final boolean gui3d;
    public static final Gson SERIALIZER = new GsonBuilder().registerTypeAdapter((Type)((Object)fKa.class), new Aja()).registerTypeAdapter((Type)((Object)GJa.class), new BKa()).registerTypeAdapter((Type)((Object)Rja.class), new Dja()).registerTypeAdapter((Type)((Object)hJa.class), new Gka()).registerTypeAdapter((Type)((Object)iJa.class), new FKa()).registerTypeAdapter((Type)((Object)ItemCameraTransforms.class), new pla()).create();
    public ResourceLocation parentLocation;
    private final List<GJa> elements;

    private boolean d() {
        fKa a2;
        if (a2.parent != null && !a2.cameraTransforms.isNewFormat) {
            return a2.parent.d();
        }
        return a2.cameraTransforms.isNewFormat;
    }

    public void f(Map<ResourceLocation, fKa> map) {
        Map<ResourceLocation, fKa> b2 = map;
        fKa a2 = this;
        if (a2.parentLocation != null) {
            a2.parent = (fKa)b2.get(a2.parentLocation);
        }
    }

    public static void J(Map<ResourceLocation, fKa> map) {
        Iterator<fKa> iterator;
        Map<ResourceLocation, fKa> map2 = map;
        Iterator<fKa> iterator2 = iterator = map2.values().iterator();
        while (iterator2.hasNext()) {
            Object a22 = iterator.next();
            try {
                Object object = a22 = ((fKa)a22).parent;
                fKa fKa2 = ((fKa)a22).parent;
                while (object != fKa2) {
                    a22 = ((fKa)a22).parent;
                    fKa2 = fKa2.parent.parent;
                    object = a22;
                }
            }
            catch (NullPointerException a22) {
                iterator2 = iterator;
                continue;
            }
            throw new SJa();
        }
    }

    private iJa J(Xja xja2) {
        fKa b2 = xja2;
        fKa a2 = this;
        if (a2.parent != null && !a2.cameraTransforms.J((Xja)b2)) {
            return a2.parent.J((Xja)b2);
        }
        return a2.cameraTransforms.J((Xja)b2);
    }

    /*
     * WARNING - void declaration
     */
    private fKa(ResourceLocation resourceLocation, List<GJa> list, Map<String, String> map, boolean bl, boolean bl2, ItemCameraTransforms itemCameraTransforms) {
        Object g2;
        void f2;
        void d2;
        void b2;
        void c2;
        void e2;
        fKa a2;
        fKa fKa2 = object;
        Object object = itemCameraTransforms;
        fKa fKa3 = a2 = fKa2;
        fKa fKa4 = a2;
        fKa fKa5 = a2;
        a2.name = Mqa.y;
        fKa5.elements = e2;
        fKa5.ambientOcclusion = c2;
        fKa4.gui3d = b2;
        fKa4.textures = d2;
        fKa3.parentLocation = f2;
        fKa3.cameraTransforms = g2;
    }

    public boolean C() {
        fKa a2;
        if (a2.parentLocation == null || a2.parent != null && a2.parent.C()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        fKa a2;
        if (a2.J()) {
            return a2.parent.l();
        }
        return a2.ambientOcclusion;
    }

    public ResourceLocation J() {
        fKa a2;
        return a2.parentLocation;
    }

    /*
     * WARNING - void declaration
     */
    public fKa(ResourceLocation resourceLocation, Map<String, String> map, boolean bl, boolean bl2, ItemCameraTransforms itemCameraTransforms) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        fKa fKa2 = object;
        Object object = itemCameraTransforms;
        fKa a2 = fKa2;
        a2((ResourceLocation)e2, Collections.emptyList(), (Map<String, String>)d2, (boolean)c2, (boolean)b2, (ItemCameraTransforms)f2);
    }

    public static fKa deserialize(String a2) {
        return fKa.deserialize(new StringReader(a2));
    }

    public boolean f() {
        fKa a2;
        return a2.gui3d;
    }

    public String J(String string) {
        Object a2 = this;
        Object b2 = string;
        if (!((fKa)a2).f((String)b2)) {
            b2 = (char)TQa.ca + (String)b2;
        }
        return ((fKa)a2).J((String)b2, new kJa((fKa)a2, null));
    }

    public fKa J() {
        fKa a2;
        if (a2.J()) {
            return a2.parent.J();
        }
        return a2;
    }

    private boolean f(String string) {
        String b2 = string;
        fKa a2 = this;
        if (b2.charAt(uSa.E) == TQa.ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<GJa> J() {
        fKa a2;
        if (a2.J()) {
            return a2.parent.J();
        }
        return a2.elements;
    }

    private boolean J() {
        fKa a2;
        if (a2.parent != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public fKa(List<GJa> list, Map<String, String> map, boolean bl, boolean bl2, ItemCameraTransforms itemCameraTransforms) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        fKa fKa2 = object;
        Object object = itemCameraTransforms;
        fKa a2 = fKa2;
        a2(null, (List<GJa>)e2, (Map<String, String>)d2, (boolean)c2, (boolean)b2, (ItemCameraTransforms)f2);
    }

    public boolean J(String string) {
        Object a2 = this;
        String b2 = string;
        if (!JPa.p.equals(((fKa)a2).J(b2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ItemCameraTransforms J() {
        fKa fKa2;
        fKa fKa3 = fKa2 = this;
        iJa iJa2 = fKa3.J(Xja.THIRD_PERSON);
        iJa iJa3 = fKa3.J(Xja.FIRST_PERSON);
        iJa iJa4 = fKa3.J(Xja.HEAD);
        iJa iJa5 = fKa3.J(Xja.GUI);
        iJa iJa6 = fKa3.J(Xja.GROUND);
        iJa iJa7 = fKa3.J(Xja.FIXED);
        boolean a2 = fKa3.d();
        return new ItemCameraTransforms(iJa2, iJa3, iJa4, iJa5, iJa6, iJa7, a2);
    }

    public static fKa deserialize(Reader a2) {
        return SERIALIZER.fromJson(a2, fKa.class);
    }

    /*
     * WARNING - void declaration
     */
    private String J(String string, kJa kJa2) {
        void b2;
        Object object = this;
        if (((fKa)object).f((String)b2)) {
            void a2;
            if (object == a2.I) {
                LOGGER.warn(new StringBuilder().insert(5 >> 3, ZRa.fa).append((String)b2).append(uOa.ja).append(((fKa)object).name).toString());
                return JPa.p;
            }
            Object c2 = ((fKa)object).textures.get(b2.substring(vRa.d));
            if (c2 == null && ((fKa)object).J()) {
                c2 = ((fKa)object).parent.J((String)b2, (kJa)a2);
            }
            a2.I = object;
            if (c2 != null && ((fKa)object).f((String)c2)) {
                c2 = a2.A.J((String)c2, (kJa)a2);
            }
            if (c2 != null && !((fKa)object).f((String)c2)) {
                return c2;
            }
            return JPa.p;
        }
        return b2;
    }
}

