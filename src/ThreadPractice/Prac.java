package ThreadPractice;

import java.util.concurrent.Callable;

public class Prac implements Callable {

    @Override
    public String call(){
        return "ok";
    }

}
