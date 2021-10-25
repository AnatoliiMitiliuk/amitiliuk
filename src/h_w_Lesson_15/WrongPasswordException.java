package h_w_Lesson_15;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(){
    }
    public WrongPasswordException (String message){
        super(message);
    }


}
