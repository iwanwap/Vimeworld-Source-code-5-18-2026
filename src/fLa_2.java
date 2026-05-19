/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  Rd
 *  U
 *  Wsa
 *  iea
 */
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import net.minecraft.block.material.MapColor;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class fLa_2
extends Rd {
    private final ResourceLocation j;
    private static final Logger J = LogManager.getLogger();
    private final List<iea> A;
    private final List<String> I;

    /*
     * WARNING - void declaration
     */
    public fLa_2(ResourceLocation resourceLocation, List<String> list, List<iea> list2) {
        void b2;
        void c2;
        fLa_2 a2;
        Object d2 = list2;
        fLa_2 fLa_22 = a2 = this;
        a2.j = c2;
        fLa_22.I = b2;
        fLa_22.A = d2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(U u2) throws IOException {
        fLa_2 fLa_22 = this;
        fLa_22.l();
        try {
            void a2;
            BufferedImage bufferedImage = gLa.J(a2.J(fLa_22.j).J());
            int n2 = bufferedImage.getType();
            if (n2 == 0) {
                n2 = uua.p;
            }
            BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), n2);
            bufferedImage2.getGraphics().drawImage(bufferedImage, uSa.E, uSa.E, null);
            n2 = uSa.E;
            while (true) {
                block10: {
                    int n3;
                    MapColor mapColor;
                    Object b2;
                    block11: {
                        block9: {
                            if (n2 >= yta.Ka || n2 >= fLa_22.I.size() || n2 >= fLa_22.A.size()) break block9;
                            b2 = fLa_22.I.get(n2);
                            mapColor = fLa_22.A.get(n2).getMapColor();
                            if (b2 == null) break block10;
                            if (((BufferedImage)(b2 = gLa.J(a2.J(new ResourceLocation((String)b2)).J()))).getWidth() != bufferedImage2.getWidth() || ((BufferedImage)b2).getHeight() != bufferedImage2.getHeight() || ((BufferedImage)b2).getType() != uua.p) break block10;
                            n3 = uSa.E;
                            break block11;
                        }
                        gLa.J(fLa_22.J(), bufferedImage2);
                        return;
                    }
                    while (n3 < ((BufferedImage)b2).getHeight()) {
                        int n4;
                        int n5 = uSa.E;
                        while (n5 < ((BufferedImage)b2).getWidth()) {
                            int n6;
                            int n7 = ((BufferedImage)b2).getRGB(n6, n4);
                            if ((n7 & gsa.X) != 0) {
                                n7 = (n7 & Zqa.E) << Yqa.i & gsa.X;
                                int n8 = Oz.J((int)bufferedImage.getRGB(n6, n4), (int)mapColor.colorValue) & Wsa.K;
                                ((BufferedImage)b2).setRGB(n6, n4, n7 | n8);
                            }
                            n5 = ++n6;
                        }
                        n3 = ++n4;
                    }
                    bufferedImage2.getGraphics().drawImage((Image)b2, uSa.E, uSa.E, null);
                }
                ++n2;
            }
        }
        catch (IOException iOException) {
            J.error(gsa.n, (Throwable)iOException);
            return;
        }
    }
}

