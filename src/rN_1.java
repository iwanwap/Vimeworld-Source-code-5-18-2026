/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Jm
 *  bN
 *  hm
 *  rN
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class rN_1
extends GeneratedMessageLite.Builder<hm, rN>
implements Xa {
    public rN clearScrollOffset() {
        rN_1 a2;
        rN_1 rN_12 = a2;
        rN_12.copyOnWrite();
        hm.l((hm)((hm)rN_12.instance));
        return a2;
    }

    @Override
    public qo getScrollOffsetValCase() {
        rN_1 a2;
        return ((hm)a2.instance).getScrollOffsetValCase();
    }

    public rN addAllActions(Iterable<? extends bN> iterable) {
        rN_1 a2;
        Iterable<? extends bN> b2 = iterable;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (Iterable)b2);
        return a2;
    }

    public rN removeActions(int n2) {
        rN_1 a2;
        int b2 = n2;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasScrollOffset() {
        rN_1 a2;
        return ((hm)a2.instance).hasScrollOffset();
    }

    public /* synthetic */ rN_1(AN aN2) {
        rN_1 b2 = aN2;
        rN_1 a2 = this;
        a2();
    }

    @Override
    public bN getActions(int n2) {
        int b2 = n2;
        rN_1 a2 = this;
        return ((hm)a2.instance).getActions(b2);
    }

    public rN setScrollOffset(float f2) {
        rN_1 a2;
        float b2 = f2;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.f((hm)((hm)rN_12.instance), (float)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public rN addActions(int n2, bN bN2) {
        void b2;
        rN_1 a2;
        rN_1 c2 = bN2;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.f((hm)((hm)rN_12.instance), (int)b2, (bN)c2);
        return a2;
    }

    public rN addActions(Jm jm) {
        rN_1 a2;
        rN_1 b2 = jm;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (bN)((bN)b2.build()));
        return a2;
    }

    public rN addActions(bN bN2) {
        rN_1 a2;
        rN_1 b2 = bN2;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (bN)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public rN setActions(int n2, Jm jm) {
        void b2;
        rN_1 a2;
        rN_1 c2 = jm;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (int)b2, (bN)((bN)c2.build()));
        return a2;
    }

    @Override
    public boolean hasScrollOffsetAnim() {
        rN_1 a2;
        return ((hm)a2.instance).hasScrollOffsetAnim();
    }

    @Override
    public int getActionsCount() {
        rN_1 a2;
        return ((hm)a2.instance).getActionsCount();
    }

    public rN clearActions() {
        rN_1 a2;
        rN_1 rN_12 = a2;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance));
        return a2;
    }

    public rN setScrollOffsetAnim(float f2) {
        rN_1 a2;
        float b2 = f2;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (float)b2);
        return a2;
    }

    @Override
    public float getScrollOffset() {
        rN_1 a2;
        return ((hm)a2.instance).getScrollOffset();
    }

    @Override
    public float getScrollOffsetAnim() {
        rN_1 a2;
        return ((hm)a2.instance).getScrollOffsetAnim();
    }

    /*
     * WARNING - void declaration
     */
    public rN addActions(int n2, Jm jm) {
        void b2;
        rN_1 a2;
        rN_1 c2 = jm;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.f((hm)((hm)rN_12.instance), (int)b2, (bN)((bN)c2.build()));
        return a2;
    }

    public rN clearScrollOffsetAnim() {
        rN_1 a2;
        rN_1 rN_12 = a2;
        rN_12.copyOnWrite();
        hm.f((hm)((hm)rN_12.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public rN setActions(int n2, bN bN2) {
        void b2;
        rN_1 a2;
        rN_1 c2 = bN2;
        rN_1 rN_12 = a2 = this;
        rN_12.copyOnWrite();
        hm.J((hm)((hm)rN_12.instance), (int)b2, (bN)c2);
        return a2;
    }

    @Override
    public List<bN> getActionsList() {
        rN_1 a2;
        return Collections.unmodifiableList(((hm)a2.instance).getActionsList());
    }

    public rN clearScrollOffsetVal() {
        rN_1 a2;
        rN_1 rN_12 = a2;
        rN_12.copyOnWrite();
        hm.C((hm)((hm)rN_12.instance));
        return a2;
    }

    private rN_1() {
        super(hm.f());
        rN_1 a2;
    }
}

