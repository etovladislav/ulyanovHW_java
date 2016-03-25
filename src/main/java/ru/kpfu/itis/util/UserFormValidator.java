package ru.kpfu.itis.util;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.kpfu.itis.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserFormValidator implements Validator {

    static Pattern p = Pattern.compile("\\d+");

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if (user.getName() == null || user.getName().isEmpty()) {
            errors.rejectValue("name", "", "Имя не может быть пустым");
        }
        if (user.getPassword() == null || user.getPassword().length() < 6 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "", "Пароль может быть от 6 до 32 символов");
        }

        Matcher m = p.matcher(user.getAge());

        if (!m.matches()) {
            errors.rejectValue("age", "", "Тут можно только цифру");
        }

    }
}
