package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import o.setBackgroundTintMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setErrorIconTintList extends setChipIconEnabledResource implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    private static final int setIconTintList = 2131558419;
    ViewTreeObserver MenuHostHelper$$ExternalSyntheticLambda0;
    final setPresenter MenuHostHelper$$ExternalSyntheticLambda1;
    private final setNavigationIconTint ViewPager$SavedState$1;
    private final boolean setAnimationFromJson;
    private PopupWindow.OnDismissListener setCenterIfNoTextEnabled;
    private boolean setCheckedIconEnabled;
    private boolean setChipCornerRadius;
    private View setLayoutAnimation;
    private final int setMaxEms;
    private int setNavigationOnClickListener;
    private final int setOnNavigationItemSelectedListener;
    private final Context setTextAlignment;
    private boolean setTextAppearanceResource;
    private setBackgroundTintMode.setY setTextScaleX;
    private final setSubmitButtonEnabled setUiOptions;
    View setX;
    private final int setZ;
    final ViewTreeObserver.OnGlobalLayoutListener setY = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setErrorIconTintList.5
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!setErrorIconTintList.this.setUnboundedRipple() || setErrorIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda1.setZ()) {
                return;
            }
            View view = setErrorIconTintList.this.setX;
            if (view == null || !view.isShown()) {
                setErrorIconTintList.this.setIconTintList();
            } else {
                setErrorIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation();
            }
        }
    };
    private final View.OnAttachStateChangeListener setOnLongClickListener = new View.OnAttachStateChangeListener() { // from class: o.setErrorIconTintList.4
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (setErrorIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                if (!setErrorIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda0.isAlive()) {
                    setErrorIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda0 = view.getViewTreeObserver();
                }
                setErrorIconTintList.this.MenuHostHelper$$ExternalSyntheticLambda0.removeGlobalOnLayoutListener(setErrorIconTintList.this.setY);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int setIconSize = 0;

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(Parcelable parcelable) {
    }

    @Override // o.setBackgroundTintMode
    public final Parcelable setOnLongClickListener() {
        return null;
    }

    @Override // o.setBackgroundTintMode
    public final boolean setX() {
        return false;
    }

    @Override // o.setChipIconEnabledResource
    public final void setY(setNavigationIconTint setnavigationicontint) {
    }

    public setErrorIconTintList(Context context, setNavigationIconTint setnavigationicontint, View view, int i, int i2, boolean z) {
        this.setTextAlignment = context;
        this.ViewPager$SavedState$1 = setnavigationicontint;
        this.setAnimationFromJson = z;
        this.setUiOptions = new setSubmitButtonEnabled(setnavigationicontint, LayoutInflater.from(context), z, setIconTintList);
        this.setOnNavigationItemSelectedListener = i;
        this.setMaxEms = i2;
        Resources resources = context.getResources();
        this.setZ = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.res_0x7f070017));
        this.setLayoutAnimation = view;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new setPresenter(context, i, i2);
        setnavigationicontint.setIconTintList(this, context);
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        this.setUiOptions.setX = z;
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.setIconSize = i;
    }

    @Override // o.setEdgeEffectFactory
    public final void setIconTintList() {
        if (setUnboundedRipple()) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
        }
    }

    @Override // o.setEdgeEffectFactory
    public final boolean setUnboundedRipple() {
        return !this.setTextAppearanceResource && this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.setTextAppearanceResource = true;
        this.ViewPager$SavedState$1.close();
        ViewTreeObserver viewTreeObserver = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.getViewTreeObserver();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.removeGlobalOnLayoutListener(this.setY);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }
        this.setX.removeOnAttachStateChangeListener(this.setOnLongClickListener);
        PopupWindow.OnDismissListener onDismissListener = this.setCenterIfNoTextEnabled;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        this.setChipCornerRadius = false;
        setSubmitButtonEnabled setsubmitbuttonenabled = this.setUiOptions;
        if (setsubmitbuttonenabled != null) {
            setsubmitbuttonenabled.notifyDataSetChanged();
        }
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBackgroundTintMode.setY sety) {
        this.setTextScaleX = sety;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // o.setBackgroundTintMode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(o.minusKey r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L86
            o.RemoteActionCompatParcelizer r0 = new o.RemoteActionCompatParcelizer
            android.content.Context r3 = r9.setTextAlignment
            android.view.View r5 = r9.setX
            boolean r6 = r9.setAnimationFromJson
            int r7 = r9.setOnNavigationItemSelectedListener
            int r8 = r9.setMaxEms
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            o.setBackgroundTintMode$setY r2 = r9.setTextScaleX
            r0.setX = r2
            o.setChipIconEnabledResource r3 = r0.setIconTintList
            if (r3 == 0) goto L23
            r3.MenuHostHelper$$ExternalSyntheticLambda1(r2)
        L23:
            boolean r2 = o.setChipIconEnabledResource.setIconTintList(r10)
            r0.MenuHostHelper$$ExternalSyntheticLambda1 = r2
            o.setChipIconEnabledResource r3 = r0.setIconTintList
            if (r3 == 0) goto L30
            r3.MenuHostHelper$$ExternalSyntheticLambda1(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.setCenterIfNoTextEnabled
            r0.setY = r2
            r2 = 0
            r9.setCenterIfNoTextEnabled = r2
            o.setNavigationIconTint r2 = r9.ViewPager$SavedState$1
            r2.setX(r1)
            o.setPresenter r2 = r9.MenuHostHelper$$ExternalSyntheticLambda1
            int r2 = r2.MenuHostHelper$$ExternalSyntheticLambda0()
            o.setPresenter r3 = r9.MenuHostHelper$$ExternalSyntheticLambda1
            int r3 = r3.a_()
            int r4 = r9.setIconSize
            android.view.View r5 = r9.setLayoutAnimation
            int r5 = o.setBaselineAlignBottom.ViewPager$SavedState$1(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L60
            android.view.View r4 = r9.setLayoutAnimation
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L60:
            o.setChipIconEnabledResource r4 = r0.setIconTintList
            r5 = 1
            if (r4 == 0) goto L6d
            boolean r4 = r4.setUnboundedRipple()
            if (r4 == 0) goto L6d
            r4 = 1
            goto L6e
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L72
        L70:
            r0 = 1
            goto L7c
        L72:
            android.view.View r4 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            if (r4 != 0) goto L78
            r0 = 0
            goto L7c
        L78:
            r0.setX(r2, r3, r5, r5)
            goto L70
        L7c:
            if (r0 == 0) goto L86
            o.setBackgroundTintMode$setY r0 = r9.setTextScaleX
            if (r0 == 0) goto L85
            r0.setY(r10)
        L85:
            return r5
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(o.minusKey):boolean");
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(setNavigationIconTint setnavigationicontint, boolean z) {
        if (setnavigationicontint != this.ViewPager$SavedState$1) {
            return;
        }
        setIconTintList();
        setBackgroundTintMode.setY sety = this.setTextScaleX;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, z);
        }
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        this.setLayoutAnimation = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            setIconTintList();
            return true;
        }
        return false;
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda0(PopupWindow.OnDismissListener onDismissListener) {
        this.setCenterIfNoTextEnabled = onDismissListener;
    }

    @Override // o.setEdgeEffectFactory
    public final ListView setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setY();
    }

    @Override // o.setChipIconEnabledResource
    public final void setX(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(i);
    }

    @Override // o.setChipIconEnabledResource
    public final void setY(boolean z) {
        this.setCheckedIconEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    @Override // o.setEdgeEffectFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setLayoutAnimation() {
        /*
            r6 = this;
            boolean r0 = r6.setUnboundedRipple()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lbf
        Lb:
            boolean r0 = r6.setTextAppearanceResource
            if (r0 != 0) goto Lbf
            android.view.View r0 = r6.setLayoutAnimation
            if (r0 == 0) goto Lbf
            r6.setX = r0
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r0.MenuHostHelper$$ExternalSyntheticLambda0(r6)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r6)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r0.setIconTintList(r2)
            android.view.View r0 = r6.setX
            android.view.ViewTreeObserver r3 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            if (r3 != 0) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r6.MenuHostHelper$$ExternalSyntheticLambda0 = r4
            if (r3 == 0) goto L3a
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r6.setY
            r4.addOnGlobalLayoutListener(r3)
        L3a:
            android.view.View$OnAttachStateChangeListener r3 = r6.setOnLongClickListener
            r0.addOnAttachStateChangeListener(r3)
            o.setPresenter r3 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r3.setY(r0)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            int r3 = r6.setIconSize
            r0.setUiOptions(r3)
            boolean r0 = r6.setChipCornerRadius
            if (r0 != 0) goto L5d
            o.setSubmitButtonEnabled r0 = r6.setUiOptions
            android.content.Context r3 = r6.setTextAlignment
            int r4 = r6.setZ
            int r0 = setY(r0, r3, r4)
            r6.setNavigationOnClickListener = r0
            r6.setChipCornerRadius = r2
        L5d:
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            int r3 = r6.setNavigationOnClickListener
            r0.setX(r3)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r3 = 2
            r0.setNavigationOnClickListener(r3)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            android.graphics.Rect r3 = r6.setUnboundedRipple
            r0.setIconTintList(r3)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r0.setLayoutAnimation()
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            android.widget.ListView r0 = r0.setY()
            r0.setOnKeyListener(r6)
            boolean r3 = r6.setCheckedIconEnabled
            if (r3 == 0) goto Lb1
            o.setNavigationIconTint r3 = r6.ViewPager$SavedState$1
            java.lang.CharSequence r3 = r3.setUiOptions
            if (r3 == 0) goto Lb1
            android.content.Context r3 = r6.setTextAlignment
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131558418(0x7f0d0012, float:1.8742151E38)
            android.view.View r3 = r3.inflate(r4, r0, r1)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto Laa
            o.setNavigationIconTint r5 = r6.ViewPager$SavedState$1
            java.lang.CharSequence r5 = r5.setUiOptions
            r4.setText(r5)
        Laa:
            r3.setEnabled(r1)
            r4 = 0
            r0.addHeaderView(r3, r4, r1)
        Lb1:
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            o.setSubmitButtonEnabled r1 = r6.setUiOptions
            r0.setIconTintList(r1)
            o.setPresenter r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            r0.setLayoutAnimation()
            goto L8
        Lbf:
            if (r1 == 0) goto Lc2
            return
        Lc2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorIconTintList.setLayoutAnimation():void");
    }
}