/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  IN
 *  WM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class IN_3
extends GeneratedMessageLite.Builder<WM, IN>
implements Z {
    @Override
    public boolean hasCenter() {
        IN_3 a2;
        return ((WM)a2.instance).hasCenter();
    }

    @Override
    public boolean hasColor() {
        IN_3 a2;
        return ((WM)a2.instance).hasColor();
    }

    public /* synthetic */ IN_3(AN aN2) {
        IN_3 b2 = aN2;
        IN_3 a2 = this;
        a2();
    }

    public IN clearColor() {
        IN_3 a2;
        IN_3 iN_3 = a2;
        iN_3.copyOnWrite();
        WM.l((WM)((WM)iN_3.instance));
        return a2;
    }

    @Override
    public boolean getCenter() {
        IN_3 a2;
        return ((WM)a2.instance).getCenter();
    }

    @Override
    public ByteString getNameBytes() {
        IN_3 a2;
        return ((WM)a2.instance).getNameBytes();
    }

    @Override
    public String getName() {
        IN_3 a2;
        return ((WM)a2.instance).getName();
    }

    public IN setCenter(boolean bl2) {
        IN_3 a2;
        boolean b2 = bl2;
        IN_3 iN_3 = a2 = this;
        iN_3.copyOnWrite();
        WM.J((WM)((WM)iN_3.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean hasWidth() {
        IN_3 a2;
        return ((WM)a2.instance).hasWidth();
    }

    public IN setColor(int n2) {
        IN_3 a2;
        int b2 = n2;
        IN_3 iN_3 = a2 = this;
        iN_3.copyOnWrite();
        WM.J((WM)((WM)iN_3.instance), (int)b2);
        return a2;
    }

    private IN_3() {
        super(WM.J());
        IN_3 a2;
    }

    public IN clearCenter() {
        IN_3 a2;
        IN_3 iN_3 = a2;
        iN_3.copyOnWrite();
        WM.C((WM)((WM)iN_3.instance));
        return a2;
    }

    public IN setName(String string) {
        IN_3 a2;
        String b2 = string;
        IN_3 iN_3 = a2 = this;
        iN_3.copyOnWrite();
        WM.J((WM)((WM)iN_3.instance), (String)b2);
        return a2;
    }

    public IN clearWidth() {
        IN_3 a2;
        IN_3 iN_3 = a2;
        iN_3.copyOnWrite();
        WM.J((WM)((WM)iN_3.instance));
        return a2;
    }

    public IN setWidth(int n2) {
        IN_3 a2;
        int b2 = n2;
        IN_3 iN_3 = a2 = this;
        iN_3.copyOnWrite();
        WM.f((WM)((WM)iN_3.instance), (int)b2);
        return a2;
    }

    @Override
    public int getWidth() {
        IN_3 a2;
        return ((WM)a2.instance).getWidth();
    }

    @Override
    public int getColor() {
        IN_3 a2;
        return ((WM)a2.instance).getColor();
    }

    public IN clearName() {
        IN_3 a2;
        IN_3 iN_3 = a2;
        iN_3.copyOnWrite();
        WM.f((WM)((WM)iN_3.instance));
        return a2;
    }

    public IN setNameBytes(ByteString byteString) {
        IN_3 a2;
        ByteString b2 = byteString;
        IN_3 iN_3 = a2 = this;
        iN_3.copyOnWrite();
        WM.J((WM)((WM)iN_3.instance), (ByteString)b2);
        return a2;
    }
}

