package o;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes.dex */
public enum gR implements gT {
    IDENTITY { // from class: o.gR.5
        @Override // o.gT
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Field field) {
            return field.getName();
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CAMEL_CASE { // from class: o.gR.2
        @Override // o.gT
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Field field) {
            return setX(field.getName());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: o.gR.3
        @Override // o.gT
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Field field) {
            return setX(setY(field.getName(), " "));
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_UNDERSCORES { // from class: o.gR.1
        @Override // o.gT
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Field field) {
            return setY(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_DASHES { // from class: o.gR.4
        @Override // o.gT
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Field field) {
            return setY(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_DOTS { // from class: o.gR.6
        @Override // o.gT
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Field field) {
            return setY(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* synthetic */ gR(byte b) {
        this();
    }

    static String setY(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String setX(String str) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < str.length()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(upperCase);
            sb2.append(str.substring(i2));
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(upperCase);
        }
        sb.append(valueOf);
        return sb.toString();
    }
}