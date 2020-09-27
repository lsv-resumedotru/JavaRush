package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 16;
    }
    String getDescription(){
        String description = super.getDescription() + " Моя страна - " + Country.UKRAINE +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return description;
    }
}
