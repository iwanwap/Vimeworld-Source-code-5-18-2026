/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Im
 *  Ym
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface Ia_3
extends MessageLiteOrBuilder {
    public boolean hasAction();

    public Ym getKind();

    public boolean hasId();

    public String getId();

    public ByteString getIdBytes();

    public int getKindValue();

    public int getKey();

    public MN getAction();

    public Im getDataCase();
}

