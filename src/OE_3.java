/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  Kga
 *  QFa
 *  RA
 *  dpa
 *  pua
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockMycelium;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import optifine.Config;

public final class OE_3 {
    private static RA j = new Kga(new ArrayList(), new ArrayList(), uSa.E != 0, uSa.E != 0, (KLa)null, (ItemCameraTransforms)null);
    private static RA J = null;
    private static RA A = null;
    private static RA I = null;

    /*
     * WARNING - void declaration
     */
    private static Block J(XF xF2, DZ dZ2, I i2) {
        void a2;
        Object c2 = dZ2;
        XF b2 = xF2;
        c2 = b2.offset((DZ)((Object)c2));
        return a2.J(c2).J();
    }

    /*
     * WARNING - void declaration
     */
    public static List J(I i2, Block block, XF xF2, DZ dZ2, List list) {
        void a2;
        Object e2 = dZ2;
        I b2 = i2;
        if (e2 != DZ.UP && e2 != DZ.DOWN) {
            void c2;
            Block d2;
            if (d2 instanceof BlockMycelium) {
                if (Config.q()) {
                    if (OE_3.J(c2.down(), (DZ)((Object)e2), b2) == QFa.uB) {
                        return J.J((DZ)((Object)e2));
                    }
                    return a2;
                }
                return J.J((DZ)((Object)e2));
            }
            if (d2 instanceof BlockGrass) {
                int n2;
                d2 = b2.J(c2.up()).J();
                int n3 = n2 = d2 == QFa.mb || d2 == QFa.gC ? vRa.d : uSa.E;
                if (!Config.q()) {
                    if (n2 != 0) {
                        return A.J((DZ)((Object)e2));
                    }
                    return I.J((DZ)((Object)e2));
                }
                if (n2 != 0) {
                    if (OE_3.J((XF)c2, (DZ)((Object)e2), b2) == QFa.gC) {
                        return A.J((DZ)((Object)e2));
                    }
                } else if (OE_3.J(c2.down(), (DZ)((Object)e2), b2) == QFa.lf) {
                    return I.J((DZ)((Object)e2));
                }
            }
            return a2;
        }
        return a2;
    }

    public static void J() {
        I = Ue.J(wua.x, uSa.E);
        A = Ue.J(NSa.x, pua.o);
        J = Ue.J(dpa.S, pua.o);
    }

    public OE_3() {
        OE_3 a2;
    }
}

