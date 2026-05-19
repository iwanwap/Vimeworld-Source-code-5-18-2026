/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  FN
 *  Pn
 *  ca
 *  mN
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class mN_3
extends GeneratedMessageLite.Builder<Xn, mN>
implements ca {
    public List<Pn> getActionsList() {
        mN_3 a2;
        return Collections.unmodifiableList(((Xn)a2.instance).getActionsList());
    }

    /*
     * WARNING - void declaration
     */
    public mN setActions(int n2, DN dN2) {
        void b2;
        mN_3 a2;
        GeneratedMessageLite.Builder c2 = dN2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.f((Xn)mN_32.instance, (int)b2, (Pn)c2.build());
        return a2;
    }

    public /* synthetic */ mN_3(AN aN2) {
        mN_3 b2 = aN2;
        mN_3 a2 = this;
        a2();
    }

    public float getWidth() {
        mN_3 a2;
        return ((Xn)a2.instance).getWidth();
    }

    public mN clearWidthval() {
        mN_3 a2;
        mN_3 mN_32 = a2;
        mN_32.copyOnWrite();
        Xn.l((Xn)mN_32.instance);
        return a2;
    }

    public boolean hasWidthAnim() {
        mN_3 a2;
        return ((Xn)a2.instance).hasWidthAnim();
    }

    public FN getWidthvalCase() {
        mN_3 a2;
        return ((Xn)a2.instance).getWidthvalCase();
    }

    public float getWidthAnim() {
        mN_3 a2;
        return ((Xn)a2.instance).getWidthAnim();
    }

    public mN addAllActions(Iterable<? extends Pn> iterable) {
        mN_3 a2;
        Iterable<? extends Pn> b2 = iterable;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, b2);
        return a2;
    }

    public boolean hasWidth() {
        mN_3 a2;
        return ((Xn)a2.instance).hasWidth();
    }

    public mN setWidthAnim(float f2) {
        mN_3 a2;
        float b2 = f2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.f((Xn)mN_32.instance, b2);
        return a2;
    }

    private mN_3() {
        super(Xn.J());
        mN_3 a2;
    }

    public mN addActions(Pn pn2) {
        mN_3 a2;
        mN_3 b2 = pn2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, (Pn)b2);
        return a2;
    }

    public int getActionsCount() {
        mN_3 a2;
        return ((Xn)a2.instance).getActionsCount();
    }

    /*
     * WARNING - void declaration
     */
    public mN addActions(int n2, Pn pn2) {
        void b2;
        mN_3 a2;
        mN_3 c2 = pn2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, (int)b2, (Pn)c2);
        return a2;
    }

    public Pn getActions(int n2) {
        int b2 = n2;
        mN_3 a2 = this;
        return ((Xn)a2.instance).getActions(b2);
    }

    public mN addActions(DN dN2) {
        mN_3 a2;
        GeneratedMessageLite.Builder b2 = dN2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, (Pn)b2.build());
        return a2;
    }

    public mN clearWidth() {
        mN_3 a2;
        mN_3 mN_32 = a2;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance);
        return a2;
    }

    public mN clearWidthAnim() {
        mN_3 a2;
        mN_3 mN_32 = a2;
        mN_32.copyOnWrite();
        Xn.f((Xn)mN_32.instance);
        return a2;
    }

    public mN clearActions() {
        mN_3 a2;
        mN_3 mN_32 = a2;
        mN_32.copyOnWrite();
        Xn.C((Xn)mN_32.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public mN addActions(int n2, DN dN2) {
        void b2;
        mN_3 a2;
        GeneratedMessageLite.Builder c2 = dN2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, (int)b2, (Pn)c2.build());
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public mN setActions(int n2, Pn pn2) {
        void b2;
        mN_3 a2;
        mN_3 c2 = pn2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.f((Xn)mN_32.instance, (int)b2, (Pn)c2);
        return a2;
    }

    public mN setWidth(float f2) {
        mN_3 a2;
        float b2 = f2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, b2);
        return a2;
    }

    public mN removeActions(int n2) {
        mN_3 a2;
        int b2 = n2;
        mN_3 mN_32 = a2 = this;
        mN_32.copyOnWrite();
        Xn.J((Xn)mN_32.instance, b2);
        return a2;
    }
}

