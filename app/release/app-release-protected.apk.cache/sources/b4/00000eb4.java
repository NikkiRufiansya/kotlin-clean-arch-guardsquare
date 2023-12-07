package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setPresenter extends setAccessibilityTraversalBefore implements onActivityPostResumed {
    public static Method setX;
    public onActivityPostResumed MenuHostHelper$$ExternalSyntheticLambda1;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                setX = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public setPresenter(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // o.setAccessibilityTraversalBefore
    final setCheckedIconTint MenuHostHelper$$ExternalSyntheticLambda0(Context context, boolean z) {
        setIconTintList seticontintlist = new setIconTintList(context, z);
        seticontintlist.setHoverListener(this);
        return seticontintlist;
    }

    @Override // o.onActivityPostResumed
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        onActivityPostResumed onactivitypostresumed = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (onactivitypostresumed != null) {
            onactivitypostresumed.MenuHostHelper$$ExternalSyntheticLambda1(setnavigationicontint, menuItem);
        }
    }

    @Override // o.onActivityPostResumed
    public final void setIconTintList(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        onActivityPostResumed onactivitypostresumed = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (onactivitypostresumed != null) {
            onactivitypostresumed.setIconTintList(setnavigationicontint, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setCheckedIconTint {
        private onActivityPostResumed setIconTintList;
        private MenuItem setNavigationOnClickListener;
        final int setX;
        final int setY;

        @Override // o.setCheckedIconTint, android.view.ViewGroup, android.view.View
        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // o.setCheckedIconTint, android.view.View
        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // o.setCheckedIconTint, android.view.View
        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // o.setCheckedIconTint, android.view.View
        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // o.setCheckedIconTint, android.widget.AbsListView, android.view.View
        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // o.setCheckedIconTint, android.widget.AbsListView
        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // o.setCheckedIconTint
        public final /* bridge */ /* synthetic */ int setX(int i, int i2, int i3, int i4, int i5) {
            return super.setX(i, i2, i3, i4, i5);
        }

        @Override // o.setCheckedIconTint
        public final /* bridge */ /* synthetic */ boolean setX(MotionEvent motionEvent, int i) {
            return super.setX(motionEvent, i);
        }

        public setIconTintList(Context context, boolean z) {
            super(context, z);
            if (1 == setPresenter$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(context.getResources().getConfiguration())) {
                this.setY = 21;
                this.setX = 22;
                return;
            }
            this.setY = 22;
            this.setX = 21;
        }

        public final void setHoverListener(onActivityPostResumed onactivitypostresumed) {
            this.setIconTintList = onactivitypostresumed;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            setSubmitButtonEnabled setsubmitbuttonenabled;
            FabTransformationBehavior fabTransformationBehavior = (FabTransformationBehavior) getSelectedView();
            if (fabTransformationBehavior != null && i == this.setY) {
                if (fabTransformationBehavior.isEnabled() && fabTransformationBehavior.setY.hasSubMenu()) {
                    performItemClick(fabTransformationBehavior, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (fabTransformationBehavior != null && i == this.setX) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    setsubmitbuttonenabled = (setSubmitButtonEnabled) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    setsubmitbuttonenabled = (setSubmitButtonEnabled) adapter;
                }
                setsubmitbuttonenabled.setY.setX(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // o.setCheckedIconTint, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            setSubmitButtonEnabled setsubmitbuttonenabled;
            int i;
            int pointToPosition;
            int i2;
            if (this.setIconTintList != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    setsubmitbuttonenabled = (setSubmitButtonEnabled) headerViewListAdapter.getWrappedAdapter();
                } else {
                    setsubmitbuttonenabled = (setSubmitButtonEnabled) adapter;
                    i = 0;
                }
                ActionMenuPresenter$SavedState$1 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= setsubmitbuttonenabled.getCount()) ? null : setsubmitbuttonenabled.getItem(i2);
                MenuItem menuItem = this.setNavigationOnClickListener;
                if (menuItem != item) {
                    setNavigationIconTint setnavigationicontint = setsubmitbuttonenabled.setY;
                    if (menuItem != null) {
                        this.setIconTintList.setIconTintList(setnavigationicontint, menuItem);
                    }
                    this.setNavigationOnClickListener = item;
                    if (item != null) {
                        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setnavigationicontint, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class setY {
        public static void setIconTintList(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }
}