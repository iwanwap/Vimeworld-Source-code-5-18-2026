/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Qo
 *  fn
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class fn_2
extends GeneratedMessageLite.Builder<sm, fn>
implements Ra {
    /*
     * WARNING - void declaration
     */
    public fn addResources(int n2, fN fN2) {
        void b2;
        fn_2 a2;
        GeneratedMessageLite.Builder c2 = fN2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance, (int)b2, (Qo)c2.build());
        return a2;
    }

    public fn clearResources() {
        fn_2 a2;
        fn_2 fn_22 = a2;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance);
        return a2;
    }

    public fn addResources(Qo qo2) {
        fn_2 a2;
        fn_2 b2 = qo2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance, (Qo)b2);
        return a2;
    }

    public fn addResources(fN fN2) {
        fn_2 a2;
        GeneratedMessageLite.Builder b2 = fN2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance, (Qo)b2.build());
        return a2;
    }

    @Override
    public int getResourcesCount() {
        fn_2 a2;
        return ((sm)a2.instance).getResourcesCount();
    }

    /*
     * WARNING - void declaration
     */
    public fn setResources(int n2, Qo qo2) {
        void b2;
        fn_2 a2;
        fn_2 c2 = qo2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.f((sm)fn_22.instance, (int)b2, (Qo)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public fn setResources(int n2, fN fN2) {
        void b2;
        fn_2 a2;
        GeneratedMessageLite.Builder c2 = fN2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.f((sm)fn_22.instance, (int)b2, (Qo)c2.build());
        return a2;
    }

    @Override
    public Qo getResources(int n2) {
        int b2 = n2;
        fn_2 a2 = this;
        return ((sm)a2.instance).getResources(b2);
    }

    @Override
    public List<Qo> getResourcesList() {
        fn_2 a2;
        return Collections.unmodifiableList(((sm)a2.instance).getResourcesList());
    }

    public fn addAllResources(Iterable<? extends Qo> iterable) {
        fn_2 a2;
        Iterable<? extends Qo> b2 = iterable;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance, b2);
        return a2;
    }

    public fn removeResources(int n2) {
        fn_2 a2;
        int b2 = n2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public fn addResources(int n2, Qo qo2) {
        void b2;
        fn_2 a2;
        fn_2 c2 = qo2;
        fn_2 fn_22 = a2 = this;
        fn_22.copyOnWrite();
        sm.J((sm)fn_22.instance, (int)b2, (Qo)c2);
        return a2;
    }

    public /* synthetic */ fn_2(AN aN2) {
        fn_2 b2 = aN2;
        fn_2 a2 = this;
        a2();
    }

    private fn_2() {
        super(sm.f());
        fn_2 a2;
    }
}

