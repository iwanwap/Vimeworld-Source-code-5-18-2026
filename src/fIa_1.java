/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fd
 *  iIa
 *  vRa
 */
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fIa_1
implements Fd {
    private final int frameWidth;
    private final int frameTime;
    private final boolean interpolate;
    private final List<iIa> animationFrames;
    private final int frameHeight;

    /*
     * WARNING - void declaration
     */
    public fIa_1(List<iIa> list, int n2, int n3, int n4, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        fIa_1 a2;
        boolean bl2 = bl;
        fIa_1 fIa_12 = a2 = this;
        fIa_1 fIa_13 = a2;
        a2.animationFrames = e2;
        fIa_13.frameWidth = d2;
        fIa_13.frameHeight = c2;
        fIa_12.frameTime = b2;
        fIa_12.interpolate = f2;
    }

    public int C() {
        fIa_1 a2;
        return a2.frameTime;
    }

    public boolean J() {
        fIa_1 a2;
        return a2.interpolate;
    }

    public Set<Integer> J() {
        Object a2;
        fIa_1 fIa_12 = this;
        HashSet<Integer> hashSet = Sets.newHashSet();
        Object object = a2 = fIa_12.animationFrames.iterator();
        while (object.hasNext()) {
            iIa iIa2 = (iIa)a2.next();
            object = a2;
            hashSet.add(iIa2.f());
        }
        return hashSet;
    }

    public int l() {
        fIa_1 a2;
        return a2.animationFrames.size();
    }

    private iIa J(int n2) {
        int b2 = n2;
        fIa_1 a2 = this;
        return a2.animationFrames.get(b2);
    }

    public int f() {
        fIa_1 a2;
        return a2.frameWidth;
    }

    public int J() {
        fIa_1 a2;
        return a2.frameHeight;
    }

    public int f(int n2) {
        fIa_1 a2 = this;
        int b22 = n2;
        iIa b22 = a2.J(b22);
        if (b22.J()) {
            return a2.frameTime;
        }
        return b22.J();
    }

    public int J(int n2) {
        int b2 = n2;
        fIa_1 a2 = this;
        return a2.animationFrames.get(b2).f();
    }

    public boolean J(int n2) {
        int b2 = n2;
        fIa_1 a2 = this;
        if (!a2.animationFrames.get(b2).J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

