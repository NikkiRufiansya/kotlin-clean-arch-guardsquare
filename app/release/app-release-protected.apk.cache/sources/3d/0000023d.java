package o;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SavedStateHandleAttacher {
    public final SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    public SavedStateHandleAttacher() {
        this((byte) 0);
    }

    private SavedStateHandleAttacher(byte b) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.setX = new setIconTintList(1);
        } else {
            this.setX = new SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0 {
        private static Handler MenuHostHelper$$ExternalSyntheticLambda1;
        private static HandlerThread setX;
        int setIconTintList;
        SparseIntArray[] MenuHostHelper$$ExternalSyntheticLambda0 = new SparseIntArray[9];
        private final ArrayList<WeakReference<Activity>> setLayoutAnimation = new ArrayList<>();
        Window.OnFrameMetricsAvailableListener setY = new Window.OnFrameMetricsAvailableListener() { // from class: o.SavedStateHandleAttacher.setIconTintList.5
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                if ((setIconTintList.this.setIconTintList & 1) != 0) {
                    setIconTintList seticontintlist = setIconTintList.this;
                    seticontintlist.setY(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0[0], frameMetrics.getMetric(8));
                }
                if ((setIconTintList.this.setIconTintList & 2) != 0) {
                    setIconTintList seticontintlist2 = setIconTintList.this;
                    seticontintlist2.setY(seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0[1], frameMetrics.getMetric(1));
                }
                if ((setIconTintList.this.setIconTintList & 4) != 0) {
                    setIconTintList seticontintlist3 = setIconTintList.this;
                    seticontintlist3.setY(seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda0[2], frameMetrics.getMetric(3));
                }
                if ((setIconTintList.this.setIconTintList & 8) != 0) {
                    setIconTintList seticontintlist4 = setIconTintList.this;
                    seticontintlist4.setY(seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda0[3], frameMetrics.getMetric(4));
                }
                if ((setIconTintList.this.setIconTintList & 16) != 0) {
                    setIconTintList seticontintlist5 = setIconTintList.this;
                    seticontintlist5.setY(seticontintlist5.MenuHostHelper$$ExternalSyntheticLambda0[4], frameMetrics.getMetric(5));
                }
                if ((setIconTintList.this.setIconTintList & 64) != 0) {
                    setIconTintList seticontintlist6 = setIconTintList.this;
                    seticontintlist6.setY(seticontintlist6.MenuHostHelper$$ExternalSyntheticLambda0[6], frameMetrics.getMetric(7));
                }
                if ((setIconTintList.this.setIconTintList & 32) != 0) {
                    setIconTintList seticontintlist7 = setIconTintList.this;
                    seticontintlist7.setY(seticontintlist7.MenuHostHelper$$ExternalSyntheticLambda0[5], frameMetrics.getMetric(6));
                }
                if ((setIconTintList.this.setIconTintList & 128) != 0) {
                    setIconTintList seticontintlist8 = setIconTintList.this;
                    seticontintlist8.setY(seticontintlist8.MenuHostHelper$$ExternalSyntheticLambda0[7], frameMetrics.getMetric(0));
                }
                if ((setIconTintList.this.setIconTintList & 256) != 0) {
                    setIconTintList seticontintlist9 = setIconTintList.this;
                    seticontintlist9.setY(seticontintlist9.MenuHostHelper$$ExternalSyntheticLambda0[8], frameMetrics.getMetric(2));
                }
            }
        };

        setIconTintList(int i) {
            this.setIconTintList = i;
        }

        void setY(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // o.SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0
        public void MenuHostHelper$$ExternalSyntheticLambda0(Activity activity) {
            if (setX == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                setX = handlerThread;
                handlerThread.start();
                MenuHostHelper$$ExternalSyntheticLambda1 = new Handler(setX.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (sparseIntArrayArr[i] == null && (this.setIconTintList & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.setY, MenuHostHelper$$ExternalSyntheticLambda1);
            this.setLayoutAnimation.add(new WeakReference<>(activity));
        }

        @Override // o.SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0
        public SparseIntArray[] setIconTintList(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.setLayoutAnimation.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.setLayoutAnimation.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.setY);
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // o.SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0
        public SparseIntArray[] MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // o.SavedStateHandleAttacher$MenuHostHelper$$ExternalSyntheticLambda0
        public SparseIntArray[] setY() {
            SparseIntArray[] sparseIntArrayArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }
}