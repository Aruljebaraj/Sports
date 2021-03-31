package com.arul.sports.Model;

import android.graphics.drawable.Drawable;

public class HorizontalViewModel {
    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public Drawable getTeam1Icon() {
        return Team1Icon;
    }

    public void setTeam1Icon(Drawable team1Icon) {
        Team1Icon = team1Icon;
    }

    public Drawable getTeam2Icon() {
        return Team2Icon;
    }

    public void setTeam2Icon(Drawable team2Icon) {
        Team2Icon = team2Icon;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    String Team1;
    String Team2;
    String Score;
    Drawable Team1Icon;
    Drawable Team2Icon;
    String ResultType;
    String Type;

}
