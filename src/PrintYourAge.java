import java.time.Year;
import java.util.Scanner;

public class PrintYourAge {
 public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("何歳ですか?");
String line = scanner.nextLine();


if(line.equals("q")||line .equals("e")){
scanner.close();
break;
}

try{

int age = Integer.parseInt(line);

if(age<0||age>=120) {
    System.out.println("年齢を再入力してください");
    continue;
}

System.out.println("あなたは" + age + "歳ですね。");
System.out.println("あなたは10年後に、" + (age + 10) + "歳ですね。"); 

int birthdayYear = Year.now().getValue() - age;

String eraName;
int eraYear;

if(birthdayYear >= 2019) {
    eraName = "令和";
    eraYear = birthdayYear - 2018;
} else if (birthdayYear >= 1989) {
    eraName = "平成";
    eraYear = birthdayYear - 1988;
} else if (birthdayYear >= 1926) {
    eraName = "昭和";
    eraYear = birthdayYear - 1925;
} else if (birthdayYear >= 1912) {
    eraName = "大正";
    eraYear = birthdayYear - 1911;
} else {
    eraName = "明治";
    eraYear = birthdayYear - 1867;

}

System.out.println("あなたは" + eraName + eraYear + "年生まれですね。");

}catch(NumberFormatException e){
    System.out.println("年齢を入力してください");

 }

 scanner.close();
}
 }
}
