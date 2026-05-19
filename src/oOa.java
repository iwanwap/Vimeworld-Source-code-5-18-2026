/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 */
import java.util.concurrent.Callable;
import org.lwjgl.Sys;

public final class oOa
implements Callable<String> {
    public final /* synthetic */ Kpa I;

    public String J() {
        return Sys.getVersion();
    }

    public oOa(Kpa kpa2) {
        oOa b2 = kpa2;
        oOa a2 = this;
        a2.I = b2;
    }
}

