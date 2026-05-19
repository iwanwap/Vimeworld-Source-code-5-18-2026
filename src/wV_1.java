/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kw
 *  NQa
 *  Pw
 *  QV
 *  Rx
 *  gV
 *  hra
 *  lPa
 *  qw
 *  vRa
 *  wV
 */
import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class wV_1<K> {
    public boolean M;
    private final Map<Object, Method> k;
    private static Field j = null;
    private final Map<String, Field> J;
    private final Map<Object, Constructor<K>> A;
    private final Class<K> I;

    public wV_1(Class<K> clazz) {
        wV_1 a2;
        Class<K> b2 = clazz;
        wV_1 wV_12 = a2 = this;
        wV_1 wV_13 = a2;
        a2.J = new HashMap<String, Field>();
        wV_13.k = new HashMap<Object, Method>();
        wV_12.A = new HashMap<Object, Constructor<K>>();
        wV_12.M = uSa.E;
        wV_12.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Object object, String string, Object object2) throws Exception {
        void c2;
        void b2;
        Object d2 = object2;
        wV_1 a2 = this;
        a2.f((String)b2).set(c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    private Class[] J(Object[] objectArray) {
        int n2;
        void a2;
        wV_1 wV_12 = this;
        if (((void)a2).length == 0) {
            return new Class[uSa.E];
        }
        Class[] classArray = new Class[((void)a2).length];
        int n3 = n2 = uSa.E;
        while (n3 < ((void)a2).length) {
            if (a2[n2] == null) {
                classArray[n2] = null;
            } else {
                Class[] classArray2;
                Class<Constable> b2 = a2[n2].getClass();
                if (b2 == Integer.class) {
                    b2 = Integer.TYPE;
                    classArray2 = classArray;
                } else if (b2 == Double.class) {
                    b2 = Double.TYPE;
                    classArray2 = classArray;
                } else if (b2 == Boolean.class) {
                    b2 = Boolean.TYPE;
                    classArray2 = classArray;
                } else if (b2 == Float.class) {
                    b2 = Float.TYPE;
                    classArray2 = classArray;
                } else if (b2 == Long.class) {
                    b2 = Long.TYPE;
                    classArray2 = classArray;
                } else if (b2 == Character.class) {
                    b2 = Character.TYPE;
                    classArray2 = classArray;
                } else if (b2 == Byte.class) {
                    b2 = Byte.TYPE;
                    classArray2 = classArray;
                } else {
                    if (b2 == Short.class) {
                        b2 = Short.TYPE;
                    }
                    classArray2 = classArray;
                }
                classArray2[n2] = b2;
            }
            n3 = ++n2;
        }
        return classArray;
    }

    /*
     * WARNING - void declaration
     */
    public Object J(Object object, String string, Object ... objectArray) throws Throwable {
        void c2;
        void b2;
        Object[] d2 = objectArray;
        Object[] a2 = this;
        return a2.J((String)b2, d2).invoke((Object)c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public Object J(Object object, String string) throws Exception {
        void b2;
        String c2 = string;
        wV_1 a2 = this;
        return a2.f(c2).get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Method J(String string, Object ... objectArray) {
        QV qV;
        void b2;
        void a2;
        Class[] classArray;
        Class[] classArray2 = this;
        Class[] c2 = null;
        if (classArray2.M) {
            classArray = classArray2;
            c2 = classArray2.J((Object[])a2);
            qV = new gV((String)b2, c2);
        } else {
            qV = new QV((String)b2, ((void)a2).length);
            classArray = classArray2;
        }
        Method method = classArray.k.get(qV);
        if (method == null) {
            if (c2 == null) {
                c2 = super.J((Object[])a2);
            }
            if ((method = super.J((String)b2, c2)) == null) {
                throw new Kw(classArray2.I, (String)b2, c2);
            }
            classArray2.k.put(qV, method);
        }
        return method;
    }

    /*
     * WARNING - void declaration
     */
    public Constructor<K> J(Class ... classArray) {
        void a2;
        wV_1 wV_12 = this;
        qw qw2 = new qw((Class[])a2);
        Constructor<Object> constructor = wV_12.A.get(qw2);
        if (constructor == null) {
            Constructor<Object> constructor2;
            block7: {
                int n2;
                Constructor<?>[] constructorArray = wV_12.I.getDeclaredConstructors();
                int n3 = constructorArray.length;
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    block6: {
                        Constructor<?> constructor3 = constructorArray[n2];
                        Class<?>[] classArray2 = constructor3.getParameterTypes();
                        if (classArray2.length == ((void)a2).length) {
                            int n5 = uSa.E;
                            while (n5 < classArray2.length) {
                                int b2;
                                if (a2[b2] == null || classArray2[b2] == a2[b2] || classArray2[b2].isAssignableFrom((Class<?>)a2[b2])) {
                                    n5 = ++b2;
                                    continue;
                                }
                                break block6;
                            }
                            constructor = constructor3;
                            constructor.setAccessible(vRa.d != 0);
                            Constructor<Object> constructor4 = constructor;
                            constructor2 = constructor4;
                            wV_12.A.put(qw2, constructor4);
                            break block7;
                        }
                    }
                    n4 = ++n2;
                }
                constructor2 = constructor;
            }
            if (constructor2 == null) {
                throw new Pw(wV_12.I, (Class[])a2);
            }
        }
        return constructor;
    }

    /*
     * WARNING - void declaration
     */
    public Method f(String string, Class ... classArray) {
        wV_1 wV_12;
        gV gV2;
        void a2;
        void b2;
        wV_1 wV_13 = this;
        if (wV_13.M) {
            gV2 = new gV((String)b2, (Class[])a2);
            wV_12 = wV_13;
        } else {
            gV2 = new QV((String)b2, ((void)a2).length);
            wV_12 = wV_13;
        }
        Object c2 = wV_12.k.get(gV2);
        if (c2 == null) {
            c2 = wV_13.J((String)b2, (Class[])a2);
            if (c2 == null) {
                throw new Kw(wV_13.I, (String)b2, (Class[])a2);
            }
            wV_13.k.put(gV2, (Method)c2);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Object object, String string, Object object2) throws Exception {
        void c2;
        void b2;
        Object d2 = object2;
        wV_1 a2 = this;
        a2.J((String)b2).set(c2, d2);
    }

    public static /* synthetic */ Field J() {
        return j;
    }

    public Constructor<K> J(Object ... objectArray) {
        Object[] b2 = objectArray;
        Object[] a2 = this;
        return a2.J(super.J(b2));
    }

    public K J(Object ... objectArray) throws Exception {
        Object[] b2 = objectArray;
        Object[] a2 = this;
        return (K)((Constructor)a2.J(b2)).newInstance(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Field f(String string) {
        void a2;
        wV_1 wV_12 = this;
        Object b2 = wV_12.J.get(a2);
        if (b2 == null) {
            Object object;
            block5: {
                Class<K> clazz;
                Class<K> clazz2 = clazz = wV_12.I;
                while (clazz2 != null) {
                    try {
                        b2 = clazz.getDeclaredField((String)a2);
                        ((Field)b2).setAccessible(vRa.d != 0);
                        wV_12.J.put((String)a2, (Field)b2);
                        object = b2;
                        break block5;
                    }
                    catch (Exception exception) {
                        clazz2 = clazz.getSuperclass();
                    }
                }
                object = b2;
            }
            if (object == null) {
                throw new lw(wV_12.I, (String)a2);
            }
        }
        return b2;
    }

    public Field J(String string) throws Exception {
        Object b2 = string;
        wV_1 a2 = this;
        Object object = b2 = a2.f((String)b2);
        j.set(object, ((Field)object).getModifiers() & NQa.A);
        return b2;
    }

    public static /* synthetic */ Map J(wV a2) {
        return a2.k;
    }

    static {
        try {
            j = Field.class.getDeclaredField(hra.B);
            j.setAccessible(vRa.d != 0);
        }
        catch (Exception exception) {
            Rx.J((Throwable)exception, (String)lPa.M);
        }
    }

    /*
     * WARNING - void declaration
     */
    private Method J(String string, Class ... classArray) {
        String b2;
        wV_1 wV_12 = this;
        Method method = null;
        b2 = b2.intern();
        Class<K> clazz = wV_12.I;
        do {
            Method method2;
            block6: {
                Method[] methodArray = clazz.getDeclaredMethods();
                int n2 = methodArray.length;
                int n3 = uSa.E;
                while (n3 < n2) {
                    int n4;
                    block5: {
                        void a2;
                        Class<?>[] classArray2;
                        Method method3 = methodArray[n4];
                        if (b2 == method3.getName() && (classArray2 = method3.getParameterTypes()).length == ((void)a2).length) {
                            int n5 = uSa.E;
                            while (n5 < classArray2.length) {
                                int c2;
                                if (a2[c2] == null || classArray2[c2] == a2[c2] || classArray2[c2].isAssignableFrom((Class<?>)a2[c2])) {
                                    n5 = ++c2;
                                    continue;
                                }
                                break block5;
                            }
                            method2 = method3;
                            break block6;
                        }
                    }
                    n3 = ++n4;
                }
                method2 = method;
            }
            if (method2 == null) continue;
            Method method4 = method;
            method4.setAccessible(vRa.d != 0);
            return method4;
        } while ((clazz = clazz.getSuperclass()) != null);
        return method;
    }
}

