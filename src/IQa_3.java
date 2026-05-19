/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IQa
 *  Lc
 *  qra
 *  zqa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class IQa_3
extends GeneratedMessageLite.Builder<qra, IQa>
implements Lc {
    public IQa clearSequenceNumber() {
        IQa_3 a2;
        IQa_3 iQa_3 = a2;
        iQa_3.copyOnWrite();
        qra.J((qra)((qra)iQa_3.instance));
        return a2;
    }

    public ByteString getData() {
        IQa_3 a2;
        return ((qra)a2.instance).getData();
    }

    public IQa clearData() {
        IQa_3 a2;
        IQa_3 iQa_3 = a2;
        iQa_3.copyOnWrite();
        qra.l((qra)((qra)iQa_3.instance));
        return a2;
    }

    public IQa setSequenceNumber(long a2) {
        IQa_3 b2;
        IQa_3 iQa_3 = b2;
        iQa_3.copyOnWrite();
        qra.J((qra)((qra)iQa_3.instance), (long)a2);
        return b2;
    }

    public IQa setAudioSession(int n2) {
        IQa_3 a2;
        int b2 = n2;
        IQa_3 iQa_3 = a2 = this;
        iQa_3.copyOnWrite();
        qra.J((qra)((qra)iQa_3.instance), (int)b2);
        return a2;
    }

    public int getAudioSession() {
        IQa_3 a2;
        return ((qra)a2.instance).getAudioSession();
    }

    public /* synthetic */ IQa_3(zqa zqa2) {
        IQa_3 b2 = zqa2;
        IQa_3 a2 = this;
        a2();
    }

    public long getSequenceNumber() {
        IQa_3 a2;
        return ((qra)a2.instance).getSequenceNumber();
    }

    public IQa clearAudioSession() {
        IQa_3 a2;
        IQa_3 iQa_3 = a2;
        iQa_3.copyOnWrite();
        qra.f((qra)((qra)iQa_3.instance));
        return a2;
    }

    public IQa setData(ByteString byteString) {
        IQa_3 a2;
        ByteString b2 = byteString;
        IQa_3 iQa_3 = a2 = this;
        iQa_3.copyOnWrite();
        qra.J((qra)((qra)iQa_3.instance), (ByteString)b2);
        return a2;
    }

    private IQa_3() {
        super(qra.f());
        IQa_3 a2;
    }
}

