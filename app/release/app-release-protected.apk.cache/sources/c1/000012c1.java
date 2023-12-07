package o;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.wj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570wj {
    private static final setIconTintList setIconTintList = new setIconTintList();
    private static final String[] setX = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final DateFormat[] setY = new DateFormat[15];

    /* renamed from: o.wj$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends ThreadLocal<DateFormat> {
        setIconTintList() {
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(vL.setX);
            return simpleDateFormat;
        }
    }

    public static final Date MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        pN.setY(str, "");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = setIconTintList.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = setX;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = setY;
                SimpleDateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(setX[i], Locale.US);
                    simpleDateFormat2.setTimeZone(vL.setX);
                    simpleDateFormat = simpleDateFormat2;
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            nX nXVar = nX.setX;
            return null;
        }
    }

    public static final String setIconTintList(Date date) {
        pN.setY(date, "");
        String format = setIconTintList.get().format(date);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) format, "");
        return format;
    }
}