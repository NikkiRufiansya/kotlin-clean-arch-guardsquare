package o;

/* renamed from: o.ne  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317ne {
    public final long MenuHostHelper$$ExternalSyntheticLambda0;
    public final long MenuHostHelper$$ExternalSyntheticLambda1;
    public final long setCenterIfNoTextEnabled;
    public final int setChipCornerRadius;
    public final long setIconSize;
    public final long setIconTintList;
    public final int setLayoutAnimation;
    public final long setNavigationOnClickListener;
    public final int setOnLongClickListener;
    private long setTextAlignment;
    public final int setUiOptions;
    public final int setUnboundedRipple;
    public final long setX;
    public final long setY;

    public C0317ne(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.setLayoutAnimation = i;
        this.setUiOptions = i2;
        this.setIconTintList = j;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j2;
        this.setNavigationOnClickListener = j3;
        this.setIconSize = j4;
        this.setCenterIfNoTextEnabled = j5;
        this.setX = j6;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j7;
        this.setY = j8;
        this.setUnboundedRipple = i3;
        this.setOnLongClickListener = i4;
        this.setChipCornerRadius = i5;
        this.setTextAlignment = j9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.setLayoutAnimation);
        sb.append(", size=");
        sb.append(this.setUiOptions);
        sb.append(", cacheHits=");
        sb.append(this.setIconTintList);
        sb.append(", cacheMisses=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", downloadCount=");
        sb.append(this.setUnboundedRipple);
        sb.append(", totalDownloadSize=");
        sb.append(this.setNavigationOnClickListener);
        sb.append(", averageDownloadSize=");
        sb.append(this.setX);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.setIconSize);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.setCenterIfNoTextEnabled);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.setY);
        sb.append(", originalBitmapCount=");
        sb.append(this.setOnLongClickListener);
        sb.append(", transformedBitmapCount=");
        sb.append(this.setChipCornerRadius);
        sb.append(", timeStamp=");
        sb.append(this.setTextAlignment);
        sb.append('}');
        return sb.toString();
    }
}