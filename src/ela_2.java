/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FLa
 *  RPa
 *  sMa
 *  vRa
 */
import java.util.concurrent.Callable;

public final class ela_2
implements Callable {
    public final /* synthetic */ sMa J;
    private static final String A = "CL_00000951";
    public final /* synthetic */ FLa I;

    /*
     * WARNING - void declaration
     */
    public ela_2(FLa fLa, sMa object) {
        void a2;
        ela_2 b2 = object;
        object = this;
        object.I = a2;
        object.J = b2;
    }

    public String J() throws Exception {
        ela_2 a2;
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = a2.J.f();
        objectArray[vRa.d] = a2.J.J();
        objectArray[uqa.g] = FLa.J((FLa)a2.I).t;
        objectArray[yRa.d] = FLa.J((FLa)a2.I).k;
        objectArray[AQa.P] = a2.J.l();
        return String.format(RPa.ba, objectArray);
    }
}

