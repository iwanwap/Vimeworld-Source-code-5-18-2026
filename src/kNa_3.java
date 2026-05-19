/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Boa
 *  Coa
 *  Jma
 *  XTa
 *  Yna
 *  ima
 *  kNa
 *  pua
 *  vRa
 *  wC
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kNa_3 {
    private static final PB E;
    private int m;
    private int C;
    public static final PB i;
    private final KB M;
    private static final PB k;
    private final List<Yna> j;
    private static final PB J;
    private static final PB A;
    private wC I;

    public List<PB> J() {
        int a2;
        kNa_3 kNa_32 = this;
        ArrayList<PB> arrayList = Lists.newArrayList();
        int n2 = a2 = uSa.E;
        while (n2 <= Yqa.i) {
            arrayList.add(kNa_32.J(a2++));
            n2 = a2;
        }
        return arrayList;
    }

    public Yna J() {
        kNa_3 a2;
        return new Yna(a2.I, a2.J(), a2.C);
    }

    public int J() {
        kNa_3 a2;
        return a2.C;
    }

    public void J(wC wC2) {
        kNa_3 b2 = wC2;
        kNa_3 a2 = this;
        a2.j.add(a2.J());
        kNa_3 kNa_32 = a2;
        kNa_32.I = b2;
        kNa_32.C = pua.o;
        kNa_32.m = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public PB J(int n2) {
        void a2;
        kNa_3 kNa_32 = this;
        void b2 = a2 + kNa_32.m * uua.p;
        if (kNa_32.m > 0 && a2 == false) {
            return k;
        }
        if (a2 == XTa.W) {
            if (b2 < kNa_32.I.J().size()) {
                return E;
            }
            return J;
        }
        if (a2 == Yqa.i) {
            return A;
        }
        if (b2 >= 0 && b2 < kNa_32.I.J().size()) {
            return Objects.firstNonNull(kNa_32.I.J().get((int)b2), i);
        }
        return i;
    }

    public wC J() {
        kNa_3 a2;
        return a2.I;
    }

    public static /* synthetic */ int J(kNa kNa2, int n2) {
        int b2 = n2;
        kNa a2 = kNa2;
        a2.m = b2;
        return a2.m;
    }

    static {
        A = new ima(null);
        k = new Coa(pua.o, vRa.d != 0);
        E = new Coa(vRa.d, vRa.d != 0);
        J = new Coa(vRa.d, uSa.E != 0);
        i = new Boa();
    }

    public kNa_3(KB kB2) {
        kNa_3 a2;
        KB b2 = kB2;
        kNa_3 kNa_32 = a2 = this;
        a2.j = Lists.newArrayList();
        kNa_3 kNa_33 = a2;
        kNa_32.I = new Jma();
        kNa_32.C = pua.o;
        kNa_32.M = b2;
    }

    public void J() {
        kNa_3 a2;
        a2.M.J((kNa)a2);
    }

    public PB J() {
        kNa_3 a2;
        kNa_3 kNa_32 = a2;
        return kNa_32.J(kNa_32.C);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        Object object = this;
        PB b2 = ((kNa_3)object).J((int)a2);
        if (b2 != i) {
            if (((kNa_3)object).C == a2 && b2.J()) {
                b2.J((kNa)object);
                return;
            }
            ((kNa_3)object).C = a2;
        }
    }
}

