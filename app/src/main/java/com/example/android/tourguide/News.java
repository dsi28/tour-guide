package com.example.android.tourguide;

public class News {
    private int pic;
    private String title;
    private String newStation;
    private String linkURL;

    public News(int nPic, String nTitle, String nLinkURL, String nNewStation){
        pic = nPic;
        title = nTitle;
        linkURL= nLinkURL;
        newStation= nNewStation;
    }
    public int getPic() {
        return pic;
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
}
