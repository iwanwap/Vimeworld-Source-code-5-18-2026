/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DM
 *  Nn
 *  SO
 *  fa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class SO_1
extends GeneratedMessageLite.Builder<Nn, SO>
implements fa {
    public SO setSize(float f2) {
        SO_1 a2;
        float b2 = f2;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.f((Nn)((Nn)sO_1.instance), (float)b2);
        return a2;
    }

    public SO clearValue() {
        SO_1 a2;
        SO_1 sO_1 = a2;
        sO_1.copyOnWrite();
        Nn.e((Nn)((Nn)sO_1.instance));
        return a2;
    }

    private SO_1() {
        super(Nn.J());
        SO_1 a2;
    }

    public boolean hasSize() {
        SO_1 a2;
        return ((Nn)a2.instance).hasSize();
    }

    public float getSizeAnim() {
        SO_1 a2;
        return ((Nn)a2.instance).getSizeAnim();
    }

    public SO setValue(float f2) {
        SO_1 a2;
        float b2 = f2;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.l((Nn)((Nn)sO_1.instance), (float)b2);
        return a2;
    }

    public SO clearSize() {
        SO_1 a2;
        SO_1 sO_1 = a2;
        sO_1.copyOnWrite();
        Nn.d((Nn)((Nn)sO_1.instance));
        return a2;
    }

    public SO setSizeExprAnimBytes(ByteString byteString) {
        SO_1 a2;
        ByteString b2 = byteString;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.J((Nn)((Nn)sO_1.instance), (ByteString)b2);
        return a2;
    }

    public float getSize() {
        SO_1 a2;
        return ((Nn)a2.instance).getSize();
    }

    public String getSizeExprAnim() {
        SO_1 a2;
        return ((Nn)a2.instance).getSizeExprAnim();
    }

    public SO clearSizeExpr() {
        SO_1 a2;
        SO_1 sO_1 = a2;
        sO_1.copyOnWrite();
        Nn.f((Nn)((Nn)sO_1.instance));
        return a2;
    }

    public boolean hasSizeExprAnim() {
        SO_1 a2;
        return ((Nn)a2.instance).hasSizeExprAnim();
    }

    public SO setSizeExprAnim(String string) {
        SO_1 a2;
        String b2 = string;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.f((Nn)((Nn)sO_1.instance), (String)b2);
        return a2;
    }

    public SO setSizeExpr(String string) {
        SO_1 a2;
        String b2 = string;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.J((Nn)((Nn)sO_1.instance), (String)b2);
        return a2;
    }

    public SO clearSizeExprAnim() {
        SO_1 a2;
        SO_1 sO_1 = a2;
        sO_1.copyOnWrite();
        Nn.l((Nn)((Nn)sO_1.instance));
        return a2;
    }

    public SO setSizeAnim(float f2) {
        SO_1 a2;
        float b2 = f2;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.J((Nn)((Nn)sO_1.instance), (float)b2);
        return a2;
    }

    public ByteString getSizeExprAnimBytes() {
        SO_1 a2;
        return ((Nn)a2.instance).getSizeExprAnimBytes();
    }

    public boolean hasSizeAnim() {
        SO_1 a2;
        return ((Nn)a2.instance).hasSizeAnim();
    }

    public SO clearSizeAnim() {
        SO_1 a2;
        SO_1 sO_1 = a2;
        sO_1.copyOnWrite();
        Nn.J((Nn)((Nn)sO_1.instance));
        return a2;
    }

    public DM getSizevalCase() {
        SO_1 a2;
        return ((Nn)a2.instance).getSizevalCase();
    }

    public float getValue() {
        SO_1 a2;
        return ((Nn)a2.instance).getValue();
    }

    public ByteString getSizeExprBytes() {
        SO_1 a2;
        return ((Nn)a2.instance).getSizeExprBytes();
    }

    public boolean hasValue() {
        SO_1 a2;
        return ((Nn)a2.instance).hasValue();
    }

    public String getSizeExpr() {
        SO_1 a2;
        return ((Nn)a2.instance).getSizeExpr();
    }

    public /* synthetic */ SO_1(AN aN2) {
        SO_1 b2 = aN2;
        SO_1 a2 = this;
        a2();
    }

    public SO setSizeExprBytes(ByteString byteString) {
        SO_1 a2;
        ByteString b2 = byteString;
        SO_1 sO_1 = a2 = this;
        sO_1.copyOnWrite();
        Nn.f((Nn)((Nn)sO_1.instance), (ByteString)b2);
        return a2;
    }

    public SO clearSizeval() {
        SO_1 a2;
        SO_1 sO_1 = a2;
        sO_1.copyOnWrite();
        Nn.C((Nn)((Nn)sO_1.instance));
        return a2;
    }

    public boolean hasSizeExpr() {
        SO_1 a2;
        return ((Nn)a2.instance).hasSizeExpr();
    }
}

