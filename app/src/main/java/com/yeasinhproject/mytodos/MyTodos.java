package com.yeasinhproject.mytodos;

public class MyTodos {

    private String tvUserId;
    private String tvTodo;
    private String btnCompleted;

    public MyTodos(String tvUserId, String tvTodo, String btnCompleted) {
        this.tvUserId = tvUserId;
        this.tvTodo = tvTodo;
        this.btnCompleted = btnCompleted;
    }

    public String getTvUserId() {
        return tvUserId;
    }

    public String getTvTodo() {
        return tvTodo;
    }

    public String getBtnCompleted() {
        return btnCompleted;
    }
}
