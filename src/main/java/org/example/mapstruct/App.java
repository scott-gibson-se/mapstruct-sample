package org.example.mapstruct;

import org.example.mapstruct.back.User;
import org.example.mapstruct.front.UserCommand;

public class App {
    public static void main(String[] args) {
        UserMapper mapper = UserMapper.INSTANCE;

        System.out.println(mapper.getClass().toString());

        User user = User.builder().firstName("foo").lastName("Bar").email("foo@gmail.com").build();

        UserCommand uc = mapper.userToUserCommand(user);

        System.out.println("USER  --- \n" + user.toString());
        System.out.println("USERCOMMAND  --- \n" + uc.toString());
    }
}
