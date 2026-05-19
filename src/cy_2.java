/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  JPa
 *  aQa
 *  jz
 *  pqa
 */
public final class cy_2
extends jz {
    private final Cia I;

    public cy_2(Cia cia) {
        cy_2 b2 = cia;
        cy_2 a2 = this;
        a2.I = b2;
    }

    public void J() {
        cy_2 a2;
        a2.j = JPa.N;
        a2.A = JPa.N;
        if (a2.I.jb.isKeyDown()) {
            a2.A += pqa.r;
        }
        if (a2.I.JA.isKeyDown()) {
            a2.A -= pqa.r;
        }
        if (a2.I.L.isKeyDown()) {
            a2.j += pqa.r;
        }
        if (a2.I.gd.isKeyDown()) {
            a2.j -= pqa.r;
        }
        cy_2 cy_22 = a2;
        cy_22.J = cy_22.I.ta.isKeyDown();
        cy_22.I = (Cia)cy_22.I.ia.isKeyDown();
        if (cy_22.I != false) {
            cy_2 cy_23 = a2;
            cy_23.j = (float)((double)cy_23.j * aQa.r);
            cy_23.A = (float)((double)cy_23.A * aQa.r);
        }
    }
}

