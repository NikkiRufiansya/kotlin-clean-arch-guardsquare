package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import java.util.Locale;

/* loaded from: classes.dex */
public final class mB {
    public static final mB setIconTintList = new mB();

    private mB() {
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda1(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", str);
    }

    public static Context setX(Context context, String str) {
        pN.setY(context, "");
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("Locale.Helper.Selected.Language", str);
        edit.apply();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = new Locale(str);
            Locale.setDefault(locale);
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) createConfigurationContext, "");
            return createConfigurationContext;
        }
        Locale locale2 = new Locale(str);
        Locale.setDefault(locale2);
        Resources resources = context.getResources();
        Configuration configuration2 = resources.getConfiguration();
        configuration2.locale = locale2;
        configuration2.setLayoutDirection(locale2);
        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
        return context;
    }
}