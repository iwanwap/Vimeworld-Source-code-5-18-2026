/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Kk
 *  Pl
 *  nk
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class nk_2
extends GeneratedMessageLite.Builder<yl, nk>
implements o {
    public nk clearEntries() {
        nk_2 a2;
        nk_2 nk_22 = a2;
        nk_22.copyOnWrite();
        yl.f((yl)nk_22.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public nk addEntries(int n2, Kk kk2) {
        void b2;
        nk_2 a2;
        nk_2 c2 = kk2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.f((yl)nk_22.instance, (int)b2, (Kk)c2);
        return a2;
    }

    public nk addAllEntries(Iterable<? extends Kk> iterable) {
        nk_2 a2;
        Iterable<? extends Kk> b2 = iterable;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, b2);
        return a2;
    }

    public nk clearLayer() {
        nk_2 a2;
        nk_2 nk_22 = a2;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public nk setEntries(int n2, Kk kk2) {
        void b2;
        nk_2 a2;
        nk_2 c2 = kk2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, (int)b2, (Kk)c2);
        return a2;
    }

    @Override
    public int getLayerValue() {
        nk_2 a2;
        return ((yl)a2.instance).getLayerValue();
    }

    /*
     * WARNING - void declaration
     */
    public nk setEntries(int n2, oj oj2) {
        void b2;
        nk_2 a2;
        GeneratedMessageLite.Builder c2 = oj2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, (int)b2, (Kk)c2.build());
        return a2;
    }

    public nk addEntries(oj oj2) {
        nk_2 a2;
        GeneratedMessageLite.Builder b2 = oj2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, (Kk)b2.build());
        return a2;
    }

    public /* synthetic */ nk_2(AN aN2) {
        nk_2 b2 = aN2;
        nk_2 a2 = this;
        a2();
    }

    @Override
    public Pl getLayer() {
        nk_2 a2;
        return ((yl)a2.instance).getLayer();
    }

    private nk_2() {
        super(yl.f());
        nk_2 a2;
    }

    public nk addEntries(Kk kk2) {
        nk_2 a2;
        nk_2 b2 = kk2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, (Kk)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public nk addEntries(int n2, oj oj2) {
        void b2;
        nk_2 a2;
        GeneratedMessageLite.Builder c2 = oj2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.f((yl)nk_22.instance, (int)b2, (Kk)c2.build());
        return a2;
    }

    @Override
    public boolean hasLayer() {
        nk_2 a2;
        return ((yl)a2.instance).hasLayer();
    }

    @Override
    public List<Kk> getEntriesList() {
        nk_2 a2;
        return Collections.unmodifiableList(((yl)a2.instance).getEntriesList());
    }

    public nk setLayer(Pl pl2) {
        nk_2 a2;
        nk_2 b2 = pl2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, (Pl)b2);
        return a2;
    }

    public nk removeEntries(int n2) {
        nk_2 a2;
        int b2 = n2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.f((yl)nk_22.instance, b2);
        return a2;
    }

    @Override
    public Kk getEntries(int n2) {
        int b2 = n2;
        nk_2 a2 = this;
        return ((yl)a2.instance).getEntries(b2);
    }

    public nk setLayerValue(int n2) {
        nk_2 a2;
        int b2 = n2;
        nk_2 nk_22 = a2 = this;
        nk_22.copyOnWrite();
        yl.J((yl)nk_22.instance, b2);
        return a2;
    }

    @Override
    public int getEntriesCount() {
        nk_2 a2;
        return ((yl)a2.instance).getEntriesCount();
    }
}

