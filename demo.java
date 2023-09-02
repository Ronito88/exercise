import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int percentFat=Integer.parseInt(scanner.nextLine());
        int percentProtein=Integer.parseInt(scanner.nextLine());
        int percentCarbs=Integer.parseInt(scanner.nextLine());
        int calories=Integer.parseInt(scanner.nextLine());
        int percentWater=Integer.parseInt(scanner.nextLine());
        double grFat=0.01*percentFat*calories/9;
        double grProtein=0.01*percentProtein*calories/4;
        double grCarb=0.01*percentCarbs*calories/4;
        double totalWeight=grFat+grProtein+grCarb;
        double calInGr=calories/totalWeight;
        double pureCalGr=calInGr-(0.01*percentWater*calInGr);
        System.out.printf("%.4f",pureCalGr);
    }
}
