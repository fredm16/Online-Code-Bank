/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tasksapp.timegetter.freddy.marinov.x19365173;

/**
 *
 * @author Fred
 */
import java.net.*;
import java.io.*;

public class timeGetterClient {
 
    public static void main(String[] args) {
        String HOST = "time.nist.gov";
        int PORT = 13; //port 13 is used to read current daytime (i googled this) it is called the daytime protocol
        int numCharacters; //store the number of characters that we will later add to a StringBuilder once it becomes declared in our try statement
       
        try (Socket socket = new Socket(HOST, PORT)) {
            //declares a new socket in the try statement
            InputStream clientIn = socket.getInputStream();
            InputStreamReader clientStream = new InputStreamReader(clientIn);
            //declares a new InputStream of data coming from the client, covered this in advanced programming
            StringBuilder clientStringBuil;
            clientStringBuil = new StringBuilder();
            //declares a new StringBuilder called clientStringBuil, StringBuilder and StringBuffer are the same, however since we are not using threads i decided on using a StringBuilder as it loads faster (dont quote me on that i googled which was better)
            while ((numCharacters = clientStream.read()) != -1) { 
                clientStringBuil.append((char) numCharacters);
                //appends or adds information into the StringBuilder
            }
            System.out.println(clientStringBuil);
            //prints the StringBuilder
        }
            catch (UnknownHostException uHexcep) {
            System.out.println("Server cannot be reached at this time: " + uHexcep.getMessage());
            //catches a host exception in the case where it doesnt exist
            } 
            catch (IOException iOexcep) {
            System.out.println("I/O exception, here is the error: " + iOexcep.getMessage());
            }
            //catches improper data input exception
        }
    }
