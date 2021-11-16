package com.ruben.server.ennumeration;

public enum Status  {
    SERVER_UP("SERVER_up"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;


    Status(String status) {
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
