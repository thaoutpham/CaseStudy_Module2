import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageFile manageFile = new ManageFile();
        ManagerMusic managerMusic = new ManagerMusic();
        while (true){
            System.out.println("------------------------------Menu------------------------------");
            System.out.println("1 Hiển thị danh sách album");
            System.out.println("2 Thêm album");
            System.out.println("3 Tìm kiếm album");
            System.out.println("4 Sửa album");
            System.out.println("5 Xóa album");
            System.out.println("0 Thoát");
            int number= scanner.nextInt();
            switch (number){
                case 1:
                    manageFile.showFile();
                    System.out.println("----------Menu 1----------");
                    System.out.println("1.1 Hiển thị danh sách bài hát trong album");
                    System.out.println("1.2 Tìm bài hát trong album");
                    System.out.println("1.3 Thêm bài hát vào album");
                    System.out.println("1.4 Xóa bài hát album");
                    System.out.println("1.5 Sửa bài hát album");
                    System.out.println("0 Thoát");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Nhập tên file mới");
                    String nameNew=scanner.nextLine();
                    Album albumAdd=new Album(nameNew);
                    manageFile.addFile(albumAdd,nameNew);
                    break;
                case 3:
                    System.out.println("Nhập tên album");
                    String nameFile=scanner.nextLine();
                    manageFile.search(nameFile);
                    break;
                case 4:
                    System.out.println("Nhập tên album muốn thay đổi");
                    System.out.println("Nhập tên album:");
                    String nameFileEdit=scanner.nextLine();
                    System.out.println("Nhập tên mới:");
                    String nameNewEdit=scanner.nextLine();
                    Album albumEdit=new Album(nameNewEdit);
                    if(manageFile.edit(nameFileEdit,albumEdit)){
                        System.out.println("Thay đổi thành công");
                    }else {
                        System.out.println("Nhập tên không tồn tại");
                    }

                    break;
                case 5:
                    System.out.println("Nhập tên muốn xóa");
                    String nameFileRemove=scanner.nextLine();
                    manageFile.remove(nameFileRemove);
                    break;
            }
        }

    }
}