/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mv
 *  vx
 *  ysa
 */
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import java.util.ArrayList;
import java.util.List;

public final class vx_2 {
    private final Hasher A;
    private final List<Object> I;

    private void J(Object object) {
        Object b2 = object;
        vx_2 a2 = this;
        a2.I.add(b2);
    }

    public void J(int n2) {
        vx_2 a2;
        int b2 = n2;
        vx_2 vx_22 = a2 = this;
        vx_22.J((Object)b2);
        vx_22.A.putInt(b2);
    }

    public /* synthetic */ vx_2(Mv mv) {
        vx_2 b2 = mv;
        vx_2 a2 = this;
        a2();
    }

    public long J() {
        vx_2 a2;
        return a2.A.hash().asLong();
    }

    public static /* synthetic */ List J(vx a2) {
        return a2.I;
    }

    public void J(float f2) {
        vx_2 a2;
        float b2 = f2;
        vx_2 vx_22 = a2 = this;
        vx_22.J(Float.valueOf(b2));
        vx_22.A.putFloat(b2);
    }

    public void J(long a2) {
        vx_2 b2;
        vx_2 vx_22 = b2;
        vx_22.J((Object)a2);
        vx_22.A.putLong(a2);
    }

    private vx_2() {
        vx_2 a2;
        a2.A = Hashing.murmur3_128().newHasher();
        vx_2 vx_22 = a2;
        vx_22.I = new ArrayList<Object>(ysa.s);
    }

    public void J(boolean bl) {
        vx_2 a2;
        boolean b2 = bl;
        vx_2 vx_22 = a2 = this;
        vx_22.J((Object)b2);
        vx_22.A.putBoolean(b2);
    }

    public void J(double a2) {
        vx_2 b2;
        vx_2 vx_22 = b2;
        vx_22.J((Object)a2);
        vx_22.A.putDouble(a2);
    }
}

