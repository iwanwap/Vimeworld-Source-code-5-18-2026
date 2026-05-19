/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cla
 *  EJa
 *  ez
 *  uKa
 *  wKa
 */
import java.util.Iterator;
import optifine.Config;
import org.lwjgl.opengl.GL11;

public final class Tja_1
extends EJa {
    private static final String I = "CL_00000957";

    public Tja_1() {
        Tja_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ez ez2) {
        Tja_1 tja_1 = this;
        if (tja_1.A) {
            if (tja_1.I.size() == 0) {
                return;
            }
            Iterator b2 = tja_1.I.iterator();
            Object object = b2;
            while (object.hasNext()) {
                void a2;
                Cla cla2 = (Cla)b2.next();
                wKa wKa2 = (wKa)cla2;
                uKa.e();
                object = b2;
                tja_1.J(cla2);
                wKa wKa3 = wKa2;
                GL11.glCallList(wKa3.J((ez)a2, wKa3.J()));
                uKa.D();
            }
            if (Config.y()) {
                uKa.f();
            }
            uKa.M();
            tja_1.I.clear();
        }
    }
}

