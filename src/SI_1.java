/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RI
 *  hI
 *  wI
 *  wn
 */
public final class SI_1 {
    public Object A;
    public RI I;

    /*
     * Enabled aggressive block sorting
     */
    public SI_1(wn wn2) {
        SI_1 b2 = wn2;
        SI_1 a2 = this;
        switch (hI.I[b2.getAction().ordinal()]) {
            case 1: {
                a2.I = RI.URL;
                a2.A = b2.getUrl();
                return;
            }
            case 2: {
                a2.I = RI.CHAT;
                a2.A = b2.getMessage();
                return;
            }
            case 3: {
                SI_1 sI_1 = a2;
                sI_1.I = RI.CALLBACK;
                SI_1 sI_12 = a2;
                sI_1.A = new wI(b2.getCallback().toByteArray());
                return;
            }
            case 4: {
                a2.I = RI.CLOSE_GUI;
                return;
            }
        }
    }
}

