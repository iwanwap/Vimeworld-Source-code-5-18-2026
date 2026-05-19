/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Tc
 *  VN
 *  gm
 *  oN
 */
import com.google.protobuf.GeneratedMessageLite;

public final class oN_2
extends GeneratedMessageLite.Builder<aO, oN>
implements Tc {
    public oN clearId() {
        oN_2 a2;
        oN_2 oN_22 = a2;
        oN_22.copyOnWrite();
        aO.f((aO)oN_22.instance);
        return a2;
    }

    public /* synthetic */ oN_2(AN aN2) {
        oN_2 b2 = aN2;
        oN_2 a2 = this;
        a2();
    }

    public oN setClear(boolean bl) {
        oN_2 a2;
        boolean b2 = bl;
        oN_2 oN_22 = a2 = this;
        oN_22.copyOnWrite();
        aO.J((aO)oN_22.instance, b2);
        return a2;
    }

    public oN setOptions(VN vN2) {
        oN_2 a2;
        oN_2 b2 = vN2;
        oN_2 oN_22 = a2 = this;
        oN_22.copyOnWrite();
        aO.J((aO)oN_22.instance, (VN)b2);
        return a2;
    }

    public boolean hasClear() {
        oN_2 a2;
        return ((aO)a2.instance).hasClear();
    }

    private oN_2() {
        super(aO.J());
        oN_2 a2;
    }

    public oN clearClear() {
        oN_2 a2;
        oN_2 oN_22 = a2;
        oN_22.copyOnWrite();
        aO.l((aO)oN_22.instance);
        return a2;
    }

    public oN clearOptions() {
        oN_2 a2;
        oN_2 oN_22 = a2;
        oN_22.copyOnWrite();
        aO.J((aO)oN_22.instance);
        return a2;
    }

    public oN setId(int n2) {
        oN_2 a2;
        int b2 = n2;
        oN_2 oN_22 = a2 = this;
        oN_22.copyOnWrite();
        aO.J((aO)oN_22.instance, b2);
        return a2;
    }

    public VN getOptions() {
        oN_2 a2;
        return ((aO)a2.instance).getOptions();
    }

    public boolean hasOptions() {
        oN_2 a2;
        return ((aO)a2.instance).hasOptions();
    }

    public int getId() {
        oN_2 a2;
        return ((aO)a2.instance).getId();
    }

    public oN setOptions(gm gm2) {
        oN_2 a2;
        oN_2 b2 = gm2;
        oN_2 oN_22 = a2 = this;
        oN_22.copyOnWrite();
        aO.J((aO)oN_22.instance, (VN)b2.build());
        return a2;
    }

    public oN mergeOptions(VN vN2) {
        oN_2 a2;
        oN_2 b2 = vN2;
        oN_2 oN_22 = a2 = this;
        oN_22.copyOnWrite();
        aO.f((aO)oN_22.instance, (VN)b2);
        return a2;
    }

    public boolean getClear() {
        oN_2 a2;
        return ((aO)a2.instance).getClear();
    }
}

