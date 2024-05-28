package Adapter;

public class Translator {
    public void translateToEn(String words){
        if(words.equals("你好")) System.out.println("Hello");
    }
    public void translateToCh(String words){
        if(words.equals("Hello")) System.out.println("你好");
    }
}
