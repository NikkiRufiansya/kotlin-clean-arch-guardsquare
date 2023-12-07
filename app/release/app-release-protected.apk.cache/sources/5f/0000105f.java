package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import o.setStartIconContentDescription;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setTextOff {
    setTextOff() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(setDrawingCacheQuality setdrawingcachequality, StringBuilder sb, int i) {
        Method[] declaredMethods;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : setdrawingcachequality.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceFirst.substring(0, 1).toLowerCase());
                sb2.append(replaceFirst.substring(1, replaceFirst.length() - 4));
                String obj = sb2.toString();
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    setX(sb, i, setX(obj), setStartIconContentDescription.setIconTintList(method2, setdrawingcachequality, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(replaceFirst.substring(0, 1).toLowerCase());
                sb3.append(replaceFirst.substring(1, replaceFirst.length() - 3));
                String obj2 = sb3.toString();
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    setX(sb, i, setX(obj2), setStartIconContentDescription.setIconTintList(method3, setdrawingcachequality, new Object[0]));
                }
            }
            StringBuilder sb4 = new StringBuilder("set");
            sb4.append(replaceFirst);
            if (((Method) hashMap2.get(sb4.toString())) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    StringBuilder sb5 = new StringBuilder("get");
                    sb5.append(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (!hashMap.containsKey(sb5.toString())) {
                    }
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(replaceFirst.substring(0, 1).toLowerCase());
                sb6.append(replaceFirst.substring(1));
                String obj3 = sb6.toString();
                StringBuilder sb7 = new StringBuilder("get");
                sb7.append(replaceFirst);
                Method method4 = (Method) hashMap.get(sb7.toString());
                StringBuilder sb8 = new StringBuilder("has");
                sb8.append(replaceFirst);
                Method method5 = (Method) hashMap.get(sb8.toString());
                if (method4 != null) {
                    Object iconTintList = setStartIconContentDescription.setIconTintList(method4, setdrawingcachequality, new Object[0]);
                    if (method5 == null) {
                        if (MenuHostHelper$$ExternalSyntheticLambda1(iconTintList)) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) setStartIconContentDescription.setIconTintList(method5, setdrawingcachequality, new Object[0])).booleanValue();
                    }
                    if (z) {
                        setX(sb, i, setX(obj3), iconTintList);
                    }
                }
            }
        }
        if (setdrawingcachequality instanceof setStartIconContentDescription.setIconTintList) {
            Iterator<Map.Entry<setStartIconContentDescription.setX, Object>> y = ((setStartIconContentDescription.setIconTintList) setdrawingcachequality).extensions.setY();
            while (y.hasNext()) {
                Map.Entry<setStartIconContentDescription.setX, Object> next = y.next();
                StringBuilder sb9 = new StringBuilder("[");
                sb9.append(next.getKey().setX);
                sb9.append("]");
                setX(sb, i, sb9.toString(), next.getValue());
            }
        }
        setStartIconContentDescription setstarticoncontentdescription = (setStartIconContentDescription) setdrawingcachequality;
        if (setstarticoncontentdescription.unknownFields != null) {
            setstarticoncontentdescription.unknownFields.setX(sb, i);
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof setSpeed) {
                return obj.equals(setSpeed.setIconTintList);
            }
            return obj instanceof setDrawingCacheQuality ? obj == ((setDrawingCacheQuality) obj).setIconSize() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void setX(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                setX(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                setX(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                final setSpeed iconTintList = setSpeed.setIconTintList((String) obj);
                sb.append(setCurrentPosition.MenuHostHelper$$ExternalSyntheticLambda0(new setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.setCurrentPosition.4
                    @Override // o.setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1
                    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
                        return setSpeed.this.setY();
                    }

                    @Override // o.setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1
                    public final byte setX(int i4) {
                        return setSpeed.this.setY(i4);
                    }
                }));
                sb.append('\"');
            } else if (obj instanceof setSpeed) {
                sb.append(": \"");
                final setSpeed setspeed = (setSpeed) obj;
                sb.append(setCurrentPosition.MenuHostHelper$$ExternalSyntheticLambda0(new setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.setCurrentPosition.4
                    @Override // o.setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1
                    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
                        return setSpeed.this.setY();
                    }

                    @Override // o.setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1
                    public final byte setX(int i4) {
                        return setSpeed.this.setY(i4);
                    }
                }));
                sb.append('\"');
            } else if (obj instanceof setStartIconContentDescription) {
                sb.append(" {");
                setIconTintList((setStartIconContentDescription) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                setX(sb, i4, "key", entry2.getKey());
                setX(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String setX(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}