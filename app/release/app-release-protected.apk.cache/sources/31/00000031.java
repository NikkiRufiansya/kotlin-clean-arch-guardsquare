package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda1 = PorterDuff.Mode.SRC_IN;
    Object MenuHostHelper$$ExternalSyntheticLambda0;
    public String setUnboundedRipple;
    public int ViewPager$SavedState$1 = -1;
    public byte[] setX = null;
    public Parcelable setNavigationOnClickListener = null;
    public int setY = 0;
    public int setIconTintList = 0;
    public ColorStateList setUiOptions = null;
    PorterDuff.Mode setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda1;
    public String setOnLongClickListener = null;

    private static String setY(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int setY() {
        if (this.ViewPager$SavedState$1 == -1 && Build.VERSION.SDK_INT >= 23) {
            return IconCompat$MenuHostHelper$$ExternalSyntheticLambda0.setY(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        if (this.ViewPager$SavedState$1 != 2) {
            StringBuilder sb = new StringBuilder("called getResId() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        return this.setY;
    }

    public String toString() {
        if (this.ViewPager$SavedState$1 == -1) {
            return String.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(setY(this.ViewPager$SavedState$1));
        switch (this.ViewPager$SavedState$1) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.MenuHostHelper$$ExternalSyntheticLambda0).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.MenuHostHelper$$ExternalSyntheticLambda0).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.setUnboundedRipple);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(setY())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.setY);
                if (this.setIconTintList != 0) {
                    sb.append(" off=");
                    sb.append(this.setIconTintList);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                break;
        }
        if (this.setUiOptions != null) {
            sb.append(" tint=");
            sb.append(this.setUiOptions);
        }
        if (this.setLayoutAnimation != MenuHostHelper$$ExternalSyntheticLambda1) {
            sb.append(" mode=");
            sb.append(this.setLayoutAnimation);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        this.setOnLongClickListener = this.setLayoutAnimation.name();
        switch (this.ViewPager$SavedState$1) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.setNavigationOnClickListener = (Parcelable) this.MenuHostHelper$$ExternalSyntheticLambda0;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.MenuHostHelper$$ExternalSyntheticLambda0).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.setX = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.setNavigationOnClickListener = (Parcelable) this.MenuHostHelper$$ExternalSyntheticLambda0;
                return;
            case 2:
                this.setX = ((String) this.MenuHostHelper$$ExternalSyntheticLambda0).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.setX = (byte[]) this.MenuHostHelper$$ExternalSyntheticLambda0;
                return;
            case 4:
            case 6:
                this.setX = this.MenuHostHelper$$ExternalSyntheticLambda0.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setLayoutAnimation = PorterDuff.Mode.valueOf(this.setOnLongClickListener);
        switch (this.ViewPager$SavedState$1) {
            case -1:
                Parcelable parcelable = this.setNavigationOnClickListener;
                if (parcelable != null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.setNavigationOnClickListener;
                if (parcelable2 != null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = parcelable2;
                    return;
                }
                byte[] bArr = this.setX;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
                this.ViewPager$SavedState$1 = 3;
                this.setY = 0;
                this.setIconTintList = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.setX, Charset.forName("UTF-16"));
                this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
                if (this.ViewPager$SavedState$1 == 2 && this.setUnboundedRipple == null) {
                    this.setUnboundedRipple = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setX;
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
    }
}