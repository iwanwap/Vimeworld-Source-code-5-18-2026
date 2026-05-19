/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Fa_2
extends MessageLiteOrBuilder {
    public List<YM> getArcColorsList();

    public boolean hasDisplayFormat();

    public boolean hasTrackWidth();

    public int getArcColor();

    public String getDisplayFormat();

    public float getSize();

    public boolean hasMax();

    public boolean hasDisplayId();

    public YM getArcColors(int var1);

    public boolean hasValue();

    public ByteString getSizeExprBytes();

    public boolean hasSizeExpr();

    public int getArcColorsCount();

    public int getTrackColor();

    public String getDisplayId();

    public ByteString getDisplayFormatBytes();

    public float getTrackWidth();

    public boolean hasSize();

    public ByteString getCallback();

    public float getMax();

    public float getMin();

    public float getTrackSize();

    public boolean hasCallback();

    public boolean hasTrackSize();

    public boolean hasMin();

    public boolean hasStep();

    public boolean hasArcColor();

    public ByteString getDisplayIdBytes();

    public boolean hasTrackColor();

    public float getStep();

    public String getSizeExpr();

    public float getValue();
}

