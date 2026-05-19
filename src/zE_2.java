/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LF
 *  PE
 *  Ypa
 *  fsa
 */
import java.util.Map;

public final class zE_2
implements a {
    public final /* synthetic */ Map I;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public void J(LF lF2, PE pE2) {
        Object c2 = lF2;
        zE_2 b2 = this;
        c2 = b2.I;
        synchronized (c2) {
            void a2;
            b2.I.put(Ypa.O, a2);
            b2.I.notifyAll();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public void J(LF lF2, Exception exception) {
        Object c2 = lF2;
        zE_2 b2 = this;
        c2 = b2.I;
        synchronized (c2) {
            void a2;
            b2.I.put(fsa.Ja, a2);
            b2.I.notifyAll();
            return;
        }
    }

    public zE_2(Map object) {
        Object a2 = object;
        object = this;
        ((zE_2)object).I = a2;
        object();
    }
}

