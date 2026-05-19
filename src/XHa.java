/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 */
public final class XHa
implements Runnable {
    private final Gl I;

    public static Runnable J(Gl a2) {
        return new XHa(a2);
    }

    private XHa(Gl gl2) {
        XHa b2 = gl2;
        XHa a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        XHa a2;
        Gl.f((Gl)a2.I);
    }
}

