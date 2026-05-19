/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rqa
 *  fra
 *  nPa
 */
import com.google.protobuf.GeneratedMessageLite;

public final class fra_2
extends GeneratedMessageLite.Builder<Rqa, fra>
implements Dd {
    @Override
    public int getRequiredVersion() {
        fra_2 a2;
        return ((Rqa)a2.instance).getRequiredVersion();
    }

    public fra setRequiredVersion(int n2) {
        fra_2 a2;
        int b2 = n2;
        fra_2 fra_22 = a2 = this;
        fra_22.copyOnWrite();
        Rqa.J((Rqa)((Rqa)fra_22.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ fra_2(nPa nPa2) {
        fra_2 b2 = nPa2;
        fra_2 a2 = this;
        a2();
    }

    public fra clearRequiredVersion() {
        fra_2 a2;
        fra_2 fra_22 = a2;
        fra_22.copyOnWrite();
        Rqa.J((Rqa)((Rqa)fra_22.instance));
        return a2;
    }

    private fra_2() {
        super(Rqa.J());
        fra_2 a2;
    }
}

