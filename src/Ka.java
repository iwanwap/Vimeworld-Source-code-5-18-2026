/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Ka
extends MessageLiteOrBuilder {
    public int getGradient(int var1);

    public boolean hasHeightExpr();

    public int getRadius();

    public List<Integer> getGradientList();

    public String getHeightExpr();

    public boolean hasRadius();

    public boolean hasWidth();

    public float getHeight();

    public boolean hasHeight();

    public float getWidth();

    public boolean hasWidthExpr();

    public String getWidthExpr();

    public int getGradientCount();

    public ByteString getHeightExprBytes();

    public ByteString getWidthExprBytes();
}

