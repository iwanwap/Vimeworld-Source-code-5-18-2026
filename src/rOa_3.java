/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XA
 *  bra
 *  rOa
 *  wpa
 */
import com.google.protobuf.GeneratedMessageLite;

public final class rOa_3
extends GeneratedMessageLite.Builder<wpa, rOa>
implements XA {
    public rOa setMuted(boolean bl2) {
        rOa_3 a2;
        boolean b2 = bl2;
        rOa_3 rOa_32 = a2 = this;
        rOa_32.copyOnWrite();
        wpa.J((wpa)((wpa)rOa_32.instance), (boolean)b2);
        return a2;
    }

    public boolean getMuted() {
        rOa_3 a2;
        return ((wpa)a2.instance).getMuted();
    }

    public rOa clearRoomState() {
        rOa_3 a2;
        rOa_3 rOa_32 = a2;
        rOa_32.copyOnWrite();
        wpa.f((wpa)((wpa)rOa_32.instance));
        return a2;
    }

    private rOa_3() {
        super(wpa.J());
        rOa_3 a2;
    }

    public /* synthetic */ rOa_3(bra bra2) {
        rOa_3 b2 = bra2;
        rOa_3 a2 = this;
        a2();
    }

    public rOa setRoomState(int n2) {
        rOa_3 a2;
        int b2 = n2;
        rOa_3 rOa_32 = a2 = this;
        rOa_32.copyOnWrite();
        wpa.J((wpa)((wpa)rOa_32.instance), (int)b2);
        return a2;
    }

    public int getRoomState() {
        rOa_3 a2;
        return ((wpa)a2.instance).getRoomState();
    }

    public rOa clearMuted() {
        rOa_3 a2;
        rOa_3 rOa_32 = a2;
        rOa_32.copyOnWrite();
        wpa.J((wpa)((wpa)rOa_32.instance));
        return a2;
    }
}

