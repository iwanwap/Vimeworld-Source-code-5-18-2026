/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dM
 *  vM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface JA_2
extends MessageLiteOrBuilder {
    public vM getSuccess();

    public ByteString getErrorTypeBytes();

    public dM getResultCase();

    public ByteString getPromoBytes();

    public boolean hasErrorType();

    public String getErrorType();

    public String getPromo();

    public boolean hasSuccess();
}

