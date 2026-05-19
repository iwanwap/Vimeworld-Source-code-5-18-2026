/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ay
 *  fz
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ly_2
extends fz<GameProfile, Vy> {
    public String J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        ly_2 a2 = this;
        return b2.getId().toString();
    }

    public String[] J() {
        ly_2 ly_22 = this;
        String[] stringArray = new String[ly_22.J().size()];
        int n2 = uSa.E;
        Iterator a2 = ly_22.J().values().iterator();
        Object object = a2;
        while (object.hasNext()) {
            Vy vy = (Vy)((Object)a2.next());
            stringArray[n2++] = ((GameProfile)vy.J()).getName();
            object = a2;
        }
        return stringArray;
    }

    public ay<GameProfile> J(JsonObject jsonObject) {
        Object b2 = jsonObject;
        ly_2 a2 = this;
        return new Vy((JsonObject)b2);
    }

    public boolean J(GameProfile gameProfile) {
        Object b2 = gameProfile;
        ly_2 a2 = this;
        return a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public GameProfile J(String string) {
        ly_2 ly_22 = this;
        for (Object b2 : ly_22.J().values()) {
            void a2;
            if (!a2.equalsIgnoreCase(((GameProfile)b2.J()).getName())) continue;
            return (GameProfile)b2.J();
        }
        return null;
    }

    public ly_2(File file) {
        Object b2 = file;
        ly_2 a2 = this;
        super((File)b2);
    }
}

