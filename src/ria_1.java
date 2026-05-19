/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  NEa
 *  NTa
 *  vRa
 *  vfa
 */
import com.google.common.base.Predicate;

public final class ria_1<T extends Gl>
extends NEa {
    private vfa I;

    /*
     * WARNING - void declaration
     */
    public ria_1(vfa vfa2, Class<T> clazz, boolean bl, Predicate<? super T> predicate) {
        void a2;
        void b2;
        void c2;
        ria_1 e2 = vfa2;
        ria_1 d2 = this;
        super((bga)((Object)e2), (Class)c2, NTa.C, (boolean)b2, uSa.E != 0, (Predicate)a2);
        d2.I = e2;
    }

    public boolean f() {
        ria_1 a2;
        if (!a2.I.ba() && super.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

