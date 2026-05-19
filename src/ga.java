/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn
 *  io
 *  rO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ga
extends MessageLiteOrBuilder {
    public io getIsometricMousePosition();

    public boolean hasResourceRequest();

    public cn getIsometricClick();

    public boolean hasCallback();

    public ByteString getCallback();

    public rO getActionCase();

    public boolean hasIsometricClick();

    public fM getResourceRequest();

    public boolean hasIsometricMousePosition();
}

