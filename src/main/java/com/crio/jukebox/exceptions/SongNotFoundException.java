package com.crio.jukebox.exceptions;

public class SongNotFoundException extends RuntimeException{
    
    public SongNotFoundException(){
        super();
    }

    public SongNotFoundException(String mssg){
        super(mssg);
    }

}

//Given song id is not a part of the active playlist