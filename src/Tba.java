/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kba
 *  RCa
 *  wBa
 */
public final class Tba
extends wBa {
    public Tba(int n3) {
        Tba a2;
        int b2 = n3;
        Tba tba2 = a2 = this;
        super(string, n2, b2, null);
        tba2.registerPacket(RCa.CLIENTBOUND, sBa.class);
        a2.registerPacket(RCa.CLIENTBOUND, jCa.class);
        a2.registerPacket(RCa.CLIENTBOUND, jAa.class);
        a2.registerPacket(RCa.CLIENTBOUND, iBa.class);
        a2.registerPacket(RCa.CLIENTBOUND, dBa.class);
        a2.registerPacket(RCa.SERVERBOUND, VBa.class);
        a2.registerPacket(RCa.SERVERBOUND, Kba.class);
    }
}

