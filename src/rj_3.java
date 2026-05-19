/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DJ
 *  Jo
 *  Ul
 *  XM
 *  Zn
 *  fO
 *  rj
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class rj_3
extends GeneratedMessageLite.Builder<CL, rj>
implements R {
    public rj setEdit(fO fO2) {
        rj_3 a2;
        rj_3 b2 = fO2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, (fO)b2);
        return a2;
    }

    public rj setKind(Ul ul2) {
        rj_3 a2;
        rj_3 b2 = ul2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, (Ul)b2);
        return a2;
    }

    @Override
    public DJ getDataCase() {
        rj_3 a2;
        return ((CL)a2.instance).getDataCase();
    }

    public rj setRemoveBytes(ByteString byteString) {
        rj_3 a2;
        ByteString b2 = byteString;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, b2);
        return a2;
    }

    @Override
    public String getRemove() {
        rj_3 a2;
        return ((CL)a2.instance).getRemove();
    }

    private rj_3() {
        super(CL.f());
        rj_3 a2;
    }

    @Override
    public int getKindValue() {
        rj_3 a2;
        return ((CL)a2.instance).getKindValue();
    }

    public rj clearEdit() {
        rj_3 a2;
        rj_3 rj_32 = a2;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance);
        return a2;
    }

    @Override
    public boolean hasAdd() {
        rj_3 a2;
        return ((CL)a2.instance).hasAdd();
    }

    public rj setAdd(Jo jo2) {
        rj_3 a2;
        rj_3 b2 = jo2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.f((CL)rj_32.instance, (XM)b2.build());
        return a2;
    }

    public rj mergeAdd(XM xM2) {
        rj_3 a2;
        rj_3 b2 = xM2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, (XM)b2);
        return a2;
    }

    public /* synthetic */ rj_3(AN aN2) {
        rj_3 b2 = aN2;
        rj_3 a2 = this;
        a2();
    }

    public rj clearRemove() {
        rj_3 a2;
        rj_3 rj_32 = a2;
        rj_32.copyOnWrite();
        CL.f((CL)rj_32.instance);
        return a2;
    }

    public rj setAdd(XM xM2) {
        rj_3 a2;
        rj_3 b2 = xM2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.f((CL)rj_32.instance, (XM)b2);
        return a2;
    }

    @Override
    public XM getAdd() {
        rj_3 a2;
        return ((CL)a2.instance).getAdd();
    }

    public rj clearAdd() {
        rj_3 a2;
        rj_3 rj_32 = a2;
        rj_32.copyOnWrite();
        CL.d((CL)rj_32.instance);
        return a2;
    }

    public rj setEdit(Zn zn2) {
        rj_3 a2;
        rj_3 b2 = zn2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, (fO)b2.build());
        return a2;
    }

    @Override
    public ByteString getRemoveBytes() {
        rj_3 a2;
        return ((CL)a2.instance).getRemoveBytes();
    }

    @Override
    public fO getEdit() {
        rj_3 a2;
        return ((CL)a2.instance).getEdit();
    }

    @Override
    public Ul getKind() {
        rj_3 a2;
        return ((CL)a2.instance).getKind();
    }

    public rj mergeEdit(fO fO2) {
        rj_3 a2;
        rj_3 b2 = fO2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.f((CL)rj_32.instance, (fO)b2);
        return a2;
    }

    @Override
    public boolean hasRemove() {
        rj_3 a2;
        return ((CL)a2.instance).hasRemove();
    }

    @Override
    public boolean hasEdit() {
        rj_3 a2;
        return ((CL)a2.instance).hasEdit();
    }

    public rj clearKind() {
        rj_3 a2;
        rj_3 rj_32 = a2;
        rj_32.copyOnWrite();
        CL.l((CL)rj_32.instance);
        return a2;
    }

    public rj setKindValue(int n2) {
        rj_3 a2;
        int b2 = n2;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, b2);
        return a2;
    }

    public rj setRemove(String string) {
        rj_3 a2;
        String b2 = string;
        rj_3 rj_32 = a2 = this;
        rj_32.copyOnWrite();
        CL.J((CL)rj_32.instance, b2);
        return a2;
    }

    public rj clearData() {
        rj_3 a2;
        rj_3 rj_32 = a2;
        rj_32.copyOnWrite();
        CL.C((CL)rj_32.instance);
        return a2;
    }
}

