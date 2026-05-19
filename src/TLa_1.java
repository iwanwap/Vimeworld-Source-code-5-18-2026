/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eba
 *  JAa
 *  iMa
 */
import com.google.common.util.concurrent.FutureCallback;

public final class TLa_1
implements FutureCallback<Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ iMa I;

    @Override
    public void onSuccess(Object object) {
        Object b2 = object;
        TLa_1 a2 = this;
        iMa.J((iMa)a2.I).J((KC)new JAa(a2.A, Eba.SUCCESSFULLY_LOADED));
    }

    /*
     * WARNING - void declaration
     */
    public TLa_1(iMa iMa2, String object) {
        void a2;
        Object b2 = object;
        object = this;
        ((TLa_1)object).I = a2;
        ((TLa_1)object).A = b2;
        object();
    }

    @Override
    public void onFailure(Throwable throwable) {
        Throwable b2 = throwable;
        TLa_1 a2 = this;
        iMa.J((iMa)a2.I).J((KC)new JAa(a2.A, Eba.FAILED_DOWNLOAD));
    }
}

