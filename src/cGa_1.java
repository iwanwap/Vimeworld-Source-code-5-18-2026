/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Sw
 *  bd
 *  yb
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.awt.image.BufferedImage;
import net.minecraft.util.ResourceLocation;

public final class cGa_1
implements bd {
    public final /* synthetic */ yb i;
    public final /* synthetic */ ResourceLocation M;
    public final /* synthetic */ Sw k;
    public final /* synthetic */ MinecraftProfileTexture j;
    public final /* synthetic */ bd J;
    public final /* synthetic */ yHa A;
    public final /* synthetic */ MinecraftProfileTexture.Type I;

    public BufferedImage J(BufferedImage bufferedImage) {
        BufferedImage b2 = bufferedImage;
        cGa_1 a2 = this;
        return a2.J.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public cGa_1(yHa yHa2, bd bd2, Sw sw, MinecraftProfileTexture minecraftProfileTexture, yb yb2, MinecraftProfileTexture.Type type, ResourceLocation object) {
        Object b2;
        void a2;
        cGa_1 cGa_12 = object2;
        Object object2 = object;
        Object object3 = object = cGa_12;
        Object object4 = object;
        ((cGa_1)object).A = a2;
        ((cGa_1)object4).J = bd2;
        ((cGa_1)object4).k = sw;
        ((cGa_1)object3).j = minecraftProfileTexture;
        ((cGa_1)object3).i = yb2;
        ((cGa_1)object).I = type;
        ((cGa_1)object).M = b2;
        object();
    }

    public void J() {
        cGa_1 a2;
        cGa_1 cGa_12 = a2;
        cGa_1 cGa_13 = a2;
        cGa_12.k.J(cGa_13.j.timestamp);
        cGa_12.J.J();
        if (cGa_13.i != null) {
            cGa_1 cGa_14 = a2;
            cGa_1 cGa_15 = a2;
            cGa_14.i.J(cGa_14.I, cGa_15.M, cGa_15.j);
        }
    }
}

