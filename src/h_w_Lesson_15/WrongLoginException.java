package h_w_Lesson_15;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(){
    }
    public WrongLoginException(String massage){
        super(massage);
    }
}
