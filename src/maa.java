/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Ppa
 *  RPa
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.Logger;

public final class maa {
    public static Xy J() {
        String string = System.getProperty(JPa.G).toLowerCase();
        if (string.contains(RPa.y)) {
            return Xy.WINDOWS;
        }
        if (string.contains(gua.C)) {
            return Xy.OSX;
        }
        if (string.contains(vua.O)) {
            return Xy.SOLARIS;
        }
        if (string.contains(iSa.O)) {
            return Xy.SOLARIS;
        }
        if (string.contains(lTa.Y)) {
            return Xy.LINUX;
        }
        if (string.contains(WPa.Z)) {
            return Xy.LINUX;
        }
        return Xy.UNKNOWN;
    }

    /*
     * WARNING - void declaration
     */
    public static <V> V J(FutureTask<V> futureTask, Logger logger) {
        void a2;
        FutureTask<V> futureTask2 = futureTask;
        try {
            FutureTask<V> futureTask3 = futureTask2;
            futureTask3.run();
            return futureTask3.get();
        }
        catch (ExecutionException b2) {
            a2.fatal(Ppa.O, (Throwable)b2);
        }
        catch (InterruptedException b2) {
            a2.fatal(Ppa.O, (Throwable)b2);
        }
        return null;
    }

    public maa() {
        maa a2;
    }
}

