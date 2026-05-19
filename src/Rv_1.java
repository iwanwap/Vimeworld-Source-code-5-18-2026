/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  Rv
 *  Zua
 *  bua
 *  dQa
 *  mB
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rv_1
implements Runnable {
    private List<mB> k = Collections.synchronizedList(Lists.newArrayList());
    private volatile boolean j;
    private volatile long J;
    private static final Rv A = new Rv_1();
    private volatile long I;

    private Rv_1() {
        Rv_1 a2;
        Thread thread = new Thread(a2, bua.a);
        thread.setPriority(vRa.d);
        thread.start();
    }

    public void J(mB mB2) {
        Rv_1 b2 = mB2;
        Rv_1 a2 = this;
        if (!a2.k.contains(b2)) {
            Rv_1 rv_1 = a2;
            rv_1.I += dQa.Ga;
            rv_1.k.add((mB)b2);
        }
    }

    public void f() throws InterruptedException {
        Rv_1 a2;
        Rv_1 rv_1 = a2;
        a2.j = vRa.d;
        while (rv_1.I != a2.J) {
            Thread.sleep(MQa.r);
            rv_1 = a2;
        }
        a2.j = uSa.E;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J() {
        int a22;
        Rv_1 rv_1 = this;
        int n2 = a22 = uSa.E;
        while (n2 < rv_1.k.size()) {
            block8: {
                long l2;
                if (!rv_1.k.get(a22).J()) {
                    rv_1.k.remove(a22);
                    --a22;
                    rv_1.J += dQa.Ga;
                }
                try {
                    l2 = rv_1.j ? nqa.i : MQa.r;
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    break block8;
                }
                {
                    Thread.sleep(l2);
                }
            }
            n2 = ++a22;
        }
        if (rv_1.k.isEmpty()) {
            try {
                Thread.sleep(Zua.B);
                return;
            }
            catch (InterruptedException a22) {
                a22.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        Rv_1 a2;
        Rv_1 rv_1 = a2;
        while (true) {
            rv_1.J();
            rv_1 = a2;
        }
    }

    public static Rv J() {
        return A;
    }
}

