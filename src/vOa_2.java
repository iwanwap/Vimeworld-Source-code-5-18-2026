/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lpa
 *  Rra
 *  eqa
 *  rPa
 *  vOa
 *  yA
 */
import com.google.protobuf.GeneratedMessageLite;

public final class vOa_2
extends GeneratedMessageLite.Builder<Rra, vOa>
implements yA {
    public vOa setRoomState(int n2) {
        vOa_2 a2;
        int b2 = n2;
        vOa_2 vOa_22 = a2 = this;
        vOa_22.copyOnWrite();
        Rra.J((Rra)((Rra)vOa_22.instance), (int)b2);
        return a2;
    }

    public eqa getData() {
        vOa_2 a2;
        return ((Rra)a2.instance).getData();
    }

    public vOa clearRoomState() {
        vOa_2 a2;
        vOa_2 vOa_22 = a2;
        vOa_22.copyOnWrite();
        Rra.J((Rra)((Rra)vOa_22.instance));
        return a2;
    }

    public boolean hasData() {
        vOa_2 a2;
        return ((Rra)a2.instance).hasData();
    }

    public vOa clearData() {
        vOa_2 a2;
        vOa_2 vOa_22 = a2;
        vOa_22.copyOnWrite();
        Rra.f((Rra)((Rra)vOa_22.instance));
        return a2;
    }

    public vOa setData(eqa eqa2) {
        vOa_2 a2;
        vOa_2 b2 = eqa2;
        vOa_2 vOa_22 = a2 = this;
        vOa_22.copyOnWrite();
        Rra.f((Rra)((Rra)vOa_22.instance), (eqa)b2);
        return a2;
    }

    public vOa mergeData(eqa eqa2) {
        vOa_2 a2;
        vOa_2 b2 = eqa2;
        vOa_2 vOa_22 = a2 = this;
        vOa_22.copyOnWrite();
        Rra.J((Rra)((Rra)vOa_22.instance), (eqa)b2);
        return a2;
    }

    public vOa setData(rPa rPa2) {
        vOa_2 a2;
        vOa_2 b2 = rPa2;
        vOa_2 vOa_22 = a2 = this;
        vOa_22.copyOnWrite();
        Rra.f((Rra)((Rra)vOa_22.instance), (eqa)((eqa)b2.build()));
        return a2;
    }

    private vOa_2() {
        super(Rra.J());
        vOa_2 a2;
    }

    public /* synthetic */ vOa_2(Lpa lpa2) {
        vOa_2 b2 = lpa2;
        vOa_2 a2 = this;
        a2();
    }

    public int getRoomState() {
        vOa_2 a2;
        return ((Rra)a2.instance).getRoomState();
    }
}

