/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fRa
 *  nra
 */
import java.util.function.Consumer;

public final class Apa_3
implements Consumer {
    private final nra I;

    public void accept(Object object) {
        Object b2 = object;
        Apa_3 a2 = this;
        nra.J((nra)a2.I, (fRa)((fRa)b2));
    }

    public static Consumer J(nra a2) {
        return new Apa_3(a2);
    }

    private Apa_3(nra nra2) {
        Apa_3 b2 = nra2;
        Apa_3 a2 = this;
        a2.I = b2;
    }
}

