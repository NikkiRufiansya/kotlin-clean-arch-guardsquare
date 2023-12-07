package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class setScrollContainer {
    private static volatile setScrollContainer setNavigationOnClickListener;
    final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final setIconTintList ViewPager$SavedState$1;
    private final Set<setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1> setChipCornerRadius;
    final int[] setIconTintList;
    private final setY setLayoutAnimation;
    private final boolean setOnLongClickListener;
    private final int setOnNavigationItemSelectedListener;
    private final int setUiOptions;
    final setOnLongClickListener setX;
    final boolean setY;
    private static final Object setUnboundedRipple = new Object();
    private static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    private final ReadWriteLock setTextAlignment = new ReentrantReadWriteLock();
    private volatile int setCenterIfNoTextEnabled = 3;
    private final Handler setIconSize = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static abstract class setNavigationOnClickListener {
        public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda0(LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$1);
    }

    /* loaded from: classes.dex */
    public interface setOnLongClickListener {
        void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationOnClickListener setnavigationonclicklistener);
    }

    /* loaded from: classes.dex */
    public interface setY {
        boolean setIconTintList(CharSequence charSequence, int i, int i2, int i3);
    }

    private setScrollContainer(setX setx) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setx.setLayoutAnimation;
        this.setY = setx.setNavigationOnClickListener;
        this.setIconTintList = setx.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setOnLongClickListener = setx.setY;
        this.setUiOptions = setx.setX;
        this.setX = setx.setUiOptions;
        this.setOnNavigationItemSelectedListener = setx.setOnLongClickListener;
        this.setLayoutAnimation = setx.setIconTintList;
        setHasNonEmbeddedTabs sethasnonembeddedtabs = new setHasNonEmbeddedTabs();
        this.setChipCornerRadius = sethasnonembeddedtabs;
        if (setx.MenuHostHelper$$ExternalSyntheticLambda1 != null && !setx.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            sethasnonembeddedtabs.addAll(setx.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.ViewPager$SavedState$1 = new setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda0(this);
        setLayoutAnimation();
    }

    public static setScrollContainer MenuHostHelper$$ExternalSyntheticLambda0(setX setx) {
        setScrollContainer setscrollcontainer;
        setScrollContainer setscrollcontainer2 = setNavigationOnClickListener;
        if (setscrollcontainer2 == null) {
            synchronized (setUnboundedRipple) {
                setscrollcontainer = setNavigationOnClickListener;
                if (setscrollcontainer == null) {
                    setscrollcontainer = new setScrollContainer(setx);
                    setNavigationOnClickListener = setscrollcontainer;
                }
            }
            return setscrollcontainer;
        }
        return setscrollcontainer2;
    }

    public static boolean setX() {
        return setNavigationOnClickListener != null;
    }

    public static setScrollContainer setIconTintList() {
        setScrollContainer setscrollcontainer;
        synchronized (setUnboundedRipple) {
            setscrollcontainer = setNavigationOnClickListener;
            if (!(setscrollcontainer != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return setscrollcontainer;
    }

    public void setOnLongClickListener() {
        if (this.setOnNavigationItemSelectedListener == 1) {
            if (setNavigationOnClickListener()) {
                return;
            }
            this.setTextAlignment.writeLock().lock();
            try {
                if (this.setCenterIfNoTextEnabled == 0) {
                    return;
                }
                this.setCenterIfNoTextEnabled = 0;
                this.setTextAlignment.writeLock().unlock();
                this.ViewPager$SavedState$1.setX();
                return;
            } finally {
                this.setTextAlignment.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    private void setLayoutAnimation() {
        this.setTextAlignment.writeLock().lock();
        try {
            if (this.setOnNavigationItemSelectedListener == 0) {
                this.setCenterIfNoTextEnabled = 0;
            }
            this.setTextAlignment.writeLock().unlock();
            if (MenuHostHelper$$ExternalSyntheticLambda1() == 0) {
                this.ViewPager$SavedState$1.setX();
            }
        } catch (Throwable th) {
            this.setTextAlignment.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUnboundedRipple() {
        ArrayList arrayList = new ArrayList();
        this.setTextAlignment.writeLock().lock();
        try {
            this.setCenterIfNoTextEnabled = 1;
            arrayList.addAll(this.setChipCornerRadius);
            this.setChipCornerRadius.clear();
            this.setTextAlignment.writeLock().unlock();
            this.setIconSize.post(new setUiOptions(arrayList, this.setCenterIfNoTextEnabled));
        } catch (Throwable th) {
            this.setTextAlignment.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.setTextAlignment.writeLock().lock();
        try {
            this.setCenterIfNoTextEnabled = 2;
            arrayList.addAll(this.setChipCornerRadius);
            this.setChipCornerRadius.clear();
            this.setTextAlignment.writeLock().unlock();
            this.setIconSize.post(new setUiOptions(arrayList, this.setCenterIfNoTextEnabled, th));
        } catch (Throwable th2) {
            this.setTextAlignment.writeLock().unlock();
            throw th2;
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 setscrollcontainer_menuhosthelper__externalsyntheticlambda1) {
        if (setscrollcontainer_menuhosthelper__externalsyntheticlambda1 != null) {
            this.setTextAlignment.writeLock().lock();
            try {
                if (this.setCenterIfNoTextEnabled != 1 && this.setCenterIfNoTextEnabled != 2) {
                    this.setChipCornerRadius.add(setscrollcontainer_menuhosthelper__externalsyntheticlambda1);
                    return;
                }
                this.setIconSize.post(new setUiOptions(setscrollcontainer_menuhosthelper__externalsyntheticlambda1, this.setCenterIfNoTextEnabled));
                return;
            } finally {
                this.setTextAlignment.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    public void setIconTintList(setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 setscrollcontainer_menuhosthelper__externalsyntheticlambda1) {
        if (setscrollcontainer_menuhosthelper__externalsyntheticlambda1 != null) {
            this.setTextAlignment.writeLock().lock();
            try {
                this.setChipCornerRadius.remove(setscrollcontainer_menuhosthelper__externalsyntheticlambda1);
                return;
            } finally {
                this.setTextAlignment.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    public int MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setTextAlignment.readLock().lock();
        try {
            return this.setCenterIfNoTextEnabled;
        } finally {
            this.setTextAlignment.readLock().unlock();
        }
    }

    private boolean setNavigationOnClickListener() {
        return MenuHostHelper$$ExternalSyntheticLambda1() == 1;
    }

    public boolean setY() {
        return this.setOnLongClickListener;
    }

    public int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions;
    }

    public CharSequence setIconTintList(CharSequence charSequence) {
        return setX(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence setX(CharSequence charSequence, int i, int i2) {
        return setX(charSequence, i, i2, Integer.MAX_VALUE);
    }

    public CharSequence setX(CharSequence charSequence, int i, int i2, int i3) {
        return MenuHostHelper$$ExternalSyntheticLambda0(charSequence, i, i2, i3, 0);
    }

    public CharSequence MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        if (setNavigationOnClickListener()) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i3 >= 0) {
                        if (i <= i2) {
                            if (charSequence == null) {
                                return null;
                            }
                            if (i <= charSequence.length()) {
                                if (i2 <= charSequence.length()) {
                                    if (charSequence.length() == 0 || i == i2) {
                                        return charSequence;
                                    }
                                    if (i4 != 1) {
                                        z = i4 != 2 ? this.MenuHostHelper$$ExternalSyntheticLambda0 : false;
                                    } else {
                                        z = true;
                                    }
                                    return this.ViewPager$SavedState$1.setX(charSequence, i, i2, i3, z);
                                }
                                throw new IllegalArgumentException("end should be < than charSequence length");
                            }
                            throw new IllegalArgumentException("start should be < than charSequence length");
                        }
                        throw new IllegalArgumentException("start should be <= than end");
                    }
                    throw new IllegalArgumentException("maxEmojiCount cannot be negative");
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public void setIconTintList(EditorInfo editorInfo) {
        if (!setNavigationOnClickListener() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.ViewPager$SavedState$1.setX(editorInfo);
    }

    /* loaded from: classes.dex */
    static class setLayoutAnimation {
        /* JADX INFO: Access modifiers changed from: package-private */
        public setPopupBackgroundResource setX(setFailureListener setfailurelistener) {
            return new setFindListener(setfailurelistener);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setX {
        int[] MenuHostHelper$$ExternalSyntheticLambda0;
        Set<setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda1;
        boolean setLayoutAnimation;
        boolean setNavigationOnClickListener;
        final setOnLongClickListener setUiOptions;
        boolean setY;
        int setX = -16711936;
        int setOnLongClickListener = 0;
        setY setIconTintList = new setMaxWidth();

        public setX(setOnLongClickListener setonlongclicklistener) {
            if (setonlongclicklistener != null) {
                this.setUiOptions = setonlongclicklistener;
                return;
            }
            throw new NullPointerException("metadataLoader cannot be null.");
        }

        public setX setY(int i) {
            this.setOnLongClickListener = i;
            return this;
        }

        public final setOnLongClickListener setX() {
            return this.setUiOptions;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (java.lang.Character.isHighSurrogate(r5) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
        if (r11 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean setIconTintList(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setScrollContainer.setIconTintList(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setUiOptions implements Runnable {
        private final Throwable MenuHostHelper$$ExternalSyntheticLambda0;
        private final int setIconTintList;
        private final List<setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1> setX;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        setUiOptions(o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 r3, int r4) {
            /*
                r2 = this;
                r0 = 1
                o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1[] r0 = new o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1[r0]
                if (r3 == 0) goto L13
                o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 r3 = (o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1) r3
                r1 = 0
                r0[r1] = r3
                java.util.List r3 = java.util.Arrays.asList(r0)
                r0 = 0
                r2.<init>(r3, r4, r0)
                return
            L13:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "initCallback cannot be null"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setScrollContainer.setUiOptions.<init>(o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1, int):void");
        }

        setUiOptions(Collection<setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1> collection, int i) {
            this(collection, i, null);
        }

        setUiOptions(Collection<setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1> collection, int i, Throwable th) {
            if (collection != null) {
                this.setX = new ArrayList(collection);
                this.setIconTintList = i;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = th;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.setX.size();
            int i = 0;
            if (this.setIconTintList != 1) {
                while (i < size) {
                    this.setX.get(i).setY(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.setX.get(i).MenuHostHelper$$ExternalSyntheticLambda0();
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        final setScrollContainer setX;

        CharSequence setX(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        void setX(EditorInfo editorInfo) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(setScrollContainer setscrollcontainer) {
            this.setX = setscrollcontainer;
        }

        void setX() {
            this.setX.setUnboundedRipple();
        }
    }

    public static boolean setY(Editable editable, int i, KeyEvent keyEvent) {
        boolean y;
        if (i == 67) {
            y = setFocusable.setY(editable, keyEvent, false);
        } else {
            y = i != 112 ? false : setFocusable.setY(editable, keyEvent, true);
        }
        if (y) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }
}