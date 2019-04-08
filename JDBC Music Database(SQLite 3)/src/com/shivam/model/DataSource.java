package com.shivam.model;
/**
 * created by Shivam on 08-04-2019.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "music.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Databases\\" + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN__ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_ID = "_id";
    public static final String COLUMN_SONG_TILTE = "title";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_ALBUM = "album";

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;


    private String QUERY_SELECT_ARTIST_FOR_SONG=" SELECT "+ TABLE_ARTISTS+"."+COLUMN_ARTIST_NAME+", "+TABLE_ALBUMS+"."+COLUMN_ALBUM_NAME+
                                                ", "+TABLE_SONGS+"."+COLUMN_SONG_TRACK+" FROM "+TABLE_SONGS+
                                                " INNER JOIN "+TABLE_ALBUMS+" ON "+
                                                COLUMN_SONG_ALBUM+"="+TABLE_ALBUMS+"."+COLUMN__ALBUM_ID+
                                                " INNER JOIN "+TABLE_ARTISTS +" ON "+
                                                COLUMN_ALBUM_ARTIST+"="+TABLE_ARTISTS+"."+COLUMN_ARTIST_ID+
                                                " WHERE "+TABLE_SONGS+"."+COLUMN_SONG_TILTE+"=\"";

    private String QUERY_SORT_ORDER_ARTIST_FOR_SONG=" ORDER BY "+TABLE_ARTISTS+"."+COLUMN_ARTIST_NAME+", "+TABLE_ALBUMS+"."+COLUMN_ALBUM_NAME+" COLLATE NOCASE ";

    public static final String TABLE_ARTIST_SONG_VIEW="artist_list";
    private static final String CREATE_ARTIST_FOR_SONG_VIEW="CREATE VIEW IF NOT EXISTS "+TABLE_ARTIST_SONG_VIEW+
                                                           " AS SELECT "+TABLE_ARTISTS+"."+COLUMN_ARTIST_NAME+
                                                           ", "+TABLE_ALBUMS+"."+COLUMN_ALBUM_NAME+" AS album , "+COLUMN_SONG_TILTE+", "+COLUMN_SONG_TRACK+
                                                           " FROM "+TABLE_SONGS+
                                                           " INNER JOIN "+TABLE_ALBUMS+
                                                           " ON "+TABLE_SONGS+"."+COLUMN_SONG_ALBUM+"="+TABLE_ALBUMS+"."+COLUMN__ALBUM_ID +
                                                           " INNER JOIN "+TABLE_ARTISTS +" ON "+COLUMN_ALBUM_ARTIST+
                                                           "="+TABLE_ARTISTS+"."+COLUMN_ARTIST_ID +
                                                           " ORDER BY "+
                                                           TABLE_ARTISTS+"."+COLUMN_ARTIST_NAME+", "+
                                                           TABLE_ALBUMS+"."+COLUMN_ALBUM_NAME+", "+
                                                           COLUMN_SONG_TRACK;


    private static final String QUERY_ARTIST_FOR_SONG_USING_VIEW_ARTIST_LIST="SELECT "+COLUMN_ARTIST_NAME+", "+COLUMN_SONG_ALBUM+", "+
                                                                            COLUMN_SONG_TRACK+" FROM "+TABLE_ARTIST_SONG_VIEW+
                                                                            " WHERE "+COLUMN_SONG_TILTE+"=\"";

    public static final String QUERY_VIEW_SONG_INFO_PREPARED="SELECT "+COLUMN_ARTIST_NAME+", "+COLUMN_SONG_ALBUM+", "+COLUMN_SONG_TRACK+
                                                             " FROM "+TABLE_ARTIST_SONG_VIEW+
                                                             " WHERE "+COLUMN_SONG_TILTE+"= ? ";  // ? is placeholder



    public static final String INSERT_ARTIST=" INSERT INTO "+TABLE_ARTISTS+ "("+COLUMN_ARTIST_NAME+") VALUES(?)";
    public static final String INSERT_ALBUM=" INSERT INTO "+TABLE_ALBUMS+"("+COLUMN_ALBUM_NAME+", "+COLUMN_ALBUM_ARTIST+") VALUES(?, ?)";
    public static final String INSERT_SONG=" INSERT INTO "+TABLE_SONGS+"("+COLUMN_SONG_TRACK+", "+COLUMN_SONG_TILTE+", "+COLUMN_SONG_ALBUM+") VALUES(?, ?, ?)";

    public static final String QUERY_ARTIST="SELECT "+COLUMN_ARTIST_ID+" FROM "+TABLE_ARTISTS+" WHERE "+COLUMN_ARTIST_NAME+" = ? ";
    public static final String QUERY_ALBUM="SELECT "+COLUMN__ALBUM_ID+" FROM "+TABLE_ALBUMS+" WHERE "+COLUMN_ALBUM_NAME+" = ?";


    private Connection conn;

    private PreparedStatement preparedStatement;
    private PreparedStatement insertIntoArtist;
    private PreparedStatement insertIntoAlbums;
    private PreparedStatement insertIntoSong;

    private PreparedStatement queryArtist;
    private PreparedStatement queryAlbums;




    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            preparedStatement=conn.prepareStatement(QUERY_VIEW_SONG_INFO_PREPARED);
            insertIntoArtist=conn.prepareStatement(INSERT_ARTIST,Statement.RETURN_GENERATED_KEYS);
            insertIntoAlbums=conn.prepareStatement(INSERT_ALBUM,Statement.RETURN_GENERATED_KEYS);
            insertIntoSong=conn.prepareStatement(INSERT_SONG);
            queryArtist=conn.prepareStatement(QUERY_ARTIST);
            queryAlbums=conn.prepareStatement(QUERY_ALBUM);

            return true;
        } catch (SQLException e) {
            System.out.println("SOMETHING WENT WRONG" + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if (queryArtist!=null){
                queryAlbums.close();
            }
            if (queryAlbums!=null){
                queryAlbums.close();
            }
            if (insertIntoSong!=null){
                insertIntoSong.close();
            }
            if (insertIntoAlbums!=null){
                insertIntoAlbums.close();
            }
            if (insertIntoArtist!=null){
                insertIntoArtist.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Artists> queryArtists(int sortOrder) {

        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if (sortOrder != ORDER_BY_NONE) {
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            sb.append(" COLLATE NOCASE ");
            if (sortOrder == ORDER_BY_DESC) {
                sb.append(" DESC ");
            } else {
                sb.append(" ASC ");
            }
        }

        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sb.toString())) {

            List<Artists> artists = new ArrayList<>();
            while (resultSet.next()) {
                Artists artist = new Artists();
                artist.setId(resultSet.getInt(COLUMN_ARTIST_ID));
                artist.setName(resultSet.getString(COLUMN_ARTIST_NAME));

                artists.add(artist);
            }

            return artists;
        } catch (SQLException e) {
            System.out.println("Something went Wrong" + e.getMessage());
            e.printStackTrace();
            return null;
        }

    }


    public List<String > queryAlbumsForArtist(String artist_name,int sortOrder) {

        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(TABLE_ALBUMS);
        sb.append(".");
        sb.append(COLUMN_ALBUM_NAME);
        sb.append(" FROM ");
        sb.append(TABLE_ALBUMS);
        sb.append(" INNER JOIN ");
        sb.append(TABLE_ARTISTS);
        sb.append(" ON ");
        sb.append(TABLE_ALBUMS);
        sb.append(".");
        sb.append(COLUMN_ALBUM_ARTIST);
        sb.append("=");
        sb.append(TABLE_ARTISTS);
        sb.append(".");
        sb.append(COLUMN_ARTIST_ID);
        sb.append(" WHERE ");
        sb.append(TABLE_ARTISTS);
        sb.append(".");
        sb.append(COLUMN_ARTIST_NAME);
        sb.append("=\"");
        sb.append(artist_name);
        sb.append("\"");
        if (sortOrder != ORDER_BY_NONE) {
            sb.append(" ORDER BY ");
            sb.append(TABLE_ALBUMS);
            sb.append(".");
            sb.append(COLUMN_ALBUM_NAME);
            sb.append(" COLLATE NOCASE ");
            if (sortOrder == ORDER_BY_DESC) {
                sb.append(" DESC ");
            } else {
                sb.append(" ASC ");
            }
        }

        System.out.println("\nSQL Query : " + sb.toString() + "\n");

        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sb.toString())) {

            List<String> strings = new ArrayList<>();
            while (resultSet.next()) {
                strings.add(resultSet.getString(COLUMN_ALBUM_NAME));
            }
            return strings;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<SongArtist> queryArtistForSong(String songTilte,int sortOrder){

        StringBuilder sb=new StringBuilder(QUERY_SELECT_ARTIST_FOR_SONG);
        sb.append(songTilte);
        sb.append("\" ");
        if (sortOrder!=ORDER_BY_NONE){
            sb.append(QUERY_SORT_ORDER_ARTIST_FOR_SONG);
            if (sortOrder==ORDER_BY_DESC){
                sb.append(" DESC ");
            }else{
                sb.append(" ASC ");
            }
        }

        System.out.println("\nSQL for Artist For Song - ' "+songTilte+" ' is    :    "+sb.toString());


        try(Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery(sb.toString())) {


            List<SongArtist> songArtists=new ArrayList<>();


            while (resultSet.next()) {
                SongArtist songArtist = new SongArtist();
                songArtist.setArtist_name(resultSet.getString(1));
                songArtist.setAlbum_name(resultSet.getString(2));
                songArtist.setTrack(resultSet.getInt(3));
                songArtists.add(songArtist);
            }
            return songArtists;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public void queryArtistForSongMetadata(){

        String sql="SELECT * FROM "+TABLE_SONGS;

        try (Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery(sql)){

            ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
            int clounmCount=resultSetMetaData.getColumnCount();
            for (int i=1;i<=clounmCount;i++){
                System.out.printf("Column %d in SONGS table is : %s \n",i,resultSetMetaData.getColumnName(i));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void getCount(String TABLE){
        String sql="SELECT COUNT( * ) AS count ,MIN(_id) AS min FROM "+TABLE;

        try(Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery(sql)) {

            int count=resultSet.getInt("count");
            int min=resultSet.getInt("min");

            System.out.format("\nTotal Songs in SONGS table are : %d \nMin Song ID is : %d",count,min);


        }catch (SQLException e){
            e.printStackTrace();

        }
    }

    public boolean createViewSongsArtists(){
        try(Statement statement=conn.createStatement()){
           statement.execute(CREATE_ARTIST_FOR_SONG_VIEW) ;
           return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public List<SongArtist> queryArtistForSongsUsingVIEW(String songTilte){


        try{

            preparedStatement.setString(1,songTilte);
            ResultSet resultSet=preparedStatement.executeQuery();

            List<SongArtist> songArtists=new ArrayList<>();
            while (resultSet.next()){
                SongArtist songArtist=new SongArtist();
                songArtist.setArtist_name(resultSet.getString(1));
                songArtist.setAlbum_name(resultSet.getString(2));
                songArtist.setTrack(resultSet.getInt(3));
                songArtists.add(songArtist);
            }
            resultSet.close();
            return songArtists;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;

        }
    }

    private int insertArtist(String name) throws SQLException{
        queryArtist.setString(1,name);
        ResultSet resultSet=queryArtist.executeQuery();
        if (resultSet.next()){
            return resultSet.getInt(1);
        }else {
            // Insert artist as it doesn't exists in the database :
            insertIntoArtist.setString(1,name);
            int affectedRows=insertIntoArtist.executeUpdate();
            if (affectedRows!=1){
                throw new SQLException("Couldn't insert artist");
            }
            ResultSet generated_ID=insertIntoArtist.getGeneratedKeys();
            if (generated_ID.next()){
                return generated_ID.getInt(1);
            }else {
                throw new SQLException("Couldn't get _ID for artist.");
            }

        }
    }


    private int insertAlbum(String name,int artist_ID) throws SQLException{
        queryAlbums.setString(1,name);
        ResultSet resultSet=queryAlbums.executeQuery();
        if (resultSet.next()){
            return resultSet.getInt(1);
        }else {
            // Insert album as it doesn't exists in the database :
            insertIntoAlbums.setString(1,name);
            insertIntoAlbums.setInt(2,artist_ID);
            int affectedRows=insertIntoAlbums.executeUpdate();
            if (affectedRows!=1){
                throw new SQLException("Couldn't insert album");
            }
            ResultSet generated_ID=insertIntoAlbums.getGeneratedKeys();
            if (generated_ID.next()){
                return generated_ID.getInt(1);
            }else {
                throw new SQLException("Couldn't get _ID for albums.");
            }

        }
    }

    public void insertSongs(int track,String tilte,String artist,String album) {

        try{
            conn.setAutoCommit(false);


            int artist_ID=insertArtist(artist);
            int album_ID=insertAlbum(album,artist_ID);

            insertIntoSong.setInt(1,track);
            insertIntoSong.setString(2,tilte);
            insertIntoSong.setInt(3,album_ID);

            int rowsAffected=insertIntoSong.executeUpdate();
            if (rowsAffected==1){
                conn.commit();
            }


        }catch (Exception e){
            System.out.println("Oh ! Can't insert song.... "+e.getMessage());
            e.printStackTrace();
            try{
                System.out.println("Performing Rollback ");
                conn.rollback();
            }catch (SQLException e1){
                System.out.println("Oh boy !!!! Things are really bad ..... "+e.getMessage());
            }
        }finally {
            try{
                System.out.println("Resetting default commit behaviour.......");
                conn.setAutoCommit(true);
            }catch (SQLException e2){
                System.out.println("Could't reset auto-commit behaviour...."+ e2.getMessage());
            }
        }


    }











}
