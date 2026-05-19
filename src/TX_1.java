/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  vRa
 */
import java.util.concurrent.Callable;
import net.minecraft.block.Block;

public final class TX_1
implements Callable<String> {
    public final /* synthetic */ Block A;
    public final /* synthetic */ Gg I;

    /*
     * WARNING - void declaration
     */
    public TX_1(Gg gg2, Block object) {
        void a2;
        Object b2 = object;
        object = this;
        ((TX_1)object).I = a2;
        ((TX_1)object).A = b2;
        object();
    }

    public String J() throws Exception {
        TX_1 a2;
        try {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = Block.J(a2.A);
            objectArray[vRa.d] = a2.A.J();
            objectArray[uqa.g] = a2.A.getClass().getCanonicalName();
            return String.format(TOa.U, objectArray);
        }
        catch (Throwable throwable) {
            return new StringBuilder().insert(3 & 4, AQa.Fa).append(Block.J(a2.A)).toString();
        }
    }
}

