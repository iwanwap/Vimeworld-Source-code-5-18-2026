/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  XN
 *  Zn
 *  fO
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Eo
extends GeneratedMessageLite.Builder<XN, Eo>
implements gd {
    @Override
    public fO getEdit() {
        Eo a2;
        return ((XN)a2.instance).getEdit();
    }

    private Eo() {
        super(XN.J());
        Eo a2;
    }

    @Override
    public boolean hasEdit() {
        Eo a2;
        return ((XN)a2.instance).hasEdit();
    }

    public /* synthetic */ Eo(AN aN2) {
        Eo b2 = aN2;
        Eo a2 = this;
        a2();
    }

    public Eo setEdit(fO fO2) {
        Eo a2;
        Eo b2 = fO2;
        Eo eo = a2 = this;
        eo.copyOnWrite();
        XN.f((XN)((XN)eo.instance), (fO)b2);
        return a2;
    }

    public Eo setEdit(Zn zn) {
        Eo a2;
        Eo b2 = zn;
        Eo eo = a2 = this;
        eo.copyOnWrite();
        XN.f((XN)((XN)eo.instance), (fO)((fO)b2.build()));
        return a2;
    }

    public Eo clearEdit() {
        Eo a2;
        Eo eo = a2;
        eo.copyOnWrite();
        XN.J((XN)((XN)eo.instance));
        return a2;
    }

    public Eo mergeEdit(fO fO2) {
        Eo a2;
        Eo b2 = fO2;
        Eo eo = a2 = this;
        eo.copyOnWrite();
        XN.J((XN)((XN)eo.instance), (fO)b2);
        return a2;
    }
}

