/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Lo
 *  bO
 *  dC
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Lo_3
extends GeneratedMessageLite.Builder<vN, Lo>
implements dC {
    private Lo_3() {
        super(vN.J());
        Lo_3 a2;
    }

    public Lo setPathBytes(ByteString byteString) {
        Lo_3 a2;
        ByteString b2 = byteString;
        Lo_3 lo_3 = a2 = this;
        lo_3.copyOnWrite();
        vN.J((vN)lo_3.instance, b2);
        return a2;
    }

    public bO getArchiveCase() {
        Lo_3 a2;
        return ((vN)a2.instance).getArchiveCase();
    }

    public Lo clearResource() {
        Lo_3 a2;
        Lo_3 lo_3 = a2;
        lo_3.copyOnWrite();
        vN.l((vN)lo_3.instance);
        return a2;
    }

    public String getPath() {
        Lo_3 a2;
        return ((vN)a2.instance).getPath();
    }

    public boolean hasResource() {
        Lo_3 a2;
        return ((vN)a2.instance).hasResource();
    }

    public Lo clearPath() {
        Lo_3 a2;
        Lo_3 lo_3 = a2;
        lo_3.copyOnWrite();
        vN.J((vN)lo_3.instance);
        return a2;
    }

    public boolean hasPath() {
        Lo_3 a2;
        return ((vN)a2.instance).hasPath();
    }

    public int getResource() {
        Lo_3 a2;
        return ((vN)a2.instance).getResource();
    }

    public Lo setPath(String string) {
        Lo_3 a2;
        String b2 = string;
        Lo_3 lo_3 = a2 = this;
        lo_3.copyOnWrite();
        vN.J((vN)lo_3.instance, b2);
        return a2;
    }

    public ByteString getPathBytes() {
        Lo_3 a2;
        return ((vN)a2.instance).getPathBytes();
    }

    public Lo setResource(int n2) {
        Lo_3 a2;
        int b2 = n2;
        Lo_3 lo_3 = a2 = this;
        lo_3.copyOnWrite();
        vN.J((vN)lo_3.instance, b2);
        return a2;
    }

    public /* synthetic */ Lo_3(AN aN2) {
        Lo_3 b2 = aN2;
        Lo_3 a2 = this;
        a2();
    }

    public Lo clearArchive() {
        Lo_3 a2;
        Lo_3 lo_3 = a2;
        lo_3.copyOnWrite();
        vN.f((vN)lo_3.instance);
        return a2;
    }
}

