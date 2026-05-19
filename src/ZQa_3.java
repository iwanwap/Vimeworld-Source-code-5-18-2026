/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  Kpa
 *  OC
 *  Qta
 *  vRa
 */
public final class ZQa_3
implements OC {
    public final /* synthetic */ Kpa I;

    public String J(String string) {
        String b22 = string;
        ZQa_3 a2 = this;
        try {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = Cia.J((int)a2.I.z.xc.getKeyCode());
            return String.format(b22, objectArray);
        }
        catch (Exception b22) {
            return new StringBuilder().insert(2 & 5, Qta.f).append(b22.getLocalizedMessage()).toString();
        }
    }

    public ZQa_3(Kpa kpa2) {
        ZQa_3 b2 = kpa2;
        ZQa_3 a2 = this;
        a2.I = b2;
    }
}

