/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FLa
 *  vRa
 */
import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

public final class zla_1
implements Callable {
    public final /* synthetic */ int j;
    public final /* synthetic */ FLa J;
    private static final String A = "CL_00000950";
    public final /* synthetic */ int I;

    /*
     * WARNING - void declaration
     */
    public zla_1(FLa fLa2, int n2, int n3) {
        void a2;
        int b2 = n3;
        zla_1 zla_12 = this;
        zla_12.J = a2;
        zla_12.j = n2;
        zla_12.I = b2;
    }

    public String J() throws Exception {
        zla_1 a2;
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = a2.j;
        objectArray[vRa.d] = a2.I;
        objectArray[uqa.g] = Mouse.getX();
        objectArray[yRa.d] = Mouse.getY();
        return String.format(xua.h, objectArray);
    }
}

