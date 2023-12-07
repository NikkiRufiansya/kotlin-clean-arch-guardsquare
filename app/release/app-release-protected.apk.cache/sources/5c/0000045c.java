package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C0166ft;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fX {
    private static int[] setNavigationOnClickListener = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern setUiOptions = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    final ScheduledExecutorService MenuHostHelper$$ExternalSyntheticLambda0;
    private int setChipCornerRadius;
    private final com.google.firebase.FirebaseApp setIconSize;
    final fZ setIconTintList;
    private fK setLayoutAnimation;
    private final Set<InterfaceC0160fn> setOnNavigationItemSelectedListener;
    private final Context setTextAlignment;
    private final String setTextScaleX;
    private final fN setUnboundedRipple;
    final InterfaceC0083cq setX;
    private final int setOnLongClickListener = 8;
    private boolean setCenterIfNoTextEnabled = false;
    private final Random setZ = new Random();
    final setSpinnersShown setY = FragmentContainerView.MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean ViewPager$SavedState$1 = false;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(fX fXVar) {
        synchronized (fXVar) {
            fXVar.ViewPager$SavedState$1 = true;
        }
    }

    public fX(com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, fN fNVar, fK fKVar, Context context, String str, Set<InterfaceC0160fn> set, fZ fZVar, ScheduledExecutorService scheduledExecutorService) {
        this.setOnNavigationItemSelectedListener = set;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = scheduledExecutorService;
        this.setChipCornerRadius = Math.max(8 - fZVar.MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList, 1);
        this.setIconSize = firebaseApp;
        this.setUnboundedRipple = fNVar;
        this.setX = interfaceC0083cq;
        this.setLayoutAnimation = fKVar;
        this.setTextAlignment = context;
        this.setTextScaleX = str;
        this.setIconTintList = fZVar;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda1() {
        try {
            Context context = this.setTextAlignment;
            byte[] x = setInputType.setX(context, context.getPackageName());
            if (x == null) {
                StringBuilder sb = new StringBuilder("Could not get fingerprint hash for package: ");
                sb.append(this.setTextAlignment.getPackageName());
                Log.e("FirebaseRemoteConfig", sb.toString());
                return null;
            }
            return setStatusBarForeground.MenuHostHelper$$ExternalSyntheticLambda0(x);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("No such package: ");
            sb2.append(this.setTextAlignment.getPackageName());
            Log.i("FirebaseRemoteConfig", sb2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(C0166ft c0166ft) {
        synchronized (this) {
            for (InterfaceC0160fn interfaceC0160fn : this.setOnNavigationItemSelectedListener) {
                interfaceC0160fn.MenuHostHelper$$ExternalSyntheticLambda0(c0166ft);
            }
        }
    }

    private void setIconTintList(Date date) {
        int i = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList + 1;
        int[] iArr = setNavigationOnClickListener;
        int length = iArr.length;
        if (i < length) {
            length = i;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[length - 1]);
        this.setIconTintList.setY(i, new Date(date.getTime() + (millis / 2) + this.setZ.nextInt((int) millis)));
    }

    final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z;
        synchronized (this) {
            if (!this.setOnNavigationItemSelectedListener.isEmpty() && !this.setCenterIfNoTextEnabled && !this.ViewPager$SavedState$1) {
                z = this.MenuHostHelper$$ExternalSyntheticLambda1 ? false : true;
            }
        }
        return z;
    }

    private URL setY() {
        try {
            String str = this.setTextScaleX;
            Object[] objArr = new Object[2];
            com.google.firebase.FirebaseApp firebaseApp = this.setIconSize;
            if (!(!firebaseApp.setUiOptions.get())) {
                throw new IllegalStateException("FirebaseApp was deleted");
            }
            Matcher matcher = setUiOptions.matcher(firebaseApp.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0);
            objArr[0] = matcher.matches() ? matcher.group(1) : null;
            objArr[1] = str;
            return new URL(String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", objArr));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration MenuHostHelper$$ExternalSyntheticLambda0(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration2) {
        if (!setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            C0168fv c0168fv = new C0168fv("Firebase Installations failed to get installation auth token for config update listener connection.", setautosizetexttypeuniformwithconfiguration.setY());
            setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
            settitletextappearance.setIconTintList((Exception) c0168fv);
            return settitletextappearance;
        } else if (!setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda0()) {
            C0168fv c0168fv2 = new C0168fv("Firebase Installations failed to get installation ID for config update listener connection.", setautosizetexttypeuniformwithconfiguration2.setY());
            setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
            settitletextappearance2.setIconTintList((Exception) c0168fv2);
            return settitletextappearance2;
        } else {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) setY().openConnection();
                String MenuHostHelper$$ExternalSyntheticLambda0 = ((AbstractC0089cw) setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda1()).MenuHostHelper$$ExternalSyntheticLambda0();
                String str = (String) setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda1();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", MenuHostHelper$$ExternalSyntheticLambda0);
                com.google.firebase.FirebaseApp firebaseApp = this.setIconSize;
                if (!firebaseApp.setUiOptions.get()) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", firebaseApp.setNavigationOnClickListener.setY);
                    httpURLConnection.setRequestProperty("X-Android-Package", this.setTextAlignment.getPackageName());
                    httpURLConnection.setRequestProperty("X-Android-Cert", MenuHostHelper$$ExternalSyntheticLambda1());
                    httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
                    httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept", "application/json");
                    HashMap hashMap = new HashMap();
                    com.google.firebase.FirebaseApp firebaseApp2 = this.setIconSize;
                    if (!(!firebaseApp2.setUiOptions.get())) {
                        throw new IllegalStateException("FirebaseApp was deleted");
                    }
                    Matcher matcher = setUiOptions.matcher(firebaseApp2.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0);
                    hashMap.put("project", matcher.matches() ? matcher.group(1) : null);
                    hashMap.put("namespace", this.setTextScaleX);
                    hashMap.put("lastKnownVersionNumber", Long.toString(this.setUnboundedRipple.setX.setX.getLong("last_template_version", 0L)));
                    com.google.firebase.FirebaseApp firebaseApp3 = this.setIconSize;
                    if (!firebaseApp3.setUiOptions.get()) {
                        hashMap.put("appId", firebaseApp3.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0);
                        hashMap.put("sdkVersion", "21.5.0");
                        hashMap.put("appInstanceId", str);
                        byte[] bytes = new JSONObject(hashMap).toString().getBytes("utf-8");
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream.write(bytes);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        setTitleTextAppearance settitletextappearance3 = new setTitleTextAppearance();
                        settitletextappearance3.setIconTintList(httpURLConnection);
                        return settitletextappearance3;
                    }
                    throw new IllegalStateException("FirebaseApp was deleted");
                }
                throw new IllegalStateException("FirebaseApp was deleted");
            } catch (IOException e) {
                C0168fv c0168fv3 = new C0168fv("Failed to open HTTP stream connection", e);
                setTitleTextAppearance settitletextappearance4 = new setTitleTextAppearance();
                settitletextappearance4.setIconTintList((Exception) c0168fv3);
                return settitletextappearance4;
            }
        }
    }

    public final void setX() {
        synchronized (this) {
            setX(Math.max(0L, this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0.getTime() - new Date(this.setY.MenuHostHelper$$ExternalSyntheticLambda0()).getTime()));
        }
    }

    public final void setX(long j) {
        synchronized (this) {
            if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                int i = this.setChipCornerRadius;
                if (i > 0) {
                    this.setChipCornerRadius = i - 1;
                    this.MenuHostHelper$$ExternalSyntheticLambda0.schedule(new Runnable() { // from class: o.fX.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            final fX fXVar = fX.this;
                            if (fXVar.MenuHostHelper$$ExternalSyntheticLambda0()) {
                                if (new Date(fXVar.setY.MenuHostHelper$$ExternalSyntheticLambda0()).before(fXVar.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0)) {
                                    fXVar.setX();
                                    return;
                                }
                                final setAutoSizeTextTypeUniformWithConfiguration<AbstractC0089cw> MenuHostHelper$$ExternalSyntheticLambda1 = fXVar.setX.MenuHostHelper$$ExternalSyntheticLambda1();
                                final setAutoSizeTextTypeUniformWithConfiguration<String> x = fXVar.setX.setX();
                                final setAutoSizeTextTypeUniformWithConfiguration y = AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, x).setY(fXVar.MenuHostHelper$$ExternalSyntheticLambda0, new setAllowedHandwritingDelegatePackage() { // from class: o.fY
                                    @Override // o.setAllowedHandwritingDelegatePackage
                                    public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
                                        return fX.this.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, x);
                                    }
                                });
                                AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(y).setIconTintList(fXVar.MenuHostHelper$$ExternalSyntheticLambda0, new setAllowedHandwritingDelegatePackage() { // from class: o.ga
                                    @Override // o.setAllowedHandwritingDelegatePackage
                                    public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
                                        return fX.this.MenuHostHelper$$ExternalSyntheticLambda0(y);
                                    }
                                });
                            }
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    setX(new C0168fv("Unable to connect to the server. Check your connection and try again.", C0166ft.setIconTintList.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        }
    }

    private fD MenuHostHelper$$ExternalSyntheticLambda1(HttpURLConnection httpURLConnection) {
        fD fDVar;
        synchronized (this) {
            fDVar = new fD(httpURLConnection, this.setUnboundedRipple, this.setLayoutAnimation, this.setOnNavigationItemSelectedListener, new InterfaceC0160fn() { // from class: o.fX.1
                @Override // o.InterfaceC0160fn
                public final void MenuHostHelper$$ExternalSyntheticLambda0(C0166ft c0166ft) {
                    fX.MenuHostHelper$$ExternalSyntheticLambda1(fX.this);
                    fX.this.setX(c0166ft);
                }
            }, this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return fDVar;
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda1(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        r12 = new org.json.JSONObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r12.has("featureDisabled") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r12.getBoolean("featureDisabled") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r9.setX.MenuHostHelper$$ExternalSyntheticLambda0(new o.fB("The server is temporarily unavailable. Try again in a few minutes.", o.C0166ft.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r9.setX() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (r12.has("latestTemplateVersionNumber") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r13 = r9.MenuHostHelper$$ExternalSyntheticLambda0.setX.setX.getLong("last_template_version", 0);
        r4 = r12.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r4 <= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
        r9.MenuHostHelper$$ExternalSyntheticLambda1(3, r4);
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x022e: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:140:0x022e */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x022f: MOVE  (r15 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:140:0x022e */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x008f A[EDGE_INSN: B:182:0x008f->B:34:0x008f ?: BREAK  , EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ o.setAutoSizeTextTypeUniformWithConfiguration MenuHostHelper$$ExternalSyntheticLambda0(o.setAutoSizeTextTypeUniformWithConfiguration r17) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fX.MenuHostHelper$$ExternalSyntheticLambda0(o.setAutoSizeTextTypeUniformWithConfiguration):o.setAutoSizeTextTypeUniformWithConfiguration");
    }
}