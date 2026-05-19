/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YZ<T> {
    private final ReadWriteLock k;
    private int j;
    private final T[] J;
    private final Class<? extends T> A;
    private int I;

    public T J(T t2) {
        YZ a2;
        YZ<T> b2 = t2;
        YZ yZ = a2 = this;
        yZ.k.writeLock().lock();
        YZ yZ2 = a2;
        yZ.J[yZ2.j] = b2;
        yZ.j = (yZ2.j + vRa.d) % a2.J();
        if (yZ.I < a2.J()) {
            a2.I += vRa.d;
        }
        a2.k.writeLock().unlock();
        return (T)b2;
    }

    public T[] J() {
        int n2;
        YZ yZ;
        YZ yZ2 = yZ = this;
        Object[] objectArray = (Object[])Array.newInstance(yZ2.A, yZ2.I);
        yZ.k.readLock().lock();
        int n3 = n2 = uSa.E;
        while (n3 < yZ.I) {
            YZ yZ3 = yZ;
            int a2 = (yZ3.j - yZ3.I + n2) % yZ.J();
            if (a2 < 0) {
                a2 += yZ.J();
            }
            objectArray[n2++] = yZ.J[a2];
            n3 = n2;
        }
        yZ.k.readLock().unlock();
        return objectArray;
    }

    /*
     * WARNING - void declaration
     */
    public YZ(Class<? extends T> clazz, int n2) {
        void a2;
        YZ b2;
        Class<? extends T> c2 = clazz;
        YZ yZ = b2 = this;
        YZ yZ2 = b2;
        yZ2.k = new ReentrantReadWriteLock();
        yZ.A = c2;
        yZ.J = (Object[])Array.newInstance(c2, (int)a2);
    }

    public int J() {
        YZ a2;
        YZ yZ = a2;
        yZ.k.readLock().lock();
        int n2 = yZ.J.length;
        a2.k.readLock().unlock();
        return n2;
    }
}

