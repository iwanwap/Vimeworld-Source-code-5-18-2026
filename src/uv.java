/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  GW
 *  Gg
 *  Nw
 *  Nx
 *  SW
 *  Waa
 *  ZRa
 *  Zx
 *  gw
 *  iv
 *  jpa
 *  oqa
 *  tx
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uv {
    private static final Logger logger = LogManager.getLogger();
    private static Map<Class<? extends uU>, String> componentClassToNameMap;
    private static Map<String, Class<? extends Nx>> startNameToClassMap;
    private static Map<String, Class<? extends uU>> componentNameToClassMap;
    private static Map<Class<? extends Nx>, String> startClassToNameMap;

    /*
     * WARNING - void declaration
     */
    public static Nx J(Waa waa2, Gg gg2) {
        Waa waa3 = waa2;
        Waa b2 = null;
        try {
            Class<? extends Nx> clazz = startNameToClassMap.get(waa3.J(QTa.O));
            if (clazz != null) {
                b2 = clazz.newInstance();
            }
        }
        catch (Exception exception) {
            logger.warn(new StringBuilder().insert(3 >> 2, Jpa.ja).append(waa3.J(QTa.O)).toString());
            exception.printStackTrace();
        }
        if (b2 != null) {
            void a2;
            Waa waa4 = b2;
            waa4.J((Gg)a2, waa3);
            return waa4;
        }
        logger.warn(new StringBuilder().insert(5 >> 3, Cta.r).append(waa3.J(QTa.O)).toString());
        return b2;
    }

    public static void f(Class<? extends uU> clazz, String string) {
        String b2 = string;
        Class<? extends uU> a2 = clazz;
        componentNameToClassMap.put(b2, a2);
        componentClassToNameMap.put(a2, b2);
    }

    public uv() {
        uv a2;
    }

    public static String J(Nx a2) {
        return startClassToNameMap.get(a2.getClass());
    }

    /*
     * WARNING - void declaration
     */
    public static uU J(Waa waa2, Gg gg2) {
        Waa waa3 = waa2;
        Object b2 = null;
        try {
            Class<? extends uU> clazz = componentNameToClassMap.get(waa3.J(QTa.O));
            if (clazz != null) {
                b2 = clazz.newInstance();
            }
        }
        catch (Exception exception) {
            logger.warn(new StringBuilder().insert(3 & 4, ppa.G).append(waa3.J(QTa.O)).toString());
            exception.printStackTrace();
        }
        if (b2 != null) {
            void a2;
            Waa waa4 = b2;
            waa4.J((Gg)a2, waa3);
            return waa4;
        }
        logger.warn(new StringBuilder().insert(5 >> 3, kra.C).append(waa3.J(QTa.O)).toString());
        return b2;
    }

    private static void J(Class<? extends Nx> clazz, String string) {
        String b2 = string;
        Class<? extends Nx> a2 = clazz;
        startNameToClassMap.put(b2, a2);
        startClassToNameMap.put(a2, b2);
    }

    static {
        startNameToClassMap = Maps.newHashMap();
        startClassToNameMap = Maps.newHashMap();
        componentNameToClassMap = Maps.newHashMap();
        componentClassToNameMap = Maps.newHashMap();
        uv.J(gw.class, oqa.N);
        uv.J(iv.class, jpa.D);
        uv.J(ZU.class, eta.f);
        uv.J(tx.class, zpa.d);
        uv.J(GW.class, ZRa.V);
        uv.J(ix.class, kua.Ka);
        Nw.J();
        pw.J();
        SW.J();
        LV.J();
        Zx.J();
        Tx.J();
    }

    public static String J(uU a2) {
        return componentClassToNameMap.get(a2.getClass());
    }
}

