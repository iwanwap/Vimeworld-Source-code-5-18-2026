/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class wh_3
implements b {
    private final Random I;

    public static b J(Random a2) {
        return new wh_3(a2);
    }

    @Override
    public float J() {
        wh_3 a2;
        return a2.I.nextFloat();
    }

    private wh_3(Random random) {
        Random b2 = random;
        wh_3 a2 = this;
        a2.I = b2;
    }
}

