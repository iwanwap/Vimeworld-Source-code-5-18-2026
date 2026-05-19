/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Io
 *  Lm
 *  MO
 *  OM
 *  p
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class OM_2
extends GeneratedMessageLite.Builder<Io, OM>
implements p {
    public OM clearRowId() {
        OM_2 a2;
        OM_2 oM_2 = a2;
        oM_2.copyOnWrite();
        Io.J((Io)((Io)oM_2.instance));
        return a2;
    }

    public boolean hasRow() {
        OM_2 a2;
        return ((Io)a2.instance).hasRow();
    }

    public OM setKindValue(int n2) {
        OM_2 a2;
        int b2 = n2;
        OM_2 oM_2 = a2 = this;
        oM_2.copyOnWrite();
        Io.J((Io)((Io)oM_2.instance), (int)b2);
        return a2;
    }

    public boolean hasRowId() {
        OM_2 a2;
        return ((Io)a2.instance).hasRowId();
    }

    public OM mergeRow(An an2) {
        OM_2 a2;
        MessageLiteOrBuilder b2 = an2;
        OM_2 oM_2 = a2 = this;
        oM_2.copyOnWrite();
        Io.f((Io)((Io)oM_2.instance), (An)b2);
        return a2;
    }

    public MO getKind() {
        OM_2 a2;
        return ((Io)a2.instance).getKind();
    }

    public OM clearKind() {
        OM_2 a2;
        OM_2 oM_2 = a2;
        oM_2.copyOnWrite();
        Io.l((Io)((Io)oM_2.instance));
        return a2;
    }

    public An getRow() {
        OM_2 a2;
        return ((Io)a2.instance).getRow();
    }

    public OM setRow(An an2) {
        OM_2 a2;
        MessageLiteOrBuilder b2 = an2;
        OM_2 oM_2 = a2 = this;
        oM_2.copyOnWrite();
        Io.J((Io)((Io)oM_2.instance), (An)b2);
        return a2;
    }

    public OM setRowId(int n2) {
        OM_2 a2;
        int b2 = n2;
        OM_2 oM_2 = a2 = this;
        oM_2.copyOnWrite();
        Io.f((Io)((Io)oM_2.instance), (int)b2);
        return a2;
    }

    public OM setKind(MO mO2) {
        OM_2 a2;
        OM_2 b2 = mO2;
        OM_2 oM_2 = a2 = this;
        oM_2.copyOnWrite();
        Io.J((Io)((Io)oM_2.instance), (MO)b2);
        return a2;
    }

    public OM setRow(Lm lm2) {
        OM_2 a2;
        OM_2 b2 = lm2;
        OM_2 oM_2 = a2 = this;
        oM_2.copyOnWrite();
        Io.J((Io)((Io)oM_2.instance), (An)((An)b2.build()));
        return a2;
    }

    public /* synthetic */ OM_2(AN aN2) {
        OM_2 b2 = aN2;
        OM_2 a2 = this;
        a2();
    }

    public int getRowId() {
        OM_2 a2;
        return ((Io)a2.instance).getRowId();
    }

    public OM clearRow() {
        OM_2 a2;
        OM_2 oM_2 = a2;
        oM_2.copyOnWrite();
        Io.f((Io)((Io)oM_2.instance));
        return a2;
    }

    private OM_2() {
        super(Io.f());
        OM_2 a2;
    }

    public int getKindValue() {
        OM_2 a2;
        return ((Io)a2.instance).getKindValue();
    }
}

