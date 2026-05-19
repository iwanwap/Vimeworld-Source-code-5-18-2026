/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  Kpa
 *  RIa
 *  cja
 *  ez
 *  gka
 *  oJa
 *  tka
 *  uka
 *  vL
 *  vQa
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class mja
implements Runnable {
    private final oJa J;
    private final vja A;
    private static final Logger I = LogManager.getLogger();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f(gka gka2) throws InterruptedException {
        tka tka2;
        mja a2;
        mja b2;
        block20: {
            mja mja2;
            b2 = gka2;
            a2 = this;
            b2.J().lock();
            try {
                if (b2.J() != uka.PENDING) {
                    if (!b2.J()) {
                        I.warn(new StringBuilder().insert(3 >> 2, zOa.s).append(b2.J()).append(Gua.l).toString());
                    }
                    return;
                }
                b2.J(uka.COMPILING);
            }
            finally {
                b2.J().unlock();
            }
            vL vL2 = Kpa.J().J();
            mja mja3 = b2;
            if (vL2 == null) {
                mja3.J();
                return;
            }
            mja3.J(a2.J());
            vL vL3 = vL2;
            float f2 = (float)vL3.la;
            vL vL4 = vL2;
            float f3 = (float)vL3.Z + vL4.l();
            float f4 = (float)vL4.A;
            tka2 = b2.J();
            if (tka2 == tka.REBUILD_CHUNK) {
                mja mja4 = b2;
                mja2 = mja4;
                mja4.J().f(f2, f3, f4, (gka)b2);
            } else {
                if (tka2 == tka.RESORT_TRANSPARENCY) {
                    b2.J().J(f2, f3, f4, (gka)b2);
                }
                mja2 = b2;
            }
            mja2.J().lock();
            try {
                if (b2.J() == uka.COMPILING) break block20;
                if (!b2.J()) {
                    I.warn(new StringBuilder().insert(3 >> 2, zOa.s).append(b2.J()).append(Era.d).toString());
                }
                a2.J((gka)b2);
                b2.J().unlock();
                return;
            }
            catch (Throwable throwable) {
                b2.J().unlock();
                throw throwable;
            }
        }
        b2.J(uka.UPLOADING);
        mja mja5 = b2;
        mja5.J().unlock();
        cja cja2 = mja5.J();
        ArrayList<ListenableFuture<Object>> arrayList = Lists.newArrayList();
        if (tka2 == tka.REBUILD_CHUNK) {
            int n2;
            ez[] ezArray = ez.values();
            int n3 = ezArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                ez ez2 = ezArray[n2];
                if (cja2.f(ez2)) {
                    ez ez3 = ez2;
                    arrayList.add(a2.A.J(ez3, b2.J().J(ez3), b2.J(), cja2));
                }
                n4 = ++n2;
            }
        } else if (tka2 == tka.RESORT_TRANSPARENCY) {
            arrayList.add(a2.A.J(ez.TRANSLUCENT, b2.J().J(ez.TRANSLUCENT), b2.J(), cja2));
        }
        ListenableFuture listenableFuture = Futures.allAsList(arrayList);
        b2.J(new dja(a2, listenableFuture));
        Futures.addCallback(listenableFuture, new dla(a2, (gka)b2, cja2));
    }

    private void J(gka gka2) {
        mja b2 = gka2;
        mja a2 = this;
        if (a2.J == null) {
            a2.A.J(b2.J());
        }
    }

    public mja(vja vja2) {
        vja b2 = vja2;
        mja a2 = this;
        a2(b2, null);
    }

    /*
     * WARNING - void declaration
     */
    public mja(vja vja2, oJa oJa2) {
        void b2;
        mja a2;
        mja c2 = oJa2;
        mja mja2 = a2 = this;
        mja2.A = b2;
        mja2.J = c2;
    }

    public static /* synthetic */ Logger J() {
        return I;
    }

    @Override
    public void run() {
        mja mja2 = this;
        try {
            mja mja3 = mja2;
            while (true) {
                mja3.f(mja2.A.J());
                mja3 = mja2;
            }
        }
        catch (InterruptedException a22) {
            I.debug(vQa.A);
            return;
        }
        catch (Throwable a22) {
            RIa a22 = RIa.J((Throwable)a22, (String)nqa.Y);
            Kpa.J().J(Kpa.J().J(a22));
            return;
        }
    }

    private oJa J() throws InterruptedException {
        mja a2;
        if (a2.J != null) {
            return a2.J;
        }
        return a2.A.J();
    }

    public static /* synthetic */ void J(mja mja2, gka gka2) {
        mja b2 = gka2;
        mja a2 = mja2;
        a2.J((gka)b2);
    }
}

