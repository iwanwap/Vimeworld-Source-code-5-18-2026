/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.util.concurrent.Callable;
import net.minecraft.block.Block;

public final class Zha_1
implements Callable<String> {
    public final /* synthetic */ int A;
    public final /* synthetic */ Block I;

    public String J() throws Exception {
        Zha_1 a2;
        try {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a2.A;
            objectArray[vRa.d] = a2.I.J();
            objectArray[uqa.g] = a2.I.getClass().getCanonicalName();
            return String.format(TOa.U, objectArray);
        }
        catch (Throwable throwable) {
            return new StringBuilder().insert(3 >> 2, AQa.Fa).append(a2.A).toString();
        }
    }

    public Zha_1(int n2, Block object) {
        Object a2 = object;
        object = this;
        ((Zha_1)object).A = n2;
        ((Zha_1)object).I = a2;
        object();
    }
}

