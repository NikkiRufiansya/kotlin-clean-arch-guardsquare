package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
final class bB$MenuHostHelper$$ExternalSyntheticLambda0 implements InterfaceC0063bx<Date> {
    private static final DateFormat setX;

    private bB$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bB$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    @Override // o.InterfaceC0058bs
    public final /* synthetic */ void setY(Object obj, InterfaceC0062bw interfaceC0062bw) {
        interfaceC0062bw.MenuHostHelper$$ExternalSyntheticLambda0(setX.format((Date) obj));
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        setX = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}