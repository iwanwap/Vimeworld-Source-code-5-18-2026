/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rd
 *  U
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Aka_1
extends Rd {
    private static final Logger A = LogManager.getLogger();
    public final List<String> I;

    public Aka_1(String ... stringArray) {
        String[] b2 = stringArray;
        String[] a2 = this;
        a2.I = Lists.newArrayList(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(U u2) throws IOException {
        Aka_1 aka_1 = this;
        aka_1.l();
        BufferedImage bufferedImage = null;
        try {
            for (String b22 : aka_1.I) {
                void a2;
                if (b22 == null) continue;
                BufferedImage b22 = gLa.J(a2.J(new ResourceLocation(b22)).J());
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(b22.getWidth(), b22.getHeight(), uqa.g);
                }
                bufferedImage.getGraphics().drawImage(b22, uSa.E, uSa.E, null);
            }
        }
        catch (IOException iOException) {
            A.error(gsa.n, (Throwable)iOException);
            return;
        }
        gLa.J(aka_1.J(), bufferedImage);
    }
}

