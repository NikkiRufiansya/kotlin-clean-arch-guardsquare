package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
class setIndeterminateTintList {
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {16843067, 16843068};
    private final ProgressBar setIconTintList;
    private Bitmap setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIndeterminateTintList(ProgressBar progressBar) {
        this.setIconTintList = progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(AttributeSet attributeSet, int i) {
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.getContext(), attributeSet, MenuHostHelper$$ExternalSyntheticLambda1, i, 0);
        Drawable x = MenuHostHelper$$ExternalSyntheticLambda0.setX(0);
        if (x != null) {
            this.setIconTintList.setIndeterminateDrawable(setIconTintList(x));
        }
        Drawable x2 = MenuHostHelper$$ExternalSyntheticLambda0.setX(1);
        if (x2 != null) {
            this.setIconTintList.setProgressDrawable(MenuHostHelper$$ExternalSyntheticLambda1(x2, false));
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    Drawable MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable, boolean z) {
        if (drawable instanceof setExpanded) {
            setExpanded setexpanded = (setExpanded) drawable;
            Drawable MenuHostHelper$$ExternalSyntheticLambda0 = setexpanded.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                setexpanded.setX(MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = MenuHostHelper$$ExternalSyntheticLambda1(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                if (Build.VERSION.SDK_INT >= 23) {
                    setX.MenuHostHelper$$ExternalSyntheticLambda0(layerDrawable, layerDrawable2, i2);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.setY == null) {
                this.setY = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(setY());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable setIconTintList(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(animationDrawable.getFrame(i), true);
                MenuHostHelper$$ExternalSyntheticLambda12.setLevel(10000);
                animationDrawable2.addFrame(MenuHostHelper$$ExternalSyntheticLambda12, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    private Shape setY() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap setIconTintList() {
        return this.setY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        public static void MenuHostHelper$$ExternalSyntheticLambda0(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }
}