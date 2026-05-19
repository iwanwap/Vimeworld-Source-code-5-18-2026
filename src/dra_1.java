/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  zsa
 */
import java.util.concurrent.Callable;
import org.lwjgl.opengl.GL11;

public final class dra_1
implements Callable<String> {
    public final /* synthetic */ Kpa I;

    public String J() {
        return new StringBuilder().insert(3 >> 2, GL11.glGetString(Ora.J)).append(zta.j).append(GL11.glGetString(zsa.ca)).append(TOa.n).append(GL11.glGetString(PRa.m)).toString();
    }

    public dra_1(Kpa kpa2) {
        dra_1 b2 = kpa2;
        dra_1 a2 = this;
        a2.I = b2;
    }
}

