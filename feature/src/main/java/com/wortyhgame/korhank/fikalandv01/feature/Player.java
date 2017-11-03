package com.wortyhgame.korhank.fikalandv01.feature;

import java.util.ArrayList;

/**
 * Created by korha on 11/3/2017.
 */

class Player {
    private String name;

    private int money;
    private int morale;
    private int luck;

    private boolean isMarried;
    private int numberOfChildren;
    private Job job;
    private int technicalEducation;
    private int socialEducation;
    private ArrayList<String> friends;
    private int score;
    private House house;
    private int swedishLevel;
    private int englishLevel;
    private String dating = null;
    private int workingForMonths;
    private Time time;
    private ArrayList<String> achievements;

//    public Player(int money, int morale, int luck, int englishLevel, int technicalEducation, int socialEducation) {
//        //super();
//        this.setMoney(money);
//        this.morale = morale;
//        this.luck = luck;
//        this.englishLevel = englishLevel;
//        this.isMarried = false;
//        this.score = 0;
//        this.technicalEducation = technicalEducation;
//        this.socialEducation = socialEducation;
//        friends = new ArrayList<String>();
//        time = new Time();
//        achievements = new ArrayList<String>();


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
