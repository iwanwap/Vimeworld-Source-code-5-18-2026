/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  asa
 */
import java.util.ArrayDeque;
import java.util.Queue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Du {
    private final Queue<Long> I;

    public Du() {
        Du a2;
        Du du = a2;
        du.I = new ArrayDeque<Long>();
    }

    public void J() {
        Du a2;
        a2.I.add(a2.J() + asa.fa);
    }

    private long J() {
        Du a2;
        long l = Kpa.J();
        Du du = a2;
        while (!du.I.isEmpty() && a2.I.peek() < l) {
            Du du2 = a2;
            du = du2;
            du2.I.remove();
        }
        return l;
    }

    public int J() {
        Du a2;
        Du du = a2;
        du.J();
        return du.I.size();
    }
}

