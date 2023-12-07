package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public final class setNextFocusLeftId {
    public static final int setY = 2;
    public final setNextFocusLeftId$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
    public final Paint MenuHostHelper$$ExternalSyntheticLambda1;
    public final View setIconTintList;
    private boolean setLayoutAnimation;
    private final Path setNavigationOnClickListener;
    private get$MenuHostHelper$$ExternalSyntheticLambda1 setOnLongClickListener;
    private final Paint setUiOptions;
    private boolean setUnboundedRipple;
    public Drawable setX;

    public setNextFocusLeftId(setNextFocusLeftId$MenuHostHelper$$ExternalSyntheticLambda0 setnextfocusleftid_menuhosthelper__externalsyntheticlambda0) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setnextfocusleftid_menuhosthelper__externalsyntheticlambda0;
        View view = (View) setnextfocusleftid_menuhosthelper__externalsyntheticlambda0;
        this.setIconTintList = view;
        view.setWillNotDraw(false);
        this.setNavigationOnClickListener = new Path();
        this.setUiOptions = new Paint(7);
        Paint paint = new Paint(1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = paint;
        paint.setColor(0);
    }

    public final void setIconTintList() {
        if (setY == 0) {
            this.setUnboundedRipple = true;
            this.setLayoutAnimation = false;
            this.setIconTintList.buildDrawingCache();
            Bitmap drawingCache = this.setIconTintList.getDrawingCache();
            if (drawingCache == null && this.setIconTintList.getWidth() != 0 && this.setIconTintList.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.setIconTintList.getWidth(), this.setIconTintList.getHeight(), Bitmap.Config.ARGB_8888);
                this.setIconTintList.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.setUiOptions;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.setUnboundedRipple = false;
            this.setLayoutAnimation = true;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (setY == 0) {
            this.setLayoutAnimation = false;
            this.setIconTintList.destroyDrawingCache();
            this.setUiOptions.setShader(null);
            this.setIconTintList.invalidate();
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1) {
        if (get_menuhosthelper__externalsyntheticlambda1 == null) {
            this.setOnLongClickListener = null;
        } else {
            get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda12 = this.setOnLongClickListener;
            if (get_menuhosthelper__externalsyntheticlambda12 == null) {
                this.setOnLongClickListener = new get$MenuHostHelper$$ExternalSyntheticLambda1(get_menuhosthelper__externalsyntheticlambda1);
            } else {
                float f = get_menuhosthelper__externalsyntheticlambda1.setX;
                float f2 = get_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                float f3 = get_menuhosthelper__externalsyntheticlambda1.setIconTintList;
                get_menuhosthelper__externalsyntheticlambda12.setX = f;
                get_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0 = f2;
                get_menuhosthelper__externalsyntheticlambda12.setIconTintList = f3;
            }
            if (get_menuhosthelper__externalsyntheticlambda1.setIconTintList + 1.0E-4f >= setX(get_menuhosthelper__externalsyntheticlambda1)) {
                this.setOnLongClickListener.setIconTintList = Float.MAX_VALUE;
            }
        }
        setY();
    }

    public final get$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0() {
        get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1 = this.setOnLongClickListener;
        if (get_menuhosthelper__externalsyntheticlambda1 == null) {
            return null;
        }
        get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda12 = new get$MenuHostHelper$$ExternalSyntheticLambda1(get_menuhosthelper__externalsyntheticlambda1);
        if (get_menuhosthelper__externalsyntheticlambda12.setIconTintList == Float.MAX_VALUE) {
            get_menuhosthelper__externalsyntheticlambda12.setIconTintList = setX(get_menuhosthelper__externalsyntheticlambda12);
        }
        return get_menuhosthelper__externalsyntheticlambda12;
    }

    private void setY() {
        if (setY == 1) {
            this.setNavigationOnClickListener.rewind();
            get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1 = this.setOnLongClickListener;
            if (get_menuhosthelper__externalsyntheticlambda1 != null) {
                this.setNavigationOnClickListener.addCircle(get_menuhosthelper__externalsyntheticlambda1.setX, this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0, this.setOnLongClickListener.setIconTintList, Path.Direction.CW);
            }
        }
        this.setIconTintList.invalidate();
    }

    private float setX(get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1) {
        return setStrokeColor.setX(get_menuhosthelper__externalsyntheticlambda1.setX, get_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList.getWidth(), this.setIconTintList.getHeight());
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas) {
        boolean z = false;
        if (setX()) {
            int i = setY;
            if (i == 0) {
                canvas.drawCircle(this.setOnLongClickListener.setX, this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0, this.setOnLongClickListener.setIconTintList, this.setUiOptions);
                if (!this.setUnboundedRipple && Color.alpha(this.MenuHostHelper$$ExternalSyntheticLambda1.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawCircle(this.setOnLongClickListener.setX, this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0, this.setOnLongClickListener.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.setNavigationOnClickListener);
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(canvas);
                if (!this.setUnboundedRipple && Color.alpha(this.MenuHostHelper$$ExternalSyntheticLambda1.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawRect(0.0f, 0.0f, this.setIconTintList.getWidth(), this.setIconTintList.getHeight(), this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(canvas);
                if (!this.setUnboundedRipple && Color.alpha(this.MenuHostHelper$$ExternalSyntheticLambda1.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawRect(0.0f, 0.0f, this.setIconTintList.getWidth(), this.setIconTintList.getHeight(), this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
            } else {
                StringBuilder sb = new StringBuilder("Unsupported strategy ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(canvas);
            if (!this.setUnboundedRipple && Color.alpha(this.MenuHostHelper$$ExternalSyntheticLambda1.getColor()) != 0) {
                z = true;
            }
            if (z) {
                canvas.drawRect(0.0f, 0.0f, this.setIconTintList.getWidth(), this.setIconTintList.getHeight(), this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda0(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setX() {
        /*
            r4 = this;
            o.get$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r4.setOnLongClickListener
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            float r0 = r0.setIconTintList
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L16
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            int r3 = o.setNextFocusLeftId.setY
            if (r3 != 0) goto L23
            if (r0 != 0) goto L22
            boolean r0 = r4.setLayoutAnimation
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        L23:
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNextFocusLeftId.setX():boolean");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas) {
        if ((this.setUnboundedRipple || this.setX == null || this.setOnLongClickListener == null) ? false : true) {
            Rect bounds = this.setX.getBounds();
            float width = this.setOnLongClickListener.setX - (bounds.width() / 2.0f);
            float height = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.setX.draw(canvas);
            canvas.translate(-width, -height);
        }
    }
}