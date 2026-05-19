/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  NQa
 *  NTa
 *  TPa
 *  Tpa
 *  Zpa
 *  cQa
 *  kPa
 *  pua
 *  uOa
 *  vRa
 *  wV
 *  wra
 */
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.Level;
import sun.reflect.ReflectionFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rx_2 {
    private static final Map<String, wV> I = new ConcurrentHashMap<String, wV>();

    /*
     * WARNING - void declaration
     */
    public static void f(Class clazz, String string, Object object) {
        String c22 = string;
        Class b2 = clazz;
        try {
            void a2;
            Rx_2.J(b2).f(null, c22, (Object)a2);
            return;
        }
        catch (Exception c22) {
            Rx_2.f(c22, Zpa.Ja);
            return;
        }
    }

    public static Class<?> J(String a2) {
        try {
            return Class.forName(a2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T> void f(Class<T> clazz, T t2, String string, Object object) {
        Class<T> d22 = t2;
        Class<T> c2 = clazz;
        try {
            void a2;
            void b2;
            Rx_2.J(c2).J(d22, (String)b2, (Object)a2);
            return;
        }
        catch (Exception d22) {
            Rx_2.f(d22, uOa.O);
            return;
        }
    }

    private static <T> wV<T> J(Class<T> clazz) {
        Class<T> clazz2 = clazz;
        wV a2 = I.get(clazz2.getName());
        if (a2 == null) {
            a2 = new wV(clazz2);
            I.put(clazz2.getName(), a2);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static <E> E J(Class clazz, String string, Object ... objectArray) {
        String c22 = string;
        Class b2 = clazz;
        try {
            void a2;
            return (E)Rx_2.J(b2).J(null, c22, (Object[])a2);
        }
        catch (Throwable c22) {
            Rx_2.f(c22, TPa.G);
            return null;
        }
    }

    private static void f(Throwable throwable, String string) {
        String b2 = string;
        Throwable a2 = throwable;
        OT.b.log(Level.ERROR, b2, a2);
    }

    public static <T> boolean J(Class<T> clazz, Class ... classArray) {
        Class<T> a2 = clazz;
        Class[] b2 = classArray;
        if (Rx_2.J(a2, b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static <T> boolean J(Class<T> clazz, String string, Class ... classArray) {
        void b2;
        Class<T> a2 = clazz;
        Class[] c2 = classArray;
        if (Rx_2.J(a2, (String)b2, c2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static <E> E J(Class clazz, String string) {
        String b22 = string;
        Class a2 = clazz;
        try {
            return (E)Rx_2.J(a2).J(null, b22);
        }
        catch (Exception b22) {
            Rx_2.f(b22, NTa.Ha);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T, E> E J(Class<T> clazz, T t2, String string, Object ... objectArray) {
        Class<T> d22 = t2;
        Class<T> c2 = clazz;
        try {
            void a2;
            void b2;
            return (E)Rx_2.J(c2).J(d22, (String)b2, (Object[])a2);
        }
        catch (Throwable d22) {
            Rx_2.f(d22, Tpa.v);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Class clazz, boolean bl) {
        void a2;
        Class clazz2 = clazz;
        wV b2 = Rx_2.J(clazz2);
        if (b2.M != a2) {
            b2.M = a2;
            wV.J(b2).clear();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void f(Object object, String string, Object object2) {
        Object c22 = string;
        Object b2 = object;
        try {
            void a2;
            Rx_2.J(b2.getClass()).J(b2, (String)c22, (Object)a2);
            return;
        }
        catch (Exception c22) {
            Rx_2.f(c22, uOa.O);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Class clazz, String string, Object object) {
        String c22 = string;
        Class b2 = clazz;
        try {
            void a2;
            Rx_2.J(b2).J(null, c22, (Object)a2);
            return;
        }
        catch (Exception c22) {
            Rx_2.f(c22, tSa.p);
            return;
        }
    }

    public static <T> Field f(Class<T> clazz, String string) {
        String b2 = string;
        Class<T> a2 = clazz;
        try {
            return Rx_2.J(a2).J(b2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static <E> E J(Class<E> clazz, Object ... objectArray) {
        Object[] b22 = objectArray;
        Class<E> a2 = clazz;
        try {
            return (E)Rx_2.J(a2).J(b22);
        }
        catch (Exception b22) {
            Rx_2.f(b22, rQa.Ma);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <E> E J(Object object, String string, Object ... objectArray) {
        Object c22 = string;
        Object b2 = object;
        try {
            void a2;
            return (E)Rx_2.J(b2.getClass()).J(b2, (String)c22, (Object[])a2);
        }
        catch (Throwable c22) {
            Rx_2.f(c22, Tpa.v);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T, E> E J(Class<T> clazz, T t2, String string) {
        Class<T> c22 = t2;
        Class<T> b2 = clazz;
        try {
            void a2;
            return (E)Rx_2.J(b2).J(c22, (String)a2);
        }
        catch (Exception c22) {
            Rx_2.f(c22, Tqa.h);
            return null;
        }
    }

    public static /* synthetic */ String f(Class[] a2) {
        return Rx_2.J(a2);
    }

    private Rx_2() {
        Rx_2 a2;
    }

    public static <T> Field J(Class<T> clazz, String string) {
        String b2 = string;
        Class<T> a2 = clazz;
        try {
            return Rx_2.J(a2).f(b2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static /* synthetic */ void J(Throwable throwable, String string) {
        String b2 = string;
        Throwable a2 = throwable;
        Rx_2.f(a2, b2);
    }

    public static MethodHandles.Lookup J() {
        return (MethodHandles.Lookup)Rx_2.J(MethodHandles.Lookup.class, Wqa.p);
    }

    public static <R> R J(Object object, String string) {
        Object b22 = string;
        Object a2 = object;
        try {
            return (R)Rx_2.J(a2.getClass()).J(a2, (String)b22);
        }
        catch (Exception b22) {
            Rx_2.f(b22, Tqa.h);
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static <T extends Enum<?>> T J(Class<T> var0, String var1_1, Object ... var2_2) {
        var3_3 = var0;
        var4_4 = Rx_2.J(var3_3);
        c = null;
        try {
            c = var4_4.J(cQa.R);
            v0 /* !! */  = c;
            ** GOTO lbl18
        }
        catch (lw var5_6) {
            try {
                c = var4_4.J(BPa.T);
                v0 /* !! */  = c;
                ** GOTO lbl18
            }
            catch (lw var6_9) {
                try {
                    block12: {
                        v0 /* !! */  = c;
lbl18:
                        // 3 sources

                        if (v0 /* !! */  == null) {
                            var5_7 = DPa.R;
                            var6_10 = new StringBuilder().insert(2 & 5, CRa.U).append(var3_3.getName().replace((char)Bpa.Ha, (char)uOa.F)).append(rua.Aa).toString();
                            var7_11 = var3_3.getDeclaredFields();
                            var8_12 = var7_11.length;
                            v1 = var9_14 = uSa.E;
                            while (v1 < var8_12) {
                                var10_16 = var7_11[var9_14];
                                if ((var10_16.getModifiers() & var5_7) == var5_7 && var10_16.getType().getName().replace((char)Bpa.Ha, (char)uOa.F).equals(var6_10)) {
                                    c = var10_16;
                                    c.setAccessible((boolean)vRa.d);
                                    v2 = c;
                                    v3 = v2;
                                    wV.J().set(v2, v2.getModifiers() & NQa.A);
                                    break block12;
                                }
                                v1 = ++var9_14;
                            }
                        }
                        v3 = c;
                    }
                    if (v3 == null) {
                        throw new lw(var3_3, cQa.R);
                    }
                    var5_8 = (Enum[])c.get(null);
                    var6_10 = new ArrayList<Enum>(Arrays.asList(var5_8));
                    var7_11 = new Object[((void)a).length + uqa.g];
                    var7_11[uSa.E] = b;
                    var7_11[vRa.d] = var6_10.size();
                    System.arraycopy(a, uSa.E, var7_11, uqa.g, ((void)a).length);
                    var8_13 = ReflectionFactory.getReflectionFactory();
                    var9_15 = (Enum)var8_13.newConstructorAccessor(var4_4.J(var7_11)).newInstance(var7_11);
                    var6_10.add(var9_15);
                    c.set(null, var6_10.toArray((Enum[])Array.newInstance(var3_3, uSa.E)));
                    Rx_2.f(Class.class, var3_3, osa.o, null);
                    Rx_2.f(Class.class, var3_3, kPa.G, null);
                    return (T)var9_15;
                }
                catch (Exception var4_5) {
                    Rx_2.f(var4_5, tTa.ga);
                    return null;
                }
            }
        }
    }

    public static <T> Constructor<T> J(Class<T> clazz, Class ... classArray) {
        Class[] b2 = classArray;
        Class<T> a2 = clazz;
        try {
            return Rx_2.J(a2).J(b2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String J(Class[] classArray) {
        StringBuilder stringBuilder;
        Class[] classArray2 = classArray;
        int n2 = classArray2.length - vRa.d;
        if (n2 == pua.o) {
            return vua.f;
        }
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append((char)wra.P);
        int a2 = uSa.E;
        while (true) {
            stringBuilder2.append(classArray2[a2].getName());
            if (a2 == n2) {
                return stringBuilder.append((char)kra.U).toString();
            }
            StringBuilder stringBuilder3 = stringBuilder;
            ++a2;
            stringBuilder2 = stringBuilder3;
            stringBuilder3.append((char)Yqa.D);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T> void J(Class<T> clazz, T t2, String string, Object object) {
        Class<T> d22 = t2;
        Class<T> c2 = clazz;
        try {
            void a2;
            void b2;
            Rx_2.J(c2).f(d22, (String)b2, (Object)a2);
            return;
        }
        catch (Exception d22) {
            Rx_2.f(d22, uOa.ga);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T> Method J(Class<T> clazz, String string, Class ... classArray) {
        Class[] c2 = classArray;
        Class<T> a2 = clazz;
        try {
            void b2;
            return Rx_2.J(a2).f((String)b2, c2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Object object, String string, Object object2) {
        Object c22 = string;
        Object b2 = object;
        try {
            void a2;
            Rx_2.J(b2.getClass()).f(b2, (String)c22, (Object)a2);
            return;
        }
        catch (Exception c22) {
            Rx_2.f(c22, uOa.ga);
            return;
        }
    }

    public static <T> boolean J(Class<T> clazz, String string) {
        Class<T> a2 = clazz;
        String b2 = string;
        if (Rx_2.J(a2, b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

