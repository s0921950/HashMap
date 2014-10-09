package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> partialRegistrationId = new ArrayList<String>();
        partialRegistrationId.add("asdasas");
        partialRegistrationId.add("11111111");
        String registrationId = "";
        for (int i = 0; i < partialRegistrationId.size(); i++)
            registrationId = registrationId.concat(partialRegistrationId.get(i));
        System.out.println("Registration Id:   " + registrationId);
        int b = 0;
        System.out.println("Registration Id:   " + String.valueOf(b));
    }

}
