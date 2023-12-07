package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class setTrimPathStart implements setOffscreenPageLimit {
    private final setCompatPressedTranslationZResource MenuHostHelper$$ExternalSyntheticLambda0;
    private final Context setIconTintList;
    private final setCloseIconSize setX;

    public setTrimPathStart(Context context, setCloseIconSize setcloseiconsize, setCompatPressedTranslationZResource setcompatpressedtranslationzresource) {
        this.setIconTintList = context;
        this.setX = setcloseiconsize;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setcompatpressedtranslationzresource;
    }

    private int setX(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.setIconTintList.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setX().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(setTickMark.setX(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.MenuHostHelper$$ExternalSyntheticLambda0())).array());
        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY() != null) {
            adler32.update(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY());
        }
        return (int) adler32.getValue();
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // o.setOffscreenPageLimit
    public final void MenuHostHelper$$ExternalSyntheticLambda0(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, int i) {
        MenuHostHelper$$ExternalSyntheticLambda1(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, i, false);
    }

    @Override // o.setOffscreenPageLimit
    public final void MenuHostHelper$$ExternalSyntheticLambda1(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.setIconTintList, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.setIconTintList.getSystemService("jobscheduler");
        int x = setX(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1);
        if (!z && MenuHostHelper$$ExternalSyntheticLambda0(jobScheduler, x, i)) {
            setTitleCollapseMode.setX("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1);
            return;
        }
        long MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1);
        JobInfo.Builder MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(new JobInfo.Builder(x, componentName), staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.MenuHostHelper$$ExternalSyntheticLambda0(), MenuHostHelper$$ExternalSyntheticLambda1, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setX());
        persistableBundle.putInt("priority", setTickMark.setX(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.MenuHostHelper$$ExternalSyntheticLambda0()));
        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY(), 0));
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setExtras(persistableBundle);
        Object[] objArr = {staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, Integer.valueOf(x), Long.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0.setY(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.MenuHostHelper$$ExternalSyntheticLambda0(), MenuHostHelper$$ExternalSyntheticLambda1, i)), Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(i)};
        String x2 = setTitleCollapseMode.setX("JobInfoScheduler");
        if (Log.isLoggable(x2, 3)) {
            Log.d(x2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(MenuHostHelper$$ExternalSyntheticLambda0.build());
    }
}