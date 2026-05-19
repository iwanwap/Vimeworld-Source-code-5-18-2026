/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  IM
 *  JA
 *  Mo
 *  dM
 *  vM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class IM_1
extends GeneratedMessageLite.Builder<Mo, IM>
implements JA {
    public IM setPromoBytes(ByteString byteString) {
        IM_1 a2;
        ByteString b2 = byteString;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.f((Mo)((Mo)iM_1.instance), (ByteString)b2);
        return a2;
    }

    public boolean hasErrorType() {
        IM_1 a2;
        return ((Mo)a2.instance).hasErrorType();
    }

    public ByteString getPromoBytes() {
        IM_1 a2;
        return ((Mo)a2.instance).getPromoBytes();
    }

    public IM clearPromo() {
        IM_1 a2;
        IM_1 iM_1 = a2;
        iM_1.copyOnWrite();
        Mo.l((Mo)((Mo)iM_1.instance));
        return a2;
    }

    public IM setPromo(String string) {
        IM_1 a2;
        String b2 = string;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.f((Mo)((Mo)iM_1.instance), (String)b2);
        return a2;
    }

    public dM getResultCase() {
        IM_1 a2;
        return ((Mo)a2.instance).getResultCase();
    }

    public IM setSuccess(kN kN2) {
        IM_1 a2;
        GeneratedMessageLite.Builder b2 = kN2;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.J((Mo)((Mo)iM_1.instance), (vM)((vM)b2.build()));
        return a2;
    }

    public IM clearErrorType() {
        IM_1 a2;
        IM_1 iM_1 = a2;
        iM_1.copyOnWrite();
        Mo.f((Mo)((Mo)iM_1.instance));
        return a2;
    }

    public boolean hasSuccess() {
        IM_1 a2;
        return ((Mo)a2.instance).hasSuccess();
    }

    private IM_1() {
        super(Mo.f());
        IM_1 a2;
    }

    public vM getSuccess() {
        IM_1 a2;
        return ((Mo)a2.instance).getSuccess();
    }

    public IM clearResult() {
        IM_1 a2;
        IM_1 iM_1 = a2;
        iM_1.copyOnWrite();
        Mo.C((Mo)((Mo)iM_1.instance));
        return a2;
    }

    public String getPromo() {
        IM_1 a2;
        return ((Mo)a2.instance).getPromo();
    }

    public IM clearSuccess() {
        IM_1 a2;
        IM_1 iM_1 = a2;
        iM_1.copyOnWrite();
        Mo.J((Mo)((Mo)iM_1.instance));
        return a2;
    }

    public IM setErrorTypeBytes(ByteString byteString) {
        IM_1 a2;
        ByteString b2 = byteString;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.J((Mo)((Mo)iM_1.instance), (ByteString)b2);
        return a2;
    }

    public ByteString getErrorTypeBytes() {
        IM_1 a2;
        return ((Mo)a2.instance).getErrorTypeBytes();
    }

    public String getErrorType() {
        IM_1 a2;
        return ((Mo)a2.instance).getErrorType();
    }

    public IM setErrorType(String string) {
        IM_1 a2;
        String b2 = string;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.J((Mo)((Mo)iM_1.instance), (String)b2);
        return a2;
    }

    public IM setSuccess(vM vM2) {
        IM_1 a2;
        IM_1 b2 = vM2;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.J((Mo)((Mo)iM_1.instance), (vM)b2);
        return a2;
    }

    public /* synthetic */ IM_1(AN aN2) {
        IM_1 b2 = aN2;
        IM_1 a2 = this;
        a2();
    }

    public IM mergeSuccess(vM vM2) {
        IM_1 a2;
        IM_1 b2 = vM2;
        IM_1 iM_1 = a2 = this;
        iM_1.copyOnWrite();
        Mo.f((Mo)((Mo)iM_1.instance), (vM)b2);
        return a2;
    }
}

