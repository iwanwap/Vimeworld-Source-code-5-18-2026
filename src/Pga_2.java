/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dGa
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

public final class Pga_2
implements FutureCallback<Object> {
    public final /* synthetic */ dGa J;
    public final /* synthetic */ File A;
    public final /* synthetic */ SettableFuture I;

    @Override
    public void onSuccess(Object object) {
        Pga_2 a2;
        Object b2 = object;
        Pga_2 pga_2 = a2 = this;
        pga_2.J.J(pga_2.A);
        a2.I.set(null);
    }

    /*
     * WARNING - void declaration
     */
    public Pga_2(dGa dGa2, File file, SettableFuture object) {
        void a2;
        Object b2 = object;
        object = this;
        ((Pga_2)object).J = a2;
        ((Pga_2)object).A = file;
        ((Pga_2)object).I = b2;
        object();
    }

    @Override
    public void onFailure(Throwable throwable) {
        Throwable b2 = throwable;
        Pga_2 a2 = this;
        a2.I.setException(b2);
    }
}

