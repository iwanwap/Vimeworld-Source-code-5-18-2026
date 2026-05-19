/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Jd
 *  so
 *  xn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class xn_2
extends GeneratedMessageLite.Builder<so, xn>
implements Jd {
    public ByteString getToken() {
        xn_2 a2;
        return ((so)a2.instance).getToken();
    }

    public xn clearPort() {
        xn_2 a2;
        xn_2 xn_22 = a2;
        xn_22.copyOnWrite();
        so.l((so)((so)xn_22.instance));
        return a2;
    }

    public xn setKey(ByteString byteString) {
        xn_2 a2;
        ByteString b2 = byteString;
        xn_2 xn_22 = a2 = this;
        xn_22.copyOnWrite();
        so.f((so)((so)xn_22.instance), (ByteString)b2);
        return a2;
    }

    public xn setHost(String string) {
        xn_2 a2;
        String b2 = string;
        xn_2 xn_22 = a2 = this;
        xn_22.copyOnWrite();
        so.J((so)((so)xn_22.instance), (String)b2);
        return a2;
    }

    public xn clearKey() {
        xn_2 a2;
        xn_2 xn_22 = a2;
        xn_22.copyOnWrite();
        so.f((so)((so)xn_22.instance));
        return a2;
    }

    public ByteString getKey() {
        xn_2 a2;
        return ((so)a2.instance).getKey();
    }

    public xn setPort(int n2) {
        xn_2 a2;
        int b2 = n2;
        xn_2 xn_22 = a2 = this;
        xn_22.copyOnWrite();
        so.J((so)((so)xn_22.instance), (int)b2);
        return a2;
    }

    public String getHost() {
        xn_2 a2;
        return ((so)a2.instance).getHost();
    }

    public ByteString getHostBytes() {
        xn_2 a2;
        return ((so)a2.instance).getHostBytes();
    }

    private xn_2() {
        super(so.f());
        xn_2 a2;
    }

    public xn clearToken() {
        xn_2 a2;
        xn_2 xn_22 = a2;
        xn_22.copyOnWrite();
        so.C((so)((so)xn_22.instance));
        return a2;
    }

    public xn setToken(ByteString byteString) {
        xn_2 a2;
        ByteString b2 = byteString;
        xn_2 xn_22 = a2 = this;
        xn_22.copyOnWrite();
        so.l((so)((so)xn_22.instance), (ByteString)b2);
        return a2;
    }

    public /* synthetic */ xn_2(AN aN2) {
        xn_2 b2 = aN2;
        xn_2 a2 = this;
        a2();
    }

    public xn setHostBytes(ByteString byteString) {
        xn_2 a2;
        ByteString b2 = byteString;
        xn_2 xn_22 = a2 = this;
        xn_22.copyOnWrite();
        so.J((so)((so)xn_22.instance), (ByteString)b2);
        return a2;
    }

    public int getPort() {
        xn_2 a2;
        return ((so)a2.instance).getPort();
    }

    public xn clearHost() {
        xn_2 a2;
        xn_2 xn_22 = a2;
        xn_22.copyOnWrite();
        so.J((so)((so)xn_22.instance));
        return a2;
    }
}

