/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 */
public final class wY_3 {
    private float J;
    private float A;
    private float I;

    public wY_3() {
        wY_3 a2;
    }

    public void J() {
        wY_3 a2;
        wY_3 wY_32 = a2;
        wY_32.I = JPa.N;
        wY_32.J = JPa.N;
        wY_32.A = JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2, float f3) {
        void a2;
        wY_3 b2;
        float c2 = f2;
        wY_3 wY_32 = b2 = this;
        wY_32.I += c2;
        wY_3 wY_33 = b2;
        c2 = (wY_32.I - wY_33.J) * a2;
        wY_33.A += (c2 - b2.A) * MQa.L;
        if (c2 > JPa.N && c2 > b2.A || c2 < JPa.N && c2 < b2.A) {
            c2 = b2.A;
        }
        b2.J += c2;
        return c2;
    }
}

