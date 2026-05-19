/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.nio.IntBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CD_3 {
    public int m;
    public int C;
    public byte i;
    public int M;
    public int k;
    public int j;
    public byte J;
    public int A;
    public IntBuffer I;

    public BufferedImage J() {
        CD_3 cD_3;
        CD_3 cD_32 = cD_3 = this;
        BufferedImage bufferedImage = new BufferedImage(cD_32.j, cD_32.k, uqa.g);
        Object a2 = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
        cD_3.J((int[])a2);
        return bufferedImage;
    }

    public int J() {
        CD_3 cD_3 = this;
        if (cD_3.A == 0) {
            cD_3.A = ySa.T;
        }
        float a2 = (float)cD_3.C / (float)cD_3.A;
        return (int)(Jpa.r * a2);
    }

    public void J(int[] nArray) {
        Object b2 = nArray;
        CD_3 a2 = this;
        a2.I.get((int[])b2);
    }

    public CD_3() {
        CD_3 a2;
    }
}

