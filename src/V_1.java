/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nj
 *  jk
 *  pn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface V_1
extends MessageLiteOrBuilder {
    public boolean hasBackground();

    public int getAlignValue();

    public ByteString getWidthExprBytes();

    public int getLivePrintingDelay();

    public String getWidthExpr();

    public Nj getWordWrap();

    public boolean hasAlign();

    public List<String> getTextList();

    public jk getAlign();

    public boolean hasShadow();

    public int getWordWrapValue();

    public ZL getOverflow();

    public int getTextCount();

    public boolean hasLineHeight();

    public boolean hasWidthExpr();

    public boolean hasOverflow();

    public ByteString getTextBytes(int var1);

    public int getWidth();

    public boolean hasWidth();

    public boolean hasLivePrintingDelay();

    public pn getFont();

    public boolean hasHoverBackground();

    public boolean getShadow();

    public int getOverflowValue();

    public boolean hasFont();

    public int getHoverBackground();

    public String getText(int var1);

    public int getBackground();

    public boolean hasWordWrap();

    public int getLineHeight();
}

