package h_w_Lesson_15;

import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
    private static Map<String, String> loginData = new HashMap<>();
    static {
        loginData.put("Diablo99", "rit85kjkj_");
        loginData.put("Drakula", "df4ug90f");
        loginData.put("misterX", "_password_");
        loginData.put("member_1", "hgru89435");
        loginData.put("WhiteOcean", "vkjfduus67");
    }

    static boolean isUserAuthentic(String login, String password) {
        try {
            isLoginValid(login);
            isPasswordValid(password);

        } catch (WrongLoginException | WrongPasswordException exception){
            return false;
        }
        return true;

    }

    private static void isLoginValid(String login) throws WrongLoginException {
        if(!(login.matches("^[a-zA-Z0-9|_]+$") && login.length()<20 && loginData.containsKey(login))){
            throw new WrongLoginException("Login is incorrect");
        }
    }

    private static void isPasswordValid(String password) throws WrongPasswordException{
        if(!(password.matches("^[a-zA-Z0-9|_]+$") && password.length()<20)){
            throw new WrongPasswordException("Password is incorrect");
        }
    }

}
