/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 */
import com.mojang.authlib.GameProfile;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QBa_2
implements D {
    private GameProfile[] players;
    private final int onlinePlayerCount;
    private final int maxPlayers;

    public int f() {
        QBa_2 a2;
        return a2.onlinePlayerCount;
    }

    /*
     * WARNING - void declaration
     */
    public QBa_2(int n2, int n3) {
        void b2;
        QBa_2 a2;
        int c2 = n3;
        QBa_2 qBa_2 = a2 = this;
        qBa_2.maxPlayers = b2;
        qBa_2.onlinePlayerCount = c2;
    }

    public int J() {
        QBa_2 a2;
        return a2.maxPlayers;
    }

    public void J(GameProfile[] gameProfileArray) {
        GameProfile[] b2 = gameProfileArray;
        GameProfile[] a2 = this;
        a2.players = b2;
    }

    public GameProfile[] J() {
        QBa_2 a2;
        return a2.players;
    }
}

