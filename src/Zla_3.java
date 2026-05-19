/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cla
 *  EJa
 *  JPa
 *  LQa
 *  Uqa
 *  XTa
 *  bJa
 *  ez
 *  nka
 *  tA
 *  uKa
 */
import java.util.Iterator;
import optifine.Config;
import org.lwjgl.opengl.GL11;

public final class Zla_3
extends EJa {
    private static final String I = "CL_00002533";

    private void J() {
        if (Config.h()) {
            tA.I();
            return;
        }
        GL11.glVertexPointer(yRa.d, JPa.la, EPa.O, nqa.i);
        GL11.glColorPointer(AQa.P, Uqa.P, EPa.O, hQa.Ka);
        GL11.glTexCoordPointer(uqa.g, JPa.la, EPa.O, LQa.ca);
        nka.J((int)nka.P);
        GL11.glTexCoordPointer(uqa.g, Yua.W, EPa.O, wua.S);
        nka.J((int)nka.v);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ez ez2) {
        Zla_3 zla_3 = this;
        if (zla_3.A) {
            Iterator b2 = zla_3.I.iterator();
            Object object = b2;
            while (object.hasNext()) {
                void a2;
                Cla cla2 = (Cla)b2.next();
                bJa bJa2 = cla2.J(a2.ordinal());
                uKa.e();
                Cla cla3 = cla2;
                zla_3.J(cla3);
                cla3.d();
                object = b2;
                bJa bJa3 = bJa2;
                bJa3.f();
                zla_3.J();
                bJa3.J(XTa.W);
                uKa.D();
            }
            nka.f((int)nka.U, (int)uSa.E);
            uKa.M();
            zla_3.I.clear();
        }
    }

    public Zla_3() {
        Zla_3 a2;
    }
}

