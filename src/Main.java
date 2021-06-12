import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    Valiate valiate=new Valiate();
    public static int inputId(){
        Valiate valiate1=new Valiate();
        Scanner scannerId=new Scanner(System.in);
        String id = "";
        boolean checkId=true;
        while (checkId) {
            System.out.println("Nhập mã số bài hát");
            try {
                id=scannerId.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            if (valiate1.validateId(id)) {
                checkId=false;
            }else {
                System.out.println("Nhập lỗi && Lưu ý mã số bài hát là số và gồm 8 số");
            }
        } return Integer.parseInt(id);
    }
    public static String inputName(){
        Valiate valiate2=new Valiate();
        Scanner scannerName=new Scanner(System.in);
        String name="";
        boolean checkName=true;
        while (checkName){
            System.out.println("Nhập tên bài hát");
            try {
                name=scannerName.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
             if(valiate2.validateName(name)){
                 checkName=false;
             }else if (valiate2.validateName2(name)){
                 checkName=false;
             }else {
                 System.out.println("Nhập tên lỗi && Lưu ý tên không dấu và không có kí tự đặc biết");
             }
        }
        return name;
    }
    public static String inputSinger(){
        Valiate valiate3=new Valiate();
        Scanner scannerName=new Scanner(System.in);
        String singer="";
        boolean checkSinger=true;
        while (checkSinger){
            try {
                System.out.println("Nhập tên ca sĩ");
                singer=scannerName.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            if(valiate3.validateName(singer)){
                checkSinger=false;
            }else if (valiate3.validateName2(singer)){
                checkSinger=false;
            }else {
                System.out.println("Nhập tên lỗi && Lưu ý tên không dấu và không có kí tự đặc biết");
            }
        }
        return singer;
    }
    public static Music input(){
        int id=inputId();
        String name=inputName();
        String singer=inputSinger();
        Music music=new Music(id,name,singer);
        return music;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageMusic manageMusic=new ManageMusic();
        while (true){
            System.out.println("------------------------------Menu------------------------------");
            System.out.println("1. Thêm bài hát");
            System.out.println("2. Sửa bài hát");
            System.out.println("3. Xóa bài hát");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm bài hát");
            System.out.println("6. Lưu vào File");
            System.out.println("7. Đọc từ File");
            System.out.println("0 Thoát");
            int number= scanner.nextInt();
            switch (number){
                case 1:
                    manageMusic.add(input());
                    break;
                case 2:
                        System.out.println("-----Menu Edit-----");
                        System.out.println("1 Tìm kiếm sửa theo mã só bài hát");
                        System.out.println("2 Tìm kiếm sửa theo tên");
                        System.out.println("0 Thoát");
                        int number1 = scanner.nextInt();
                        switch (number1) {
                            case 1:
                                int idEdit=inputId();
                                if (manageMusic.searchId(idEdit) == null) {
                                    System.out.println("Mã số bài hát không tồn tại");
                                    break;
                                } else {
                                    manageMusic.editId(idEdit, input());
                                    System.out.println("Sửa thành công");
                                }
                                break;
                            case 2:
                                String nameEdit=inputName();
                                if (manageMusic.seaarchName(nameEdit) == null) {
                                    System.out.println("Tên bài hát không tồn tại");
                                    break;
                                } else {
                                    manageMusic.editName(nameEdit, input());
                                    System.out.println("Sửa thành công");
                                    break;
                                }
                            case 0:
                                break;
                            default: {
                                System.out.println("Nhập lỗi");
                                break;
                            }

                        }
                        break;
                case 3:
                    System.out.println("-----Menu Detele");
                    System.out.println("1 Xóa theo mã số bài hát");
                    System.out.println("2 Xóa theo tên bài hát");
                    System.out.println("0 Thoát");
                    int numberDetele=scanner.nextInt();
                    switch (numberDetele){
                        case 1:
                           int idDetele=inputId();
                           if(manageMusic.searchId(idDetele)==null){
                               System.out.println("Mã số bài hát không tần tại");
                           }else {
                               manageMusic.removeId(idDetele);
                               System.out.println("Xóa thành công");
                           }
                           break;
                        case 2:
                            String nameDetele=inputName();
                            if(manageMusic.seaarchName(nameDetele)==null){
                                System.out.println("Tên bài hát không tồn tại");
                            }else {
                                manageMusic.removeName(nameDetele);
                                System.out.println("Xóa thành công");
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Nhập lỗi");
                            break;
                    }


                   break;
                case 4:
                    if( manageMusic.size()==0){
                        System.out.println("Danh sách rỗng");
                    }else {
                        manageMusic.show();
                    }

                    break;
                case 5:
                    System.out.println("-----Menu Search-----");
                    System.out.println("1 Tìm kiếm theo mã số bài hát");
                    System.out.println("2 Tìm kiếm theo tên");
                    System.out.println("3 Tìm kiếm theo tên ca sĩ");
                    int numberSearch=scanner.nextInt();
                    switch (number){
                        case 1:
                          manageMusic.searchId(inputId());
                          break;
                        case 2:
                            manageMusic.seaarchName(inputName());
                            break;
                        case 3:
                            manageMusic.searchSinger(inputSinger());
                            break;
                    }
                    break;
                case 6:
                    manageMusic.writeToFile();
                    break;
                case 7:
                    manageMusic.readToFile();
            }
        }

    }
}