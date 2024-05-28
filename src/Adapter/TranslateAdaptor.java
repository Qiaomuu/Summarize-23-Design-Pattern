package Adapter;

/**
 * 两种实现方式：
 * 一、适配器继承原接口，实现目标接口；
 * 二：适配器实现目标接口，注入原接口；
 */
public class TranslateAdaptor extends Translator implements Target{
    @Override
    public void translate(String source, String target, String words) {
        if(source.equals("中文") && target.equals("英文")) this.translateToEn(words);
        else this.translateToCh(words);
    }
}
