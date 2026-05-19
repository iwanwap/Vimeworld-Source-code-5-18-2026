/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bd
 *  ysa
 */
import java.awt.image.BufferedImage;

public final class ILa
implements bd {
    public ILa() {
        ILa a2;
    }

    public BufferedImage J(BufferedImage bufferedImage) {
        Object b2 = bufferedImage;
        ILa a2 = this;
        if (b2 != null && (((BufferedImage)b2).getWidth() < ysa.s || ((BufferedImage)b2).getHeight() < fPa.i)) {
            BufferedImage bufferedImage2 = new BufferedImage(ysa.s, fPa.i, uqa.g);
            Object object = b2;
            int n2 = ((BufferedImage)object).getWidth();
            int n3 = ((BufferedImage)object).getHeight();
            int[] nArray = ((BufferedImage)object).getRGB(uSa.E, uSa.E, n2, n3, null, uSa.E, n2);
            BufferedImage bufferedImage3 = bufferedImage2;
            bufferedImage3.setRGB(uSa.E, uSa.E, n2, n3, nArray, uSa.E, n2);
            b2 = bufferedImage3;
        }
        return b2;
    }

    public void J() {
    }
}

