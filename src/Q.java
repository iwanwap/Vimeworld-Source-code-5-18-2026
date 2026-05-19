/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Q
extends MessageLiteOrBuilder {
    public String getWidthExpr();

    public List<String> getTextList();

    public boolean hasWidth();

    public ByteString getTextBytes(int var1);

    public String getText(int var1);

    public boolean hasShadow();

    public ByteString getWidthExprBytes();

    public boolean getShadow();

    public int getTextCount();

    public int getWidth();

    public int getBackground();

    public int getHoverBackground();

    public boolean hasBackground();

    public boolean hasHoverBackground();

    public boolean hasWidthExpr();
}

