/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

import java.util.Scanner;

/**
 *
 * @author kbc19a14
 */
public class ITECafe {

    private static Object Scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item icetea = new Item(2, "紅茶", 260);
        Item tea = new Item(3, "お茶", 200);
        Item cake = new Item(4, "ケーキ", 300);
        Item biscuit = new Item(5, "ビスケット", 500);
        Item bermkuchen = new Item(6, "バームクーヘン", 700);
        Item milktea = new Item(7,"ミルクティー",450);
        Item pancake = new Item(8,"パンケーキ",550);
        Item sandwich = new Item(9,"サンドイッチ",450);
        Item orangejuice = new Item(10,"オレンジジュース",500);
        
        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = icetea;
        items[2] = tea;
        items[3] = cake;
        items[4] = biscuit;
        items[5] = bermkuchen;
        items[6] = milktea;
        items[7] = pancake;
        items[8] = sandwich;
        items[9] = orangejuice;
        Scanner scan = new Scanner(System.in);

        //メニューを表示する
        int inputNum;
        int inputMum;
        int goukei = 0;

        while (true) {
            while (true) {
                System.out.println("■■■ITECafeシステム■■■");
                System.out.println(hotcoffee.getNo() + ":" + hotcoffee.getName());
                System.out.println(icetea.getNo() + ":" + icetea.getName());
                System.out.println(tea.getNo() + ":" + tea.getName());
                System.out.println(cake.getNo() + ":" + cake.getName());
                System.out.println(biscuit.getNo() + ":" + biscuit.getName());
                System.out.println(bermkuchen.getNo() + ":" + bermkuchen.getName());
                System.out.println(milktea.getNo() + ":" + milktea.getName());
                System.out.println(pancake.getNo() + ":" + pancake.getName());
                System.out.println(sandwich.getNo() + ":" + sandwich.getName());
                System.out.println(orangejuice.getNo() + ":" + orangejuice.getName());
                System.out.println("商品番号を入力してください");
                 
                
                
                try {

                    String inputStr;
                    inputStr = scan.next();
                    inputNum = Integer.parseInt(inputStr);
                    System.out.println(inputNum);
                    System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                            + "" + items[inputNum - 1].getPrice() + "円が入力されました");
                    break;
                    
                    

                } catch (NumberFormatException e) {
                    System.out.println("入力エラー:数値を入力してください");

                    // TODO code application logic here
                }

            }

            System.out.println("数量を入力してください");
            String inputMtr;
            inputMtr = scan.next();
            inputMum = Integer.parseInt(inputMtr);
            
            
            goukei = (int)(goukei + (items[inputNum-1].getPrice()*inputMum* 1.08));
            System.out.println( goukei );
            
            System.out.println("合計金額は" + goukei + "円です");
            
            
            
            //break;
            System.out.println("入力はおわりましたか？");
            System.out.println("注文を終える場合は1を入力してください");
            System.out.println("1以外は追加注文できます");
            inputMtr = scan.next();
            inputNum = Integer.parseInt(inputMtr);
            if( inputNum == 1 ){
                break;
            }
             
        }
        
         System.out.println("お支払い金額は何円ですか");
         while(true){
          String inputStr;
            inputStr = scan.next();
            int osiharai = Integer.parseInt(inputStr);
            if(osiharai>=goukei){
            int oturi = osiharai-goukei;
         System.out.println("お釣りは" + oturi + "円です");
        
         System.out.println("ありがとうございました");
    }else if(osiharai<=goukei){
        int tarinai = goukei - osiharai;
    }
            
        
      
        }  
    }
}
