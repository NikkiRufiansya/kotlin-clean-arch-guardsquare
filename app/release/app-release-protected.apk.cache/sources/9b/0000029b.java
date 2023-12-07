package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.WindowInsetsCompat$Impl28;
import o.setScrollContainer;

/* loaded from: classes.dex */
public final class WindowInsetsCompat$Impl28 {
    /* JADX WARN: Type inference failed for: r0v0, types: [o.WindowInsetsCompat$Impl28$MenuHostHelper$$ExternalSyntheticLambda0] */
    public static WindowInsetsCompat$Impl30 MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        return (WindowInsetsCompat$Impl30) new Object(null) { // from class: o.WindowInsetsCompat$Impl28$MenuHostHelper$$ExternalSyntheticLambda0
            private final WindowInsetsCompat$Impl28.setY MenuHostHelper$$ExternalSyntheticLambda1;

            {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = r1 == null ? setIconTintList() : r1;
            }

            public setScrollContainer.setX MenuHostHelper$$ExternalSyntheticLambda0(Context context2) {
                return MenuHostHelper$$ExternalSyntheticLambda1(context2, setY(context2));
            }

            private setScrollContainer.setX MenuHostHelper$$ExternalSyntheticLambda1(Context context2, setMarqueeRepeatLimit setmarqueerepeatlimit) {
                if (setmarqueerepeatlimit == null) {
                    return null;
                }
                return new WindowInsetsCompat$Impl30(context2, setmarqueerepeatlimit);
            }

            setMarqueeRepeatLimit setY(Context context2) {
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null) {
                    ProviderInfo iconTintList = setIconTintList(packageManager);
                    if (iconTintList == null) {
                        return null;
                    }
                    try {
                        return setIconTintList(iconTintList, packageManager);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                        return null;
                    }
                }
                throw new NullPointerException("Package manager required to locate emoji font provider");
            }

            private ProviderInfo setIconTintList(PackageManager packageManager) {
                for (ResolveInfo resolveInfo : this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                    ProviderInfo iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(resolveInfo);
                    if (MenuHostHelper$$ExternalSyntheticLambda0(iconTintList)) {
                        return iconTintList;
                    }
                }
                return null;
            }

            private boolean MenuHostHelper$$ExternalSyntheticLambda0(ProviderInfo providerInfo) {
                return (providerInfo == null || ((ComponentInfo) providerInfo).applicationInfo == null || (((ComponentInfo) providerInfo).applicationInfo.flags & 1) != 1) ? false : true;
            }

            private setMarqueeRepeatLimit setIconTintList(ProviderInfo providerInfo, PackageManager packageManager) {
                String str = providerInfo.authority;
                String str2 = ((PackageItemInfo) providerInfo).packageName;
                return new setMarqueeRepeatLimit(str, str2, "emojicompat-emoji-font", setX(this.MenuHostHelper$$ExternalSyntheticLambda1.setY(packageManager, str2)));
            }

            private List<List<byte[]>> setX(Signature[] signatureArr) {
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                return Collections.singletonList(arrayList);
            }

            private static WindowInsetsCompat$Impl28.setY setIconTintList() {
                if (Build.VERSION.SDK_INT >= 28) {
                    return new WindowInsetsCompat$Impl28.setIconTintList() { // from class: o.WindowInsetsCompat$Impl28$MenuHostHelper$$ExternalSyntheticLambda1
                        @Override // o.WindowInsetsCompat$Impl28.setY
                        public Signature[] setY(PackageManager packageManager, String str) {
                            return packageManager.getPackageInfo(str, 64).signatures;
                        }
                    };
                }
                return new WindowInsetsCompat$Impl28.setIconTintList();
            }
        }.MenuHostHelper$$ExternalSyntheticLambda0(context);
    }

    /* loaded from: classes.dex */
    public static class setY {
        public Signature[] setY(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> setIconTintList(PackageManager packageManager, Intent intent, int i) {
            return Collections.emptyList();
        }

        public ProviderInfo setIconTintList(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setY {
        @Override // o.WindowInsetsCompat$Impl28.setY
        public List<ResolveInfo> setIconTintList(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }

        @Override // o.WindowInsetsCompat$Impl28.setY
        public ProviderInfo setIconTintList(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
    }
}