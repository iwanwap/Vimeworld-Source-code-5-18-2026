/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vpa
 *  XQa
 *  qOa
 */
import com.google.protobuf.GeneratedMessageLite;

public final class qOa_1
extends GeneratedMessageLite.Builder<Vpa, qOa>
implements OB {
    public qOa setRoomState(int n2) {
        qOa_1 a2;
        int b2 = n2;
        qOa_1 qOa_12 = a2 = this;
        qOa_12.copyOnWrite();
        Vpa.J((Vpa)((Vpa)qOa_12.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ qOa_1(XQa xQa2) {
        qOa_1 b2 = xQa2;
        qOa_1 a2 = this;
        a2();
    }

    public qOa setServerTime(long a2) {
        qOa_1 b2;
        qOa_1 qOa_12 = b2;
        qOa_12.copyOnWrite();
        Vpa.J((Vpa)((Vpa)qOa_12.instance), (long)a2);
        return b2;
    }

    public qOa clearServerTime() {
        qOa_1 a2;
        qOa_1 qOa_12 = a2;
        qOa_12.copyOnWrite();
        Vpa.f((Vpa)((Vpa)qOa_12.instance));
        return a2;
    }

    public qOa clearTime() {
        qOa_1 a2;
        qOa_1 qOa_12 = a2;
        qOa_12.copyOnWrite();
        Vpa.J((Vpa)((Vpa)qOa_12.instance));
        return a2;
    }

    @Override
    public long getServerTime() {
        qOa_1 a2;
        return ((Vpa)a2.instance).getServerTime();
    }

    public qOa clearRoomState() {
        qOa_1 a2;
        qOa_1 qOa_12 = a2;
        qOa_12.copyOnWrite();
        Vpa.l((Vpa)((Vpa)qOa_12.instance));
        return a2;
    }

    public qOa setTime(long a2) {
        qOa_1 b2;
        qOa_1 qOa_12 = b2;
        qOa_12.copyOnWrite();
        Vpa.f((Vpa)((Vpa)qOa_12.instance), (long)a2);
        return b2;
    }

    @Override
    public int getRoomState() {
        qOa_1 a2;
        return ((Vpa)a2.instance).getRoomState();
    }

    private qOa_1() {
        super(Vpa.J());
        qOa_1 a2;
    }

    @Override
    public long getTime() {
        qOa_1 a2;
        return ((Vpa)a2.instance).getTime();
    }
}

