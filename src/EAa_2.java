/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FAa
 *  RCa
 *  eBa
 *  uaa
 *  wBa
 */
public final class EAa_2
extends wBa {
    public EAa_2(int n3) {
        EAa_2 a2;
        int b2 = n3;
        EAa_2 eAa_2 = a2 = this;
        super(string, n2, b2, null);
        eAa_2.registerPacket(RCa.SERVERBOUND, FAa.class);
        a2.registerPacket(RCa.CLIENTBOUND, eBa.class);
        a2.registerPacket(RCa.SERVERBOUND, uaa.class);
        a2.registerPacket(RCa.CLIENTBOUND, Wba.class);
    }
}

