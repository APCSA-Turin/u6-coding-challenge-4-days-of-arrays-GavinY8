package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int runTime;
        private int restDuration;
        private int restTime;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distanceTraveled = 0;
            runTime = 0;
            restTime = 0;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (runTime < runDuration) {
                runTime++;
                distanceTraveled += speed;
            }
            else {
                restTime++;
                if (restTime == restDuration) {
                    restTime = 0;
                    runTime = 0;
                }
            }
        }

        public String getName() {
            return name;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        Reindeer placeholder = new Reindeer("", 0, 0, 0);
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 0; j < time; j++) {
                reindeers[i].simulateSecond();
                if (reindeers[i].getDistanceTraveled() > placeholder.getDistanceTraveled()) {
                    placeholder = reindeers[i];
                }
            }
        }
        return placeholder.getName();
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



