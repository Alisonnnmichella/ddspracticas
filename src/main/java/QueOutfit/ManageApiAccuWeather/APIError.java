package QueOutfit.ManageApiAccuWeather;
 public class APIError {
     String name;
     int code;

     public APIError(String name, int code) {
         this.name = name;
         this.code = code;
     }

     public String getName() {
         return name;
     }
     public int getCode() {
         return code;
     }

 }

