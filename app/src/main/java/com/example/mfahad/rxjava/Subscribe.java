package com.example.mfahad.rxjava;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Subscribe {
    //Constructor
    public Subscribe(){

    }

    public void GetSubscribe() {
        Observeable observeable = new Observeable();
            observeable.getObserveable()
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.)
                    .subscribe(new Observerr().getObserver());
        }

    public void getSubjectSubscribe(){
            Observeable observeable = new Observeable();
            observeable.getSubjectObserveable()
                    .subscribe(new Subjectt().getIntegerSubject());
        }
}
