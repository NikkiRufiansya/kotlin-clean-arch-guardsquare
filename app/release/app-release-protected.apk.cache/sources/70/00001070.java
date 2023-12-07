package o;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* loaded from: classes.dex */
public class setThreshold extends AppComponentFactory {

    /* loaded from: classes.dex */
    public interface setY {
        Object MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        Activity instantiateActivity = super.instantiateActivity(classLoader, str, intent);
        if ((instantiateActivity instanceof setY) && (MenuHostHelper$$ExternalSyntheticLambda1 = ((setY) instantiateActivity).MenuHostHelper$$ExternalSyntheticLambda1()) != null) {
            instantiateActivity = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return instantiateActivity;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        Application instantiateApplication = super.instantiateApplication(classLoader, str);
        if ((instantiateApplication instanceof setY) && (MenuHostHelper$$ExternalSyntheticLambda1 = ((setY) instantiateApplication).MenuHostHelper$$ExternalSyntheticLambda1()) != null) {
            instantiateApplication = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return instantiateApplication;
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        BroadcastReceiver instantiateReceiver = super.instantiateReceiver(classLoader, str, intent);
        if ((instantiateReceiver instanceof setY) && (MenuHostHelper$$ExternalSyntheticLambda1 = ((setY) instantiateReceiver).MenuHostHelper$$ExternalSyntheticLambda1()) != null) {
            instantiateReceiver = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return instantiateReceiver;
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        ContentProvider instantiateProvider = super.instantiateProvider(classLoader, str);
        if ((instantiateProvider instanceof setY) && (MenuHostHelper$$ExternalSyntheticLambda1 = ((setY) instantiateProvider).MenuHostHelper$$ExternalSyntheticLambda1()) != null) {
            instantiateProvider = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return instantiateProvider;
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        Service instantiateService = super.instantiateService(classLoader, str, intent);
        if ((instantiateService instanceof setY) && (MenuHostHelper$$ExternalSyntheticLambda1 = ((setY) instantiateService).MenuHostHelper$$ExternalSyntheticLambda1()) != null) {
            instantiateService = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return instantiateService;
    }
}