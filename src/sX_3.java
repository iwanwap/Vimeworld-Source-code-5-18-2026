/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uY
 *  vRa
 */
import java.util.concurrent.Callable;
import net.minecraft.block.Block;

public final class sX_3
implements Callable<String> {
    public final /* synthetic */ uY I;

    public sX_3(uY uY2) {
        sX_3 b2 = uY2;
        sX_3 a2 = this;
        a2.I = b2;
    }

    public String J() throws Exception {
        sX_3 sX_32 = this;
        int a2 = Block.J(sX_32.I.worldObj.J(sX_32.I.pos).J());
        try {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a2;
            objectArray[vRa.d] = Block.f(a2).J();
            objectArray[uqa.g] = Block.f(a2).getClass().getCanonicalName();
            return String.format(TOa.U, objectArray);
        }
        catch (Throwable throwable) {
            return new StringBuilder().insert(3 ^ 3, AQa.Fa).append(a2).toString();
        }
    }
}

