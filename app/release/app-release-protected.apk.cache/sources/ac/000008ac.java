package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.re  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0425re {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    final TimeUnit setUiOptions;

    EnumC0425re(TimeUnit timeUnit) {
        this.setUiOptions = timeUnit;
    }
}