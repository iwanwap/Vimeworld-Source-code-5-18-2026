/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fja
 *  Lra
 *  Vja
 *  isa
 *  kqa
 *  oKa
 *  vRa
 */
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class MKa_2
extends Vja {
    public final /* synthetic */ oKa I;

    public MKa_2(oKa oKa2) {
        MKa_2 b2 = oKa2;
        MKa_2 a2 = this;
        a2.I = b2;
    }

    public ModelResourceLocation J(IBlockState iBlockState) {
        Object b2 = iBlockState;
        MKa_2 a2 = this;
        b2 = b2.J(BlockQuartz.VARIANT);
        switch (Fja.I[((Enum)b2).ordinal()]) {
            default: {
                return new ModelResourceLocation(nOa.c, AQa.t);
            }
            case 2: {
                return new ModelResourceLocation(isa.Z, AQa.t);
            }
            case 3: {
                return new ModelResourceLocation(kqa.y, Lra.H);
            }
            case 4: {
                return new ModelResourceLocation(kqa.y, vRa.D);
            }
            case 5: 
        }
        return new ModelResourceLocation(kqa.y, EPa.x);
    }
}

