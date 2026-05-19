/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  aB
 *  hn
 *  ym
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class ym_3
extends GeneratedMessageLite.Builder<IO, ym>
implements aB {
    public ym setLongVal(long a2) {
        ym_3 b2;
        ym_3 ym_32 = b2;
        ym_32.copyOnWrite();
        IO.J((IO)ym_32.instance, a2);
        return b2;
    }

    public boolean getBoolVal() {
        ym_3 a2;
        return ((IO)a2.instance).getBoolVal();
    }

    public ym clearFloatVal() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.J((IO)ym_32.instance);
        return a2;
    }

    public ym setName(String string) {
        ym_3 a2;
        String b2 = string;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.f((IO)ym_32.instance, b2);
        return a2;
    }

    public boolean hasBoolVal() {
        ym_3 a2;
        return ((IO)a2.instance).hasBoolVal();
    }

    public String getName() {
        ym_3 a2;
        return ((IO)a2.instance).getName();
    }

    public ym clearName() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.e((IO)ym_32.instance);
        return a2;
    }

    public ym setStringVal(String string) {
        ym_3 a2;
        String b2 = string;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.J((IO)ym_32.instance, b2);
        return a2;
    }

    public ym setNullVal(boolean bl) {
        ym_3 a2;
        boolean b2 = bl;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.J((IO)ym_32.instance, b2);
        return a2;
    }

    public float getFloatVal() {
        ym_3 a2;
        return ((IO)a2.instance).getFloatVal();
    }

    public ym clearBoolVal() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.l((IO)ym_32.instance);
        return a2;
    }

    public boolean hasLongVal() {
        ym_3 a2;
        return ((IO)a2.instance).hasLongVal();
    }

    private ym_3() {
        super(IO.J());
        ym_3 a2;
    }

    public long getLongVal() {
        ym_3 a2;
        return ((IO)a2.instance).getLongVal();
    }

    public ym setBoolVal(boolean bl) {
        ym_3 a2;
        boolean b2 = bl;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.f((IO)ym_32.instance, b2);
        return a2;
    }

    public ym clearStringVal() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.f((IO)ym_32.instance);
        return a2;
    }

    public hn getValueCase() {
        ym_3 a2;
        return ((IO)a2.instance).getValueCase();
    }

    public String getStringVal() {
        ym_3 a2;
        return ((IO)a2.instance).getStringVal();
    }

    public boolean hasFloatVal() {
        ym_3 a2;
        return ((IO)a2.instance).hasFloatVal();
    }

    public ym clearLongVal() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.C((IO)ym_32.instance);
        return a2;
    }

    public ByteString getNameBytes() {
        ym_3 a2;
        return ((IO)a2.instance).getNameBytes();
    }

    public ByteString getStringValBytes() {
        ym_3 a2;
        return ((IO)a2.instance).getStringValBytes();
    }

    public ym clearValue() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.M((IO)ym_32.instance);
        return a2;
    }

    public ym setFloatVal(float f2) {
        ym_3 a2;
        float b2 = f2;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.J((IO)ym_32.instance, b2);
        return a2;
    }

    public boolean getNullVal() {
        ym_3 a2;
        return ((IO)a2.instance).getNullVal();
    }

    public ym setNameBytes(ByteString byteString) {
        ym_3 a2;
        ByteString b2 = byteString;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.f((IO)ym_32.instance, b2);
        return a2;
    }

    public boolean hasNullVal() {
        ym_3 a2;
        return ((IO)a2.instance).hasNullVal();
    }

    public ym clearNullVal() {
        ym_3 a2;
        ym_3 ym_32 = a2;
        ym_32.copyOnWrite();
        IO.d((IO)ym_32.instance);
        return a2;
    }

    public boolean hasStringVal() {
        ym_3 a2;
        return ((IO)a2.instance).hasStringVal();
    }

    public /* synthetic */ ym_3(AN aN2) {
        ym_3 b2 = aN2;
        ym_3 a2 = this;
        a2();
    }

    public ym setStringValBytes(ByteString byteString) {
        ym_3 a2;
        ByteString b2 = byteString;
        ym_3 ym_32 = a2 = this;
        ym_32.copyOnWrite();
        IO.J((IO)ym_32.instance, b2);
        return a2;
    }
}

