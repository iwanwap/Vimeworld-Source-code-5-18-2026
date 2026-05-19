/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  TY
 *  fZ
 */
import com.mojang.authlib.GameProfile;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aY
implements D {
    private final GameProfile gameProfile;
    private final Date expirationDate;
    public final /* synthetic */ TY this$0;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ aY(TY tY, GameProfile gameProfile, Date date, fZ fZ2) {
        void c2;
        void d2;
        Date e2 = date;
        aY b2 = this;
        b2((TY)d2, (GameProfile)c2, e2);
    }

    public Date J() {
        aY a2;
        return a2.expirationDate;
    }

    public GameProfile J() {
        aY a2;
        return a2.gameProfile;
    }

    public static /* synthetic */ Date J(aY a2) {
        return a2.expirationDate;
    }

    /*
     * WARNING - void declaration
     */
    private aY(TY tY, GameProfile gameProfile, Date date) {
        void b2;
        void c2;
        aY a2;
        Date d2 = date;
        aY aY2 = a2 = this;
        a2.this$0 = c2;
        aY2.gameProfile = b2;
        aY2.expirationDate = d2;
    }
}

