package o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public class setFilterRedundantCalls implements Window.Callback {
    final Window.Callback MenuHostHelper$$ExternalSyntheticLambda0;

    public setFilterRedundantCalls(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return setY.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, searchEvent);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return setY.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        setFilterRedundantCalls$MenuHostHelper$$ExternalSyntheticLambda0.setX(this.MenuHostHelper$$ExternalSyntheticLambda0, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.onPointerCaptureChanged(z);
    }

    public final Window.Callback MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* loaded from: classes.dex */
    static class setY {
        static boolean setY(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode setIconTintList(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList {
    }
}