/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  vRa
 */
import java.util.concurrent.Callable;
import net.minecraft.block.Block;

public final class fX_2
implements Callable<String> {
    public final /* synthetic */ Gg A;
    public final /* synthetic */ Block I;

    /*
     * WARNING - void declaration
     */
    public fX_2(Gg gg2, Block object) {
        void a2;
        Object b2 = object;
        object = this;
        ((fX_2)object).A = a2;
        ((fX_2)object).I = b2;
        object();
    }

    public String J() throws Exception {
        fX_2 a2;
        try {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = Block.J(a2.I);
            objectArray[vRa.d] = a2.I.J();
            objectArray[uqa.g] = a2.I.getClass().getCanonicalName();
            return String.format(TOa.U, objectArray);
        }
        catch (Throwable throwable) {
            return new StringBuilder().insert(2 & 5, AQa.Fa).append(Block.J(a2.I)).toString();
        }
    }
}

