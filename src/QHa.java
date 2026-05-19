/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RIa
 *  lqa
 */
import java.util.concurrent.Callable;

public final class QHa
implements Callable<String> {
    public final /* synthetic */ RIa I;

    public QHa(RIa rIa2) {
        QHa b2 = rIa2;
        QHa a2 = this;
        a2.I = b2;
    }

    public String J() {
        return new StringBuilder().insert(3 ^ 3, System.getProperty(lqa.Ga)).append(TOa.n).append(System.getProperty(Fua.i)).toString();
    }
}

