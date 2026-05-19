/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Wa_2
extends MessageLiteOrBuilder {
    public int getMode();

    public List<Integer> getVertexFormatList();

    public int getVertexFormat(int var1);

    public boolean getCulling();

    public int getVertexFormatCount();

    public boolean hasCulling();

    public ByteString getData();
}

