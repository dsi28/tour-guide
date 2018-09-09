package com.example.android.tourguide;

public class News {
    private String title;
    private String newStation;
    private String linkURL;
    private String date;

    public News(String nTitle, String nLinkURL, String nNewStation, String nDate){
        title = nTitle;
        linkURL= nLinkURL;
        newStation= nNewStation;
        date=nDate;
    }
    public News(String nTitle, String nNewStation, String nDate){
        title = nTitle;
        linkURL= "";
        newStation= nNewStation;
        date=nDate;
    }
    public String getTitle() {
        return title;
    }
    public String getNewStation() {
        return newStation;
    }
    public String getLinkURL() {
        return linkURL;
    }
    public String getDate() {
        return date;
    }

    public String getDisplayDate(){
        return date.substring(0, date.indexOf("/", date.indexOf("/")+1));
    }
}
