/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ua
extends MessageLiteOrBuilder {
    public boolean hasBlur();

    public int getSize();

    public boolean getBlur();

    public boolean hasFractionalMetrics();

    public boolean hasResource();

    public int getResource();

    public ByteString getPathBytes();

    public boolean hasSize();

    public boolean getFractionalMetrics();

    public boolean hasAntiAlias();

    public boolean hasPath();

    public String getPath();

    public boolean getAntiAlias();

    public bM getFontCase();
}

