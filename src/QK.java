/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  dl
 *  x
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class QK
extends GeneratedMessageLite.Builder<dl, QK>
implements x {
    public boolean hasStartAt() {
        QK a2;
        return ((dl)a2.instance).hasStartAt();
    }

    public boolean hasTimezone() {
        QK a2;
        return ((dl)a2.instance).hasTimezone();
    }

    public QK setTimezone(String string) {
        QK a2;
        String b2 = string;
        QK qK = a2 = this;
        qK.copyOnWrite();
        dl.J((dl)((dl)qK.instance), (String)b2);
        return a2;
    }

    public QK setTimezoneBytes(ByteString byteString) {
        QK a2;
        ByteString b2 = byteString;
        QK qK = a2 = this;
        qK.copyOnWrite();
        dl.J((dl)((dl)qK.instance), (ByteString)b2);
        return a2;
    }

    public QK clearTimezone() {
        QK a2;
        QK qK = a2;
        qK.copyOnWrite();
        dl.f((dl)((dl)qK.instance));
        return a2;
    }

    private QK() {
        super(dl.J());
        QK a2;
    }

    public QK clearStartAt() {
        QK a2;
        QK qK = a2;
        qK.copyOnWrite();
        dl.J((dl)((dl)qK.instance));
        return a2;
    }

    public /* synthetic */ QK(AN aN) {
        QK b2 = aN;
        QK a2 = this;
        a2();
    }

    public ByteString getTimezoneBytes() {
        QK a2;
        return ((dl)a2.instance).getTimezoneBytes();
    }

    public QK setStartAt(long a2) {
        QK b2;
        QK qK = b2;
        qK.copyOnWrite();
        dl.J((dl)((dl)qK.instance), (long)a2);
        return b2;
    }

    public String getTimezone() {
        QK a2;
        return ((dl)a2.instance).getTimezone();
    }

    public long getStartAt() {
        QK a2;
        return ((dl)a2.instance).getStartAt();
    }
}

