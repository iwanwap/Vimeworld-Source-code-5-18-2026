/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 */
public final class dna_2
implements Runnable {
    private final ANa I;

    public static Runnable J(ANa a2) {
        return new dna_2(a2);
    }

    @Override
    public void run() {
        dna_2 a2;
        ANa.J((ANa)a2.I);
    }

    private dna_2(ANa aNa2) {
        dna_2 b2 = aNa2;
        dna_2 a2 = this;
        a2.I = b2;
    }
}

