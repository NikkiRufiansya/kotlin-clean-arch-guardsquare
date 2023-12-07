package o;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HideBottomViewOnScrollBehavior {
    private static AtomicReference<setCardForegroundColor> MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar setX(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar3.clear();
        calendar3.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        return calendar3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar setIconTintList() {
        setCardForegroundColor setcardforegroundcolor = MenuHostHelper$$ExternalSyntheticLambda0.get();
        if (setcardforegroundcolor == null) {
            setcardforegroundcolor = setCardForegroundColor.setX;
        }
        TimeZone timeZone = setcardforegroundcolor.MenuHostHelper$$ExternalSyntheticLambda0;
        Calendar calendar = Calendar.getInstance();
        Long l = setcardforegroundcolor.setY;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }
}