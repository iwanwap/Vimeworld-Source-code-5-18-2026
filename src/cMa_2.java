/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cMa
 *  hma
 */
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import net.minecraft.util.ResourceLocation;

public final class cMa_2
extends URLStreamHandler {
    public final /* synthetic */ ResourceLocation I;

    public cMa_2(ResourceLocation object) {
        Object a2 = object;
        object = this;
        ((cMa_2)object).I = a2;
        ((URLStreamHandler)object)();
    }

    @Override
    public URLConnection openConnection(URL uRL) {
        URL b2 = uRL;
        cMa_2 a2 = this;
        return new hma((cMa)a2, b2);
    }
}

