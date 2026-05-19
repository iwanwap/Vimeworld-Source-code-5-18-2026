/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jra
 *  pOa
 *  qqa
 *  spa
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class qqa_2
extends GeneratedMessageLite.Builder<pOa, qqa>
implements dB {
    public qqa addData(Dra dra) {
        qqa_2 a2;
        MessageLiteOrBuilder b2 = dra;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance), (Dra)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public qqa addData(int n2, spa spa2) {
        void b2;
        qqa_2 a2;
        qqa_2 c2 = spa2;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance), (int)b2, (Dra)((Dra)c2.build()));
        return a2;
    }

    public /* synthetic */ qqa_2(jra jra2) {
        qqa_2 b2 = jra2;
        qqa_2 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public qqa addData(int n2, Dra dra) {
        void b2;
        qqa_2 a2;
        MessageLiteOrBuilder c2 = dra;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance), (int)b2, (Dra)c2);
        return a2;
    }

    @Override
    public int getDataCount() {
        qqa_2 a2;
        return ((pOa)a2.instance).getDataCount();
    }

    public qqa addData(spa spa2) {
        qqa_2 a2;
        qqa_2 b2 = spa2;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance), (Dra)((Dra)b2.build()));
        return a2;
    }

    private qqa_2() {
        super(pOa.f());
        qqa_2 a2;
    }

    @Override
    public Dra getData(int n2) {
        int b2 = n2;
        qqa_2 a2 = this;
        return ((pOa)a2.instance).getData(b2);
    }

    /*
     * WARNING - void declaration
     */
    public qqa setData(int n2, spa spa2) {
        void b2;
        qqa_2 a2;
        qqa_2 c2 = spa2;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.f((pOa)((pOa)qqa_22.instance), (int)b2, (Dra)((Dra)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public qqa setData(int n2, Dra dra) {
        void b2;
        qqa_2 a2;
        MessageLiteOrBuilder c2 = dra;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.f((pOa)((pOa)qqa_22.instance), (int)b2, (Dra)c2);
        return a2;
    }

    public qqa clearData() {
        qqa_2 a2;
        qqa_2 qqa_22 = a2;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance));
        return a2;
    }

    @Override
    public List<Dra> getDataList() {
        qqa_2 a2;
        return Collections.unmodifiableList(((pOa)a2.instance).getDataList());
    }

    public qqa addAllData(Iterable<? extends Dra> iterable) {
        qqa_2 a2;
        Iterable<? extends Dra> b2 = iterable;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance), (Iterable)b2);
        return a2;
    }

    public qqa removeData(int n2) {
        qqa_2 a2;
        int b2 = n2;
        qqa_2 qqa_22 = a2 = this;
        qqa_22.copyOnWrite();
        pOa.J((pOa)((pOa)qqa_22.instance), (int)b2);
        return a2;
    }
}

