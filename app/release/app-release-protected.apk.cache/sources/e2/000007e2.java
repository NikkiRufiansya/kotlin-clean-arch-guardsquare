package o;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class onActivityStarted {
    public final Paint MenuHostHelper$$ExternalSyntheticLambda0;
    public final Paint setChipCornerRadius;
    public final Paint setLayoutAnimation;
    public int setNavigationOnClickListener;
    public final Paint setOnLongClickListener;
    public int setTextAlignment;
    public int setUiOptions;
    public final Path setUnboundedRipple;
    public static final int[] setX = new int[3];
    public static final float[] setIconTintList = {0.0f, 0.5f, 1.0f};
    public static final int[] setY = new int[4];
    public static final float[] MenuHostHelper$$ExternalSyntheticLambda1 = {0.0f, 0.0f, 0.5f, 1.0f};

    public onActivityStarted() {
        this((byte) 0);
    }

    private onActivityStarted(byte b) {
        this.setUnboundedRipple = new Path();
        Paint paint = new Paint();
        this.setChipCornerRadius = paint;
        this.setLayoutAnimation = new Paint();
        setIconTintList(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.setOnLongClickListener = new Paint(paint2);
    }

    public final void setIconTintList(int i) {
        this.setTextAlignment = setExtended.setIconTintList(i, 68);
        this.setNavigationOnClickListener = setExtended.setIconTintList(i, 20);
        this.setUiOptions = setExtended.setIconTintList(i, 0);
        this.setLayoutAnimation.setColor(this.setTextAlignment);
    }
}