/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fc
 *  WSa
 *  ZIa
 *  aKa
 *  cKa
 *  dQa
 *  kqa
 *  nka
 *  pqa
 *  uKa
 */
import java.nio.ByteBuffer;
import java.util.List;
import optifine.Config;
import org.lwjgl.opengl.GL11;

public class Bka_1 {
    private static final String I = "CL_00002567";

    public Bka_1() {
        Bka_1 a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(aKa aKa2) {
        Bka_1 b2 = aKa2;
        Bka_1 a2 = this;
        if (b2.J() > 0) {
            int n2;
            int n3;
            Bka_1 bka_1 = b2;
            hKa hKa2 = bka_1.J();
            int n4 = hKa2.C();
            ByteBuffer byteBuffer = bka_1.J();
            List<gC> list = hKa2.J();
            int n5 = n3 = uSa.E;
            while (n5 < list.size()) {
                gC gC2 = list.get(n3);
                ZIa zIa = gC2.J();
                int n6 = gC2.J().getGlConstant();
                n2 = gC2.l();
                byteBuffer.position(hKa2.J(n3));
                switch (cKa.A[zIa.ordinal()]) {
                    case 1: {
                        GL11.glVertexPointer(gC2.J(), n6, n4, byteBuffer);
                        GL11.glEnableClientState(WSa.Ma);
                        break;
                    }
                    case 2: {
                        nka.J((int)(nka.v + n2));
                        GL11.glTexCoordPointer(gC2.J(), n6, n4, byteBuffer);
                        GL11.glEnableClientState(dQa.ia);
                        nka.J((int)nka.v);
                        break;
                    }
                    case 3: {
                        GL11.glColorPointer(gC2.J(), n6, n4, byteBuffer);
                        GL11.glEnableClientState(kqa.Ga);
                        break;
                    }
                    case 4: {
                        GL11.glNormalPointer(n6, n4, byteBuffer);
                        GL11.glEnableClientState(pqa.n);
                        break;
                    }
                }
                n5 = ++n3;
            }
            if (b2.f()) {
                b2.e();
            } else {
                Bka_1 bka_12 = b2;
                if (Config.h()) {
                    Fc.J((int)bka_12.l(), (int)uSa.E, (int)b2.J(), (aKa)b2);
                } else {
                    GL11.glDrawArrays(bka_12.l(), uSa.E, b2.J());
                }
            }
            n3 = uSa.E;
            int n7 = list.size();
            int n8 = n3;
            while (n8 < n7) {
                gC gC3 = list.get(n3);
                ZIa zIa = gC3.J();
                n2 = gC3.l();
                switch (cKa.A[zIa.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState(WSa.Ma);
                        break;
                    }
                    case 2: {
                        nka.J((int)(nka.v + n2));
                        GL11.glDisableClientState(dQa.ia);
                        nka.J((int)nka.v);
                        break;
                    }
                    case 3: {
                        GL11.glDisableClientState(kqa.Ga);
                        uKa.M();
                        break;
                    }
                    case 4: {
                        GL11.glDisableClientState(pqa.n);
                        break;
                    }
                }
                n8 = ++n3;
            }
        }
        b2.f();
    }
}

