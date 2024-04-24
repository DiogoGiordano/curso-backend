package com.primeiroprojeto.cursobackend.model.error;

public class ErrorMessage {

    //#region Attributes
    private String title;

    private Integer state; 

    private String message;
    //#endregion

    //#region Contructor
    public ErrorMessage(String title, Integer state, String message) {
        this.title = title;
        this.state = state;
        this.message = message;
    }
    //#endregion
    
    //#region Getter and Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //#endregion


}
