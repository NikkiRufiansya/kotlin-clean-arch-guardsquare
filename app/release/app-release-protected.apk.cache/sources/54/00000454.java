package o;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fP$MenuHostHelper$$ExternalSyntheticLambda0 {
    Date MenuHostHelper$$ExternalSyntheticLambda0;
    JSONObject MenuHostHelper$$ExternalSyntheticLambda1;
    JSONArray setIconTintList;
    JSONObject setX;
    long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ fP$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    private fP$MenuHostHelper$$ExternalSyntheticLambda0() {
        Date date;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new JSONObject();
        date = fP.setUnboundedRipple;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = date;
        this.setIconTintList = new JSONArray();
        this.setX = new JSONObject();
        this.setY = 0L;
    }

    public final fP$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(JSONObject jSONObject) {
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    public final fP$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(JSONArray jSONArray) {
        try {
            this.setIconTintList = new JSONArray(jSONArray.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    public final fP$MenuHostHelper$$ExternalSyntheticLambda0 setY(JSONObject jSONObject) {
        try {
            this.setX = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return this;
    }
}