package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import o.setBackgroundTintMode;
import o.setBaselineAlignBottom;
import o.setIconified;
import o.setMaxEms;
import o.setTranscriptMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FragmentStateAdapter$2 extends setMaxEms {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final setTransformationMethod MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setIconTintList;
    private final setTranscriptMode.setX setLayoutAnimation;
    private boolean setOnLongClickListener;
    final Window.Callback setX;
    final setIconified.setIconTintList setY;
    private ArrayList<setMaxEms.setX> setUnboundedRipple = new ArrayList<>();
    private final Runnable setNavigationOnClickListener = new Runnable() { // from class: o.FragmentStateAdapter$2.2
        @Override // java.lang.Runnable
        public final void run() {
            FragmentStateAdapter$2 fragmentStateAdapter$2 = FragmentStateAdapter$2.this;
            Menu uiOptions = fragmentStateAdapter$2.setUiOptions();
            setNavigationIconTint setnavigationicontint = uiOptions instanceof setNavigationIconTint ? (setNavigationIconTint) uiOptions : null;
            if (setnavigationicontint != null) {
                setnavigationicontint.setIconSize();
            }
            try {
                uiOptions.clear();
                if (!fragmentStateAdapter$2.setX.onCreatePanelMenu(0, uiOptions) || !fragmentStateAdapter$2.setX.onPreparePanel(0, null, uiOptions)) {
                    uiOptions.clear();
                }
            } finally {
                if (setnavigationicontint != null) {
                    setnavigationicontint.setUiOptions();
                }
            }
        }
    };

    @Override // o.setMaxEms
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
    }

    @Override // o.setMaxEms
    public final void setY(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentStateAdapter$2(setTranscriptMode settranscriptmode, CharSequence charSequence, Window.Callback callback) {
        setTranscriptMode.setX setx = new setTranscriptMode.setX() { // from class: o.FragmentStateAdapter$2.5
            @Override // o.setTranscriptMode.setX
            public final boolean setX(MenuItem menuItem) {
                return FragmentStateAdapter$2.this.setX.onMenuItemSelected(0, menuItem);
            }
        };
        this.setLayoutAnimation = setx;
        AppBarLayout$ScrollingViewBehavior appBarLayout$ScrollingViewBehavior = new AppBarLayout$ScrollingViewBehavior(settranscriptmode, false);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = appBarLayout$ScrollingViewBehavior;
        this.setX = callback;
        appBarLayout$ScrollingViewBehavior.MenuHostHelper$$ExternalSyntheticLambda0(callback);
        settranscriptmode.setOnMenuItemClickListener(setx);
        appBarLayout$ScrollingViewBehavior.MenuHostHelper$$ExternalSyntheticLambda1(charSequence);
        this.setY = new setX();
    }

    @Override // o.setMaxEms
    public final void setX(float f) {
        setBaselineAlignBottom.setUnboundedRipple.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener(), f);
    }

    @Override // o.setMaxEms
    public final Context setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.setMaxEms
    public final void setY(Configuration configuration) {
        super.setY(configuration);
    }

    @Override // o.setMaxEms
    public final void setIconTintList(CharSequence charSequence) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(charSequence);
    }

    @Override // o.setMaxEms
    public final int setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setX();
    }

    @Override // o.setMaxEms
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(8);
    }

    @Override // o.setMaxEms
    public final boolean setLayoutAnimation() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setOnNavigationItemSelectedListener();
    }

    @Override // o.setMaxEms
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation();
    }

    @Override // o.setMaxEms
    public final boolean setUnboundedRipple() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener().removeCallbacks(this.setNavigationOnClickListener);
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener(), this.setNavigationOnClickListener);
        return true;
    }

    @Override // o.setMaxEms
    public final boolean setX() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions()) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            return true;
        }
        return false;
    }

    @Override // o.setMaxEms
    public final boolean setX(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setOnNavigationItemSelectedListener();
        }
        return true;
    }

    @Override // o.setMaxEms
    public final boolean setY(int i, KeyEvent keyEvent) {
        Menu uiOptions = setUiOptions();
        if (uiOptions != null) {
            uiOptions.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return uiOptions.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMaxEms
    public final void setNavigationOnClickListener() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener().removeCallbacks(this.setNavigationOnClickListener);
    }

    @Override // o.setMaxEms
    public final void setX(boolean z) {
        if (z == this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        int size = this.setUnboundedRipple.size();
        for (int i = 0; i < size; i++) {
            this.setUnboundedRipple.get(i);
        }
    }

    /* loaded from: classes.dex */
    class setX implements setIconified.setIconTintList {
        setX() {
        }

        @Override // o.setIconified.setIconTintList
        public final boolean setIconTintList(int i) {
            if (i != 0 || FragmentStateAdapter$2.this.setIconTintList) {
                return false;
            }
            FragmentStateAdapter$2.this.MenuHostHelper$$ExternalSyntheticLambda1.setTextAlignment();
            FragmentStateAdapter$2.this.setIconTintList = true;
            return false;
        }

        @Override // o.setIconified.setIconTintList
        public final View setY(int i) {
            if (i == 0) {
                return new View(FragmentStateAdapter$2.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
            }
            return null;
        }
    }

    final Menu setUiOptions() {
        if (!this.setOnLongClickListener) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setX(new setIconTintList(), new setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.FragmentStateAdapter$2$MenuHostHelper$$ExternalSyntheticLambda0
                @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
                public final boolean setY(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
                    return false;
                }

                @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
                public final void setY(setNavigationIconTint setnavigationicontint) {
                    if (FragmentStateAdapter$2.this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius()) {
                        FragmentStateAdapter$2.this.setX.onPanelClosed(108, setnavigationicontint);
                    } else if (FragmentStateAdapter$2.this.setX.onPreparePanel(0, null, setnavigationicontint)) {
                        FragmentStateAdapter$2.this.setX.onMenuOpened(108, setnavigationicontint);
                    }
                }
            });
            this.setOnLongClickListener = true;
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class setIconTintList implements setBackgroundTintMode.setY {
        private boolean setY;

        setIconTintList() {
        }

        @Override // o.setBackgroundTintMode.setY
        public final boolean setY(setNavigationIconTint setnavigationicontint) {
            FragmentStateAdapter$2.this.setX.onMenuOpened(108, setnavigationicontint);
            return true;
        }

        @Override // o.setBackgroundTintMode.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, boolean z) {
            if (this.setY) {
                return;
            }
            this.setY = true;
            FragmentStateAdapter$2.this.MenuHostHelper$$ExternalSyntheticLambda1.setY();
            FragmentStateAdapter$2.this.setX.onPanelClosed(108, setnavigationicontint);
            this.setY = false;
        }
    }
}