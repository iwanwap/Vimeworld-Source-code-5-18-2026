/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cla
 *  cja
 *  oJa
 *  tka
 *  uka
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gka_2 {
    private final tka C;
    private uka i;
    private final List<Runnable> M;
    private final ReentrantLock k;
    private oJa j;
    private cja J;
    private boolean A;
    private final Cla I;

    public void J(Runnable runnable) {
        Runnable b2 = runnable;
        gka_2 a2 = this;
        a2.k.lock();
        try {
            gka_2 gka_22 = a2;
            gka_22.M.add(b2);
            if (gka_22.A) {
                b2.run();
            }
            return;
        }
        finally {
            a2.k.unlock();
        }
    }

    public void J(uka uka2) {
        gka_2 b2 = uka2;
        gka_2 a2 = this;
        a2.k.lock();
        try {
            a2.i = b2;
            return;
        }
        finally {
            a2.k.unlock();
        }
    }

    public void J(cja cja2) {
        gka_2 b2 = cja2;
        gka_2 a2 = this;
        a2.J = b2;
    }

    public oJa J() {
        gka_2 a2;
        return a2.j;
    }

    public void J() {
        gka_2 gka_22 = this;
        gka_22.k.lock();
        try {
            if (gka_22.C == tka.REBUILD_CHUNK && gka_22.i != uka.DONE) {
                gka_22.I.J(vRa.d != 0);
            }
            gka_22.A = vRa.d;
            gka_22.i = uka.DONE;
            Iterator<Runnable> a2 = gka_22.M.iterator();
            while (a2.hasNext()) {
                ((Runnable)a2.next()).run();
            }
            return;
        }
        finally {
            gka_22.k.unlock();
        }
    }

    public void J(oJa oJa2) {
        gka_2 b2 = oJa2;
        gka_2 a2 = this;
        a2.j = b2;
    }

    /*
     * WARNING - void declaration
     */
    public gka_2(Cla cla2, tka tka2) {
        void b2;
        gka_2 a2;
        gka_2 c2 = tka2;
        gka_2 gka_22 = a2 = this;
        gka_2 gka_23 = a2;
        a2.k = new ReentrantLock();
        gka_23.M = Lists.newArrayList();
        a2.i = uka.PENDING;
        gka_22.I = b2;
        gka_22.C = c2;
    }

    public Cla J() {
        gka_2 a2;
        return a2.I;
    }

    public tka J() {
        gka_2 a2;
        return a2.C;
    }

    public boolean J() {
        gka_2 a2;
        return a2.A;
    }

    public uka J() {
        gka_2 a2;
        return a2.i;
    }

    public ReentrantLock J() {
        gka_2 a2;
        return a2.k;
    }

    public cja J() {
        gka_2 a2;
        return a2.J;
    }
}

