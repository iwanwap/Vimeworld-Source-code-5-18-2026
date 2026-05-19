/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  uY
 *  vRa
 */
import java.util.concurrent.Callable;
import net.minecraft.block.state.IBlockState;

public final class Dy_2
implements Callable<String> {
    public final /* synthetic */ uY I;

    public Dy_2(uY uY2) {
        Dy_2 b2 = uY2;
        Dy_2 a2 = this;
        a2.I = b2;
    }

    public String J() throws Exception {
        Dy_2 dy_2 = this;
        IBlockState a22 = dy_2.I.worldObj.J(dy_2.I.pos);
        int a22 = a22.J().f(a22);
        if (a22 < 0) {
            return new StringBuilder().insert(5 >> 3, wta.u).append(a22).append(hpa.b).toString();
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = Integer.toBinaryString(a22);
        String string = String.format(ZSa.E, objectArray).replace(Tpa.E, GPa.J);
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = a22;
        objectArray2[vRa.d] = string;
        return String.format(BQa.Da, objectArray2);
    }
}

