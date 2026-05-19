/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eba
 *  JAa
 *  iMa
 */
import com.google.common.util.concurrent.FutureCallback;

public final class uma_3
implements FutureCallback<Object> {
    public final /* synthetic */ iMa A;
    public final /* synthetic */ String I;

    @Override
    public void onFailure(Throwable throwable) {
        Throwable b2 = throwable;
        uma_3 a2 = this;
        iMa.J((iMa)a2.A).J((KC)new JAa(a2.I, Eba.FAILED_DOWNLOAD));
    }

    /*
     * WARNING - void declaration
     */
    public uma_3(iMa iMa2, String object) {
        void a2;
        Object b2 = object;
        object = this;
        ((uma_3)object).A = a2;
        ((uma_3)object).I = b2;
        object();
    }

    @Override
    public void onSuccess(Object object) {
        Object b2 = object;
        uma_3 a2 = this;
        iMa.J((iMa)a2.A).J((KC)new JAa(a2.I, Eba.SUCCESSFULLY_LOADED));
    }
}

