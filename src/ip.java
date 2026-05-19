/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BN
 *  JB
 *  Pr
 *  QP
 *  Vr
 *  vRa
 *  wI
 *  xO
 *  yQ
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;

public final class ip
implements JB {
    private long F;
    private static final int g = 300;
    private long L;
    private boolean E;
    private final Vr m;
    private boolean C;
    private int i;
    private final int M;
    private boolean k;
    private final List<Runnable> j;
    private boolean J;
    private int[] A;
    private boolean I;

    public static /* synthetic */ int J(ip a2) {
        return a2.M;
    }

    public boolean J(boolean bl) {
        Object object;
        boolean b2 = bl;
        ip a2 = this;
        if (b2 && !a2.E) {
            return uSa.E != 0;
        }
        if (!b2 && !a2.J) {
            return uSa.E != 0;
        }
        if (a2.A != null) {
            int n2;
            object = a2.A;
            int n3 = a2.A.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                if (!Keyboard.isKeyDown(object[n2])) {
                    return uSa.E != 0;
                }
                n4 = ++n2;
            }
        }
        if (a2.k) {
            long l2 = System.currentTimeMillis();
            long l3 = l2 - a2.F;
            a2.F = l2;
            if (l3 > WOa.D) {
                return uSa.E != 0;
            }
        }
        if (a2.i > 0) {
            long l4 = System.currentTimeMillis();
            if (l4 - a2.L < (long)a2.i) {
                return uSa.E != 0;
            }
            a2.L = l4;
        }
        a2.I = b2;
        Iterator<Runnable> iterator = a2.j.iterator();
        Object object2 = iterator;
        object = iterator;
        while (object2.hasNext()) {
            Runnable runnable = (Runnable)object.next();
            object2 = object;
            runnable.run();
        }
        return a2.C;
    }

    public static /* synthetic */ Vr J(ip a2) {
        return a2.m;
    }

    public static /* synthetic */ boolean J(ip a2) {
        return a2.I;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public ip(Vr vr2, int n2, MN mN2) {
        void b22;
        Iterator<BN> c2;
        ip a2;
        MN d2 = mN2;
        ip ip2 = a2 = this;
        a2.C = uSa.E;
        a2.E = vRa.d;
        a2.J = uSa.E;
        a2.k = uSa.E;
        a2.i = uSa.E;
        ip ip3 = a2;
        a2.j = new ArrayList<Runnable>();
        a2.F = nqa.i;
        a2.L = nqa.i;
        ip2.m = c2;
        ip2.M = b22;
        if (d2.hasCancel()) {
            a2.C = d2.getCancel();
        }
        if (d2.hasKeydown()) {
            a2.E = d2.getKeydown();
        }
        if (d2.hasKeyup()) {
            a2.J = d2.getKeyup();
        }
        if (d2.hasDoubleClick()) {
            a2.k = d2.getDoubleClick();
        }
        if (d2.getModifiersCount() > 0) {
            a2.A = new int[d2.getModifiersCount()];
            int n3 = c2 = uSa.E;
            while (n3 < a2.A.length) {
                int n4 = c2++;
                a2.A[n4] = d2.getModifiers(n4);
                n3 = c2;
            }
        }
        if (d2.hasTimeout()) {
            a2.i = d2.getTimeout();
        }
        c2 = d2.getActionsList().iterator();
        while (c2.hasNext()) {
            BN b22 = c2.next();
            switch (xO.I[b22.getKind().ordinal()]) {
                case 1: {
                    a2.j.add((Runnable)new Pr(a2, new wI(b22.getCallback().toByteArray())));
                    break;
                }
                case 2: {
                    a2.j.add(new dr(a2, b22.getUnbind()));
                    break;
                }
                case 3: {
                    a2.j.add((Runnable)new yQ(a2, null));
                    break;
                }
                case 4: {
                    a2.j.add((Runnable)new QP(b22.getElementId2D()));
                    break;
                }
                case 5: {
                    a2.j.add(new rp(b22.getMessage()));
                    break;
                }
            }
        }
        return;
    }
}

