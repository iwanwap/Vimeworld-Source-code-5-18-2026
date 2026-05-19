/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Sa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class BO
extends GeneratedMessageLite.Builder<no, BO>
implements Sa {
    public BO clearUuid() {
        BO a2;
        BO bO2 = a2;
        bO2.copyOnWrite();
        no.J((no)bO2.instance);
        return a2;
    }

    public ByteString getUuid() {
        BO a2;
        return ((no)a2.instance).getUuid();
    }

    public /* synthetic */ BO(AN aN2) {
        BO b2 = aN2;
        BO a2 = this;
        a2();
    }

    public BO setUuid(ByteString byteString) {
        BO a2;
        ByteString b2 = byteString;
        BO bO2 = a2 = this;
        bO2.copyOnWrite();
        no.J((no)bO2.instance, b2);
        return a2;
    }

    private BO() {
        super(no.J());
        BO a2;
    }
}

