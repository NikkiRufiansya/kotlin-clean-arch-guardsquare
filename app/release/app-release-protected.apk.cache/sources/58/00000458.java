package o;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class fT {
    static final Pattern setIconTintList;
    static final Pattern setX;
    public final Set<setSearchResultHighlights<String, fP>> MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet();
    private final fK MenuHostHelper$$ExternalSyntheticLambda1;
    private final Executor setNavigationOnClickListener;
    private final fK setY;

    static {
        Charset.forName("UTF-8");
        setIconTintList = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        setX = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public fT(Executor executor, fK fKVar, fK fKVar2) {
        this.setNavigationOnClickListener = executor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = fKVar;
        this.setY = fKVar2;
    }

    private InterfaceC0171fy MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        String MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, str);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(str, this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
            return new C0180gf(MenuHostHelper$$ExternalSyntheticLambda0, 2);
        }
        String MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(this.setY, str);
        if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
            return new C0180gf(MenuHostHelper$$ExternalSyntheticLambda02, 1);
        }
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "FirebaseRemoteConfigValue", str));
        return new C0180gf("", 0);
    }

    public final Map<String, InterfaceC0171fy> MenuHostHelper$$ExternalSyntheticLambda0() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(setY(this.MenuHostHelper$$ExternalSyntheticLambda1));
        hashSet.addAll(setY(this.setY));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, MenuHostHelper$$ExternalSyntheticLambda0(str));
        }
        return hashMap;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(final String str, final fP fPVar) {
        if (fPVar == null) {
            return;
        }
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            for (final setSearchResultHighlights<String, fP> setsearchresulthighlights : this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setNavigationOnClickListener.execute(new Runnable() { // from class: o.fV
                    @Override // java.lang.Runnable
                    public final void run() {
                        fT.MenuHostHelper$$ExternalSyntheticLambda0(setSearchResultHighlights.this, str, fPVar);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setSearchResultHighlights setsearchresulthighlights, String str, fP fPVar) {
        setsearchresulthighlights.setIconTintList(str, fPVar);
    }

    private static Set<String> setY(fK fKVar) {
        HashSet hashSet = new HashSet();
        fP MenuHostHelper$$ExternalSyntheticLambda0 = fKVar.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return hashSet;
        }
        Iterator<String> keys = MenuHostHelper$$ExternalSyntheticLambda0.setY.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda0(fK fKVar, String str) {
        fP MenuHostHelper$$ExternalSyntheticLambda0 = fKVar.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return null;
        }
        try {
            return MenuHostHelper$$ExternalSyntheticLambda0.setY.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}