/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Eb
 *  ZM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class dm
extends GeneratedMessageLite.Builder<ZM, dm>
implements Eb {
    public dm setPath(String string) {
        dm a2;
        String b2 = string;
        dm dm2 = a2 = this;
        dm2.copyOnWrite();
        ZM.J((ZM)((ZM)dm2.instance), (String)b2);
        return a2;
    }

    public ByteString getPathBytes() {
        dm a2;
        return ((ZM)a2.instance).getPathBytes();
    }

    public dm clearPath() {
        dm a2;
        dm dm2 = a2;
        dm2.copyOnWrite();
        ZM.f((ZM)((ZM)dm2.instance));
        return a2;
    }

    public dm clearResource() {
        dm a2;
        dm dm2 = a2;
        dm2.copyOnWrite();
        ZM.J((ZM)((ZM)dm2.instance));
        return a2;
    }

    private dm() {
        super(ZM.J());
        dm a2;
    }

    public long getDuration() {
        dm a2;
        return ((ZM)a2.instance).getDuration();
    }

    public dm setPathBytes(ByteString byteString) {
        dm a2;
        ByteString b2 = byteString;
        dm dm2 = a2 = this;
        dm2.copyOnWrite();
        ZM.J((ZM)((ZM)dm2.instance), (ByteString)b2);
        return a2;
    }

    public String getPath() {
        dm a2;
        return ((ZM)a2.instance).getPath();
    }

    public dm setDuration(long a2) {
        dm b2;
        dm dm2 = b2;
        dm2.copyOnWrite();
        ZM.J((ZM)((ZM)dm2.instance), (long)a2);
        return b2;
    }

    public boolean hasResource() {
        dm a2;
        return ((ZM)a2.instance).hasResource();
    }

    public dm setResource(int n2) {
        dm a2;
        int b2 = n2;
        dm dm2 = a2 = this;
        dm2.copyOnWrite();
        ZM.J((ZM)((ZM)dm2.instance), (int)b2);
        return a2;
    }

    public int getResource() {
        dm a2;
        return ((ZM)a2.instance).getResource();
    }

    public boolean hasPath() {
        dm a2;
        return ((ZM)a2.instance).hasPath();
    }

    public dm clearDuration() {
        dm a2;
        dm dm2 = a2;
        dm2.copyOnWrite();
        ZM.l((ZM)((ZM)dm2.instance));
        return a2;
    }

    public boolean hasDuration() {
        dm a2;
        return ((ZM)a2.instance).hasDuration();
    }

    public /* synthetic */ dm(AN aN2) {
        dm b2 = aN2;
        dm a2 = this;
        a2();
    }
}

