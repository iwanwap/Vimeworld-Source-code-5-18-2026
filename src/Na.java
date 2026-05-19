/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ko
 *  yN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Na
extends MessageLiteOrBuilder {
    public int getTextureResource();

    public String getTexturePath();

    public boolean getHurtDeathAnimationDisabled();

    public Ko getModelCase();

    public boolean hasTextureResource();

    public do getModelOffset();

    public boolean hasModelResource();

    public float getWidth();

    public int getModelResource();

    public ByteString getModelPathBytes();

    public ByteString getTexturePathBytes();

    public boolean hasHurtDeathAnimationDisabled();

    public float getHeight();

    public boolean hasModelPath();

    public boolean hasColor();

    public boolean hasScale();

    public boolean hasHeight();

    public boolean hasDisableRender();

    public int getColor();

    public boolean hasAlwaysRender();

    public int getAllowedPerspectives(int var1);

    public boolean hasTexturePath();

    public float getScale();

    public List<Integer> getAllowedPerspectivesList();

    public boolean hasWidth();

    public boolean getDisableRender();

    public String getModelPath();

    public boolean getAlwaysRender();

    public int getAllowedPerspectivesCount();

    public yN getTextureCase();

    public boolean hasModelOffset();
}

