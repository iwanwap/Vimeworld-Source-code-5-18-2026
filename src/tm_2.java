/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  QO
 *  Ta
 *  tm
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class tm_2
extends GeneratedMessageLite.Builder<QO, tm>
implements Ta {
    public tm setIdBytes(ByteString byteString) {
        tm_2 a2;
        ByteString b2 = byteString;
        tm_2 tm_22 = a2 = this;
        tm_22.copyOnWrite();
        QO.J((QO)((QO)tm_22.instance), (ByteString)b2);
        return a2;
    }

    public ByteString getIdBytes() {
        tm_2 a2;
        return ((QO)a2.instance).getIdBytes();
    }

    public /* synthetic */ tm_2(AN aN2) {
        tm_2 b2 = aN2;
        tm_2 a2 = this;
        a2();
    }

    public String getId() {
        tm_2 a2;
        return ((QO)a2.instance).getId();
    }

    private tm_2() {
        super(QO.J());
        tm_2 a2;
    }

    public tm setId(String string) {
        tm_2 a2;
        String b2 = string;
        tm_2 tm_22 = a2 = this;
        tm_22.copyOnWrite();
        QO.J((QO)((QO)tm_22.instance), (String)b2);
        return a2;
    }

    public tm clearId() {
        tm_2 a2;
        tm_2 tm_22 = a2;
        tm_22.copyOnWrite();
        QO.J((QO)((QO)tm_22.instance));
        return a2;
    }
}

