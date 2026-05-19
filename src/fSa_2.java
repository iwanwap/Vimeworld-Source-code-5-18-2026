/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Tua
 *  aSa
 *  fSa
 *  pRa
 *  rTa
 *  vRa
 *  yra
 */
import java.lang.reflect.InvocationTargetException;

public abstract class fSa_2<T extends fSa>
implements D {
    public T J() {
        fSa_2 a2;
        return (T)fSa_2.f((fSa)a2);
    }

    public static fSa J(Class clazz) {
        Class clazz2 = clazz;
        try {
            Class[] classArray = new Class[vRa.d];
            classArray[uSa.E] = fSa_2.class;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new pRa(aSa.V);
            return (fSa_2)clazz2.getConstructor(classArray).newInstance(objectArray);
        }
        catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException a2) {
            a2.printStackTrace();
            return null;
        }
    }

    public abstract int J();

    public abstract double J(int var1);

    /*
     * WARNING - void declaration
     */
    public T l(fSa fSa2) {
        void a2;
        int b2;
        fSa_2 fSa_22 = this;
        T t2 = fSa_22.J();
        int n2 = b2 = uSa.E;
        while (n2 < a2.J()) {
            T t3 = t2;
            ((fSa_2)t3).J(b2, ((fSa_2)t3).J(b2) - a2.J(b2++));
            n2 = b2;
        }
        return t2;
    }

    public String toString() {
        fSa_2 fSa_22 = this;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dqa.X);
        int a2 = uSa.E;
        int n2 = a2;
        while (n2 < fSa_22.J()) {
            if (a2 > 0) {
                stringBuilder.append(yra.t);
            }
            stringBuilder.append(fSa_22.J(a2++));
            n2 = a2;
        }
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder2.append(XOa.D);
        return stringBuilder2.toString();
    }

    public abstract void J(int var1, double var2);

    /*
     * WARNING - void declaration
     */
    public fSa_2(fSa fSa2) {
        void a2;
        int b2;
        fSa_2 fSa_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < a2.J()) {
            int n3 = b2++;
            fSa_22.J(n3, a2.J(n3));
            n2 = b2;
        }
    }

    public static fSa f(fSa a2) {
        switch (a2.J()) {
            case 1: {
                return new pRa(a2);
            }
            case 2: {
                return new Tua(a2);
            }
            case 3: {
                return new rTa(a2);
            }
        }
        return null;
    }

    public fSa_2() {
        fSa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public T J(fSa fSa2) {
        void a2;
        int b2;
        fSa_2 fSa_22 = this;
        T t2 = fSa_22.J();
        int n2 = b2 = uSa.E;
        while (n2 < a2.J()) {
            T t3 = t2;
            ((fSa_2)t3).J(b2, ((fSa_2)t3).J(b2) + a2.J(b2++));
            n2 = b2;
        }
        return t2;
    }
}

