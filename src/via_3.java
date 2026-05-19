/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Lga
 *  Mha
 *  NCa
 *  NHa
 *  NTa
 *  Rha
 *  Waa
 *  ica
 *  qca
 *  vRa
 *  via
 */
public final class via_3 {
    private static final int j = Rha.values().length;
    private String[] J;
    private String[] A = I;
    private static final String[] I = new String[j];

    /*
     * WARNING - void declaration
     */
    public void J(u u2, Rha rha2, int n2) {
        ica b2;
        via_3 via_32 = this;
        String string = via_32.A[b2.getTypeID()];
        if (string != null) {
            qca c2;
            Object d22 = new NHa((via)via_32, (u)c2);
            try {
                string = Mha.getEntityName((u)d22, (String)string);
            }
            catch (Lga d22) {
                return;
            }
            d22 = via_32.J[b2.getTypeID()];
            if (d22 != null && (b2 = (c2 = c2.J().J()).J((String)d22)) != null && c2.J(string, b2)) {
                void a2;
                c2.J(string, b2).J((int)a2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        int n2;
        via_3 via_32 = this;
        Waa waa3 = new Waa();
        Rha[] rhaArray = Rha.values();
        int n3 = rhaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            via_3 b2 = rhaArray[n2];
            via_3 via_33 = via_32;
            String string = via_33.A[b2.getTypeID()];
            String string2 = via_33.J[b2.getTypeID()];
            if (string != null && string2 != null) {
                Waa waa4 = waa3;
                waa4.J(b2.getTypeName() + DQa.N, string);
                waa4.J(new StringBuilder().insert(3 ^ 3, b2.getTypeName()).append(wua.W).toString(), string2);
            }
            n4 = ++n2;
        }
        if (!waa3.J()) {
            void a2;
            a2.J(ypa.W, (NCa)waa3);
        }
    }

    private static void J(via via2, Rha rha2) {
        via b22 = rha2;
        via a2 = via2;
        if (a2.A != I && a2.J != I) {
            int n2;
            block4: {
                int n3;
                via via3 = a2;
                via3.A[b22.getTypeID()] = null;
                via3.J[b22.getTypeID()] = null;
                int b22 = vRa.d;
                Rha[] rhaArray = Rha.values();
                int n4 = rhaArray.length;
                int n5 = n3 = uSa.E;
                while (n5 < n4) {
                    Rha rha3 = rhaArray[n3];
                    if (a2.A[rha3.getTypeID()] != null && a2.J[rha3.getTypeID()] != null) {
                        n2 = b22 = uSa.E;
                        break block4;
                    }
                    n5 = ++n3;
                }
                n2 = b22;
            }
            if (n2 != 0) {
                via via4 = a2;
                via4.A = I;
                via4.J = I;
            }
        }
    }

    public via_3() {
        via_3 a2;
        a2.J = I;
    }

    public void J(Waa waa2) {
        via_3 b2 = waa2;
        via_3 a2 = this;
        if (b2.J(ypa.W, NTa.C)) {
            int n2;
            b2 = b2.J(ypa.W);
            Rha[] rhaArray = Rha.values();
            int n3 = rhaArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                Rha rha2 = rhaArray[n2];
                String string = new StringBuilder().insert(2 & 5, rha2.getTypeName()).append(DQa.N).toString();
                String string2 = new StringBuilder().insert(5 >> 3, rha2.getTypeName()).append(wua.W).toString();
                if (b2.J(string, Yqa.i) && b2.J(string2, Yqa.i)) {
                    via_3 via_32 = b2;
                    string = via_32.J(string);
                    string2 = via_32.J(string2);
                    via_3.J((via)a2, rha2, string, string2);
                }
                n4 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(via via2) {
        int b2;
        via_3 via_32 = this;
        Rha[] rhaArray = Rha.values();
        int n2 = rhaArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void a2;
            Rha rha2;
            Rha rha3 = rha2 = rhaArray[b2];
            via_3.J((via)via_32, rha3, a2.A[rha2.getTypeID()], a2.J[rha3.getTypeID()]);
            n3 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(via via2, Rha rha2, String string, String string2) {
        void c2;
        void b2;
        String d2 = string2;
        via a2 = via2;
        if (b2 != null && b2.length() != 0 && d2 != null && d2.length() != 0) {
            if (a2.A == I || a2.J == I) {
                a2.A = new String[j];
                a2.J = new String[j];
            }
            via via3 = a2;
            via3.A[c2.getTypeID()] = b2;
            via3.J[c2.getTypeID()] = d2;
            return;
        }
        via_3.J(a2, (Rha)c2);
    }
}

