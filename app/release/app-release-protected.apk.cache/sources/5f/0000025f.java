package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U {
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setIconTintList;
    private final String setLayoutAnimation;
    private final String setOnLongClickListener;
    public final String setX;
    public final String setY;

    private U(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (true ^ (str == null || str.trim().isEmpty())) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
            this.setY = str2;
            this.setIconTintList = str3;
            this.setLayoutAnimation = str4;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str5;
            this.setOnLongClickListener = str6;
            this.setX = str7;
            return;
        }
        throw new IllegalStateException("ApplicationId must be set.");
    }

    public static U setY(Context context) {
        onTransact ontransact = new onTransact(context);
        String y = ontransact.setY("google_app_id");
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        return new U(y, ontransact.setY("google_api_key"), ontransact.setY("firebase_database_url"), ontransact.setY("ga_trackingId"), ontransact.setY("gcm_defaultSenderId"), ontransact.setY("google_storage_bucket"), ontransact.setY("project_id"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            U u = (U) obj;
            String str = this.MenuHostHelper$$ExternalSyntheticLambda0;
            String str2 = u.MenuHostHelper$$ExternalSyntheticLambda0;
            if (str == str2 || (str != null && str.equals(str2))) {
                String str3 = this.setY;
                String str4 = u.setY;
                if (str3 == str4 || (str3 != null && str3.equals(str4))) {
                    String str5 = this.setIconTintList;
                    String str6 = u.setIconTintList;
                    if (str5 == str6 || (str5 != null && str5.equals(str6))) {
                        String str7 = this.setLayoutAnimation;
                        String str8 = u.setLayoutAnimation;
                        if (str7 == str8 || (str7 != null && str7.equals(str8))) {
                            String str9 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                            String str10 = u.MenuHostHelper$$ExternalSyntheticLambda1;
                            if (str9 == str10 || (str9 != null && str9.equals(str10))) {
                                String str11 = this.setOnLongClickListener;
                                String str12 = u.setOnLongClickListener;
                                if (str11 == str12 || (str11 != null && str11.equals(str12))) {
                                    String str13 = this.setX;
                                    String str14 = u.setX;
                                    return str13 == str14 || (str13 != null && str13.equals(str14));
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.MenuHostHelper$$ExternalSyntheticLambda0, this.setY, this.setIconTintList, this.setLayoutAnimation, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setOnLongClickListener, this.setX});
    }

    public final String toString() {
        return new setOnMenuItemClickListener$MenuHostHelper$$ExternalSyntheticLambda1(this).setX("applicationId", this.MenuHostHelper$$ExternalSyntheticLambda0).setX("apiKey", this.setY).setX("databaseUrl", this.setIconTintList).setX("gcmSenderId", this.MenuHostHelper$$ExternalSyntheticLambda1).setX("storageBucket", this.setOnLongClickListener).setX("projectId", this.setX).toString();
    }
}