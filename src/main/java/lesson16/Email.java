package lesson16;

import static lesson16.Email.checkEmail;

public class Email {
    static void checkEmail(String emailList) {
        int c = 0;
        for (int i = 0; c < emailList.length()-1; i++) {
            int a = emailList.indexOf('@', c);
            int b = emailList.indexOf('.', c);
            c = emailList.indexOf(';', c + 1);
            System.out.println(emailList.substring(a + 1, b));
        }
    }
}


class EmailTest {
    public static void main(String[] args) {
        checkEmail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

