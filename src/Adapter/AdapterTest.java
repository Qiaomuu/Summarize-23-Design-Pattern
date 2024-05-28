package Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        TranslateAdaptor adaptor = new TranslateAdaptor();
        adaptor.translate("中文","英文","你好");
    }
}
