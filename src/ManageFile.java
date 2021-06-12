import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageFile {

    public static void writeFile(List<Music> musicList) throws IOException {
        FileWriter fileWriter = new FileWriter("DataMusic");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "Mã số bài hát,Tên bài hát,Ca sĩ\n";
        for (int i = 0; i < musicList.size(); i++) {
            str += musicList.get(i).getId() + "," + musicList.get(i).getName() + "," + musicList.get(i).getSinger() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
    }

    public static void readFile() throws IOException {
        List<Music> list = new ArrayList<>();
        FileReader fileReader = new FileReader("DataMusic");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line=bufferedReader.readLine())!=null){
            String value[]=line.split(",");
            list.add(new Music(Integer.parseInt(value[0]),value[1],value[2]));
        }
        list.forEach(music -> System.out.println(music.toString()));
    }

}
