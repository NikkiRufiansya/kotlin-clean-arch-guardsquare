package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;
import o.setBackgroundTintMode;
import o.setBaselineAlignBottom;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class createDispatcher extends setChipIconEnabledResource implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int setNavigationOnClickListener = 2131558411;
    private boolean ExtendableSavedState$1;
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean setAnimationFromJson;
    private final int setCheckedIconEnabled;
    private boolean setChipCornerRadius;
    private int setChipIconTintResource;
    private final Context setIconSize;
    private int setIconified;
    private setBackgroundTintMode.setY setLayoutDirection;
    private PopupWindow.OnDismissListener setMaxEms;
    ViewTreeObserver setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private boolean setTextAlignment;
    private final int setTextAppearanceResource;
    private final int setTextScaleX;
    private View setUiOptions;
    View setX;
    final Handler setY;
    private final List<setNavigationIconTint> setGuidelinePercent = new ArrayList();
    final List<createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0> setIconTintList = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener MenuHostHelper$$ExternalSyntheticLambda1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.createDispatcher.5
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!createDispatcher.this.setUnboundedRipple() || createDispatcher.this.setIconTintList.size() <= 0 || createDispatcher.this.setIconTintList.get(0).setY.setZ()) {
                return;
            }
            View view = createDispatcher.this.setX;
            if (view == null || !view.isShown()) {
                createDispatcher.this.setIconTintList();
                return;
            }
            for (createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 createdispatcher_menuhosthelper__externalsyntheticlambda0 : createDispatcher.this.setIconTintList) {
                createdispatcher_menuhosthelper__externalsyntheticlambda0.setY.setLayoutAnimation();
            }
        }
    };
    private final View.OnAttachStateChangeListener setLayoutAnimation = new View.OnAttachStateChangeListener() { // from class: o.createDispatcher.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (createDispatcher.this.setOnLongClickListener != null) {
                if (!createDispatcher.this.setOnLongClickListener.isAlive()) {
                    createDispatcher.this.setOnLongClickListener = view.getViewTreeObserver();
                }
                createDispatcher.this.setOnLongClickListener.removeGlobalOnLayoutListener(createDispatcher.this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final onActivityPostResumed setZ = new onActivityPostResumed() { // from class: o.createDispatcher.4
        @Override // o.onActivityPostResumed
        public final void setIconTintList(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
            createDispatcher.this.setY.removeCallbacksAndMessages(setnavigationicontint);
        }

        @Override // o.onActivityPostResumed
        public final void MenuHostHelper$$ExternalSyntheticLambda1(final setNavigationIconTint setnavigationicontint, final MenuItem menuItem) {
            createDispatcher.this.setY.removeCallbacksAndMessages(null);
            int size = createDispatcher.this.setIconTintList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (setnavigationicontint == createDispatcher.this.setIconTintList.get(i).MenuHostHelper$$ExternalSyntheticLambda0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 createdispatcher_menuhosthelper__externalsyntheticlambda0 = i2 < createDispatcher.this.setIconTintList.size() ? createDispatcher.this.setIconTintList.get(i2) : null;
            createDispatcher.this.setY.postAtTime(new Runnable() { // from class: o.createDispatcher.4.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (createdispatcher_menuhosthelper__externalsyntheticlambda0 != null) {
                        createDispatcher.this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                        createdispatcher_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0.setX(false);
                        createDispatcher.this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        setnavigationicontint.setX(menuItem, null, 4);
                    }
                }
            }, setnavigationicontint, SystemClock.uptimeMillis() + 200);
        }
    };
    private int setMinAndMaxProgress = 0;
    private int ViewPager$SavedState$1 = 0;
    private boolean setCenterIfNoTextEnabled = false;

    @Override // o.setChipIconEnabledResource
    protected final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return false;
    }

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

    public createDispatcher(Context context, View view, int i, int i2, boolean z) {
        int x;
        this.setIconSize = context;
        this.setUiOptions = view;
        this.setCheckedIconEnabled = i;
        this.setTextAppearanceResource = i2;
        this.setAnimationFromJson = z;
        x = setBaselineAlignBottom.setX.setX(view);
        this.setOnNavigationItemSelectedListener = x != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.setTextScaleX = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.res_0x7f070017));
        this.setY = new Handler();
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        this.setCenterIfNoTextEnabled = z;
    }

    @Override // o.setEdgeEffectFactory
    public final void setLayoutAnimation() {
        if (setUnboundedRipple()) {
            return;
        }
        for (setNavigationIconTint setnavigationicontint : this.setGuidelinePercent) {
            setX(setnavigationicontint);
        }
        this.setGuidelinePercent.clear();
        View view = this.setUiOptions;
        this.setX = view;
        if (view != null) {
            boolean z = this.setOnLongClickListener == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.setOnLongClickListener = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            this.setX.addOnAttachStateChangeListener(this.setLayoutAnimation);
        }
    }

    @Override // o.setEdgeEffectFactory
    public final void setIconTintList() {
        int size = this.setIconTintList.size();
        if (size <= 0) {
            return;
        }
        createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0[] createdispatcher_menuhosthelper__externalsyntheticlambda0Arr = (createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0[]) this.setIconTintList.toArray(new createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 createdispatcher_menuhosthelper__externalsyntheticlambda0 = createdispatcher_menuhosthelper__externalsyntheticlambda0Arr[size];
            if (createdispatcher_menuhosthelper__externalsyntheticlambda0.setY.setUnboundedRipple()) {
                createdispatcher_menuhosthelper__externalsyntheticlambda0.setY.setIconTintList();
            }
        }
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
    public final void setY(setNavigationIconTint setnavigationicontint) {
        setnavigationicontint.setIconTintList(this, this.setIconSize);
        if (setUnboundedRipple()) {
            setX(setnavigationicontint);
        } else {
            this.setGuidelinePercent.add(setnavigationicontint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setX(o.setNavigationIconTint r17) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createDispatcher.setX(o.setNavigationIconTint):void");
    }

    @Override // o.setEdgeEffectFactory
    public final boolean setUnboundedRipple() {
        return this.setIconTintList.size() > 0 && this.setIconTintList.get(0).setY.setUnboundedRipple();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 createdispatcher_menuhosthelper__externalsyntheticlambda0;
        int size = this.setIconTintList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                createdispatcher_menuhosthelper__externalsyntheticlambda0 = null;
                break;
            }
            createdispatcher_menuhosthelper__externalsyntheticlambda0 = this.setIconTintList.get(i);
            if (!createdispatcher_menuhosthelper__externalsyntheticlambda0.setY.setUnboundedRipple()) {
                break;
            }
            i++;
        }
        if (createdispatcher_menuhosthelper__externalsyntheticlambda0 != null) {
            createdispatcher_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0.setX(false);
        }
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        for (createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 createdispatcher_menuhosthelper__externalsyntheticlambda0 : this.setIconTintList) {
            ListAdapter adapter = createdispatcher_menuhosthelper__externalsyntheticlambda0.setY.setY().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((setSubmitButtonEnabled) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBackgroundTintMode.setY sety) {
        this.setLayoutDirection = sety;
    }

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(minusKey minuskey) {
        for (createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 createdispatcher_menuhosthelper__externalsyntheticlambda0 : this.setIconTintList) {
            if (minuskey == createdispatcher_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0) {
                createdispatcher_menuhosthelper__externalsyntheticlambda0.setY.setY().requestFocus();
                return true;
            }
        }
        if (minuskey.hasVisibleItems()) {
            setY(minuskey);
            setBackgroundTintMode.setY sety = this.setLayoutDirection;
            if (sety != null) {
                sety.setY(minuskey);
            }
            return true;
        }
        return false;
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int x;
        int absoluteGravity;
        if (this.setMinAndMaxProgress != i) {
            this.setMinAndMaxProgress = i;
            x = setBaselineAlignBottom.setX.setX(this.setUiOptions);
            absoluteGravity = Gravity.getAbsoluteGravity(i, x);
            this.ViewPager$SavedState$1 = absoluteGravity;
        }
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        int x;
        int absoluteGravity;
        if (this.setUiOptions != view) {
            this.setUiOptions = view;
            int i = this.setMinAndMaxProgress;
            x = setBaselineAlignBottom.setX.setX(view);
            absoluteGravity = Gravity.getAbsoluteGravity(i, x);
            this.ViewPager$SavedState$1 = absoluteGravity;
        }
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda0(PopupWindow.OnDismissListener onDismissListener) {
        this.setMaxEms = onDismissListener;
    }

    @Override // o.setEdgeEffectFactory
    public final ListView setY() {
        if (this.setIconTintList.isEmpty()) {
            return null;
        }
        List<createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0> list = this.setIconTintList;
        return list.get(list.size() - 1).setY.setY();
    }

    @Override // o.setChipIconEnabledResource
    public final void setX(int i) {
        this.setTextAlignment = true;
        this.setIconified = i;
    }

    @Override // o.setChipIconEnabledResource
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setChipCornerRadius = true;
        this.setChipIconTintResource = i;
    }

    @Override // o.setChipIconEnabledResource
    public final void setY(boolean z) {
        this.ExtendableSavedState$1 = z;
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(setNavigationIconTint setnavigationicontint, boolean z) {
        int x;
        int size = this.setIconTintList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (setnavigationicontint == this.setIconTintList.get(i).MenuHostHelper$$ExternalSyntheticLambda0) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.setIconTintList.size()) {
            this.setIconTintList.get(i2).MenuHostHelper$$ExternalSyntheticLambda0.setX(false);
        }
        createDispatcher$MenuHostHelper$$ExternalSyntheticLambda0 remove = this.setIconTintList.remove(i);
        remove.MenuHostHelper$$ExternalSyntheticLambda0.setX(this);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setPresenter setpresenter = remove.setY;
            if (Build.VERSION.SDK_INT >= 23) {
                setPresenter$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(setpresenter.setNavigationOnClickListener, null);
            }
            remove.setY.setY(0);
        }
        remove.setY.setIconTintList();
        int size2 = this.setIconTintList.size();
        if (size2 > 0) {
            this.setOnNavigationItemSelectedListener = this.setIconTintList.get(size2 - 1).MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            x = setBaselineAlignBottom.setX.setX(this.setUiOptions);
            this.setOnNavigationItemSelectedListener = x == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.setIconTintList.get(0).MenuHostHelper$$ExternalSyntheticLambda0.setX(false);
                return;
            }
            return;
        }
        setIconTintList();
        setBackgroundTintMode.setY sety = this.setLayoutDirection;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, true);
        }
        ViewTreeObserver viewTreeObserver = this.setOnLongClickListener;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.setOnLongClickListener.removeGlobalOnLayoutListener(this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            this.setOnLongClickListener = null;
        }
        this.setX.removeOnAttachStateChangeListener(this.setLayoutAnimation);
        this.setMaxEms.onDismiss();
    }
}