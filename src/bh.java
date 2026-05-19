/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 */
import java.nio.ByteBuffer;
import java.util.UUID;

public final class bh {
    public bh() {
        bh a2;
    }

    public static byte[] J(UUID uUID) {
        Comparable<UUID> a2;
        UUID uUID2 = uUID;
        Comparable<UUID> comparable = a2 = ByteBuffer.wrap(new byte[ERa.C]);
        ((ByteBuffer)a2).putLong(uUID2.getMostSignificantBits());
        ((ByteBuffer)comparable).putLong(uUID2.getLeastSignificantBits());
        return ((ByteBuffer)comparable).array();
    }

    public static UUID J(byte[] a2) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(a2);
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        return new UUID(l2, l3);
    }
}

