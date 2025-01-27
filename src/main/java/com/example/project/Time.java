package com.example.project;

public class Time {
    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
            catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}