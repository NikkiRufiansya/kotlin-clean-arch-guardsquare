package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.fN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fS {
    private static final Pattern MenuHostHelper$$ExternalSyntheticLambda0 = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final long MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setIconTintList;
    private final long setNavigationOnClickListener;
    private final String setOnLongClickListener;
    private final String setUiOptions;
    private final String setX;
    private final Context setY;

    public fS(Context context, String str, String str2, String str3, long j, long j2) {
        this.setY = context;
        this.setX = str;
        this.setIconTintList = str2;
        Matcher matcher = MenuHostHelper$$ExternalSyntheticLambda0.matcher(str);
        this.setUiOptions = matcher.matches() ? matcher.group(1) : null;
        this.setOnLongClickListener = str3;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        this.setNavigationOnClickListener = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final HttpURLConnection setIconTintList() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.setUiOptions, this.setOnLongClickListener)).openConnection();
        } catch (IOException e) {
            throw new C0166ft(e.getMessage());
        }
    }

    private String setY() {
        try {
            Context context = this.setY;
            byte[] x = setInputType.setX(context, context.getPackageName());
            if (x == null) {
                StringBuilder sb = new StringBuilder("Could not get fingerprint hash for package: ");
                sb.append(this.setY.getPackageName());
                Log.e("FirebaseRemoteConfig", sb.toString());
                return null;
            }
            return setStatusBarForeground.MenuHostHelper$$ExternalSyntheticLambda0(x);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("No such package: ");
            sb2.append(this.setY.getPackageName());
            Log.e("FirebaseRemoteConfig", sb2.toString(), e);
            return null;
        }
    }

    private JSONObject MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2, Map<String, String> map, Long l) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new C0168fv("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.setX);
        Locale locale = this.setY.getResources().getConfiguration().locale;
        hashMap.put("countryCode", locale.getCountry());
        hashMap.put("languageCode", locale.toLanguageTag());
        hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.setY.getPackageManager().getPackageInfo(this.setY.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(read.setX(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", this.setY.getPackageName());
        hashMap.put("sdkVersion", "21.5.0");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (l != null) {
            long longValue = l.longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
        }
        return new JSONObject(hashMap);
    }

    private static boolean setX(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private static fP MenuHostHelper$$ExternalSyntheticLambda0(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            fP$MenuHostHelper$$ExternalSyntheticLambda0 x = fP.setX();
            x.MenuHostHelper$$ExternalSyntheticLambda0 = date;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                x = x.MenuHostHelper$$ExternalSyntheticLambda1(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                x = x.setIconTintList(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                x = x.setY(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                x.setY = Long.parseLong(string);
            }
            return new fP(x.MenuHostHelper$$ExternalSyntheticLambda1, x.MenuHostHelper$$ExternalSyntheticLambda0, x.setIconTintList, x.setX, x.setY, (byte) 0);
        } catch (JSONException e) {
            throw new C0168fv("Fetch failed: fetch response could not be parsed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fN.setX setY(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.MenuHostHelper$$ExternalSyntheticLambda1));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.setNavigationOnClickListener));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.setIconTintList);
        httpURLConnection.setRequestProperty("X-Android-Package", this.setY.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", setY());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            try {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
            }
        }
        try {
            byte[] bytes = MenuHostHelper$$ExternalSyntheticLambda1(str, str2, map, l).toString().getBytes("utf-8");
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new fB(responseCode, httpURLConnection.getResponseMessage());
            }
            String headerField = httpURLConnection.getHeaderField("ETag");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            JSONObject jSONObject = new JSONObject(sb.toString());
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            fP MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(jSONObject, date);
            if (!setX(jSONObject)) {
                return new fN.setX(date, 1, MenuHostHelper$$ExternalSyntheticLambda02, null);
            }
            return new fN.setX(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1, 0, MenuHostHelper$$ExternalSyntheticLambda02, headerField);
        } catch (IOException | JSONException e) {
            throw new C0168fv("The client had an error while calling the backend!", e);
        }
    }
}