package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class setSupportCheckMarkTintList {
    public static ColorStateList setX(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static void setY(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    public static void setX(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        imageView.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static PorterDuff.Mode setY(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }
}