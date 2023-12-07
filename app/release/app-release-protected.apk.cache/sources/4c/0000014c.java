package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import o.setEnsureMinTouchTargetSize;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class AppCompatSpinner$SavedState$1 {
    public static void setX(Drawable drawable, int i) {
        boolean z = i != 0;
        if (Build.VERSION.SDK_INT == 21) {
            if (z) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter(null);
            }
        } else if (z) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, i);
        } else {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, (ColorStateList) null);
        }
    }

    public static AttributeSet setIconTintList(Context context, int i, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!TextUtils.equals(xml.getName(), charSequence)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Must have a <");
                sb.append((Object) charSequence);
                sb.append("> start tag");
                throw new XmlPullParserException(sb.toString());
            }
            return Xml.asAttributeSet(xml);
        } catch (IOException | XmlPullParserException e) {
            StringBuilder sb2 = new StringBuilder("Can't load badge resource ID #0x");
            sb2.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb2.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static Drawable setY(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
            if (mode != null) {
                setEnsureMinTouchTargetSize.setX(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    public static Drawable MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else if (drawable2.getIntrinsicWidth() <= drawable.getIntrinsicWidth() && drawable2.getIntrinsicHeight() <= drawable.getIntrinsicHeight()) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        } else {
            float intrinsicWidth2 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth3 = drawable.getIntrinsicWidth();
                intrinsicWidth = intrinsicWidth3;
                intrinsicHeight = (int) (intrinsicWidth3 / intrinsicWidth2);
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
        } else {
            int intrinsicWidth4 = (drawable.getIntrinsicWidth() - intrinsicWidth) / 2;
            int intrinsicHeight2 = (drawable.getIntrinsicHeight() - intrinsicHeight) / 2;
            layerDrawable.setLayerInset(1, intrinsicWidth4, intrinsicHeight2, intrinsicWidth4, intrinsicHeight2);
        }
        return layerDrawable;
    }

    public static int[] MenuHostHelper$$ExternalSyntheticLambda0(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }
}