package com.bridgelabz;

public class SnakeLadder {

            public static void main(String[] args) {
                double attendance = Math.floor(Math.random() * 2);
                int WagePerHour = 20;
                int fullDayHour = 8;
                if (attendance == 1) {
                    System.out.println("Employee is Present");
                    int DailyWage = WagePerHour * fullDayHour;
                    System.out.println(DailyWage);
                } else System.out.println("Employee is Absent");
            }
        }