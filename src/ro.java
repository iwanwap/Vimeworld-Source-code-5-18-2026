/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class ro
extends GeneratedMessageLite.Builder<fM, ro>
implements ma {
    public ro addAllResources(Iterable<? extends Integer> iterable) {
        ro a2;
        Iterable<? extends Integer> b2 = iterable;
        ro ro2 = a2 = this;
        ro2.copyOnWrite();
        fM.J((fM)ro2.instance, b2);
        return a2;
    }

    @Override
    public int getResources(int n2) {
        int b2 = n2;
        ro a2 = this;
        return ((fM)a2.instance).getResources(b2);
    }

    public ro addResources(int n2) {
        ro a2;
        int b2 = n2;
        ro ro2 = a2 = this;
        ro2.copyOnWrite();
        fM.J((fM)ro2.instance, b2);
        return a2;
    }

    @Override
    public int getResourcesCount() {
        ro a2;
        return ((fM)a2.instance).getResourcesCount();
    }

    private ro() {
        super(fM.f());
        ro a2;
    }

    public /* synthetic */ ro(AN aN2) {
        ro b2 = aN2;
        ro a2 = this;
        a2();
    }

    public ro clearResources() {
        ro a2;
        ro ro2 = a2;
        ro2.copyOnWrite();
        fM.J((fM)ro2.instance);
        return a2;
    }

    @Override
    public List<Integer> getResourcesList() {
        ro a2;
        return Collections.unmodifiableList(((fM)a2.instance).getResourcesList());
    }

    /*
     * WARNING - void declaration
     */
    public ro setResources(int n2, int n3) {
        void b2;
        ro a2;
        int c2 = n3;
        ro ro2 = a2 = this;
        ro2.copyOnWrite();
        fM.J((fM)ro2.instance, (int)b2, c2);
        return a2;
    }
}

