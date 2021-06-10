import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerMusic {
       private List<Music> musicList;

    public ManagerMusic() {
        this.musicList = new ArrayList<>();
    }

    public void add(Music music) {
        this.musicList.add(music);
    }

    public void show() {
        this.musicList.forEach(music -> System.out.println(music.toString()));
    }

    public Music searchId(int id) {
        return this.musicList.stream().filter(music -> music.getId() == id).findFirst().orElse(null);
    }

    public Music seaarchName(String name) {
        return this.musicList.stream().filter(music -> music.getName().equals(name)).findFirst().orElse(null);
    }

    public void searchSinger(String singer) {
        for (int i = 0; i < musicList.size(); i++) {
            if (this.musicList.get(i).getSinger() == singer) {
                System.out.println(musicList.get(i));
            }

        }
    }

    public void removeId(int id) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.remove(i);
            }
        }
    }

    public void removeName(String name) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getName() == name) {
                musicList.remove(i);
            }
        }
    }

    public void editId(int id, Music music) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.set(i, music);
            }
        }
    }

    public void editName(String name, Music music) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getName() == name) {
                musicList.set(i, music);
            }
        }
    }



//    public static void add(Music music) throws IOException {
//        FileWriter fileWriter = new FileWriter("Data");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        String str1 = "Mã bài hát,Tên bài hát,Ca sĩ\n";
//        bufferedWriter.write(str1);
//        String str = music.getId() + "," + music.getName() + "," + music.getSinger() + "\n";
//        bufferedWriter.write(str);
//    }
//
//    public static void show() throws IOException {
//        FileReader fileReader = new FileReader("Data");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//    }
//
//    public static void rearchName(String name) throws IOException {
//        FileReader fileReader = new FileReader("Data");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            if (line.contains(name)) {
//                System.out.println(line);
//            }
//        }
//    }
//
//    public static void rearchID(int id) throws IOException {
//        FileReader fileReader = new FileReader("Data");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            if (line.contains(String.valueOf(id))) {
//                System.out.println(line);
//            }
//        }
//    }
//
//    public static void rearchSinger(String singer) throws IOException {
//        FileReader fileReader = new FileReader("Data");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            if (line.contains(singer)) {
//                System.out.println(line);
//            }
//        }
//    }
//
//    public void deteleName(String name) throws IOException {
//        List<Music> musicList=new ArrayList<>();
//        FileReader fileReader = new FileReader("Data");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line="";
//        String lineDetele="";
//        while ((line=bufferedReader.readLine())!=null){
//            if(line.contains(name)){
//                lineDetele=line;
//                while (())
//            }
//        }
//    }
}