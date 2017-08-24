package com.example.mfahad.rxjava;


import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Observeable {

    public Observable observable;
    //Constructor
    public Observeable(){

    }

    public Observable<String> getObserveable(){
        return Observable.just("Data From Observable");
    }

//    Integer observeable for the subjectObserver
    public Observable<Integer> getSubjectObserveable(){
        return Observable.just(1,2,3,4,5);
    }

}
