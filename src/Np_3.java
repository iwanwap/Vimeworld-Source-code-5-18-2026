/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qq
 *  vP
 */
import java.util.function.BooleanSupplier;

public final class Np_3
implements BooleanSupplier {
    private final vP I;

    public static BooleanSupplier J(vP a2) {
        return new Np_3(a2);
    }

    @Override
    public boolean getAsBoolean() {
        Np_3 a2;
        return Qq.f((vP)a2.I);
    }

    private Np_3(vP vP2) {
        Np_3 b2 = vP2;
        Np_3 a2 = this;
        a2.I = b2;
    }
}

