package com.calanco.watchandlearn.adapters;

import com.calanco.watchandlearn.Models.Film;
import com.calanco.watchandlearn.Models.User;
import jakarta.servlet.http.HttpSession;

import java.util.ArrayList;

public class UserAdapter implements UserInterface {
    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public int addNewUser(User user) {
        return 1;
    }

    @Override
    public int updateUser(User oldUser, User newUser) {
        return 0;
    }

    /**
     * Проверка на правильность пароля и логина, есть ли данны в БД
     */
    @Override
    public int isCorrectData(User user) {
        return 0;
    }

    public boolean isAuthorized(User user) {
        if (user == null){
            System.out.println("null");
            return false;
        }
        System.out.println(user.getName());
        return true;
    }

    public ArrayList<Film> getRecomendatedFilms(User user) {
        return FilmAdapter.getFilms();
    }

    public ArrayList<Film> getLastWatchedFilms(User user) {
        return FilmAdapter.getFilms();
    }

    /**
     * @param user с заполненными email или id
     * @return user с заполненными ВСЕМИ полями, провеку на корректность проводить не обязательно
     */
    public User fillUser(User user) {
        return user;
    }
}
