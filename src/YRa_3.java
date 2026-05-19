/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  YTa
 *  fpa
 *  lsa
 *  nda
 *  uTa
 *  vRa
 */
import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YRa_3
extends lsa {
    public Gl I;

    /*
     * WARNING - void declaration
     */
    public YRa_3(ArrayList<YTa> arrayList, long l2, uTa uTa2, Object object) {
        Object e2;
        void b2;
        void c2;
        void d2;
        YRa_3 yRa_3 = object2;
        Object object2 = object;
        YRa_3 a2 = yRa_3;
        super((ArrayList)d2, (long)c2, (uTa)b2, e2);
        if (e2 != null && M != null && e2.equals(YRa_3.M.c)) {
            a2.C = null;
        }
        if (d2 != null) {
            YRa_3 yRa_32 = a2;
            yRa_32.I = new nda((Gg)YRa_3.M.Ta);
        }
    }

    public Gl J() {
        YRa_3 a2;
        return a2.I;
    }

    public void l() {
        YRa_3 a2;
        super.l();
        YRa_3.M.u = YRa_3.M.c;
    }

    /*
     * WARNING - void declaration
     */
    public lsa J(ArrayList<YTa> arrayList, long l2, uTa uTa2, Object object) {
        Object e2;
        void b2;
        void c2;
        void d2;
        YRa_3 yRa_3 = object2;
        Object object2 = object;
        YRa_3 a2 = yRa_3;
        return new YRa_3((ArrayList<YTa>)d2, (long)c2, (uTa)b2, e2);
    }

    public String J() {
        return fpa.I;
    }

    public void J(YTa yTa) {
        YRa_3 a2;
        YRa_3 b2 = yTa;
        YRa_3 yRa_3 = a2 = this;
        super.J((YTa)b2);
        Mouse.setCursorPosition(Display.getWidth() / uqa.g, Display.getHeight() / uqa.g);
        Mouse.setGrabbed(vRa.d != 0);
        YRa_3 yRa_32 = a2;
        YRa_3.M.u = yRa_32.I;
        yRa_3.I.l(((YTa)b2).x, ((YTa)b2).y, ((YTa)b2).z, (float)((YTa)b2).rotationYaw, (float)((YTa)b2).rotationPitch);
        yRa_32.I.f(((YTa)b2).x, ((YTa)b2).y, ((YTa)b2).z, (float)((YTa)b2).rotationYaw, (float)((YTa)b2).rotationPitch);
    }
}

