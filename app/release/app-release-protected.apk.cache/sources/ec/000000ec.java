package com.google.android.material.snackbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import o.setBaselineAlignBottom;
import o.setChipStrokeColorResource;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    private setY MenuHostHelper$$ExternalSyntheticLambda0;
    private final AccessibilityManager setY;

    static {
        new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ((BaseTransientBottomBar) message.obj).setIconTintList();
                    return true;
                } else if (i != 1) {
                    return false;
                } else {
                    int i2 = message.arg1;
                    ((BaseTransientBottomBar) message.obj).MenuHostHelper$$ExternalSyntheticLambda0();
                    return true;
                }
            }
        });
    }

    final void setIconTintList() {
        throw null;
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        throw null;
    }

    /* loaded from: classes.dex */
    public static class setY extends FrameLayout {
        private static final View.OnTouchListener setY = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.setY.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };
        private boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private BaseTransientBottomBar<?> MenuHostHelper$$ExternalSyntheticLambda1;
        private PorterDuff.Mode setIconTintList;
        private final int setNavigationOnClickListener;
        private Rect setUiOptions;
        private ColorStateList setX;

        @Override // android.view.View
        public final void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public final void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.setX != null) {
                drawable = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable.mutate());
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, this.setX);
                setEnsureMinTouchTargetSize.setX(drawable, this.setIconTintList);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public final void setBackgroundTintList(ColorStateList colorStateList) {
            this.setX = colorStateList;
            if (getBackground() != null) {
                Drawable navigationOnClickListener = setEnsureMinTouchTargetSize.setNavigationOnClickListener(getBackground().mutate());
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(navigationOnClickListener, colorStateList);
                setEnsureMinTouchTargetSize.setX(navigationOnClickListener, this.setIconTintList);
                if (navigationOnClickListener != getBackground()) {
                    super.setBackgroundDrawable(navigationOnClickListener);
                }
            }
        }

        @Override // android.view.View
        public final void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.setIconTintList = mode;
            if (getBackground() != null) {
                Drawable navigationOnClickListener = setEnsureMinTouchTargetSize.setNavigationOnClickListener(getBackground().mutate());
                setEnsureMinTouchTargetSize.setX(navigationOnClickListener, mode);
                if (navigationOnClickListener != getBackground()) {
                    super.setBackgroundDrawable(navigationOnClickListener);
                }
            }
        }

        @Override // android.view.View
        public final void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : setY);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void onAttachedToWindow() {
            super.onAttachedToWindow();
            setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.view.View
        public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.setUiOptions = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        private BaseTransientBottomBar$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener = new BaseTransientBottomBar$MenuHostHelper$$ExternalSyntheticLambda0(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final boolean setY(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            BaseTransientBottomBar$MenuHostHelper$$ExternalSyntheticLambda0 baseTransientBottomBar$MenuHostHelper$$ExternalSyntheticLambda0 = this.setOnLongClickListener;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (setChipStrokeColorResource.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                        setChipStrokeColorResource.MenuHostHelper$$ExternalSyntheticLambda1 = new setChipStrokeColorResource();
                    }
                    setChipStrokeColorResource setchipstrokecolorresource = setChipStrokeColorResource.MenuHostHelper$$ExternalSyntheticLambda1;
                    setChipStrokeColorResource.setX setx = baseTransientBottomBar$MenuHostHelper$$ExternalSyntheticLambda0.setY;
                    synchronized (setchipstrokecolorresource.setY) {
                        setChipStrokeColorResource.setIconTintList seticontintlist = setchipstrokecolorresource.setX;
                    }
                }
            } else if (coordinatorLayout.setIconTintList(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (setChipStrokeColorResource.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    setChipStrokeColorResource.MenuHostHelper$$ExternalSyntheticLambda1 = new setChipStrokeColorResource();
                }
                setChipStrokeColorResource setchipstrokecolorresource2 = setChipStrokeColorResource.MenuHostHelper$$ExternalSyntheticLambda1;
                setChipStrokeColorResource.setX setx2 = baseTransientBottomBar$MenuHostHelper$$ExternalSyntheticLambda0.setY;
                synchronized (setchipstrokecolorresource2.setY) {
                    setChipStrokeColorResource.setIconTintList seticontintlist2 = setchipstrokecolorresource2.setX;
                }
            }
            return super.setY(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            return view instanceof setY;
        }
    }
}