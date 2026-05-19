/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  RIa
 *  cja
 *  gka
 *  uka
 */
import com.google.common.util.concurrent.FutureCallback;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class dla
implements FutureCallback<List<Object>> {
    public final /* synthetic */ gka J;
    public final /* synthetic */ mja A;
    public final /* synthetic */ cja I;

    @Override
    public void onFailure(Throwable throwable) {
        dla a2;
        Throwable b2 = throwable;
        dla dla2 = a2 = this;
        mja.J(dla2.A, dla2.J);
        if (!(b2 instanceof CancellationException) && !(b2 instanceof InterruptedException)) {
            Kpa.J().J(RIa.J((Throwable)b2, (String)KPa.b));
        }
    }

    /*
     * WARNING - void declaration
     */
    public dla(mja mja2, gka gka2, cja object) {
        void a2;
        dla b2 = object;
        object = this;
        object.A = a2;
        object.J = gka2;
        object.I = b2;
    }

    public void J(List<Object> list) {
        dla dla2;
        dla a2;
        block5: {
            List<Object> b2 = list;
            dla dla3 = a2 = this;
            mja.J(a2.A, dla3.J);
            dla3.J.J().lock();
            if (a2.J.J() != uka.UPLOADING) break block5;
            a2.J.J(uka.DONE);
            dla2 = a2;
            dla2.J.J().unlock();
        }
        try {
            if (!a2.J.J()) {
                mja.J().warn(new StringBuilder().insert(2 & 5, zOa.s).append(a2.J.J()).append(Pua.u).toString());
            }
            return;
        }
        finally {
            a2.J.J().unlock();
        }
        dla2.J.J().J(a2.I);
    }
}

