/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Kc
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class om
extends GeneratedMessageLite.Builder<So, om>
implements Kc {
    public String getReconnectTo() {
        om a2;
        return ((So)a2.instance).getReconnectTo();
    }

    public /* synthetic */ om(AN aN2) {
        om b2 = aN2;
        om a2 = this;
        a2();
    }

    public ByteString getReconnectToBytes() {
        om a2;
        return ((So)a2.instance).getReconnectToBytes();
    }

    public om setReconnectToBytes(ByteString byteString) {
        om a2;
        ByteString b2 = byteString;
        om om2 = a2 = this;
        om2.copyOnWrite();
        So.J((So)om2.instance, b2);
        return a2;
    }

    private om() {
        super(So.f());
        om a2;
    }

    public om setReconnectTo(String string) {
        om a2;
        String b2 = string;
        om om2 = a2 = this;
        om2.copyOnWrite();
        So.J((So)om2.instance, b2);
        return a2;
    }

    public om clearReconnectTo() {
        om a2;
        om om2 = a2;
        om2.copyOnWrite();
        So.J((So)om2.instance);
        return a2;
    }
}

