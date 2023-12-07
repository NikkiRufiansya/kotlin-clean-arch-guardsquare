package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ca  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067ca {
    final SharedPreferences MenuHostHelper$$ExternalSyntheticLambda1;

    public C0067ca(Context context, String str) {
        StringBuilder sb = new StringBuilder("FirebaseHeartBeat");
        sb.append(str);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context.getSharedPreferences(sb.toString(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<AbstractC0074ch> setX() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.MenuHostHelper$$ExternalSyntheticLambda1.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(setY(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new bP(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        synchronized (this) {
            for (Map.Entry<String, ?> entry : this.MenuHostHelper$$ExternalSyntheticLambda1.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str.equals(str2)) {
                            return entry.getKey();
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String setY(long j) {
        synchronized (this) {
            if (Build.VERSION.SDK_INT < 26) {
                return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
            }
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }
}