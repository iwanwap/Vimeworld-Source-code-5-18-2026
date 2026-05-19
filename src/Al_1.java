/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Al
 *  O
 *  Rk
 *  ZK
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class Al_1
extends GeneratedMessageLite.Builder<Rk, Al>
implements O {
    public Al removeEntries(int n2) {
        Al_1 a2;
        int b2 = n2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Al addEntries(int n2, ek ek2) {
        void b2;
        Al_1 a2;
        GeneratedMessageLite.Builder c2 = ek2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance), (int)b2, (ZK)((ZK)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Al setEntries(int n2, ZK zK2) {
        void b2;
        Al_1 a2;
        Al_1 c2 = zK2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.f((Rk)((Rk)al_1.instance), (int)b2, (ZK)c2);
        return a2;
    }

    public Al addAllEntries(Iterable<? extends ZK> iterable) {
        Al_1 a2;
        Iterable<? extends ZK> b2 = iterable;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance), (Iterable)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Al addEntries(int n2, ZK zK2) {
        void b2;
        Al_1 a2;
        Al_1 c2 = zK2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance), (int)b2, (ZK)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Al setEntries(int n2, ek ek2) {
        void b2;
        Al_1 a2;
        GeneratedMessageLite.Builder c2 = ek2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.f((Rk)((Rk)al_1.instance), (int)b2, (ZK)((ZK)c2.build()));
        return a2;
    }

    public int getEntriesCount() {
        Al_1 a2;
        return ((Rk)a2.instance).getEntriesCount();
    }

    public Al addEntries(ek ek2) {
        Al_1 a2;
        GeneratedMessageLite.Builder b2 = ek2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance), (ZK)((ZK)b2.build()));
        return a2;
    }

    public List<ZK> getEntriesList() {
        Al_1 a2;
        return Collections.unmodifiableList(((Rk)a2.instance).getEntriesList());
    }

    private Al_1() {
        super(Rk.f());
        Al_1 a2;
    }

    public ZK getEntries(int n2) {
        int b2 = n2;
        Al_1 a2 = this;
        return ((Rk)a2.instance).getEntries(b2);
    }

    public Al addEntries(ZK zK2) {
        Al_1 a2;
        Al_1 b2 = zK2;
        Al_1 al_1 = a2 = this;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance), (ZK)b2);
        return a2;
    }

    public Al clearEntries() {
        Al_1 a2;
        Al_1 al_1 = a2;
        al_1.copyOnWrite();
        Rk.J((Rk)((Rk)al_1.instance));
        return a2;
    }

    public /* synthetic */ Al_1(AN aN2) {
        Al_1 b2 = aN2;
        Al_1 a2 = this;
        a2();
    }
}

