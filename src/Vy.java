/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Usa
 *  haa
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Vy
extends haa<GameProfile> {
    public void J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Object a2 = this;
        if (a2.J() != null) {
            b2.addProperty(Usa.w, ((GameProfile)a2.J()).getId() == null ? Mqa.y : ((GameProfile)a2.J()).getId().toString());
            b2.addProperty(dua.T, ((GameProfile)a2.J()).getName());
            super.J(b2);
        }
    }

    private static GameProfile J(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        if (jsonObject2.has(Usa.w) && jsonObject2.has(dua.T)) {
            Object a2 = jsonObject2.get(Usa.w).getAsString();
            try {
                a2 = UUID.fromString((String)a2);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile((UUID)a2, jsonObject2.get(dua.T).getAsString());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Vy(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        Object f2;
        void c2;
        void e2;
        void b2;
        Vy vy = object;
        Object object = string2;
        Vy a2 = vy;
        void v1 = b2;
        super((Object)e2, (Date)v1, (String)c2, (Date)v1, (String)f2);
    }

    public Vy(GameProfile gameProfile) {
        Object b2 = gameProfile;
        Vy a2 = this;
        a2((GameProfile)b2, null, null, null, null);
    }

    public Vy(JsonObject jsonObject) {
        Object b2 = jsonObject;
        Vy a2 = this;
        super((Object)Vy.J((JsonObject)b2), (JsonObject)b2);
    }
}

