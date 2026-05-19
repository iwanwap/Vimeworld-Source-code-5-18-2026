/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kqa
 *  QQa
 *  ira
 *  tQa
 *  vRa
 *  yPa
 */
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QQa_3 {
    private final ScheduledExecutorService k;
    private ScheduledFuture<?> j;
    private boolean J;
    private final tQa A;
    private yPa I;

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(QQa qQa2, BiConsumer biConsumer, ira ira2) {
        void a2;
        void b2;
        QQa qQa3 = qQa2;
        if (qQa3.A.f() < nqa.N) {
            return;
        }
        QQa qQa4 = qQa3;
        Object c2 = qQa4.A.f(nqa.N);
        if (qQa4.I != null) {
            qQa3.I.J((ByteBuffer)c2);
        }
        QQa qQa5 = c2;
        byte[] byArray = new byte[qQa5.remaining()];
        c2 = byArray;
        qQa5.get(byArray);
        Object object = c2;
        b2.accept(object, a2.J((byte[])object));
    }

    public boolean J(boolean bl2) {
        boolean b2 = bl2;
        QQa_3 a2 = this;
        if (a2.J == b2) {
            return uSa.E != 0;
        }
        a2.J = b2;
        if (b2) {
            a2.A.C();
        } else {
            a2.A.f();
        }
        return vRa.d != 0;
    }

    public boolean J() {
        QQa_3 a2;
        return a2.J;
    }

    public void f() {
        QQa_3 a2;
        if (a2.j != null) {
            a2.j.cancel(uSa.E != 0);
            a2.j = null;
        }
        QQa_3 qQa_3 = a2;
        qQa_3.J();
        qQa_3.A.J();
    }

    /*
     * WARNING - void declaration
     */
    public QQa_3(tQa tQa2, ScheduledExecutorService scheduledExecutorService) {
        void b2;
        QQa_3 a2;
        ScheduledExecutorService c2 = scheduledExecutorService;
        QQa_3 qQa_3 = a2 = this;
        a2.J = uSa.E;
        qQa_3.k = c2;
        qQa_3.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(BiConsumer<byte[], byte[]> biConsumer) {
        void a2;
        QQa_3 qQa_3;
        QQa_3 qQa_32 = qQa_3 = this;
        qQa_32.J = vRa.d;
        qQa_32.A.l();
        qQa_32.A.C();
        QQa_3 b2 = new ira();
        qQa_32.j = qQa_32.k.scheduleAtFixedRate(Kqa.J((QQa)qQa_3, (BiConsumer)a2, (ira)b2), fta.d, fta.d, TimeUnit.MILLISECONDS);
    }

    public void J() {
        QQa_3 a2;
        if (a2.I == null) {
            return;
        }
        a2.I.close();
        a2.I = null;
    }

    public tQa J() {
        QQa_3 a2;
        return a2.A;
    }

    public void J(yPa yPa2) {
        QQa_3 b2 = yPa2;
        QQa_3 a2 = this;
        a2.I = (yPa)Objects.requireNonNull(b2);
    }
}

