/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  OLa
 *  Ula
 *  XJa
 *  rka
 *  tJa
 *  vRa
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class tJa_3
implements D {
    private final Map<String, XJa> mapVariants;
    public static final Gson GSON = new GsonBuilder().registerTypeAdapter((Type)((Object)tJa_3.class), new rka()).registerTypeAdapter((Type)((Object)OLa.class), new Eja()).create();

    public tJa_3(Collection<XJa> collection) {
        Iterator b2 = collection;
        tJa_3 a2 = this;
        a2.mapVariants = Maps.newHashMap();
        Iterator iterator = b2 = b2.iterator();
        while (iterator.hasNext()) {
            XJa xJa2 = (XJa)b2.next();
            iterator = b2;
            a2.mapVariants.put(XJa.J((XJa)xJa2), xJa2);
        }
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 instanceof tJa_3) {
            b2 = (tJa_3)b2;
            return ((tJa_3)a2).mapVariants.equals(((tJa_3)b2).mapVariants);
        }
        return uSa.E != 0;
    }

    public XJa J(String string) {
        Object b2 = string;
        tJa_3 a2 = this;
        if ((b2 = a2.mapVariants.get(b2)) == null) {
            throw new Ula((tJa)a2);
        }
        return b2;
    }

    public tJa_3(List<tJa> list) {
        Iterator b2 = list;
        tJa_3 a2 = this;
        a2.mapVariants = Maps.newHashMap();
        Iterator iterator = b2 = b2.iterator();
        while (iterator.hasNext()) {
            tJa_3 tJa_32 = (tJa_3)b2.next();
            iterator = b2;
            a2.mapVariants.putAll(tJa_32.mapVariants);
        }
    }

    public int hashCode() {
        tJa_3 a2;
        return a2.mapVariants.hashCode();
    }

    public static tJa J(Reader a2) {
        return GSON.fromJson(a2, tJa_3.class);
    }
}

