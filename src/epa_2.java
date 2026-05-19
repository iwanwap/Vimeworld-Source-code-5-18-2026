/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DRa
 *  OPa
 *  Xb
 *  epa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class epa_2
extends GeneratedMessageLite.Builder<OPa, epa>
implements Xb {
    public epa setRoomState(int n2) {
        epa_2 a2;
        int b2 = n2;
        epa_2 epa_22 = a2 = this;
        epa_22.copyOnWrite();
        OPa.J((OPa)((OPa)epa_22.instance), (int)b2);
        return a2;
    }

    public epa clearRoomState() {
        epa_2 a2;
        epa_2 epa_22 = a2;
        epa_22.copyOnWrite();
        OPa.f((OPa)((OPa)epa_22.instance));
        return a2;
    }

    private epa_2() {
        super(OPa.J());
        epa_2 a2;
    }

    public String getPlayer() {
        epa_2 a2;
        return ((OPa)a2.instance).getPlayer();
    }

    public ByteString getPlayerBytes() {
        epa_2 a2;
        return ((OPa)a2.instance).getPlayerBytes();
    }

    public epa setPlayer(String string) {
        epa_2 a2;
        String b2 = string;
        epa_2 epa_22 = a2 = this;
        epa_22.copyOnWrite();
        OPa.J((OPa)((OPa)epa_22.instance), (String)b2);
        return a2;
    }

    public int getRoomState() {
        epa_2 a2;
        return ((OPa)a2.instance).getRoomState();
    }

    public epa setPlayerBytes(ByteString byteString) {
        epa_2 a2;
        ByteString b2 = byteString;
        epa_2 epa_22 = a2 = this;
        epa_22.copyOnWrite();
        OPa.J((OPa)((OPa)epa_22.instance), (ByteString)b2);
        return a2;
    }

    public epa clearPlayer() {
        epa_2 a2;
        epa_2 epa_22 = a2;
        epa_22.copyOnWrite();
        OPa.J((OPa)((OPa)epa_22.instance));
        return a2;
    }

    public /* synthetic */ epa_2(DRa dRa) {
        epa_2 b2 = dRa;
        epa_2 a2 = this;
        a2();
    }
}

