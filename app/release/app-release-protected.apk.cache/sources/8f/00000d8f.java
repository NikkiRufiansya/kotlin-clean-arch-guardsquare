package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import o.onOptionsItemSelected;
import o.setChipIconEnabled;
import o.setColumnCount;
import o.setCompoundDrawablePadding;
import o.setContentInsetsRelative;

/* loaded from: classes.dex */
public class setMinAndMaxProgress extends setEndIconContentDescription implements setLayoutDirection, setContentInsetsRelative.setY {
    private setGuidelinePercent setOnLongClickListener;
    private Resources setUnboundedRipple;

    @Override // o.setLayoutDirection
    public setChipIconEnabled MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled.setY sety) {
        return null;
    }

    @Override // o.setLayoutDirection
    public void MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled setchipiconenabled) {
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Deprecated
    public void setCenterIfNoTextEnabled() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setX(int i) {
    }

    @Override // o.setLayoutDirection
    public void setX(setChipIconEnabled setchipiconenabled) {
    }

    public void setY(setContentInsetsRelative setcontentinsetsrelative) {
    }

    public setMinAndMaxProgress() {
        setMaxEms();
    }

    private void setMaxEms() {
        setNavigationOnClickListener().setIconTintList("androidx:appcompat", new setCompoundDrawablePadding.setX() { // from class: o.setMinAndMaxProgress.1
            @Override // o.setCompoundDrawablePadding.setX
            public Bundle MenuHostHelper$$ExternalSyntheticLambda1() {
                Bundle bundle = new Bundle();
                setMinAndMaxProgress.this.setChipCornerRadius().setY(bundle);
                return bundle;
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda0(new setTextAlignment() { // from class: o.setMinAndMaxProgress.3
            @Override // o.setTextAlignment
            public void MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
                setGuidelinePercent chipCornerRadius = setMinAndMaxProgress.this.setChipCornerRadius();
                chipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0();
                chipCornerRadius.setIconTintList(setMinAndMaxProgress.this.setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda0("androidx:appcompat"));
            }
        });
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(setChipCornerRadius().MenuHostHelper$$ExternalSyntheticLambda0(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        setChipCornerRadius().MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        setChipCornerRadius().MenuHostHelper$$ExternalSyntheticLambda1(bundle);
    }

    public setMaxEms setIconSize() {
        return setChipCornerRadius().setX();
    }

    public void setX(setTranscriptMode settranscriptmode) {
        setChipCornerRadius().setIconTintList(settranscriptmode);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return setChipCornerRadius().setY();
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void setContentView(int i) {
        setCheckedIconEnabled();
        setChipCornerRadius().MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void setContentView(View view) {
        setCheckedIconEnabled();
        setChipCornerRadius().MenuHostHelper$$ExternalSyntheticLambda0(view);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        setCheckedIconEnabled();
        setChipCornerRadius().setX(view, layoutParams);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        setCheckedIconEnabled();
        setChipCornerRadius().setIconTintList(view, layoutParams);
    }

    private void setCheckedIconEnabled() {
        setShadowLayer.setX(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.res_0x7f0a0219, this);
        View decorView = getWindow().getDecorView();
        pN.setY(decorView, "");
        decorView.setTag(R.id.res_0x7f0a0218, this);
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setChipCornerRadius().MenuHostHelper$$ExternalSyntheticLambda0(configuration);
        if (this.setUnboundedRipple != null) {
            this.setUnboundedRipple.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // o.setEndIconContentDescription, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        setChipCornerRadius().setOnLongClickListener();
    }

    @Override // o.setEndIconContentDescription, android.app.Activity
    public void onStart() {
        super.onStart();
        setChipCornerRadius().setLayoutAnimation();
    }

    @Override // o.setEndIconContentDescription, android.app.Activity
    public void onStop() {
        super.onStop();
        setChipCornerRadius().setUiOptions();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) setChipCornerRadius().setY(i);
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        setMaxEms iconSize = setIconSize();
        if (menuItem.getItemId() != 16908332 || iconSize == null || (iconSize.setY() & 4) == 0) {
            return false;
        }
        return ViewPager$SavedState$1();
    }

    @Override // o.setEndIconContentDescription, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        setChipCornerRadius().setUnboundedRipple();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        setChipCornerRadius().setY(charSequence);
    }

    @Override // o.setEndIconContentDescription
    public void setTextScaleX() {
        setChipCornerRadius().setNavigationOnClickListener();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        setChipCornerRadius().setNavigationOnClickListener();
    }

    public boolean ViewPager$SavedState$1() {
        Intent textAlignment = setTextAlignment();
        if (textAlignment != null) {
            if (!setY(textAlignment)) {
                setX(textAlignment);
            } else {
                setContentInsetsRelative setcontentinsetsrelative = new setContentInsetsRelative(this);
                setIconTintList(setcontentinsetsrelative);
                setY(setcontentinsetsrelative);
                if (setcontentinsetsrelative.setY.isEmpty()) {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
                Intent[] intentArr = (Intent[]) setcontentinsetsrelative.setY.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!setLineHeight.setX(setcontentinsetsrelative.setX, intentArr, null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    setcontentinsetsrelative.setX.startActivity(intent);
                }
                try {
                    setColumnCount.setIconTintList.setX(this);
                } catch (IllegalStateException unused) {
                    finish();
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.setContentInsetsRelative.setY
    public Intent setTextAlignment() {
        return onOptionsItemSelected.MenuHostHelper$$ExternalSyntheticLambda0(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        setCenterIfNoTextEnabled();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public setGuidelinePercent setChipCornerRadius() {
        if (this.setOnLongClickListener == null) {
            this.setOnLongClickListener = setGuidelinePercent.setY(this, this);
        }
        return this.setOnLongClickListener;
    }

    @Override // o.setCollapseContentDescription, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        setMaxEms iconSize = setIconSize();
        if (keyCode == 82 && iconSize != null && iconSize.setX(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.setUnboundedRipple;
        return resources == null ? super.getResources() : resources;
    }

    private boolean setX(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (setX(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        setMaxEms iconSize = setIconSize();
        if (getWindow().hasFeature(0)) {
            if (iconSize == null || !iconSize.setLayoutAnimation()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        setMaxEms iconSize = setIconSize();
        if (getWindow().hasFeature(0)) {
            if (iconSize == null || !iconSize.MenuHostHelper$$ExternalSyntheticLambda1()) {
                super.closeOptionsMenu();
            }
        }
    }

    public void setIconTintList(setContentInsetsRelative setcontentinsetsrelative) {
        Intent textAlignment = setTextAlignment();
        if (textAlignment == null) {
            textAlignment = onOptionsItemSelected.MenuHostHelper$$ExternalSyntheticLambda0(this);
        }
        if (textAlignment != null) {
            ComponentName component = textAlignment.getComponent();
            if (component == null) {
                component = textAlignment.resolveActivity(setcontentinsetsrelative.setX.getPackageManager());
            }
            setcontentinsetsrelative.setIconTintList(component);
            setcontentinsetsrelative.setY.add(textAlignment);
        }
    }

    public void setX(Intent intent) {
        onOptionsItemSelected.setIconTintList.setX(this, intent);
    }

    public boolean setY(Intent intent) {
        return onOptionsItemSelected.setIconTintList.setY(this, intent);
    }
}