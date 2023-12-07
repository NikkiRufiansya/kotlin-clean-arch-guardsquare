package o;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fP {
    private static final Date setUnboundedRipple = new Date(0);
    public JSONArray MenuHostHelper$$ExternalSyntheticLambda0;
    public Date MenuHostHelper$$ExternalSyntheticLambda1;
    JSONObject setIconTintList;
    long setLayoutAnimation;
    public JSONObject setX;
    public JSONObject setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ fP(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, byte b) {
        this(jSONObject, date, jSONArray, jSONObject2, j);
    }

    private fP(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.setY = jSONObject;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = date;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = jSONArray;
        this.setX = jSONObject2;
        this.setLayoutAnimation = j;
        this.setIconTintList = jSONObject3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fP setY(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new fP(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public final String toString() {
        return this.setIconTintList.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fP) {
            return this.setIconTintList.toString().equals(((fP) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.setIconTintList.hashCode();
    }

    public static fP$MenuHostHelper$$ExternalSyntheticLambda0 setX() {
        return new fP$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    }
}