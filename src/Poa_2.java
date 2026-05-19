/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eba
 *  JAa
 *  XLa
 *  iMa
 */
import com.google.common.util.concurrent.FutureCallback;

public final class Poa_2
implements FutureCallback<Object> {
    public final /* synthetic */ XLa I;

    public Poa_2(XLa xLa2) {
        Poa_2 b2 = xLa2;
        Poa_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void onFailure(Throwable throwable) {
        Throwable b2 = throwable;
        Poa_2 a2 = this;
        iMa.J((iMa)a2.I.I.A).J((KC)new JAa(a2.I.I.I, Eba.FAILED_DOWNLOAD));
    }

    @Override
    public void onSuccess(Object object) {
        Object b2 = object;
        Poa_2 a2 = this;
        iMa.J((iMa)a2.I.I.A).J((KC)new JAa(a2.I.I.I, Eba.SUCCESSFULLY_LOADED));
    }
}

