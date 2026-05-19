/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  hra
 *  jsa
 *  nz
 *  oqa
 *  pqa
 *  rX
 *  zsa
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;

public final class vy_2
extends Thread {
    public final /* synthetic */ nz I;

    /*
     * WARNING - void declaration
     */
    public vy_2(nz nz2, String string) {
        void b2;
        String c2 = string;
        vy_2 a2 = this;
        a2.I = b2;
        super(c2);
    }

    @Override
    public void run() {
        vy_2 vy_22;
        block6: {
            GameProfile a2;
            block5: {
                vy_22 = this;
                a2 = nz.J((nz)vy_22.I);
                try {
                    String string = new BigInteger(az.J(nz.J((nz)vy_22.I), nz.J((nz)vy_22.I).J().getPublic(), nz.J((nz)vy_22.I))).toString(ERa.C);
                    vy_2 vy_23 = vy_22;
                    nz.J((nz)vy_23.I, (GameProfile)nz.J((nz)vy_23.I).J().hasJoinedServer(new GameProfile(null, a2.getName()), string));
                    if (nz.J((nz)vy_22.I) == null) break block5;
                    nz.J().info(new StringBuilder().insert(3 >> 2, Bra.r).append(nz.J((nz)vy_22.I).getName()).append(gsa.u).append(nz.J((nz)vy_22.I).getId()).toString());
                    nz.J((nz)vy_22.I, (rX)rX.READY_TO_ACCEPT);
                    return;
                }
                catch (AuthenticationUnavailableException authenticationUnavailableException) {
                    if (nz.J((nz)vy_22.I).E()) {
                        nz.J().warn(wsa.la);
                        vy_2 vy_24 = vy_22;
                        nz.J((nz)vy_24.I, (GameProfile)vy_24.I.J(a2));
                        nz.J((nz)vy_22.I, (rX)rX.READY_TO_ACCEPT);
                        return;
                    }
                    vy_22.I.J(oqa.M);
                    nz.J().error(hra.g);
                    return;
                }
            }
            if (!nz.J((nz)vy_22.I).E()) break block6;
            nz.J().warn(jsa.k);
            vy_2 vy_25 = vy_22;
            nz.J((nz)vy_25.I, (GameProfile)vy_25.I.J(a2));
            nz.J((nz)vy_22.I, (rX)rX.READY_TO_ACCEPT);
            return;
        }
        vy_22.I.J(pqa.d);
        nz.J().error(new StringBuilder().insert(2 & 5, mSa.K).append(nz.J((nz)vy_22.I).getName()).append(zsa.b).toString());
    }
}

