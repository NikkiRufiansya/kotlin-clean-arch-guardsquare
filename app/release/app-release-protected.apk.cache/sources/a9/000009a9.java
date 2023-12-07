package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class setBoxStrokeColorStateList {
    @Deprecated
    public float MenuHostHelper$$ExternalSyntheticLambda0;
    @Deprecated
    public float MenuHostHelper$$ExternalSyntheticLambda1;
    @Deprecated
    public float setIconTintList;
    @Deprecated
    private float setOnLongClickListener;
    @Deprecated
    private float setUnboundedRipple;
    boolean setX;
    @Deprecated
    public float setY;
    private final List<setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda0> setUiOptions = new ArrayList();
    private final List<setNavigationOnClickListener> setNavigationOnClickListener = new ArrayList();

    public setBoxStrokeColorStateList() {
        MenuHostHelper$$ExternalSyntheticLambda1(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void setX(float f, float f2) {
        setX setx = new setX();
        setx.setX = f;
        setx.MenuHostHelper$$ExternalSyntheticLambda1 = f2;
        this.setUiOptions.add(setx);
        setIconTintList seticontintlist = new setIconTintList(setx, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY);
        MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist.setIconTintList() + 270.0f);
        this.setNavigationOnClickListener.add(seticontintlist);
        this.setOnLongClickListener = seticontintlist.setIconTintList() + 270.0f;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        this.setY = f2;
    }

    public final void setY(float f, float f2, float f3, float f4, float f5, float f6) {
        setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1 = new setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1(f, f2, f3, f4);
        setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1.setIconTintList = f5;
        setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = f6;
        this.setUiOptions.add(setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1);
        setY sety = new setY(setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        MenuHostHelper$$ExternalSyntheticLambda1(f5);
        this.setNavigationOnClickListener.add(sety);
        this.setOnLongClickListener = f8;
        double d = f7;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.setY = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    public final void setIconTintList(Matrix matrix, Path path) {
        int size = this.setUiOptions.size();
        for (int i = 0; i < size; i++) {
            this.setUiOptions.get(i).setIconTintList(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setNavigationOnClickListener {
        static final Matrix setIconTintList = new Matrix();
        final Matrix MenuHostHelper$$ExternalSyntheticLambda1 = new Matrix();

        public abstract void setY(Matrix matrix, onActivityStarted onactivitystarted, int i, Canvas canvas);

        setNavigationOnClickListener() {
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends setNavigationOnClickListener {
        private final float MenuHostHelper$$ExternalSyntheticLambda0;
        private final float setX;
        private final setX setY;

        public setIconTintList(setX setx, float f, float f2) {
            this.setY = setx;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = f;
            this.setX = f2;
        }

        @Override // o.setBoxStrokeColorStateList.setNavigationOnClickListener
        public final void setY(Matrix matrix, onActivityStarted onactivitystarted, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.setY.MenuHostHelper$$ExternalSyntheticLambda1 - this.setX, this.setY.setX - this.MenuHostHelper$$ExternalSyntheticLambda0), 0.0f);
            this.MenuHostHelper$$ExternalSyntheticLambda1.set(matrix);
            this.MenuHostHelper$$ExternalSyntheticLambda1.preTranslate(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX);
            this.MenuHostHelper$$ExternalSyntheticLambda1.preRotate(setIconTintList());
            Matrix matrix2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = onActivityStarted.setX;
            iArr[0] = onactivitystarted.setUiOptions;
            iArr[1] = onactivitystarted.setNavigationOnClickListener;
            iArr[2] = onactivitystarted.setTextAlignment;
            onactivitystarted.setOnLongClickListener.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, onActivityStarted.setIconTintList, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, onactivitystarted.setOnLongClickListener);
            canvas.restore();
        }

        final float setIconTintList() {
            return (float) Math.toDegrees(Math.atan((this.setY.MenuHostHelper$$ExternalSyntheticLambda1 - this.setX) / (this.setY.setX - this.MenuHostHelper$$ExternalSyntheticLambda0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends setNavigationOnClickListener {
        private final setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 setY;

        public setY(setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1) {
            this.setY = setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1;
        }

        @Override // o.setBoxStrokeColorStateList.setNavigationOnClickListener
        public final void setY(Matrix matrix, onActivityStarted onactivitystarted, int i, Canvas canvas) {
            float f = this.setY.setIconTintList;
            float f2 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1;
            RectF rectF = new RectF(this.setY.setY, this.setY.setLayoutAnimation, this.setY.setX, this.setY.MenuHostHelper$$ExternalSyntheticLambda0);
            boolean z = f2 < 0.0f;
            Path path = onactivitystarted.setUnboundedRipple;
            if (z) {
                int[] iArr = onActivityStarted.setY;
                iArr[0] = 0;
                iArr[1] = onactivitystarted.setUiOptions;
                iArr[2] = onactivitystarted.setNavigationOnClickListener;
                iArr[3] = onactivitystarted.setTextAlignment;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                int[] iArr2 = onActivityStarted.setY;
                iArr2[0] = 0;
                iArr2[1] = onactivitystarted.setTextAlignment;
                iArr2[2] = onactivitystarted.setNavigationOnClickListener;
                iArr2[3] = onactivitystarted.setUiOptions;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f4 = 1.0f - (i / width);
                float[] fArr = onActivityStarted.MenuHostHelper$$ExternalSyntheticLambda1;
                fArr[1] = f4;
                fArr[2] = ((1.0f - f4) / 2.0f) + f4;
                onactivitystarted.MenuHostHelper$$ExternalSyntheticLambda0.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, onActivityStarted.setY, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, onactivitystarted.setChipCornerRadius);
                }
                canvas.drawArc(rectF, f, f2, true, onactivitystarted.MenuHostHelper$$ExternalSyntheticLambda0);
                canvas.restore();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 {
        float MenuHostHelper$$ExternalSyntheticLambda1;
        float setX;

        @Override // o.setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setIconTintList(Matrix matrix, Path path) {
            Matrix matrix2 = this.setOnLongClickListener;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1);
            path.transform(matrix);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(float f) {
        float f2 = this.setOnLongClickListener;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        float f5 = this.setY;
        setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1 = new setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1(f4, f5, f4, f5);
        setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1.setIconTintList = this.setOnLongClickListener;
        setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = f3;
        this.setNavigationOnClickListener.add(new setY(setboxstrokecolorstatelist_menuhosthelper__externalsyntheticlambda1));
        this.setOnLongClickListener = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setNavigationOnClickListener setIconTintList(Matrix matrix) {
        MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple);
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.setNavigationOnClickListener);
        return new setNavigationOnClickListener() { // from class: o.setBoxStrokeColorStateList.4
            @Override // o.setBoxStrokeColorStateList.setNavigationOnClickListener
            public final void setY(Matrix matrix3, onActivityStarted onactivitystarted, int i, Canvas canvas) {
                for (setNavigationOnClickListener setnavigationonclicklistener : arrayList) {
                    setnavigationonclicklistener.setY(matrix2, onactivitystarted, i, canvas);
                }
            }
        };
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, float f3, float f4) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
        this.setIconTintList = f2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0.0f;
        this.setY = f2;
        this.setOnLongClickListener = f3;
        this.setUnboundedRipple = (f3 + f4) % 360.0f;
        this.setUiOptions.clear();
        this.setNavigationOnClickListener.clear();
        this.setX = false;
    }
}