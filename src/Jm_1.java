/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Do
 *  Jm
 *  Jo
 *  XM
 *  Zn
 *  bN
 *  fO
 *  na
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Jm_1
extends GeneratedMessageLite.Builder<bN, Jm>
implements na {
    public Jm clearAdd() {
        Jm_1 a2;
        Jm_1 jm_1 = a2;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance));
        return a2;
    }

    public Jm mergeAdd(XM xM2) {
        Jm_1 a2;
        Jm_1 b2 = xM2;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (XM)b2);
        return a2;
    }

    public int getKindValue() {
        Jm_1 a2;
        return ((bN)a2.instance).getKindValue();
    }

    public Jm setKindValue(int n2) {
        Jm_1 a2;
        int b2 = n2;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (int)b2);
        return a2;
    }

    public Do getKind() {
        Jm_1 a2;
        return ((bN)a2.instance).getKind();
    }

    public boolean hasEdit() {
        Jm_1 a2;
        return ((bN)a2.instance).hasEdit();
    }

    public Jm mergeEdit(fO fO2) {
        Jm_1 a2;
        Jm_1 b2 = fO2;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.f((bN)((bN)jm_1.instance), (fO)b2);
        return a2;
    }

    public String getRemove() {
        Jm_1 a2;
        return ((bN)a2.instance).getRemove();
    }

    public boolean hasRemoveUuid() {
        Jm_1 a2;
        return ((bN)a2.instance).hasRemoveUuid();
    }

    public XM getAdd() {
        Jm_1 a2;
        return ((bN)a2.instance).getAdd();
    }

    public Jm setRemove(String string) {
        Jm_1 a2;
        String b2 = string;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (String)b2);
        return a2;
    }

    public Jm clearEdit() {
        Jm_1 a2;
        Jm_1 jm_1 = a2;
        jm_1.copyOnWrite();
        bN.e((bN)((bN)jm_1.instance));
        return a2;
    }

    public Jm setRemoveUuid(ByteString byteString) {
        Jm_1 a2;
        ByteString b2 = byteString;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.f((bN)((bN)jm_1.instance), (ByteString)b2);
        return a2;
    }

    public Jm setAdd(Jo jo) {
        Jm_1 a2;
        Jm_1 b2 = jo;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.f((bN)((bN)jm_1.instance), (XM)((XM)b2.build()));
        return a2;
    }

    public boolean hasRemove() {
        Jm_1 a2;
        return ((bN)a2.instance).hasRemove();
    }

    public Jm clearRemoveUuid() {
        Jm_1 a2;
        Jm_1 jm_1 = a2;
        jm_1.copyOnWrite();
        bN.f((bN)((bN)jm_1.instance));
        return a2;
    }

    public boolean hasAdd() {
        Jm_1 a2;
        return ((bN)a2.instance).hasAdd();
    }

    public Jm setKind(Do do_) {
        Jm_1 a2;
        Jm_1 b2 = do_;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (Do)b2);
        return a2;
    }

    public fO getEdit() {
        Jm_1 a2;
        return ((bN)a2.instance).getEdit();
    }

    public Jm clearData() {
        Jm_1 a2;
        Jm_1 jm_1 = a2;
        jm_1.copyOnWrite();
        bN.l((bN)((bN)jm_1.instance));
        return a2;
    }

    public ByteString getRemoveBytes() {
        Jm_1 a2;
        return ((bN)a2.instance).getRemoveBytes();
    }

    public Jm setEdit(Zn zn) {
        Jm_1 a2;
        Jm_1 b2 = zn;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (fO)((fO)b2.build()));
        return a2;
    }

    public Jm clearKind() {
        Jm_1 a2;
        Jm_1 jm_1 = a2;
        jm_1.copyOnWrite();
        bN.C((bN)((bN)jm_1.instance));
        return a2;
    }

    private Jm_1() {
        super(bN.f());
        Jm_1 a2;
    }

    public iM getDataCase() {
        Jm_1 a2;
        return ((bN)a2.instance).getDataCase();
    }

    public Jm setAdd(XM xM2) {
        Jm_1 a2;
        Jm_1 b2 = xM2;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.f((bN)((bN)jm_1.instance), (XM)b2);
        return a2;
    }

    public Jm setRemoveBytes(ByteString byteString) {
        Jm_1 a2;
        ByteString b2 = byteString;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (ByteString)b2);
        return a2;
    }

    public /* synthetic */ Jm_1(AN aN2) {
        Jm_1 b2 = aN2;
        Jm_1 a2 = this;
        a2();
    }

    public ByteString getRemoveUuid() {
        Jm_1 a2;
        return ((bN)a2.instance).getRemoveUuid();
    }

    public Jm clearRemove() {
        Jm_1 a2;
        Jm_1 jm_1 = a2;
        jm_1.copyOnWrite();
        bN.d((bN)((bN)jm_1.instance));
        return a2;
    }

    public Jm setEdit(fO fO2) {
        Jm_1 a2;
        Jm_1 b2 = fO2;
        Jm_1 jm_1 = a2 = this;
        jm_1.copyOnWrite();
        bN.J((bN)((bN)jm_1.instance), (fO)b2);
        return a2;
    }
}

