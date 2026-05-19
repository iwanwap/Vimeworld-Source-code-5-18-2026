/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Cn
 *  ln
 *  ra
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Cn_3
extends GeneratedMessageLite.Builder<ln, Cn>
implements ra {
    public Cn setPathBytes(ByteString byteString) {
        Cn_3 a2;
        ByteString b2 = byteString;
        Cn_3 cn_3 = a2 = this;
        cn_3.copyOnWrite();
        ln.J((ln)((ln)cn_3.instance), (ByteString)b2);
        return a2;
    }

    public Cn setResource(int n2) {
        Cn_3 a2;
        int b2 = n2;
        Cn_3 cn_3 = a2 = this;
        cn_3.copyOnWrite();
        ln.f((ln)((ln)cn_3.instance), (int)b2);
        return a2;
    }

    public Cn clearEntityId() {
        Cn_3 a2;
        Cn_3 cn_3 = a2;
        cn_3.copyOnWrite();
        ln.C((ln)((ln)cn_3.instance));
        return a2;
    }

    public /* synthetic */ Cn_3(AN aN2) {
        Cn_3 b2 = aN2;
        Cn_3 a2 = this;
        a2();
    }

    public Cn clearUuid() {
        Cn_3 a2;
        Cn_3 cn_3 = a2;
        cn_3.copyOnWrite();
        ln.J((ln)((ln)cn_3.instance));
        return a2;
    }

    public Cn setEntityId(int n2) {
        Cn_3 a2;
        int b2 = n2;
        Cn_3 cn_3 = a2 = this;
        cn_3.copyOnWrite();
        ln.J((ln)((ln)cn_3.instance), (int)b2);
        return a2;
    }

    public Cn clearResource() {
        Cn_3 a2;
        Cn_3 cn_3 = a2;
        cn_3.copyOnWrite();
        ln.l((ln)((ln)cn_3.instance));
        return a2;
    }

    public boolean hasResource() {
        Cn_3 a2;
        return ((ln)a2.instance).hasResource();
    }

    public int getResource() {
        Cn_3 a2;
        return ((ln)a2.instance).getResource();
    }

    public int getEntityId() {
        Cn_3 a2;
        return ((ln)a2.instance).getEntityId();
    }

    public Cn setUuid(ByteString byteString) {
        Cn_3 a2;
        ByteString b2 = byteString;
        Cn_3 cn_3 = a2 = this;
        cn_3.copyOnWrite();
        ln.f((ln)((ln)cn_3.instance), (ByteString)b2);
        return a2;
    }

    public ByteString getPathBytes() {
        Cn_3 a2;
        return ((ln)a2.instance).getPathBytes();
    }

    public String getPath() {
        Cn_3 a2;
        return ((ln)a2.instance).getPath();
    }

    public Cn clearPath() {
        Cn_3 a2;
        Cn_3 cn_3 = a2;
        cn_3.copyOnWrite();
        ln.f((ln)((ln)cn_3.instance));
        return a2;
    }

    public boolean hasPath() {
        Cn_3 a2;
        return ((ln)a2.instance).hasPath();
    }

    public ByteString getUuid() {
        Cn_3 a2;
        return ((ln)a2.instance).getUuid();
    }

    public Cn setPath(String string) {
        Cn_3 a2;
        String b2 = string;
        Cn_3 cn_3 = a2 = this;
        cn_3.copyOnWrite();
        ln.J((ln)((ln)cn_3.instance), (String)b2);
        return a2;
    }

    private Cn_3() {
        super(ln.J());
        Cn_3 a2;
    }
}

