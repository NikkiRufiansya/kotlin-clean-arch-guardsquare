package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.AbstractC0239il;
import o.C0257jc;

/* loaded from: classes.dex */
public final class iI {
    private static final char[] setY;

    static {
        char[] cArr = new char[80];
        setY = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda1(iJ iJVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        setY(iJVar, sb, 0);
        return sb.toString();
    }

    private static void setY(iJ iJVar, StringBuilder sb, int i) {
        int i2;
        boolean booleanValue;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = iJVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                setIconTintList(sb, i, substring.substring(0, substring.length() - 4), AbstractC0239il.setY(method2, iJVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                setIconTintList(sb, i, substring.substring(0, substring.length() - 3), AbstractC0239il.setY(method, iJVar, new Object[0]));
            } else {
                StringBuilder sb2 = new StringBuilder("set");
                sb2.append(substring);
                if (hashSet.contains(sb2.toString())) {
                    if (substring.endsWith("Bytes")) {
                        StringBuilder sb3 = new StringBuilder("get");
                        sb3.append(substring.substring(0, substring.length() - 5));
                        if (treeMap.containsKey(sb3.toString())) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    StringBuilder sb4 = new StringBuilder("has");
                    sb4.append(substring);
                    Method method5 = (Method) hashMap.get(sb4.toString());
                    if (method4 != null) {
                        Object y = AbstractC0239il.setY(method4, iJVar, new Object[0]);
                        if (method5 == null) {
                            booleanValue = !setY(y);
                        } else {
                            booleanValue = ((Boolean) AbstractC0239il.setY(method5, iJVar, new Object[0])).booleanValue();
                        }
                        if (booleanValue) {
                            setIconTintList(sb, i, substring, y);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (iJVar instanceof il$MenuHostHelper$$ExternalSyntheticLambda0) {
            Iterator<Map.Entry<AbstractC0239il.setX, Object>> y2 = ((il$MenuHostHelper$$ExternalSyntheticLambda0) iJVar).extensions.setY();
            while (y2.hasNext()) {
                Map.Entry<AbstractC0239il.setX, Object> next = y2.next();
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append(next.getKey().setIconTintList);
                sb5.append("]");
                setIconTintList(sb, i, sb5.toString(), next.getValue());
            }
        }
        AbstractC0239il abstractC0239il = (AbstractC0239il) iJVar;
        if (abstractC0239il.unknownFields != null) {
            abstractC0239il.unknownFields.setY(sb, i);
        }
    }

    private static boolean setY(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        } else if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof hY) {
                return obj.equals(hY.setY);
            }
            return obj instanceof iJ ? obj == ((iJ) obj).setIconSize() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        }
    }

    public static void setIconTintList(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                setIconTintList(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                setIconTintList(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            MenuHostHelper$$ExternalSyntheticLambda1(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C0257jc.setIconTintList(new C0257jc.AnonymousClass5(hY.setX((String) obj))));
                sb.append('\"');
            } else if (obj instanceof hY) {
                sb.append(": \"");
                sb.append(C0257jc.setIconTintList(new C0257jc.AnonymousClass5((hY) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC0239il) {
                sb.append(" {");
                setY((AbstractC0239il) obj, sb, i + 2);
                sb.append("\n");
                MenuHostHelper$$ExternalSyntheticLambda1(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                setIconTintList(sb, i3, "key", entry2.getKey());
                setIconTintList(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                MenuHostHelper$$ExternalSyntheticLambda1(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = setY;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }
}