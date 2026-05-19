/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface wa
extends MessageLiteOrBuilder {
    public int getLocalIds(int var1);

    public int getRemoteIds(int var1);

    public ByteString getRemoteResources();

    public int getRemoteIdsCount();

    public ByteString getLocalResources();

    public int getLocalIdsCount();

    public List<Integer> getLocalIdsList();

    public List<Integer> getRemoteIdsList();
}

