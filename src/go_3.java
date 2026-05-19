/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ro
 *  go
 *  vn
 *  wn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class go_3
extends GeneratedMessageLite.Builder<wn, go>
implements ia {
    public go setActionValue(int n2) {
        go_3 a2;
        int b2 = n2;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.J((wn)((wn)go_32.instance), (int)b2);
        return a2;
    }

    private go_3() {
        super(wn.J());
        go_3 a2;
    }

    @Override
    public boolean hasCallback() {
        go_3 a2;
        return ((wn)a2.instance).hasCallback();
    }

    public go setUrl(String string) {
        go_3 a2;
        String b2 = string;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.J((wn)((wn)go_32.instance), (String)b2);
        return a2;
    }

    public go setCallback(ByteString byteString) {
        go_3 a2;
        ByteString b2 = byteString;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.l((wn)((wn)go_32.instance), (ByteString)b2);
        return a2;
    }

    public go clearUrl() {
        go_3 a2;
        go_3 go_32 = a2;
        go_32.copyOnWrite();
        wn.f((wn)((wn)go_32.instance));
        return a2;
    }

    @Override
    public ByteString getMessageBytes() {
        go_3 a2;
        return ((wn)a2.instance).getMessageBytes();
    }

    public /* synthetic */ go_3(AN aN2) {
        go_3 b2 = aN2;
        go_3 a2 = this;
        a2();
    }

    @Override
    public ByteString getUrlBytes() {
        go_3 a2;
        return ((wn)a2.instance).getUrlBytes();
    }

    @Override
    public Ro getAction() {
        go_3 a2;
        return ((wn)a2.instance).getAction();
    }

    public go setMessage(String string) {
        go_3 a2;
        String b2 = string;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.f((wn)((wn)go_32.instance), (String)b2);
        return a2;
    }

    @Override
    public boolean hasMessage() {
        go_3 a2;
        return ((wn)a2.instance).hasMessage();
    }

    @Override
    public boolean hasUrl() {
        go_3 a2;
        return ((wn)a2.instance).hasUrl();
    }

    public go setUrlBytes(ByteString byteString) {
        go_3 a2;
        ByteString b2 = byteString;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.J((wn)((wn)go_32.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public String getMessage() {
        go_3 a2;
        return ((wn)a2.instance).getMessage();
    }

    public go clearMessage() {
        go_3 a2;
        go_3 go_32 = a2;
        go_32.copyOnWrite();
        wn.d((wn)((wn)go_32.instance));
        return a2;
    }

    @Override
    public ByteString getCallback() {
        go_3 a2;
        return ((wn)a2.instance).getCallback();
    }

    public go setMessageBytes(ByteString byteString) {
        go_3 a2;
        ByteString b2 = byteString;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.f((wn)((wn)go_32.instance), (ByteString)b2);
        return a2;
    }

    public go clearCallback() {
        go_3 a2;
        go_3 go_32 = a2;
        go_32.copyOnWrite();
        wn.C((wn)((wn)go_32.instance));
        return a2;
    }

    @Override
    public String getUrl() {
        go_3 a2;
        return ((wn)a2.instance).getUrl();
    }

    public go clearData() {
        go_3 a2;
        go_3 go_32 = a2;
        go_32.copyOnWrite();
        wn.J((wn)((wn)go_32.instance));
        return a2;
    }

    @Override
    public int getActionValue() {
        go_3 a2;
        return ((wn)a2.instance).getActionValue();
    }

    public go setAction(Ro ro2) {
        go_3 a2;
        go_3 b2 = ro2;
        go_3 go_32 = a2 = this;
        go_32.copyOnWrite();
        wn.J((wn)((wn)go_32.instance), (Ro)b2);
        return a2;
    }

    public go clearAction() {
        go_3 a2;
        go_3 go_32 = a2;
        go_32.copyOnWrite();
        wn.l((wn)((wn)go_32.instance));
        return a2;
    }

    @Override
    public vn getDataCase() {
        go_3 a2;
        return ((wn)a2.instance).getDataCase();
    }
}

