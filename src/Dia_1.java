/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  xHa
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

public final class Dia_1
implements Runnable {
    public final /* synthetic */ Map A;
    public final /* synthetic */ xHa I;

    @Override
    public void run() {
        Dia_1 a2;
        if (a2.A.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
            a2.I.A.J((MinecraftProfileTexture)a2.A.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, a2.I.j);
        }
        if (a2.A.containsKey((Object)MinecraftProfileTexture.Type.CAPE)) {
            a2.I.A.J((MinecraftProfileTexture)a2.A.get((Object)MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, a2.I.j);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dia_1(xHa xHa2, Map object) {
        void a2;
        Object b2 = object;
        object = this;
        ((Dia_1)object).I = a2;
        ((Dia_1)object).A = b2;
        object();
    }
}

