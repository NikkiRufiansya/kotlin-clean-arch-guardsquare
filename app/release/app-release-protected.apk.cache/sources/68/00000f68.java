package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSelectedTabIndicatorGravity implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static setSelectedTabIndicatorGravity MenuHostHelper$$ExternalSyntheticLambda0;
    private static setSelectedTabIndicatorGravity setY;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private final CharSequence setCenterIfNoTextEnabled;
    private int setIconTintList;
    private boolean setLayoutAnimation;
    private boolean setNavigationOnClickListener;
    private final int setOnLongClickListener;
    private getSystemGestureInsets setUnboundedRipple;
    private final View setX;
    private final Runnable setIconSize = new Runnable() { // from class: o.NestedScrollView$SavedState$1
        @Override // java.lang.Runnable
        public final void run() {
            setSelectedTabIndicatorGravity.this.setX();
        }
    };
    private final Runnable setUiOptions = new Runnable() { // from class: o.setCheckedColor
        @Override // java.lang.Runnable
        public final void run() {
            setSelectedTabIndicatorGravity.this.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    };

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void setX() {
        setX(false);
    }

    public static void setIconTintList(View view, CharSequence charSequence) {
        setSelectedTabIndicatorGravity setselectedtabindicatorgravity = setY;
        if (setselectedtabindicatorgravity != null && setselectedtabindicatorgravity.setX == view) {
            setY(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setSelectedTabIndicatorGravity setselectedtabindicatorgravity2 = MenuHostHelper$$ExternalSyntheticLambda0;
            if (setselectedtabindicatorgravity2 != null && setselectedtabindicatorgravity2.setX == view) {
                setselectedtabindicatorgravity2.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new setSelectedTabIndicatorGravity(view, charSequence);
    }

    private setSelectedTabIndicatorGravity(View view, CharSequence charSequence) {
        this.setX = view;
        this.setCenterIfNoTextEnabled = charSequence;
        this.setOnLongClickListener = setQuery.MenuHostHelper$$ExternalSyntheticLambda1(ViewConfiguration.get(view.getContext()));
        setIconTintList();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.setIconTintList = view.getWidth() / 2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = view.getHeight() / 2;
        setX(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.setUnboundedRipple == null || !this.setLayoutAnimation) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.setX.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    setIconTintList();
                    MenuHostHelper$$ExternalSyntheticLambda0();
                }
            } else if (this.setX.isEnabled() && this.setUnboundedRipple == null && setX(motionEvent)) {
                setY(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    void setX(boolean z) {
        int height;
        int i;
        long longPressTimeout;
        long j;
        long j2;
        if (setBaselineAlignBottom.setChipIconTintResource(this.setX)) {
            setY(null);
            setSelectedTabIndicatorGravity setselectedtabindicatorgravity = MenuHostHelper$$ExternalSyntheticLambda0;
            if (setselectedtabindicatorgravity != null) {
                setselectedtabindicatorgravity.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = this;
            this.setLayoutAnimation = z;
            getSystemGestureInsets getsystemgestureinsets = new getSystemGestureInsets(this.setX.getContext());
            this.setUnboundedRipple = getsystemgestureinsets;
            View view = this.setX;
            int i2 = this.setIconTintList;
            int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            boolean z2 = this.setLayoutAnimation;
            CharSequence charSequence = this.setCenterIfNoTextEnabled;
            if (getsystemgestureinsets.MenuHostHelper$$ExternalSyntheticLambda1.getParent() != null) {
                getsystemgestureinsets.setY();
            }
            getsystemgestureinsets.setX.setText(charSequence);
            WindowManager.LayoutParams layoutParams = getsystemgestureinsets.MenuHostHelper$$ExternalSyntheticLambda0;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = getsystemgestureinsets.setIconTintList.getResources().getDimensionPixelOffset(R.dimen.res_0x7f070267);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = getsystemgestureinsets.setIconTintList.getResources().getDimensionPixelOffset(R.dimen.res_0x7f070266);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = getsystemgestureinsets.setIconTintList.getResources().getDimensionPixelOffset(z2 ? R.dimen.res_0x7f07026a : R.dimen.res_0x7f070269);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(getsystemgestureinsets.setUnboundedRipple);
                if (getsystemgestureinsets.setUnboundedRipple.left < 0 && getsystemgestureinsets.setUnboundedRipple.top < 0) {
                    Resources resources = getsystemgestureinsets.setIconTintList.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    getsystemgestureinsets.setUnboundedRipple.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(getsystemgestureinsets.setUiOptions);
                view.getLocationOnScreen(getsystemgestureinsets.setY);
                int[] iArr = getsystemgestureinsets.setY;
                int i4 = iArr[0];
                int[] iArr2 = getsystemgestureinsets.setUiOptions;
                int i5 = i4 - iArr2[0];
                iArr[0] = i5;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i5 + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                getsystemgestureinsets.MenuHostHelper$$ExternalSyntheticLambda1.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = getsystemgestureinsets.MenuHostHelper$$ExternalSyntheticLambda1.getMeasuredHeight();
                int i6 = getsystemgestureinsets.setY[1];
                int i7 = ((i + i6) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (!z2) {
                    if (measuredHeight + i8 <= getsystemgestureinsets.setUnboundedRipple.height()) {
                        layoutParams.y = i8;
                    }
                    layoutParams.y = i7;
                } else {
                    if (i7 < 0) {
                        layoutParams.y = i8;
                    }
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) getsystemgestureinsets.setIconTintList.getSystemService("window")).addView(getsystemgestureinsets.MenuHostHelper$$ExternalSyntheticLambda1, getsystemgestureinsets.MenuHostHelper$$ExternalSyntheticLambda0);
            this.setX.addOnAttachStateChangeListener(this);
            if (this.setLayoutAnimation) {
                j2 = 2500;
            } else {
                if ((setBaselineAlignBottom.setMinAndMaxProgress(this.setX) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.setX.removeCallbacks(this.setUiOptions);
            this.setX.postDelayed(this.setUiOptions, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (MenuHostHelper$$ExternalSyntheticLambda0 == this) {
            MenuHostHelper$$ExternalSyntheticLambda0 = null;
            getSystemGestureInsets getsystemgestureinsets = this.setUnboundedRipple;
            if (getsystemgestureinsets != null) {
                getsystemgestureinsets.setY();
                this.setUnboundedRipple = null;
                setIconTintList();
                this.setX.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (setY == this) {
            setY(null);
        }
        this.setX.removeCallbacks(this.setUiOptions);
    }

    private static void setY(setSelectedTabIndicatorGravity setselectedtabindicatorgravity) {
        setSelectedTabIndicatorGravity setselectedtabindicatorgravity2 = setY;
        if (setselectedtabindicatorgravity2 != null) {
            setselectedtabindicatorgravity2.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        setY = setselectedtabindicatorgravity;
        if (setselectedtabindicatorgravity != null) {
            setselectedtabindicatorgravity.setY();
        }
    }

    private void setY() {
        this.setX.postDelayed(this.setIconSize, ViewConfiguration.getLongPressTimeout());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setX.removeCallbacks(this.setIconSize);
    }

    private boolean setX(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.setNavigationOnClickListener || Math.abs(x - this.setIconTintList) > this.setOnLongClickListener || Math.abs(y - this.MenuHostHelper$$ExternalSyntheticLambda1) > this.setOnLongClickListener) {
            this.setIconTintList = x;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = y;
            this.setNavigationOnClickListener = false;
            return true;
        }
        return false;
    }

    private void setIconTintList() {
        this.setNavigationOnClickListener = true;
    }
}