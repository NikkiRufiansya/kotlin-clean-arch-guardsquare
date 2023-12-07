package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class setTitleMarginEnd extends ContextWrapper {
    private static Configuration setY;
    private LayoutInflater MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private Configuration setIconTintList;
    private Resources.Theme setUnboundedRipple;
    private Resources setX;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    public setTitleMarginEnd() {
        super(null);
    }

    public setTitleMarginEnd(Context context, int i) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    public setTitleMarginEnd(Context context, Resources.Theme theme) {
        super(context);
        this.setUnboundedRipple = theme;
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(Configuration configuration) {
        if (this.setX != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.setIconTintList != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.setIconTintList = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return setIconTintList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.res.Resources setIconTintList() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.setX
            if (r0 != 0) goto L3d
            android.content.res.Configuration r0 = r3.setIconTintList
            if (r0 == 0) goto L37
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2a
            android.content.res.Configuration r0 = r3.setIconTintList
            if (r0 != 0) goto L14
            r0 = 1
            goto L28
        L14:
            android.content.res.Configuration r1 = o.setTitleMarginEnd.setY
            if (r1 != 0) goto L22
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            o.setTitleMarginEnd.setY = r1
        L22:
            android.content.res.Configuration r1 = o.setTitleMarginEnd.setY
            boolean r0 = r0.equals(r1)
        L28:
            if (r0 != 0) goto L37
        L2a:
            android.content.res.Configuration r0 = r3.setIconTintList
            android.content.Context r0 = o.setTitleMarginEnd$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.setX = r0
            goto L3d
        L37:
            android.content.res.Resources r0 = super.getResources()
            r3.setX = r0
        L3d:
            android.content.res.Resources r0 = r3.setX
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleMarginEnd.setIconTintList():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != i) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            setY();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.setUnboundedRipple;
        if (theme != null) {
            return theme;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = R.style._res_0x7f1501f6;
        }
        setY();
        return this.setUnboundedRipple;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return getBaseContext().getSystemService(str);
    }

    private static void setY(Resources.Theme theme, int i) {
        theme.applyStyle(i, true);
    }

    private void setY() {
        if (this.setUnboundedRipple == null) {
            this.setUnboundedRipple = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.setUnboundedRipple.setTo(theme);
            }
        }
        setY(this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}