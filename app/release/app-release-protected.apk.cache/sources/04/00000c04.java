package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class setGuidelineBegin extends ContextWrapper {
    private static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    private final Resources setIconTintList;
    private final Resources.Theme setY;

    public static Context MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        return context;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.setY;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        Resources.Theme theme = this.setY;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.setIconTintList;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.setIconTintList.getAssets();
    }
}