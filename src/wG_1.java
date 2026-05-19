/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HG
 *  vRa
 *  wG
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wG_1 {
    private final Map<String, Integer> A;
    private final List<String> I;

    /*
     * WARNING - void declaration
     */
    public Bp J(Bp bp) {
        void a2;
        wG_1 wG_12 = this;
        int b2 = wG_12.J((Bp)a2);
        if (b2 == 0) {
            return null;
        }
        return a2.s.J(wG_12.I.get(b2 - vRa.d));
    }

    public static /* synthetic */ Integer J(wG wG2, String string) {
        wG a2;
        Object b2 = string;
        wG wG3 = a2 = wG2;
        wG3.I.add((String)b2);
        return wG3.A.size();
    }

    public int J(Bp bp) {
        Bp b2 = bp;
        wG_1 a2 = this;
        return a2.A.computeIfAbsent((String)b2.I, uH.J((wG)a2));
    }

    public /* synthetic */ wG_1(HG hG2) {
        wG_1 b2 = hG2;
        wG_1 a2 = this;
        a2();
    }

    private wG_1() {
        wG_1 a2;
        wG_1 wG_12 = a2;
        a2.A = new HashMap<String, Integer>();
        wG_12.I = new ArrayList<String>();
    }
}

