/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cpa
 *  bQa
 *  eqa
 *  fC
 *  rPa
 *  rra
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class Cpa_1
extends GeneratedMessageLite.Builder<bQa, Cpa>
implements fC {
    public Cpa addData(rPa rPa2) {
        Cpa_1 a2;
        Cpa_1 b2 = rPa2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance), (eqa)((eqa)b2.build()));
        return a2;
    }

    private Cpa_1() {
        super(bQa.J());
        Cpa_1 a2;
    }

    public Cpa addData(eqa eqa2) {
        Cpa_1 a2;
        Cpa_1 b2 = eqa2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance), (eqa)b2);
        return a2;
    }

    public eqa getData(int n2) {
        int b2 = n2;
        Cpa_1 a2 = this;
        return ((bQa)a2.instance).getData(b2);
    }

    public Cpa removeData(int n2) {
        Cpa_1 a2;
        int b2 = n2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Cpa addData(int n2, rPa rPa2) {
        void b2;
        Cpa_1 a2;
        Cpa_1 c2 = rPa2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.f((bQa)((bQa)cpa_1.instance), (int)b2, (eqa)((eqa)c2.build()));
        return a2;
    }

    public List<eqa> getDataList() {
        Cpa_1 a2;
        return Collections.unmodifiableList(((bQa)a2.instance).getDataList());
    }

    /*
     * WARNING - void declaration
     */
    public Cpa setData(int n2, rPa rPa2) {
        void b2;
        Cpa_1 a2;
        Cpa_1 c2 = rPa2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance), (int)b2, (eqa)((eqa)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Cpa setData(int n2, eqa eqa2) {
        void b2;
        Cpa_1 a2;
        Cpa_1 c2 = eqa2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance), (int)b2, (eqa)c2);
        return a2;
    }

    public int getDataCount() {
        Cpa_1 a2;
        return ((bQa)a2.instance).getDataCount();
    }

    public Cpa clearData() {
        Cpa_1 a2;
        Cpa_1 cpa_1 = a2;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance));
        return a2;
    }

    public Cpa addAllData(Iterable<? extends eqa> iterable) {
        Cpa_1 a2;
        Iterable<? extends eqa> b2 = iterable;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.J((bQa)((bQa)cpa_1.instance), (Iterable)b2);
        return a2;
    }

    public /* synthetic */ Cpa_1(rra rra2) {
        Cpa_1 b2 = rra2;
        Cpa_1 a2 = this;
        a2();
    }

    public Cpa clearRoomState() {
        Cpa_1 a2;
        Cpa_1 cpa_1 = a2;
        cpa_1.copyOnWrite();
        bQa.f((bQa)((bQa)cpa_1.instance));
        return a2;
    }

    public int getRoomState() {
        Cpa_1 a2;
        return ((bQa)a2.instance).getRoomState();
    }

    /*
     * WARNING - void declaration
     */
    public Cpa addData(int n2, eqa eqa2) {
        void b2;
        Cpa_1 a2;
        Cpa_1 c2 = eqa2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.f((bQa)((bQa)cpa_1.instance), (int)b2, (eqa)c2);
        return a2;
    }

    public Cpa setRoomState(int n2) {
        Cpa_1 a2;
        int b2 = n2;
        Cpa_1 cpa_1 = a2 = this;
        cpa_1.copyOnWrite();
        bQa.f((bQa)((bQa)cpa_1.instance), (int)b2);
        return a2;
    }
}

