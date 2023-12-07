package o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cA {
    private final com.google.firebase.FirebaseApp MenuHostHelper$$ExternalSyntheticLambda0;
    private File setY;

    /* loaded from: classes.dex */
    public enum setIconTintList {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public cA(com.google.firebase.FirebaseApp firebaseApp) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = firebaseApp;
    }

    private File MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setY == null) {
            synchronized (this) {
                if (this.setY == null) {
                    com.google.firebase.FirebaseApp firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (!firebaseApp.setUiOptions.get()) {
                        File filesDir = firebaseApp.setIconTintList.getFilesDir();
                        StringBuilder sb = new StringBuilder("PersistedInstallation.");
                        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1());
                        sb.append(".json");
                        this.setY = new File(filesDir, sb.toString());
                    } else {
                        throw new IllegalStateException("FirebaseApp was deleted");
                    }
                }
            }
        }
        return this.setY;
    }

    public final AbstractC0091cy setX() {
        JSONObject y = setY();
        String optString = y.optString("Fid", null);
        int optInt = y.optInt("Status", setIconTintList.ATTEMPT_MIGRATION.ordinal());
        String optString2 = y.optString("AuthToken", null);
        String optString3 = y.optString("RefreshToken", null);
        long optLong = y.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = y.optLong("ExpiresInSecs", 0L);
        return AbstractC0091cy.setUnboundedRipple().setY(optString).setX(setIconTintList.values()[optInt]).MenuHostHelper$$ExternalSyntheticLambda0(optString2).setX(optString3).setX(optLong).setY(optLong2).setIconTintList(y.optString("FisError", null)).MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private JSONObject setY() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(MenuHostHelper$$ExternalSyntheticLambda0());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public final AbstractC0091cy setY(AbstractC0091cy abstractC0091cy) {
        JSONObject jSONObject;
        com.google.firebase.FirebaseApp firebaseApp;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC0091cy.setY());
            jSONObject.put("Status", abstractC0091cy.setUiOptions().ordinal());
            jSONObject.put("AuthToken", abstractC0091cy.setX());
            jSONObject.put("RefreshToken", abstractC0091cy.setIconTintList());
            jSONObject.put("TokenCreationEpochInSecs", abstractC0091cy.setNavigationOnClickListener());
            jSONObject.put("ExpiresInSecs", abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda0());
            jSONObject.put("FisError", abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda1());
            firebaseApp = this.MenuHostHelper$$ExternalSyntheticLambda0;
        } catch (IOException | JSONException unused) {
        }
        if (!firebaseApp.setUiOptions.get()) {
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.setIconTintList.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(MenuHostHelper$$ExternalSyntheticLambda0())) {
                return abstractC0091cy;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }
}