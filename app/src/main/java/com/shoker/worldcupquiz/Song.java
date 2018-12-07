package com.shoker.worldcupquiz;

public class Song {
    /** Song name */
    private String mSongName;

    /** Artist name */
    private String mArtistName;

    /** Album name */
    private String mAlbumName;

    /** Image resource ID for the song */
    private int mImageResourceId ;



    /**
     * Constructor to create song object
     * @param songName
     * @param artistName
     * @param albumName
     * @param imageResourceId
     */
    public Song(String songName, String artistName,String albumName, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;

        mImageResourceId = imageResourceId;
        mAlbumName =albumName;
    }



    /**
     * Get Song Name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get Artist Name
     */
    public String getArtistName() {
        return mArtistName;
    }



    /**
     * Get Album Name
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the Image Resource Id
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
