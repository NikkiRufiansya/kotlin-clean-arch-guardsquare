package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o.cB;
import o.cD;
import o.cE;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cG {
    private final InterfaceC0073cg<bZ> MenuHostHelper$$ExternalSyntheticLambda0;
    private final cH setUnboundedRipple = new cH();
    private final Context setY;
    private static byte[] setUiOptions = {94, 25, -44, 73, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setIconTintList = 17;
    private static final Pattern MenuHostHelper$$ExternalSyntheticLambda1 = Pattern.compile("[0-9]+s");
    private static final Charset setX = Charset.forName("UTF-8");

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 7
            int r9 = 106 - r9
            int r7 = r7 * 3
            int r7 = r7 + 13
            byte[] r0 = o.cG.setUiOptions
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = 0
            r9 = r8
            r8 = r7
            goto L2e
        L16:
            r3 = 0
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cG.a(short, short, int, java.lang.Object[]):void");
    }

    public cG(Context context, InterfaceC0073cg<bZ> interfaceC0073cg) {
        this.setY = context;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0073cg;
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final cD setIconTintList(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        cD iconTintList;
        String str6 = str5;
        if (!this.setUnboundedRipple.setIconTintList()) {
            throw new C0084cr("Firebase Installations Service is unavailable. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.UNAVAILABLE);
        }
        URL MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(String.format("projects/%s/installations", str3));
        int i = 0;
        for (?? r5 = 1; i <= r5; r5 = 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection y = setY(MenuHostHelper$$ExternalSyntheticLambda0, str);
            try {
                try {
                    y.setRequestMethod("POST");
                    y.setDoOutput(r5);
                    if (str6 != null) {
                        y.addRequestProperty("x-goog-fis-android-iid-migration-auth", str6);
                    }
                    try {
                        setX(y, MenuHostHelper$$ExternalSyntheticLambda1(str2, str4).toString().getBytes("UTF-8"));
                        responseCode = y.getResponseCode();
                        this.setUnboundedRipple.setIconTintList(responseCode);
                    } catch (IOException | AssertionError unused) {
                        continue;
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (!(responseCode >= 200 && responseCode < 300)) {
                    MenuHostHelper$$ExternalSyntheticLambda1(y, str4, str, str3);
                    if (responseCode == 429) {
                        throw new C0084cr("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.TOO_MANY_REQUESTS);
                    }
                    if (responseCode >= 500 && responseCode < 600) {
                        y.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                        str6 = str5;
                    } else {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        iconTintList = new cB.setX().setX(cD.setY.BAD_CONFIG).setIconTintList();
                    }
                } else {
                    InputStream inputStream = y.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, setX));
                    cF$MenuHostHelper$$ExternalSyntheticLambda1 cf_menuhosthelper__externalsyntheticlambda1 = new cF$MenuHostHelper$$ExternalSyntheticLambda1();
                    cf_menuhosthelper__externalsyntheticlambda1.setX = 0L;
                    cB.setX setx = new cB.setX();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (nextName.equals("name")) {
                            setx.setX(jsonReader.nextString());
                        } else if (nextName.equals("fid")) {
                            setx.MenuHostHelper$$ExternalSyntheticLambda1(jsonReader.nextString());
                        } else if (nextName.equals("refreshToken")) {
                            setx.MenuHostHelper$$ExternalSyntheticLambda0(jsonReader.nextString());
                        } else if (nextName.equals("authToken")) {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                if (nextName2.equals("token")) {
                                    cf_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(jsonReader.nextString());
                                } else if (nextName2.equals("expiresIn")) {
                                    cf_menuhosthelper__externalsyntheticlambda1.setY(setY(jsonReader.nextString()));
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            setx.MenuHostHelper$$ExternalSyntheticLambda1(cf_menuhosthelper__externalsyntheticlambda1.setX());
                            jsonReader.endObject();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    iconTintList = setx.setX(cD.setY.OK).setIconTintList();
                }
                return iconTintList;
            } finally {
                y.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C0084cr("Firebase Installations Service is unavailable. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.UNAVAILABLE);
    }

    private static void setX(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static JSONObject MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private static JSONObject setX() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private static URL MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new C0084cr(e.getMessage(), cr$MenuHostHelper$$ExternalSyntheticLambda0.UNAVAILABLE);
        }
    }

    public final cE MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2, String str3, String str4) {
        int responseCode;
        cE x;
        if (!this.setUnboundedRipple.setIconTintList()) {
            throw new C0084cr("Firebase Installations Service is unavailable. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.UNAVAILABLE);
        }
        URL MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection y = setY(MenuHostHelper$$ExternalSyntheticLambda0, str);
            try {
                y.setRequestMethod("POST");
                StringBuilder sb = new StringBuilder();
                sb.append("FIS_v2 ");
                sb.append(str4);
                y.addRequestProperty("Authorization", sb.toString());
                y.setDoOutput(true);
                setX(y, setX().toString().getBytes("UTF-8"));
                responseCode = y.getResponseCode();
                this.setUnboundedRipple.setIconTintList(responseCode);
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                y.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (!(responseCode >= 200 && responseCode < 300)) {
                MenuHostHelper$$ExternalSyntheticLambda1(y, (String) null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    cF$MenuHostHelper$$ExternalSyntheticLambda1 cf_menuhosthelper__externalsyntheticlambda1 = new cF$MenuHostHelper$$ExternalSyntheticLambda1();
                    cf_menuhosthelper__externalsyntheticlambda1.setX = 0L;
                    x = cf_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(cE.setY.AUTH_ERROR).setX();
                } else if (responseCode == 429) {
                    throw new C0084cr("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.TOO_MANY_REQUESTS);
                } else {
                    if (responseCode >= 500 && responseCode < 600) {
                        y.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        cF$MenuHostHelper$$ExternalSyntheticLambda1 cf_menuhosthelper__externalsyntheticlambda12 = new cF$MenuHostHelper$$ExternalSyntheticLambda1();
                        cf_menuhosthelper__externalsyntheticlambda12.setX = 0L;
                        x = cf_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1(cE.setY.BAD_CONFIG).setX();
                    }
                }
            } else {
                InputStream inputStream = y.getInputStream();
                JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, setX));
                cF$MenuHostHelper$$ExternalSyntheticLambda1 cf_menuhosthelper__externalsyntheticlambda13 = new cF$MenuHostHelper$$ExternalSyntheticLambda1();
                cf_menuhosthelper__externalsyntheticlambda13.setX = 0L;
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("token")) {
                        cf_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda1(jsonReader.nextString());
                    } else if (nextName.equals("expiresIn")) {
                        cf_menuhosthelper__externalsyntheticlambda13.setY(setY(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                inputStream.close();
                x = cf_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda1(cE.setY.OK).setX();
            }
            y.disconnect();
            TrafficStats.clearThreadStatsTag();
            return x;
        }
        throw new C0084cr("Firebase Installations Service is unavailable. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.UNAVAILABLE);
    }

    private HttpURLConnection setY(URL url, String str) {
        Object x;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.setY.getPackageName());
            bZ MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                try {
                    setAutoSizeTextTypeUniformWithConfiguration<String> MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
                    if (BottomAppBar$SavedState$1.setIconTintList()) {
                        throw new IllegalStateException("Must not be called on the main application thread");
                    }
                    if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                        if (MenuHostHelper$$ExternalSyntheticLambda12.setX()) {
                            x = AppBarLayout$BaseBehavior$SavedState$1.setX(MenuHostHelper$$ExternalSyntheticLambda12);
                        } else {
                            setEndIconDrawable setendicondrawable = new setEndIconDrawable(null);
                            MenuHostHelper$$ExternalSyntheticLambda12.setX(setAccessibilityPaneTitle.setY, (CalendarConstraints$1<? super String>) setendicondrawable);
                            MenuHostHelper$$ExternalSyntheticLambda12.setX(setAccessibilityPaneTitle.setY, (setAccessibilityDataSensitive) setendicondrawable);
                            MenuHostHelper$$ExternalSyntheticLambda12.setX(setAccessibilityPaneTitle.setY, (getTrimPathStart) setendicondrawable);
                            setendicondrawable.MenuHostHelper$$ExternalSyntheticLambda1();
                            x = AppBarLayout$BaseBehavior$SavedState$1.setX(MenuHostHelper$$ExternalSyntheticLambda12);
                        }
                        httpURLConnection.addRequestProperty("x-firebase-client", (String) x);
                    } else {
                        throw new NullPointerException("Task must not be null");
                    }
                } catch (InterruptedException e) {
                    try {
                        Object[] objArr = new Object[1];
                        a(setUiOptions[15], setUiOptions[22], (byte) (setUiOptions[15] - 1), objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a((byte) (setUiOptions[15] - 1), (byte) (-setUiOptions[15]), setUiOptions[15], objArr2);
                        ((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null)).interrupt();
                        Log.w("ContentValues", "Failed to get heartbeats header", e);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", MenuHostHelper$$ExternalSyntheticLambda0());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C0084cr("Firebase Installations Service is unavailable. Please try again later.", cr$MenuHostHelper$$ExternalSyntheticLambda0.UNAVAILABLE);
        }
    }

    private String MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            Context context = this.setY;
            byte[] x = setInputType.setX(context, context.getPackageName());
            if (x == null) {
                StringBuilder sb = new StringBuilder("Could not get fingerprint hash for package: ");
                sb.append(this.setY.getPackageName());
                Log.e("ContentValues", sb.toString());
                return null;
            }
            return setStatusBarForeground.MenuHostHelper$$ExternalSyntheticLambda0(x);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("No such package: ");
            sb2.append(this.setY.getPackageName());
            Log.e("ContentValues", sb2.toString(), e);
            return null;
        }
    }

    private static long setY(String str) {
        if (MenuHostHelper$$ExternalSyntheticLambda1.matcher(str).matches()) {
            if (str == null || str.length() == 0) {
                return 0L;
            }
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        throw new IllegalArgumentException("Invalid Expiration Timestamp.");
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String obj;
        String MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(httpURLConnection);
        if (TextUtils.isEmpty(MenuHostHelper$$ExternalSyntheticLambda0)) {
            return;
        }
        Log.w("Firebase-Installations", MenuHostHelper$$ExternalSyntheticLambda0);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            obj = "";
        } else {
            StringBuilder sb = new StringBuilder(", ");
            sb.append(str);
            obj = sb.toString();
        }
        objArr[2] = obj;
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda0(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, setX));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }
}