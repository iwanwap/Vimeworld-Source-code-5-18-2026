/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QM
 *  bm
 *  jO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ka_3
extends MessageLiteOrBuilder {
    public boolean hasStacks();

    public int getStacks();

    public int getTextureResource();

    public int getSlices();

    public boolean hasTexturePath();

    public boolean hasAngleRotationZ();

    public float getAngleRotationY();

    public boolean hasAngleX();

    public boolean getCulling();

    public float getScale(int var1);

    public int getStyleValue();

    public float getAngleRotationX();

    public boolean hasAngleZ();

    public boolean hasCulling();

    public boolean hasSlices();

    public ByteString getTexturePathBytes();

    public float getAngleRotationZ();

    public float getAngleX();

    public int getScaleCount();

    public boolean hasColor();

    public int getColor();

    public boolean hasAttachment();

    public boolean hasAngleRotationX();

    public jO getStyle();

    public float getAngleZ();

    public boolean hasRadius();

    public float getLoc(int var1);

    public float getRadius();

    public List<Float> getLocList();

    public boolean hasAngleY();

    public boolean hasStyle();

    public boolean hasAngleRotationY();

    public int getLocCount();

    public float getAngleY();

    public bm getTextureCase();

    public boolean hasTextureResource();

    public String getTexturePath();

    public QM getAttachment();

    public List<Float> getScaleList();
}

