package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import o.C0024al;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bV implements bZ, InterfaceC0069cc {
    private static byte[] setNavigationOnClickListener = {120, 42, -65, -64, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4};
    public static final int setX = 149;
    private final Executor MenuHostHelper$$ExternalSyntheticLambda0;
    private final InterfaceC0073cg<C0067ca> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Context setIconTintList;
    private final InterfaceC0073cg<InterfaceC0158fl> setUiOptions;
    private final Set<InterfaceC0068cb> setY;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:23:0x0029). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = o.bV.setNavigationOnClickListener
            int r7 = r7 + 4
            r1 = 23
            byte[] r1 = new byte[r1]
            r2 = 97
            r3 = 0
            if (r0 != 0) goto L10
            r4 = 3
            r5 = 0
            goto L29
        L10:
            r4 = 0
        L11:
            int r7 = r7 + 1
            byte r5 = (byte) r2
            r1[r4] = r5
            r5 = 22
            if (r4 != r5) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r3)
            r8[r3] = r7
            return
        L22:
            int r4 = r4 + 1
            r5 = r0[r7]
            r6 = r5
            r5 = r4
            r4 = r6
        L29:
            int r2 = r2 + r4
            int r2 = r2 + (-8)
            r4 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bV.a(short, java.lang.Object[]):void");
    }

    public final setAutoSizeTextTypeUniformWithConfiguration<Void> MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setY.size() > 0) {
            if (!(!findFragmentById.setX(this.setIconTintList))) {
                return AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, new Callable() { // from class: o.bW
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return bV.this.setY();
                    }
                });
            }
            setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
            settitletextappearance.setIconTintList((Object) null);
            return settitletextappearance;
        }
        setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
        settitletextappearance2.setIconTintList((Object) null);
        return settitletextappearance2;
    }

    public final /* synthetic */ Void setY() {
        synchronized (this) {
            C0067ca MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
            long currentTimeMillis = System.currentTimeMillis();
            String iconTintList = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList();
            synchronized (MenuHostHelper$$ExternalSyntheticLambda0) {
                String y = MenuHostHelper$$ExternalSyntheticLambda0.setY(currentTimeMillis);
                if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getString("last-used-date", "").equals(y)) {
                    String MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(y);
                    if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                        if (!MenuHostHelper$$ExternalSyntheticLambda02.equals(iconTintList)) {
                            synchronized (MenuHostHelper$$ExternalSyntheticLambda0) {
                                synchronized (MenuHostHelper$$ExternalSyntheticLambda0) {
                                    String MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(y);
                                    if (MenuHostHelper$$ExternalSyntheticLambda03 != null) {
                                        HashSet hashSet = new HashSet(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getStringSet(MenuHostHelper$$ExternalSyntheticLambda03, new HashSet()));
                                        hashSet.remove(y);
                                        if (hashSet.isEmpty()) {
                                            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.edit().remove(MenuHostHelper$$ExternalSyntheticLambda03).commit();
                                        } else {
                                            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.edit().putStringSet(MenuHostHelper$$ExternalSyntheticLambda03, hashSet).commit();
                                        }
                                    }
                                    HashSet hashSet2 = new HashSet(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getStringSet(iconTintList, new HashSet()));
                                    hashSet2.add(y);
                                    MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.edit().putStringSet(iconTintList, hashSet2).commit();
                                }
                            }
                        }
                    }
                } else {
                    long j = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getLong("fire-count", 0L);
                    if (j + 1 == 30) {
                        synchronized (MenuHostHelper$$ExternalSyntheticLambda0) {
                            long j2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getLong("fire-count", 0L);
                            String str = "";
                            String str2 = null;
                            for (Map.Entry<String, ?> entry : MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getAll().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    for (String str3 : (Set) entry.getValue()) {
                                        if (str2 == null || str2.compareTo(str3) > 0) {
                                            str = entry.getKey();
                                            str2 = str3;
                                        }
                                    }
                                }
                            }
                            HashSet hashSet3 = new HashSet(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getStringSet(str, new HashSet()));
                            hashSet3.remove(str2);
                            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.edit().putStringSet(str, hashSet3).putLong("fire-count", j2 - 1).commit();
                            j = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getLong("fire-count", 0L);
                        }
                    }
                    HashSet hashSet4 = new HashSet(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getStringSet(iconTintList, new HashSet()));
                    hashSet4.add(y);
                    MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.edit().putStringSet(iconTintList, hashSet4).putLong("fire-count", j + 1).putString("last-used-date", y).commit();
                }
            }
        }
        return null;
    }

    @Override // o.bZ
    public final setAutoSizeTextTypeUniformWithConfiguration<String> MenuHostHelper$$ExternalSyntheticLambda1() {
        if (!(!findFragmentById.setX(this.setIconTintList))) {
            return AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, new Callable() { // from class: o.bU
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return bV.this.setIconTintList();
                }
            });
        }
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        settitletextappearance.setIconTintList("");
        return settitletextappearance;
    }

    public final /* synthetic */ String setIconTintList() {
        int i;
        String byteArrayOutputStream;
        synchronized (this) {
            C0067ca MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
            List<AbstractC0074ch> x = MenuHostHelper$$ExternalSyntheticLambda0.setX();
            synchronized (MenuHostHelper$$ExternalSyntheticLambda0) {
                SharedPreferences.Editor edit = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.edit();
                int i2 = 0;
                for (Map.Entry<String, ?> entry : MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getAll().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        String y = MenuHostHelper$$ExternalSyntheticLambda0.setY(System.currentTimeMillis());
                        String key = entry.getKey();
                        if (((Set) entry.getValue()).contains(y)) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(y);
                            i2++;
                            edit.putStringSet(key, hashSet);
                        } else {
                            edit.remove(key);
                        }
                    }
                }
                if (i2 == 0) {
                    edit.remove("fire-count");
                } else {
                    edit.putLong("fire-count", i2);
                }
                edit.commit();
            }
            JSONArray jSONArray = new JSONArray();
            for (i = 0; i < x.size(); i++) {
                AbstractC0074ch abstractC0074ch = x.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC0074ch.MenuHostHelper$$ExternalSyntheticLambda0());
                jSONObject.put("dates", new JSONArray((Collection) abstractC0074ch.setIconTintList()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
            gZIPOutputStream.close();
            base64OutputStream.close();
            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
        }
        return byteArrayOutputStream;
    }

    private bV(final Context context, final String str, Set<InterfaceC0068cb> set, InterfaceC0073cg<InterfaceC0158fl> interfaceC0073cg, Executor executor) {
        this(new InterfaceC0073cg() { // from class: o.bX
            @Override // o.InterfaceC0073cg
            public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                return bV.setIconTintList(context, str);
            }
        }, set, executor, interfaceC0073cg, context);
    }

    public static /* synthetic */ C0067ca setIconTintList(Context context, String str) {
        return new C0067ca(context, str);
    }

    private bV(InterfaceC0073cg<C0067ca> interfaceC0073cg, Set<InterfaceC0068cb> set, Executor executor, InterfaceC0073cg<InterfaceC0158fl> interfaceC0073cg2, Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0073cg;
        this.setY = set;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = executor;
        this.setUiOptions = interfaceC0073cg2;
        this.setIconTintList = context;
    }

    public static C0024al<bV> setX() {
        final aL aLVar = new aL(InterfaceC0018af.class, Executor.class);
        C0024al.setX setx = new C0024al.setX(bV.class, new Class[]{bZ.class, InterfaceC0069cc.class}, (byte) 0);
        Object[] objArr = new Object[1];
        a((short) -1, objArr);
        C0024al.setX y = setx.setY(new C0037ay(Class.forName((String) objArr[0]), 1, 0)).setY(new C0037ay(com.google.firebase.FirebaseApp.class, 1, 0)).setY(new C0037ay(InterfaceC0068cb.class, 2, 0)).setY(new C0037ay(InterfaceC0158fl.class, 1, 1)).setY(new C0037ay(aLVar, 1, 0));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.bY
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return bV.setIconTintList(aL.this, interfaceC0025am);
            }
        };
        return y.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static /* synthetic */ bV setIconTintList(aL aLVar, InterfaceC0025am interfaceC0025am) {
        Object[] objArr = new Object[1];
        a((short) -1, objArr);
        return new bV((Context) interfaceC0025am.setY(Class.forName((String) objArr[0])), ((com.google.firebase.FirebaseApp) interfaceC0025am.setY(com.google.firebase.FirebaseApp.class)).MenuHostHelper$$ExternalSyntheticLambda1(), interfaceC0025am.setIconTintList(InterfaceC0068cb.class), interfaceC0025am.MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0158fl.class), (Executor) interfaceC0025am.setY(aLVar));
    }
}