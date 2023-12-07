package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import o.setIconTint;

/* renamed from: o.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0530v extends View {
    final RectF MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private float ViewPager$SavedState$1;
    private final Paint setCenterIfNoTextEnabled;
    private boolean setChipCornerRadius;
    private v$MenuHostHelper$$ExternalSyntheticLambda1 setIconSize;
    final int setIconTintList;
    private float setLayoutAnimation;
    private double setNavigationOnClickListener;
    private int setOnLongClickListener;
    private ValueAnimator setTextAlignment;
    private int setTextScaleX;
    private float setUiOptions;
    private boolean setUnboundedRipple;
    final List<setX> setX;
    private final float setY;
    private final int setZ;

    /* renamed from: o.v$setX */
    /* loaded from: classes.dex */
    public interface setX {
        void MenuHostHelper$$ExternalSyntheticLambda0(float f, boolean z);
    }

    public C0530v(Context context) {
        this(context, null);
    }

    public C0530v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0402c6);
    }

    public C0530v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setX = new ArrayList();
        Paint paint = new Paint();
        this.setCenterIfNoTextEnabled = paint;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setTextAlignment, i, R.style._res_0x7f150411);
        this.setOnLongClickListener = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.setIconTintList = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.setZ = resources.getDimensionPixelSize(R.dimen.res_0x7f070171);
        this.setY = resources.getDimensionPixelSize(R.dimen.res_0x7f07016f);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.setTextScaleX = ViewConfiguration.get(context).getScaledTouchSlop();
        setBaselineAlignBottom.setUnboundedRipple(this, 2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setHandRotation(this.ViewPager$SavedState$1);
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(float f, boolean z) {
        ValueAnimator valueAnimator = this.setTextAlignment;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            MenuHostHelper$$ExternalSyntheticLambda1(f, false);
            return;
        }
        float f2 = this.ViewPager$SavedState$1;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.setTextAlignment = ofFloat;
        ofFloat.setDuration(200L);
        this.setTextAlignment.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.v.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C0530v.this.MenuHostHelper$$ExternalSyntheticLambda1(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.setTextAlignment.addListener(new AnimatorListenerAdapter() { // from class: o.v.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.setTextAlignment.start();
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(float f, boolean z) {
        float f2 = f % 360.0f;
        this.ViewPager$SavedState$1 = f2;
        this.setNavigationOnClickListener = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.setOnLongClickListener * ((float) Math.cos(this.setNavigationOnClickListener)));
        float height = (getHeight() / 2) + (this.setOnLongClickListener * ((float) Math.sin(this.setNavigationOnClickListener)));
        RectF rectF = this.MenuHostHelper$$ExternalSyntheticLambda0;
        float f3 = this.setIconTintList;
        rectF.set(width - f3, height - f3, width + f3, height + f3);
        for (setX setx : this.setX) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0(f2, z);
        }
        invalidate();
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }

    public void setOnActionUpListener(v$MenuHostHelper$$ExternalSyntheticLambda1 v_menuhosthelper__externalsyntheticlambda1) {
        this.setIconSize = v_menuhosthelper__externalsyntheticlambda1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.setCenterIfNoTextEnabled.setStrokeWidth(0.0f);
        canvas.drawCircle((this.setOnLongClickListener * ((float) Math.cos(this.setNavigationOnClickListener))) + width2, (this.setOnLongClickListener * ((float) Math.sin(this.setNavigationOnClickListener))) + f, this.setIconTintList, this.setCenterIfNoTextEnabled);
        double sin = Math.sin(this.setNavigationOnClickListener);
        double cos = Math.cos(this.setNavigationOnClickListener);
        this.setCenterIfNoTextEnabled.setStrokeWidth(this.setZ);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.setCenterIfNoTextEnabled);
        canvas.drawCircle(width2, f, this.setY, this.setCenterIfNoTextEnabled);
    }

    public void setCircleRadius(int i) {
        this.setOnLongClickListener = i;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        v$MenuHostHelper$$ExternalSyntheticLambda1 v_menuhosthelper__externalsyntheticlambda1;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.setUiOptions);
                int i2 = (int) (y - this.setLayoutAnimation);
                this.setChipCornerRadius = (i * i) + (i2 * i2) > this.setTextScaleX;
                z2 = this.setUnboundedRipple;
                z = actionMasked == 1;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.setUiOptions = x;
            this.setLayoutAnimation = y;
            this.setChipCornerRadius = true;
            this.setUnboundedRipple = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean z6 = this.setUnboundedRipple;
        float x2 = setX(x, y);
        boolean z7 = this.ViewPager$SavedState$1 != x2;
        if (!z3 || !z7) {
            if (z7 || z2) {
                if (z && this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    z5 = true;
                }
                setHandRotation(x2, z5);
            }
            z4 = z5 | z6;
            this.setUnboundedRipple = z4;
            if (z4 && z && (v_menuhosthelper__externalsyntheticlambda1 = this.setIconSize) != null) {
                v_menuhosthelper__externalsyntheticlambda1.setX(setX(x, y), this.setChipCornerRadius);
            }
            return true;
        }
        z5 = true;
        z4 = z5 | z6;
        this.setUnboundedRipple = z4;
        if (z4) {
            v_menuhosthelper__externalsyntheticlambda1.setX(setX(x, y), this.setChipCornerRadius);
        }
        return true;
    }

    private int setX(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }
}