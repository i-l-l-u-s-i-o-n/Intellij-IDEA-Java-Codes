package com.shivam;
/**
 * created by Shivam on 08-04-2019.
 */
import com.shivam.model.Artists;
import com.shivam.model.DataSource;
import com.shivam.model.SongArtist;


import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        DataSource dataSource=new DataSource();

        if(!dataSource.open()){
            System.out.println("Can't open data source");
            return;
        }

        // Querying all artists.

        List<Artists> artists=dataSource.queryArtists(5);
        if (artists==null){
            System.out.println("NO artists");
            return;
        }

        
        for (Artists artist:artists){
             System.out.println("ID= "+artist.getId()+"\t Name = "+artist.getName());
        }



        // Querying Albums for the given artists.

        List<String > strings=dataSource.queryAlbumsForArtist("Pink Floyd"  ,4);

        if (strings.isEmpty()){
            System.out.println(" NO ALBUMS ");
            return;
        }
        System.out.println("Album names : ");
        for (String string : strings){
            System.out.println(string);
        }



        // Querying Artist for the given Song.

        List<SongArtist> songArtists=dataSource.queryArtistForSong("She's On Fire",2);
        if (songArtists==null){
            System.out.println("No Artist");
            return;
        }
        System.out.println("Artist name :  ");
        for (SongArtist i:songArtists){
            System.out.println("Artist Name: "+i.getArtist_name()+"  , Album Name : "+i.getAlbum_name()+
                                "  , Song Track : "+i.getTrack());
        }


        // Getting the column names of SONG table.

        System.out.println("\n\nSONGS table METADATA : \n");
        dataSource.queryArtistForSongMetadata();

        // Using some aggregate or group function.

        dataSource.getCount("songs");


        // Creating artists_list VIEW

        System.out.println("\nVIEW created ---- "+dataSource.createViewSongsArtists());


        // Querying artists for song using artist_list VIEW





        //==============================================================SQL INJECTION ======================================================||
        //                                                                                                                                  ||
        // SQL Injection Is when we take input of song from user ,he may enter ---- She's On Fire" or 1=1 or"                               ||
        // The Query will become ------                                                                                                     ||
        // Select name,album,track FROM artist_list WHERE title="She's On Fire" or 1=1 or ""                                                ||
        // as 1=1 return true so all the records will be fetched .                                                                          ||
        //                                                                                                                                  ||
        // To remove this problem we use PREPARED STATEMENTS which are precompiled sql statement. They are also used to improve performance ||
        //                                                                                                                                  ||
        // Using Prepared statement , the SQL will be ----                                                                                  ||
        // Select name,album,track FROM artist_list WHERE title="She's On Fire or 1=1 or ""                                                 ||
        //                                                                                                                                  ||
        // The input will be treated as a SINGLE LITERAL not an individual SQL.                                                             ||                                                                 ||
        //==================================================================================================================================||









        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the song title you want to search : ");
        String title=sc.nextLine();
        songArtists=dataSource.queryArtistForSongsUsingVIEW(title);
        if (songArtists.isEmpty()){
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        System.out.println("Artist name :  ");
        for (SongArtist i:songArtists){
            System.out.println("Artist Name: "+i.getArtist_name()+"\t Album Name : "+i.getAlbum_name()+
                    "\t Song Track : "+i.getTrack());
        }



        dataSource.insertSongs(2,"Caught yours moment","Robert Joe","Heartless Nation");
  //      dataSource.insertSongs(1,"Leave me alone","Bob Dylan","Bob Dylan's Greatest Hits");



        dataSource.close();


    }
}
