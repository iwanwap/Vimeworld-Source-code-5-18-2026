/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BA
 *  eqa
 *  rPa
 *  tra
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class rPa_3
extends GeneratedMessageLite.Builder<eqa, rPa>
implements BA {
    private rPa_3() {
        super(eqa.J());
        rPa_3 a2;
    }

    public /* synthetic */ rPa_3(tra tra2) {
        rPa_3 b2 = tra2;
        rPa_3 a2 = this;
        a2();
    }

    public rPa setMuted(boolean bl) {
        rPa_3 a2;
        boolean b2 = bl;
        rPa_3 rPa_32 = a2 = this;
        rPa_32.copyOnWrite();
        eqa.f((eqa)((eqa)rPa_32.instance), (boolean)b2);
        return a2;
    }

    public boolean getMicroDisabled() {
        rPa_3 a2;
        return ((eqa)a2.instance).getMicroDisabled();
    }

    public boolean getMicroExists() {
        rPa_3 a2;
        return ((eqa)a2.instance).getMicroExists();
    }

    public rPa clearMuted() {
        rPa_3 a2;
        rPa_3 rPa_32 = a2;
        rPa_32.copyOnWrite();
        eqa.f((eqa)((eqa)rPa_32.instance));
        return a2;
    }

    public String getPlayer() {
        rPa_3 a2;
        return ((eqa)a2.instance).getPlayer();
    }

    public ByteString getPlayerBytes() {
        rPa_3 a2;
        return ((eqa)a2.instance).getPlayerBytes();
    }

    public rPa setPlayerBytes(ByteString byteString) {
        rPa_3 a2;
        ByteString b2 = byteString;
        rPa_3 rPa_32 = a2 = this;
        rPa_32.copyOnWrite();
        eqa.J((eqa)((eqa)rPa_32.instance), (ByteString)b2);
        return a2;
    }

    public rPa clearMicroExists() {
        rPa_3 a2;
        rPa_3 rPa_32 = a2;
        rPa_32.copyOnWrite();
        eqa.l((eqa)((eqa)rPa_32.instance));
        return a2;
    }

    public rPa clearMicroDisabled() {
        rPa_3 a2;
        rPa_3 rPa_32 = a2;
        rPa_32.copyOnWrite();
        eqa.J((eqa)((eqa)rPa_32.instance));
        return a2;
    }

    public rPa setMicroDisabled(boolean bl) {
        rPa_3 a2;
        boolean b2 = bl;
        rPa_3 rPa_32 = a2 = this;
        rPa_32.copyOnWrite();
        eqa.J((eqa)((eqa)rPa_32.instance), (boolean)b2);
        return a2;
    }

    public rPa clearPlayer() {
        rPa_3 a2;
        rPa_3 rPa_32 = a2;
        rPa_32.copyOnWrite();
        eqa.C((eqa)((eqa)rPa_32.instance));
        return a2;
    }

    public rPa setMicroExists(boolean bl) {
        rPa_3 a2;
        boolean b2 = bl;
        rPa_3 rPa_32 = a2 = this;
        rPa_32.copyOnWrite();
        eqa.l((eqa)((eqa)rPa_32.instance), (boolean)b2);
        return a2;
    }

    public rPa setPlayer(String string) {
        rPa_3 a2;
        String b2 = string;
        rPa_3 rPa_32 = a2 = this;
        rPa_32.copyOnWrite();
        eqa.J((eqa)((eqa)rPa_32.instance), (String)b2);
        return a2;
    }

    public boolean getMuted() {
        rPa_3 a2;
        return ((eqa)a2.instance).getMuted();
    }
}

