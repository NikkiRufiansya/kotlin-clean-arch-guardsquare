package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AppBarLayout$BaseBehavior$SavedState$1 {
    public static <TResult> setAutoSizeTextTypeUniformWithConfiguration<TResult> MenuHostHelper$$ExternalSyntheticLambda0(TResult tresult) {
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        settitletextappearance.setIconTintList(tresult);
        return settitletextappearance;
    }

    public static Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        if (setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            return setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        if (setautosizetexttypeuniformwithconfiguration.setIconTintList()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(setautosizetexttypeuniformwithconfiguration.setY());
    }

    @Deprecated
    public static <TResult> setAutoSizeTextTypeUniformWithConfiguration<TResult> MenuHostHelper$$ExternalSyntheticLambda0(Executor executor, Callable<TResult> callable) {
        if (executor != null) {
            setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
            executor.execute(new setState(settitletextappearance, callable));
            return settitletextappearance;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public static setAutoSizeTextTypeUniformWithConfiguration<List<setAutoSizeTextTypeUniformWithConfiguration<?>>> MenuHostHelper$$ExternalSyntheticLambda1(setAutoSizeTextTypeUniformWithConfiguration<?>... setautosizetexttypeuniformwithconfigurationArr) {
        setTitleTextAppearance settitletextappearance;
        if (setautosizetexttypeuniformwithconfigurationArr.length == 0) {
            List emptyList = Collections.emptyList();
            setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
            settitletextappearance2.setIconTintList(emptyList);
            return settitletextappearance2;
        }
        List<setAutoSizeTextTypeUniformWithConfiguration> asList = Arrays.asList(setautosizetexttypeuniformwithconfigurationArr);
        if (asList == null || asList.isEmpty()) {
            List emptyList2 = Collections.emptyList();
            setTitleTextAppearance settitletextappearance3 = new setTitleTextAppearance();
            settitletextappearance3.setIconTintList(emptyList2);
            return settitletextappearance3;
        }
        if (asList != null && !asList.isEmpty()) {
            for (setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration : asList) {
                if (setautosizetexttypeuniformwithconfiguration == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            settitletextappearance = new setTitleTextAppearance();
            setCheckMarkTintList setcheckmarktintlist = new setCheckMarkTintList(asList.size(), settitletextappearance);
            for (setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration2 : asList) {
                setautosizetexttypeuniformwithconfiguration2.setX(setAccessibilityPaneTitle.setY, (CalendarConstraints$1) setcheckmarktintlist);
                setautosizetexttypeuniformwithconfiguration2.setX(setAccessibilityPaneTitle.setY, (setAccessibilityDataSensitive) setcheckmarktintlist);
                setautosizetexttypeuniformwithconfiguration2.setX(setAccessibilityPaneTitle.setY, (getTrimPathStart) setcheckmarktintlist);
            }
        } else {
            settitletextappearance = new setTitleTextAppearance();
            settitletextappearance.setIconTintList((Object) null);
        }
        return settitletextappearance.setY(setAccessibilityPaneTitle.setIconTintList, new setPageMargin(asList));
    }
}