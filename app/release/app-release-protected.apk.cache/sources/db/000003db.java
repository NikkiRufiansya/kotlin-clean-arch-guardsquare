package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import o.eA;

/* loaded from: classes.dex */
public class eA implements Parcelable {
    public static final Parcelable.Creator<eA> CREATOR = new Parcelable.Creator<eA>() { // from class: com.google.firebase.perf.util.Timer$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ eA createFromParcel(Parcel parcel) {
            return new eA(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ eA[] newArray(int i) {
            return new eA[i];
        }
    };
    public long MenuHostHelper$$ExternalSyntheticLambda0;
    public long setX;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ eA(Parcel parcel, byte b) {
        this(parcel);
    }

    public static eA setIconTintList(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new eA(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) + (micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())), micros);
    }

    public static long setIconTintList() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    private eA(long j, long j2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
        this.setX = j2;
    }

    private eA(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.MenuHostHelper$$ExternalSyntheticLambda0);
        parcel.writeLong(this.setX);
    }

    public eA() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }
}