/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aqa
 *  DB
 *  Kra
 *  OOa
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Kra_1
extends GeneratedMessageLite.Builder<OOa, Kra>
implements DB {
    public boolean getMicroExists() {
        Kra_1 a2;
        return ((OOa)a2.instance).getMicroExists();
    }

    public Kra setProtocolVersion(int n2) {
        Kra_1 a2;
        int b2 = n2;
        Kra_1 kra_1 = a2 = this;
        kra_1.copyOnWrite();
        OOa.J((OOa)((OOa)kra_1.instance), (int)b2);
        return a2;
    }

    public Kra clearProtocolVersion() {
        Kra_1 a2;
        Kra_1 kra_1 = a2;
        kra_1.copyOnWrite();
        OOa.l((OOa)((OOa)kra_1.instance));
        return a2;
    }

    public Kra setMicroExists(boolean bl) {
        Kra_1 a2;
        boolean b2 = bl;
        Kra_1 kra_1 = a2 = this;
        kra_1.copyOnWrite();
        OOa.J((OOa)((OOa)kra_1.instance), (boolean)b2);
        return a2;
    }

    public Kra clearMicroDisabled() {
        Kra_1 a2;
        Kra_1 kra_1 = a2;
        kra_1.copyOnWrite();
        OOa.J((OOa)((OOa)kra_1.instance));
        return a2;
    }

    public int getProtocolVersion() {
        Kra_1 a2;
        return ((OOa)a2.instance).getProtocolVersion();
    }

    public Kra setMicroDisabled(boolean bl) {
        Kra_1 a2;
        boolean b2 = bl;
        Kra_1 kra_1 = a2 = this;
        kra_1.copyOnWrite();
        OOa.f((OOa)((OOa)kra_1.instance), (boolean)b2);
        return a2;
    }

    public Kra clearMicroExists() {
        Kra_1 a2;
        Kra_1 kra_1 = a2;
        kra_1.copyOnWrite();
        OOa.f((OOa)((OOa)kra_1.instance));
        return a2;
    }

    public boolean getMicroDisabled() {
        Kra_1 a2;
        return ((OOa)a2.instance).getMicroDisabled();
    }

    public /* synthetic */ Kra_1(Aqa aqa) {
        Kra_1 b2 = aqa;
        Kra_1 a2 = this;
        a2();
    }

    private Kra_1() {
        super(OOa.f());
        Kra_1 a2;
    }
}

