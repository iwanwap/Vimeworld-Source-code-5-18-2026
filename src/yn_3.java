/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Db
 *  NM
 *  fm
 *  yn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class yn_3
extends GeneratedMessageLite.Builder<NM, yn>
implements Db {
    public yn setIdBytes(ByteString byteString) {
        yn_3 a2;
        ByteString b2 = byteString;
        yn_3 yn_32 = a2 = this;
        yn_32.copyOnWrite();
        NM.J((NM)((NM)yn_32.instance), (ByteString)b2);
        return a2;
    }

    public yn mergeEdit(fm fm2) {
        yn_3 a2;
        yn_3 b2 = fm2;
        yn_3 yn_32 = a2 = this;
        yn_32.copyOnWrite();
        NM.J((NM)((NM)yn_32.instance), (fm)b2);
        return a2;
    }

    public fm getEdit() {
        yn_3 a2;
        return ((NM)a2.instance).getEdit();
    }

    private yn_3() {
        super(NM.f());
        yn_3 a2;
    }

    public yn clearId() {
        yn_3 a2;
        yn_3 yn_32 = a2;
        yn_32.copyOnWrite();
        NM.J((NM)((NM)yn_32.instance));
        return a2;
    }

    public boolean hasEdit() {
        yn_3 a2;
        return ((NM)a2.instance).hasEdit();
    }

    public /* synthetic */ yn_3(AN aN2) {
        yn_3 b2 = aN2;
        yn_3 a2 = this;
        a2();
    }

    public yn clearEdit() {
        yn_3 a2;
        yn_3 yn_32 = a2;
        yn_32.copyOnWrite();
        NM.f((NM)((NM)yn_32.instance));
        return a2;
    }

    public yn setId(String string) {
        yn_3 a2;
        String b2 = string;
        yn_3 yn_32 = a2 = this;
        yn_32.copyOnWrite();
        NM.J((NM)((NM)yn_32.instance), (String)b2);
        return a2;
    }

    public yn setEdit(xo xo2) {
        yn_3 a2;
        GeneratedMessageLite.Builder b2 = xo2;
        yn_3 yn_32 = a2 = this;
        yn_32.copyOnWrite();
        NM.f((NM)((NM)yn_32.instance), (fm)((fm)b2.build()));
        return a2;
    }

    public ByteString getIdBytes() {
        yn_3 a2;
        return ((NM)a2.instance).getIdBytes();
    }

    public String getId() {
        yn_3 a2;
        return ((NM)a2.instance).getId();
    }

    public yn setEdit(fm fm2) {
        yn_3 a2;
        yn_3 b2 = fm2;
        yn_3 yn_32 = a2 = this;
        yn_32.copyOnWrite();
        NM.f((NM)((NM)yn_32.instance), (fm)b2);
        return a2;
    }
}

