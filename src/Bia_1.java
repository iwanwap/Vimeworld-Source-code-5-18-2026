/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.block.state.IBlockState;

public final class Bia_1
implements Callable<String> {
    public final /* synthetic */ IBlockState I;

    public Bia_1(IBlockState object) {
        Object a2 = object;
        object = this;
        ((Bia_1)object).I = a2;
        object();
    }

    public String J() throws Exception {
        Bia_1 a2;
        return a2.I.toString();
    }
}

