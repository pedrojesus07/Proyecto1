package com.example.proyecto.model.data;

public class Empleado {
    private long id;
    private String login;
    private String clave;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
