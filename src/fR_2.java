/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qq
 *  vP
 */
import java.util.function.BooleanSupplier;

public final class fR_2
implements BooleanSupplier {
    private final vP I;

    public static BooleanSupplier J(vP a2) {
        return new fR_2(a2);
    }

    @Override
    public boolean getAsBoolean() {
        fR_2 a2;
        return Qq.J((vP)a2.I);
    }

    private fR_2(vP vP2) {
        fR_2 b2 = vP2;
        fR_2 a2 = this;
        a2.I = b2;
    }
}

