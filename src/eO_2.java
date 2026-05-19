/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  bM
 *  eO
 *  pn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class eO_2
extends GeneratedMessageLite.Builder<pn, eO>
implements ua {
    public eO clearPath() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.d((pn)((pn)eO_22.instance));
        return a2;
    }

    private eO_2() {
        super(pn.f());
        eO_2 a2;
    }

    @Override
    public boolean hasSize() {
        eO_2 a2;
        return ((pn)a2.instance).hasSize();
    }

    public eO setAntiAlias(boolean bl) {
        eO_2 a2;
        boolean b2 = bl;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.J((pn)((pn)eO_22.instance), (boolean)b2);
        return a2;
    }

    public eO clearSize() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.l((pn)((pn)eO_22.instance));
        return a2;
    }

    @Override
    public boolean getBlur() {
        eO_2 a2;
        return ((pn)a2.instance).getBlur();
    }

    @Override
    public boolean hasPath() {
        eO_2 a2;
        return ((pn)a2.instance).hasPath();
    }

    @Override
    public ByteString getPathBytes() {
        eO_2 a2;
        return ((pn)a2.instance).getPathBytes();
    }

    public eO setPathBytes(ByteString byteString) {
        eO_2 a2;
        ByteString b2 = byteString;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.J((pn)((pn)eO_22.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean getAntiAlias() {
        eO_2 a2;
        return ((pn)a2.instance).getAntiAlias();
    }

    public eO clearBlur() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.e((pn)((pn)eO_22.instance));
        return a2;
    }

    @Override
    public bM getFontCase() {
        eO_2 a2;
        return ((pn)a2.instance).getFontCase();
    }

    public eO clearResource() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.J((pn)((pn)eO_22.instance));
        return a2;
    }

    @Override
    public int getSize() {
        eO_2 a2;
        return ((pn)a2.instance).getSize();
    }

    @Override
    public int getResource() {
        eO_2 a2;
        return ((pn)a2.instance).getResource();
    }

    @Override
    public boolean getFractionalMetrics() {
        eO_2 a2;
        return ((pn)a2.instance).getFractionalMetrics();
    }

    public eO setPath(String string) {
        eO_2 a2;
        String b2 = string;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.J((pn)((pn)eO_22.instance), (String)b2);
        return a2;
    }

    @Override
    public boolean hasResource() {
        eO_2 a2;
        return ((pn)a2.instance).hasResource();
    }

    @Override
    public String getPath() {
        eO_2 a2;
        return ((pn)a2.instance).getPath();
    }

    public eO clearAntiAlias() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.f((pn)((pn)eO_22.instance));
        return a2;
    }

    public eO clearFractionalMetrics() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.M((pn)((pn)eO_22.instance));
        return a2;
    }

    public /* synthetic */ eO_2(AN aN2) {
        eO_2 b2 = aN2;
        eO_2 a2 = this;
        a2();
    }

    public eO setResource(int n2) {
        eO_2 a2;
        int b2 = n2;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.f((pn)((pn)eO_22.instance), (int)b2);
        return a2;
    }

    public eO setBlur(boolean bl) {
        eO_2 a2;
        boolean b2 = bl;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.f((pn)((pn)eO_22.instance), (boolean)b2);
        return a2;
    }

    public eO setSize(int n2) {
        eO_2 a2;
        int b2 = n2;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.J((pn)((pn)eO_22.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasFractionalMetrics() {
        eO_2 a2;
        return ((pn)a2.instance).hasFractionalMetrics();
    }

    @Override
    public boolean hasBlur() {
        eO_2 a2;
        return ((pn)a2.instance).hasBlur();
    }

    public eO setFractionalMetrics(boolean bl) {
        eO_2 a2;
        boolean b2 = bl;
        eO_2 eO_22 = a2 = this;
        eO_22.copyOnWrite();
        pn.l((pn)((pn)eO_22.instance), (boolean)b2);
        return a2;
    }

    public eO clearFont() {
        eO_2 a2;
        eO_2 eO_22 = a2;
        eO_22.copyOnWrite();
        pn.C((pn)((pn)eO_22.instance));
        return a2;
    }

    @Override
    public boolean hasAntiAlias() {
        eO_2 a2;
        return ((pn)a2.instance).hasAntiAlias();
    }
}

