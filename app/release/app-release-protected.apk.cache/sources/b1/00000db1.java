package o;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.setBaselineAlignBottom;

/* loaded from: classes.dex */
public final class setNavigationContentDescription extends setHasDecor {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconSize;
    FrameLayout setIconTintList;
    private FrameLayout setLayoutAnimation;
    boolean setNavigationOnClickListener;
    boolean setOnLongClickListener;
    setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1 setUiOptions;
    private androidx.coordinatorlayout.widget.CoordinatorLayout setUnboundedRipple;
    BottomSheetBehavior.setY setX;
    com.google.android.material.bottomsheet.BottomSheetBehavior<FrameLayout> setY;

    @Override // o.setHasDecor, o.setUnboundedRipple, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(setX(i, null, null));
    }

    @Override // o.setHasDecor, o.setUnboundedRipple, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // o.setHasDecor, o.setUnboundedRipple, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(setX(0, view, null));
    }

    @Override // o.setHasDecor, o.setUnboundedRipple, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(setX(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
            com.google.android.material.bottomsheet.BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.setY;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setX(z);
            }
        }
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public final void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.setY;
        if (bottomSheetBehavior == null || bottomSheetBehavior.setTextAppearanceResource != 5) {
            return;
        }
        this.setY.setIconTintList(4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.setIconSize && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.setLayoutAnimation;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.setUnboundedRipple;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            setCloseIconResource.setIconTintList(window, !z);
            setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1 setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1 = this.setUiOptions;
            if (setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1 != null) {
                setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1.setX(window);
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1 setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1 = this.setUiOptions;
        if (setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1 != null) {
            setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1.setX((Window) null);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        this.setNavigationOnClickListener = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FrameLayout setIconTintList() {
        if (this.setLayoutAnimation == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.res_0x7f0d0022, null);
            this.setLayoutAnimation = frameLayout;
            this.setUnboundedRipple = (androidx.coordinatorlayout.widget.CoordinatorLayout) frameLayout.findViewById(R.id.res_0x7f0a0091);
            FrameLayout frameLayout2 = (FrameLayout) this.setLayoutAnimation.findViewById(R.id.res_0x7f0a00a2);
            this.setIconTintList = frameLayout2;
            com.google.android.material.bottomsheet.BottomSheetBehavior<FrameLayout> MenuHostHelper$$ExternalSyntheticLambda0 = com.google.android.material.bottomsheet.BottomSheetBehavior.MenuHostHelper$$ExternalSyntheticLambda0(frameLayout2);
            this.setY = MenuHostHelper$$ExternalSyntheticLambda0;
            BottomSheetBehavior.setY sety = this.setX;
            if (!MenuHostHelper$$ExternalSyntheticLambda0.setX.contains(sety)) {
                MenuHostHelper$$ExternalSyntheticLambda0.setX.add(sety);
            }
            this.setY.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return this.setLayoutAnimation;
    }

    private View setX(int i, View view, ViewGroup.LayoutParams layoutParams) {
        setIconTintList();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.setLayoutAnimation.findViewById(R.id.res_0x7f0a0091);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.setIconSize) {
            setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, new setCircularRevealScrimColor() { // from class: o.setNavigationContentDescription.2
                @Override // o.setCircularRevealScrimColor
                public final WindowInsetsCompat setIconTintList(View view2, WindowInsetsCompat windowInsetsCompat) {
                    if (setNavigationContentDescription.this.setUiOptions != null) {
                        com.google.android.material.bottomsheet.BottomSheetBehavior<FrameLayout> bottomSheetBehavior = setNavigationContentDescription.this.setY;
                        bottomSheetBehavior.setX.remove(setNavigationContentDescription.this.setUiOptions);
                    }
                    if (windowInsetsCompat != null) {
                        setNavigationContentDescription setnavigationcontentdescription = setNavigationContentDescription.this;
                        setnavigationcontentdescription.setUiOptions = new setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1(setnavigationcontentdescription.setIconTintList, windowInsetsCompat, (byte) 0);
                        setNavigationContentDescription.this.setUiOptions.setX(setNavigationContentDescription.this.getWindow());
                        com.google.android.material.bottomsheet.BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = setNavigationContentDescription.this.setY;
                        setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1 setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1 = setNavigationContentDescription.this.setUiOptions;
                        if (!bottomSheetBehavior2.setX.contains(setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1)) {
                            bottomSheetBehavior2.setX.add(setnavigationcontentdescription_menuhosthelper__externalsyntheticlambda1);
                        }
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.setIconTintList.removeAllViews();
        if (layoutParams == null) {
            this.setIconTintList.addView(view);
        } else {
            this.setIconTintList.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.res_0x7f0a0200).setOnClickListener(new View.OnClickListener() { // from class: o.setNavigationContentDescription.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (setNavigationContentDescription.this.MenuHostHelper$$ExternalSyntheticLambda1 && setNavigationContentDescription.this.isShowing()) {
                    setNavigationContentDescription setnavigationcontentdescription = setNavigationContentDescription.this;
                    if (!setnavigationcontentdescription.setNavigationOnClickListener) {
                        TypedArray obtainStyledAttributes = setnavigationcontentdescription.getContext().obtainStyledAttributes(new int[]{16843611});
                        setnavigationcontentdescription.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        setnavigationcontentdescription.setNavigationOnClickListener = true;
                    }
                    if (setnavigationcontentdescription.MenuHostHelper$$ExternalSyntheticLambda0) {
                        setNavigationContentDescription.this.cancel();
                    }
                }
            }
        });
        setBaselineAlignBottom.setX(this.setIconTintList, new setCounterOverflowTextColor() { // from class: o.setNavigationContentDescription.4
            @Override // o.setCounterOverflowTextColor
            public final void setY(View view2, setDecorPadding setdecorpadding) {
                super.setY(view2, setdecorpadding);
                if (setNavigationContentDescription.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    setdecorpadding.setIconTintList(1048576);
                    setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(true);
                    return;
                }
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(false);
            }

            @Override // o.setCounterOverflowTextColor
            public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576 && setNavigationContentDescription.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    setNavigationContentDescription.this.cancel();
                    return true;
                }
                return super.MenuHostHelper$$ExternalSyntheticLambda1(view2, i2, bundle);
            }
        });
        this.setIconTintList.setOnTouchListener(new View.OnTouchListener() { // from class: o.setNavigationContentDescription.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.setLayoutAnimation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setNavigationContentDescription(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968680(0x7f040068, float:1.754602E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132083201(0x7f150201, float:1.9806538E38)
        L1b:
            r3.<init>(r4, r5)
            r3.MenuHostHelper$$ExternalSyntheticLambda1 = r0
            r3.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            o.setNavigationContentDescription$1 r4 = new o.setNavigationContentDescription$1
            r4.<init>()
            r3.setX = r4
            r3.MenuHostHelper$$ExternalSyntheticLambda0(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130968946(0x7f040172, float:1.754656E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.setIconSize = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNavigationContentDescription.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.setY == null) {
            setIconTintList();
        }
        super.cancel();
    }
}