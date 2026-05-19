/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pqa
 *  Sw
 *  WSa
 *  bx
 *  vRa
 *  xOa
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.io.File;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kv
extends rw {
    @Override
    public int J() {
        return vRa.d;
    }

    public Sw J(String string) {
        String b2 = string;
        kv a2 = this;
        return (Sw)super.J(b2);
    }

    public Sw J(MinecraftProfileTexture.Type type, String string) {
        String b2;
        String c2 = string;
        kv a2 = this;
        b2 = (b2 == MinecraftProfileTexture.Type.SKIN ? xOa.q : Pqa.p) + (c2.length() > uqa.g ? c2.substring(uSa.E, uqa.g).toLowerCase() : XOa.Da) + WSa.f + (String)c2 + KPa.C;
        return a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public kv(File file, File file2) {
        void b2;
        File c2 = file2;
        kv a2 = this;
        super((File)b2, c2);
    }

    @Override
    public bx J() {
        kv a2;
        return new Sw(a2);
    }
}

