/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Kpa
 *  QSa
 *  SOa
 *  WSa
 *  XSa
 *  dOa
 *  eBa
 *  isa
 *  ld
 *  lma
 *  pY
 *  td
 *  uaa
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.ArrayUtils;

public final class XNa_2
implements td {
    public final /* synthetic */ uba M;
    public final /* synthetic */ lma k;
    private boolean j;
    private long J;
    public final /* synthetic */ dOa A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public XNa_2(dOa dOa2, uba uba2, lma object) {
        void a2;
        XNa_2 b2 = object;
        Object object2 = object = this;
        object.A = a2;
        object.M = uba2;
        object2.k = b2;
        object2.I = uSa.E;
        object2.j = uSa.E;
        object2.J = nqa.i;
    }

    public void J(eBa eBa2) {
        XNa_2 xNa_2;
        CharSequence charSequence;
        XNa_2 a2;
        XNa_2 b2;
        block15: {
            block14: {
                block13: {
                    int n2;
                    XNa_2 xNa_22;
                    XNa_2 xNa_23;
                    b2 = eBa2;
                    a2 = this;
                    if (a2.j) {
                        a2.M.J((ld)new CY(QSa.T));
                        return;
                    }
                    a2.j = vRa.d;
                    if ((b2 = b2.J()).J() != null) {
                        XNa_2 xNa_24 = b2;
                        xNa_23 = xNa_24;
                        a2.k.serverMOTD = xNa_24.J().l();
                    } else {
                        a2.k.serverMOTD = Mqa.y;
                        xNa_23 = b2;
                    }
                    XNa_2 xNa_25 = a2;
                    if (xNa_23.J() != null) {
                        xNa_25.k.gameVersion = b2.J().J();
                        XNa_2 xNa_26 = b2;
                        xNa_22 = xNa_26;
                        a2.k.version = xNa_26.J().J();
                    } else {
                        xNa_25.k.gameVersion = KSa.j;
                        xNa_22 = b2;
                        a2.k.version = uSa.E;
                    }
                    if (xNa_22.J() == null) break block13;
                    XNa_2 xNa_27 = b2;
                    a2.k.populationInfo = pY.GRAY + Mqa.y + xNa_27.J().f() + Mqa.y + pY.DARK_GRAY + WSa.f + pY.GRAY + b2.J().J();
                    if (!ArrayUtils.isNotEmpty(xNa_27.J().J())) break block14;
                    charSequence = new StringBuilder();
                    GameProfile[] gameProfileArray = b2.J().J();
                    int n3 = gameProfileArray.length;
                    int n4 = n2 = uSa.E;
                    while (n4 < n3) {
                        GameProfile gameProfile = gameProfileArray[n2];
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append(SPa.O);
                        }
                        ((StringBuilder)charSequence).append(gameProfile.getName());
                        n4 = ++n2;
                    }
                    if (b2.J().J().length < b2.J().f()) {
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append(SPa.O);
                        }
                        ((StringBuilder)charSequence).append(cTa.Q).append(b2.J().f() - b2.J().J().length).append(isa.ca);
                    }
                    a2.k.playerList = ((StringBuilder)charSequence).toString();
                    xNa_2 = b2;
                    break block15;
                }
                a2.k.populationInfo = pY.DARK_GRAY + sSa.R;
            }
            xNa_2 = b2;
        }
        if (xNa_2.J() != null) {
            charSequence = b2.J();
            if (((String)charSequence).startsWith(Jsa.Ia)) {
                a2.k.J(((String)charSequence).substring(Jsa.Ia.length()));
            } else {
                dOa.J().error(SOa.x);
            }
        } else {
            a2.k.J((String)null);
        }
        a2.J = Kpa.J();
        a2.M.J((KC)new uaa(a2.J));
        a2.I = vRa.d;
    }

    public void J(Wba wba2) {
        XNa_2 a2;
        Wba b2 = wba2;
        XNa_2 xNa_2 = a2 = this;
        long l2 = xNa_2.J;
        long l3 = Kpa.J();
        xNa_2.k.pingToServer = l3 - l2;
        xNa_2.M.J((ld)new CY(XSa.z));
    }

    public void J(ld ld2) {
        XNa_2 b2 = ld2;
        XNa_2 a2 = this;
        if (!a2.I) {
            dOa.J().error(new StringBuilder().insert(3 & 4, FRa.Ka).append(a2.k.serverIP).append(Xpa.E).append(b2.f()).toString());
            a2.k.serverMOTD = pY.DARK_RED + Qpa.L;
            a2.k.populationInfo = Mqa.y;
            dOa.J((dOa)a2.A, (lma)a2.k);
        }
    }
}

