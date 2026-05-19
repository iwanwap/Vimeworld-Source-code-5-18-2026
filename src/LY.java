/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public final class LY {
    public int A;
    public int I;

    public void l() {
        Mouse.setCursorPosition(Display.getWidth() / uqa.g, Display.getHeight() / uqa.g);
        Mouse.setGrabbed(uSa.E != 0);
    }

    public void f() {
        LY a2;
        Mouse.setGrabbed(vRa.d != 0);
        LY lY = a2;
        lY.A = uSa.E;
        lY.I = uSa.E;
    }

    public void J() {
        LY a2;
        LY lY = a2;
        lY.A = Mouse.getDX();
        lY.I = Mouse.getDY();
    }

    public LY() {
        LY a2;
    }
}

