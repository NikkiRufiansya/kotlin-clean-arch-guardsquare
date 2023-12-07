package o;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class setUnboundedRippleResource {
    public HashMap<Object, HashMap<String, float[]>> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap<>();

    public final float MenuHostHelper$$ExternalSyntheticLambda1(Object obj, String str) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(obj) && (hashMap = this.MenuHostHelper$$ExternalSyntheticLambda0.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}