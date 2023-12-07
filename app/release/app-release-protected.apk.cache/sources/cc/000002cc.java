package o;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.ac  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015ac {
    private static final String[] setX = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    private static DateFormat setY = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final Date MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;
    final String setIconTintList;
    private final long setOnLongClickListener;
    private final long setUiOptions;
    private final String setUnboundedRipple;

    private C0015ac(String str, String str2, String str3, Date date, long j, long j2) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setIconTintList = str2;
        this.setUnboundedRipple = str3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = date;
        this.setUiOptions = j;
        this.setOnLongClickListener = j2;
    }

    public final ah$MenuHostHelper$$ExternalSyntheticLambda1 setX(String str) {
        ah$MenuHostHelper$$ExternalSyntheticLambda1 ah_menuhosthelper__externalsyntheticlambda1 = new ah$MenuHostHelper$$ExternalSyntheticLambda1();
        ah_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        ah_menuhosthelper__externalsyntheticlambda1.setY = this.MenuHostHelper$$ExternalSyntheticLambda0.getTime();
        ah_menuhosthelper__externalsyntheticlambda1.setX = this.MenuHostHelper$$ExternalSyntheticLambda1;
        ah_menuhosthelper__externalsyntheticlambda1.setNavigationOnClickListener = this.setIconTintList;
        ah_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = TextUtils.isEmpty(this.setUnboundedRipple) ? null : this.setUnboundedRipple;
        ah_menuhosthelper__externalsyntheticlambda1.setOnLongClickListener = this.setUiOptions;
        ah_menuhosthelper__externalsyntheticlambda1.setIconTintList = this.setOnLongClickListener;
        return ah_menuhosthelper__externalsyntheticlambda1;
    }

    public static C0015ac setY(ah$MenuHostHelper$$ExternalSyntheticLambda1 ah_menuhosthelper__externalsyntheticlambda1) {
        return new C0015ac(ah_menuhosthelper__externalsyntheticlambda1.setX, String.valueOf(ah_menuhosthelper__externalsyntheticlambda1.setNavigationOnClickListener), ah_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 != null ? ah_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 : "", new Date(ah_menuhosthelper__externalsyntheticlambda1.setY), ah_menuhosthelper__externalsyntheticlambda1.setOnLongClickListener, ah_menuhosthelper__externalsyntheticlambda1.setIconTintList);
    }

    public static C0015ac setX(Map<String, String> map) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : setX) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                return new C0015ac(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", setY.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
            } catch (NumberFormatException e) {
                throw new Z("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new Z("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
        throw new Z(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }
}