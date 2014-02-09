
package zadachaproject2;
import java.util.Scanner;

public class inGrad {
    public static void nizGradove(){
        System.out.println("Копирайте списъка с градовете от условието на задачата и го поставете в конзолата");
        Scanner scr = new Scanner(System.in);
        String copyListOfGradove = scr.nextLine(); //Подавам като аргумент списък от градове, който после с метода split(...) разделям на отделни елементи на масива
        String[] listGradove = copyListOfGradove.split("[,.]+"); //Разделям списъка на отделни елементи за попълване на масив от имена на градове    
        String sadarjaDuma = "град"; //Задавам думата, която търся за извличане

        System.out.println("Имена съдържащи " + "\""+sadarjaDuma+"\"" + ", без значение малки или големи букви:");
        for (String listGradove1 : listGradove) {
            // превъртам целия масив от имена
            if (listGradove1.toLowerCase().contains(sadarjaDuma)) {
                //Първо превръщам целия масив в малки букви и след това му задавам изключение да ми вади само стринговете от масива, които съдържата зададената по - горе ключова дума
                System.out.println(listGradove1);
            }
        }            
    }
}
