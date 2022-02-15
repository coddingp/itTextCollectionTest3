package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        String textInAlphabeticalOrder = "История Киргизии — события на территории современной Киргизии (Кыргызстана) с древнейших времён и до наших дней.Территория современной Киргизии играла важную роль на Великом шёлковом пути — регион занимал стратегическое положение между древними оседло-земледельческими районами Ферганской долины и Таримского бассейна, куда на протяжении всей древней и средневековой истории стремились воинственные кочевые народы ирано-, тюрко- и монголоязычного происхождения. В XIV веке собственно носители древнетюркского этнонима «кыргыз» проживали в северо-восточных пределах Моголистана. В XV-XVI вв. укрепившись на Тянь-Шане и Памиро-Алае, киргизские племена совместно с могольскими племенами образовали единый киргизский этнос. В XVI-XVII вв. киргизы в союзе с казахами выступали против Яркендского ханства, государства Шейбанидов и Ойратского ханства";
//        TreeSet set = new TreeSet();
//        ArrayList<String[]> string = new ArrayList<>();
//        for (int i = 0; i < textInAlphabeticalOrder.length(); i++) {
//            string.add(textInAlphabeticalOrder.split(textInAlphabeticalOrder));
//        }
//
//
//
////       TreeSet TreeSetAlphabeticalOrder = new TreeSet(textInAlphabeticalOrder);
//
//
////        TreeSetAlphabeticalOrder.addAll(textInAlphabeticalOrder2);
//
////        for (int i = 0; i < textInAlphabeticalOrder.size(); i++) {
////            TreeSetAlphabeticalOrder.add(textInAlphabeticalOrder.get(i));
////        }
//
//        System.out.println(string.get);
//        System.out.println(textInAlphabeticalOrder);


//        TreeSet set = new TreeSet();
//        set.addAll(Collections.singleton("История Киргизии — события на территории современной Киргизии (Кыргызстана) с древнейших времён и до наших дней.Территория современной Киргизии играла важную роль на Великом шёлковом пути — регион занимал стратегическое положение между древними оседло-земледельческими районами Ферганской долины и Таримского бассейна, куда на протяжении всей древней и средневековой истории стремились воинственные кочевые народы ирано-, тюрко- и монголоязычного происхождения. В XIV веке собственно носители древнетюркского этнонима «кыргыз» проживали в северо-восточных пределах Моголистана. В XV-XVI вв. укрепившись на Тянь-Шане и Памиро-Алае, киргизские племена совместно с могольскими племенами образовали единый киргизский этнос. В XVI-XVII вв. киргизы в союзе с казахами выступали против Яркендского ханства, государства Шейбанидов и Ойратского ханства"));
//        System.out.println(set);

        // Задача № 2 добавить в предыдущий код, перед вызовом печати - вызов нового (который печатает другие документы)
        String a = "История Киргизии ";
        String b = "киргизы в союзе с казахами выступали против Яркендского ханства, ";

//        Print print = new Print(5, a);

        Thread p1 = new Thread((Runnable) new Print(500, a));
        Thread p2 = new Thread((Runnable) new Print(500, b));
        p1.start();
        p2.start();

        // обработать очередь из 20 чел в 2 потока.

        Thread quee1 =  new Thread((Runnable) new Print(500, a));
        Thread quee2 =  new Thread((Runnable) new Print(500, a));
        quee1.start();
        quee2.start();


    }
}
//написать код, который печатет документ n копий
